#include <stdio.h>

void main()
{
	/*

	int a, b;

	printf("����� ������ �Է��ϼ��� (0~100 ����) : ");
	scanf("%d", &a);

	if (90 < a && a <= 100)
	printf("����� ������ A�Դϴ�. \n");

	else if (80 < a && a <= 90)
	printf("����� ������ B�Դϴ�. \n");

	else if (70 < a && a <= 80)
	printf("����� ������ C�Դϴ�. \n");

	else if (60 < a && a <= 70)
	printf("����� ������ D�Դϴ�. \n");

	else
	printf("����� ������ F�Դϴ�. \n");
	
	*/

	//�� ������ ���ڸ� �����

	/*

	int num = 35;
	int a;
	int c = 1;

	printf("���ڸ� �����!! (0~100 ������ �����Դϴ�!) : ");
	scanf("%d", &a);

	while (1)
	{
		if (a < num)
		{
			c++;
			printf("�� �� ū ���ڸ� �Է��ϼ���. %d ��° �Է� : ", c);
			scanf("%d", &a);
		}

		else if (a > num)
		{
			c++;
			printf("�� �� ���� ���ڸ� �Է��ϼ���. %d ��° �Է� : ", c);
			scanf("%d", &a);
		}

		else if (a == num)
		{
			printf("%d ���� �Է��Ͽ� ���߼̽��ϴ� ! \n", c);
			break;
		}
	}

	*/

	//�Է��� ���ڸ� �Ųٷ� ����ϱ�

	int a;
	int b = 0;
	int c = 0;
	int d = 0;
	int e = 0;

	printf("���ڸ� �Է��ϼ��� (���� ����, 4�ڸ��� ����) : ");
	scanf("%d", &a);

		b = a / 1000;
		c = (a % 1000) / 100;
		d = (a % 1000) % 100 / 10;
		e = (a % 1000) % 100 % 10 / 1;

		printf("%d%d%d%d\n", e, d, c ,b);
}