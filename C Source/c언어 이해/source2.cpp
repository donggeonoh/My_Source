#include <stdio.h>

int main(void)
{
	int a;
	int x;
	int num1 = 0;

	printf("1000������ �ڿ����� �Է��ϼ��� : ");
	scanf_s("%d", &a);
	for (x = 1; x <= a; x++)
	{
		num1 += x;

		printf("1..%d %d\n", x, num1);
	}

	return 0;
}