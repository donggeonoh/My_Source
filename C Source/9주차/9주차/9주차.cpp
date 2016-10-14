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

//메인함수 뒤에 함수를 작성하려면 앞에 프로토타입 ex) void add() 을 적어준다.

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
	

	printf("3개의 값을 입력하세요 : ");
	scanf_s("%d %d %d", &a, &b, &c);

	double d = adv(a, b, c);

	printf("%f", d);
}