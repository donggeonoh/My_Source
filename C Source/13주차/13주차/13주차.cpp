//�迭�� �̿��� �ִ�, �ּ�, ��� ���ϱ� (���� x)

/*

#include <stdio.h>

int main(void)
{

	int a[5];
	int i, j;
	int temp = 0;
	int av = 0;

	for (i = 0; i < 5; i++)
	{
		printf("���� �Է��ϼ��� (5��° �� %d��°) : ", i);
		scanf("%d", &a);

		av += a[i];
	}

	for (i = 0; i < 4; i++)
		for (j = 0; j < 4 - i; j++)
			if (a[i] > a[i + 1])
			{
				temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
			}

	printf("�ִ밪�� %d�̰�, �ּڰ��� %d, ��հ��� %f �Դϴ�. \n", a[0], a[4], av / 5);

	return 0;
}

*/

//bubble sorting (���� �������� ����)

/*

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void)
{

	int org[5], cook[5], temp;
	int i, j;

	srand(time(NULL));

	for (i = 0; i < 5; i++)
		cook[i] = org[i] = rand() % 45 + 1;

	for (i = 1; i < 5; i++)
	{
		for (j = 0; j < 5 - i; j++)
		{
			if (cook[j] > cook[j + 1])
			{
				temp = cook[j];
				cook[j] = cook[j + 1];
				cook[j + 1] = temp;
			}
		}
	}

	for (i = 0; i < 5; i++)
		printf("%d\t%d\n", org[i], cook[i]);

	return 0;
}

*/

/*

#include <stdio.h>
#include <string.h>

int main(void)
{

	char ctr1[80], ctr2[80];

	printf("�Է� : ");
	gets(ctr1);
	strcpy(ctr2, ctr1);
	puts(ctr2);

	return 0;
}

*/

#include <stdio.h>
#include <string.h>

main()
{
	char str1[80], str2[80];
	int i;

	printf("ù��° �Է� : "); gets(str1);
	printf("�ι��� �Է� : "); gets(str2);

	printf("%s �� ���̴� %d", str1, strlen(str1));
	printf("%s �� �ι�° ���̴� %d", str2, strlen(str2));

	i = strcmp(str1, str2);
	if (!i) printf("The string are equal \n");
	else if (i < 0) printf("%s is less than %s \n", str1, str2);
	else printf("%s is greater")
}