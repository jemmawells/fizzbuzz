fun fizzbuzz(int: Int): String = when {
    int % 3 == 0 && int % 5 == 0 -> "Fizzbuzz"
    int % 3 == 0 -> "Fizz"
    int % 5 == 0 -> "Buzz"
    else -> int.toString()
}