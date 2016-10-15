#include <stdio.h>

int main(void)
{
	int a;
	int b;
	int c;
	int num1 = 0;

	printf("원하는 만큼 for문을 돌릴 횟수를 정하세요 : ");
	scanf("%d", &a);

	for (b = 0; b < a; b++)
	{
		pirntf("양수만 입력하세요");
		scanf("%d", &c);

		num1 += c;
	}
	printf("%d", &num1);

	return 0;
}