#include <stdio.h>
#include <string.h>

#define MAX_ENTRY 25
#define MAX_CHARS 20

char address[MAX_ENTRY][2][MAX_CHARS] = {
	"����", "011-111-1111",
	"����", "017-111-1111",
	"���", "016-111-1111",
	"���ڷ�", "011-777-7777",
	"������", "019-111-1111",
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

	printf("�ּҷ� ���α׷�\n");
	printf("\n1. help \n2. sort \n3. list \n4. add \n5. search \n6. quit\n");

	while (1)
	{

		printf("\n���Ͻô� ��ȣ Ȥ�� �ش�Ǵ� ���ڸ� �Է��ϼ���. : ");
		gets(cmd);

		if (!strcmp(cmd, "6") || !strcmp(cmd, "quit"))
		{
			printf("\n\n\n	������ �����մϴ� �ȳ��� ���ʽÿ�. \n\n\n\n");
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
			printf("�߸��� ��ɾ� �Դϴ�\n");
	}

	return 0;
}

int addr_help()
{
		printf("\nsort : ��ȭ��ȣ�θ� ������� �����մϴ�.\n");
		printf("list : ��ȭ��ȣ���� ����Ʈ�� �����ݴϴ�.\n");
		printf("add : ��ȭ��ȣ�ο� �̸��� ��ȭ��ȣ�� �߰���ŵ�ϴ�.\n");
		printf("search : ��ȭ��ȣ�� �ȿ� �ִ� �̸��� �˻��Ͽ� ��ȭ��ȣ�� �����ݴϴ�.\n");
		printf("quit : ������ �����մϴ�...\n");

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
	printf("�߰��� �̸��� �Է��ϼ��� : ");
	scanf("%s", address[current_index][0]);
	printf("�߰��� ��ȭ��ȣ�� �Է��ϼ��� : ");
	scanf("%s", address[current_index][1]);

	printf("\n	��ȭ��ȣ�� ��ϵǾ����ϴ�.\n");

	current_index++;

	return 0;
}

int addr_search()
{
	printf("����� ã�� ��ȭ��ȣ�� �ش��ϴ� �̸��� �Է��ϼ��� : ");
	gets(cmd);

	for (i = 0; i < current_index; i++)
	{
		if (strcmp(cmd, address[i][0]) == 0)
			printf("\n\n	%s�� ��ȭ��ȣ�� %s �Դϴ�.\n\n\n", address[i][0], address[i][1]);
	}

	for (i = 0; i < current_index; i++)
	{
		if (!strcmp(cmd, address[i][0]) == 0)
		{
			printf("\n��Ͽ� �����ϴ�.\n");
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