import sys

# 최대공약수와 최소공배수: 2609번
# def gcd(a, b):
#     if b == 0: return a
#     else: return gcd(b, a % b)
#
# def lcd(a, b):
#     return int(gcd(a, b) * (a / gcd(a, b)) * (b / gcd(a, b)))
#
# a, b = map(int, sys.stdin.readline().rstrip().split(" "))
# print(gcd(a, b))
# print(lcd(a, b))

# 소수 찾기: 1978번
# def prime_number(a):
#     if a < 2: return False
#     for i in range(2, math.trunc(math.sqrt(a)) + 1):
#         if (a % i) == 0: return False
#     return True
#
# range_number = int(sys.stdin.readline().rstrip())
#
# input_list = map(int, sys.stdin.readline().rstrip().split(" "))
#
# cnt = 0
#
# for item in input_list:
#     if prime_number(item): cnt += 1
#
# print(cnt)