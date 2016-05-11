import scala.annotation.tailrec

object Exercise {
	def fib(n: Int): Int = {
		@tailrec
		def fb(n: Int, n0: Int, n1: Int): Int = {
			if (n < 0) n0
			else if (n < 1) n1
			else fb (n-1, n1, n0 + n1)
		}

		fb(n-1, 0, 1)
	}
	def main(args: Array[String]): Unit = {
		println(fib(0))
		println(fib(1))
		println(fib(2))
		println(fib(3))
		println(fib(4))
		println(fib(5))
		println(fib(6))
		println(fib(7))
		println(fib(8))
		println(fib(9))
		println(fib(10))
	}
}
