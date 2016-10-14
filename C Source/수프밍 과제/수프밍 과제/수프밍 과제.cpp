#include <stdio.h>
#include <string.h>

int addr_list(char address);
int addr_add();

#define		MAX_ENTRY		25
#define		MAX_CHARS		20

char address[MAX_ENTRY][2][MAX_CHARS] =
{
	"유비", "011-111-1111"
	"관우", "017-111-1111"
	"장비", "016-111-1111"
	"조자룡", "011-777-7777"
	"제갈량", "019-111-1111"
};

int current_index = 5;

int main(void)
{
	char cmd[20];

	printf("주소록 프로그램\n");
	while (1)
	{
		printf("명령어를 입력하세요 (명령어를 보려면 help를 입력하세요) : ");
		gets(cmd);

		if (!strcmp(cmd, "quit"))
		{
			printf("안녕히 가십시오\n");
			break;
		}

		//else if (!strcmp(cmd, "help"))
			//addr_help();
		//else if (!strcmp(cmd, "sort"))
			//addr_sort();
		else if (!strcmp(cmd, "list"))
			addr_list(address[MAX_ENTRY][2][MAX_CHARS]);
		else if (!strcmp(cmd, "add"))
			addr_add();
		//else if (!strcmp(cmd, "search"))
			//addr_search();
		else
			printf("잘못된명령어입니다\n");
	}

	return 0;
}

int addr_list(char address)
{
	int i;

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

	printf("전화번호가 등록되었습니다. \n");

	current_index++;

	return 0;
}