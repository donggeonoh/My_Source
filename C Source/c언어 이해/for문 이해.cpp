#include <stdio.h>

int main(void)
{
	int i;
	int num;
	int k;

	printf("��� for���� �����ϰڽ��ϱ�?");
	scanf("%d", &i);

	for (k = 0; k < i; k++)
	{
		scanf("%d", &num);

		if (num % 2 == 0)
			printf("¦���Դϴ�. \n");
		else if (num % 2 == 1)
			printf("Ȧ���Դϴ�. \n");
	}
	return 0;
}