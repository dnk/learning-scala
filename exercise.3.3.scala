object Exercise {
	def setHead[A](list: List[A], h: A): List[A] = {
		list match {
			case Nil => List(h)
			case x :: xs => h :: xs
		}
	}

	def main(args: Array[String]): Unit = {
		println(setHead(List(1, 2, 3), 10))
		println(setHead(Nil, 1))
	}
}
