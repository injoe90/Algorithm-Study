import sys
from collections import deque

# 큐 구현하기: 10845번
# queueList = []
# for _ in range(int(sys.stdin.readline())):
#     inputList = sys.stdin.readline().split(" ")
#
#     if inputList[0] == 'push': queueList.append(inputList[1][:-1])
#     if inputList[0][:-1] == 'front':
#         if len(queueList) == 0: print('-1')
#         else: print(queueList[0])
#     if inputList[0][:-1] == 'back':
#         if len(queueList) == 0: print('-1')
#         else: print(queueList[len(queueList) - 1])
#     if inputList[0][:-1] == 'size': print(len(queueList))
#     if inputList[0][:-1] == 'empty':
#         if len(queueList) == 0: print('1')
#         else: print('0')
#     if inputList[0][:-1] == 'pop':
#         if len(queueList) == 0: print('-1')
#         else:
#             print(queueList[0])
#             queueList = queueList[1:]

# 조세퍼스 문제: 1158번
# result_list = []
#
# n, m = map(int, sys.stdin.readline().split())
#
# queue_number = deque([i for i in range(1, n + 1)])
#
# while len(queue_number):
#     for _ in range(m - 1):
#         temp = queue_number.popleft()
#         queue_number.append(temp)
#     result_list.append(str(queue_number.popleft()))
#
# print("<", ", ".join(result_list), ">", sep="")

