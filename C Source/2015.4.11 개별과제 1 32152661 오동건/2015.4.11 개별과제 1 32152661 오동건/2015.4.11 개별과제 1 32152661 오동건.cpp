#include <stdio.h>

int business(int a, int b, int c, int d)
{
	//�մ��� �� �ݾ� = ���� + �Ž����� = e

	// ��¥ �� : b + d - c 

	int e = -(b + d - c - a - d);

		return e;
}
int main(void)
{
	int a, b, c, d;

	printf("����, �ǸŰ�, ������ ��¥ ��, �Ž����� ������ �Է��ϼ��� : ");
	scanf("%d %d %d %d", &a, &b, &c, &d);

	business(a, b, c, d);

	int result = business(a, b, c, d);

	printf("%d \n", result);
	
}