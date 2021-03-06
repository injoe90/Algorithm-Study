//int memo[100];
//int fibonacci(int n) {
//    if (n <= 1) return n;
//    else {
//        memo[n] = fibonacci(n - 2) + fibonacci(n - 1);
//        return memo[n];
//    }
//}
//int finobacci_bottomUp(int n) {
//    memo[0] = 0;
//    memo[1] = 1;
//    for (int i = 2; i <= n; i++) d[i] = d[i - 1] + d[i - 2];
//    return d[n];
//}

// 1로 만들기: 1463번
//int d[1000001];
//int make_one(int n) {
//    if (n == 1) return 0;
//    if (d[n] > 0) return d[n];
//
//    d[n] = make_one(n - 1) + 1;
//    if (n % 2 == 0) {
//        int temp = make_one(n / 2) + 1;
//        if (d[n] > temp) d[n] = temp;
//    }
//    if (n % 3 == 0) {
//        int temp = make_one(n / 3) + 1;
//        if (d[n] > temp) d[n] = temp;
//    }
//    return d[n];
//}
//int make_one_bottom(int n) {
//    d[1] = 0;
//    for (int i = 2; i <= n; i++) {
//        d[i] = d[i - 1] + 1;
//        if (i % 2 == 0 && d[i] > d[i / 2] + 1) {
//            d[i] = d[i / 2] + 1;
//        }
//        if (i % 3 == 0 && d[i] > d[i / 3] + 1) {
//            d[i] = d[i / 3] + 1;
//        }
//    }
//    return d[n];
//}

// 2 x n 타일링: 11726번
//int rCount[1001];
//int twoByN(int n) {
//    rCount[1] = 1;
//    rCount[2] = 2;
//    for (int i = 3; i <= n; i++) rCount[i] = ((rCount[i - 2]) % 10007 + (rCount[i - 1]) % 10007) % 10007;
//    return rCount[n];
//}
//int twoByN(int n) {
//    if (n == 1) return 1;
//    else if (n == 2) return 2;
//    else return ((twoByN(n - 2) % 10007)  + (twoByN(n - 1) % 10007)) % 10007;
//}

// 2 x n 타일링 2: 11727번
//int nCount[1001];
//int twoByN2(int n) {
//    nCount[1] = 1;
//    nCount[2] = 3;
//    for (int i = 3; i <= n; i++) nCount[i] = ((nCount[i - 1]) % 10007 + (nCount[i - 2] * 2 % 10007)) % 10007;
//    return nCount[n];
//}

// 1, 2, 3 더하기: 9095번
//int nCount[12];
//int oneTwoThree(int n) {
//    nCount[1] = 1;
//    nCount[2] = 2;
//    nCount[3] = 4;
//    for (int i = 4; i <= n; i++) nCount[i] = nCount[i - 1] + nCount[i - 2] + nCount[i - 3];
//    return nCount[n];
//}

// 카드 구매하기: 11052번
//int maxPay[1001];
//int a;
//scanf_s("%d", &a);
//for (int i = 1; i <= a; i++) {
//    int input;
//    scanf_s(" %d", &input);
//    maxPay[i] = input;
//}
//for (int i = 2; i <= a; i++) {
//    for (int j = 1; j <= i - 1; j++) {
//        if (maxPay[i - j] > 0) {
//            int temp = maxPay[j] + maxPay[i - j];
//            if (temp > maxPay[i]) maxPay[i] = temp;
//        }
//    }
//}
//printf("%d\n", maxPay[a]);

//long rCount[100000][3];
// 1, 2, 3 더하기 5: 15990번
//ios_base::sync_with_stdio(false);
//cin.tie(nullptr);
//
//int rangeNumber;
//cin >> rangeNumber;
//
//rCount[0][0] = 1; rCount[0][1] = 0; rCount[0][2] = 0;
//rCount[1][0] = 0; rCount[1][1] = 1; rCount[1][2] = 0;
//rCount[2][0] = 1; rCount[2][1] = 1; rCount[2][2] = 1;
//
//for (int i = 3; i < 100000; i++) {
//    rCount[i][0] = rCount[i - 1][1] % 1000000009 + rCount[i - 1][2] % 1000000009;
//    rCount[i][1] = rCount[i - 2][0] % 1000000009 + rCount[i - 2][2] % 1000000009;
//    rCount[i][2] = rCount[i - 3][0] % 1000000009 + rCount[i - 3][1] % 1000000009;
//}
//
//for (int i = 0; i < rangeNumber; i++) {
//    int index;
//    cin >> index;
//    long temp = rCount[index - 1][0] + rCount[index - 1][1] + rCount[index - 1][2];
//    cout << temp % 1000000009 << "\n";
//}

// 쉬운 계단 수: 10844번
//long stepCount[100][10];
//ios_base::sync_with_stdio(false);
//cin.tie(nullptr);
//
//stepCount[0][0] = 0; stepCount[0][1] = 1; stepCount[0][2] = 1; stepCount[0][3] = 1; stepCount[0][4] = 1;
//stepCount[0][5] = 1; stepCount[0][6] = 1; stepCount[0][7] = 1; stepCount[0][8] = 1; stepCount[0][9] = 1;
//
//for (int i = 1; i < 100; i++) {
//    stepCount[i][0] = stepCount[i - 1][1] % 1000000000;
//    stepCount[i][1] = stepCount[i - 1][0] % 1000000000 + stepCount[i - 1][2] % 1000000000;
//    stepCount[i][2] = stepCount[i - 1][1] % 1000000000 + stepCount[i - 1][3] % 1000000000;
//    stepCount[i][3] = stepCount[i - 1][2] % 1000000000 + stepCount[i - 1][4] % 1000000000;
//    stepCount[i][4] = stepCount[i - 1][3] % 1000000000 + stepCount[i - 1][5] % 1000000000;
//    stepCount[i][5] = stepCount[i - 1][4] % 1000000000 + stepCount[i - 1][6] % 1000000000;
//    stepCount[i][6] = stepCount[i - 1][5] % 1000000000 + stepCount[i - 1][7] % 1000000000;
//    stepCount[i][7] = stepCount[i - 1][6] % 1000000000 + stepCount[i - 1][8] % 1000000000;
//    stepCount[i][8] = stepCount[i - 1][7] % 1000000000 + stepCount[i - 1][9] % 1000000000;
//    stepCount[i][9] = stepCount[i - 1][8] % 1000000000;
//}
//
//int index;
//cin >> index;
//long temp = stepCount[index - 1][0] + stepCount[index - 1][1] + stepCount[index - 1][2]
//+ stepCount[index - 1][3] + stepCount[index - 1][4] + stepCount[index - 1][5] + stepCount[index - 1][6]
//+ stepCount[index - 1][7] + stepCount[index - 1][8] + stepCount[index - 1][9];
//cout << temp % 1000000000 << "\n";

// 가장 긴 증가하는 부분 수열: 11053번
//int length = 0, temp, rangeNumber, numberList[1000], result[1000];
//scanf("%d", &rangeNumber);
//for (int i = 0; i < rangeNumber; i++) {
//    scanf(" %d", &temp);
//    numberList[i] = temp;
//}
//for (int i = 0; i < rangeNumber; i++) {
//    result[i] = 1;
//    for (int j = 0; j < i; j++) {
//        if ((numberList[i] > numberList[j]) && (result[j] + 1 > result[i])) result[i] = result[j] + 1;
//    }
//}
//for (int item : result) {
//    if (item > length) length = item;
//}
//printf("%d", length);

// 가장 긴 증가하는 부분 수열 4: 14002번
//int a[1000];
//int d[1000];
//int v[1000];
//void go(int p) {
//    if (p == -1) {
//        return;
//    }
//    go(v[p]);
//    cout << a[p] << ' ';
//}
//int main() {
//    int n;
//    cin >> n;
//    for (int i = 0; i < n; i++) {
//        cin >> a[i];
//    }
//    for (int i = 0; i < n; i++) {
//        d[i] = 1;
//        v[i] = -1;
//        for (int j = 0; j < i; j++) {
//            if (a[j] < a[i] && d[i] < d[j] + 1) {
//                d[i] = d[j] + 1;
//                v[i] = j;
//            }
//        }
//    }
//    int ans = d[0];
//    int p = 0;
//    for (int i = 0; i < n; i++) {
//        if (ans < d[i]) {
//            ans = d[i];
//            p = i;
//        }
//    }
//    cout << ans << '\n';
//    go(p);
//    cout << '\n';
//    return 0;
//}

// 연속합: 1912번
//ios_base::sync_with_stdio(false);
//cin.tie(nullptr);
//
//int n, maxValue, input[100000], result[100000];
//cin >> n;
//for (int i = 0; i < n; i++) {
//    int temp;
//    cin >> temp; input[i] = temp;
//}
//for (int i = 0; i < n; i++) {
//    result[i] = input[i];
//    if (i == 0) continue;
//    if (result[i] < result[i - 1] + input[i]) result[i] = result[i - 1] + input[i];
//}
//for (int i = 0; i < n; i++) {
//    if (i == 0) maxValue = result[0];
//    if (result[i] > maxValue) maxValue = result[i];
//}
//cout << maxValue << "\n";

// 제곱수의 합: 1699번
//ios_base::sync_with_stdio(false);
//cin.tie(nullptr);
//
//int n, result[100001] = { 0 };
//cin >> n;
//for (int i = 1; i <= n; i++) {
//    result[i] = i;
//    for (int j = 1; j * j <= i; j++) {
//        if (result[i] > result[i - j * j] + 1) result[i] = result[i - j * j] + 1;
//    }
//}
//cout << result[n] << "\n";

//합분해: 2225번
//long long d[201][201];
//long long mod = 1000000000;
//int main() {
//    int n, k;
//    cin >> n >> k;
//    d[0][0] = 1LL;
//    for (int i = 1; i <= k; i++) {
//        for (int j = 0; j <= n; j++) {
//            for (int l = 0; l <= j; l++) {
//                d[i][j] += d[i - 1][j - l];
//                d[i][j] %= mod;
//            }
//        }
//    }
//    cout << d[k][n] << '\n';
//    return 0;
//}

// 1, 2, 3 더하기 3: 15988번
//long long result[1000001];
//long long mod = 1000000009;
//int main() {
//    ios_base::sync_with_stdio(false);
//    cin.tie(nullptr);
//
//    result[1] = 1; result[2] = 2; result[3] = 4;
//    for (int i = 4; i <= 1000000; i++) {
//        result[i] = result[i - 1] + result[i - 2] + result[i - 3];
//        result[i] %= mod;
//    }
//    int n;
//    cin >> n;
//    for (int i = 0; i < n; i++) {
//        int temp;
//        cin >> temp;
//        cout << result[temp] << "\n";
//    }
//
//    return 0;
//}

// 동물원: 1309번
//int n, result[100000][3];
//int main() {
//    ios_base::sync_with_stdio(false);
//    cin.tie(nullptr);
//    cin >> n;
//    result[0][0] = 1; result[0][1] = 1; result[0][2] = 1;
//    for (int i = 1; i < n; i++) {
//        result[i][0] = result[i - 1][0] + result[i - 1][1] + result[i - 1][2];
//        result[i][1] = result[i - 1][0] + result[i - 1][2];
//        result[i][2] = result[i - 1][0] + result[i - 1][1];
//        for (int j = 0; j < 3; j++) result[i][j] %= 9901;
//    }
//    int temp = result[n - 1][0] + result[n - 1][1] + result[n - 1][2];
//    cout << temp % 9901 << "\n";
//
//    return 0;
//}

// 오르막 수: 11057번
//using namespace std;
//int n, result[1000][10];
//
//int main() {
//    ios_base::sync_with_stdio(false);
//    cin.tie(nullptr);
//    cin >> n;
//    for (int i = 0; i < 10; i++) result[0][i] = 1;
//    for (int i = 1; i < n; i++) {
//        int temp = 0;
//        for (int j = 0; j < 10; j++) {
//            temp += result[i - 1][j];
//            result[i][j] = temp % 10007;
//        }
//    }
//    int count = 0;
//    for (int i = 0; i < 10; i++) count += result[n - 1][i];
//    cout << count % 10007 << "\n";
//
//    return 0;
//}