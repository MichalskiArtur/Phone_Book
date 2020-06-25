// TODO: provide three functions here

fun identity(x: Int) = x
fun half(x: Int) = x / 2
fun zero(x: Int) = 0

fun generate(functionName: String): (Int) -> Int {
    // TODO: provide implementation here
    return when (functionName) {
        "identity" -> ::identity
        "half" -> ::half
        else -> ::zero
    }
}


//
//fun getRealGrade(x: Double) = x
//fun getGradeWithPenalty(x: Double) = x - 1
//
//fun getScoringFunction(isCheater: Boolean): (Double) -> Double {
//    if (isCheater) {
//        return ::getGradeWithPenalty
//    }
//
//    return ::getRealGrade
//}