import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
// 스택 구현하기: 10828번
//        val stackList = ArrayList<String>()
//
//        val rangeNumber = readLine()!!.toInt()
//
//        repeat (rangeNumber) {
//            val inputList = readLine()!!.split(" ")
//            val stackMethod = inputList[0]
//            val stackSize = stackList.size
//
//            when (stackMethod) {
//                "push" -> stackList.add(inputList[1])
//                "size" -> println("${stackList.size}")
//                "pop", "top" -> if (stackSize == 0) {
//                    println("-1")
//                } else {
//                    println(stackList[stackSize - 1])
//                    if (stackMethod == "pop") stackList.removeAt(stackList.size - 1)
//                }
//                "empty" -> if (stackSize == 0) {println("1")
//                } else { println("0") }
//            }
//        }

// 단어 뒤집기: 9093번
//        val br = BufferedReader(InputStreamReader(System.`in`))
//        val bw = BufferedWriter(OutputStreamWriter(System.out))
//        val rangeNumber = br.readLine().toInt()
//        for (i in 1..rangeNumber) {
//
//            val stringList = br.readLine().split(" ")
//            for (j in stringList) {
//                for (k in j.length - 1 downTo 0) {
//                    bw.write(j[k].toString())
//                }
//                bw.write(" ")
//                bw.flush()
//            }
//            bw.write("\n")
//            bw.flush()
//        }
//        bw.close()

//    val br = BufferedReader(InputStreamReader(System.`in`))
//    val bw = BufferedWriter(OutputStreamWriter(System.out))
//
//    val rangeNumber = br.readLine().toInt()
//
//    for (i in 1..rangeNumber) {
//        val inputString = br.readLine()
//        bw.write(ResultBracket(inputString) + "\n")
//        bw.flush()
//    }
//    bw.close()

// 스택 수열: 1874번
//    val br = BufferedReader(InputStreamReader(System.`in`))
//    val bw = BufferedWriter(OutputStreamWriter(System.out))
//    val stackNumber = br.readLine().toInt()
//    var checkNumber = 0
//    val stackBucket = Stack<Int>()
//    var resultBucket = ""
//
//    for (i in 1..stackNumber) {
//        val inputNumber = br.readLine().toInt()
//        if (inputNumber > checkNumber) {
//            while (inputNumber > checkNumber) {
//                checkNumber += 1
//                stackBucket.push(checkNumber)
//                resultBucket += '+'
//            }
//            stackBucket.pop()
//            resultBucket += '-'
//        } else {
//            var isFound = false
//            if (stackBucket.isNotEmpty()) {
//                val topNumber = stackBucket.peek()
//                stackBucket.pop()
//                resultBucket += "-"
//                if (topNumber == inputNumber) isFound = true
//            }
//            if (!isFound) {
//                bw.write("NO")
//                bw.flush()
//                bw.close()
//                return
//            }
//        }
//    }
//    for (item in resultBucket) {
//        bw.write(item + "\n")
//        bw.flush()
//    }
//    bw.close()

// 에디터: 1406번
//    val br = BufferedReader(InputStreamReader(System.`in`))
//    val bw = BufferedWriter(OutputStreamWriter(System.out))
//
//    val inputString = br.readLine()
//
//    val leftStack = Stack<Char>()
//    val rightStack = Stack<Char>()
//
//    for (element in inputString) leftStack.push(element)
//
//    val rangeNumber = br.readLine().toInt()
//
//    for (i in 1..rangeNumber) {
//        val stackMethod = br.readLine().split(" ")
//        if (stackMethod[0] == "P") leftStack.push(stackMethod[1][0])
//        if (stackMethod[0] == "L") {
//            if (leftStack.isNotEmpty()) {
//                rightStack.push(leftStack.peek())
//                leftStack.pop()
//            }
//        }
//        if (stackMethod[0] == "D") {
//            if (rightStack.isNotEmpty()) {
//                leftStack.push(rightStack.peek())
//                rightStack.pop()
//            }
//        }
//        if (stackMethod[0] == "B")
//            if (leftStack.isNotEmpty()) leftStack.pop()
//    }
//
//    println(leftStack.toCharArray() + rightStack.toCharArray().reversed())

// 단어 뒤집기2: 17413번
//    val br = BufferedReader(InputStreamReader(System.`in`))
//    val wordStack = Stack<Char>()
//    val inputString = br.readLine()
//    var checkTag = false
//
//    for (i in inputString) {
//        if (!checkTag) {
//            when (i) {
//                '<' -> {
//                    while (wordStack.isNotEmpty()) print(wordStack.pop())
//                    checkTag = true
//                }
//                ' ' -> {
//                    while (wordStack.isNotEmpty()) print(wordStack.pop())
//                    print(i)
//                }
//                else -> wordStack.push(i)
//            }
//        }
//
//        if (checkTag) {
//            print(i)
//            if (i == '>') checkTag = false
//        }
//    }
//    while (wordStack.isNotEmpty()) print(wordStack.pop())

// 쇠막대기: 10799번
//    val br = BufferedReader(InputStreamReader(System.`in`))
//    val bracketString = br.readLine()
//    val leftStack = Stack<Pair<Int, Char>>()
//    var rodCount = 0
//
//    for (i in bracketString.indices) {
//        if (bracketString[i] == '(') leftStack.push(Pair(i, bracketString[i]))
//        if (bracketString[i] == ')') {
//            val isRod = leftStack.pop()
//            if (i == isRod.first + 1) rodCount += leftStack.size
//            else rodCount += 1
//        }
//    }
//
//    println(rodCount)

// 오등큰수: 17299번
//    val br = BufferedReader(InputStreamReader(System.`in`))
//    val rangeNumber = br.readLine().toInt()
//    val numberList = br.readLine().split(" ").map { it.toInt() }
//    val resultList = IntArray(rangeNumber)
//    val numberStack = Stack<Int>()
//
//    numberStack.push(0)
//    for (i in 1 until rangeNumber) {
//        while (numberStack.isNotEmpty() && (numberList[i].toInt() > numberList[numberStack.peek()].toInt())) {
//            resultList[numberStack.pop()] = numberList[i]
//        }
//        numberStack.push(i)
//    }
//
//    while (numberStack.isNotEmpty()) resultList[numberStack.pop()] = -1
//    val resultString = StringBuilder()
//
//    for (item in resultList) resultString.append("$item ")
//    print(resultString.toString())
}
//fun ResultBracket(inputString:String):String {
//    val inputStack = Stack<String>()
//
//    for (i in inputString.indices) {
//        if (inputString[i] == '(') inputStack.push(inputString[i].toString())
//        if (inputString[i] == ')') {
//            if (inputStack.empty()) return "NO"
//            else inputStack.pop()
//        }
//    }
//    return if (inputStack.size == 0) "YES"
//    else "NO"
//}
