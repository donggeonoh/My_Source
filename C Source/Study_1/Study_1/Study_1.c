#include <stdio.h>

int main(void)
{
	char num[1000];
	int i, j;

	num[0] = 1;

	printf("\n\t2의 1000 제곱 구하기\n\n");

	for (i = 0; i < 10; i++)
	{
		num[0] *= 2;
		for (j = 1; j < 10; i++)
		{
			if (num[j - 1] >= 10)
			{
				num[j - 1] = num[j - 1] - 10;
				num[j] = num[j] + 1;
			}
		}
	}

	for (i = 0; i < 10; i++)
		printf("%s ", num[i]);

	return 0;
}