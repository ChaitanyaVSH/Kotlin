
// Entry point of the entire kotlin application
fun main() {
    val wholeNumber = 3;
    val longNumber = 3L;
    val preciseDecimal = 3.33;
    val decimal = 3.33f;
    val loveVegetables = false;
    val lovePizza = true;
    val iAmLetter = 'C';

    println("the value of whole number is $wholeNumber");
    println("the value of long number is $longNumber");
    println("the value of decimal is $preciseDecimal");
    println("the value of float is $decimal");
    println("the value of loveVegetables is $loveVegetables");
    println("the value of lovePizza is $lovePizza");
    println("the value of iAmLetter is $iAmLetter");

//  Arithmetic operations
    val x = 3 + 4;
    println(x)

    val y = 3f/4f;
    println(y);

    val z = 10%3;
    println(z);

//  Logical and Comparison operations
    val amIAdult = true;
    val amIProgrammer = true;
    val amIAdultProgrammer = amIAdult && amIProgrammer;
    val amIAdultOrProgrammer = amIAdult || amIProgrammer;
    val amIAdultProgrammerTwo = amIAdult == amIProgrammer; // checks the value.
    println(amIAdultProgrammer);
    println(amIAdultOrProgrammer);
    println(amIAdultProgrammerTwo);

//  Strings
    val stringName: String = "Chaitanya is Immutable";
    println(stringName);
    println(stringName.toUpperCase()); // Deprecated
    println(stringName.uppercase());
    println(stringName.length);
    println(stringName.equals("Chaitanya is Immutable"));
    println(stringName.get(7));
    println(stringName[7]);


}