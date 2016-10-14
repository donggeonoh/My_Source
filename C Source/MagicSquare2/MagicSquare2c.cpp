#include <stdio.h>
#include <stdlib.h>

int main(void)
{
	int num;
	int **dynamic_array;	//�����Ҵ�
	int i, j;
	int row, col;	//�Է��� num ���� �̿��� ��� ������ Ȱ��

	printf("\n\tȦ�� ������ ���� ���α׷�\n\n");

	printf("�������� ���� n �� n (n�� �Է�) : ");
	scanf("%d", &num), row = num - 1, col = num / 2;

	dynamic_array = (int **)(malloc(sizeof(int) * num)); // �����Ҵ�

	for (i = 0; i < num; i++)
		dynamic_array[i] = (int *)(malloc(sizeof(int) * num));

	//�迭 �ʱ�ȭ
	for (i = 0; i < num; i++)
		for (j = 0; j < num; j++)
			dynamic_array[i][j] = 0;

	dynamic_array[row][col] = 1;		//�迭 �� �ֱ�

	// ������ ����� �κ�
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
		printf("\n�߸� �Է��ϼ̽��ϴ�.\n\n");

	free(dynamic_array);	//�޸� ��ȯ

	return 0;
}