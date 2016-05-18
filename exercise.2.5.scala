object Exercise {

	def compose[A,B,C] (f: B=>C, g: A=>B): A=>C = {
		def a2c(a: A):C = {
			f(g(a))
		}
		a2c
	}

	def main (args: Array[String]): Unit = {
		val g: (Int => Double) = _ + .0
		val f: (Double => String) = "string " + _.toString
		var r = compose(f, g)

		println(r(2))
	}
}
