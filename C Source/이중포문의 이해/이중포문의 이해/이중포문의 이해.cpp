#include <stdio.h>

void main()
{
	int a;
	int b, c;
	printf("�����Է� : ");
	scanf("%d", &a);

	for (b = 0; b < a; b++)
	{
		printf("\n");

		for (c = 0; c < a; c++)
			printf("��");
	}
}