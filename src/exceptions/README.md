## Exceptions and Try catch

```
val x = try {
        something you wanna try
    } catch(e: Exception) {
        something else you wanna return in case of exception
    }
```

Try is an expression, hence it can retur value
```
val a: Int? = try { input.toInt() } catch (e: NumberFormatException) { null };
```