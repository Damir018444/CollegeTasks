class Practice10 {
    fun main() {
        print("\n-----Практическая работа 10-----\n")

        while (true) {
            print("\nВведите номер задания (от 1 до 4)\nили напишите \"0\" для выхода: ")
            val chc = readlnOrNull()
            when(chc){
                "1" -> {
                    print("\nВведите натуральное число n: ")
                    val n = readlnOrNull()?.toIntOrNull() ?: 0
                    println(task1(n).joinToString(", "))
                }
                "2" -> {
                    print("\nВведите количество уровней пирамиды: ")
                    val n = readlnOrNull()?.toIntOrNull() ?: 0
                    task2(n)
                }
                "3" -> {
                    print("\nВведите текст для шифрования: ")
                    val text = readlnOrNull() ?: ""
                    print("Введите сдвиг: ")
                    val shift = readlnOrNull()?.toIntOrNull() ?: 0
                    println("Зашифрованный текст: ${task3(text, shift)}")
                }
                "4" -> {
                    print("\nВведите натуральное число n: ")
                    val n = readlnOrNull()?.toIntOrNull() ?: 0
                    println(task4(n))
                }
                "0" -> break
                else -> print("Не понятно")
            }
        }
    }

    // 1) Список от n до 1
    fun task1(n: Int): List<Int> {
        return if (n <= 0) emptyList() else (n downTo 1).toList()
    }

    // 2) Генерация пирамиды
    fun task2(n: Int) {
        for (i in 1..n) {
            val spaces = " ".repeat(n - i)
            val symb = "#".repeat(2 * i - 1)
            println("$spaces$symb$spaces")
        }
    }

    // 3) Шифр Цезаря
    fun task3(text: String, shift: Int): String {
        return text.map { char ->
            when {
                char.isLetter() -> {
                    val base = if (char.isLowerCase()) 'a' else 'A'
                    ((char.code - base.code + shift) % 26 + base.code).toChar()
                }
                else -> char
            }
        }.joinToString("")
    }

    // 4)
    fun task4(n: Int): List<Any> {
        return (1..n).map { number ->
            when {
                number % 15 == 0 -> "ВизллБизлл"
                number % 3 == 0 -> "Физллл"
                number % 5 == 0 -> "Бизлллл"
                else -> number
            }
        }
    }
}