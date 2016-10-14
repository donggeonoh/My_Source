#include <stdio.h>

int main(void)
{
	int a;
	int b;
	int x = 0;

	printf("입력한 숫자의 ! 구하기 : ");
	scanf_s("%d", &a);

	for (b = a; b > 0; b--)
	{
		x *= b;
	}

	printf("%d", x);

	return 0;
}