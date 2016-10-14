#include <stdio.h>
#include <string.h>

#define MAX_ENTRY 25
#define MAX_CHARS 20

char address[MAX_ENTRY][2][MAX_CHARS] = {
	"유비", "011-111-1111",
	"관우", "017-111-1111",
	"장비", "016-111-1111",
	"조자룡", "011-777-7777",
	"제갈량", "019-111-1111",
};

char cmd[20];

int current_index = 5;
int i;

int addr_add();
int addr_help();
int addr_sort();
int addr_list();
int addr_search();
int sort_name();

int main()
{

	printf("주소록 프로그램\n");
	printf("\n1. help \n2. sort \n3. list \n4. add \n5. search \n6. quit\n");

	while (1)
	{

		printf("\n원하시는 번호 혹은 해당되는 문자를 입력하세요. : ");
		gets(cmd);

		if (!strcmp(cmd, "6") || !strcmp(cmd, "quit"))
		{
			printf("\n\n\n	실행을 종료합니다 안녕히 가십시오. \n\n\n\n");
			break;
		}

		else if (!strcmp(cmd, "1") || !strcmp(cmd, "help"))
			addr_help();

		else if (!strcmp(cmd, "2") || !strcmp(cmd, "sort"))
			addr_sort();

		else if (!strcmp(cmd, "3") || !strcmp(cmd, "list"))
			addr_list();

		else if (!strcmp(cmd, "4") || !strcmp(cmd, "add"))
			addr_add();

		else if (!strcmp(cmd, "5") || !strcmp(cmd, "search"))
			addr_search();

		else
			printf("잘못된 명령어 입니다\n");
	}

	return 0;
}

int addr_help()
{
		printf("\nsort : 전화번호부를 순서대로 정렬합니다.\n");
		printf("list : 전화번호부의 리스트를 보여줍니다.\n");
		printf("add : 전화번호부에 이름과 전화번호를 추가시킵니다.\n");
		printf("search : 전화번호부 안에 있는 이름을 검색하여 전화번호를 보여줍니다.\n");
		printf("quit : 실행을 종료합니다...\n");

		return 0;
}

int addr_sort()
{
	int n = current_index;

	for (n = n - 1; n >= 0; n--)
		for (i = 0; i < n; i++)
		{
			if (strcmp(address[i][0], address[i + 1][0]) > 0)
				sort_name(address[i][0], address[i + 1][0], address[i][1], address[i + 1][1]);
		}

		addr_list();

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
	scanf("%s", address[current_index][0]);
	printf("추가할 전화번호를 입력하세요 : ");
	scanf("%s", address[current_index][1]);

	printf("\n	전화번호가 등록되었습니다.\n");

	current_index++;

	return 0;
}

int addr_search()
{
	printf("당신이 찾는 전화번호에 해당하는 이름을 입력하세요 : ");
	gets(cmd);

	for (i = 0; i < current_index; i++)
	{
		if (strcmp(cmd, address[i][0]) == 0)
			printf("\n\n	%s의 전화번호는 %s 입니다.\n\n\n", address[i][0], address[i][1]);
	}

	for (i = 0; i < current_index; i++)
	{
		if (!strcmp(cmd, address[i][0]) == 0)
		{
			printf("\n목록에 없습니다.\n");
			break;
		}
	}

	return 0;
}

int sort_name(char *a1_1[], char *a1_2[], char *a2_1[], char *a2_2[])
{
	char *temp;
	char *temp_2;

	temp = *a1_1;
	*a1_1 = *a1_2;
	*a1_2 = temp;

	temp_2 = *a2_1;
	*a2_1 = *a2_2;
	*a2_2 = temp_2;

	return 0;
}