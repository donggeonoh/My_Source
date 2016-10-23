// poly.cpp : �ܼ� ���� ���α׷��� ���� �������� �����մϴ�.
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

	cout << "���׽��� ������ �����ϼ��� (1.���� 2. ����) �����Է� : ";
	cin >> calc;

	cout << "���׽� A�� ���� �� : " ;

	cin  >> n ;

	for ( i = 1; i <= n; i++ ) {
		cout << "���׽� A�� "<< i << " ��° ���� ����� ���� : " ;
		cin >> c >> e ;

		A.NewTerm(c, e) ;
	}

	cout << "���׽� B�� ���� �� : " ; 
	cin >> n ;

	for ( i = 1; i <= n; i++ ) {
		cout << "���׽� B�� "<< i << " ��° ���� ����� ���� : " ;
		cin >> c >> e ;

		B.NewTerm(c, e) ;
	}

	cout << endl;
	cout << "A �� : ";
	A.Print();
	cout << "B �� : ";
	B.Print();
	cout << endl;
	
	if (calc == 1)
		C = A.Add(B);
	else if (calc == 2)
		C = A.Multiply(B);

	cout << "����� : ";
    C.Print();

	cout << endl;
	cout << "32152661 ������" << endl;
	return 0;
}