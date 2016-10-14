#include <stdio.h>

int business(int a, int b, int c, int d)
{
	//손님이 준 금액 = 정가 + 거스름돈 = e

	// 진짜 돈 : b + d - c 

	int e = -(b + d - c - a - d);

		return e;
}
int main(void)
{
	int a, b, c, d;

	printf("원가, 판매가, 지불한 가짜 돈, 거스름돈 순으로 입력하세요 : ");
	scanf("%d %d %d %d", &a, &b, &c, &d);

	business(a, b, c, d);

	int result = business(a, b, c, d);

	printf("%d \n", result);
	
}