import scala.annotation.tailrec

object Exercise {

	@tailrec
	def dropWhile[A](l: List[A], f: A=>Boolean): List[A] = {
		l match {
			case Nil => Nil
			case x :: xs => {
				if (f(x)) {
					dropWhile(xs, f)
				} else {
					l
				}
			}
		}
	}

	def main(args: Array[String]): Unit = {
		println(dropWhile(List(1, 2, 3, 4), (x: Int) => x < 4))
		println(dropWhile(List(1, 2, 3, 4), (x: Int) => true ))
	}
}
