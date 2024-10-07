fun main() {
    while (true) {

        Practice10().main()

        print("\n\n-----Выбор Практики-----\n")

        print("\n1) Первая практика\n2) Вторая практика\n3) Третья практика\n4) Четвёртая практика\n" +
                "5) Пятая практика\n6) Шестая практика\n7) Седьмая практика\n8) Восьмая практика\n" +
                "9) Девятая практика\n10) Десятая практика\nВыберите практику: ")

        val chc: String? = readlnOrNull()
        when {
            (chc.equals("1)") or chc.equals("1")) -> Practice1().func()
            (chc.equals("2)") or chc.equals("2")) -> Practice2_1().main()
            (chc.equals("3)") or chc.equals("3")) -> Practice3().main()
            (chc.equals("4)") or chc.equals("4")) -> Practice4().main()
            (chc.equals("5)") or chc.equals("5")) -> Practice5().main()
            (chc.equals("6)") or chc.equals("6")) -> Practice6().main()
            (chc.equals("7)") or chc.equals("7")) -> Practice7().main()
            (chc.equals("8)") or chc.equals("8")) -> Practice8().main()
            (chc.equals("9)") or chc.equals("9")) -> Practice9().main()
            (chc.equals("10)") or chc.equals("10")) -> Practice10().main()
            else -> print("Не понятно")
        }
    }
}
