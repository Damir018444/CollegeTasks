class Practice3 {
    fun main() {
        print("\n-----Условный оператор-----")

        while (true) {
            println("\n\n1) Макс число из 3-х чисел\n" +
                    "2) Найти среднее среди 3-х чисел\n" +
                    "3) Найти нечётное число из 2-х чисел\n" +
                    "4) \"Определить, кратно ли первое число второму\"\n" +
                    "5) \"Определить, может ли существовать треугольник\"\n" +
                    "6) Определить високосный год\n" +
                    "7) Сравнить вещественные числа\n" +
                    "8) Расстояние\n" +
                    "9) Деление нацело\n" +
                    "10) \"Является ли число a делителем числа b?\"\n" +
                    "11) Рассмотреть натуральное число\n" +
                    "12) Сравнить цифры в двузначном числе\n" +
                    "13) Работа с цифрами в четырёхзначном числе\n" +
                    "14) Выйти из текущей практики")

            print("\nВаш выбор?: ")
            val chc = readlnOrNull()

            when {
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
                (chc.equals("14)") or chc.equals("14")) -> break
                else -> print("Не понятно")
            }
        }
    }


    //
    fun task1(){
        print("\nВведите первое число: ")
        val num1 = readln().toInt()
        print("Введите второе число: ")
        val num2 = readln().toInt()
        print("Введите третье число: ")
        val num3 = readln().toInt()

        val max = if(num1>num2){ if(num1>num3){ num1 } else { num3 } } else { if(num2>num3){ num2 } else {num3} }
        print("Максимально число: $max")
    }

    //
    fun task2(){
        print("\nВведите первое число: ")
        val num1: Double = readln().toDouble()
        print("Введите второе число: ")
        val num2: Double= readln().toDouble()
        print("Введите третье число: ")
        val num3: Double = readln().toDouble()

        if((num1 == num2) or (num1 == num3) or (num1 == num3) or (num2 == num3)){
            print("Ошибка")
            return
        }

        val mid: Double = (num1+num2+num3)/3
        print("Среднее: $mid")
    }

    //
    fun task3(){
        print("\nВведите первое число: ")
        val num1: Int = readln().toInt()
        print("Введите второе число: ")
        val num2: Int= readln().toInt()

        val result = if(num1%2==0){num2} else {num1}
        println("Нечётное число: $result")
    }

    //
    fun task4(){
        print("\nВведите большее число: ")
        val num1: Double = readln().toDouble()
        print("Введите меньшее число: ")
        val num2: Double = readln().toDouble()

        if((num1%num2).toInt() == 0){
            print("Число $num1 кратно числу $num2")
        } else {
            print("Число $num1 не кратно числу $num2,\nостаток от деления: "+(num1%num2))
        }
    }

    //
    fun task5(){
        print("\nВведите первое сторону: ")
        val num1: Int = readln().toInt()
        print("Введите вторую сторону: ")
        val num2: Int = readln().toInt()
        print("Введите третью сторону: ")
        val num3: Int = readln().toInt()

        if((num3>num1+num2) or (num2>num1+num3) or (num1>num2+num3)){
            print("Такого треугольника не существует")
        } else {
            print("Такой треугольник существует")
        }
    }

    //
    fun task6(){
        print("\nВведите год: ")
        val num1: Int = readln().toInt()

        if(((num1 % 4 == 0) and (num1 % 100 != 0)) or (num1 % 400 == 0)){
            print("Год високосный")
            print("Дней в году: 366")
        } else {
            print("Год не високосный")
            print("Дней в году: 365")
        }
    }

    //
    fun task7(){
        print("\nВведите большее число: ")
        val num1: Double = readln().toDouble()
        print("Введите меньшее число: ")
        val num2: Double = readln().toDouble()

        if(num1>num2){
            print("Число $num1 больше $num2")
        } else if(num2>num1){
            print("Число $num2 больше $num1")
        } else {
            print("Числа равны")
        }
    }

    //
    fun task8(){
        print("\nВведите расстояние в километрах: ")
        val num1: Double = readln().toDouble()
        print("Введите расстояние в футах: ")
        val num2: Double = readln().toDouble()

        if((num1*1000)>(num2*0.305)){
            print("Расстояние в километрах больше")
        } else if((num1*1000)<(num2*0.305)){
            print("Расстояние в футах больше")
        }
    }

    //
    fun task9(){
        print("\nВведите первое число: ")
        val num1: Int = readln().toInt()
        print("Введите второе число: ")
        val num2: Int = readln().toInt()

        if(num1%num2==0){
            print("Частное от деления: "+(num1/num2))
        } else if(num1%num2!=0){
            print("$num1 на $num2 нацело не делится")
        }
    }

    //
    fun task10(){
        print("\nВведите первое число: ")
        val num1: Int = readln().toInt()
        print("Введите второе число: ")
        val num2: Int = readln().toInt()

        if(num2%num1==0){
            print("Число $num2 является делителем числа $num1")
        } else if(num2%num1!=0){
            print("Число $num2 не является делителем числа $num1")
        }
    }

//
    fun task11(){
        print("\nВведите число: ")
        val num1: Int = readln().toInt()

        if(num1%2==0){
            print("Число чётное и не оканичвается на цифру 7")
        } else if((num1%2!=0) and ((num1-7)%2==0)){
            print("Число не чётное и оканчивается на цифру 7")
        }
    }

//
    fun task12(){
        print("\nВведите двузначное число: ")
        val num1 = readLine()!!.toInt()

        val dig1 = num1/10
        val dig2 = num1%10

        if(dig1>dig2){
            print("$dig1 больше чем $dig2\nЦифры не одинаковые")
        } else if(dig1<dig2){
            print("$dig2 больше чем $dig1\nЦифры не одинаковые")
        } else {
            print("Цифры одинаковые")
        }

    }

//
    fun task13(){
        print("\nВведите четырехзначное число: ")
        val num1 = readLine()!!.toInt()

        val dig1 = num1 / 1000 % 10
        val dig2 = num1 / 100 % 10
        val dig3 = num1 / 10 % 10
        val dig4 = num1 % 10

        //a) Сравниваем сумму двух первых и двух последних цифр
        if((dig1 + dig2) == (dig3 + dig4)){
            println("Сумма двух первых цифр равна сумме двух последних")
        } else { println("Сумма двух первых цифр НЕ равна сумме двух последних") }

        // b) Проверяем, кратна ли трем сумма всех цифр
        if((dig1 + dig2 + dig3 + dig4)%3==0){
            println("Сумма всех цифр кратна трем")
        } else { println("Сумма всех цифр НЕ кратна трем") }

        // c) Проверяем, кратно ли четырем произведение всех цифр
        if((dig1 * dig2 * dig3 * dig4)%4==0){
            println("Произведение всех цифр кратно четырем")
        } else { println("Произведение всех цифр НЕ кратно четырем") }

        // d) Проверяем, кратно ли произведение всех цифр числу a (где a - это первая цифра)
        if((dig1 * dig2 * dig3 * dig4)%dig1==0){
            println("Произведение всех цифр кратно первой цифре")
        } else { println("Произведение всех цифр НЕ кратно первой цифре") }
    }
}