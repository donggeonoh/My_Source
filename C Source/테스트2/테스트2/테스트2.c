#include <stdio.h>

void print_array(int a[]);

int main()
{
	int a[10];
	print_array(a);
	return 0;
}
void print_array(int a[])
{
	int i;
	printf("정수 10개를 입력하시오 \n");

	for (i = 0; i<10; i++)
		scanf("%d", &a[i]);

	for (i = 0; i<10; i++)
		printf("\n%d\n", a[i]);
}