package com.dinozhang.scala

import java.math.BigInteger

object Hello extends App {
  //val 不可变 var 可变
  val x = 1
  
  def increase(i: Int): Int = {
    i + 1
  }
  //递归必须返回结果类型（对应java 返回类型）
  def increaseTest(i: Int) = {
    i + 1
  }
  println(increase(x))
  println(increaseTest(x))
  println("hello scala")
  println(x)
  
  var y = "123"
  y = "123156"
  println(y)
  
  //不带参不返回结果 函数
  def greet() = println("hello scala")
  //greet: ()Unit unit 没有有效返回值  不是为了得到返回值 side effect
  // quit  :q
  //println(greet())
  
  //chapter 3
  val big = new BigInteger("123456")
  println(big)
  
  val greetStrings  = new Array[String] (3)
  //val greetStrings :Array[String]  = new Array[String] (3)
  //scala use (0) to visit array  ; java use  [number] to visit array 
  //vai means this variable can't change   final
  greetStrings(0) = "hello"
  greetStrings(1) = ","
  greetStrings(2) = "scala!\n"
  for(i <-0 to 2)
    println(greetStrings(i))
   
   greetStrings.apply(0)  
    
  //scala don't have  operate finguer override
    println(1+1)
  //
    println((1).+(2))
  //use (i) to visit array means scala to transform to use apply method
  //eg : greetString(0) equals  greegString.apply(i)  
    
   var nameNumber = Array("one","two","thress")
   var nameNumber2 = Array.apply("one","two","thress")
   
   
    //方法没有副作用是函数式风格编程的重要理念，计算并返回值应该是方法唯一的目的
    //Scala array is  mutable
    //Scala List is immutable, not similar with java list
    val oneTwo = List(1,2)
    val threeFour = List(3,4)
    //:::
    //:: cons
    val oneTwoThreeFour = oneTwo ::: threeFour
    println(oneTwoThreeFour)
  
     val twoThree = List("two","three")
     val oneTwoThree = "one" :: twoThree
     println(oneTwoThree)
     
     //List method
     println(oneTwoThree.head)
     println(oneTwoThree(0))
     println(oneTwoThree.count { s => s.length == 4 })
     println(oneTwoThree.drop(1))
     println("remove tail"+oneTwoThree.dropRight(1))
     
     // true or false
     println(oneTwoThree.exists { s => s == "one" })
     
     //
     //println(oneTwoThree)
     //a *b
     //
    
  
  
   
}   
