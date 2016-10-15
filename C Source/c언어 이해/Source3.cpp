#include <stdio.h>

int main(void)
{
	int a;
	int b;

	printf("1000 이하의 자연수를 입력하여라 : ");
	scanf("%d", &a);
	
	for (b = 1; b <= a; b++)
	{
		if (a % b == 0)
		{
			printf("%d \n", b);
		}
	}
	
	return 0;
}