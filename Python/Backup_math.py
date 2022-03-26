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

# 소수 구하기: 1929번
# m, n = map(int, sys.stdin.readline().split(" "))
#
# prime = [-1] * n
# prime_cursor = 0
# check = [False] * (n + 1)
#
# for i in range(2, n + 1):
#     if not check[i]:
#         prime_cursor += 1
#         prime[prime_cursor] = i
#         for j in range(i * 2, n + 1, i): check[j] = True
#
# for item in prime:
#     if item >= m: print(item, end=" ")

# 팩토리얼 0의 개수: 1676번
# def factorial_zero(n, a):
#     zero_number = int(math.floor(float(n) / float(a)))
#     if zero_number == 0: return zero_number
#     return zero_number + factorial_zero(n, a * 5)
#
# if __name__ == '__main__':
#     print(factorial_zero(float(sys.stdin.readline()), 5.0))

# def combination_zero(n, a, k=1):
#     zero_number = n // (a ** k)
#     if zero_number == 0: return zero_number
#     return zero_number + combination_zero(n, a, k + 1)
#
# def find_zero_number(n, m):
#     five_number = combination_zero(n,5) - combination_zero(m, 5) - combination_zero(n-m,5)
#     two_number = combination_zero(n,2) - combination_zero(m, 2) - combination_zero(n-m,2)
#     print(min(five_number, two_number))
#
# if __name__ == '__main__':
#     n, m = map(int, sys.stdin.readline().split(" "))
#     find_zero_number(n, m)


# 골드바흐의 추측: 6588 -> 시간 초과
# prime = [-1] * 1000000
# prime_cursor = 0
#
# for i in range(2, 1000000):
#     prime_cursor += 1
#     if prime[prime_cursor] == -1:
#         prime[prime_cursor] = i
#         for j in range(i * 2, 1000000, i): prime[j - 1] = 0
#
# while True:
#     input_number = int(sys.stdin.readline())
#     if input_number == 0: break
#     else:
#         for item in prime:
#             if input_number - item in prime and item > 0:
#                 print(f"{input_number} = {item} + {input_number - item}")
#                 break
# from sys import stdin

# array = [True for i in range(1000001)]
#
# for i in range(2, 1001):
#     if array[i]:
#         for k in range(i + i, 1000001, i):
#             array[k] = False
#
# while True:
#     n = int(stdin.readline())
#
#     if n == 0: break
#
#     for i in range(3, len(array)):
#         if array[i] and array[n-i]:
#             print(n, "=", i, "+", n-i)
#             break

# GCD 합: 9613번
# def gcd(a, b):
#     if b == 0: return a
#     else: return gcd(b, a % b)
#
# for _ in range(int(sys.stdin.readline())):
#     number_list = list(map(int, sys.stdin.readline().split(" ")))[1:]
#     result = 0
#     while number_list:
#         temp = number_list.pop()
#         for i in number_list:
#             result += gcd(temp, i)
#     print(result)

# 숨바꼭질 6: 17087번
# def gcd(a, b):
#     if b == 0: return a
#     else: return gcd(b, a % b)
#
# n, s = map(int, sys.stdin.readline().split(" "))
#
# result = 0
# number_list = []
#
# if n == 1: print(int(sys.stdin.readline()) - s)
# else:
#     for i in sys.stdin.readline().rstrip().split(" "):
#         number_list.append(abs(int(i) - s))
#     number_list = sorted(number_list, reverse=True)
#     while len(number_list) != 1:
#         temp2 = number_list.pop()
#         temp1 = number_list.pop()
#         number_list.append(gcd(temp1, temp2))
#     print(number_list[0])