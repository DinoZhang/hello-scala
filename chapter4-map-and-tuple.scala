//  Map[String,Int]
val scores = Map("Alice" -> 10,"Bob"-> 3,"Cindy" -> 8)

// 可变映射
val mutScores = scala.collection.mutable.Map("Alice"-> 10,"Bob"-> 3,"Cindy" ->8)

// 空映射
val nullScores = new scala.collection.mutable.HashMap[String,Int]

// key 不存在会抛异常
val bobSocore = scores("Bob")
println(scores("Bob"))

// 
val bobScore1 = if(scores.contains("Bob")) scores("Bob") else 0
val bobScore2 = scores.getOrElse("Bob",0)

// 更新
mutScores("Bob") = 19 
mutScores("Jack") = 12

println(mutScores("Bob")+" "+mutScores.getOrElse("Jack",0))

// 添加
mutScores += ("John" -> 3)
mutScores -=("Jack")
//result 3 0
println(mutScores("John") +" "+ mutScores.getOrElse("Jack",0))

var varScores = scores + ("Marry" -> 4)


// 迭代
for (v <- varScores.values) println(v)


// 交换键值
var  swapMap = for((k,v) <- varScores)  yield (v,k)

for((k,v) <- swapMap) println(k+":"+v)

// 树形映射
val treeScore = scala.collection.immutable.SortedMap("Alice" -> 10,"Fred" -> 7,"Bob" -> 3,"Cindy" -> 3)

for((k,v) <- treeScore) println(k+":"+v)

//tuple
val tuples = (1,3.14,"Richeal")

println(tuples._1)
println(tuples _2)

val (frist, second, third ) =tuples
val (one,  two, _) = tuples
println(one)

println("New Yord".partition(_.isUpper))

// 拉链操作
val symbols = Array("<","-",">")
val counts = Array(2,10,2)

val pairs = symbols.zip(counts)
// Array(("<",1),("-",10),(">",2))
println(pairs)

for((s,n) <- pairs) print(s * n)

println("")
