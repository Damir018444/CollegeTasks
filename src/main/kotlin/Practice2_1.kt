class Practice2_1 {

    fun main() {
        print("\n-----Операции с числами-----")

        while (true) {
            println("\n\n1) Двузначное число\n2) Трёхзначное число\n3) Деление чисел\n4) Возведение в степень\n5) Найти корень числа\n6) Вычисление логических выражений (skip)")
            print("\nВаш выбор?: ")
            val chc = readlnOrNull()

            if (chc.equals("1)") or chc.equals("1")) {
                twoNum()
            } else if (chc.equals("2)") or chc.equals("2")) {
                threeNum()
            } else if (chc.equals("3)") or chc.equals("3")) {
                divide()
            } else if (chc.equals("4)") or chc.equals("4")) {
                degree()
            } else if (chc.equals("5)") or chc.equals("5")) {
                root()
            } else if (chc.equals("6)") or chc.equals("6")) {
                Practice2_2().main()
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