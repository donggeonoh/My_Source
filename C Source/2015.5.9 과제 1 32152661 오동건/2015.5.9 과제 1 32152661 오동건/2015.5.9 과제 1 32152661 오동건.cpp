#include <stdio.h>

int main(void)
{

	int a[4], b[4];
	int i;
	int result = 0;

	for (i = 0; i < 4; i++)
	{
		printf("배열 4개의 값을 입력하세요 (4번째중 %d번째) : ", i + 1);
		scanf("%d", &a[i]);
	}

	for (i = 0; i < 4; i++)
	{
		printf("다른 배열 4개의 값을 입력하세요 (4번째중 %d번째) : ", i + 1);
		scanf("%d", &b[i]);
	}
	
	for (i = 0; i < 4; i++)
	{
		if (a[i] == b[i])
			continue;

		else
		{
			printf("배열이 다릅니다. \n");
			break;
		}
	}

	if (i == 4)
		printf("배열이 같습니다. \n");

	return 0;

}