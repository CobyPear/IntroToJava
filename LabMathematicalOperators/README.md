# Operators in Java

Standard mathematical operators in Java are similar to JavaScript. `+`, `-`, `/`, `*`, and `% `all do what you think they do.

The assignment operator is also the same, `=`

There are only 2 equality operators, `==` and `!=`

## Casting

If we want to add a float to an int, we need to cast the float to an int, because Java can't add two different data types together.

Example:

```
long a = 10393L

int i = (int)a
```
On the second line, we have casted the `long` stored in variable `a` to an `int` stored in variable `i`.

## Upcast vs Downcast

Since the range of each datatype is not the same accross the board, we must sometimes upcast or downcast a datatype depending on what we are working with.

Upcasting does not need to worry about data loss, because there will be extra bits to store the number. When casting from a float to a double, we're moving from 32 bits to 64 bits.

Downcasting DOES need to worry about data loss. If you try to downcast a datatype, you may get output you're not expecting. For an example of this, check Example.java.

## Conditional and Logical operators

|Operator | Description|
|---------|------------|
|   <     | less than  |
|   <=    |Less than or equal to|
|   >     |greater than|
|   >=    |greater than or equal to|
|   ==    |equal to|
|   !=    |not equal to|
|   &&    | logical AND (short-circuit)|
|  \| \|  | logical OR (short-circuit)|

