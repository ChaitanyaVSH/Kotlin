## Classes
syntax

```
class ClassName(
        private val attribute: Type,
        public val attribute: Type,
        ...
    ) {

    init {
        // This block gets executed when an instance is created.
    }
    
    fun getAttribute(): Type {
        return attribute;
    }
}
```

---

Inheritance

1. Make the parent class open

Syntax

```
open class Animal(
    private val name: String,
    private val age: Int
) {
----
----
----
}


class Dog(name: String, age: Int) : Animal(name, age) {

    fun bark() {
        println("Bow bow bow");
    };
};
```
