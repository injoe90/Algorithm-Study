import java.io.BufferedReader
import java.io.InputStreamReader

//val index = IntArray(1000) {-1}
fun main() {
// 카드 구매하기: 11052번
//    val br = BufferedReader(InputStreamReader(System.`in`))
//    val n = br.readLine().toInt()
//    val inputList = br.readLine().split(" ").map { it.toInt() }
//    val maxPay = IntArray(n + 1)
//    for (i in 1..n) maxPay[i] = inputList[i - 1]
//    for (i in 2..n) {
//        for (j in 1 until i) {
//            val temp = maxPay[j] + maxPay[i - j]
//            if (temp > maxPay[i]) maxPay[i] = temp
//        }
//    }
//    println(maxPay[n])

// 1, 2, 3 더하기 5: 15990번
//    val br = BufferedReader(InputStreamReader(System.`in`))
//    val rangeNUmber = br.readLine().toInt()
//    val rCount = Array(100000) { LongArray(3) }
//    rCount[0][0] = 1
//    rCount[0][1] = 0
//    rCount[0][2] = 0
//    rCount[1][0] = 0
//    rCount[1][1] = 1
//    rCount[1][2] = 0
//    rCount[2][0] = 1
//    rCount[2][1] = 1
//    rCount[2][2] = 1
//    for (i in 3 until 100000) {
//        rCount[i][0] = rCount[i - 1][1] % 1000000009 + rCount[i - 1][2] % 1000000009
//        rCount[i][1] = rCount[i - 2][0] % 1000000009 + rCount[i - 2][2] % 1000000009
//        rCount[i][2] = rCount[i - 3][0] % 1000000009 + rCount[i - 3][1] % 1000000009
//    }
//    for (i in 0 until rangeNUmber) {
//        val indexNumber = br.readLine().toInt()
//        val temp = rCount[indexNumber - 1][0] + rCount[indexNumber - 1][1] + rCount[indexNumber - 1][2]
//        println(temp % 1000000009)
//    }

// 쉬운 계단 수: 10844번
//    val br = BufferedReader(InputStreamReader(System.`in`))
//    val stepCount = Array(100) {LongArray(10)}
//    stepCount[0][0] = 0
//    stepCount[0][1] = 1
//    stepCount[0][2] = 1
//    stepCount[0][3] = 1
//    stepCount[0][4] = 1
//    stepCount[0][5] = 1
//    stepCount[0][6] = 1
//    stepCount[0][7] = 1
//    stepCount[0][8] = 1
//    stepCount[0][9] = 1
//
//    for (i in 1 until 100) {
//        stepCount[i][0] = stepCount[i - 1][1] % 1000000000
//        stepCount[i][1] = stepCount[i - 1][0] % 1000000000 + stepCount[i - 1][2] % 1000000000
//        stepCount[i][2] = stepCount[i - 1][1] % 1000000000 + stepCount[i - 1][3] % 1000000000
//        stepCount[i][3] = stepCount[i - 1][2] % 1000000000 + stepCount[i - 1][4] % 1000000000
//        stepCount[i][4] = stepCount[i - 1][3] % 1000000000 + stepCount[i - 1][5] % 1000000000
//        stepCount[i][5] = stepCount[i - 1][4] % 1000000000 + stepCount[i - 1][6] % 1000000000
//        stepCount[i][6] = stepCount[i - 1][5] % 1000000000 + stepCount[i - 1][7] % 1000000000
//        stepCount[i][7] = stepCount[i - 1][6] % 1000000000 + stepCount[i - 1][8] % 1000000000
//        stepCount[i][8] = stepCount[i - 1][7] % 1000000000 + stepCount[i - 1][9] % 1000000000
//        stepCount[i][9] = stepCount[i - 1][8] % 1000000000
//    }
//
//    val indexNumber = br.readLine().toInt()
//    val temp = stepCount[indexNumber - 1].sum()
//    println(temp % 1000000000)

// 가장 긴 증가하는 부분 수열: 11053번
//    val br = BufferedReader(InputStreamReader(System.`in`))
//    val rangeNumber = br.readLine().toInt()
//    val numberList = br.readLine().split(" ").map { it.toInt() }
//    val result = IntArray(1000)
//    for (i in 0 until rangeNumber) {
//        result[i] = 1
//        for (j in 0 until i) {
//            if ((numberList[i] > numberList[j]) && result[j] + 1 > result[i]) result[i] = result[j] + 1
//        }
//    }
//    var length = 0;
//    for (item in result) if (item > length) length = item
//    println(length)

// 가장 긴 증가하는 부분 수열 4: 14002번
//    val br = BufferedReader(InputStreamReader(System.`in`))
//    val n = br.readLine().toInt()
//    var initNumber = 0
//    var length = 0
//    val numberList = br.readLine().split(" ").map { it.toInt() }
//    val resultCount = IntArray(1000)
//
//    for (i in 0 until n) {
//        resultCount[i] = 1
//        for (j in 0 until i) {
//            if ((numberList[i] > numberList[j]) && resultCount[j] + 1 > resultCount[i]) {
//                resultCount[i] = resultCount[j] + 1
//                index[i] = j
//            }
//        }
//    }
//    for (i in 0 until n) {
//        if (resultCount[i] > length) {
//            length = resultCount[i]
//            initNumber = i
//        }
//    }
//    println(length)
//    traceIndex(initNumber, numberList)

// 연속합: 1912번
//    val br = BufferedReader(InputStreamReader(System.`in`))
//    var maxValue = 0
//    val n = br.readLine().toInt()
//    val inputList = br.readLine().split(" ").map { it.toInt() }
//    val resultList = IntArray(n)
//    for (i in 0 until n) {
//        resultList[i] = inputList[i]
//        if (i == 0) continue
//        if (resultList[i] < resultList[i - 1] + inputList[i]) resultList[i] = resultList[i - 1] + inputList[i]
//    }
//    for (i in 0 until n) {
//        if (i == 0) maxValue = resultList[i]
//        if (resultList[i] > maxValue) maxValue = resultList[i]
//    }
//    println(maxValue)
// 제곱수의 합: 1699번
//    val br = BufferedReader(InputStreamReader(System.`in`))
//    val n = br.readLine().toInt()
//    val result = IntArray(100001)
//    for (i in 1..n) {
//        result[i] = i
//        var j = 1
//        while (j * j <= i) {
//            if (result[i] > result[i - j * j] + 1) result[i] = result[i - j * j] + 1
//            j += 1
//        }
//    }
//    println(result[n])

// 합분해: 2225번
//    val br = BufferedReader(InputStreamReader(System.`in`))
//    val (n, k) = br.readLine().split(" ").map { it.toInt() }
//    val result = Array(k + 1) {LongArray(n + 1)}
//    result[0][0] = 1L
//    for (i in 1..k) {
//        for (j in 0..n) {
//            for (l in 0..j) {
//                result[i][j] += result[i - 1][j - l]
//                result[i][j] %= 1000000000L
//            }
//        }
//    }
//    println(result[k][n])

// 1, 2, 3 더하기 3: 15988번
//    val br = BufferedReader(InputStreamReader(System.`in`))
//    val result = LongArray(1000001)
//    val mod = 1000000009L
//    result[1] = 1
//    result[2] = 2
//    result[3] = 4
//    for (i in 4..1000000) {
//        result[i] = result[i - 1] + result[i - 2] + result[i - 3]
//        result[i] %= mod
//    }
//    val n = br.readLine().toInt()
//    for (i in 0 until n) {
//        val temp = br.readLine().toInt()
//        println(result[temp])
//    }
}

// 1로 만들기: 1463번
//fun oneMake(n:Int):Int {
//    val oneCount = IntArray(n + 1)
//    oneCount[1] = 0
//    for (i in 2..n) {
//        oneCount[i] = oneCount[i - 1] + 1
//        if (i % 2 == 0 && (oneCount[i] > oneCount[i / 2] + 1)) oneCount[i] = oneCount[i / 2] + 1
//        if (i % 3 == 0 && (oneCount[i] > oneCount[i / 3] + 1)) oneCount[i] = oneCount[i / 3] + 1
//    }
//    return oneCount[n]
//}

// 2 x n 타일링: 11726번
//fun twoByN(n:Int):Int {
//    val rCount = IntArray(n + 2)
//    rCount[1] = 1
//    rCount[2] = 2
//    for (i in 3..n) rCount[i] = ((rCount[i - 2] % 10007) + (rCount[i -1] % 10007)) % 10007
//    return rCount[n]
//}

// 2 x n 타일링 2: 11727번
//fun twoByN2(n:Int):Int {
//    val nCount = IntArray(n + 2)
//    nCount[1] = 1
//    nCount[2] = 3
//    for (i in 3..n) nCount[i] = ((nCount[i - 1]) % 10007 + (nCount[i - 2] * 2 % 10007)) % 10007
//    return nCount[n]
//}

// 1, 2, 3 더하기: 9095번
//fun oneTwoThree(n:Int):Int {
//    val nCount = IntArray(n + 3)
//    nCount[1] = 1
//    nCount[2] = 2
//    nCount[3] = 4
//    for (i in 4..n) nCount[i] = nCount[i - 1] + nCount[i - 2] + nCount[i - 3]
//    return nCount[n]
//}

//fun traceIndex(n: Int, numberList: List<Int>) {
//    if (n == -1) return
//    traceIndex(index[n], numberList)
//    print(numberList[n].toString() + " ")
//}