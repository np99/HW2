
class point (var x :Int,var y : Int){

    fun stringchange(xchange : Int , ychange :Int) {
        println(xchange.toString())
        println(ychange.toString())
    }
    fun equaltest(x:Int,y:Int){
        if (x > y){
            println(" x > Y")
        }
        else if ( x < y){
            println("X < Y")
        }
        else{
            println(" x == Y")
        }
    }
}


fun main() {
    var xy = point(4,5)
    println(xy.stringchange(2,4))
    println(xy.equaltest(5,5))
    println(xy.equaltest(6,5))
}