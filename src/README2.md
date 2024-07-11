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