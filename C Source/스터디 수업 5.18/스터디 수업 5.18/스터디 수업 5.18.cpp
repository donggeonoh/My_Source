/*

#include <stdio.h>

int main(void)
{
	int x, y, z;
	int temp = 0;

	printf("���� �Է��ϼ��� (x�� ��) : ");
	scanf("%d", &x);

	printf("���� �Է��ϼ��� (y�� ��) : ");
	scanf("%d", &y);

	printf("���� �Է��ϼ��� (z�� ��) : ");
	scanf("%d", &z);

	if (x < y)
	{
		temp = y;
		x = y;
		y = temp;
	}

	if (y < z)
	{
		temp = z;
		y = z;
		z = temp;
	}

	if (x < y)
	{
		temp = y;
		x = y;
		y = temp;
	}

	printf("%d %d %d", x, y, z);

	return 0;
}

*/

/*

int test(int x[], int n)
{
	int i;
	int result;

	for (i = 0; i < n; i++)
	{
		if (x[i] != x[n - i - 1])
		{
			result = 0;
			break;
		}
		result = 1;
	}

	return result;
}

#include <stdio.h>

int main(void)
{
	int x[7];
	int i;
	int result;

	for (i = 0; i < 7; i++)
	{
		printf("���� �Է����ּ��� : ");
		scanf("%d", &x[i]);
	}

	result = test(x, 7);

	printf("%d \n", result);

	return 0;
}

*/

/*

#include <stdio.h>

void test(int x)
{
	x = 5;
}

int main(void)
{
	int x = 10;

	printf("�Լ� ���� �� x�� �� : %d", x);
	test(x);
	printf("�Լ� �� �� x�� �� : %d", x);


	return 0;
}

*/

#include <stdio.h>

void test(int x[], int n)
{
	int i;
	int result = 0;
	for (i = 0; i < n; i++)
		x[i] = 0;
}

int main(void)
{
	int x[3];
	int i;

	for (i = 0; i < 3; i++)
	{
		printf("���� �Է��ϼ��� : ");
		scanf("%d", &x[i]);
	}

	test(x, 3);

	for (i = 0; i < 3; i++)
		printf("%d", x[i]);
}