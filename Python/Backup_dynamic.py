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