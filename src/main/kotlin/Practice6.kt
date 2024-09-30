import kotlin.random.Random

class Practice6 {
    fun main() {
        print("\n-----Массивы-----")

        while (true) {
            println("\n\n1) Создание и вывод элементов\n" +
                    "2) Сумма элементов массива\n" +
                    "3) Максимальное и минимальное значение\n" +
                    "4) Сортировка массива\n" +
                    "5) Уникальные элементы\n" +
                    "6) Четные и нечетные числа\n" +
                    "7) Реверс массива\n" +
                    "8) Поиск элемента\n" +
                    "9) \"Копирование массива\"\n" +
                    "10) \"Сумма четных чисел\"\n" +
                    "11) Пересечение массивов\n" +
                    "12) Перестановка элементов\n" +
                    "13) Заполнение случайными числами\n" +
                    "14) Числа Прокопенко\n" +
                    "15) Проверка на палиндром\n" +
                    "16) Конкатенация двух массивов\n" +
                    "17) Сумма и произведение\n" +
                    "18) Группировка чисел\n" +
                    "19) \"Слияние двух массивов\"\n" +
                    "20) \"Числовая последовательность\"\n" +
                    "21) Удаление элемента\n" +
                    "22) Поиск второго максимального\n" +
                    "23) Объединение массивов\n" +
                    "24) Транспонирование матрицы\n" +
                    "25) Линейный поиск\n" +
                    "26) Среднее арифметическое\n" +
                    "27) Максимальная последовательность\n" +
                    "28) Ввод и вывод массива\n" +
                    "29) Нахождение медианы\n" +
                    "30) Распределение по группам\n" +
                    "31) Выйти из текущей практики")

            print("\nВаш выбор?: ")
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
                (chc.equals("31)") or chc.equals("31")) -> break
                else -> print("Не понятно")
            }
        }
    }


    // 1) Создание и вывод элементов
    fun task1() {
        val numbers = intArrayOf(1, 2, 3, 4, 5)
        println("Элементы массива: ${numbers.joinToString(", ")}")
    }

    // 2) Сумма элементов массива
    fun task2() {
        val numbers = intArrayOf(1, 2, 3, 4, 5)
        val sum = numbers.sum()
        println("Сумма элементов массива: $sum")
    }

    // 3) Максимальное и минимальное значение
    fun task3() {
        val numbers = intArrayOf(10, 20, 5, 30, 15, 25, 40, 35, 50, 45)
        val max = numbers.maxOrNull()
        val min = numbers.minOrNull()
        println("Максимальное значение: $max")
        println("Минимальное значение: $min")
    }

    // 4) Сортировка массива
    fun task4() {
        val numbers = intArrayOf(5, 3, 8, 1, 4)
        numbers.sort()
        println("Отсортированный массив: ${numbers.joinToString(", ")}")
    }

    // 5) Уникальные элементы
    fun task5() {
        val numbers = intArrayOf(1, 2, 2, 3, 4, 4, 5)
        val uniqueNumbers = numbers.distinct()
        println("Уникальные элементы: ${uniqueNumbers.joinToString(", ")}")
    }

    // 6) Четные и нечетные числа
    fun task6() {
        val numbers = intArrayOf(1, 2, 3, 4, 5, 6)
        val evenNumbers = numbers.filter { it % 2 == 0 }
        val oddNumbers = numbers.filter { it % 2 != 0 }

        println("Четные числа: ${evenNumbers.joinToString(", ")}")
        println("Нечетные числа: ${oddNumbers.joinToString(", ")}")
    }

    // 7) Реверс массива
    fun task7() {
        val numbers = intArrayOf(1, 2, 3, 4, 5)
        val reversedNumbers = numbers.reversedArray()
        println("Реверсированный массив: ${reversedNumbers.joinToString(", ")}")
    }

    // 8) Поиск элемента
    fun task8() {
        val numbers = intArrayOf(1, 2, 3, 4, 5)
        print("Введите элемент для поиска: ")
        val element = readln().toInt()

        val index = numbers.indexOf(element)

        if (index != -1) {
            println("Элемент $element найден на индексе $index.")
        } else {
            println("Элемент $element не найден.")
        }
    }

    // 9) Копирование массива
    fun task9() {
        val originalArray = intArrayOf(1, 2, 3)
        val copiedArray = originalArray.copyOf()

        println("Скопированный массив: ${copiedArray.joinToString(", ")}")
    }

    // 10) Сумма четных чисел
    fun task10() {
        val numbers = intArrayOf(1, 2, 3, 4, 5)
        val evenSum = numbers.filter { it % 2 == 0 }.sum()

        println("Сумма четных чисел: $evenSum")
    }

    //11) Пересечение массивов
    fun task11() {
        val array1 = intArrayOf(1, 2, 3)
        val array2 = intArrayOf(2, 3, 4)

        val intersection = array1.intersect(array2.toSet())

        println("Пересечение массивов: ${intersection.joinToString(", ")}")
    }

    //12) Перестановка элементов
    fun task12() {
        val array = intArrayOf(1, 2, 3)
        print("Введите индексы для перестановки (например: индекс1 индекс2): ")
        val (index1, index2) = readln().split(" ").map { it.toInt() }

        // Перестановка элементов
        if (index1 in array.indices && index2 in array.indices) {
            val temp = array[index1]
            array[index1] = array[index2]
            array[index2] = temp

            println("Массив после перестановки: ${array.joinToString(", ")}")
        } else {
            println("Некорректные индексы.")
        }
    }

    //13) Заполнение случайными числами
    fun task13() {
        val randomNumbers = IntArray(20) { Random.nextInt(1,101) }
        println("Случайные числа: ${randomNumbers.joinToString(", ")}")
    }

    //14) Числа Прокопенко
    fun task14() {
        val numbers = intArrayOf(1,2,3,4,5,-6,-9,-12,-15)
        println("Числа Прокопенко (делятся на три): ${numbers.filter { it % 3 ==0 }.joinToString(", ")}")
    }

    //15) Проверка на палиндром
    fun task15() {
        print("\nВведите размер массива: ")
        val n = readln().toInt()
        val arr = IntArray(n)

        for (i in arr.indices) {
            print("Введите элемент $i: ")
            arr[i] = readln().toInt()
        }

        if (arr.contentEquals(arr.reversedArray())) {
            println("Массив является палиндромом.")
        } else {
            println("Массив не является палиндромом.")
        }
    }

    //16) Конкатенация двух массивов
    fun task16() {
        val array1 = intArrayOf(1,2)
        val array2 = intArrayOf(3 ,4)

        // Объединение массивов
        val concatenatedArray = array1 + array2

        println("Объединенный массив: ${concatenatedArray.joinToString(", ")}")
    }

    //17) Сумма и произведение
    fun task17() {
        val numbers = intArrayOf(1 ,2 ,3 ,4 ,5)

        // Сумма и произведение элементов массива
        val sum = numbers.sum()
        val product = numbers.reduce { acc , i -> acc * i }

        println("Сумма элементов массива: $sum")
        println("Произведение элементов массива: $product")
    }

    //18) Группировка чисел
    fun task18() {
        print("\nВведите количество чисел в массиве (не менее чем кратно пяти): ")
        var n: Int

        do {
            n = readln().toInt()
            if (n % 5 != 0) {
                println("Количество должно быть кратно пяти. Попробуйте снова.")
            }
        } while (n % 5 != 0)

        val numbers = IntArray(n)

        // Заполнение массива
        for (i in numbers.indices) {
            print("Введите элемент $i: ")
            numbers[i] = readln().toInt()
        }

        // Группировка и вывод
        for (i in numbers.indices step 5) {
            val group = numbers.slice(i until (i + 5).coerceAtMost(n)) // Получаем подмассив из 5 элементов
            println("Группа ${(i / 5) + 1}: ${group.joinToString(", ")}")
        }
    }

    //19) Слияние двух массивов
    fun task19() {
        // Два отсортированных массива
        val array1 = intArrayOf(1 ,3 ,5)
        val array2 = intArrayOf(2 ,4 ,6)

        // Объединение и сортировка массивов
        val mergedSortedArray = (array1 + array2).sortedArray()

        println("Слитый отсортированный массив: ${mergedSortedArray.joinToString(", ")}")
    }

    // 20) Числовая последовательность (арифметическая прогрессия)
    fun task20() {
        print("\nВведите начальное число: ")
        val startNum = readln().toInt()

        print("Введите шаг (разность): ")
        val step = readln().toInt()

        print("Введите количество чисел в последовательности: ")
        val count = readln().toInt()

        // Создаем массив для хранения арифметической прогрессии
        val arithmeticProgression = IntArray(count)

        // Заполняем массив
        for (i in 0 until count) {
            arithmeticProgression[i] = startNum + i * step
        }

        // Выводим результат
        println("Арифметическая прогрессия: ${arithmeticProgression.joinToString(", ")}")
    }

    //21. Удаление элемента
    fun task21(){
        print("\nВведите размер массива:")
        val n= readln().toInt()

        var arr= IntArray(n)

        for(i in arr.indices){
            print("\nВведите элемент $i :")
            arr[i]= readln().toInt()
        }

        print("\nВведите элемент для удаления:")
        val element= readln().toInt()

        arr= arr.filter { it != element }.toIntArray()

        println("\nМассив после удаления элемента:")
        for(i in arr){
            print("$i ")
        }

    }

    //22. Поиск второго максимального
    fun task22(){
        print("\nВведите размер массива:")
        val n = readln().toInt()

        val arr = IntArray(n)

        for(i in arr.indices){
            print("Введите элемент $i :")
            arr[i]= readln().toInt()
        }

        val max = arr.maxOrNull()

        val secondMax= arr.filter { it < max!! }.maxOrNull()

        if(secondMax!=null){
            print("Второй максимальный элемент в массиве:$secondMax ")
        }else{
            print("Второй максимальный элемент не найден.")
        }
    }

    //23. Объединение массивов
    fun task23(){
        print("\nВведите размер первого массива:")
        val n = readln().toInt()

        val firstArr = IntArray(n)

        for(i in firstArr.indices){
            print("\nВведите элемент первого массива $i :")
            firstArr[i] = readln().toInt()
        }

        print("\nВведите размер второго массива:")
        val m= readln().toInt()

        val secondArr = IntArray(m)

        for(i in secondArr.indices){
            print("\nВведите элемент второго массива $i :")
            secondArr[i] = readln().toInt()
        }

        val mergedArr= firstArr + secondArr

        println("\nОбъединенный массив:")
        for(i in mergedArr){
            print("$i ")
        }
    }

    //24. Транспонирование матрицы
    fun task24(){
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

    //25. Линейный поиск
    fun task25(){
        print("\nВведите размер массива:")
        val n= readln().toInt()

        val arr= IntArray(n)

        for(i in arr.indices){
            print("\nВведите элемент $i :")
            arr[i]= readln().toInt()
        }

        print("\nВведите элемент для поиска:")
        val element= readln().toInt()

        // Линейный поиск
        var found=false

        for(i in arr.indices){
            if(arr[i]==element){
                found=true
                break
            }
        }

        if(found){
            print("\nЭлемент найден.")
        }else{
            print("\nЭлемент не найден.")
        }
    }

    //26. Среднее арифметическое
    fun task26(){
        print("\nВведите размер массива:")
        val n= readln().toInt()

        val arr= IntArray(n)

        for(i in arr.indices){
            print("\nВведите элемент $i :")
            arr[i]= readln().toInt()
        }

        // Среднее арифметическое
        val average=arr.average()

        print("\nСреднее арифметическое:$average ")
    }

    //27. Максимальная последовательность
    fun task27(){
        print("\nВведите размер массива:")
        val n = readln().toInt()

        val arr = IntArray(n)

        for(i in arr.indices){
            print("\nВведите элемент $i :")
            arr[i]= readln().toInt()
        }

        var maxCount = 0
        var currentCount = 0

        for(i in arr.indices){

            if(i==0 ||arr[i]==arr[i-1]){
                currentCount++
            } else {
                currentCount=1
            }

            if(currentCount>maxCount){
                maxCount=currentCount
            }
        }

        if(maxCount>0){
            print("\nМаксимальная последовательность одинаковых элементов:$maxCount ")
        }else{
            print("\nНет последовательностей одинаковых элементов.")
        }
    }

    //28. Ввод и вывод массива
    fun task28(){
        print("\nВведите размер массива:")
        val n = readln().toInt()

        val arr = IntArray(n)

        for(i in arr.indices){
            print("\nВведите элемент $i :")
            arr[i]= readln().toInt()
        }

        // Вывод элементов массива
        println("\nЭлементы массива:")
        for(i in arr){
            print("$i ")
        }
    }

    //29. Нахождение медианы
    fun task29(){
        print("\nВведите размер массива:")
        val n= readln().toInt()
        val arr= IntArray(n)

        for(i in arr.indices){
            print("\nВведите элемент $i :")
            arr[i]= readln().toInt()
        }

        arr.sort()

        val median: Double

        median = if(n%2==0){
            (arr[n/2-1]+arr[n/2])/2.0
        } else {
            arr[n/2].toDouble()
        }

        println ("Медиана:$median ")
    }

    //30. Распределение по группам
    fun task30(){
        // Создание и заполнение массива из случайных чисел
        val randomNumbers= IntArray(100){ Random.nextInt(0 ,100)}

        // Группировка по десять элементов
        for(i in randomNumbers.indices step 10 ){
            println ("Группа ${(i/10)+1}: ${randomNumbers.slice(i until i+10).joinToString(", ")}")
        }
    }
}