#include <stdio.h>

int main(void)
{
	int num;
	int binary_number[30];
	int i;

	//	-1�� �ʱ�ȭ
	for (i = 0; i < 30; i++)
		binary_number[i] = -1;

	printf("\n\t10���� -> 2���� ��ȯ ���α׷�\n\n");

	printf("������ �Է��ϼ��� : ");
	scanf("%d", &num);

	//	10���� -> 2���� ���
	for(i = 0; ; i++) {
		binary_number[i] = num % 2;	//�Է��� ������ ������ ���� �� �迭���� �ִ´�
		num /= 2;	//	�Է��� ������ 2�� �����ش�

		if (num == 0)	// 0�� �Ǹ� ���ѷ����� �����
			break;
	}

	//�ʱ�ȭ �� �� -1�� ������ ������ ���� �������� ���
	for (i = 29; i >= 0; i--) {
		if (binary_number[i] == -1)
			continue;
		else
			printf("%d ", binary_number[i]);
	}
	printf("�Դϴ�. \n\n");

	return 0;
}