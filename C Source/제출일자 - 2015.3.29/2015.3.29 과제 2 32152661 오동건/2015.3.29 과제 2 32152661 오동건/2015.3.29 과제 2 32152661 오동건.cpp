#include <stdio.h>

int main(void)
{
	int a;
	int b;
	int c = 0;

	printf("�� ���� �ڿ����� �Է��Ͽ��� (��, 100 ������ �ڿ����� �Է��Ͽ���)");
	scanf_s("%d %d", &a, &b);

	for (c = 0; c <= b - a; c++)
	{
		printf("%d ", c + a);
	}

	return 0;
}