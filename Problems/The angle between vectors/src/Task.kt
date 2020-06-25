import java.util.Scanner
import kotlin.math.acos
import kotlin.math.sqrt

fun main() {
    val scanner = Scanner(System.`in`)
    val u1 = scanner.nextInt()
    val u2 = scanner.nextInt()
    val v1 = scanner.nextInt()
    val v2 = scanner.nextInt()

    val test: Double = (u1 * v1 + u2 * v2).toDouble()
    val u = sqrt(u1.toDouble() * u1 + u2.toDouble() * u2)
    val v = sqrt(v1.toDouble() * v1 + v2 * v2)

    val fin = test / (u * v)
    println("${Math.toDegrees(acos(fin))}")
}