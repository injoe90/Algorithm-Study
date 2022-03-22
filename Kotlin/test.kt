import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.floor
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`));

}
fun primeNumber(a:Int):Boolean {
    if (a < 2) return false
    for (i in 2..floor(sqrt(a.toFloat())).toInt()) if ((a % i) == 0) return false
    return true
}
