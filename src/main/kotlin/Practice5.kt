class Practice5 {
    fun main() {
        print("\n-----Циклы-----")

        while (true) {
            println("\n\n1) Числа от 1 до 10\n" +
                    "2) Чётные числа от 1 до 20\n" +
                    "3) Сумма чисел от 1 до N\n" +
                    "4) Факториал числа\n" +
                    "5) Определить простоту числа\n" +
                    "6) Таблица умножения\n" +
                    "7) Фибоначни\n" +
                    "8) НОД\n" +
                    "9) \"Обратный порядок\"\n" +
                    "10) \"Сумма цифр числа\"\n" +
                    "11) Анаграммы\n" +
                    "12) Числовая последовательность\n" +
                    "13) Таблица квадратов\n" +
                    "14) Генерация случайных чисел\n" +
                    "15) Проверка палиндрома\n" +
                    "16) Сигма (сумма квадратов)\n" +
                    "17) Вывод символов\n" +
                    "18) Задача на лестницу\n" +
                    "19) \"Сортировка списка\"\n" +
                    "20) \"Простые числа в диапазоне\"\n" +
                    "21) Вывод даты\n" +
                    "22) Угадай число\n" +
                    "23) Сложение и умножение\n" +
                    "24) Транспонирование матрицы\n" +
                    "25) Кубы чисел\n" +
                    "26) Сумма четных и нечетных чисел\n" +
                    "27) Печать числа \"пирамида\"\n" +
                    "28) Определение порядка\n" +
                    "29) \"Сумма ряда\"\n" +
                    "30) \"Конвертация в двоичную систему\"\n" +
                    "31) Выйти из текущей практики")

            print("\nВаш выбор? (например: 1 или 1) ): ")
            val chc = readlnOrNull()

            when{
                (chc.equals("1)") or chc.equals("1")) -> task1()
                (chc.equals("2)") or chc.equals("2")) -> task2()
                (chc.equals("3)") or chc.equals("3")) -> task3()
                (chc.equals("4)") or chc.equals("4")) -> task4()
                (chc.equals("5)") or chc.equals("5")) -> task5()
                (chc.equals("6)") or chc.equals("6")) -> task6()
                (chc.equals("7)") or chc.equals("7")) -> task7()
                (chc.equals("8)") or chc.equals("8")) -> task8()
                (chc.equals("9)") or chc.equals("9")) -> task9()
                (chc.equals("10)") or chc.equals("10")) -> task10()
                (chc.equals("11)") or chc.equals("11")) -> task11()
                (chc.equals("12)") or chc.equals("12")) -> task12()
                (chc.equals("13)") or chc.equals("13")) -> task13()
                (chc.equals("14)") or chc.equals("14")) -> task14()
                (chc.equals("15)") or chc.equals("15")) -> task15()
                (chc.equals("16)") or chc.equals("16")) -> task16()
                (chc.equals("17)") or chc.equals("17")) -> task17()
                (chc.equals("18)") or chc.equals("18")) -> task18()
                (chc.equals("19)") or chc.equals("19")) -> task19()
                (chc.equals("20)") or chc.equals("20")) -> task20()
                (chc.equals("21)") or chc.equals("21")) -> task21()
                (chc.equals("22)") or chc.equals("22")) -> task22()
                (chc.equals("23)") or chc.equals("23")) -> task23()
                (chc.equals("24)") or chc.equals("24")) -> task24()
                (chc.equals("25)") or chc.equals("25")) -> task25()
                (chc.equals("26)") or chc.equals("26")) -> task26()
                (chc.equals("27)") or chc.equals("27")) -> task27()
                (chc.equals("28)") or chc.equals("28")) -> task28()
                (chc.equals("29)") or chc.equals("29")) -> task29()
                (chc.equals("30)") or chc.equals("30")) -> task30()
                (chc.equals("31)") or chc.equals("31")) -> {
                    MainClass().main()
                    break}
                else -> print("Не понятно")
            }
        }
    }


    //1) Числа от 1 до 10
    fun task1(){
        for(i in 1..10){
           // print("$i ")
        }
    }

    //2) Чётные числа от 1 до 20
    fun task2(){
        for(i in 1..20){
            if(i % 2 == 0) {
                print("$i ")
            }
        }
    }

    //3) Сумма чисел от 1 до N
    fun task3(){
        print("\nВведите число: ")
        val num1 = readln().toInt()
        var sum: Int = 0

        for(i in 1..num1){
            sum += i
        }
        print(sum)
    }

    //4) Факториал числа
    fun task4(){
        print("\nВведите число: ")
        val num1 = readln().toInt()
        var sum: Int = 1

        for(i in 1..num1){
            sum *= i
        }
        print(sum)
    }

    //5) Определить простоту числа
    fun task5(){
        print("\nВведите число: ")
        val num1 = readln().toInt()

        if((num1 % num1 == 0) and (num1>1)){
            print("Число $num1 простое")
        } else {
            print("Число $num1 не простое")
        }
    }

    // 6) Таблица умножения
    fun task6() {
        for (i in 1..10) {
            for (j in 1..10) {
                print("${i * j}\t")
            }
            println()
        }
    }

    // 7) Фибоначчи
    fun task7() {
        print("\nВведите количество чисел Фибоначчи: ")
        val n = readln().toInt()
        var a = 0
        var b = 1
        print("0 ")
        for (i in 1 until n) {
            print("$b ")
            val next = a + b
            a = b
            b = next
        }
    }

    // 8) НОД
    fun task8() {
        print("\nВведите первое число: ")
        val a = readln().toInt()
        print("Введите второе число: ")
        val b = readln().toInt()

        var res = 1
        for (i in 1..minOf(a, b)) {
            if (a % i == 0 && b % i == 0) {
                res = i
            }
        }
        println("НОД($a, $b) = $res")
    }

    // 9) Обратный порядок
    fun task9() {
        print("\nВведите строку: ")
        val input = readln()
        val reversed = input.reversed()
        println("Обратный порядок: $reversed")
    }

    // 10) Сумма цифр числа
    fun task10() {
        print("\nВведите число: ")
        val num = readln().toInt()
        var sum = 0
        var temp = num

        while (temp > 0) {
            sum += temp % 10
            temp /= 10
        }
        println("Сумма цифр числа $num = $sum")
    }

    // 11) Анаграммы
    fun task11() {
        print("\nВведите первую строку: ")
        val str1 = readln().lowercase().toCharArray().sorted()

        print("Введите вторую строку: ")
        val str2 = readln().lowercase().toCharArray().sorted()

        if (str1 == str2) {
            println("Строки являются анаграммами.")
        } else {
            println("Строки не являются анаграммами.")
        }
    }

    // 12) Числовая последовательность
    fun task12() {
        print("\nВведите начальное число: ")
        val start = readln().toInt()

        print("Введите шаг: ")
        val step = readln().toInt()

        for (i in start..(start + step * 10) step step) {
            print("$i ")
        }
    }

    // 13) Таблица квадратов
    fun task13() {
        println("\nТаблица квадратов чисел от 1 до 20:")
        for (i in 1..20) {
            println("$i^2 = ${i * i}")
        }
    }

    // 14) Генерация случайных чисел
    fun task14() {
        println("\nСлучайные числа:")
        repeat(10) {
            println((1..100).random())
        }
    }

    // 15) Проверка палиндрома
    fun task15() {
        print("\nВведите строку: ")
        val input = readln()

        if (input == input.reversed()) {
            println("Строка является палиндромом.")
        } else {
            println("Строка не является палиндромом.")
        }
    }

    // 16) Сигма (сумма квадратов)
    fun task16() {
        print("\nВведите число N: ")
        val n = readln().toInt()

        var sumOfSquares = 0
        for (i in 1..n) {
            sumOfSquares += i * i
        }

        println("Сумма квадратов от 1 до $n = $sumOfSquares")
    }

    // 17) Вывод символов
    fun task17() {
        print("\nВведите строку: ")
        val input = readln()

        for (char in input) {
            println(char)
        }
    }

    // 18) Задача на лестницу
    fun task18() {
        print("\nВведите высоту лестницы N: ")
        val n = readln().toInt()

        for (i in 1..n) {
            repeat(i) { print("#") }
            println()
        }
    }

    // 19) Сортировка списка
    fun task19() {
        // Пример массива двухзначных чисел
        val numbers = intArrayOf(34, 12, 56, 23, 45, 67, 89, 11)
        for(i in numbers.indices){
            for(j in i+1 until numbers.size){
                if(numbers[i] > numbers[j]){
                    // Меняем местами
                    val temp = numbers[i]
                    numbers[i] = numbers[j]
                    numbers[j] = temp
                }
            }
        }

        println("Отсортированный список: ${numbers.joinToString(", ")}")
    }

    // 20) Простые числа в диапазоне
    fun task20() {
        print("\nВведите начальное число: ")
        val start = readln().toInt()
        print("Введите конечное число: ")
        val end = readln().toInt()

        println("Простые числа в диапазоне от $start до $end:")
        for (num in start..end) {
            if (num > 1 && (2 until num).none { num % it == 0 }) {
                print("$num ")
            }
        }
    }

    // 21) Вывод даты
    fun task21() {
        print("\nВведите год: ")
        val year = readln().toInt()
        print("Введите месяц: ")
        val month = readln().toInt()

        val daysInMonth = when (month) {
            1, 3, 5, 7, 8, 10, 12 -> 31
            4, 6, 9, 11 -> 30
            2 -> if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 29 else 28
            else -> {
                println("Некорректный месяц.")
                return
            }
        }

        println("Даты в месяце $month/$year:")
        for (day in 1..daysInMonth) {
            println("$day/$month/$year")
        }
    }

    // 22) Угадай число
    fun task22() {
        val randomNumber = (1..100).random()
        var guessed = false

        println("\nУгадайте число от 1 до 100:")

        while (!guessed) {
            print("Введите ваше предположение: ")
            val guess = readln().toInt()

            when {
                guess < randomNumber -> println("Слишком маленькое число!")
                guess > randomNumber -> println("Слишком большое число!")
                else -> {
                    println("Вы угадали число $randomNumber!")
                    guessed = true
                }
            }
        }
    }

    // 23) Сложение и умножение
    fun task23() {
        while (true) {
            print("\nВведите первое число (или 'стоп' для выхода): ")
            val input1 = readln()
            if (input1.lowercase() == "стоп") break

            print("Введите второе число: ")
            val input2 = readln()
            if (input2.lowercase() == "стоп") break

            val sum = input1.toInt() + input2.toInt()
            val product = input1.toInt() * input2.toInt()

            println("Сумма: $sum")
            println("Произведение: $product")
        }
    }

    // 24) Транспонирование матрицы
    fun task24() {
        print("\nВведите количество строк матрицы: ")
        val rows = readln().toInt()
        print("Введите количество столбцов матрицы: ")
        val cols = readln().toInt()

        val matrix = Array(rows) { IntArray(cols) }

        for (i in 0 until rows) {
            for (j in 0 until cols) {
                print("Введите элемент [$i][$j]: ")
                matrix[i][j] = readln().toInt()
            }
        }

        val transposedMatrix = Array(cols) { IntArray(rows) }

        for (i in 0 until rows) {
            for (j in 0 until cols) {
                transposedMatrix[j][i] = matrix[i][j]
            }
        }

        println("Транспонированная матрица:")
        for (i in transposedMatrix.indices) {
            for (j in transposedMatrix[i].indices) {
                print("${transposedMatrix[i][j]} ")
            }
            println()
        }
    }

    // 25) Кубы чисел
    fun task25() {
        println("\nКубы чисел от 1 до 10:")
        for (i in 1..10) {
            println("$i^3 = ${i * i * i}")
        }
    }

    // 26) Сумма четных и нечетных чисел
    fun task26() {
        print("\nВведите число N: ")
        val n = readln().toInt()

        var evenSum = 0
        var oddSum = 0

        for (i in 1..n) {
            if (i % 2 == 0) evenSum += i else oddSum += i
        }

        println("Сумма четных чисел от 1 до $n = $evenSum")
        println("Сумма нечетных чисел от 1 до $n = $oddSum")
    }

    // 27) Печать числа "пирамида"
    fun task27() {
        print("\nВведите высоту пирамиды N: ")
        val n = readln().toInt()

        for (i in 1..n) {
            repeat(n - i) { print(" ") }
            repeat(i * 2 - 1) { print("$i") }
            println()
        }
    }

    // 28) Определение порядка
    fun task28() {
        print("\nВведите количество чисел N: ")
        val n = readln().toInt()
        val numbers = IntArray(n)

        for (i in numbers.indices) {
            print("Введите число ${i + 1}: ")
            numbers[i] = readln().toInt()
        }

        numbers.sort()
        println("Числа в порядке возрастания: ${numbers.joinToString(", ")}")
    }

    // 29) Сумма ряда
    fun task29() {
        print("\nВведите число N: ")
        val n = readln().toInt()

        var sumSeries = 0.0

        for (i in 1..n) {
            sumSeries += 1.0 / i
        }
        println("Сумма ряда от 1 до $n = $sumSeries")
    }

    // 30) Конвертация в двоичную систему
    fun task30() {
        print("\nВведите целое число для конвертации в двоичную систему: ")
        val number = readln().toInt()

        val binaryString = number.toString(2)
        println("Двоичное представление числа $number: $binaryString")
    }
}