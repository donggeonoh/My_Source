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
		printf("사칙연산(정수, 사칙연산, 정수 입력) : ");
		scanf("%d %c %d", &a, &b, &c);

		asd(a, b, c);
	}