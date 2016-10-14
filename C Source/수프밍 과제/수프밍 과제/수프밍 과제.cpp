#include <stdio.h>
#include <string.h>

int addr_list(char address);
int addr_add();

#define		MAX_ENTRY		25
#define		MAX_CHARS		20

char address[MAX_ENTRY][2][MAX_CHARS] =
{
	"����", "011-111-1111"
	"����", "017-111-1111"
	"���", "016-111-1111"
	"���ڷ�", "011-777-7777"
	"������", "019-111-1111"
};

int current_index = 5;

int main(void)
{
	char cmd[20];

	printf("�ּҷ� ���α׷�\n");
	while (1)
	{
		printf("��ɾ �Է��ϼ��� (��ɾ ������ help�� �Է��ϼ���) : ");
		gets(cmd);

		if (!strcmp(cmd, "quit"))
		{
			printf("�ȳ��� ���ʽÿ�\n");
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
			printf("�߸��ȸ�ɾ��Դϴ�\n");
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
	printf("�߰��� �̸��� �Է��ϼ��� : ");
	scanf("%s", address[current_index][0]);
	printf("�߰��� ��ȭ��ȣ�� �Է��ϼ��� : ");
	scanf("%s", address[current_index][1]);

	printf("��ȭ��ȣ�� ��ϵǾ����ϴ�. \n");

	current_index++;

	return 0;
}