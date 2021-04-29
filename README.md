# Assignment 32

For this assignment you will be creating superclasses and subclasses involving different polygons. One of the classes will be a subclass of a subclass.

Note: the `Triangle` class is included in the starter code folder as a completed example. It is just for reference.

### Polygon Class

Fill in the missing parts of the class `Polygon`.

1. `getPerimeter()`
1. `getNumVertices()`
1. `getNumSides()`
1. `getSumOfAngles()`

### Quadrilateral Class

A `Quadrilateral` is a `Polygon`. 

Instance variables:
1. Two doubles for the opposite angles in the quadrilateral.

Constructor:
1. Takes an `List` of `Double`s for the sides and two `double`s for the two angles.
1. Initialize all values.

Methods:
1. Override the `getArea()` method. The general formula is:

![Formula](https://i.imgur.com/qWjAIxa.png)

Where `a`, `b`, `c`, and `d` are the four sides, `s` is the semiperimeter (half of the perimeter), and `α` and `γ` are two opposite angles.

![Diagram](https://i.imgur.com/sWmZpbM.png)

**Note: the cosine method in the `Math` class for Java takes radians, not degrees.**

### Rectangle Class

A `Rectangle` is a `Quadrilateral`.

Constructor:
1. Takes an `List` of `Double`s for the sides (l, l, w, w).
1. Initialize all values.

### Sample Outputs

```
Quadrilateral
Area = 8.97
Perimeter = 17.75
Number of sides: 4
Sum of angles: 360

Rectangle
Area = 19.5
Perimeter = 19.0
Number of sides: 4
Sum of angles: 360

Square
Area = 104.04
Perimeter = 40.8
Number of sides: 4
Sum of angles: 360
```

### Grading

Please make sure you have comments for every method you create. As always, your program will be graded on its functionality according to the project specifications and proper code style.
