#include <iostream>
#include <stdio.h>
#include <stack>
#include <queue>
#include <string>
#include <cstring>
#include <cmath>
using namespace std;

long pinary[90][2];
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    pinary[0][0] = 0; pinary[0][1] = 1;
    for (int i = 1; i < 90; i++) {
        pinary[i][0] = pinary[i - 1][0] + pinary[i - 1][1];
        pinary[i][1] = pinary[i - 1][0];
    }
    int index;
    cin >> index;
    cout << index;
    long count = pinary[index - 1][0] + pinary[index - 1][1];
    cout << count << "\n";
    return 0;
}