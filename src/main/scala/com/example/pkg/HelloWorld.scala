package com.example.pkg

object HelloWorld {

  def main(args: Array[String]) {
    val world = "world"
    val year = 2024
    println(s"hello $world: $year")


    for (i <- 1.to(5)) {
      println(s"loop $i")
    }
    for (i <- 6.until(11)) {
      println(s"loop $i")
    }

    val list = List(9, 8, 7, 6, 5)
    for (i <- list) {
      println(s"loop $i")
    }

    val result = for {i <- list; if i > 6} yield {
      i * 2
    }
    println(result)
  }
}
