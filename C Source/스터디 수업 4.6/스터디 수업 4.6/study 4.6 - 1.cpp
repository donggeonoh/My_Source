#include <stdio.h>

	//char�� ����
	
	/*
	char a = 'a';

	printf("%d \n", a);
	printf("%c \n", a);
	
	return 0;
	*/

	// ��������

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

	//�Լ��� ����

	/*
	_(��ȯŸ�� {��°� �� �� ����}) _(�Լ��� �̸�) ()(���� �Է¹޴� ��)
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

		printf("�±Ⱑ �� ���� ������ ����Ͻÿ� : ");
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
	printf("��Ģ����(����, ��Ģ����, ���� �Է�) : ");
	scanf("%d %c %d", &a, &b, &c);

	asd(a, b, c);

	return 0;
}