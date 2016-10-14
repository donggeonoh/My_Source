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

	printf("1000이하의 자연수를 입력하세요 (완전수 판별) : ");
	scanf("%d", &a);

	comp(a);

	int d = comp(a);

	if (d == a)
		printf("Yes \n");

	else
		printf("no \n");

	return 0;
}