/*

#include <stdio.h>
#include <string.h>

int main(void)
{
	char str1[80], str2[80];
	int i;

	printf("�Է� �ض� 1��° : "); gets(str1);
	printf("�Է� �ض� 2��° : "); gets(str2);

	printf("%s is %d chars long\n", str1, strlen(str1));
	printf("%s is %d chars long\n", str2, strlen(str2));

	i = strcmp(str1, str2);

	if (!i) printf("The string are equal\n");
	else if (i < 0) printf("%s is less than %s\n", str1, str2); 
	else printf("%s is greater than %s\n", str1, str2);

	if (strlen(str1) + strlen(str2) < 80)
	{
		strcat(str1, str2); printf("%s\n", str1);
	}

	return 0;
}

// �����Ͱ� �� 4����Ʈ�� ���� : ��ǻ�� 32bit�� �ý����� ���� �޸𸮴� 4GB�� �ִ��̹Ƿ�, 4����Ʈ�̴�.

// &�� ���� ������ a = 4; �̸� a�ȿ� 4��� ������ �ִ� ���� ������� ���� �ƴ϶�
// ��� �� �ּҰ����ٰ� �־��ִ� ���̴�.

// *a[i] = *(a + i) �̴�.

*/

/*

#include <stdio.h>

int main(void)
{
	
	double q;
	double *p;

	q = 123.451223124124;

	p = &q;
	printf("%lf %lf", q, *p);

	return 0;
}

*/

#include <stdio.h>

int main(void)
{

	int arr_int[] = { 10, 20, 30, 40, 50 };
	int *i;

	i = arr_int;

	printf("%d", (*i)++);
	printf("%d", *i);
	// i[1] �迭
	// printf(" %d %d", *(i + 3), *i + 3);

	return 0;
}
