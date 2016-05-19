import scala.annotation.tailrec

object Exercise {

	@tailrec
	def drop[A](l: List[A], n: Int): List[A] = {
		l match {
			case Nil => Nil
			case x :: xs => {
				if (n <= 0) {
					l
				} else {
					drop (xs, n-1)
				}
			}
		}
	}

	def main(args: Array[String]): Unit = {
		println(drop(List(1, 2, 3, 4), 3))
		println(drop(List(1, 2, 3, 4), 10))
	}
}
