#include <stdio.h>

void leap(int a)
{
	if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
		printf("Yes \n");

	else
		printf("no \n");
}

int main(void)
{
	int a;

	printf("3000 이하의 자연수를 입력하세요 (윤년 유무) : ");
	scanf("%d", &a);

	leap(a);

	return 0;
}