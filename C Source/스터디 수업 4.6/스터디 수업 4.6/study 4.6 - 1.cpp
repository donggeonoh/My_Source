#include <stdio.h>

	//char의 정의
	
	/*
	char a = 'a';

	printf("%d \n", a);
	printf("%c \n", a);
	
	return 0;
	*/

	// 이중포문

	/*
	int a, b;
	for (a = 0; a < 10; a++)
	{
		for (b = 0; b < 10; b++)
		printf("*");
		printf("\n");
	}

	return 0;
	*/

	//함수의 정의

	/*
	_(반환타입 {출력값 인 것 같다}) _(함수의 이름) ()(값을 입력받는 애)
	ex) int main(void)
	

	void star(int s)
	{
		int i;

		for (i = 0; i < s; i++)
		{
			printf("*");
		}
	}
	
	int main(void)
	{
		int s;

		printf("승기가 본 별의 갯수를 출력하시오 : ");
		scanf("%d", &s);

		star(s);
	}

	*/
/* void asd(int a, char b, int c)
{
	if (b == '+')
		printf("%d", a + c);
	else if (b == '-')
		printf("%d", a - c);
	else if (b == '*')
		printf("%d", a * c);
	else if (b == '/')
		printf("%d", a / c);
	else if (b == '%')
		printf("%d", a % c);
}

*/

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
void main()
{
	int a;
	char b;
	int c;
	printf("사칙연산(정수, 사칙연상, 정수 입력) : ");
	scanf("%d %c %d", &a, &b, &c);

	asd(a, b, c);

	return 0;
}