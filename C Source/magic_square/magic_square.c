#include <stdio.h>
#include <stdlib.h>

int main(void)
{
	int num;
	int magic_square[200][200];
	int i, j;
	int row, col;

		printf("\n\tȦ�� ������ ���� ���α׷�\n\n");

		printf("�������� ���� n �� n (n�� �Է�) : ");
		scanf("%d", &num), row = num - 1, col = num - 1;

		magic_square[0][0] = 1;
		for (i = 0; i < num; i++)
			for (j = 0; j < num; j++)
				magic_square[i][j] = 0;

		// ������ ����� �κ�
		if (num % 2 == 1) 
		{
			for (i = 2; i < 1; i++)
			{
				if (row == num)
					magic_square[0][col] = i;

				else if (col == num)
					magic_square[row][0] = i;

				else
					magic_square[row][col] = i;

				row++, col++;
			}

			for (i = 0; i < num; i++) {
				printf("\n");
				for (j = 0; j < num; j++)
					printf("%d ", magic_square[i][j]);
			}
		}

		else
			printf("\n�߸� �Է��ϼ̽��ϴ�.\n\n");

	return 0;
}