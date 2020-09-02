# Java Arrays

Arrays in Java can only hold one datatype and are FIXED SIZE. Arrays in Java cannot be resized after declaration.

To create an array, specify datatype followed by brackets, followed by the variable name.

Example: `int[] arrayName`

## Initializing Arrays

There are two ways to initialze an array

1. use the `new` keyword to create an array of specified length
    
        example: `int[] myArray = new int[5];` creates a new array of integers with a length of 5.

2. use curly braces to set up initial values

        example: `int[] myArray = {1, 2, 3, 4, 5};`

## Accessing Array values

To access an element of an array, us it's index.

Take the following array: `int[] myArray = {1, 2, 3, 4, 5};`

If we want to print the 4th element of this array, we would acess it with bracket notation

    `System.out.println(myArray[3])` prints `4` 

We can also use brackets to access the element and teh asignment operator to assign or re-assign a value for a specific element as follow:

    `myArray[1] = 7;` would reassign the element at index 1 which is 2, to 7

If we try to assign a value to an elemenet that doesn't exist, no compiler errors occur, but it will throw a runtime error. The error will be an ArrayIndexOutOfBoundsException.

## Array Properties

Use the `.length` property to access the length of the array, just like JS!