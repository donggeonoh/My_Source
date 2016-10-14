#include <stdio.h>
#include <string.h>

int i = 0, j = 0, k = 0, a = 0, num = 0;
char name[15], number[15], tmp[15], cmd[20];
char address[25][2][15] = {
	"�达", "010-1111-2222",
	"�̾�", "010-1234-1234",
	"�ھ�", "010-1234-5678",
	"�־�", "010-2222-1111",
	"����", "010-1111-1234",
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
		printf("��ɹ��� �Է��ϼ���(help�� �Է��ϸ� ��ɹ��� �������ϴ�) : ");
		gets(cmd);

		if (!strcmp(cmd, "quit")){
			printf("���� �Ϸ� �Ǽ���!\n");
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
			printf("�߸��� ��ɾ��Դϴ�.\n");
			help();
		}
	}
}

void help()
{
	printf("\n");
	printf("��� ���\n");
	printf("-help : ��ɹ� ����� �����ݴϴ�.\n");
	printf("-list : ��� �̸��� ��ȭ��ȣ�� �����ݴϴ�.\n");
	printf("-sort : �ּҷ��� �̸������� �����մϴ�.\n");
	printf("-add : �ּҷϿ� �̸��� ��ȭ��ȣ�� �߰��մϴ�.\n");
	printf("-search : �̸� �˻��� ���� ��ȣ�� ã���ϴ�.\n");
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
	printf("\n\n<�ּҷ�>\n");
	for (j = 0; j < 5 + num; j++)
		printf("%s %s\n", address[j][0], address[j][1]);
}

void add()
{
	if (num >= 20){
		printf("���̻� �߰��� �� �����ϴ�.\n");
	}
	else{
		++num;
		printf("�̸��� �Է��ϼ��� : ");
		gets(name);
		strcpy(address[num + 4][0], name);

		printf("��ȣ�� �Է��ϼ��� : ");
		gets(number);
		strcpy(address[num + 4][1], number);
	}
}

void search()
{
	printf("\n\n�˻��� �̸��� �Է��ϼ��� : ");
	scanf("%s", &name);

	for (j = 0; j < 5 + num; j++){
		if (!strcmp(address[j][0], name)){
			printf("%s %s\n\n", address[j][0], address[j][1]);
			break;
		}
	}
	if (j == 5 + num)
		printf("ã�� �̸��� �����ϴ�.\n");
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