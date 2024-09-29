class Practice7 {
    fun main() {
        print("\n-----Практическая работа 7-----")

        while (true) {
            println("\n\n1) Калькулятор\n" +
                    "2) Найти палиндром слова\n" +
                    "3) Попеды, ничьи и поражения\n" +
                    "4) Карточная игра\n" +
                    "5) Выйти из текущей практики")

            print("\nВаш выбор? (например: 1 или 1) ): ")
            val chc = readlnOrNull()

            when{
                (chc.equals("1)") or chc.equals("1")) -> task1()
                (chc.equals("2)") or chc.equals("2")) -> task2()
                (chc.equals("3)") or chc.equals("3")) -> task3()
                (chc.equals("4)") or chc.equals("4")) -> task4()
                (chc.equals("5)") or chc.equals("5")) -> break
                else -> print("Не понятно")
            }
        }
    }


    // 1) Калькулятор
    fun task1() {
        print("\nВведите первое число: ")
        val num1: Double = readln().toDouble()
        print("Введите второе число: ")
        val num2: Double = readln().toDouble()

        print("+) Сложение\n" +
                "-) Вычитание\n" +
                "*) Умножение\n" +
                "/) Деление\n" +
                "Выберите действие: ")
        val ch: String = readln()

        when{
            (ch == "+") or (ch == "1") or ch.equals("Сложение", ignoreCase = true) -> print("Результат сложения $num1 и $num2: ${num1 + num2}")
            (ch == "-") or (ch == "2") or ch.equals("Вычитание", ignoreCase = true) -> print("Результат вычитания $num2 и $num1: ${num1 - num2}")
            (ch == "*") or (ch == "3") or ch.equals("Умножение", ignoreCase = true) -> print("Результат умножения $num1 на $num2: ${num1 * num2}")
            (ch == "/") or (ch == "4") or ch.equals("Деление", ignoreCase = true) -> print("Результат деления $num1 на $num2: ${num1 / num2}")
            else -> print("Нормально пишите ( например: + или Сложение )")
        }
    }

    // 2) Найти палиндром слова
    fun task2() {
        print("\nВведите слово: ")
        val input = readln()

        if (input == input.reversed()) {
            println("Палиндром слова: ${input.reversed()}")
        } else {
            println("Слово не является палиндромом.")
        }
    }

    // 3) Попеды, ничьи и поражения
    fun task3() {
        print("\nВведите число побед: ")
        val wins = readln().toInt()
        print("Введите число ничейных игр: ")
        val tie = readln().toInt()
        print("Введите число поражений: ")
        val defeat = readln().toInt()

        var points: Int = 0

        points += wins*3+tie

        println("Итого очков: $points")
    }

    // 4) Карточная игра
    fun task4() {
        var rules: Array<Int> = arrayOf(2, 3, 4, 11, 1)
        val cards: List<String> = listOf("Туз", "Король", "Дама", "Валет",
            "Карта \"6\"", "Карта \"7\"", "Карта \"8\"", "Карта \"9\"", "Карта \"10\"","Туз", "Король", "Дама", "Валет",
            "Карта \"6\"", "Карта \"7\"", "Карта \"8\"", "Карта \"9\"", "Карта \"10\"","Туз", "Король", "Дама", "Валет",
            "Карта \"6\"", "Карта \"7\"", "Карта \"8\"", "Карта \"9\"", "Карта \"10\"","Туз", "Король", "Дама", "Валет",
            "Карта \"6\"", "Карта \"7\"", "Карта \"8\"", "Карта \"9\"", "Карта \"10\"")
        cards.shuffled()

        while (true) {
            print(
                "\n1) Настройки\n" +
                "2) Начать игру\n" +
                "3) Выйти\n" +
                "Выберите действие (например: 1 или 1) ): "
            )
            val chc = readlnOrNull()

            when {
                (chc.equals("1)") or chc.equals("1")) -> rules = card_options(rules)
                (chc.equals("3)") or chc.equals("3")) -> break
                (chc.equals("2)") or chc.equals("2")) -> {
                    print("\n\n\n\n\n\n\n\n\n\n\n\n-------------------------------------------------------\n")
                    var your_points: Int = 0
                    var bankir_points: Int = 0

                    val your_cards = mutableListOf<String>()
                    val bankir_cards = mutableListOf<String>()

                    your_cards.addAll(cards.shuffled().take(1))
                    bankir_cards.addAll(cards.shuffled().take(1))

                    var shadowPlay = false
                    var bankirPlays = false
                    var i = 0

                    print("\nВы смотрите свою первую карту: ")
                    Thread.sleep(1000)
                    print(your_cards.first())
                    Thread.sleep(2500)
                    while(true){

                        if(!bankirPlays) {
                            your_points += when {
                                your_cards.last()=="Туз" -> { cards.minus("Туз"); if (rules[3] == 11) { rules[3] } else { if (your_points + 11 <= 21) { rules[3] } else { 1 } } }
                                your_cards.last()=="Король" -> { cards.minus("Король"); rules[2] }
                                your_cards.last()=="Дама" -> { cards.minus("Дама"); rules[1] }
                                your_cards.last()=="Валет" -> { cards.minus("Валет"); rules[0] }
                                your_cards.last()=="Карта \"6\"" -> { cards.minus("Карта \"6\""); 6 }
                                your_cards.last()=="Карта \"7\"" -> { cards.minus("Карта \"7\""); 7 }
                                your_cards.last()=="Карта \"8\"" -> { cards.minus("Карта \"8\""); 8 }
                                your_cards.last()=="Карта \"9\"" -> { cards.minus("Карта \"9\""); 9 }
                                your_cards.last()=="Карта \"10\"" -> { cards.minus("Карта \"10\""); 10 }
                                else -> 0
                            }

                            if(your_points>=21){break}

                            if ((i == 0) and (your_cards[0] == "Карта \"6\"")) {
                                print(
                                    "\nВаш набор карт: ${your_cards.joinToString(", ")}\n" +
                                    //"Ваше количество очков: $your_points\n" +
                                    "0) Играть в тёмную\n" +
                                    "1) Взять ещё карту\n" +
                                    "2) Вскрыть карты\n" +
                                    "Выберите действие (например: 1 или 1) ): "
                                )
                            } else {
                                if(shadowPlay) {
                                    print(
                                        "\nВаш набор карт: ${your_cards[0]}, *Карта скрыта*\n" //+
                                        /*"Ваше количество очков: $your_points\n"*/)
                                    println("\n-*Играет банкир*-")
                                    Thread.sleep(2500)
                                    println("\nБанкир вскрывет свою первую карту: ${bankir_cards[0]}")
                                    bankirPlays = true
                                    continue
                                } else {
                                    print(
                                        "\nВаш набор карт: ${your_cards.joinToString(", ")}\n" +
                                        //"Ваше количество очков: $your_points\n" +
                                        "1) Взять ещё карту\n" +
                                        "2) Вскрыть карты\n" +
                                        "Выберите действие (например: 1 или 1) ): "
                                    )
                                }
                            }

                            while (true) {
                                val move = readlnOrNull()
                                when {
                                    (move.equals("0)") or move.equals("0")) -> {
                                        if((your_cards.first() == "Карта \"6\"") and (your_points==6)){ your_cards.addAll(cards.shuffled().take(1)); Thread.sleep(500); println("Теперь вы играете в тёмную (Карта \"6\" = \"Туз\")");your_points = (your_points-6)+11;shadowPlay = true;break
                                        } else {print("Ваше первая карта не с наминалом 6!\nВыберите действие (например: 1 или 1) ): "); continue}
                                    }
                                    (move.equals("1)") or move.equals("1")) -> { your_cards.addAll(cards.shuffled().take(1)); Thread.sleep(500); print("\nВы тяните карту: "); Thread.sleep(1000); print(your_cards.last()); Thread.sleep(500); break }
                                    (move.equals("2)") or move.equals("2")) -> {
                                        println("\n-*Играет банкир*-")
                                        Thread.sleep(1500)
                                        print("\nБанкир вскрывет свою первую карту: ")
                                        Thread.sleep(1000)
                                        print(bankir_cards[0])
                                        Thread.sleep(1500)
                                        bankirPlays = true
                                        break
                                    }
                                    (move.equals("3)") or move.equals("3")) -> { Practice7().task4(); break }
                                    else -> print("Выберите действие (например: 1 или 1) ): ")
                                }
                            }
                            i += 1

                        } else {

                            bankir_points += when {
                                bankir_cards.last()=="Туз" -> { cards.minus("Туз"); if (rules[3] == 11) { rules[3] } else { if (your_points + 11 <= 21) { rules[3] } else { 1 } } }
                                bankir_cards.last()=="Король" -> { cards.minus("Король"); rules[2] }
                                bankir_cards.last()=="Дама" -> { cards.minus("Дама"); rules[1] }
                                bankir_cards.last()=="Валет" -> { cards.minus("Валет"); rules[0] }
                                bankir_cards.last()=="Карта \"6\"" -> { cards.minus("Карта \"6\""); 6 }
                                bankir_cards.last()=="Карта \"7\"" -> { cards.minus("Карта \"7\""); 7 }
                                bankir_cards.last()=="Карта \"8\"" -> { cards.minus("Карта \"8\""); 8 }
                                bankir_cards.last()=="Карта \"9\"" -> { cards.minus("Карта \"9\""); 9 }
                                bankir_cards.last()=="Карта \"10\"" -> { cards.minus("Карта \"10\""); 10 }
                                else -> 0
                            }
                            if (bankir_points<=16) {
                                bankir_cards.addAll(cards.shuffled().take(1))
                                print("\nБанкир тянет следующую карту: ")
                                Thread.sleep(1000)
                                print(bankir_cards.last())
                                Thread.sleep(2000)
                            } else {
                                println("\nБанкир перестал тянуть карты.")
                                Thread.sleep(500)
                                println("\nИтого набор банкира: ${bankir_cards.joinToString(", ")}")//\nИтого очков у банкира: $bankir_points")
                                Thread.sleep(2000)

                                if(shadowPlay){
                                    print("\nВы вскрываете свою вторую карту: ")
                                    Thread.sleep(1000)
                                    print(your_cards.last())
                                    Thread.sleep(2500)
                                }
                                println("\nИтого ваш набор: ${your_cards.joinToString(", ")}")
                                Thread.sleep(2000)

                                println("\nПодсчёт очков...")
                                Thread.sleep(2000)
                                if(bankir_points==21){ println(
                                        "Вы проиграли!\n" +
                                        "Банкир набрал ровно 21-о очко!\n") }
                                else if(bankir_points>=21){ println(
                                        "Вы выиграли!\n" +
                                        "Банкир набрал больше 21-о очка!\n") }
                                else {
                                    if (bankir_points >= your_points) { println(
                                        "Вы проиграли!\n" +
                                        "У вас меньше очков чем у банкира\n")
                                    } else { println(
                                        "Вы выиграли!\n" +
                                        "У банкира меньше очков чем у вас\n")
                                    }
                                }
                                println("Итого ваше количество очков: $your_points\n" +
                                        "Итого количество очков банкира: $bankir_points\n" +
                                        "Сыграть ещё раз? (Y,N):")
                                val rep = readln()
                                when{
                                    (rep == "Y") or (rep == "y") -> { Practice7().task4(); break }
                                    (rep == "N") or (rep == "n") -> { Practice7().main(); break }
                                }
                            }
                        }
                    }
                    if (your_points==21) {
                        Thread.sleep(500)
                        println("\n\nВы выиграли автоматически!\nУ вас ровно 21 очко!\nИтого ваше количество очков: $your_points\n" +
                                "Итого ваш набор карт: ${your_cards.joinToString(", ")}\nСыграть ещё раз? (Y,N): ")
                        val rep = readln()
                        when{
                            (rep == "Y") or (rep == "y") -> continue
                            (rep == "N") or (rep == "n") -> { Practice7().main(); break }
                        }
                    } else {
                        if((rules[4] == 1) and ((your_cards.count { it == "Туз" })>1)) {
                            Thread.sleep(500)
                            println(
                                "\n\nВы выиграли автоматически!\nУ вас \"Золотое очко\"!\nИтого ваше количество очков: $your_points\n" +
                                        "Итого ваш набор карт: ${your_cards.joinToString(", ")}\nСыграть ещё раз? (Y,N): "
                            )
                            val rep = readln()
                            when {
                                (rep == "Y") or (rep == "y") -> continue
                                (rep == "N") or (rep == "n") -> {
                                    Practice7().main(); break
                                }
                            }
                        } else {
                            Thread.sleep(500)
                            println(
                                "\n\nВы проиграли автоматически!\nУ вас перебор по очкам\nИтого ваше количество очков: $your_points\n" +
                                        "Итого ваш набор карт: ${your_cards.joinToString(", ")}\nСыграть ещё раз? (Y,N): "
                            )
                            val rep = readln()
                            when {
                                (rep == "Y") or (rep == "y") -> continue
                                (rep == "N") or (rep == "n") -> {
                                    Practice7().main(); break
                                }
                            }
                        }
                    }
                }
                else -> print("Не понятно")
            }
        }
    }

    fun card_options(array: Array<Int>): Array<Int> {
        val rules = array           //: Array<Int> = arrayOf(2, 3, 4, 11)
        print("\n\n\n\n------------------Настройки игры \"21\"------------------\n")

        var num1: String
        var num2: String
        var gpoint: String
        num1 = if(rules[0] == 2){ "1)" } else { "2)" }
        num2 = if(rules[3] == 11){ "1)" } else { "2)" }
        gpoint = if(rules[4] == 1){ "Учитывается" } else { "Не учитывается" }
        while (true) {
            print(
                "\n-------------------------------------------------------" +
                "\nНастройка 1: \"$num1\" ; Настройка 2: \"$num2\"\n" +
                "-------------------------------------------------------\n" +
                "Настройка 1\n" +
                "1) Вылет = 2, Король = 4 и Дама = 3 очка\n" +
                "2) Вылет, Король и Дама равны 10 очков\n\n" +

                "Настройка 2\n" +
                "3) Туз = только 11 очков\n" +
                "4) Туз = 11 очкам, но = 1 очку в случае перебора\n\n" +

                "Настройка 3\n" +
                "5) \"Золотое очко\" - $gpoint\n" +

                "\nВыберите действие (например: 1 или 1) ): "
            )
            val chc = readlnOrNull()

            when {
                (chc.equals("1)") or chc.equals("1")) -> { rules[0] = 2; rules[1] = 3; rules[2] = 4; num1 = "1)" }
                (chc.equals("2)") or chc.equals("2")) -> { rules[0] = 10; rules[1] = 10; rules[2] = 10; num1 = "2)" }
                (chc.equals("3)") or chc.equals("3")) -> { rules[3] = 11; num2 = "1)" }
                (chc.equals("4)") or chc.equals("4")) -> { rules[3] = 1; num2 = "2)" }
                (chc.equals("5)") or chc.equals("5")) -> { if(rules[4] == 1){ rules[4] = 0; gpoint = "Не учитывается" } else { rules[4] = 1; gpoint = "Учитывается" } }
                (chc.equals("6)") or chc.equals("6")) -> return rules
                else -> print("Не понятно")
            }
        }
    }
}
