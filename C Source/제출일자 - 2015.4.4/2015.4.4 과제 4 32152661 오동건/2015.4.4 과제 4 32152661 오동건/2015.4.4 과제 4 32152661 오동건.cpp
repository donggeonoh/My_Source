#include <stdio.h>

int main(void)
{
	int a;
	int b;
	int num1 = 0;

	for (b = 1; b <= 7; b++)
	{
		printf("7���� �ڿ��� �� Ȧ���� ��� ���Ͽ��� (7�� �� %d��°, �� 100 ������ �ڿ���) : ", b);
		scanf("%d", &a);

		if (a % 2 == 1)
			num1 += a;

	}

	printf("Ȧ���� ���� %d �Դϴ�. ", num1);

	return 0;
}