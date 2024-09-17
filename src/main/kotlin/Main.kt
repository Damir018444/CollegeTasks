fun main(args: Array<String>) {
    print("1) Первая практика\n2) Вторая практика\n3) Третья практика\n4) Четвёртая практика\nВыберите практику: ")
    val num: String? = readlnOrNull()

    if (num.equals("1)") or num.equals("1")){
        Practice1().func()
    } else if (num.equals("2)") or num.equals("2")) {
        Practice2_1().main()
        Practice2_2().main()
    } else if (num.equals("3)") or num.equals("3")) {
        Practice3().main()
    } else if (num.equals("4)") or num.equals("4")) {
        Practice4()
    } else {
        print("Не понятно")
    }
}