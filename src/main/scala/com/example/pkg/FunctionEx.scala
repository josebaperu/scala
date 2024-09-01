package com.example.pkg

object FunctionEx {
  def minus(x: Int = 1, y: Int = 1) = {
    x - y
  }

  object Math {
    def add(x: Int = 1, y: Int = 1) = {
      x + y
    }
  }

  def main(args: Array[String]) {
    println(Math.add())
    println(Math.add(2, 2))

    println(minus())
    println(FunctionEx.minus(2, 1))
    150
  }

}
