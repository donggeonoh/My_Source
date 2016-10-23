#include "Header.h"

void drawBoard(){
	int i, j;

	system("cls"); // 도스창 초기화

	printf("\n\n\t\tscore : %8d\n\n", score); // 점수 표시

	printf("\t┏━━━┳━━━┳━━━┳━━━┓\n");
	for (i = 0; i < 4; i++){
		printf("\t┃      ┃      ┃      ┃      ┃\n");
		printf("\t┃");
		for (j = 0; j < 4; j++){
			if (nums[i][j] == 0) printf("      ");
			else printf("%6d", nums[i][j]);
			printf("┃");
		}
		printf("\n");
		if (i < 3) printf("\t┣━━━╋━━━╋━━━╋━━━┫\n");
	}
	printf("\t┗━━━┻━━━┻━━━┻━━━┛\n");
}

/* 배열 움직이기 */
int action(int *arr_row[4]){
	int i, j, cnt = 0;
	int temp[4]; // 배열 임시 저장

	for (i = 0; i < 4; i++) temp[i] = *arr_row[i]; // 원래의 배열 저장

	for (i = 0; i < 3; i++){
		if (*arr_row[i] == 0) continue; // 0이면 건너뛰기
		for (j = i + 1; j < 4; j++){
			if (*arr_row[i] == *arr_row[j]){ // 숫자가 같으면 합치기
				*arr_row[i] *= 2;
				*arr_row[j] = 0;
				score += *arr_row[i]; // 점수 +
				break;
			}
			else
				if (*arr_row[j] != 0) break;
		}
	}

	for (i = 0; i < 3; i++){
		if (*arr_row[i] != 0) continue; // 0이 아니면 건너뛰기
		for (j = i + 1; j < 4; j++){
			if (*arr_row[j] != 0){
				*arr_row[i] = *arr_row[j];
				*arr_row[j] = 0;
				break;
			} // 앞으로 땡기기
		}
	}

	// 원래 배열과 비교
	for (i = 0; i < 4; i++){
		if (*arr_row[i] == temp[i]) cnt++;
	}
	if (cnt == 4) return 1; // 바뀐것이 없으면 1반환

	return 0; // 바뀐것이 있으면 0반환, 정상종료
}

/* 새로운 숫자 띄우기 */
void getNewNumber(){
	int *pZero[16]; // 0인 곳의 주소 저장
	int i, j, cnt = 0;

	srand(time(NULL)); // rand함수 랜덤설정

	for (i = 0; i < 4; i++){
		for (j = 0; j < 4; j++){
			if (nums[i][j] == 0){ // 숫자가 0인지 판별
				pZero[cnt] = &nums[i][j]; // 주소 저장
				cnt++;
			}
		}
	}

	if (cnt == 0) return; // 0이 없으면 리턴

	*pZero[rand() % cnt] = (rand() % 5 < 4) ? 2 : 4; // 2 또는 4 생성 (4:1확률)
}

/* 게임오버인지 체크 */
void checkGameOver(){
	int i, j;

	for (i = 0; i < 4; i++){
		for (j = 0; j < 4; j++)
			if (nums[i][j] == 0) return;
		for (j = 0; j < 3; j++){
			if (nums[i][j] == nums[i][j + 1]) return;
			if (nums[j][i] == nums[j + 1][i]) return;
		}
	}

	printf("\tGameOver...");
	exit(0);
}