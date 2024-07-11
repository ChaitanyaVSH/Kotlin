## Key points
1. To display data we need to use `println()`.
2. VAR vs VAL concept

## Main.kt
1. Entry point
2. Should always be named as `main()`

## Variables

Syntax
```dtd
var/val name: TYPE = VALUE
var x: Int =3;
val x: Int =3;
var name: String = "Chaitanya";
TYPE can be Int, String etc
```
We do not need to explicitly specify the type

---
VAR vs VAL
1. VAL is similar to const and is immutable
2. VAR is mutable

---

Long vs Double vs Float

Double is more precise than float and hence occupies more space, if we do not need precision then use float.

1. Long = 3L
2. Double = 3.33
3. Float = 3.33f


## Arithmetic operations
```dtd
3/4 = 0 as kotlin ignores the decimal part of the division
3f/4f = 0.75, to get the decimal point we need to specify f
```

## Logical and Comparison operations

&& || = == != !(expression)


## Strings
* `val stringName: String = "Chaitanya is Immutable";`
* `uppercase()`
* `length`
* `equals(string)`
* `get(index)`

## Conditional programming

If condition
```
if(x == 2) {
    println("x is 2");
}
```

Else if condition

```
if(x == 2) {
    println("x is 2");
} else if (x > 2) {
    println("x is greater than 2");
}

```

Else condition

```
if(x == 2) {
    println("x is 2");
} else if (x > 2) {
    println("x is greater than 2");
} else {
    println("x is not found");
}
```

Using if else as `expression`
```
var y = if(x ==2) 2 else 3;
```

Using if else in `println()` statements
```
println("Entered number is $x and is ${if (isEven(x)) "Even" else "Odd"}");
```

---

`when` expression

This is useful when all the conditions depend on same variable or expression.

```
when(name) {
    "Sun" -> print("Sun is a Star")
    "Moon" -> print("Moon is a Satellite")
    "Earth" -> print("Earth is a planet")
    else -> print("I don't know anything about it")
}

when(num) {
    in 1..3 -> print("Spring season")
    in 4..6 -> print("Summer season")
    in 7..8 -> print("Rainy season")
    in 9..10 -> print("Autumn season")
    in 11..12 -> print("Winter season")
    !in 1..12 -> print("Enter valid month of year")
}
```

## Null values && NULL SAFETY
We can assign null value to a variable in kotlin, but
if we do this in java and access it we get NPE. Where as in
Kotlin we do not get NPE.

```
val number1 = readln();
val number2 = readln();
//  Both the inputs will be treated as strings. Kotlin does not do the addition here.
val sum = number1.toInt() + number2.toInt();
println(sum)

```

!! (non null assertion) to explicitly tell kotlin that variable is never null
```
val actualSum = number1!!.toInt() + number2!!.toInt();
```

Instead, we can actually do null safe when accepting the input as below.
```
val number3 = readln() ?: "0"
val number4 = readln() ?: "0"

val sum2 = number3.toInt() + number4.toInt();
println(sum2);
```

---

Accessing the SAFE way

```
#1 way

val b: String? = "Kotlin"
if (b != null && b.length > 0) {
    print("String of length ${b.length}")
} else {
    print("Empty string")
}
```

```
#2 way

val a = "Kotlin"
val b: String? = null
println(b?.length) // Safe call
println(a?.length) // Unnecessary safe call

This returns b.length if b is not null, and null otherwise.

```

## Lists
Syntax
```
var test = listOf<type>("items", "items")
test[0] ==> OK
test[2] ==> ArrayIndexOutOfBound exception
```

Immutable vs Mutable

* listOf()
* mutableListOf()

Adding a new item in the list

* mutableList.add(new item)


## Loops

While loop
```
while(counter < shoppingList.size) {
    println(shoppingList[counter]);
    ++counter;
}
```

for loop => Iterator
```
for (item in shoppingList) {
    println(item);
}

```

for loop => Range
```
for (i in 0..shoppingList.size) {
    println(shoppingList[i]);
}
// Inclusive of both the range values

```

## Functions

Syntax
```
#1

fun name(): ReturnType {
    functionDefinition
    return something
}

#2

fun name(x: Type): ReturnType {
    functionDefinition
    return something
}

#3

fun name(x: Type = defaultValue): ReturnType {
    functionDefinition
    return something
}
// Default value

#4

fun name(x: Type, y: Type): {
    functionDefinition
}
// Type is required in function arguments

#5

printNumbersInRange(y=100);
// Named arguments

#6

fun Int.isOdd(): Boolean {
    return this%2 == 1;
}
// Extension functions
```