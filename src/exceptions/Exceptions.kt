package exceptions

fun main() {
    val x = readln() ?: "0"
    // x.toInt(); // Prone to NumberFormatException

    val parsedNumber = try {
        x.toInt();
    } catch (_: Exception) {
        0;
    }
    println(parsedNumber);
};