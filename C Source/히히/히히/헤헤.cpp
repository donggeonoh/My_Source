#include <stdio.h>
#include <string.h>

int i = 0, j = 0, k = 0, a = 0, num = 0;
char name[15], number[15], tmp[15], cmd[20];
char address[25][2][15] = {
	"김씨", "010-1111-2222",
	"이씨", "010-1234-1234",
	"박씨", "010-1234-5678",
	"최씨", "010-2222-1111",
	"강씨", "010-1111-1234",
};

void help();
void sort();
void list();
void add();
void search();
void sort_name(char *a1_1, char *a1_2, char *a2_1, char *a2_2);


int main()
{
	while (1){
		printf("명령문을 입력하세요(help를 입력하면 명령문이 보여집니다) : ");
		gets(cmd);

		if (!strcmp(cmd, "quit")){
			printf("좋은 하루 되세요!\n");
			return 0;
		}
		else if (!strcmp(cmd, "help"))
			help();
		else if (!strcmp(cmd, "sort"))
			sort();
		else if (!strcmp(cmd, "list"))
			list();
		else if (!strcmp(cmd, "add"))
			add();
		else if (!strcmp(cmd, "search"))
			search();
		else{
			printf("잘못된 명령어입니다.\n");
			help();
		}
	}
}

void help()
{
	printf("\n");
	printf("명령 목록\n");
	printf("-help : 명령문 목록을 보여줍니다.\n");
	printf("-list : 모든 이름과 전화번호를 보여줍니다.\n");
	printf("-sort : 주소록을 이름순으로 정렬합니다.\n");
	printf("-add : 주소록에 이름과 전화번호를 추가합니다.\n");
	printf("-search : 이름 검색을 통해 번호를 찾습니다.\n");
}

void sort()
{
	int n = 5 + num;

	for (n = n - 1; n >= 0; n--)
	{
		for (i = 0; i < n; i++)
		{
			if (strcmp(address[i][0], address[i + 1][0]) > 0)
				sort_name(address[i][0], address[i + 1][0], address[i][1], address[i + 1][1]);
		}
	}
	list();

}

void list()
{
	printf("\n\n<주소록>\n");
	for (j = 0; j < 5 + num; j++)
		printf("%s %s\n", address[j][0], address[j][1]);
}

void add()
{
	if (num >= 20){
		printf("더이상 추가할 수 없습니다.\n");
	}
	else{
		++num;
		printf("이름을 입력하세요 : ");
		gets(name);
		strcpy(address[num + 4][0], name);

		printf("번호를 입력하세요 : ");
		gets(number);
		strcpy(address[num + 4][1], number);
	}
}

void search()
{
	printf("\n\n검색할 이름을 입력하세요 : ");
	scanf("%s", &name);

	for (j = 0; j < 5 + num; j++){
		if (!strcmp(address[j][0], name)){
			printf("%s %s\n\n", address[j][0], address[j][1]);
			break;
		}
	}
	if (j == 5 + num)
		printf("찾는 이름이 없습니다.\n");
}

void sort_name(char *a1_1, char *a1_2, char *a2_1, char *a2_2)
{
	char temp[15];
	char temp_2[15];

	strcpy(temp, a1_1);
	strcpy(a1_1, a1_2);
	strcpy(a1_2, temp);

	strcpy(temp_2, a2_1);
	strcpy(a2_1, a2_2);
	strcpy(a2_2, temp_2);

}