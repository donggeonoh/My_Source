#include <stdio.h>

int main(void)
{
	int a;
	int b;
	int num1 = 0;

	for (b = 1; b <= 7; b++)
	{
		printf("7개의 자연수 중 홀수만 모두 더하여라 (7개 중 %d번째, 단 100 이하의 자연수) : ", b);
		scanf("%d", &a);

		if (a % 2 == 1)
			num1 += a;

	}

	printf("홀수의 값은 %d 입니다. ", num1);

	return 0;
}