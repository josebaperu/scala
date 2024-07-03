package com.example.pkg

object ScalaOne extends App{
  class Animal {

    def eat (): Unit = {
      println("animal eats")
    }
  }
  val animal = new Animal
  animal.eat

  class Dog(val name: String) extends Animal{
    def dogName(): Unit = {
      println ("dog name is "+ name)
    }
  }

  val doggy = new Dog("fido")
  doggy.dogName

  trait Carnivore{
    def eat(food:String):Unit
  }

  class Puppy(override val name:String) extends Dog(name) with Carnivore {
    override def eat(food: String): Unit = println(s"This puppy eats  $food")
  }

  val puppy = new Puppy("pluto")
  puppy.eat("meat")





}
