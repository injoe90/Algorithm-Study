# import sys
#

# 스택 구현하기: 10828번
# stackList = []
#
# rangeNumber = int(sys.stdin.readline())
#
# for _ in range(rangeNumber):
#     input_list = sys.stdin.readline().split()
#     stack_method = input_list[0]
#     stack_size = len(stackList)
#
#     if stack_method == "push":
#         stackList.append(input_list[1])
#
#     if stack_method == "size":
#         print(f"{stack_size}")
#
#     if stack_size == 0:
#         if stack_method == 'pop':
#             print("-1")
#         if stack_method == 'top':
#             print("-1")
#         if stack_method == 'empty':
#             print("1")
#     else:
#         if stack_method == 'pop':
#             print(stackList.pop())
#         if stack_method == 'top':
#             print(stackList[-1])
#         if stack_method == 'empty':
#             print("0")
#

# 단어 뒤집기: 9093번
# rangeNumber = int(sys.stdin.readline())
#
# for _ in range(rangeNumber):
#     result_list = []
#     input_list = sys.stdin.readline().split()
#     for item in input_list:
#         temp = item[::-1]
#         result_list.append(temp)
#     print(" ".join(result_list))

# 괄호: 9012번
# def stack_bracket(input_list:str):
#     stack = []
#     for i in range(len(input_list)):
#         if input_list[i] == "(":
#             stack.append(input_list[i])
#         if input_list[i] == ")":
#             if len(stack) == 0:
#                 return "NO"
#             else:
#                 top_index = len(stack) - 1
#                 stack = stack[:top_index]
#
#     if len(stack) != 0:
#         return "NO"
#     else:
#         return "YES"
#
# def stack_result():
#     range_number = int(sys.stdin.readline())
#     for _ in range(range_number):
#         input_list = sys.stdin.readline()
#         print(stack_bracket(input_list))
#
# if __name__ == '__main__':
#     stack_result()

# 스택 수열: 1874번
# def stack_serial():
#
#     rangeNumber = int(sys.stdin.readline())
#
#     stackBucket = []
#     resultBucket = []
#     checkNumber = 0
#     for _ in range(rangeNumber):
#         itemNumber = int(sys.stdin.readline())
#         try:
#             if len(resultBucket) == 0:
#                 stackBucket = [i for i in range(1, itemNumber)]
#                 resultBucket.extend(['+'] * itemNumber)
#                 resultBucket.append('-')
#                 checkNumber = itemNumber
#
#             else:
#                 if len(stackBucket) == 0 & checkNumber <= rangeNumber:
#                     stackBucket.extend([i for i in range(checkNumber + 1, itemNumber + 1)])
#                     resultBucket.extend(['+'] * (itemNumber - checkNumber))
#                     checkNumber = itemNumber
#
#                 if itemNumber not in stackBucket and itemNumber < checkNumber:
#                     print("NO")
#                     return
#
#                 topNumber = stackBucket[len(stackBucket) - 1]
#                 if topNumber == itemNumber:
#                     resultBucket.append('-')
#                     stackBucket = stackBucket[:len(stackBucket) - 1]
#
#                 if topNumber < itemNumber:
#                     stackBucket.extend([i for i in range(checkNumber + 1, itemNumber)])
#                     resultBucket.extend(['+'] * (itemNumber - checkNumber))
#                     resultBucket.append('-')
#                     checkNumber = itemNumber
#
#                 if topNumber > itemNumber:
#                     stackBucket = stackBucket[:(itemNumber - topNumber)]
#                     resultBucket.extend(['-'] * (topNumber - itemNumber))
#         except:
#             print("NO")
#             return
#     for result in resultBucket:
#         print(result)
#
# if __name__ == '__main__':
#     stack_serial()

# 에디터: 1406번
# from sys import stdin
#
# stk1 = list(stdin.readline().strip())
# stk2 = []
# n = int(input())
#
# for line in stdin:
#     if line[0] == 'L':
#         if stk1:
#             stk2.append(stk1.pop())
#         else:
#             continue
#     elif line[0] == 'D':
#         if stk2:
#             stk1.append(stk2.pop())
#         else:
#             continue
#     elif line[0] == 'B':
#         if stk1:
#             stk1.pop()
#         else:
#             continue
#     elif line[0] == 'P':
#         stk1.append(line[2])
#
# print(''.join(stk1 + list(reversed(stk2))))

# inputString = list(sys.stdin.readline()[:-1])
# leftStack = []
# rangeNumber = int(sys.stdin.readline())
#
# for _ in range(rangeNumber):
#     inputMethod = sys.stdin.readline().split(" ")
#
#     if inputMethod[0] == 'P':
#         inputString.append(inputMethod[1][-1])
#
#     if inputString:
#         if inputMethod[0][-1] == 'L':
#             leftStack.append(inputString.pop())
#         if inputMethod[0][-1] == 'B': inputString.pop()
#     else:
#         continue
#
#     if inputMethod[0][-1] == 'D':
#         if leftStack: inputString.append(leftStack.pop())
#         else:
#             continue
#
# print(''.join(inputString + list(reversed(leftStack))))

# 단어 뒤집기2: 17413번
# raw_item = sys.stdin.readline()[:-1]
#
# if "<" in raw_item:
#     string_size = len(raw_item)
#     result_list = []
#     check = False
#
#     for i in range(string_size):
#         if raw_item[i] == "<":
#             if not check:
#                 start_list = raw_item[0:i].split(" ")
#                 start_item_list = []
#                 for start_item in start_list:
#                     start_item_list.append(start_item[::-1])
#                 result_list.append(" ".join(start_item_list))
#                 check = True
#
#             start_index = i
#             end_index = raw_item.find(">", start_index)
#             result_list.append(raw_item[start_index: end_index + 1])
#         if raw_item[i] == ">":
#             if i == string_size - 1:
#                 pass
#             elif raw_item[i + 1] == "<":
#                 pass
#             else:
#                 start_index = i
#                 end_index = raw_item.find("<", start_index)
#
#                 if end_index == -1: end_index = string_size
#
#                 temp_list = raw_item[start_index + 1: end_index].split(" ")
#                 temp_item_list = []
#
#                 for temp_item in temp_list:
#                     temp_item_list.append(temp_item[::-1])
#
#                 result_list.append(" ".join(temp_item_list))
#
#     print(''.join(result_list))
# else:
#     string_list = raw_item.split(" ")
#     temp_list = []
#     for temp_item in string_list:
#         temp_list.append(temp_item[::-1])
#
#     print(" ".join(temp_list))

# result_word = ''
# word_stack = []
# check_tag = False
# for item in sys.stdin.readline().rstrip():
#
#     if not check_tag:
#         if item == "<":
#             while word_stack: result_word += word_stack.pop()
#             check_tag = True
#
#         elif item == " ":
#             while word_stack: result_word += word_stack.pop()
#             result_word += item
#         else:
#             word_stack.append(item)
#
#     if check_tag:
#         result_word += item
#         if item == ">": check_tag = False
#
# while word_stack: result_word += word_stack.pop()
#
# print(result_word)

# 쇠막대기: 10799
# bracket_string = sys.stdin.readline().rstrip()
# left_stack = []
# total_rod = 0
#
# for i in range(len(bracket_string)):
#     if bracket_string[i] == "(": left_stack.append((i, bracket_string[i]))
#     elif bracket_string[i] == ")":
#         is_rod = left_stack.pop()
#         if i == is_rod[0] + 1: total_rod += len(left_stack)
#         else: total_rod += 1
#
# print(total_rod)

# 오큰수: 17298번
# range_number = int(sys.stdin.readline())
# result_list = [-1] * range_number
#
# number_list = list(map(int, sys.stdin.readline().rstrip().split(" ")))
# number_stack = [0]
#
# for i in range(1, range_number):
#     while number_stack and (number_list[i] > number_list[number_stack[-1]]):
#         result_list[number_stack.pop()] = number_list[i]
#     number_stack.append(i)
#
# print(*result_list)