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

Make the parent class open to make it inheritable.

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

Abstract classes and Functions

This helps in not creating instances for classes.
```
abstract class ClassName {

    abstract fun funcName()
    // The implementation for this should be in sub classes
}
```