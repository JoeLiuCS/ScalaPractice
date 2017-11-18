import collection.mutable._

object Collection {
  
 
  
  
  def main(args: Array[String]): Unit = {
     val  arr=  Array(1,2,3)
     val lst = List(1,1,3.2)
     val lsst2 = 1::lst
     val arr2 = Array.fill(10)(0)
//     val arr3 = new Array[Int](100)
     val arr3 = Array.tabulate(10)(i=>i*i)
     println(arr3.deep.mkString(" "))
     println(arr(0))
     
     Vector(1,2,3)

     Buffer(1,2,3)
     
     1 to 10 by 2
     (1).+(2)
     
//     val arr4 = arr ++: arr3
     val arr4 = arr3. ++: (arr)
     2 +: arr :+ 2//add one element
     arr.tail //except first one 
     val (before,after) = arr2.splitAt(2)
     arr2.patch(2, arr, 3)
     println(arr4.deep.mkString(" "))
  }
}