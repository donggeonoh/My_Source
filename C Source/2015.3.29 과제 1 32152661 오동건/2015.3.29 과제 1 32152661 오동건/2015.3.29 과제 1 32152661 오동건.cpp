#include <stdio.h>

int main(void)
{
	int a;

	printf("1. 월요일 \n2. 화요일 \n3. 수요일 \n4. 목요일 \n5. 금요일 \n6. 토요일 \n7. 일요일 \n");
	scanf_s("%d", &a);
	if (a == 1, 4)
	{
		printf("enjoy \n");
	}
	else
	{
		printf("oops \n \n");
	}
	return 0;
}