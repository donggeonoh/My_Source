#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

int count = 0;	// �뿩�� DVD ����

int Login();
int Menu();
void Start_DVD();

int main() {
	puts("[ DVD �뿩 ���α׷� ]");
	if (Login())
		Start_DVD();
	else
		puts("[ Login ���� ]");

	return 0;
}

int Login() {
	char Init[20] = "asdf";	// �ʱ� ID
	char ID[20];	// �Է��� ID
	char PS[10] = "0000"; // �ʱ� Password
	char PW[10];			// �Է��� Password

	printf("���̵� : ");
	gets(ID);

	printf("��й�ȣ : ");
	gets(PW);

	if (strcmp(Init, ID) == 0 && strcmp(PS, PW) == 0)
		return 1;

	else
		return 0;

	// ���⿡�� ��й�ȣ * ǥ�ø� ��� �ϴ��� �𸣰ڽ��ϴ� �ФФ�...
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
	char dvd_list[5][30];	// �뿩�� DVD ���
	int select_DVD;

	for (;;)
	{

		printf("\n");

		printf("1. DVD �뿩\n");
		printf("2. DVD ���\n");
		printf("3. ���� �ݳ�\n");
		printf("4. ��ü �ݳ�\n");
		printf("5. ������\n");

		printf("\n���ڸ� �Է��ϼ��� : ");

		switch (Menu())
		{
		case 1:
			if (count < 5)
			{
				printf("DVD �뿩 : ");

				fflush(stdin);
				gets(dvd_list[count]);

				count++;

				printf("�뿩�� �Ǿ����ϴ�. ( �뿩 ���� Ƚ�� %d��)\n", 5 - count);
			}

			else if (count == 5)
				printf("\n���̻� �뿩�� ���� �ʽ��ϴ�.\n");

			break;

		case 2:

			if (count <= 5)
			{
				printf("\n");
				for (i = 0; i < count; i++)
					printf("%d. %s\n", i + 1, dvd_list[i]);
			}

			else if (count == 0)
				printf("����� �����ϴ�.\n");

			break;

		case 3:

			if (count <= 5)
			{
				printf("\n");
				for (i = 0; i < count; i++)
					printf("%d. %s\n", i + 1, dvd_list[i]);

				printf("\n�ݳ��Ͻ� DVD �� �Է��ϼ��� : ");
				scanf("%d", &select_DVD);

				for (i = select_DVD - 1; i < 5; i++)
					strcpy(dvd_list[i], dvd_list[i + 1]);

				count--;

				printf("\n�Ϸ�Ǿ����ϴ�.\n");
			}

			else if (count == 0)
				printf("����� �����ϴ�.\n");

			break;

		case 4:

			printf("��� �ݳ� �Ͻðڽ��ϱ�? (1. ��, 2. �ƴϿ�) : ");
			scanf("%d", &i);

			if (i == 1)
			{
				printf("\n��� �����Ͽ����ϴ�.\n");
				count = 0;
			}

			else if (i == 2)
				continue;

			break;
		}
	}
}