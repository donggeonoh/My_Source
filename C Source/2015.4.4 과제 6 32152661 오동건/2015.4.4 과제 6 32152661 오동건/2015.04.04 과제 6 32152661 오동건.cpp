#include <stdio.h>

int main(void)
{
	int a;
	int b;
	int c = 0;
	printf("입력한 값이 소수인지 아닌지 판별해 보겠습니다 : ");
	scanf("%d", &a);

	for (b = 2; b <= a; b++)
	{
		if (a % b == 0)
			c += b;
	}
	if (c == a)
		printf("소수입니다. \n");
	else
		printf("소수가 아닙니다. \n");

	return 0;
}