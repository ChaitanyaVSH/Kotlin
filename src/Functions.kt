fun isEven(x: Int): Boolean {
    return (x%2)==0;
}

fun main() {
    val x = readln().toInt();
    println("Entered number is $x and is ${if (isEven(x)) "Even" else "Odd"}");
}
