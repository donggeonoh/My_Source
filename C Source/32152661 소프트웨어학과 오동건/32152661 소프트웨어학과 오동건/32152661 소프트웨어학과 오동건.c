#include <stdio.h>
#include <string.h>

#define MAX_ENTRY 25
#define MAX_CHARS 20	

char address[MAX_ENTRY][2][MAX_CHARS] = {

	"������", "010-3327-0677",
	"ǥ����", "010-2684-1129",
	"�����", "010-3148-5839",
	"���ڷ�", "011-777-7777",
	"������", "019-111-1111",
};

char cmd[20];
int current_index = 5;

//������ ���� temp ����
char temp[MAX_CHARS];
char temp_2[MAX_CHARS];

//�ݺ�����
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
	printf("				<�ּҷ� ���α׷�>\n");
	printf("\n1. help \n2. sort name\n3. sort num\n4. list \n5. add \n6. search name \n7. search num \n8. delete \n9. quit \n");

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
			printf("\n�߸��� ��ɾ� �Դϴ�\n");
	}

	return 0;
}
//����
int addr_help()
{
	printf("\n1. help : ������ �ҷ��ɴϴ�.\n");
	printf("2. sort name: ��ȭ��ȣ�θ� �̸� ������ �����մϴ�.\n");
	printf("3. sort num : ��ȭ��ȣ�θ� ��ȭ��ȣ ������ �����մϴ�. \n");
	printf("4. list : ��ȭ��ȣ���� ����Ʈ�� �����ݴϴ�.\n");
	printf("5. add : ��ȭ��ȣ�ο� �̸��� ��ȭ��ȣ�� �߰���ŵ�ϴ�.\n");
	printf("6. search name: �̸��� �Է��ϸ� �ش��ϴ� ��ȭ��ȣ�� �����ݴϴ�.\n");
	printf("7. search num : ��ȭ��ȣ�� �Է��ϸ� �ش��ϴ� �̸��� �����ݴϴ�.\n");
	printf("8. delete : �̸��� �Է��ϸ� �ش�Ǵ� �̸��� ��ȭ��ȣ�� ����ϴ�.\n");
	printf("9. quit : ������ �����մϴ�...\n");
	
	return 0;
}
//�̸� ������ ����
int addr_sort_name()
{
	int n = current_index;

	// �������� ����
	for (n = n - 1; n >= 0; n--)
		for (i = 0; i < n; i++)
			if (strcmp(address[i][0], address[i + 1][0]) > 0)	//strcmp�� return���� 0���� ũ�� ����
			{	//�̸� ����
				strcpy(temp, address[i][0]);
				strcpy(address[i][0], address[i + 1][0]);
				strcpy(address[i + 1][0], temp);
				//��ȭ��ȣ ����
				strcpy(temp_2, address[i][1]);
				strcpy(address[i][1], address[i + 1][1]);
				strcpy(address[i + 1][1], temp_2);
			}

	addr_list();	//����Ʈ ���

	printf("	\n���ĵǾ����ϴ�. \n");

	return 0;
}
//��ȭ��ȣ ������ ����
int addr_sort_num()
{
	int n = current_index;
	//�������� ����
	for (n = n - 1; n >= 0; n--)
		for (i = 0; i < n; i++)
			if (strcmp(address[i][1], address[i + 1][1]) > 0)	//strcmp�� return���� 0���� ũ�� ����
			{	//�̸� ����
				strcpy(temp, address[i][0]);
				strcpy(address[i][0], address[i + 1][0]);
				strcpy(address[i + 1][0], temp);
				//��ȭ��ȣ�� ����
				strcpy(temp_2, address[i][1]);
				strcpy(address[i][1], address[i + 1][1]);
				strcpy(address[i + 1][1], temp_2);
			}

	addr_list();	//����Ʈ ���

	printf("	\n���ĵǾ����ϴ�. \n");

	return 0;
}
//����Ʈ ���
int addr_list()
{
	printf("\n");
	//��ȭ��ȣ�� ���
	if (current_index != 0) {
		for (i = 0; i < current_index; i++)
			printf("%-1s %-1s \n", address[i][0], address[i][1]);
	}

	else
			printf("	��ȭ��ȣ�ο� �ִ� ����� �����ϴ�.\n");
	
	return 0;
}
//	��ȭ��ȣ �߰�
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
//	�̸����� ��ȭ��ȣ ã��
int addr_search_name()
{
	printf("\n����� ã�� ��ȭ��ȣ�� �ش��ϴ� �̸��� �Է��ϼ��� : ");
	gets(cmd);

	for (i = 0; i < current_index; i++) {
		//�Է°��� ��ȭ��ȣ�ο� ������� ���
		if (!strcmp(cmd, address[i][0])) {
			printf("\n\n   %s�� ��ȭ��ȣ�� %s �Դϴ�.\n\n\n", address[i][0], address[i][1]);
			break;
		}
		//�Է°��� ��ȭ��ȣ�ο� ���°��
		else
			printf("\n��Ͽ� �����ϴ�.\n"); break;
	}

	return 0;
}
//��ȭ��ȣ�� �̸�ã��
int search_num()
{
	printf("����� ã�� �̸��� �ش��ϴ� ��ȭ��ȣ�� �Է��ϼ��� (-�� ���̼���) : ");
	gets(cmd);

	for (i = 0; i < current_index; i++) {
		//�Է°��� ��ȭ��ȣ�ο� �������
		if (!strcmp(cmd, address[i][1])) {
			printf("\n\n   ��ȭ��ȣ %s �� �̸��� %s �Դϴ�.\n\n\n", address[i][1], address[i][0]);
			break;
		}
		//�������
		else
			printf("\n��Ͽ� �����ϴ�.\n"); break;
	}
	return 0;
}
//��ȭ��ȣ�� �����
int delete_()
{
	printf("\n	���� ����� �̸��� �Է��ϼ���. : ");
	gets(cmd);

	int count = 0;	// ��ȭ��ȣ���� ��ȭ��ȣ ���� �Ǵ�
	int j;	//�ݺ�����

	for (i = 0; i < current_index; i++)
	{
		count++;
		if (!strcmp(cmd, address[i][0]))	//�Է°��� ��ȭ��ȣ �̸��� �������
		{
			printf("\n	%s�� ��ȭ��ȣ�� �������ϴ�. \n", address[i][0]);

			for (j = i; j < current_index; j++)	// ������ ��ȭ��ȣ ������ ������ ��ĭ�� �����ش�
			{
				strcpy(address[j][0], address[j + 1][0]);
				strcpy(address[j][1], address[j + 1][1]);
			}
			current_index--;		//��ȭ��ȣ�� ���� 1 ����
			break;
		}
	}

	if (count == current_index)
		printf("\n��Ͽ� �����ϴ�.\n");

	return 0;
}