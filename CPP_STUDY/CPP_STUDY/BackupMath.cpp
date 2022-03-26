// 최대공약수와 최소공배수: 2609번
//int GCD(int A, int B) {
//    if (B == 0) return A;
//    else return GCD(B, A % B);
//}
//
//int LCD(int A, int B) {
//    return GCD(A, B) * (A / GCD(A, B)) * (B / GCD(A, B));
//}

// 소수 찾기: 1978번
//bool primeNumber(int a) {
//    if (a < 2) return false;
//    for (int i = 2; i * i <= a; i++) if (a % i == 0) return false;
//    return true;
//}

// 팩토리얼: 10872번
//int factorial(int n) {
//    if (n == 0) return 1;
//    else if (n == 1) return n;
//    return n * factorial(n - 1);
//}

// 팩토리얼 0의 개수: 1676번
//int factorial_zero(int n, int a = 5) {
//    int zero_number = (int)floor((float)(n / a));
//    if (zero_number == 0) return zero_number;
//    return zero_number + factorial_zero(n, a * 5);
//}

// GCD 합: 486번
//long GCD(int A, int B) {
//    if (B == 0) return A;
//    else return GCD(B, A % B);
//}

// 숨바꼭질 6: 17087번
//long GCD(int A, int B) {
//    if (B == 0) return A;
//    else return GCD(B, A % B);
//}

//int prime[1000001];

int main4() {


    /*int A, B, C;
    scanf_s("%d %d %d", &A, &B, &C);

    printf("%d\n", (A + B) % C);
    printf("%d\n", ((A % C) + (B % C)) % C);
    printf("%d\n", (A * B) % C);
    printf("%d\n", ((A % C) + (B % C)) % C);*/

    //int rangeNumber;
    //int cnt = 0;
    //scanf_s("%d", &rangeNumber);
    //for (int i = 0; i < rangeNumber; i++) {
    //    int targetNumber;
    //    scanf_s(" %d", &targetNumber);
    //    if (primeNumber(targetNumber)) cnt += 1;
    //}
    //printf("%d", cnt);

    // 소수 구하기: 1929번
    /*int m;
    int n;
    scanf_s("%d %d", &m, &n);


    int primeCursor = 0;
    for (int i = 0; i <= 1000000; i++) prime[i] = -1;

    for (int i = 2; i <= 1000000; i++) {
        primeCursor += 1;
        if (prime[primeCursor] == -1) {
            prime[primeCursor] = i;
            for (int j = i * 2; j <= 1000001; j += i) prime[j - 1] = 0;
        }
    }

    for (int i = 0; i < n; i++) {
        if (prime[i] >= m) printf("%d\n", prime[i]);
    }*/

    /*int n;
    cin >> n;
    cout << factorial(n) << "\n";*/

    //int n;
    //cin >> n;
    //cout << factorial_zero(n) << "\n";

    /*ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    int t, n;
    cin >> t;
    for (int i = 0; i < t; i++) {
        cin >> n;
        stack<int> numberList;
        long result = 0;
        for (int j = 0; j < n; j++) {
            int temp;
            cin >> temp;
            numberList.push(temp);
        }
        while (!numberList.empty()) {
            int temp2 = numberList.top();
            numberList.pop();
            stack<int> numberList2 = numberList;
            for (int j = 0; j < numberList.size(); j++) {
                result += GCD(temp2, numberList2.top());
                numberList2.pop();
            }
        }
        cout << result << "\n";
    }*/

    /*int n, s;
    scanf_s(" %d", &n);
    scanf_s(" %d", &s);

    if (n == 1) {
        int x;
        scanf_s("%d", &x);
        cout << abs(x - s);
    }
    else {
        stack<long> numberList;
        for (int i = 0; i < n; i++) {
            int temp1;
            scanf_s(" %d", &temp1);
            numberList.push(abs(s - temp1));
        }
        while (numberList.size() != 1) {
            int temp2 = numberList.top();
            numberList.pop();
            int temp3 = numberList.top();
            numberList.pop();
            numberList.push(GCD(temp2, temp3));
        }
        cout << numberList.top();
    }*/
	return 0;
}