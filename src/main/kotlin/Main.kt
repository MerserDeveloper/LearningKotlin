fun main(args: Array<String>) {
    var x = 3
    val name = "Vostok"
    x = x * 10
    println("x is $x. \n")
    ///////////////////////////
    while (x > 28) {
        x = x - 1
        println("x is now $x. \n")
    }
    ///////////////////////////
    if (x == 20) {
        println("x must be 20.")
    } else {
        println("x isn't be 20.")
    }
    if (name.equals("Vostok")) {
        println("$name Groznyi")
    }
    ///////////////////////////
    var y = 4
    while (y > 3) {
        println(y)
        y = y - 1
    }
    ///////////////////////////
    var k = 1
    var j = 2
    println("Before the loop. k = $k.")
    while (k < 2) {
        println("Before the loop. k = $k.")
        k = k +1
    }
    println("After the loop. k = $k. \n")

    ///////////////////////////
    //Массивы
    ///////////////////////////

    var my1ArrayOf = arrayOf (1,2,3)
    println(my1ArrayOf[0])

    val wordArray1 = arrayOf("15", "multi-terrier", "c-to-c", "dynamic","pervasive")
    val wordArray2 = arrayOf("10", "dog", "a-to-a", "dynamic","nestle")
    val wordArray3 = arrayOf("5", "cat", "B-to-B", "stativ","picture")

    val arraySize1 = wordArray1.size
    val arraySize2 = wordArray2.size
    val arraySize3 = wordArray3.size

    val rand1 = (Math.random() * arraySize1.toInt())
    val rand2 = (Math.random() * arraySize2.toInt())
    val rand3 = (Math.random() * arraySize3.toInt())

    val phrase = "${wordArray1[rand1.toInt()]} ${wordArray2[rand2.toInt()]} ${wordArray3[rand3.toInt()]}"
    println(phrase + "\n")
    ///////////////////////////
    var my2ArrayOf: Array<Int> = arrayOf (20,30,40)
    println(my2ArrayOf[0])
    my2ArrayOf [0] = 50
    println(my2ArrayOf[0])

    my2ArrayOf = arrayOf(5,5,5)

    ///////////////////////////
}