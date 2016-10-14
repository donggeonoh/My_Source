#include <stdio.h>
#include <stdlib.h>

int main(void)
{
	int num;
	int **dynamic_array;	//동적할당
	int i, j;
	int row, col;	//입력한 num 값을 이용해 행렬 변수로 활용

	printf("\n\t홀수 마방진 생성 프로그램\n\n");

	printf("마방진을 만들 n × n (n값 입력) : ");
	scanf("%d", &num), row = num - 1, col = num / 2;

	dynamic_array = (int **)(malloc(sizeof(int) * num)); // 동적할당

	for (i = 0; i < num; i++)
		dynamic_array[i] = (int *)(malloc(sizeof(int) * num));

	//배열 초기화
	for (i = 0; i < num; i++)
		for (j = 0; j < num; j++)
			dynamic_array[i][j] = 0;

	dynamic_array[row][col] = 1;		//배열 값 넣기

	// 마방진 만드는 부분
	if (num % 2 == 1)
	{
		for (i = 2; i <= num * num ; i++)
		{
			row++, col++;

			if (row == num && col == num)
				row -= 2, col -= 1, dynamic_array[row][col] = i;

			else if (row == num)
				row = 0, dynamic_array[row][col] = i;

			else if (col == num)
				col = 0, dynamic_array[row][col] = i;

			else if (dynamic_array[row][col] != 0)
				row -= 2, col -= 1, dynamic_array[row][col] = i;

			else
				dynamic_array[row][col] = i;
		}

		for (i = 0; i < num; i++) {
			printf("\n\n");
			for (j = 0; j < num; j++)
				printf(" %-3d ", dynamic_array[i][j]);
		}
		printf("\n\n\n");
	}

	else
		printf("\n잘못 입력하셨습니다.\n\n");

	free(dynamic_array);	//메모리 반환

	return 0;
}