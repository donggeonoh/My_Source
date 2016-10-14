#include <stdio.h>
#include <string.h>

#define MAX_ENTRY 25
#define MAX_CHARS 20

int main(void)
{
	char address[MAX_ENTRY][2][MAX_CHARS] = {
		"����", "011-111-1111",
		"����", "017-111-1111",
		"���", "016-111-1111",
		"���ڷ�", "011-777-7777",
		"������", "019-111-1111",
	};

	int current_index = 5;
	int i;

	char cmd[20];
	char find[20];

	printf("�ּҷ� ���α׷�\n");
	printf("\n1. help \n2. sort \n3. list \n4. add \n5. search \n6. quit\n");

	while (1)
	{
		printf("\n���Ͻô� ��ȣ Ȥ�� �ش�Ǵ� ���ڸ� �Է��ϼ���. : ");
		gets(cmd);

		if (!strcmp(cmd, "6") || !strcmp(cmd, "quit"))
		{
			printf("�ȳ��� ���ʽÿ�. \n");
			break;
		}
		else if (!strcmp(cmd, "1") || !strcmp(cmd, "help"))
		{
			printf("\nsort : ��ȭ��ȣ�θ� ������� �����մϴ�.\n");
			printf("list : ��ȭ��ȣ���� ����Ʈ�� �����ݴϴ�.\n");
			printf("add : ��ȭ��ȣ�ο� �̸��� ��ȭ��ȣ�� �߰���ŵ�ϴ�.\n");
			printf("search : ��ȭ��ȣ�� �ȿ� �ִ� �̸��� �˻��Ͽ� ��ȭ��ȣ�� �����ݴϴ�.\n");
			printf("quit : ������ �����մϴ�...\n");
		}
			
		//else if (!strcmp(cmd, "2") || !strcmp(cmd, "sort"))
			
		else if (!strcmp(cmd, "3") || !strcmp(cmd, "list"))
		{
			printf("\n");
			for (i = 0; i < current_index; i++)
				printf("%s %s \n", address[i][0], address[i][1]);
		}

		else if (!strcmp(cmd, "4") || !strcmp(cmd, "add"))
		{
			printf("�߰��� �̸��� �Է��ϼ��� : ");
			scanf("%s", address[current_index][0]);
			printf("�߰��� ��ȭ��ȣ�� �Է��ϼ��� : ");
			scanf("%s", address[current_index][1]);

			printf("\n		��ȭ��ȣ�� ��ϵǾ����ϴ�.\n");

			current_index++;
		}
		else if (!strcmp(cmd, "5") || !strcmp(cmd, "search"))
		{
			printf("ã����� ��ȭ��ȣ�� �ش��ϴ� �̸��� �Է��ϼ��� : ");
			scanf("%s", find);

			for (i = 0; i < current_index; i++)
				if (find[20] == address[i][0])
					printf("%s�� ��ȭ��ȣ�� %s �Դϴ�. \n", find[20], address[i][1]);
		}

		else
				printf("�߸��� ��ɾ��Դϴ�.\n");
	}

	return 0;
}