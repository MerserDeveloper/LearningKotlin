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
    println("Before the loop. k = $k.")
    while (k < 2) {
        println("Before the loop. k = $k.")
        k = k +1
    }
    println("After the loop. k = $k. \n")


}