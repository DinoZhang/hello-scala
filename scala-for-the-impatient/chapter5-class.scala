//
class Counter {
   private var value = 0
   def increment() {value += 1}
   // 同 def current =value 
   def current() = value
   
}
// new Counter
val myCounter = new Counter()
myCounter.increment()
// 调用无参方法可以省略圆括号
println(myCounter.current)

// 改值使用（），取值不用
class Person{
    var age = 0
}
val p = new Person()
println(p.age)

class Message {
    val time = new java.util.Date
}
val m = new Message
println(m.time)


class PersonCon{
    private var name = ""
    private var age = 0
   
   // 辅助构造器，必须调用主构造器，或其他辅助构造器
   def this(name : String){
       this()
       this.name = name   
    }
   
   def this(name : String,age : Int){
       this(name)
       this.age = age
   }
}
val personCon= new PersonCon("jack",26)
//println(personCon.name +":"+ personCon.age)  
println(personCon)
