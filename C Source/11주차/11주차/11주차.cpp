/* 수업내용

버퍼 - cpu와 메모리 (HDD 등) 사이에 메모리에서 불러올 파일을 미리 저장해둬 cpu와 메모리의 속도
       차이를 보존해준다.

while문 이란?

while(조건문) 조건문 : ex) i < 10, 1 <- 이 것은 항상 참이다 {무한루프} 1은 for(;;)와 같은 의미)
{
	어떠한 값 입력
}

do-while 이란? - 최소 1번은 실행 된다는 것.

ex)

i = 0;

do  {
 statements;
 i++;
}  while (i<10);

continue; - 이 값을 입력하면 다시 반복문 위로 올라가는 것.

	for(;;) <------------
	{					|
		if()			|
		printf();		|
		continue; ------- 이프문이 맞으면 다시 for문 위로 올라간다.
		scanf();
	}

	- switch문은 char와 int 변수만 사용가능

	- goto 문 (TWO나 OTHER 같은 경우 레이블 이라고 한다)

	순차적으로 진행하다가 goto문을 이용해 특정한 지역으로 가는 것

	ex) goto문의 예

	printf();
	scanf();

	if(num == 1)
		goto TWO;
	else if(num == 2)
		goto OTHER;

	TWO: (<- 레이블)
		printf("입력");
		goto END;
	OTHER:
		printf("입력");
		goto END;

*/

//입력후 한 자씩 띄어지는 프로그램 (마지막 엔터까지 기록 -> 오류)

/*

#include <stdio.h>

int main(void)
{

	char ch;

	for (;;)
	{

		printf("Enter characters : ");
		ch = getchar();
		printf("\nYou typed: %c\n", ch);

	}

	return 0;

}

*/

// 입력시 바로 출력되는 프로그램

/*

#include <stdio.h>
#include <conio.h>

int main(void)
{

	char ch;

	for (;;)
	{

		printf("Enter characters : ");
		ch = getche();
		printf("\nYou typed: %c\n", ch);

	}

	return 0;

}

*/

/*

#include <stdio.h>
#include <conio.h>

int main(void)
{

	char ch; int a, b;

	for (;;)
	{

		printf("Add, Subtract, Multiply, Divide, or Quit?\n");
		printf("Enter the first Character : ");
		ch = getche();
		printf("\n");

		if (ch == 'Q' || ch == 'q')
		{
			printf("Bye. Have a Nice Day.\n");
			break;
		}

		printf("Enter the first integer : "); scanf("%d", &a);
		printf("Enter the second integer : "); scanf("%d", &b);

		if (ch == 'A' || ch == 'a')
			printf("The answer = %d\n\n", a + b);
		else if (ch == 'S' || ch == 's')
			printf("The answer = %d\n\n", a - b);
		else if (ch == 'M' || ch == 'm')
			printf("The answer = %d\n\n", a * b);
		else 
			printf("%c is not valid input in this program\n", ch);

	}

	return 0;

}

*/

/*

#include <stdio.h>

int main(void)
{

	int i = 1;
	int total = 0;

	while (i < 10)
	{
		total = total + i;
		i++;
	}

	printf("total = %d\n", total);

	return 0;
}

*/

/*

#include <conio.h>
#include <stdio.h>

int main(void)
{

	char ch;

	printf("Enter your message. \n");
	ch = getche();

	while (ch != '\r')
	{
		printf("%c\n", ch + 1);
		ch = getche();
	}

	return 0;

}

*/

/*

#include <stdio.h>

int main(void)
{

	int i = 1;
	int total = 0;

	do
	{
		total = total + i;
		i++;
	} while (i < 10);

	printf("total = %d\n", total);

	return 0;
}

*/

/*

#include <stdio.h>
#include <conio.h>

int main(void)
{

	char ch;

	do
	{
		ch = getche();
	} while (ch != 'q');

	return 0;
}

*/

/*

#include <stdio.h>

int main(void)
{

	int i, j;
	int num;

	for (i = 1; i <= 10; i++)
	{
		for (j = 1; j <= i; j++)
		{
			printf("* ");
		}
		printf("\n");
	}

	return 0;
}

*/

//이중 포문을 이용한 구구단 구하기

/*

#include <stdio.h>

int main(void)
{

	int i, j;

	for (i = 1; i < 10; i++)
	{
		printf("\n");
		for (j = 1; j < 10; j++)
			printf("%d * %d = %d\n", i, j, i*j);
	}
	
	return 0;
}

*/

// 삼중포문 이해

/*

#include <stdio.h>

int main(void)
{
	int num;
	int i, j, n;

	for (i = 1; i <= 5; i++)
	{
		for (j = i; j <= 5; j++)
		{
			printf(" "); 
		}
		for (n = 1; n < 2 * i; n++)
		{
			printf("*");
		}
		printf("\n");
	}

	return 0;
}

*/

//팩토리얼 구하기

/*

#include <stdio.h>

int main(void)
{
	
	int a;
	int i;
	int total = 1;
	printf("값을 입력하세요 : ");
	scanf("%d", &a);

	for (i = 1; i <= a; i++)
		total *= i;

	printf("팩토리얼 값은 %d 입니다. \n", total);

	return 0;
}

*/