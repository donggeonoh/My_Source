#include <stdio.h>
#include <stdlib.h>

int main(void)
{
	int num;
	int magic_square[300][300];
	int i, j;
	int row, col;	//입력한 num 값을 이용해 행렬 변수로 활용

	printf("\n\t홀수 마방진 생성 프로그램\n\n");

	printf("마방진을 만들 n × n (n값 입력) : ");
	scanf("%d", &num), row = num - 1, col = num / 2;

	//배열 초기화
	for (i = 0; i < num; i++)
		for (j = 0; j < num; j++)
			magic_square[i][j] = 0;

	magic_square[row][col] = 1;		//1 배열 값 넣기

	// 마방진 만드는 부분
	if (num % 2 == 1)
	{
		for (i = 2; i < num * num + 1; i++)
		{
			row++, col++;

			if (row == num && col == num)
				row -= 2, col -= 1, magic_square[row][col] = i;

			else if (row == num)
				row = 0, magic_square[row][col] = i;

			else if (col == num)
				col = 0, magic_square[row][col] = i;

			else if (magic_square[row][col] != 0)
				row -= 2, col -= 1, magic_square[row][col] = i;

			else
				magic_square[row][col] = i;
		}

		for (i = 0; i < num; i++) {
			printf("\n");
			for (j = 0; j < num; j++)
				printf("% d ", magic_square[i][j]);
		}
	}

	else
		printf("\n잘못 입력하셨습니다.\n\n");

	return 0;
}