package com.example.pkg

object Methods extends App {

  private object Upper {
    def toUpperCase(strings: String*): Seq[String] = {
      strings.map(_.toUpperCase)
    }
  }
  println(Upper.toUpperCase("a","b","c"))

  class Lower {
    def toLowerCase(strings: String*): Seq[String] = {
      strings.map(_.toLowerCase)
    }
  }

  val s_class = new Lower
  println(s_class.toLowerCase("X", "Y", "Z"))

}
