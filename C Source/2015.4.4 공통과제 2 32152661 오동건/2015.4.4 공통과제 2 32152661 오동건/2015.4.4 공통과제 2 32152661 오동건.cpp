#include <stdio.h>

int main(void)
{
	int a;
	int b;
	int c;
	int d = 0;
	int e = 0;

	printf("1000������ ���� 2���� �Է����ּ��� : ");
	scanf("%d %d", &a, &b);

	for (c = 1; c <= a && c <= b; c++)
	{
		if (a % c == 0 && b % c == 0)
			d = c;
	}

	e = d*(a / d)*(b / d);

	printf("\n�ִ������� %d �̰�, �ּҰ������ %d �Դϴ�.\n \n", d, e);

	return 0;
}