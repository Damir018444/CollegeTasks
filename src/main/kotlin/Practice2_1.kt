class Practice2_1 {
    fun main(){

        print("\n-----Операции с числами-----")

        while (true) {
            println("\n\n1) Двузначное число\n" +
                    "2) Трёхзначное число\n" +
                    "3) Деление чисел\n" +
                    "4) Возведение в степень\n" +
                    "5) Найти корень числа\n" +
                    "6) Вычисление логических выражений (skip)\n" +
                    "7) Выйти из текущей практики")
            print("\nВаш выбор? (например: 1 или 1) ): ")
            val chc = readlnOrNull()

            when{
                (chc.equals("1)") or chc.equals("1")) -> twoNum()
                (chc.equals("2)") or chc.equals("2")) -> threeNum()
                (chc.equals("3)") or chc.equals("3")) -> divide()
                (chc.equals("4)") or chc.equals("4")) -> degree()
                (chc.equals("5)") or chc.equals("5")) -> root()
                else -> print("Не понятно")
            }

            if(chc.equals("6") or chc.equals("6)")){
                Practice2_2().main()
                break
            } else if(chc.equals("7") or chc.equals("7)")){
                break
            }
        }
    }

    fun twoNum(){
        print("\nВведите двузначное число: ")
        val num = readLine()!!.toInt()

        println("Число десятков: "+(num/10))
        println("Число единиц: "+(num%10))

        println("Сумма цифр: "+((num/10)+(num%10)))
        println("Произведение цифр: "+((num/10)*(num%10)))
    }

    fun threeNum(){
        print("\nВведите трёхзначное число: ")
        val num = readLine()!!.toInt()

        val dig1 = num%10
        val dig2 = num/10%10
        val dig3 = num/100%10

        println("Число единиц: "+dig1)
        println("Число десятков: "+dig2)
        println("Число сотен: "+dig3)

        println("Сумма цифр: "+(dig1 + dig2 + dig3))
        println("Произведение цифр: "+(dig1 * dig2 * dig3))
    }

    fun divide(){
        val result: Double
        print("\nНапишите делимое: ")
        val num1 = readLine()!!.toInt()
        print("Напишите делитель: ")
        val num2 = readLine()!!.toInt()

        result = num1.toDouble()/num2.toDouble()
        println("Результат деления: "+result)
    }

    fun degree(){
        print("\nНапишите число: ")
        val num = readLine()!!.toDouble()
        print("Напишите степень: ")
        val deg = readLine()!!.toDouble()

        println("Результат: "+(Math.pow(num, deg)))
    }

    fun root(){
        print("\nНапишите число: ")
        val num = readLine()!!.toDouble()

        println("Результат: "+(Math.sqrt(num)))
    }
}