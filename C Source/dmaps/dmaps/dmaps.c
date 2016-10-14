#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

int count = 0;	// 대여한 DVD 개수

int Login();
int Menu();
void Start_DVD();

int main() {
	puts("[ DVD 대여 프로그램 ]");
	if (Login())
		Start_DVD();
	else
		puts("[ Login 실패 ]");

	return 0;
}

int Login() {
	char Init[20] = "asdf";	// 초기 ID
	char ID[20];	// 입력한 ID
	char PS[10] = "0000"; // 초기 Password
	char PW[10];			// 입력한 Password

	printf("아이디 : ");
	gets(ID);

	printf("비밀번호 : ");
	gets(PW);

	if (strcmp(Init, ID) == 0 && strcmp(PS, PW) == 0)
		return 1;

	else
		return 0;

	// 여기에서 비밀번호 * 표시를 어떻게 하는지 모르겠습니다 ㅠㅠㅠ...
	return 0;
}

int Menu() {
	int select;

	scanf_s("%d", &select);

	return select;
}

void Start_DVD()
{
	int i;
	char dvd_list[5][30];	// 대여한 DVD 목록
	int select_DVD;

	for (;;)
	{

		printf("\n");

		printf("1. DVD 대여\n");
		printf("2. DVD 목록\n");
		printf("3. 낱개 반납\n");
		printf("4. 전체 반납\n");
		printf("5. 나가기\n");

		printf("\n숫자를 입력하세요 : ");

		switch (Menu())
		{
		case 1:
			if (count < 5)
			{
				printf("DVD 대여 : ");

				fflush(stdin);
				gets(dvd_list[count]);

				count++;

				printf("대여가 되었습니다. ( 대여 가능 횟수 %d개)\n", 5 - count);
			}

			else if (count == 5)
				printf("\n더이상 대여가 되지 않습니다.\n");

			break;

		case 2:

			if (count <= 5)
			{
				printf("\n");
				for (i = 0; i < count; i++)
					printf("%d. %s\n", i + 1, dvd_list[i]);
			}

			else if (count == 0)
				printf("목록이 없습니다.\n");

			break;

		case 3:

			if (count <= 5)
			{
				printf("\n");
				for (i = 0; i < count; i++)
					printf("%d. %s\n", i + 1, dvd_list[i]);

				printf("\n반납하실 DVD 를 입력하세요 : ");
				scanf("%d", &select_DVD);

				for (i = select_DVD - 1; i < 5; i++)
					strcpy(dvd_list[i], dvd_list[i + 1]);

				count--;

				printf("\n완료되었습니다.\n");
			}

			else if (count == 0)
				printf("목록이 없습니다.\n");

			break;

		case 4:

			printf("모두 반납 하시겠습니까? (1. 예, 2. 아니오) : ");
			scanf("%d", &i);

			if (i == 1)
			{
				printf("\n모두 삭제하였습니다.\n");
				count = 0;
			}

			else if (i == 2)
				continue;

			break;
		}
	}
}