#include <iostream>
#include <stdio.h>
#include <stack>
#include <queue>
#include <string>
#include <cstring>
using namespace std;

bool primeNumber(int a) {
    if (a < 2) return false;
    for (int i = 2; i * i <= a; i++) if (a % i == 0) return false;
    return true;
}

int main() {

    return 0;
}