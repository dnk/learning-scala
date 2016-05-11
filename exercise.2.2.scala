import scala.annotation.tailrec

object Exercise {
	def isSorted[A] (arr: Array[A], sorted: (A, A)=>Boolean): Boolean = {
		@tailrec
		def isS(n: Int): Boolean = {
			if (n+1 >= arr.length) true
			else if (sorted(arr(n), arr(n+1))) isS(n+1)
			else false
		}
		isS(0)
	}
	def main(args: Array[String]): Unit = {
		val arr = Array(1,2,3,4,7)
		println(isSorted(arr, (x:Int, y:Int) => x < y))
	}
}
