//지난번 수업 복습

/*
#include <stdio.h>

int asd(int, int);

void main()
{
	int a, b;

	printf("두개의 정수를 입력하세요 : ");
	scanf("%d %d", &a, &b);

	int c = asd(a, b);

	printf("%d \n", c);
}

int asd(int a, int b)
{
	return a * b;
}

//짝수 홀수 구분 프로그램

#include <stdio.h>

void main()
{

	int a;

	printf("정수를 입력하세요 : ");
	scanf("%d", &a);

	if (a & 2 == 0)
		printf("짝수입니다.\n");
	else if (a & 2 == 1)
		printf("홀수입니다.\n");
	else
		printf("음수 값이거나 소수 값 입니다.\n");

}

//나누기 계산기

#include <stdio.h>

int main(void)
{
	int num1, num2;

	printf("정수 값을 입력하세요 : ");
	scanf("%d", &num1);

	printf("정수 값을 입력하세요 : ");
	scanf("%d", &num2);

	if (num2 == 0)
		printf("분모가 0입니다. \n");
	else
		printf("값은 %f 입니다. \n", (double)num1 / num2);

	return 0;
}

#include <stdio.h>

int main(void)
{

	int a, b;

	printf("정수를 입력하세요 : ");
	scanf("%d %d", &a, &b);

	if (b > a)
		printf("%d - %d = %d입니다.\n", b, a, b - a);
	else
		printf("%d - %d = %d입니다.\n", a, b, a - b);

	return 0;
}

#include <stdio.h>

int main(void)
{

	int i;
	
	for (i = 1; i <= 100; i++)
		printf("%d ", i);

	return 0;
}

#include <stdio.h>

int main(void)
{

	int a;
	int i;
	int total = 0;

	printf("정수 값을 입력하세요 : ");
	scanf("%d", &a);

	for (i = 1; i <= a; i++)
		total += i;

		printf("1부터 %d 까지 더한 수는 %d 입니다. \n", a, total);

	return 0;
}

#include <stdio.h>
#include <stdlib.h>

int main(void)
{
	int i, num;

	for (i = 1; i <= 6; i++)
	{
		num = rand();
		num = num % 46;
		printf("%d-th number = %d \n", i, num);
	}

	return 0;
}

*/

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
	int i, answer_num, guess_num;
	srand(time(NULL));
	answer_num = rand() % 500;

	for (i = 1; i <= 10; i++)
	{
		printf("500 이하의 정수를 맞춰보세요. %d번째 : ", i);
		scanf("%d", &guess_num);

		if (answer_num < guess_num)
		{
			if (i == 10)
				printf("실패하였습니다.\n");
			else
				printf("값이 큽니다. \n");
		}

		else if (answer_num > guess_num)
		{
			if (i == 10)
				printf("실패하였습니다.\n");
			else
				printf("값이 작습니다. \n");
		}

		else if (answer_num == guess_num)
		{
			printf("%d번쨰로 맞췄습니다! \n", i);
			break;
		}

	}
			
	return 0;
}