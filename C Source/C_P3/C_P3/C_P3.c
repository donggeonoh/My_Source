			/*-------------------------------------------
						컴퓨터 프로그래밍 수업
						 9월 25일 1시 ~ 4시
					   32152661 S/W학과 오동건
			---------------------------------------------*/

/*
#include <stdio.h>

int main(void)
{

	int x, y, result;

	printf("\n\t두 수의 사칙연산 계산기\n\n");

	printf("두 개의 정수를 입력하세요 : ");
	scanf("%d %d", &x, &y);

	result = x + y;
	printf("%d + %d = %d\n", x, y, result);

	result = x - y;
	printf("%d - %d = %d\n", x, y, result);

	result = x * y;
	printf("%d * %d = %d\n", x, y, result);

	result = x / y;
	printf("%d / %d = %d\n", x, y, result);

	result = x % y;
	printf("%d %% %d = %d\n", x, y, result);

	return 0;
}
*/

/*
//출력이 몇분 몇초입니다. ex) 100초를 입력하면 분 초로 출력되게 하시오
#include <stdio.h>

int main(void)
{

	int time;	// 입력하려는 초 의 변수 선언

	printf("\n\t초-> 분 초 환산기\n\n");

	printf("초 를 입력하세요 : ");
	scanf("%d", &time);	//초 입력

	printf("\n%d분 %d초 입니다.\n", time / 60, time % 60);	// 몫은 분, 나머지는 초 출력

	return 0;
}
*/

/*
#include <stdio.h>

int main(void)
{

	int x = 1, nextx = 0;

	nextx = ++x;
	printf("nextx = %d, x = %d\n", nextx, x);

	nextx = x++;
	printf("nextx = %d, x = %d\n", nextx, x);

	nextx = ++x;
	printf("nextx = %d, x = %d\n", nextx, x);

	nextx = x--;
	printf("nextx = %d, x = %d\n", nextx, x);

	x++;
	printf("x = %d\n", x);

	++x;
	printf("x = %d\n", x);

	return 0;
}
*/

/*
#include <stdio.h>

int main(void)
{

	int a = 99;

	printf(" AND 연산 : %d \n", (a >= 100) && (a <= 200));
	printf(" OR  연산 : %d \n", (a >= 100) || (a <= 200));
	printf(" NOT 연산 : %d \n", !(a == 100));

	return 0;
}
*/