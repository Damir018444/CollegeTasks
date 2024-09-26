class MainClass {
    fun main() {
        while (true) {

            //Practice6().main()

            print("\n\n-----Выбор Практики-----\n")

            print("\n1) Первая практика\n2) Вторая практика\n3) Третья практика\n4) Четвёртая практика\n" +
                    "5) Пятая практика\n6) Шестая практика\nВыберите практику (например: 1 или 1) ): ")

            val chc: String? = readlnOrNull()
            when {
                (chc.equals("1)") or chc.equals("1")) -> Practice1().func()
                (chc.equals("2)") or chc.equals("2")) -> Practice2_1().main()
                (chc.equals("3)") or chc.equals("3")) -> Practice3().main()
                (chc.equals("4)") or chc.equals("4")) -> Practice4().main()
                (chc.equals("5)") or chc.equals("5")) -> Practice5().main()
                (chc.equals("6)") or chc.equals("6")) -> Practice6().main()
                //else -> print("Не понятно")
            }
        }
    }
}