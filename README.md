# Groovy NullPointerException Due to Implicit Type Coercion

This repository demonstrates a subtle bug in Groovy related to implicit type coercion and null values.  When comparing a null value with a number in an if/else statement, a `NullPointerException` can occur unexpectedly.  The solution illustrates how to handle null values explicitly to prevent this common error.

## Bug Description

The `myMethod` function aims to return the larger of two numbers.  However, if either `a` or `b` is `null`, the comparison (`a > b`) results in a `NullPointerException`.

## Solution

The solution explicitly checks for null values using the `?.` safe navigation operator and the `||` operator for logical OR, providing default values when null is encountered.