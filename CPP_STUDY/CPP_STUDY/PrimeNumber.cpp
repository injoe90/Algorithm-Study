#include <iostream>
#include <stdio.h>
#include <stack>
#include <queue>
#include <string>
#include <cstring>
#include <cmath>
using namespace std;
const int MAX = 1000000;
int primeCursor;
int prime[MAX];
bool check[MAX + 1];
int main192182843743() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    for (int i = 2; i <= 1000000; i++) {
        if (check[i] == false) {
            prime[primeCursor++] = i;
            for (int j = i * 2; j <= 1000000; j += i) check[j] = true;
        }
    }
    while (true) {
        int n;
        cin >> n;
        if (n == 0) break;
        for (int i = 1; i < primeCursor; i++) {
            if (check[n - prime[i]] == false) {
                cout << n << " = " << prime[i] << " + " << n - prime[i] << '\n';
                break;
            }
        }
    }

    return 0;
}