#include <stdio.h>

int main(void)
{
	int num;
	int i, j, k;

	printf("¸îÃşÅ¾? :    Ãş!\b\b\b\b\b\b");
	scanf("%d", &num);

	for (i = 0; i < num; i++)
	{
		for (j = num - i; j > 0; j--)
			printf("¡¡");

		for (k = num - (2 * i); k <= num; k++)
			printf("¡á");

		printf("\n");
	}

	return 0;
}
