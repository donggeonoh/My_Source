/* ��������

���� - cpu�� �޸� (HDD ��) ���̿� �޸𸮿��� �ҷ��� ������ �̸� �����ص� cpu�� �޸��� �ӵ�
       ���̸� �������ش�.

while�� �̶�?

while(���ǹ�) ���ǹ� : ex) i < 10, 1 <- �� ���� �׻� ���̴� {���ѷ���} 1�� for(;;)�� ���� �ǹ�)
{
	��� �� �Է�
}

do-while �̶�? - �ּ� 1���� ���� �ȴٴ� ��.

ex)

i = 0;

do  {
 statements;
 i++;
}  while (i<10);

continue; - �� ���� �Է��ϸ� �ٽ� �ݺ��� ���� �ö󰡴� ��.

	for(;;) <------------
	{					|
		if()			|
		printf();		|
		continue; ------- �������� ������ �ٽ� for�� ���� �ö󰣴�.
		scanf();
	}

	- switch���� char�� int ������ ��밡��

	- goto �� (TWO�� OTHER ���� ��� ���̺� �̶�� �Ѵ�)

	���������� �����ϴٰ� goto���� �̿��� Ư���� �������� ���� ��

	ex) goto���� ��

	printf();
	scanf();

	if(num == 1)
		goto TWO;
	else if(num == 2)
		goto OTHER;

	TWO: (<- ���̺�)
		printf("�Է�");
		goto END;
	OTHER:
		printf("�Է�");
		goto END;

*/

//�Է��� �� �ھ� ������� ���α׷� (������ ���ͱ��� ��� -> ����)

/*

#include <stdio.h>

int main(void)
{

	char ch;

	for (;;)
	{

		printf("Enter characters : ");
		ch = getchar();
		printf("\nYou typed: %c\n", ch);

	}

	return 0;

}

*/

// �Է½� �ٷ� ��µǴ� ���α׷�

/*

#include <stdio.h>
#include <conio.h>

int main(void)
{

	char ch;

	for (;;)
	{

		printf("Enter characters : ");
		ch = getche();
		printf("\nYou typed: %c\n", ch);

	}

	return 0;

}

*/

/*

#include <stdio.h>
#include <conio.h>

int main(void)
{

	char ch; int a, b;

	for (;;)
	{

		printf("Add, Subtract, Multiply, Divide, or Quit?\n");
		printf("Enter the first Character : ");
		ch = getche();
		printf("\n");

		if (ch == 'Q' || ch == 'q')
		{
			printf("Bye. Have a Nice Day.\n");
			break;
		}

		printf("Enter the first integer : "); scanf("%d", &a);
		printf("Enter the second integer : "); scanf("%d", &b);

		if (ch == 'A' || ch == 'a')
			printf("The answer = %d\n\n", a + b);
		else if (ch == 'S' || ch == 's')
			printf("The answer = %d\n\n", a - b);
		else if (ch == 'M' || ch == 'm')
			printf("The answer = %d\n\n", a * b);
		else 
			printf("%c is not valid input in this program\n", ch);

	}

	return 0;

}

*/

/*

#include <stdio.h>

int main(void)
{

	int i = 1;
	int total = 0;

	while (i < 10)
	{
		total = total + i;
		i++;
	}

	printf("total = %d\n", total);

	return 0;
}

*/

/*

#include <conio.h>
#include <stdio.h>

int main(void)
{

	char ch;

	printf("Enter your message. \n");
	ch = getche();

	while (ch != '\r')
	{
		printf("%c\n", ch + 1);
		ch = getche();
	}

	return 0;

}

*/

/*

#include <stdio.h>

int main(void)
{

	int i = 1;
	int total = 0;

	do
	{
		total = total + i;
		i++;
	} while (i < 10);

	printf("total = %d\n", total);

	return 0;
}

*/

/*

#include <stdio.h>
#include <conio.h>

int main(void)
{

	char ch;

	do
	{
		ch = getche();
	} while (ch != 'q');

	return 0;
}

*/

/*

#include <stdio.h>

int main(void)
{

	int i, j;
	int num;

	for (i = 1; i <= 10; i++)
	{
		for (j = 1; j <= i; j++)
		{
			printf("* ");
		}
		printf("\n");
	}

	return 0;
}

*/

//���� ������ �̿��� ������ ���ϱ�

/*

#include <stdio.h>

int main(void)
{

	int i, j;

	for (i = 1; i < 10; i++)
	{
		printf("\n");
		for (j = 1; j < 10; j++)
			printf("%d * %d = %d\n", i, j, i*j);
	}
	
	return 0;
}

*/

// �������� ����

/*

#include <stdio.h>

int main(void)
{
	int num;
	int i, j, n;

	for (i = 1; i <= 5; i++)
	{
		for (j = i; j <= 5; j++)
		{
			printf(" "); 
		}
		for (n = 1; n < 2 * i; n++)
		{
			printf("*");
		}
		printf("\n");
	}

	return 0;
}

*/

//���丮�� ���ϱ�

/*

#include <stdio.h>

int main(void)
{
	
	int a;
	int i;
	int total = 1;
	printf("���� �Է��ϼ��� : ");
	scanf("%d", &a);

	for (i = 1; i <= a; i++)
		total *= i;

	printf("���丮�� ���� %d �Դϴ�. \n", total);

	return 0;
}

*/