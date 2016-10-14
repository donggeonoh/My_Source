#include <stdio.h>

void main()
{
	int a;
	int b;
	int c = 3;

	printf("파보나치 수열 (정수를 입력하세요) : ");
	scanf("%d", &a);

	for (b = 0; b <= a; b++)
	{
		c += (c - 1) + (c - 2) + b;
		printf("%d ", c);
	}
}