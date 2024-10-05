import java.sql.Struct
import kotlin.math.sqrt

class Practice9 {
    fun main() {
        print("\n-----Творческие задачи-----\n")

        while (true) {
            print("\nВведите номер задания (от 1 до 10)\nили напишите \"0\" для выхода с практической: ")
            val chc = readlnOrNull()

            when(chc) {
                "1" -> task1()
                "2" -> task2("Hello World")
                "3" -> print("\n450 рублей это ${task3(450)} долларов")
                "4" -> print("\n${task4()}")
                "5" -> {
                    print("\nВведите число N: ")
                    val n = readln().toInt()
                    if(n>=2) {
                        var i = 1
                        val list = List(n) { i++ }
                        print("простые числа: ${task5(list).joinToString(", ")}")
                    } else { print("Простых чисел нет") }
                }
                "6" -> task6()
                "7" -> task7()
                "8" -> task8()
                "9" -> task9()
                "10" -> task10()
                "0" -> break
                else -> print("Не понятно")
            }
        }
    }


    // 1) Генератор случайных чисел от 1 до 100
    fun task1() {
        print("\n")
        for(i in 1..10){
            val num = (1..100).random()
            print("$num, ")
        }
    }

    // 2) Гласные и согласные
    fun task2(string: String) {
        val str = (string.lowercase()).replace("\\s+".toRegex(),"")
        val glas = "aeyuio"
        var countG = 0
        var countS = 0

        for(char in str){
            if(char in glas){
                countG++
            } else { countS++ }
        }
        print("\nКоличество гласных: $countG\nКоличество согласных: $countS")
    }

    // 3) Конвертер валют
    fun task3(rubl: Int): String {
        val curs = 95.0
        val res = rubl.toDouble() / curs
        return String.format("%.3f", res)
    }

    // 4) Анаграммы
    fun task4(): String {
        val str1 = "earth"
        val str2 = "heart"
        var count = 0

        if(str1.length == str2.length) {
            for (char in str1) {
                if (char in str2) {
                    count++
                }
            }
        } else { return "Строки не являются анаграммами" }

        return if(str1.length == count){
            "Строки являются анаграммами"
        } else {
            "Строки не являются анаграммами"
        }
    }

    // 5) Нахождение простых чисел
    fun task5(list: List<Int>): List<Int> {
        val resList = mutableListOf<Int>()

        for (i in list) {
            if (i < 2) continue
            var isPrime = true
            for (j in 2..sqrt(i.toDouble()).toInt()) {
                if (i % j == 0) {
                    isPrime = false
                    break
                }
            }
            if (isPrime) {
                resList.add(i)
            }
        }
        return resList
    }

    // 6) Сортировка строк
    fun task6() {
        println("\nВведите строки через запятую:")
        val input = readln().split(",").map { it.trim() }.sorted()
        println("Отсортированные строки: ${input.joinToString(", ")}")
    }

    // 7) Изменение регистра
    fun task7() {
        println("\nВведите строку:")
        val input = readln()
        val toggledCase = input.map {
            if (it.isUpperCase()) it.lowercaseChar() else it.uppercaseChar()
        }.joinToString("")

        println("Измененная строка: $toggledCase")
    }

    // 8) Игра "Угадай число"
    fun task8() {
        val randomNum = (1..100).random()
        var num: Int?

        println("Угадайте число от 1 до 100:")

        do {
            num = readln().toIntOrNull()
            when {
                num == null -> println("Введите корректное число.")
                num < randomNum -> println("Слишком маленькое число!")
                num > randomNum -> println("Слишком большое число!")
                else -> println("Вы угадали число!")
            }
        } while (num != randomNum)
    }

    // 9) Генератор паролей
    fun task9() {
        println("\nВведите длину пароля:")
        val length = readln().toIntOrNull() ?: return println("Некорректная длина.")

        val chars = ('a'..'z') + ('A'..'Z') + ('0'..'9')
        val spec_s = "!@#$%^&*()-_=+[]{}|;:',.<>?/`~"

        val password = (1..length).map { chars.random() + spec_s.indices.random() }.joinToString("")

        println("Сгенерированный пароль: $password")
    }

    // 10) Самое длинное слово в строке
    fun task10() {
        println("\nВведите строку: ")
        val input = readln().split(Regex("\\W+"))

        val longestWord = input.maxByOrNull { it.length } ?: ""

        println("Самое длинное слово: $longestWord")
    }
}
