#include <stdio.h>

int comp(int a)
{
	int b;
	int c = 0;

	for (b = 1; b < a; b++)
	{
		if (a % b == 0)
			c += b;
	}

	return c;
}

int main(void)
{
	int a;

	printf("1000������ �ڿ����� �Է��ϼ��� (������ �Ǻ�) : ");
	scanf("%d", &a);

	comp(a);

	int d = comp(a);

	if (d == a)
		printf("Yes \n");

	else
		printf("no \n");

	return 0;
}