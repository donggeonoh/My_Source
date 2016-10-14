#include <stdio.h>

int main(void)
{
	int num;
	int binary_number[30];
	int i;

	//	-1로 초기화
	for (i = 0; i < 30; i++)
		binary_number[i] = -1;

	printf("\n\t10진수 -> 2진수 변환 프로그램\n\n");

	printf("정수를 입력하세요 : ");
	scanf("%d", &num);

	//	10진수 -> 2진수 계산
	for(i = 0; ; i++) {
		binary_number[i] = num % 2;	//입력한 정수의 나머지 값을 각 배열값에 넣는다
		num /= 2;	//	입력한 정수를 2로 나눠준다

		if (num == 0)	// 0이 되면 무한루프를 벗어난다
			break;
	}

	//초기화 한 값 -1을 제외한 나머지 값을 역순으로 출력
	for (i = 29; i >= 0; i--) {
		if (binary_number[i] == -1)
			continue;
		else
			printf("%d ", binary_number[i]);
	}
	printf("입니다. \n\n");

	return 0;
}