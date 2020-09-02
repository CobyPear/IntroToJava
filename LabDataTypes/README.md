# Data Types in Java

There are 8 primitive data types in Java:
- Boolean
- char
- byte
- short
- int
- float
- long
- double

Any higher order data type is made up of one of these primitive types.

A Boolean holds a true or false value. Boolean defaults to false.

A char holds a single unicode character. for example: `char a = 'a'`

A char is surrounded by single quotes

To make a string, one would use the String method like so: `String apple = "Apple"`

## Numbers

Number primitives differ only with the range aand precision that they support.

`int` is the default when using a whole number and one is not sure which data type to use.

Smallest to largest: byte, short, int, float, long, double

The larger the value the primitive can hold, the more memory the primitive will take up.

for example, a byte is only 8 bits while a int is 32 bits.

some types sare two's compliment, which shifts the range into the negative so that instead of representing 0-255, it represents -128-127.

short, int, and long are signed two's compliment.

## Range

example: 

int is a 32-bit number. so it's range is -2^31 to 2^31 -1

## Fractions/decimals

Only floats and doubles can support fractional values

## base 2, base 10

In base 10, we have 10 digits to represent all numbers

In base 2 we have 2 digits (0 and 1) to represent all numbers.

How is this possible?

    If 10 = (2 * 1) + (2 * 0)
          = (2 * 1) + (1 * 0)
          = (2)     + (0)
          =  2

So in binary, 2 = 0010

For every time we multiply 2 by 2, we can shift our "10"

4 = 0100

8 = 1000

16 = 10000

etc,
