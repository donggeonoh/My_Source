#include <stdio.h>

void asd(int a, char b, int c)
{
	switch (b)
	{
	case '+':
		printf("%d", a + c);
	case '-':
		printf("%d", a - c);
	case '*':
		printf("%d", a * c);
	case '/':
		printf("%d", a / c);
	}
}

	void main()
	{
		int a;
		char b;
		int c;
		printf("��Ģ����(����, ��Ģ����, ���� �Է�) : ");
		scanf("%d %c %d", &a, &b, &c);

		asd(a, b, c);
	}