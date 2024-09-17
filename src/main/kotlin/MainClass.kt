class MainClass {
    fun main() {
        while (true) {

            print("\n\n-----Выбор Практики-----\n")

            print("\n1) Первая практика\n2) Вторая практика\n3) Третья практика\n4) Четвёртая практика\nВыберите практику (например: 1 или 1) ): ")
            val chc: String? = readlnOrNull()
            when {
                (chc.equals("1)") or chc.equals("1")) -> Practice1().func()
                (chc.equals("2)") or chc.equals("2")) -> Practice2_1().main()
                (chc.equals("3)") or chc.equals("3")) -> Practice3().main()
                (chc.equals("4)") or chc.equals("4")) -> Practice4().main()
                else -> print("Не понятно")
            }
        }
    }
}