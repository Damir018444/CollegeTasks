class Practice5 {
    fun main() {
        print("\n-----Циклы-----")

        while (true) {
            println("\n\n1) Числа от 1 до 10\n" +
                    "2) Чётные числа от 1 до 20\n" +
                    "3) Сумма чисел от 1 до N\n" +
                    "4) Факториал числа\n" +
                    "5) \n" +
                    "6) Угадай число\n" +
                    "7) Определение длины строки\n" +
                    "8) Определить время приготовления по типу пищи\n" +
                    "9) \"Способы оплаты\"\n" +
                    "10) \"Группа крови\"\n" +
                    "11) \"Национальности\"\n" +
                    "12) \"Коды ошибок\"\n"+
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
            print("$i ")
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

    //5) Определить знак числа
    fun task5(){
        print("\nВведите число: ")
        val num1 = readln().toInt()

        if((num1 % num1 == 0) and (num1>1)){
            print("Число $num1 простое")
        } else {
            print("Число $num1 не простое")
        }
    }

    //6) Угадай число
    fun task6(){
        print("\nЗагадай мне число от 1 до 10: ")
        val num1 = readln().toInt()

        when(num1){
            1 -> print("Это число 1")
            2 -> print("Это число 2")
            3 -> print("Это число 3")
            4 -> print("Это число 4")
            5 -> print("Это число 5")
            6 -> print("Это число 6")
            7 -> print("Это число 7")
            8 -> print("Это число 8")
            9 -> print("Это число 9")
            10 -> print("Это число 10")
            else -> print("Не понятно")
        }
    }

    //7) Определение длины строки
    fun task7(){
        print("\nВведите любую строку: ")
        val num1: String = readln()

        print("Длина строки = "+num1.length)
    }

    //8) Определить время приготовления по типу пищи
    fun task8(){
        print("\n1) Мясо\n2) Рыба\n3) Маршмеллоу\n4) Сосиски\n5) Доширак\n6) Ролтон\nВведите тип пищи по номеру: ")
        val num1: String = readln()

        when{
            (num1 == "1") or (num1 == "1)") -> print("20-40 минут")
            (num1 == "2") or (num1 == "2)") -> print("20 минут")
            (num1 == "3") or (num1 == "3)") -> print("45 минут")
            (num1 == "4") or (num1 == "4)") -> print("5-7 минут")
            (num1 == "5") or (num1 == "5)") -> print("3-4 минуты")
            (num1 == "6") or (num1 == "6)") -> print("3-5 минут")
            else -> print("Не понятно")
        }
    }

    //9) "Способы оплаты"
    fun task9(){
        print("\n\"наличные\"\n\"Кредитная карта\"\n\"PayPal\"\nВыберите способ оплаты: ")
        val num1: String = readln().lowercase()

        when (num1){
            "наличные" -> print("Вы выбрали способ оплаты: Наличные")
            "кредитная карта" -> print("Вы выбрали способ оплаты: Кредитная карта")
            "paypal" -> print("Вы выбрали способ оплаты: PayPal")
            else -> print("Не понятно")
        }
    }

    //10) "Группа крови"
    fun task10(){
        print("\n\"O\"\n\"A\"\n\"B\"\n\"AB\"\nВыберите свою группу крови: ")
        val num1: String = readln().lowercase()

        when (num1){
            "a" -> print("Вам можно перелить группы O и A")
            "b" -> print("Вам можно перелить группы O и B")
            "ab" -> print("Вам можно перелить группы O, A, B и AB")
            "o" -> print("Вам можно перелить только группу O")
            else -> print("Не понятно")
        }
    }

    //11) "Национальности"
    fun task11(){
        print("\n\"Россия\"\n\"США\"\n\"Япония\"\n\"Китай\"\nВыберите свою страну: ")
        val num1: String = readln().lowercase()

        when (num1){
            "россия" -> print("Самая крутая страна в мире")
            "сша" -> print("Загнивающий запад")
            "япония" -> print("У японцев глаза узкие")
            "китай" -> print("У китайцев глаза узкие")
            else -> print("Не понятно")
        }
    }

    //12) "Коды ошибок"
    fun task12(){
        print("\"100\"\n\"200\"\n\"300\"\n\"400\"\nВведите код ошибки: ")
        val num1: Int = readln().toInt()

        when (num1){
            100 -> print("Кто-то перерубил интернет кабель")
            200 -> print("Сервер упал")
            300 -> print("Ошибка входа в даркнет")
            400 -> print("Ошибка при открытии пусковой шахты ядерной ракеты")
            else -> print("Не понятно")
        }
    }

    //12) "Коды ошибок"
    fun task13(){
        print("\nВведите номер дня в неделе (от 1 до 7): ")
        val num1 = readln().toInt()

        when(num1){
            1 -> print("Это понедельник")
            2 -> print("Это вторник")
            3 -> print("Это среда")
            4 -> print("Это четверг")
            5 -> print("Это пятница")
            6 -> print("Это суббота")
            7 -> print("Это воскресенье")
            else -> print("Не понятно")
        }
    }

    //2) Определить тип треугольника по длинам сторон
    fun task14(){
        print("\nВведите длину первой боковой стороны: ")
        val num1: Int = readln().toInt()
        print("Введите длину первой боковой стороны: ")
        val num2: Int = readln().toInt()
        print("Введите длину основания: ")
        val num3: Int = readln().toInt()

        when{
            (num1==num2) and (num1==num3) -> print("Треугольник равносторонний")
            num1==num2 -> print("Треугольник равнобедренный")
            else -> print("Треугольник произвольный")
        }
    }

    //3) Вывод оценок по числовым значениям
    fun task15(){
        print("\nВведите число (от 1 до 5): ")
        val num1 = readln().toInt()

        when(num1){
            1 -> print("Кол")
            2 -> print("Неудовлетворнительно")
            3 -> print("Плохо")
            4 -> print("Хорошо")
            5 -> print("отлично")
            else -> print("Не понятно")
        }
    }

    //4) Определение времени суток
    fun task16(){
        print("\nВведите ваше время в часах (от 0 до 23): ")
        val num1: Int = readln().toInt()

        when{
            ((num1>=0) and (num1<4)) -> print("Это ночь")
            ((num1>=4) and (num1<12)) -> print("Это Утро")
            ((num1>=12) and (num1<17)) -> print("Это День")
            ((num1>=17) and (num1<24)) -> print("Это Вечер")
            else -> print("Не понятно")
        }
    }

    //5) Определить знак числа
    fun task17(){
        print("\nВведите число: ")
        val num1 = readln().toInt()

        when{
            num1>0 -> print("Число со знаком +")
            num1<0 -> print("Число со знаком -")
            num1==0 -> print("Число равно 0")
            else -> print("Не понятно")
        }
    }

    //6) Угадай число
    fun task18(){
        print("\nЗагадай мне число от 1 до 10: ")
        val num1 = readln().toInt()

        when(num1){
            1 -> print("Это число 1")
            2 -> print("Это число 2")
            3 -> print("Это число 3")
            4 -> print("Это число 4")
            5 -> print("Это число 5")
            6 -> print("Это число 6")
            7 -> print("Это число 7")
            8 -> print("Это число 8")
            9 -> print("Это число 9")
            10 -> print("Это число 10")
            else -> print("Не понятно")
        }
    }

    //7) Определение длины строки
    fun task19(){
        print("\nВведите любую строку: ")
        val num1: String = readln()

        print("Длина строки = "+num1.length)
    }

    //8) Определить время приготовления по типу пищи
    fun task20(){
        print("\n1) Мясо\n2) Рыба\n3) Маршмеллоу\n4) Сосиски\n5) Доширак\n6) Ролтон\nВведите тип пищи по номеру: ")
        val num1: String = readln()

        when{
            (num1 == "1") or (num1 == "1)") -> print("20-40 минут")
            (num1 == "2") or (num1 == "2)") -> print("20 минут")
            (num1 == "3") or (num1 == "3)") -> print("45 минут")
            (num1 == "4") or (num1 == "4)") -> print("5-7 минут")
            (num1 == "5") or (num1 == "5)") -> print("3-4 минуты")
            (num1 == "6") or (num1 == "6)") -> print("3-5 минут")
            else -> print("Не понятно")
        }
    }

    //1) Определить день недели по номеру
    fun task21(){
        print("\nВведите номер дня в неделе (от 1 до 7): ")
        val num1 = readln().toInt()

        when(num1){
            1 -> print("Это понедельник")
            2 -> print("Это вторник")
            3 -> print("Это среда")
            4 -> print("Это четверг")
            5 -> print("Это пятница")
            6 -> print("Это суббота")
            7 -> print("Это воскресенье")
            else -> print("Не понятно")
        }
    }

    //2) Определить тип треугольника по длинам сторон
    fun task22(){
        print("\nВведите длину первой боковой стороны: ")
        val num1: Int = readln().toInt()
        print("Введите длину первой боковой стороны: ")
        val num2: Int = readln().toInt()
        print("Введите длину основания: ")
        val num3: Int = readln().toInt()

        when{
            (num1==num2) and (num1==num3) -> print("Треугольник равносторонний")
            num1==num2 -> print("Треугольник равнобедренный")
            else -> print("Треугольник произвольный")
        }
    }

    //3) Вывод оценок по числовым значениям
    fun task23(){
        print("\nВведите число (от 1 до 5): ")
        val num1 = readln().toInt()

        when(num1){
            1 -> print("Кол")
            2 -> print("Неудовлетворнительно")
            3 -> print("Плохо")
            4 -> print("Хорошо")
            5 -> print("отлично")
            else -> print("Не понятно")
        }
    }

    //4) Определение времени суток
    fun task24(){
        print("\nВведите ваше время в часах (от 0 до 23): ")
        val num1: Int = readln().toInt()

        when{
            ((num1>=0) and (num1<4)) -> print("Это ночь")
            ((num1>=4) and (num1<12)) -> print("Это Утро")
            ((num1>=12) and (num1<17)) -> print("Это День")
            ((num1>=17) and (num1<24)) -> print("Это Вечер")
            else -> print("Не понятно")
        }
    }

    //5) Определить знак числа
    fun task25(){
        print("\nВведите число: ")
        val num1 = readln().toInt()

        when{
            num1>0 -> print("Число со знаком +")
            num1<0 -> print("Число со знаком -")
            num1==0 -> print("Число равно 0")
            else -> print("Не понятно")
        }
    }

    //6) Угадай число
    fun task26(){
        print("\nЗагадай мне число от 1 до 10: ")
        val num1 = readln().toInt()

        when(num1){
            1 -> print("Это число 1")
            2 -> print("Это число 2")
            3 -> print("Это число 3")
            4 -> print("Это число 4")
            5 -> print("Это число 5")
            6 -> print("Это число 6")
            7 -> print("Это число 7")
            8 -> print("Это число 8")
            9 -> print("Это число 9")
            10 -> print("Это число 10")
            else -> print("Не понятно")
        }
    }

    //7) Определение длины строки
    fun task27(){
        print("\nВведите любую строку: ")
        val num1: String = readln()

        print("Длина строки = "+num1.length)
    }

    //8) Определить время приготовления по типу пищи
    fun task28(){
        print("\n1) Мясо\n2) Рыба\n3) Маршмеллоу\n4) Сосиски\n5) Доширак\n6) Ролтон\nВведите тип пищи по номеру: ")
        val num1: String = readln()

        when{
            (num1 == "1") or (num1 == "1)") -> print("20-40 минут")
            (num1 == "2") or (num1 == "2)") -> print("20 минут")
            (num1 == "3") or (num1 == "3)") -> print("45 минут")
            (num1 == "4") or (num1 == "4)") -> print("5-7 минут")
            (num1 == "5") or (num1 == "5)") -> print("3-4 минуты")
            (num1 == "6") or (num1 == "6)") -> print("3-5 минут")
            else -> print("Не понятно")
        }
    }

    //9) "Способы оплаты"
    fun task29(){
        print("\n\"наличные\"\n\"Кредитная карта\"\n\"PayPal\"\nВыберите способ оплаты: ")
        val num1: String = readln().lowercase()

        when (num1){
            "наличные" -> print("Вы выбрали способ оплаты: Наличные")
            "кредитная карта" -> print("Вы выбрали способ оплаты: Кредитная карта")
            "paypal" -> print("Вы выбрали способ оплаты: PayPal")
            else -> print("Не понятно")
        }
    }

    //10) "Группа крови"
    fun task30(){
        print("\n\"O\"\n\"A\"\n\"B\"\n\"AB\"\nВыберите свою группу крови: ")
        val num1: String = readln().lowercase()

        when (num1){
            "a" -> print("Вам можно перелить группы O и A")
            "b" -> print("Вам можно перелить группы O и B")
            "ab" -> print("Вам можно перелить группы O, A, B и AB")
            "o" -> print("Вам можно перелить только группу O")
            else -> print("Не понятно")
        }
    }
}