fun main() {
    println("Число в двоичной системе: " + tretiya(readln().toInt()))
}
fun tretiya(a: Int): Int {
    var a = a
    var b = 0
    var c = 1
    var d: Int
    while (a > 0) {
        d = a % 2
        a /= 2
        b+= d * c
        c *= 10
    }
    return b
}