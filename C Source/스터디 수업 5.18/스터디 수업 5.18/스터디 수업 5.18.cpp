/*

#include <stdio.h>

int main(void)
{
	int x, y, z;
	int temp = 0;

	printf("값을 입력하세요 (x의 값) : ");
	scanf("%d", &x);

	printf("값을 입력하세요 (y의 값) : ");
	scanf("%d", &y);

	printf("값을 입력하세요 (z의 값) : ");
	scanf("%d", &z);

	if (x < y)
	{
		temp = y;
		x = y;
		y = temp;
	}

	if (y < z)
	{
		temp = z;
		y = z;
		z = temp;
	}

	if (x < y)
	{
		temp = y;
		x = y;
		y = temp;
	}

	printf("%d %d %d", x, y, z);

	return 0;
}

*/

/*

int test(int x[], int n)
{
	int i;
	int result;

	for (i = 0; i < n; i++)
	{
		if (x[i] != x[n - i - 1])
		{
			result = 0;
			break;
		}
		result = 1;
	}

	return result;
}

#include <stdio.h>

int main(void)
{
	int x[7];
	int i;
	int result;

	for (i = 0; i < 7; i++)
	{
		printf("값을 입력해주세요 : ");
		scanf("%d", &x[i]);
	}

	result = test(x, 7);

	printf("%d \n", result);

	return 0;
}

*/

/*

#include <stdio.h>

void test(int x)
{
	x = 5;
}

int main(void)
{
	int x = 10;

	printf("함수 들어가기 전 x의 값 : %d", x);
	test(x);
	printf("함수 들어간 후 x의 값 : %d", x);


	return 0;
}

*/

#include <stdio.h>

void test(int x[], int n)
{
	int i;
	int result = 0;
	for (i = 0; i < n; i++)
		x[i] = 0;
}

int main(void)
{
	int x[3];
	int i;

	for (i = 0; i < 3; i++)
	{
		printf("값을 입력하세요 : ");
		scanf("%d", &x[i]);
	}

	test(x, 3);

	for (i = 0; i < 3; i++)
		printf("%d", x[i]);
}