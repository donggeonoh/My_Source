#include <stdio.h>
/*

int main()
{
	int i;
	i = 49;
	printf("%d %c\n", i, i);
	printf("%c %d\n", 'A', 'A');
	printf("%c %d\n", 65, 65);
	printf("%c %d\n", 0x41, 0x41);
	printf("%c %d\n", '\x41', '\x41');
	printf("1234%c567\n", '\t');
	printf("1234%c567\n", 9);
	printf("1234%c567\n", '9');

	if ('\b' == '7')
		printf("Same\n");
	else
		printf("Different\n");

	for (i = 0; i <= 127; i++)
		printf("%d-th ASCII code = %c \n", i, i);

}

*/

//�����Լ� �ڿ� �Լ��� �ۼ��Ϸ��� �տ� ������Ÿ�� ex) void add() �� �����ش�.

int adv(int a, int b, int c)
{
	double d = (a + b + c) / 3;

	return d;
}

void main()
{
	int a;
	int b;
	int c;
	

	printf("3���� ���� �Է��ϼ��� : ");
	scanf_s("%d %d %d", &a, &b, &c);

	double d = adv(a, b, c);

	printf("%f", d);
}