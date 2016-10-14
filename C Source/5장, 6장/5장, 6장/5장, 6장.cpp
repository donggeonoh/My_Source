

//수프밍 수업내용

    //변수란 이름이 부여된 기억 장소이다.
	//변수는 자료형(type, 유형)을 가지고 있음.
	//void는 값을 지정하지 않는 것.(int가 될 수 있고, float등 여러가지가 될 수 있다.)
	//unsigned를 정수 앞에 사용하면, 0 이상의 값밖에 입력가능하다.
	//long double = 12(8)bytes

	/* sizeof 연산자 (변수 바이트를 알려주는 것)
	sizeof (types); ex) sizeof (int);
	sizeof expression; ex)sizeof int x;

	왜 char와 short 크기가 4바이트인가?

	일반적으로 CPU가 처리하기에 가장 적합한 크기의 정수 자료형을 int로 정의된다. 따라서 int형 연산
	의 속도가 다른 자료형의 연산속도에 비해서 동일하거나 더 빠르다.

	%lf : double 입력 서식
	%f  : double 출력 서식

	ASCll 코드
	{
	미국 표준 협회 (ANSI)에서 아스키 (ASCll)코드를 재정
	총 128개의 문자로 구성
	}

	%x = 8진수, %u = 16진수

	상수의 정의 - 상수는 값이 변하지 않는 데이터

	상수의 종류
	
	이름이 없는 상수 - literal 상수
	이름이 있는 심볼릭 (symbolic) 상수 - const 상수
	
	이름이 없는 상수(literal)
	
	ex)

	int main()
	{
	    int num = 10 + 20;
		...
	}

		이럴때, literal 상수 라고 한다.

	접미사를 이용한 다양한 상수 표현

	예를 들어, float a = 3.45; 라고 하면, 실수는 컴퓨터에서 double이라고 정의되기 때문에, double은
	8 바이트 이고, float은 4 바이트 이므로, double 값을 float 값에 집어 넣을 경우 오류가 발생 할 수
	있다. 그러므로 접미사를 써준다.
	방금 알려준 float a = 3.45;가 오류가 안나게 하려면, 상수 앞에 f를 붙여넣어 이 값이 float이라고
	정의해 준다.

	이름이 있는 심볼릭 상수 : const 상수
	
	1) const 키워드 사용
	     - 선언과 동시에 값을 초기화 해야함.
	2) 매크로 (macro)를 이용하는 방법 (교재 26장)

	상수 이름 만들기

	1. 상수 이름은 대문자로 표시
	2. 둘 이상의 단어는 '_'로 해결 (ex.HOUSE_COUNT)

	자료형 변환의 정의

	- 데이터의 표현을 바꾸는 것
	- char 데이터를 int 데이터로 변환

	자료형 반환의 종류

	` 자동 형 변환 (묵시적 형 변환) - 대입 연산 과정에서 발생
	` 자동 형 변환2 - 정수의 승격 short a = 15; short b = 15; short c = a + b; 이 경우 short를
	int로 변환 시킨다.
	` 자동 형 변환 3 - 피 연산자의 자료형 불일치로 발생 ex. double a = 5.15+19 같은경우 두 수를 엄
	연히 비교해본다면, 5.15는 실수이고 19는 정수이다. 그러므로 int로 변환하거나 double로 변환해야한
	다. 하지만 정확한 값을 위하려 double로 변환 하는것이 가장 좋다. 그래서 19가 사실 정수 (int에 맞
	는 정수의 값)지만, double로 바꿔주어 더한다.

	자동 형 변환의 규칙 -> int > long > long long > float > double > long double
	                      <산술 연산에서 형 변환 규칙>

    - 강제 형 변환 (명시적 형 변환) - 강제로 일으키는 형 변환
	상수의 값이 만약, 정수의 값이라면, 그 값을 나누는데에 있어서 소수점까지 나온다고하자.
	그러면 result = (double)a/b; (여기서 a,b는 정수의 값이다.) 이런식으로 (double)을 입력하여 강제
	로 정수 형을 실수 형으로 변환시켜준다.

	*/

	/*

	double rad;
	double area;

	printf("원의 반지름을 입력하세요 : ");
	scanf_s("%lf", &rad);

	area = rad*rad*3.1415;
	printf("원의 넓이 : %f \n", area);

//--------------------------------------------

	char ch1 = 'A', ch2 = 65;
	int ch3 = 'Z', ch4 = 90;

	printf("%c %d \n", ch1, ch1);
	printf("%c %d \n", ch2, ch2);
	printf("%c %d \n", ch3, ch3);
	printf("%c %d \n", ch4, ch4);

	*/

//강제 형 변환 예시

/*

#include <stdio.h>

void main()
{
	int a, b;
	double divresult;


	scanf_s("%d", &a);
	scanf_s("%d", &b);

	divresult = (double)a / b;

	printf("%f", divresult);
}

*/