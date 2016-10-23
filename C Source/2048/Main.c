#include<stdio.h>
#include<conio.h> // getch()
#include<Windows.h> // system("cls")
#include<stdlib.h> // random()
#include<time.h> // srand()

// 방향키 고유값
#define LEFT 75
#define RIGHT 77
#define UP 72
#define DOWN 80

int score = 0; // 점수
int nums[4][4] = {
	{ 0, 0, 0, 0 },
	{ 0, 0, 0, 0 },
	{ 0, 0, 0, 0 },
	{ 0, 0, 0, 0 },
}; // 숫자판

void drawBoard(); // 게임판 그리는 함수
int action(int arr_row[4]); // 배열 움직이는 함수
void getNewNumber(); // 새로운 숫자 띄우는 함수
void checkGameOver(); // 게임오버인지 체크하는 함수

/* main 함수 */
int main(void){
	int input; // key값 저장
	int i, j, k; // 루프 변수
	int *arr_row[4]; // 숫자 한 줄씩 저장

	getNewNumber();
	getNewNumber(); // 숫자 2개 생성
	drawBoard(); // 게임판 그리기

	while (1){
		input = getch(); // 키보드 입력

		if (input == 224){ // 방향키가 눌렸을 때
			int cnt = 0;

			input = getch(); // 고유값 받아오기

			switch (input){
			case LEFT: // 왼쪽 방향키 누른 경우
				for (i = 0; i < 4; i++){
					for (j = 0; j < 4; j++){
						arr_row[j] = &nums[i][j];
					} // 1~4행 왼쪽->오른쪽으로 배열에 저장
					cnt += action(arr_row);
				}
				break;
			case RIGHT: // 오른쪽 방향키 누른 경우
				for (i = 0; i < 4; i++){
					for (j = 3; j >= 0; j--){
						arr_row[3 - j] = &nums[i][j];
					} // 1~4행 오른쪽->왼쪽으로 배열에 저장
					cnt += action(arr_row);
				}
				break;
			case UP: // 위쪽 방향키 누른 경우
				for (i = 0; i < 4; i++){
					for (j = 0; j < 4; j++){
						arr_row[j] = &nums[j][i];
					} // 1~4열 위->아래쪽으로 배열에 저장
					cnt += action(arr_row);
				}
				break;
			case DOWN: // 아래쪽 방향키 누른 경우
				for (i = 0; i < 4; i++){
					for (j = 3; j >= 0; j--){
						arr_row[3 - j] = &nums[j][i];
					} // 1~4열 아래->위쪽으로 배열에 저장
					cnt += action(arr_row);
				}
				break;
			}
			if (cnt == 4) continue; // 숫자가 움직이지 않았을 경우

			getNewNumber(); // 새로운 숫자 생성
			drawBoard(); // 게임판 다시 그리기
			checkGameOver(); // 게임오버인지 확인

		}
	}

	return 0;
}

/* 게임판 그리기 */
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