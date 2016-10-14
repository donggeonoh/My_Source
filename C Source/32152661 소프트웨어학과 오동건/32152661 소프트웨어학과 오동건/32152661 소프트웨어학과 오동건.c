#include <stdio.h>
#include <string.h>

#define MAX_ENTRY 25
#define MAX_CHARS 20	

char address[MAX_ENTRY][2][MAX_CHARS] = {

	"오동건", "010-3327-0677",
	"표설희", "010-2684-1129",
	"진희수", "010-3148-5839",
	"조자룡", "011-777-7777",
	"제갈량", "019-111-1111",
};

char cmd[20];
int current_index = 5;

//정렬을 위한 temp 변수
char temp[MAX_CHARS];
char temp_2[MAX_CHARS];

//반복변수
int i;

int addr_add();
int addr_help();
int addr_sort_name();
int addr_sort_num();
int addr_list();
int addr_search_name();
int search_num();
int delete_();

int main()
{
	printf("				<주소록 프로그램>\n");
	printf("\n1. help \n2. sort name\n3. sort num\n4. list \n5. add \n6. search name \n7. search num \n8. delete \n9. quit \n");

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
			addr_sort_name();

		else if (!strcmp(cmd, "3") || !strcmp(cmd, "sort num"))
			addr_sort_num();

		else if (!strcmp(cmd, "4") || !strcmp(cmd, "list"))
			addr_list();

		else if (!strcmp(cmd, "5") || !strcmp(cmd, "add"))
			addr_add();

		else if (!strcmp(cmd, "6") || !strcmp(cmd, "search name"))
			addr_search_name();

		else if (!strcmp(cmd, "7") || !strcmp(cmd, "search num"))
			search_num();

		else if (!strcmp(cmd, "8") || !strcmp(cmd, "delete"))
			delete_();

		else
			printf("\n잘못된 명령어 입니다\n");
	}

	return 0;
}
//도움말
int addr_help()
{
	printf("\n1. help : 도움말을 불러옵니다.\n");
	printf("2. sort name: 전화번호부를 이름 순으로 정렬합니다.\n");
	printf("3. sort num : 전화번호부를 전화번호 순으로 정렬합니다. \n");
	printf("4. list : 전화번호부의 리스트를 보여줍니다.\n");
	printf("5. add : 전화번호부에 이름과 전화번호를 추가시킵니다.\n");
	printf("6. search name: 이름을 입력하면 해당하는 전화번호를 보여줍니다.\n");
	printf("7. search num : 전화번호를 입력하면 해당하는 이름을 보여줍니다.\n");
	printf("8. delete : 이름을 입력하면 해당되는 이름과 전화번호를 지웁니다.\n");
	printf("9. quit : 실행을 종료합니다...\n");
	
	return 0;
}
//이름 순으로 정렬
int addr_sort_name()
{
	int n = current_index;

	// 내림차순 정렬
	for (n = n - 1; n >= 0; n--)
		for (i = 0; i < n; i++)
			if (strcmp(address[i][0], address[i + 1][0]) > 0)	//strcmp의 return값이 0보다 크면 정렬
			{	//이름 정렬
				strcpy(temp, address[i][0]);
				strcpy(address[i][0], address[i + 1][0]);
				strcpy(address[i + 1][0], temp);
				//전화번호 정렬
				strcpy(temp_2, address[i][1]);
				strcpy(address[i][1], address[i + 1][1]);
				strcpy(address[i + 1][1], temp_2);
			}

	addr_list();	//리스트 출력

	printf("	\n정렬되었습니다. \n");

	return 0;
}
//전화번호 순으로 정렬
int addr_sort_num()
{
	int n = current_index;
	//내림차순 정렬
	for (n = n - 1; n >= 0; n--)
		for (i = 0; i < n; i++)
			if (strcmp(address[i][1], address[i + 1][1]) > 0)	//strcmp의 return값이 0보다 크면 정렬
			{	//이름 정렬
				strcpy(temp, address[i][0]);
				strcpy(address[i][0], address[i + 1][0]);
				strcpy(address[i + 1][0], temp);
				//전화번호부 정렬
				strcpy(temp_2, address[i][1]);
				strcpy(address[i][1], address[i + 1][1]);
				strcpy(address[i + 1][1], temp_2);
			}

	addr_list();	//리스트 출력

	printf("	\n정렬되었습니다. \n");

	return 0;
}
//리스트 출력
int addr_list()
{
	printf("\n");
	//전화번호부 출력
	if (current_index != 0) {
		for (i = 0; i < current_index; i++)
			printf("%-1s %-1s \n", address[i][0], address[i][1]);
	}

	else
			printf("	전화번호부에 있는 사람이 없습니다.\n");
	
	return 0;
}
//	전화번호 추가
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
//	이름으로 전화번호 찾기
int addr_search_name()
{
	printf("\n당신이 찾는 전화번호에 해당하는 이름을 입력하세요 : ");
	gets(cmd);

	for (i = 0; i < current_index; i++) {
		//입력값과 전화번호부와 같을경우 출력
		if (!strcmp(cmd, address[i][0])) {
			printf("\n\n   %s의 전화번호는 %s 입니다.\n\n\n", address[i][0], address[i][1]);
			break;
		}
		//입력값이 전화번호부에 없는경우
		else
			printf("\n목록에 없습니다.\n"); break;
	}

	return 0;
}
//전화번호로 이름찾기
int search_num()
{
	printf("당신이 찾는 이름에 해당하는 전화번호를 입력하세요 (-을 붙이세요) : ");
	gets(cmd);

	for (i = 0; i < current_index; i++) {
		//입력값이 전화번호부에 있을경우
		if (!strcmp(cmd, address[i][1])) {
			printf("\n\n   전화번호 %s 의 이름은 %s 입니다.\n\n\n", address[i][1], address[i][0]);
			break;
		}
		//없을경우
		else
			printf("\n목록에 없습니다.\n"); break;
	}
	return 0;
}
//전화번호부 지우기
int delete_()
{
	printf("\n	지울 사람의 이름을 입력하세요. : ");
	gets(cmd);

	int count = 0;	// 전화번호부의 전화번호 유무 판단
	int j;	//반복변수

	for (i = 0; i < current_index; i++)
	{
		count++;
		if (!strcmp(cmd, address[i][0]))	//입력값과 전화번호 이름이 같을경우
		{
			printf("\n	%s의 전화번호를 지웠습니다. \n", address[i][0]);

			for (j = i; j < current_index; j++)	// 이후의 전화번호 값들을 앞으로 한칸씩 땡겨준다
			{
				strcpy(address[j][0], address[j + 1][0]);
				strcpy(address[j][1], address[j + 1][1]);
			}
			current_index--;		//전화번호부 갯수 1 감소
			break;
		}
	}

	if (count == current_index)
		printf("\n목록에 없습니다.\n");

	return 0;
}