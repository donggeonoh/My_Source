#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void)
{
	int lotto[7];
	int compare, temp;
	int i, j;

	srand(time(NULL));

	printf("\n\t로또 숫자 뽑기 프로그램\n\n");

	//	로또 뽑기, 중복 숫자 판별
	for (i = 0; i < 7; i++)
	{
		once_more:	//	중복되면 다시 이 문장으로 되돌아오기
		compare = (rand() % 46) + 1;	//	숫자 뽑기

		//숫자 중복 판별
		for (j = 0; j < 7; j++)
			if (compare == lotto[j])
				goto once_more;

		lotto[i] = compare;
	}

	//	버블 소트
	for (i = 0; i < 7; i++)
		for (j = 0; j < 7; j++)
			if (lotto[i] < lotto[j]) {
				temp = lotto[j];
				lotto[j] = lotto[i];
				lotto[i] = temp;
			}

	//	출력
	for (i = 0; i < 7; i++)
			printf("%d 번째 숫자 : %d\n", i + 1, lotto[i]);

	return 0;
}