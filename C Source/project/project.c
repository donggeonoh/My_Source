#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void)
{
	int lotto[7];
	int compare, temp;
	int i, j;

	srand(time(NULL));

	printf("\n\t�ζ� ���� �̱� ���α׷�\n\n");

	//	�ζ� �̱�, �ߺ� ���� �Ǻ�
	for (i = 0; i < 7; i++)
	{
		once_more:	//	�ߺ��Ǹ� �ٽ� �� �������� �ǵ��ƿ���
		compare = (rand() % 46) + 1;	//	���� �̱�

		//���� �ߺ� �Ǻ�
		for (j = 0; j < 7; j++)
			if (compare == lotto[j])
				goto once_more;

		lotto[i] = compare;
	}

	//	���� ��Ʈ
	for (i = 0; i < 7; i++)
		for (j = 0; j < 7; j++)
			if (lotto[i] < lotto[j]) {
				temp = lotto[j];
				lotto[j] = lotto[i];
				lotto[i] = temp;
			}

	//	���
	for (i = 0; i < 7; i++)
			printf("%d ��° ���� : %d\n", i + 1, lotto[i]);

	return 0;
}