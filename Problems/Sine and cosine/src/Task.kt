import java.util.*
import kotlin.math.cos
import kotlin.math.sin

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val radiant = scanner.nextDouble()
    println("${sin(radiant) - cos(radiant)}")
}