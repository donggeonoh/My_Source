#include <stdio.h>

int main(void)
{
	int a, b;
	int num1 = 0;
	int num2 = 0;
	int num3 = 0;

	for (b = 0; b < 7; b++)
	{
		printf("정수 값을 입력해주세요 (단, 1000 미만의 정수를 입력하세요.) : ");
		scanf("%d", &a);

		if (0 < a&&a < 10)
			num1 += a;

		if (10 <= a&&a < 100)
			num2 += a;

		if (100 <= a&&a < 1000)
			num3 += a;
	}

	printf("%d %d %d", num1, num2, num3);

	return 0;
}