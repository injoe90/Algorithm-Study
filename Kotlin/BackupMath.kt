import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.floor
import kotlin.math.sqrt

fun main() {
// 나머지: 10430번
//    val br = BufferedReader(InputStreamReader(System.`in`))
//    val (A, B, C) = br.readLine().split(" ").map{it.toInt()}
//    println("${(A + B) % C}")
//    println("${((A % C) + (B % C)) % C}")
//    println("${(A * B) % C}")
//    println("${((A % C) * (B % C)) % C}")

// 최대공약수와 최소공배수: 2609번
//    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
//    println(gcd(a, b))
//    println(lcd(a, b))

// 소수 찾기: 1978번
//    val br = BufferedReader(InputStreamReader(System.`in`));
//    val rangeNumber = br.readLine().toInt()
//    val inputList = br.readLine()!!.split(" ").map { it.toInt() }
//    var cnt = 0
//    for (item in inputList) if (primeNumber(item)) cnt += 1
//    println(cnt)
}

//fun gcd(a:Int, b:Int):Int {
//    return if (b == 0) a
//    else gcd(b, a % b)
//}
//
//fun lcd(a:Int, b:Int):Int {
//    return gcd(a, b) * (a / gcd(a, b)) * (b / gcd(a, b))
//}

//fun primeNumber(a:Int):Boolean {
//    if (a < 2) return false
//    for (i in 2..floor(sqrt(a.toFloat())).toInt()) if ((a % i) == 0) return false
//    return true
//}