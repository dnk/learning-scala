object Exercise {

	def curry[A, B, C] (f: (A, B)=>C): A => (B => C) = {
		def a2bc(a:A): (B=>C) = f(a, _:B)
		a2bc
	}

	def uncurry[A, B, C] (c: A => (B => C)): (A, B)=>C = {
		def ab2c (a: A, b:B): C = c(a)(b)
		ab2c
	}

	def main (args: Array[String]): Unit = {
		val t = curry((x: Int, y: Double) => x.toString + " + " + y.toString)
		println(t(2)(1.2))

		val r = uncurry(t)
		println(r(2, 1.2))
	}
}
