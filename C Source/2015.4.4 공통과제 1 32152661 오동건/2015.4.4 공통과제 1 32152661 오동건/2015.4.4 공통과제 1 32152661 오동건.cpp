#include <stdio.h>

int main(void)
{
	int a;
	int b;
	int c = 0;

	for (b = 1; b <= 7; b++)
	{
		printf("��Ȯ�� �ٱ����� ������ �Է��ϼ��� (%d��° ���) : ", b);
		scanf("%d", &a);

		if (a > c)
			c = b;

	}

	printf("%d", c);

	return 0;
}