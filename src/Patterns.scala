

object Patterns {
  val lst = List(1,2,3,4,5)
  val Array(hour,minte,second)= "5:36:43".split(":")
  
  1::2::3::Nil //list(1,2,3)
  def listLength(lst:List[Int]):Int = lst match{
    case Nil => 0
    case h::t=> 1 +listLength(t)
  }
 
  lst.find(_>2)match{
    case None => "Not found"
    case Some(i) => "found" + i
  }
  
  case class Person(name:String,age:Int)
  val people = Array(Person("Mark",40),Person("Amber",13))
  val Person(n,a)= people(0)
}