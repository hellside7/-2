fun main() {
    println("введите длину первой стороны")
    val a :Int = readLine().toString().toInt()
    println("введите длину второй стороны")
    val b :Int = readLine().toString().toInt()
    println("введите длину третьей стороны")
    val c :Int = readLine().toString().toInt()
    when{
        a + b < c -> println("треугольник не существует")
        c + b < a -> println("треугольник не существует")
        a + c < b -> println("треугольник не существует")
        a == b && b == c -> println("треугольник равносторонний")
        a == b || b == c || a == c -> println("треугольниик равнобедренный")
            else ->  println("треугольник разносторонний")
    }

}