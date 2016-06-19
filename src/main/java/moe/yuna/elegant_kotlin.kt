package moe.yuna

/**
 * Created by sanairika on 2016/06/19.
 */
object Test {
    fun test() {
        val jj = JunkJava()
        val nullValue = null
        println(jj.junkJava())
        jj.junkJava { -> println("java8 lambda") }
        println(jj.junkJava { s -> "kotlin null:${nullValue ?: "Null Safety!!"}" + s })
        println("kotlin data:${Data(data1 = 1, data2 = "data2")}")
        1.extrend()
        println("kotlin infix method ${Data(2, "234") plus Data(1, "plus", 10)}")

        println("kotlin success parse")
    }

    fun Int.extrend() {
        println("kotlin Int extrend Method!!value:$this")
    }

    infix fun Data.plus(x: Data): Data {
        this.incr += x.incr
        return x
    }
}

data class Data(
        val data1: Int
        , val data2: String
        , var incr: Int = 0
)