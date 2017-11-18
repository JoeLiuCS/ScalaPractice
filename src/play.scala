

object HelloWorld{
  def main(args: Array[String]): Unit = {
    (4).toString()
    (4.5).toInt
    "4.5".toDouble  
    
    val a =5; //can not change
    
    var b =5 ;  //can change
    
    var i = 5
//    var x,y,z =5
//    
//    var l:Int =5;
//    
//    val (c,d) = (3,5)
//    
//    (6,7)
//    
//    (2.5,'a')
//    
//    (5,6,"aa")
    
    //if expression
    val next =  if(a%2==0)a/2 else println(3*a+1)
    
    if(a<9) println("less")
    
    println("yo: "+a)
    
    //match
    
    val point = (15,5)
    val result = (a*3,b) match{
      case (5,_) => println("five")
      case  `point` => println("get a point")
      case i => println("Somthing bigger" + i)
    }
  
  }
}