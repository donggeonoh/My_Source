#include <stdio.h>

int main(void)
{
	int a;
	int b;
	int c = 0;
	printf("�Է��� ���� �Ҽ����� �ƴ��� �Ǻ��� ���ڽ��ϴ� : ");
	scanf("%d", &a);

	for (b = 2; b <= a; b++)
	{
		if (a % b == 0)
			c += b;
	}
	if (c == a)
		printf("�Ҽ��Դϴ�. \n");
	else
		printf("�Ҽ��� �ƴմϴ�. \n");

	return 0;
}