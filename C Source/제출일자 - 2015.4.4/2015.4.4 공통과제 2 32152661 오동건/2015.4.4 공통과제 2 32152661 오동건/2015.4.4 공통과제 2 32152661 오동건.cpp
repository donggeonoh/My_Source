#include <stdio.h>

int main(void)
{
	int a;
	int b;
	int c;
	int d = 0;
	int e = 0;

	printf("1000이하의 정수 2개를 입력해주세요 : ");
	scanf("%d %d", &a, &b);

	for (c = 1; c <= a && c <= b; c++)
	{
		if (a % c == 0 && b % c == 0)
			d = c;
	}

	e = d*(a / d)*(b / d);

	printf("\n최대공약수는 %d 이고, 최소공배수는 %d 입니다.\n \n", d, e);

	return 0;
}