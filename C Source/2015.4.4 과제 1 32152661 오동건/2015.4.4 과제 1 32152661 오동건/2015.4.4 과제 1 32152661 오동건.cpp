#include <stdio.h>

int main(void)
{
	int a;

	printf("1. ������ \n2. ȭ���� \n3. ������ \n4. ����� \n5. �ݿ��� \n6. ����� \n7. �Ͽ��� \n");
	scanf_s("%d", &a);
	if (a == 1 || a == 4)
	{
		printf("\n enjoy \n \n");
	}
	else
	{
		printf("\n oops \n \n");
	}
	return 0;
}