import sys
sys.setrecursionlimit(100000)

# 1로 만들기: 1463번
# def make_one(n):
#     one_count = [0] * (n + 1)
#     if n == 1: return 0
#     if one_count[n] > 0: return one_count[n]
#     one_count[n] = make_one(n - 1) + 1
#
#     if n % 2 == 0:
#         if one_count[n] > make_one(int(n / 2)) + 1: one_count[n] = make_one(int(n / 2)) + 1
#     if n % 3 == 0:
#         if one_count[n] > make_one(int(n / 3)) + 1: one_count[n] = make_one(int(n / 3)) + 1
#     return one_count[n]

# def make_one(n):
#     one_count = [0] * (n + 1)
#     one_count[1] = 0
#
#     for i in range(2, n + 1):
#         one_count[i] = one_count[i - 1] + 1
#         if i % 2 == 0 and (one_count[i] > one_count[int(i / 2)] + 1):
#             one_count[i] = one_count[int(i / 2)] + 1
#         if i % 3 == 0 and (one_count[i] > one_count[int(i / 3)] + 1):
#             one_count[i] = one_count[int(i / 3)] + 1
#     return one_count[n]
#
# if __name__ == '__main__':
#     print(make_one(int(sys.stdin.readline())))

# 2 x n 타일링: 11726번
# def two_by_n(n):
#     rcount = [0] * (n + 2)
#     rcount[1] = 1
#     rcount[2] = 2
#     for i in range(3, n + 1):
#         rcount[i] = ((rcount[i - 2] % 10007) + (rcount[i - 1] % 10007)) % 10007
#     return rcount[n]

# def two_by_n(n):
#     if n == 1: return 1
#     elif n == 2: return 2
#     else: return ((two_by_n(n - 2) % 10007) + (two_by_n(n - 1) % 10007)) % 10007
#
# if __name__ == "__main__":
#     print(two_by_n(int(sys.stdin.readline())))

# 2 x n 타일링 2: 11727번
# def twoByN2(n):
#     nCount = [0] * (n + 2)
#     nCount[1] = 1
#     nCount[2] = 3
#     for i in range(3, n + 1): nCount[i] = ((nCount[i - 1] % 10007) + (nCount[i - 2] * 2 % 10007)) % 10007
#     return nCount[n]
#
# if __name__ == '__main__':
#     print(twoByN2(int(sys.stdin.readline())))

# 1, 2, 3 더하기: 9095번
# def oneTwoThree(n):
#     nCount = [0] * (n + 3)
#     nCount[1] = 1
#     nCount[2] = 2
#     nCount[3] = 4
#     for i in range(4, n + 1): nCount[i] = nCount[i - 1] + nCount[i - 2] + nCount[i - 3]
#     return nCount[n]
#
# if __name__ == '__main__':
#     for _ in range(int(sys.stdin.readline())): print(oneTwoThree(int(sys.stdin.readline())))

# 카드 구매하기: 11052번 & 카드 구매하기 2: 16194번
# def max_card_pay(card_number, input_list):
#     each_pay = [0] + input_list
#     for i in range(2, card_number + 1):
#         for j in range(1, int(i // 2) + 1):
#             temp = each_pay[j] + each_pay[i - j]
#             if temp > each_pay[i]: each_pay[i] = temp
#     return each_pay[card_number]
#
# def max_card_pay(card_number, input_list):
#     each_pay = [0] + input_list
#     for i in range(2, card_number + 1):
#         for j in range(1, int(i // 2) + 1):
#             temp = each_pay[j] + each_pay[i - j]
#             if temp < each_pay[i]: each_pay[i] = temp
#     return each_pay[card_number]
#
# if __name__ == '__main__':
#     card_number = int(sys.stdin.readline())
#     input_list = list(map(int, sys.stdin.readline().split(" ")))
#     print(max_card_pay(card_number, input_list))

# 1, 2, 3 더하기 5: 15990번
# n_count = [[-1, -1, -1] for _ in range(100000)]
# n_count[0] = [1, 0, 0]
# n_count[1] = [0, 1, 0]
# n_count[2] = [1, 1, 1]
#
# for i in range(3, 100000):
#     n_count[i][0] = n_count[i - 1][1] % 1000000009 + n_count[i - 1][2] % 1000000009
#     n_count[i][1] = n_count[i - 2][0] % 1000000009 + n_count[i - 2][2] % 1000000009
#     n_count[i][2] = n_count[i - 3][0] % 1000000009 + n_count[i - 3][1] % 1000000009
#
# def oneTwoThree2(n):
#     temp = n_count[n - 1][0] + n_count[n - 1][1] + n_count[n - 1][2]
#     return temp % 1000000009
#
# for _ in range(int(sys.stdin.readline())): print(oneTwoThree2(int(sys.stdin.readline())))

# 쉬운 계단 수: 10844번
# step_count = [[-1 for _ in range(10)] for _ in range(100)]
# step_count[0] = [0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
#
# for i in range(1, 100):
#     step_count[i][0] = step_count[i - 1][1] % 1000000000
#     step_count[i][1] = step_count[i - 1][0] % 1000000000 + step_count[i - 1][2] % 1000000000
#     step_count[i][2] = step_count[i - 1][1] % 1000000000 + step_count[i - 1][3] % 1000000000
#     step_count[i][3] = step_count[i - 1][2] % 1000000000 + step_count[i - 1][4] % 1000000000
#     step_count[i][4] = step_count[i - 1][3] % 1000000000 + step_count[i - 1][5] % 1000000000
#     step_count[i][5] = step_count[i - 1][4] % 1000000000 + step_count[i - 1][6] % 1000000000
#     step_count[i][6] = step_count[i - 1][5] % 1000000000 + step_count[i - 1][7] % 1000000000
#     step_count[i][7] = step_count[i - 1][6] % 1000000000 + step_count[i - 1][8] % 1000000000
#     step_count[i][8] = step_count[i - 1][7] % 1000000000 + step_count[i - 1][9] % 1000000000
#     step_count[i][9] = step_count[i - 1][8] % 1000000000
#
# index_number = int(sys.stdin.readline())
# temp = sum(step_count[index_number - 1])
# print(temp % 1000000000)

# 이친수: 2193번
# pinary_number = [[-1, -1] for _ in range(90)]
# pinary_number[0] = [0, 1]
#
# for i in range(1, 90):
#     pinary_number[i][0] = pinary_number[i - 1][0] + pinary_number[i - 1][1]
#     pinary_number[i][1] = pinary_number[i - 1][0]
#
# index = int(sys.stdin.readline()) - 1
# print(pinary_number[index][0] + pinary_number[index][1])