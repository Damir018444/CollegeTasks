class Practice2_2 {

    fun main(){
        print("\n-----Вычисление логических выражений-----")

        var res: Boolean
        var A: Boolean
        var B: Boolean
        var C: Boolean


        //Задание 1
        print("\n\nЗадание 1")
        A = true
        B = false
        C = false

        res = A or B
        print("\n1)$res")
        res = A and B
        print("\n2)$res")
        res = B or C
        print("\n3)$res")


        //Задание 2
        print("\n\nЗадание 2")
        A = false
        B = true
        C = false

        res = A or C
        print("\n1)$res")
        res = A and B
        print("\n2)$res")
        res = A and C
        print("\n3)$res")


        //Задание 3
        print("\n\nЗадание 3")
        A = true
        B = false
        C = false

        res = !A and B
        print("\n1)$res")
        res = A or !B
        print("\n2)$res")
        res = A and B or C
        print("\n3)$res")


        //Задание 4
        print("\n\nЗадание 4")
        A = true
        B = true
        C = false

        res = !A and B
        print("\n1)$res")
        res = A or !B
        print("\n2)$res")
        res = A or B and C
        print("\n3)$res")


        //Задание 5
        print("\n\nЗадание 5")
        A = true
        B = true
        C = false

        res = !A and B
        print("\n1)$res")
        res = A or !B
        print("\n2)$res")
        res = A or B and C
        print("\n3)$res")


        //Задание 6
        print("\n\nЗадание 6")
        A = false
        B = false
        C = true

        res = A or B and !C
        print("\n1)$res")
        res = A and !B or C
        print("\n2)$res")
        res = !A and !B
        print("\n3)$res")
        res = A and (!B or C)
        print("\n4)$res")
        res = !(A and C) or B
        print("\n5)$res")
        res = A or !(B or C)
        print("\n6)$res")


        //Задание 7
        print("\n\nЗадание 7")
        A = true
        B = false
        C = false

        res = A or !(A and B) or C
        print("\n1)$res")
        res = !A or A and (B or C)
        print("\n2)$res")
        res = (A or B and !C) and C
        print("\n3)$res")
    }
}