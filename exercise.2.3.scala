object Exercise {

	def curry[A, B, C] (f: (A, B)=>C): A => (B => C) = {
		def a2bc(a:A): (B=>C) = f(a, _:B)
		a2bc
	}

	def main (args: Array[String]): Unit = {
		val r = curry((x: Int, y: Double) => x.toString + " + " + y.toString)
		println(r(2)(1.2))
	}
}
