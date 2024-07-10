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
