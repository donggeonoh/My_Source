//������ ���� ����

/*
#include <stdio.h>

int asd(int, int);

void main()
{
	int a, b;

	printf("�ΰ��� ������ �Է��ϼ��� : ");
	scanf("%d %d", &a, &b);

	int c = asd(a, b);

	printf("%d \n", c);
}

int asd(int a, int b)
{
	return a * b;
}

//¦�� Ȧ�� ���� ���α׷�

#include <stdio.h>

void main()
{

	int a;

	printf("������ �Է��ϼ��� : ");
	scanf("%d", &a);

	if (a & 2 == 0)
		printf("¦���Դϴ�.\n");
	else if (a & 2 == 1)
		printf("Ȧ���Դϴ�.\n");
	else
		printf("���� ���̰ų� �Ҽ� �� �Դϴ�.\n");

}

//������ ����

#include <stdio.h>

int main(void)
{
	int num1, num2;

	printf("���� ���� �Է��ϼ��� : ");
	scanf("%d", &num1);

	printf("���� ���� �Է��ϼ��� : ");
	scanf("%d", &num2);

	if (num2 == 0)
		printf("�и� 0�Դϴ�. \n");
	else
		printf("���� %f �Դϴ�. \n", (double)num1 / num2);

	return 0;
}

#include <stdio.h>

int main(void)
{

	int a, b;

	printf("������ �Է��ϼ��� : ");
	scanf("%d %d", &a, &b);

	if (b > a)
		printf("%d - %d = %d�Դϴ�.\n", b, a, b - a);
	else
		printf("%d - %d = %d�Դϴ�.\n", a, b, a - b);

	return 0;
}

#include <stdio.h>

int main(void)
{

	int i;
	
	for (i = 1; i <= 100; i++)
		printf("%d ", i);

	return 0;
}

#include <stdio.h>

int main(void)
{

	int a;
	int i;
	int total = 0;

	printf("���� ���� �Է��ϼ��� : ");
	scanf("%d", &a);

	for (i = 1; i <= a; i++)
		total += i;

		printf("1���� %d ���� ���� ���� %d �Դϴ�. \n", a, total);

	return 0;
}

#include <stdio.h>
#include <stdlib.h>

int main(void)
{
	int i, num;

	for (i = 1; i <= 6; i++)
	{
		num = rand();
		num = num % 46;
		printf("%d-th number = %d \n", i, num);
	}

	return 0;
}

*/

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
	int i, answer_num, guess_num;
	srand(time(NULL));
	answer_num = rand() % 500;

	for (i = 1; i <= 10; i++)
	{
		printf("500 ������ ������ ���纸����. %d��° : ", i);
		scanf("%d", &guess_num);

		if (answer_num < guess_num)
		{
			if (i == 10)
				printf("�����Ͽ����ϴ�.\n");
			else
				printf("���� Ů�ϴ�. \n");
		}

		else if (answer_num > guess_num)
		{
			if (i == 10)
				printf("�����Ͽ����ϴ�.\n");
			else
				printf("���� �۽��ϴ�. \n");
		}

		else if (answer_num == guess_num)
		{
			printf("%d������ ������ϴ�! \n", i);
			break;
		}

	}
			
	return 0;
}