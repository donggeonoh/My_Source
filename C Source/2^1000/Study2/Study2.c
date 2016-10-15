#include <stdio.h>

int main(void)
{

	char num[302];
	int i, j, k;
	int sum = 0;

	num[0] = 1;

	printf("\n\t2의 1000제곱 값 구하기\n\n");

	for (i = 1; i < 302; i++)
		num[i] = 0;
	
	for (k = 0; k < 1000; k++)
	{
		for (i = 0; i < 302; i++)
			num[i] *= 2;

		for (j = 1; j < 302; j++)
			if (num[j - 1] >= 10)
			{
				num[j - 1] -= 10;
				num[j] += 1;
			}
	}

	for (i = 301; i >= 0; i--)
	{
		printf("%d", num[i]);
		sum += num[i];
	}

	printf("\n\n	합계 : %d\n", sum);

	return 0;
}