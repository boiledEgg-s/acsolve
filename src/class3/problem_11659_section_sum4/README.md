## 11659 구간 합 구하기

> 수가 N개 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램

### 발생한 문제:

- 2차원 함수를 구축하여 시작부터 끝까지 모든 경우의 수의 결과를 저장하고 범위 별로 값에 접근하는 방법은 메모리 초과

### 해결 방법:

- N개 수를 나열했을 때 k번째까지 더한 값들을 1차원 배열로 관리
- i와 j(j>i) 범위를 구하려면 `(j번째까지 더한 것) - (i-1번째까지 더한 것)` 