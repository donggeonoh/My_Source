#include <stdio.h>

int main(void)
{
	int a;
	int b;
	int c;
	int num1 = 0;

	printf("���ϴ� ��ŭ for���� ���� Ƚ���� ���ϼ��� : ");
	scanf("%d", &a);

	for (b = 0; b < a; b++)
	{
		pirntf("����� �Է��ϼ���");
		scanf("%d", &c);

		num1 += c;
	}
	printf("%d", &num1);

	return 0;
}