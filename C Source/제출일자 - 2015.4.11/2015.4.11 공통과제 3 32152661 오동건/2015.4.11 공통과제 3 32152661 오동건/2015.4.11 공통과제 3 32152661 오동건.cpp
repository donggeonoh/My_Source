#include <stdio.h>

void main()
{
	int a;
	int b;
	int c;

	printf("직삼각형 만들기 ( 2 이상 20 이하의 정수를 입력하세요 ) : ");
	scanf("%d", &a);

	for (b = a; b > 0; b--)
	{
		for (c = a; c >= b; c--)
		printf("♥");
		printf("\n");
	}
}