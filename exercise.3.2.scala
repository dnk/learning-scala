object Exercise {

	def tail[A](list: List[A]): List[A] = {
		list match {
			case Nil => Nil
			case x :: xs => xs
		}
	}

	def main(args: Array[String]): Unit = {

		val l = List(1,2,3,4)
		val r = tail(l)
		println(r)

		val r1 = tail(Nil)
		println(r1)

		val r2 = tail(List())
		println(r2)
	}
}
