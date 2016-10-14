/*

//bubble sort

#include <stdio.h>

int main(void)
{
	int a[5];
	int i, j;
	int temp;

	for (i = 0; i < 5; i++)
	{
		printf("입력 : ");
		scanf("%d", &a[i]);
	}

	for (i = 0; i < 5; i++)
		for (j = 1; j < 5 - i; j++)
				if (a[j - 1] > a[j])
				{
					temp = a[j - 1]; // 중요부분
					a[j - 1] = a[j];
					a[j] = temp;
				}

	for (i = 0; i < 5; i++)
		printf("%d ", a[i]);

	return 0;
}

*/

/*

// 변수의 주소값

#include <stdio.h>

int main(void)
{
	
	int i = 10;

	char c = 69;

	float f = 12.3;

	printf("%d\n", &i);
	printf("%d\n", &c);
	printf("%d\n", &f);

	return 0;
}

*/

/*

// 포인터의 이해

#include <stdio.h>

int main(void)
{
	int i = 10;
	int *p;
	p = &i;
	
	printf("%d", *p);
}

*/

void swap(int *x,int *y)
{
	int temp;
	temp = *x;
	*x = *y;
	*y = temp;
}

#include <stdio.h>

int main(void)
{
	int x, y;

	x = 10;
	y = 20;

	swap(&x, &y);

	printf("%d", x, y);
	return 0;
}