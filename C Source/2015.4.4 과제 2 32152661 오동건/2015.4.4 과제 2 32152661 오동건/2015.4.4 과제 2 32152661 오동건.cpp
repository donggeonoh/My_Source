#include <stdio.h>

int main(void)
{
	int a;
	int b;
	int c = 0;

	printf("두 수의 자연수를 입력하여라 (단, 100 이하의 자연수를 입력하여라)");
	scanf_s("%d %d", &a, &b);

	for (c = 0; c <= b - a; c++)
	{
		printf("%d ", c + a);
	}

	if (a > b)
	{
		for (c = 0; c <= a - b; c++)
		{
			printf("%d ", c + b);
		}
	}

	return 0;
}