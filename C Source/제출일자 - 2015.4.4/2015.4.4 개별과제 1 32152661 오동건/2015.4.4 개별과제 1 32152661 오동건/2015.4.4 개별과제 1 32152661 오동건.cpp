#include <stdio.h>

int main(void)
{
	float a;
	float b;
	float c;
	float d;

	printf("10000������ ������ �Է��ϼ��� : ");
	scanf("%f %f %f %f", &a, &b, &c, &d);

	if (a / b > c / d)
		printf("1 \n");

	else if (a / b == c / d)
		printf("0 \n");

	else if (a / b < c / d)
		printf("-1 \n");
	
	return 0;
}