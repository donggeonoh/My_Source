#include <stdio.h>

int main(void)
{

	int a[4], b[4];
	int i;
	int result = 0;

	for (i = 0; i < 4; i++)
	{
		printf("�迭 4���� ���� �Է��ϼ��� (4��°�� %d��°) : ", i + 1);
		scanf("%d", &a[i]);
	}

	for (i = 0; i < 4; i++)
	{
		printf("�ٸ� �迭 4���� ���� �Է��ϼ��� (4��°�� %d��°) : ", i + 1);
		scanf("%d", &b[i]);
	}
	
	for (i = 0; i < 4; i++)
	{
		if (a[i] == b[i])
			continue;

		else
		{
			printf("�迭�� �ٸ��ϴ�. \n");
			break;
		}
	}

	if (i == 4)
		printf("�迭�� �����ϴ�. \n");

	return 0;

}