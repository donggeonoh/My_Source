#include <stdio.h>

int main(void)
{
	int i;
	int num;
	int k;

	printf("몇번 for문을 실핼하겠습니까?");
	scanf("%d", &i);

	for (k = 0; k < i; k++)
	{
		scanf("%d", &num);

		if (num % 2 == 0)
			printf("짝수입니다. \n");
		else if (num % 2 == 1)
			printf("홀수입니다. \n");
	}
	return 0;
}