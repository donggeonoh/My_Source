#include <stdio.h>
#include <string.h>

#define MAX_ENTRY 25
#define MAX_CHARS 20

char address[MAX_ENTRY][2][MAX_CHARS] = {

	"장비", "016-111-1111",
	"유비", "011-111-1111",
	"관우", "017-111-1111",
	"조자룡", "011-777-7777",
	"제갈량", "019-111-1111",
};

char cmd[20];
int current_index = 5;
int i;

int addr_add();
int addr_help();
int addr_sort();
int addr_sort_2();
int addr_list();
int addr_search();
int search_num();
int delete_name();


int sort_name();
int sort_num();

int main()
{
	printf("주소록 프로그램\n");
	printf("\n1. help \n2. sort name\n3. sort num\n4. list \n5. add \n6. search name \n7. search number \n8. delete name \n9. quit \n");

	while (1)
	{

		printf("\n원하시는 번호 혹은 해당되는 문자를 입력하세요. (도움말은 1 또는 help) : ");
		gets(cmd);

		if (!strcmp(cmd, "9") || !strcmp(cmd, "quit"))
		{
			printf("\n\n\n   실행을 종료합니다 안녕히 가십시오. \n\n\n\n");
			break;
		}

		else if (!strcmp(cmd, "1") || !strcmp(cmd, "help"))
			addr_help();

		else if (!strcmp(cmd, "2") || !strcmp(cmd, "sort name"))
			addr_sort();

		else if (!strcmp(cmd, "3") || !strcmp(cmd, "sort num"))
			addr_sort_2();

		else if (!strcmp(cmd, "4") || !strcmp(cmd, "list"))
			addr_list();

		else if (!strcmp(cmd, "5") || !strcmp(cmd, "add"))
			addr_add();

		else if (!strcmp(cmd, "6") || !strcmp(cmd, "search name"))
			addr_search();

		else if (!strcmp(cmd, "7") || !strcmp(cmd, "search number"))
			search_num();

		else if (!strcmp(cmd, "8") || !strcmp(cmd, "delete name"))
			delete_name();

		else
			printf("\n잘못된 명령어 입니다\n");
	}

	return 0;
}

int addr_help()
{
	printf("\n1. help : 도움말을 불러옵니다.\n");
	printf("n2. sort : 전화번호부를 순서대로 정렬합니다.\n");
	printf("3. list : 전화번호부의 리스트를 보여줍니다.\n");
	printf("4. add : 전화번호부에 이름과 전화번호를 추가시킵니다.\n");
	printf("5. search : 이름을 입력하면 해당하는 전화번호를 보여줍니다.\n");
	printf("6. quit : 실행을 종료합니다...\n");
	printf("7. number : 전화번호를 입력하면 해당하는 이름을 보여줍니다.");

	return 0;
}

int addr_sort()
{
	int n = current_index;

	for (n = n - 1; n >= 0; n--)
	{
		for (i = 0; i < n; i++)
		{
			if (strcmp(address[i][0], address[i + 1][0]) > 0)
				sort_name(address[i][0], address[i + 1][0], address[i][1], address[i + 1][1]);
		}
	}
	addr_list();

	printf("정렬되었습니다. \n");

	return 0;
}

int addr_sort_2()
{
	int n = current_index;

	for (n = n - 1; n >= 0; n--)
	{
		for (i = 0; i < n; i++)
		{
			if (strcmp(address[i][1], address[i + 1][1]) > 0)
				sort_num(address[i][0], address[i + 1][0], address[i][1], address[i + 1][1]);
		}
	}

	addr_list();

	printf("정렬되었습니다. \n");

	return 0;
}

int addr_list()
{
	printf("\n");
	for (i = 0; i < current_index; i++)
		printf("%s %s \n", address[i][0], address[i][1]);

	return 0;
}

int addr_add()
{
	printf("추가할 이름을 입력하세요 : ");
	gets(address[current_index][0]);
	printf("추가할 전화번호를 입력하세요 : ");
	gets(address[current_index][1]);

	printf("\n   전화번호가 등록되었습니다.\n");

	current_index++;

	return 0;
}

int addr_search()
{
	printf("당신이 찾는 전화번호에 해당하는 이름을 입력하세요 : ");
	gets(cmd);

	for (i = 0; i < current_index; i++)
	{
		if (!strcmp(cmd, address[i][0]))
		{
			printf("\n\n   %s의 전화번호는 %s 입니다.\n\n\n", address[i][0], address[i][1]);
			break;
		}
	}

	if (i == current_index)
		printf("\n목록에 없습니다.\n");

	return 0;
}

int search_num()
{
	printf("당신이 찾는 이름에 해당하는 전화번호를 입력하세요 (-을 붙이세요) : ");
	gets(cmd);

	for (i = 0; i < current_index; i++)
	{
		if (!strcmp(cmd, address[i][1]))
		{
			printf("\n\n   전화번호 %s 의 이름은 %s 입니다.\n\n\n", address[i][1], address[i][0]);
			break;
		}
	}

	if (i == current_index)
		printf("\n목록에 없습니다.\n");
	return 0;
}

int delete_name()
{
	printf("지울 사람의 이름을 입력하세요. : ");
	gets(cmd);

	int j;

	for (i = 0; i < current_index; i++)
	{
		if (!strcmp(cmd, address[i][0]))
		{
			for (j = i; j < current_index; j++)
			{
				strcpy(address[j][0], address[j + 1][0]);
				strcpy(address[j][1], address[j + 1][1]);
			}
			printf("%s의 전화번호를 지웠습니다. \n", address[i][0]);
			current_index--;
			break;
		}
	}

	if (i == current_index)
		printf("\n목록에 없습니다.\n");

	return 0;
}


int sort_num(char *a1_1, char *a1_2, char *a2_1, char *a2_2)
{
	char temp[MAX_CHARS];
	char temp_2[MAX_CHARS];

	strcpy(temp, a1_1);
	strcpy(a1_1, a1_2);
	strcpy(a1_2, temp);

	strcpy(temp_2, a2_1);
	strcpy(a2_1, a2_2);
	strcpy(a2_2, temp_2);

	return 0;
}

int sort_name(char *a1_1, char *a1_2, char *a2_1, char *a2_2)
{
	char temp[MAX_CHARS];
	char temp_2[MAX_CHARS];

	strcpy(temp, a1_1);
	strcpy(a1_1, a1_2);
	strcpy(a1_2, temp);

	strcpy(temp_2, a2_1);
	strcpy(a2_1, a2_2);
	strcpy(a2_2, temp_2);

	return 0;
}