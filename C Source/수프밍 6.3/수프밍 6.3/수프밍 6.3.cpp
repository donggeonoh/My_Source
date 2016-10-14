/*

#include <stdio.h>
#include <string.h>

int main(void)
{
	char str1[80], str2[80];
	int i;

	printf("입력 해라 1번째 : "); gets(str1);
	printf("입력 해라 2번째 : "); gets(str2);

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

// 포인터가 왜 4바이트인 이유 : 컴퓨터 32bit인 시스템의 들어가는 메모리는 4GB가 최대이므로, 4바이트이다.

// &를 쓰는 이유는 a = 4; 이면 a안에 4라는 변수가 있는 값에 넣으라는 것이 아니라
// 어느 한 주소값에다가 넣어주는 것이다.

// *a[i] = *(a + i) 이다.

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
	// i[1] 배열
	// printf(" %d %d", *(i + 3), *i + 3);

	return 0;
}
