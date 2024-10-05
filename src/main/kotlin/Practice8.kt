import kotlin.math.pow
import kotlin.math.sqrt

class Practice8 {
    fun main() {
        print("\n-----Функциональное программирование-----")

        while (true) {
            print("\n\nВведите номер задания (от 1 до 42)\nили напишите \"0\" для выхода с практической: ")
            val chc = readlnOrNull()
            when(chc){
                "1" -> {
                    var i = 1
                    val list = List(100) { i++ }
                    print("\nСумма: ${task1(list)}")
                }
                "2" -> {
                    var i = 1
                    val list = List(100) { i++ }
                    print("\nРазность: ${task2(list)}")
                }
                "3" -> {
                    val list1 = listOf(1, 2, 3)
                    val list2 = listOf(4, 5, 6)
                    print("\nОбъединение: ${task3(list1, list2)}")
                }
                "4" -> print("\nРезультат: ${task4(0.5, 100.0, 30.0)}")
                "5" -> print("\nРезультат: ${task5(0.7, 150.0, 100.0)}")
                "6" -> print("\nРезультат: ${task6(40, 50)}")
                "7" -> print("\nРезультат: ${task7(200)}")
                "8" -> print("\nКадры: ${task8(10, 60)}")
                "9" -> print("\nРезультат: ${task9(4, 256)}")
                "10" -> print("\nРезультат: ${task10("cherry", 3)}")
                "11" -> print("\nОтвет: ${task11("7*4-2")}")
                "12" -> print("\nGoogle: ${task12(3)}")
                "13" -> task13()
                "14" -> print("\nСумма: ${task14(5, 10)}")
                "15" -> print("\nБольшее число: ${task15(10, 20)}")
                "16" -> print("\nЧетность: ${task16(4)}")
                "17" -> print("\nФакториал: ${task17(5)}")
                "18" -> print("\nПростое число: ${task18(7)}")
                "19" -> {
                    var i = 1
                    val list = List(100) { i++ }
                    print("\nСумма чисел в массиве: ${task19(list)}")
                }
                "20" -> {
                    var i = 1
                    val list = List(100) { i++ }
                    print("\nНаибольшее число в массиве: ${task20(list)}")
                }
                "21" -> {
                    val list = listOf(5, 3, 8, 1)
                    println("\nОтсортированный массив: ${task21(list)}")
                }
                "22" -> { println("\nПалиндром? : ${task22("level")}") }
                "23" -> { println("\nКоличество символов: ${task23("Hello World")}") }
                "24" -> { println("\nВерхний регистр: ${task24("hello")}") }
                "25" -> { println("\nОбъединение строк: ${task25("Hello", "World")}") }
                "26" -> { println("\nПоследний элемент массива: ${task26(listOf(1, 2, 3))}") }
                "27" -> { println("\nЭлемент присутствует? : ${task27(listOf(1, 2, 3), 2)}") }
                "28" -> { println("\nМассив от 1 до N: ${task28(10)}") }
                "29" -> { println("\nМаксимум и минимум в массиве: ${task29(listOf(5, 3, 8, 1))}") }
                "30" -> { println("\nСумма чисел от 1 до N: ${task30(10)}") }
                "31" -> { println("\nТемпература в Фаренгейтах: ${task31(25.0)}") }
                "32" -> { println("\nОбратный порядок строки: ${task32("Hello")}") }
                "33" -> { println("\nЭлемент по индексу: ${task33(listOf(1, 2, 3), 1)}") }
                "34" -> { println("\nСтрока без пробелов: '${task34("H e llo W orld")}'") }
                "35" -> { println("\nСумма первых N натуральных чисел: ${task35(10)}") }
                "36" -> { println("\nПодстрока содержится? : ${task36("Hello", "ell")}") }
                "37" -> { print("\n"); task37(5) }
                "38" -> { println("\nДлина строки: ${task38("Hello World")}") }
                "39" -> { println("\nПеревернутый массив: ${task39(listOf(1, 2, 3))}") }
                "40" -> { println("\nКопия массива: ${task40(listOf(1, 2, 3))}") }
                "41" -> { println("\nКоличество гласных в строке: ${task41("Hello World")}") }
                "42" -> { println("\nИндекс первого вхождения элемента: ${task42(listOf(1, 2, 3), 2)}") }
                "0" -> break
                else -> print("Не понятно")
            }
        }
    }

    // 1
    fun task1(list: List<Int>): Int {
        return list.sum()
    }

    // 2
    fun task2(list: List<Int>): Int {
        return list.maxOrNull()!! - list.minOrNull()!!
    }

    // 3
    fun task3(list1: List<Int>, list2: List<Int>): List<Int> {
        return list1 + list2
    }

    // 4
    fun task4(prob: Double, prize: Double, pay: Double): Boolean {
        return prob * prize > pay
    }

    // 5 (аналогична задаче 4)
    fun task5(prob: Double, prize: Double, pay: Double): Boolean {
        return prob * prize > pay
    }

    // 6
    fun task6(a: Int, b: Int): Boolean {
        return (a + b) < 100
    }

    // 7
    fun task7(number: Int): Boolean {
        return number % 100 == 0
    }

    // 8
    fun task8(minutes: Int, fps: Int): Int {
        return minutes * (fps * 60)
    }

    // 9
    fun task9(k: Int, n: Int): Boolean {
        return k.toDouble().pow(k) == n.toDouble()
    }

    // 10
    fun task10(txt: String, n: Int): String {
        return if (n <= 0) "" else txt + task10(txt, n - 1)
    }

    // 11
    fun task11(equationStr: String): Int {
        val tokens = equationStr.split("(?<=[-+*/])|(?=[-+*/])".toRegex()).map { it.trim() }
        val numbers = mutableListOf<Int>()
        val operators = mutableListOf<Char>()
        for (token in tokens) {
            when {
                token.isEmpty() -> continue
                token[0].isDigit() -> numbers.add(token.toInt())
                else -> operators.add(token[0])
            }
        }
        var result = numbers[0]
        for (i in operators.indices) {
            result = when (operators[i]) {
                '+' -> result + numbers[i + 1]
                '-' -> result - numbers[i + 1]
                '*' -> result * numbers[i + 1]
                '/' -> result / numbers[i + 1]
                else -> throw IllegalArgumentException("Unsupported operator: ${operators[i]}")
            }
        }
        return result
    }

    // 12
    fun task12(number: Int): String {
        return "G${"o".repeat(number)}gle"
    }

    // 13
    fun task13() {
        println("Привет, мир!")
    }

    // 14
    fun task14(a: Int, b: Int): Int {
        return a + b
    }

    // 15
    fun task15(a: Int, b: Int): Int {
        return maxOf(a, b)
    }

    // 16
    fun task16(number: Int): Boolean {
        return number % 2 == 0
    }

    // 17 (факториал)
    fun task17(n: Int): Long {
        return if (n <= 1) 1 else n * task17(n - 1)
    }

    // 18 (проверка на простоту)
    fun task18(n: Int): Boolean {
        if (n <= 1) return false
        for (i in 2..<sqrt(n.toDouble()).toInt() + 1) {
            if (n % i == 0) return false
        }
        return true
    }

    // 19 (сумма чисел в массиве)
    fun task19(list: List<Int>): Int {
        return list.sum()
    }

    // 20 (наибольшее число в массиве)
    fun task20(list: List<Int>): Int? {
        return list.maxOrNull()
    }

    // 21 (сортировка массива)
    fun task21(list: List<Int>): List<Int> {
        return list.sorted()
    }

    // 22 (проверка палиндрома)
    fun task22(str: String): Boolean {
        return str == str.reversed()
    }

    // 23 (количество символов в строке)
    fun task23(str: String): Int {
        return str.length
    }

    // 24 (конвертация в верхний регистр)
    fun task24(str: String): String {
        return str.uppercase()
    }

    // 25 (объединение строк)
    fun task25(str1: String, str2: String): String {
        return str1 + str2
    }

    // 26 (возвращение последнего элемента массива)
    fun task26(arrayList : List<Int>): Int?{
        return arrayList.lastOrNull()
    }

    // 27 (проверка наличия элемента в массиве)
    fun task27(arrayList : List<Int>, element : Int): Boolean{
        return element in arrayList
    }

    // 28 (создание массива от N до M)
    fun task28(n : Int): List<Int> {
        return (1..n).toList()
    }

    // 29 (максимум и минимум одновременно)
    fun task29(arrayList : List<Int>): Pair<Int?,Int?>{
        val max = arrayList.maxOrNull()
        val min = arrayList.minOrNull()
        return Pair(max,min)
    }

    // 30 (сумма чисел от N до M)
    fun task30(n : Int): Int {
        return (n * (n +1))/2
    }

    // 31 (преобразование Celsius в Fahrenheit)
    fun task31(celsius : Double): Double {
        return celsius * 9 / 5 + 32
    }

    // 32 (обратный порядок строки)
    fun task32(str : String): String {
        return str.reversed()
    }

    // 33 (поиск элемента по индексу в массиве)
    fun task33(arrayList : List<Int>, index : Int): Int? {
        return if(index in arrayList.indices) arrayList[index] else null
    }

    // 34 (удаление пробелов из строки)
    fun task34(str : String): String {
        return str.replace("\\s".toRegex(), "")
    }

    // 35 (сумма первых N натуральных чисел)
    fun task35(n : Int): Int {
        return n * (n +1)/2
    }

    // 36 (проверка строки на наличие подстроки)
    fun task36(str : String , subStr : String ): Boolean {
        return str.contains(subStr)
    }

    // 37 (печать таблицы умножения от 1 до 10 для заданного числа)
    fun task37(number : Int){
        for(i in 1..10){
            println("$number x $i =${number*i}")
        }
    }

    // 38 (нахождение длины строки)
    fun task38(str:String ):Int{
        return str.length
    }

    // 39 (переворот массива)
    fun task39(arrayList : List<Int>): List<Int> {
        return arrayList.reversed()
    }

    // 40 (копирование массива)
    fun task40(arrayList : List<Int>): List<Int> {
        return arrayList.toList()
    }

    // 41 (количество гласных в строке)
    fun task41(str:String ):Int{
        val glas ="aeiouAEIOU"
        var count=0
        for(char in str){
            if(char in glas){
                count++
            }
        }
        return count
    }

    // 42 (индекс первого вхождения элемента)
    fun task42(arrayList : List<Int>, element:Int ):Int{
        for(i in arrayList.indices){
            if(arrayList[i]==element){
                return i
            }
        }
        return -1
    }
}