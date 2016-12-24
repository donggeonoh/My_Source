#include <iostream>
#include <cstdbool>
using namespace std;

#define		TRUE		1
#define		FALSE		0
#define		MAXINT		99999

class Graph
{
private:
	int   **length;				// 이차원 배열
	int   *dist;				// 일차원 배열
	int *s;						// 일차원 배열
	int n;						// 정점의 수

public:
	Graph(const int vertices = 0) : n(vertices)
	{
		InputVertex();
		PrintAdjacencyMatrix();
		ShortestPath();
	};

	void ShortestPath();
	int Choose(const int);
	void InputVertex();
	void PrintAdjacencyMatrix();
};

void Graph::ShortestPath()
// dist[j], 0 <= j <= n은 n개의 정점을 가진 방향 그래프 G에서 정점 v로부터 정점 j
// 까지의 최단 경로 길이로 설정됨. 간선의 길이는 length[j][j]로 주어짐.
{
	int v; // 시작 정점

	cout << "시작 정점 입력 : ";
	cin >> v;

	for (int i = 0; i < n; i++) {
		s[i] = FALSE; dist[i] = length[v][i];
	}// 초기화

	s[v] = TRUE;
	dist[v] = 0;

	cout << "dist의 최종 결과 값 : ";

	for (int i = 0; i < n - 2; i++) { // 정점 v로부터 n-1개 경로를 결정
		int u = Choose(n); // choose는 dist[u] = minimum dist[w]인 u를 반환
		// (여기서 s[w]=FALSE) 
		s[u] = TRUE;
		for (int w = 0; w < n; w++) {
			if (!s[w]) {
				if (dist[u] + length[u][w] < dist[w]) {
					dist[w] = dist[u] + length[u][w];
				}
			}
		}
	} // for(i=0; ...)의 끝

	for (int i = 0; i < n; i++) {
		cout << dist[i] << " ";	//dist의 최종 결과값 출력
	}

	cout << "\n";
}

int Graph::Choose(const int n) {
	int i, min, pos;

	min = MAXINT, pos = -1;

	for (i = 0; i < n; i++) {
		if (dist[i] < min && !s[i]) {
			min = dist[i], pos = i;
		}
	}

	return pos;
}

void Graph::PrintAdjacencyMatrix() {

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if (length[i][j] == MAXINT)
				cout << "∞\t";
			else {
				cout << length[i][j] << "\t";
			}
		}
		cout << endl;
	}
}

void Graph::InputVertex() {

	int m; //간선의 개수
	int weight; //가중치 입력
	int row, col;

	cout << "정점 수와 간선 수 입력 : ";
	cin >> n >> m;

	length = new int*[n];   // 이차원 배열의 동적 생성

	//동적 초기화
	for (int i = 0; i < n; i++) {
		length[i] = new int[n];
	}

	dist = new int[n];
	s = new int[n];

	//초기화
	for (int i = 0; i < n; i++)
		for (int j = 0; j < n; j++) {
			if (i == j)
				length[i][j] = 0;
			else
				length[i][j] = MAXINT;
		}

	for (int i = 0; i < m; i++) { // 간선 수만큼의 가중치 입력
		cout << i + 1 << " 번째 간선과 가중치입력 : ";
		cin >> row >> col >> weight;

		length[row][col] = weight;
	}
}

int main(void) {
	new Graph();

	return 0;
}