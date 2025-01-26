```groovy
def myMethod(a, b) {
  def aValue = a ?: 0 // Use 0 as default if a is null
  def bValue = b ?: 0 // Use 0 as default if b is null
  if (aValue > bValue) {
    return aValue
  } else {
    return bValue
  }
}

println myMethod(5, 2) // Output: 5
println myMethod(2, 5) // Output: 5
println myMethod(null, 5) // Output: 5
println myMethod(5, null) // Output: 5
println myMethod(null, null) //Output: 0
```