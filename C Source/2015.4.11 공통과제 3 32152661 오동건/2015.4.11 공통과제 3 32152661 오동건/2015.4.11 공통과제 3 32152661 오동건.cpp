#include <stdio.h>

void main()
{
	int a;
	int b;
	int c;

	printf("���ﰢ�� ����� ( 2 �̻� 20 ������ ������ �Է��ϼ��� ) : ");
	scanf("%d", &a);

	for (b = a; b > 0; b--)
	{
		for (c = a; c >= b; c--)
		printf("��");
		printf("\n");
	}
}