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

