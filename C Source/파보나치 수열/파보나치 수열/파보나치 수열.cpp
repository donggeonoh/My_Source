#include <stdio.h>

void main()
{
	int a;
	int b;
	int c = 3;

	printf("�ĺ���ġ ���� (������ �Է��ϼ���) : ");
	scanf("%d", &a);

	for (b = 0; b <= a; b++)
	{
		c += (c - 1) + (c - 2) + b;
		printf("%d ", c);
	}
}