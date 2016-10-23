// poly.cpp : 콘솔 응용 프로그램에 대한 진입점을 정의합니다.
//

#include "stdafx.h"
#include <iostream>
using namespace std;

#include "Polynomial.h"
#include "Term.h"

int _tmain(int argc, _TCHAR* argv[])
{
    Polynomial A, B, C;
	int calc;
    int i, n, e ;
	float c ;

	cout << "다항식의 연산을 선택하세요 (1.덧셈 2. 곱셈) 숫자입력 : ";
	cin >> calc;

	cout << "다항식 A의 항의 수 : " ;

	cin  >> n ;

	for ( i = 1; i <= n; i++ ) {
		cout << "다항식 A의 "<< i << " 번째 항의 계수와 지수 : " ;
		cin >> c >> e ;

		A.NewTerm(c, e) ;
	}

	cout << "다항식 B의 항의 수 : " ; 
	cin >> n ;

	for ( i = 1; i <= n; i++ ) {
		cout << "다항식 B의 "<< i << " 번째 항의 계수와 지수 : " ;
		cin >> c >> e ;

		B.NewTerm(c, e) ;
	}

	cout << endl;
	cout << "A 항 : ";
	A.Print();
	cout << "B 항 : ";
	B.Print();
	cout << endl;
	
	if (calc == 1)
		C = A.Add(B);
	else if (calc == 2)
		C = A.Multiply(B);

	cout << "결과값 : ";
    C.Print();

	cout << endl;
	cout << "32152661 오동건" << endl;
	return 0;
}