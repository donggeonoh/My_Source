#include <stdio.h>

int main(void)
{
	int a;
	int b;
	int c = 0;

	for (b = 1; b <= 7; b++)
	{
		printf("수확한 바구니의 갯수를 입력하세요 (%d번째 농부) : ", b);
		scanf("%d", &a);

		if (a > c)
			c = b;

	}

	printf("%d", c);

	return 0;
}