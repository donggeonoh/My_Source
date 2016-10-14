#include <stdio.h>

int main(void)
{
	
	int a[100], b[100];
	int i;
	int j;

	printf("배열 크기 값을 입력하세요 (최대 100 이하의 자연수) : ");
	scanf("%d", &i);

	for (j = 0; j < i; j++)
	{
		printf("배열 값을 입력하세요 (%d번째 중 %d 번째) : ", i, j + 1);
		scanf("%d", &a[i]);
	}

	for (j = 0; j < i; j++)
	{
		printf("다른 배열 값을 입력하세요 (%d번째 중 %d 번째) : ", i, j + 1);
		scanf("%d", &b[i]);
	}

	for (j = 0; j < i; j++)
	{
		if (a[i] == b[i])
			continue;

		else
		{
			printf("\n서로 배열이 다릅니다.\n\n");
			break;
		}
	}

	if (j == i)
		printf("\n서로 배열이 같습니다.\n\n");

	return 0;

}