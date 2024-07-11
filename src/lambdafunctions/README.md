## Lambda functions

* These are functions that are passed to another functions as parameters
* Callback use-cases
* There are some inbuilt lambda functions already
* We always return the last line, so explicit return is not needed

syntax

```
count { currentItem ->
    somePieceOfReturnableCode
}


// Custom lamda functions using extension functions concept
fun List<String>.customCount(fn: (String) -> Boolean): Int {
    var count = 0;
    for (str in this) {
        if(fn(str)) {
            count++;
        }
    }
    return count;
}
```

Generics

To make the functions generic to work with multiple types
```
fun <T> List<T>.customCount(fn: (T) -> Boolean): Int {
}
```