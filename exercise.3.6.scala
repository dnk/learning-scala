import scala.annotation.tailrec

object Exercise {

	def init[A](l: List[A]): List[A] = {
		@tailrec
		def _init[A](l: List[A], r: List[A]): List[A] = {
			l match {
				case Nil => Nil
				case x :: Nil => l
				case x :: xs => _init(xs, x::r)
			}
		}
		_init(l, Nil)		
	}

	def main(args: Array[String]): Unit = {

		println(init(List(1, 2, 3)))
		println(init(List(1)))
		println(init(Nil))
	}
}
