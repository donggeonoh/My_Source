#include <stdio.h>
#include <stdlib.h>

int main(void)
{
	int num;
	int magic_square[300][300];
	int i, j;
	int row, col;	//�Է��� num ���� �̿��� ��� ������ Ȱ��

	printf("\n\tȦ�� ������ ���� ���α׷�\n\n");

	printf("�������� ���� n �� n (n�� �Է�) : ");
	scanf("%d", &num), row = num - 1, col = num / 2;

	//�迭 �ʱ�ȭ
	for (i = 0; i < num; i++)
		for (j = 0; j < num; j++)
			magic_square[i][j] = 0;

	magic_square[row][col] = 1;		//1 �迭 �� �ֱ�

	// ������ ����� �κ�
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
		printf("\n�߸� �Է��ϼ̽��ϴ�.\n\n");

	return 0;
}