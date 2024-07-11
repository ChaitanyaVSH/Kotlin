package lambdafunctions

// Extension function on list types
fun List<String>.customCount(fn: (String) -> Boolean): Int {
    var count = 0;
    for (str in this) {
        if(fn(str)) {
            count++;
        }
    }
    return count;
}

fun main() {

    val items = listOf("It", "Item2");
    val count = items.customCount { currentItem -> currentItem.length > 2 }

    println(count);

};
