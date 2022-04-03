import sys
import math

n = int(sys.stdin.readline())

result = [0] * (n + 1)
for i in range(1, n + 1):
    result[i] = i
    j = 1
    while j * j <= i:
        if result[i] > result[i - j * j] + 1: result[i] = result[i - j * j] + 1
        j += 1
print(result[n])