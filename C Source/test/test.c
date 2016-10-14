/*#include <stdio.h>

int main()
{

	int a[5][2];
	int row, col;
	int sum = 0;	// a 변수에 1~10까지 넣어주는 변수

	for (col = 0; col < 2; col++)
		for (row = 0; row < 5; row++)
		{
			sum += 1;
			a[row][col] = sum; // a[row][col] = 5*row + col +1; 이 변수를 하나 줄일 수 있다.
		}

	for (col = 0; col < 2; col++)
	{
		for (row = 0; row < 5; row++)
			printf("%d ", a[row][col]);
		printf("\n");
	}

	return 0;
}
*/

/*
#include <stdio.h>

int main()
{

	int a[2][2], b[2][2], result[2][2];
	int row, col;

	for (col = 0; col < 2; col++)
		for (row = 0; row < 2; row++)
		{
			a[row][col] = 2 * row + col + 1;
			b[row][col] = 2 * row + col + 1;
		}

	for (col = 0; col < 2; col++)
		for (row = 0; row < 2; row++)
		{
			result[row][col] = a[row][col] + b[row][col];
		}

	printf("행렬의 값 \n");

	for (col = 0; col < 2; col++)
	{
		for (row = 0; row < 2; row++)
			printf("%d ", result[row][col]);

		printf("\n");
	}

	return 0;
}
*/

// 주석처리 방법 shift + k + c, 지우는 방법 shift + k + u

#include <stdio.h>

int main()
{



	return 0;
}