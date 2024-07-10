fun main() {

    // Immutable lists
    val shoppingList = listOf<String>("lamborghini", "Rolex");
    val shoppingListV2 = listOf("lamborghini", "Rolex");
    println(shoppingList);
    // println(shoppingListV2[10]); ArrayOutOfBound Exception

    // Mutable lists
    val mutableItems = mutableListOf("Rolex");
    mutableItems.add("Ferrari");
    println(mutableItems);
}