import scala.util.Random


object function {
  val a =5;
  def square(x:Double):Double = {
   var b:Double = x*x
   return b
  }
  
  def square2(x:Double):Double = {
        x*x
  }
  
  def greet(name:String) :Unit ={
    println(s"Hello,$name")
  }
  
  def factorial(n:Int):Int = if (n<2) 1 else n*factorial(n-1)
  
  def estimatePi(n:Int) :Double = {
    
    def helper(n:Int):Double={
      if(n<1) 0 else{
        val x = math.random
        val y = math.random
        (if(x*x+y*y<1) 1 else 0 )+helper(n-1)
      }
    }
    helper(n)  /n*4
  }
  
  
  import scala.annotation._
  def NonOverFlowestimatePi(n:Int) :Double = {
    @tailrec
    def helper(n:Int,sum:Int):Double={
      if(n<1) sum else{
        val x = math.random
        val y = math.random
        helper(n-1,sum+ (if(x*x+y*y<1) 1 else 0 ))
      }
    }
    helper(n,0) /n *4
  }
   
  def main(args: Array[String]): Unit = {
  
    println(square(5))
     greet("Joe")
     println(estimatePi(1000))
     println(1000*4)
  }
 
}