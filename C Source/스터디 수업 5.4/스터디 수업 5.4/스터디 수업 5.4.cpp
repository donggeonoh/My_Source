/*

#include <stdio.h>

void sub();

int main(void)
{

	int i;
	for (i = 0; i < 10; i++)
		sub();

	return 0;
}

void sub()
{

	int auto_count = 0;
	static int static_count = 0;

	auto_count++;
	static_count++;

	printf("���� ī��Ʈ %d \n", auto_count);
	printf("����ƽ ī��Ʈ %d \n", static_count);
}

// static�� ���������� �߰�ȣ �������� �Ѿ���� �����ϰ� �������� ���� ���� �տ� �ٿ��ش�. ex)static int a;
//���������� �Լ� ���� ������ ������� �Լ��� ���� �� �������� �������.
//���������� �Լ� �ۿ� ������ ������� ��� ���� �� �������� �������. ex) #include <stdio.h>
                                                                //    int a; <- �̰��� ���� �����̴�.
																//    int main(void)

*/

//�迭 ������ ����

/*

#include <stdio.h>

int main()
{
	int a[10]; //[]���� ����ŭ a�� ������ �Ҵ� 0���� 9���� *�迭�� ������ 0���� ����!

	
	������ �ʱ�ȭ ���

	1.
	int a[3];
	int a[0] = 10;
	int a[1] = 20;
	int a[2] = 30;

	2.
	int a[3] = {10, 20, 30};

}

*/

/*

#include <stdio.h>

int main()
{

	int grade[5] = { 31, 63, 62, 87, 14 };
	int i;

	for (i = 0; i < 5; i++)
	{
		printf("grade[%d] %d\n", i, grade[i]);
	}
}

*/

#include <stdio.h>

int main()
{

	int a[4];
	int i;

		for (i = 0; i <= 3; i++)
		{
			printf("���� �Է��ϼ��� : ");
			scanf("%d", &a[i]);
		}

		for (i = 3; i >= 0; i--)
		{
			printf("%d", a[i]);
		}

	return 0;
}
