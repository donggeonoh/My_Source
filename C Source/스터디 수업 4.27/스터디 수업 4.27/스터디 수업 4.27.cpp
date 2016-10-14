#include <stdio.h>

void main()
{
	/*

	int a, b;

	printf("당신의 점수를 입력하세요 (0~100 까지) : ");
	scanf("%d", &a);

	if (90 < a && a <= 100)
	printf("당신의 성적은 A입니다. \n");

	else if (80 < a && a <= 90)
	printf("당신의 성적은 B입니다. \n");

	else if (70 < a && a <= 80)
	printf("당신의 성적은 C입니다. \n");

	else if (60 < a && a <= 70)
	printf("당신의 성적은 D입니다. \n");

	else
	printf("당신의 성적은 F입니다. \n");
	
	*/

	//몇 번만에 숫자를 맞출까

	/*

	int num = 35;
	int a;
	int c = 1;

	printf("숫자를 맞춰봐!! (0~100 까지의 숫자입니다!) : ");
	scanf("%d", &a);

	while (1)
	{
		if (a < num)
		{
			c++;
			printf("좀 더 큰 숫자를 입력하세요. %d 번째 입력 : ", c);
			scanf("%d", &a);
		}

		else if (a > num)
		{
			c++;
			printf("좀 더 작은 숫자를 입력하세요. %d 번째 입력 : ", c);
			scanf("%d", &a);
		}

		else if (a == num)
		{
			printf("%d 번을 입력하여 맞추셨습니다 ! \n", c);
			break;
		}
	}

	*/

	//입력한 숫자를 거꾸로 출력하기

	int a;
	int b = 0;
	int c = 0;
	int d = 0;
	int e = 0;

	printf("숫자를 입력하세요 (숫자 반전, 4자리인 숫자) : ");
	scanf("%d", &a);

		b = a / 1000;
		c = (a % 1000) / 100;
		d = (a % 1000) % 100 / 10;
		e = (a % 1000) % 100 % 10 / 1;

		printf("%d%d%d%d\n", e, d, c ,b);
}