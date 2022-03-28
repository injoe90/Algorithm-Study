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