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

	printf("오토 카운트 %d \n", auto_count);
	printf("스태틱 카운트 %d \n", static_count);
}

// static은 지역변수를 중괄호 마지막을 넘어가서도 유지하고 싶을때는 변수 선언 앞에 붙여준다. ex)static int a;
//지역변수는 함수 내에 변수를 선언시켜 함수가 끝날 때 변수값이 사라진다.
//전역변수는 함수 밖에 변수를 선언시켜 모두 끝날 때 변수값이 사라진다. ex) #include <stdio.h>
                                                                //    int a; <- 이것이 전역 변수이다.
																//    int main(void)

*/

//배열 선언의 기초

/*

#include <stdio.h>

int main()
{
	int a[10]; //[]안의 값만큼 a의 변수를 할당 0부터 9까지 *배열은 무조건 0부터 시작!

	
	변수의 초기화 방법

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
			printf("값을 입력하세요 : ");
			scanf("%d", &a[i]);
		}

		for (i = 3; i >= 0; i--)
		{
			printf("%d", a[i]);
		}

	return 0;
}
