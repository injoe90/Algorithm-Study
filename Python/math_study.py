import sys
import math

input_list = []
result_list = []
n = int(sys.stdin.readline())
for _ in range(n):
    input_list.append(list(map(int, sys.stdin.readline().split(" "))))
for i in range(3):
    index = [-1, i]
    result = input_list[0][i]
    for j in range(1, n):
        if index[j] == 0:
            result += min(input_list[j][1], input_list[j][2])
            if input_list[j][1] > input_list[j][2]: index.append(2)
            else: index.append(1)
        elif index[j] == 1:
            result += min(input_list[j][0], input_list[j][2])
            if input_list[j][0] > input_list[j][2]: index.append(2)
            else: index.append(0)
        elif index[j] == 2:
            result += min(input_list[j][0], input_list[j][1])
            if input_list[j][0] > input_list[j][1]: index.append(1)
            else: index.append(0)
    result_list.append(result)

print(min(result_list))
