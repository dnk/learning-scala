object Exercise {
	def main(args: Array[String]): Unit = {
		val x = List(1, 2, 3, 4, 5)
		val r = x match {
			case x :: 2 :: 4 :: _ => x
			case Nil => 42
			case x :: y :: 3 :: 4 :: _ => x + y
			case h :: t => h + 200
			case _ => 101
		}
		println (r)
	}
}
