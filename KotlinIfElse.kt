

//Kotlin If Else Statements

fun main(args : Array<String>){

    //1. Basic If Else Code
    /*
    val a :Int = 23
    val b:Int = 24
    if(a>b)
    {
        println("$a is greater than $b")
    }
    else
    {
        println("$b is greater than $a")
    }  */

    //2.Example
    /*
    var _a = 33
    var _b = 44
    var result = if(_a>_b)
    {
        println("$_a is greater than $_b")
    }
    else
    {
        println("$_b is greater than $_a")
    }
    */
    //3. If Else If ELse Ladder
    /*
    val a1 : Int  = 20
    if(a1>20)
    {
       println("$a1 is greater than 20")
    }
    else if (a1<10)
    {
        println("$a1 is greater than 10")
    }
    else
    {
        println("$a1 is equal to 20")
    }
      */

    var b:Int = 100
    if(b<100)
    {
        println("$b is lesser than 100")
    }
    else if(b>100)
    {
        println("$b is greater than 100")
    }
    else if(b>0 && b<=100)
    {
        println("$b is exact")
    }

}