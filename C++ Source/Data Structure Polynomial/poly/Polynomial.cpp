#include "StdAfx.h"
#include "Polynomial.h"
#include "Term.h"

#include <iostream>
using namespace std;

//////////////////////////////////////////////////////////////////////
// Construction/Destruction
//////////////////////////////////////////////////////////////////////
Polynomial::Polynomial(void)
{
    capacity = 4;
	terms = 0 ;
	termArray = new Term[capacity] ;  // ũ�� 4 �� �迭 ����
}

Polynomial::~Polynomial(void)
{

}

Polynomial Polynomial::Add(Polynomial b)
// a(x)(*this�� ��)�� b(x)�� ���� ����� ��ȯ�Ѵ�.
{
  Polynomial c;
  int aPos = 0, bPos = 0 ;

  while ((aPos < terms) && (bPos < b.terms))
    if(termArray[aPos].exp == b.termArray[bPos].exp) {
        float t = termArray[aPos].coef + b.termArray[bPos].coef;
        if (t) c.NewTerm(t, termArray[aPos].exp);
        aPos++; bPos++;
	}
	else if (termArray[aPos].exp < b.termArray[bPos].exp) {
        c.NewTerm(b.termArray[bPos].coef, b.termArray[bPos].exp);
        bPos++;
	}
	else {
        c.NewTerm(termArray[aPos].coef, termArray[aPos].exp);
        aPos++;
    } 

  // A(x)(*this)�� ������ �׵��� �߰��Ѵ�.
  for (; aPos < terms; aPos++)
    c.NewTerm(termArray[aPos].coef, termArray[aPos].exp);

  // B(x)�� ������ �׵��� �߰��Ѵ�.
  for (; bPos < b.terms; bPos++)
    c.NewTerm(b.termArray[bPos].coef, b.termArray[bPos].exp);
 
  return c;
} // Add�� ��

Polynomial Polynomial::Multiply(Polynomial b) {
	Polynomial result;

	int aPos = 0, bPos = 0;

	//aPos�� this�� termArray ���� �ݺ�
	for (aPos; aPos < terms; aPos++)
	{
		bPos = 0;	//this�� �����װ� ���ϱ� ���� bPos�� 0���� �ʱ�ȭ
		
		//bPos�� b�� termArray ���� �ݺ�
		for (bPos; bPos < b.terms; bPos++)
		{
			Polynomial temp;

			//this�� coef, exp�� �Ű����� b�� coef, exp ���� ���ϰ� ���Ͽ�
			//���� resultCoef, resultExp ������ ����
			float resultCoef = termArray[aPos].coef * b.termArray[bPos].coef;
			int resultExp = termArray[aPos].exp + b.termArray[bPos].exp;

			//resultCoef, resultExp�� temp�� �߰�
			temp.NewTerm(resultCoef, resultExp);
			//temp ���� result�� ����
			result = temp.Add(result);
		}
	}

	return result;
}

void Polynomial::NewTerm(const float theCoeff, const int theExp)
// ���ο� ���� termArray ���� ÷���Ѵ�.
{
    if (terms == capacity) 
    {//termArray�� ũ�⸦ �� ��� Ȯ��
          capacity *= 2; 
          Term *temp = new Term [capacity];           // ���ο� �迭
		  for(int i=0; i<terms ; i++) 
			  temp[i] = termArray[i] ;
          delete [ ] termArray;                       // ���� �޸𸮸� ��ȯ
          termArray = temp;
	} 
    termArray[terms].coef = theCoeff;
    termArray[terms++].exp = theExp;
}

void Polynomial::Print()
{
   int i ;

   if (terms) {
	   for (i = 0; i < terms - 1; i++) {
		   cout << termArray[i].coef << " x^" << termArray[i].exp;

			//���� �� ����� ���� + �� ���, + �ٿ��ֱ�
			if (termArray[i + 1].coef > 0 && i < terms - 1)
				cout << " + ";
			//���� �� ����� ���� - �� ���, ��ĭ ����ֱ�
			else if (termArray[i + 1].coef < 0 && i < terms - 1)
				cout << " ";
	   }

		// ������ ���� ���
      cout << termArray[i].coef << "x^" << termArray[i].exp << "\n" ;
   }

   else
	  cout << " No terms " ;
}