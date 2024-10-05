import java.sql.Struct

class Practice9 {
    fun main() {
        print("\n-----Творческие задачи-----")

        while (true) {
            print("\n\nВведите номер задания (от 1 до 10)\nили напишите \"0\" для выхода с практической: ")
            val chc = readlnOrNull()

            when(chc) {
                "1" -> task1()
                "2" -> task2("Hello World")
                "3" -> print("\n450 рублей это ${task3(450)} долларов")
                "4" -> print("\n${task4()}")
                "5" -> task5()
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
    fun task5() {

    }

    // 6) Попеды, ничьи и поражения
    fun task6() {

    }

    // 7) Попеды, ничьи и поражения
    fun task7() {

    }

    // 8) Найти палиндром слова
    fun task8() {

    }

    // 9) Попеды, ничьи и поражения
    fun task9() {

    }

    // 10) Попеды, ничьи и поражения
    fun task10() {

    }
}
