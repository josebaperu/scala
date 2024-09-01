package com.example.pkg.begginersTutorial

object MatchExpression {
  def main(args: Array[String]) {
    val age = 18

    val result = age match {
      case 19 => false
      case _ => true
    }
    println(result)
  }
}
