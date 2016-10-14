#include <stdio.h>

int main(void)
{
	int a;
	int b;
	int c;
	int d;
	int e;
	int f;
	int g;
	int a1 = 0;
	int a2 = 0;
	int a3 = 0;
	int b1 = 0;
	int b2 = 0;
	int b3 = 0;
	int c1 = 0;
	int c2 = 0;
	int c3 = 0;
	int d1 = 0;
	int d2 = 0;
	int d3 = 0;
	int e1 = 0;
	int e2 = 0;
	int e3 = 0;
	int f1 = 0;
	int f2 = 0;
	int f3 = 0;
	int g1 = 0;
	int g2 = 0;
	int g3 = 0;

	printf("정수 값을 입력해주세요 (단, 1000 미만의 정수를 입력하세요.) : ");
	scanf("%d", &a);

	printf("정수 값을 입력해주세요 (단, 1000 미만의 정수를 입력하세요.) : ");
	scanf("%d", &b);

	printf("정수 값을 입력해주세요 (단, 1000 미만의 정수를 입력하세요.) : ");
	scanf("%d", &c);

	printf("정수 값을 입력해주세요 (단, 1000 미만의 정수를 입력하세요.) : ");
	scanf("%d", &d);

	printf("정수 값을 입력해주세요 (단, 1000 미만의 정수를 입력하세요.) : ");
	scanf("%d", &e);

	printf("정수 값을 입력해주세요 (단, 1000 미만의 정수를 입력하세요.) : ");
	scanf("%d", &f);

	printf("정수 값을 입력해주세요 (단, 1000 미만의 정수를 입력하세요.) : ");
	scanf("%d", &g);

	if (0 < a&&a < 10)
	{
		a1 = a;
	}
	else if (10 <= a&&a < 100)
	{
		a2 = a;
	}
	else if (100 <= a&&a < 1000)
	{
		a3 = a;
	}
	if (0 < b&&b < 10)
	{
		b1 = b;
	}
	else if (10 <= b&&b < 100)
	{
		b2 = b;
	}
	else if (100 <= b&&b < 1000)
	{
		b3 = b;
	}
	if (0 < c&&c < 10)
	{
		c1 = c;
	}
	else if (10 <= c&&c < 100)
	{
		c2 = c;
	}
	else if (100 <= c&&c < 1000)
	{
		c3 = c;
	}
	if (0 < d&&d < 10)
	{
		d1 = d;
	}
	else if (10 <= d&&d < 100)
	{
		d2 = d;
	}
	else if (100 <= d&&d < 1000)
	{
		d3 = d;
	}
	if (0 < e&&e < 10)
	{
		e1 = e;
	}
	else if (10 <= e&&e < 100)
	{
		e2 = e;
	}
	else if (100 <= e&&e < 1000)
	{
		e3 = e;
	}
	if (0 < f&&f < 10)
	{
		f1 = f;
	}
	else if (10 <= f&&f < 100)
	{
		f2 = f;
	}
	else if (100 <= f&&f < 1000)
	{
		f3 = f;
	}
	if (0 < g&&g < 10)
	{
		g1 = g;
	}
	else if (10 <= g&&g < 100)
	{
		g2 = g;
	}
	else if (100 <= g&&g < 1000)
	{
		g3 = g;
	}
	{
		printf("%d %d %d", a1 + b1 + c1 + d1 + e1 + f1 + g1, a2 + b2 + c2 + d2 + e2 + f2 + g2, a3 + b3 + c3 + d3 + e3 + f3 + g3);
	}

	return 0;
}