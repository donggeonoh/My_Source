#include <stdio.h>

int main(void)
{
	
	int a[100], b[100];
	int i;
	int j;

	printf("�迭 ũ�� ���� �Է��ϼ��� (�ִ� 100 ������ �ڿ���) : ");
	scanf("%d", &i);

	for (j = 0; j < i; j++)
	{
		printf("�迭 ���� �Է��ϼ��� (%d��° �� %d ��°) : ", i, j + 1);
		scanf("%d", &a[i]);
	}

	for (j = 0; j < i; j++)
	{
		printf("�ٸ� �迭 ���� �Է��ϼ��� (%d��° �� %d ��°) : ", i, j + 1);
		scanf("%d", &b[i]);
	}

	for (j = 0; j < i; j++)
	{
		if (a[i] == b[i])
			continue;

		else
		{
			printf("\n���� �迭�� �ٸ��ϴ�.\n\n");
			break;
		}
	}

	if (j == i)
		printf("\n���� �迭�� �����ϴ�.\n\n");

	return 0;

}