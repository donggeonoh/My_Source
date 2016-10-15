#include <stdio.h>

int main(void)
{
	int a, b, c, d, e, f, g;
	int a1 = 0;
	int b1 = 0;
	int c1 = 0;
	int d1 = 0;
	int e1 = 0;
	int f1 = 0;
	int g1 = 0;

	printf("7개의 자연수 중 홀수만 모두 더하여라 (7개 중 1번째, 단 100 이하의 자연수) : ");
	scanf("%d", &a);

	printf("7개의 자연수 중 홀수만 모두 더하여라 (7개 중 2번째, 단 100 이하의 자연수) : ");
	scanf("%d", &b);

	printf("7개의 자연수 중 홀수만 모두 더하여라 (7개 중 3번째, 단 100 이하의 자연수) : ");
	scanf("%d", &c);

	printf("7개의 자연수 중 홀수만 모두 더하여라 (7개 중 4번째, 단 100 이하의 자연수) : ");
	scanf("%d", &d);

	printf("7개의 자연수 중 홀수만 모두 더하여라 (7개 중 5번째, 단 100 이하의 자연수) : ");
	scanf("%d", &e);

	printf("7개의 자연수 중 홀수만 모두 더하여라 (7개 중 6번째, 단 100 이하의 자연수) : ");
	scanf("%d", &f);

	printf("7개의 자연수 중 홀수만 모두 더하여라 (7개 중 7번째, 단 100 이하의 자연수) : ");
	scanf_s("%d", &g);

	if (a % 2 == 0)
	{
		0;
	}
	else
	{
		a1 = a;
	}
	if (b % 2 == 0)
	{
		0;
	}
	else
	{
		b1 = b;
	}
	if (c % 2 == 0)
	{
		0;
	}
	else
	{
		c1 = c;
	}
	if (d % 2 == 0)
	{
		0;
	}
	else
	{
		d1 = d;
	}
	if (e % 2 == 0)
	{
		0;
	}
	else
	{
		e1 = e;
	}
	if (f % 2 == 0)
	{
		0;
	}
	else
	{
		f1 = f;
	}
	if (g % 2 == 0)
	{
		0;
	}
	else
	{
		g1 = g;
	}

	printf("홀수의 값은 %d 입니다. ", a1 + b1 + c1 + d1 + e1 + f1 + g1);

	return 0;
}