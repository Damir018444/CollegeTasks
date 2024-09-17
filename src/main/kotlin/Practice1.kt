class Practice1 {

    fun func(){
        println("\nТипы данных:\n1) целые числа (byte, short, int, long)\n2) числа с плавающей точкой (float, double)\n3) логический (boolean)\n4) символьный (char).")

        val flt = 0.12f
        val elog = 2.72f

        println("\nЧисло с точностью до сотых: $flt")
        println("Число e с точностью до сотых: $elog")

        var num1 = 1; var num2 = 13; var num3 = 49; var num4: Int?;
        print("\nВведите число: ")
        val num: String? = readLine()

        println("\nВы ввели: $num")
        println("$num ---вот такое число вы ввели")

        println("\n$num1 $num2 $num3")

        num1 = 7; num2 = 15; num3 = 100;
        println("$num1  $num2  $num3")

        num1 = 1; num2 = 2; num3 = 3;
        println("$num1  $num2  $num3")

        num1 = 1; num2 = 2; num3 = 3; num4 = 4;
        println("$num1 $num2 $num3 $num4")

        println("\n50\n10")

        println("\n5\n10\n21")

        println("\n1\n12\n123\n1234")
    }
}