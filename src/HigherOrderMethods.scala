

object HigherOrderMethods {
  def main(args: Array[String]): Unit = {
    val a = Array(1,2,3,4,5)
    val b = List(5,2,8,1,9)
    val c = Vector.tabulate(10)(i=>i*i)
    a.foreach(println)
//    a.map(i=>i*2)
    a.map(_*2)
    b.filter(_<5) // store the less than numbers
    a.map(i=>b.take(i))
    c.exists(_>50)
    a.reduceLeft(_+_)//sum all
//    a.reduce((x,y)=>x+y)
    println(a.fold(0)(_+_))
    println(b.find(_==100))
  }
}