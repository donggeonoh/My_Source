#include <stdio.h>
#include <string.h>

#define MAX_ENTRY 25
#define MAX_CHARS 20

char address[MAX_ENTRY][2][MAX_CHARS] = {

	"���", "016-111-1111",
	"����", "011-111-1111",
	"����", "017-111-1111",
	"���ڷ�", "011-777-7777",
	"������", "019-111-1111",
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
	printf("�ּҷ� ���α׷�\n");
	printf("\n1. help \n2. sort name\n3. sort num\n4. list \n5. add \n6. search name \n7. search number \n8. delete name \n9. quit \n");

	while (1)
	{

		printf("\n���Ͻô� ��ȣ Ȥ�� �ش�Ǵ� ���ڸ� �Է��ϼ���. (������ 1 �Ǵ� help) : ");
		gets(cmd);

		if (!strcmp(cmd, "9") || !strcmp(cmd, "quit"))
		{
			printf("\n\n\n   ������ �����մϴ� �ȳ��� ���ʽÿ�. \n\n\n\n");
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
			printf("\n�߸��� ��ɾ� �Դϴ�\n");
	}

	return 0;
}

int addr_help()
{
	printf("\n1. help : ������ �ҷ��ɴϴ�.\n");
	printf("n2. sort : ��ȭ��ȣ�θ� ������� �����մϴ�.\n");
	printf("3. list : ��ȭ��ȣ���� ����Ʈ�� �����ݴϴ�.\n");
	printf("4. add : ��ȭ��ȣ�ο� �̸��� ��ȭ��ȣ�� �߰���ŵ�ϴ�.\n");
	printf("5. search : �̸��� �Է��ϸ� �ش��ϴ� ��ȭ��ȣ�� �����ݴϴ�.\n");
	printf("6. quit : ������ �����մϴ�...\n");
	printf("7. number : ��ȭ��ȣ�� �Է��ϸ� �ش��ϴ� �̸��� �����ݴϴ�.");

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

	printf("���ĵǾ����ϴ�. \n");

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

	printf("���ĵǾ����ϴ�. \n");

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
	gets(address[current_index][0]);
	printf("�߰��� ��ȭ��ȣ�� �Է��ϼ��� : ");
	gets(address[current_index][1]);

	printf("\n   ��ȭ��ȣ�� ��ϵǾ����ϴ�.\n");

	current_index++;

	return 0;
}

int addr_search()
{
	printf("����� ã�� ��ȭ��ȣ�� �ش��ϴ� �̸��� �Է��ϼ��� : ");
	gets(cmd);

	for (i = 0; i < current_index; i++)
	{
		if (!strcmp(cmd, address[i][0]))
		{
			printf("\n\n   %s�� ��ȭ��ȣ�� %s �Դϴ�.\n\n\n", address[i][0], address[i][1]);
			break;
		}
	}

	if (i == current_index)
		printf("\n��Ͽ� �����ϴ�.\n");

	return 0;
}

int search_num()
{
	printf("����� ã�� �̸��� �ش��ϴ� ��ȭ��ȣ�� �Է��ϼ��� (-�� ���̼���) : ");
	gets(cmd);

	for (i = 0; i < current_index; i++)
	{
		if (!strcmp(cmd, address[i][1]))
		{
			printf("\n\n   ��ȭ��ȣ %s �� �̸��� %s �Դϴ�.\n\n\n", address[i][1], address[i][0]);
			break;
		}
	}

	if (i == current_index)
		printf("\n��Ͽ� �����ϴ�.\n");
	return 0;
}

int delete_name()
{
	printf("���� ����� �̸��� �Է��ϼ���. : ");
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
			printf("%s�� ��ȭ��ȣ�� �������ϴ�. \n", address[i][0]);
			current_index--;
			break;
		}
	}

	if (i == current_index)
		printf("\n��Ͽ� �����ϴ�.\n");

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