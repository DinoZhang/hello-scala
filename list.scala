val oneTwoThree = List(1,2,3)
println(oneTwoThree)

val thrill = 4 :: oneTwoThree


// reverse
print(thrill.reverse)

//mu
println(thrill)

//
println("thrill(2)"+ thrill(2))

//
println("thrill.count(s => s==3)" + thrill.count(s => s==3))

println("thrill.drop(2)" + thrill.drop(2))

println("thirl.dropRight(2)" + thrill.dropRight(2))

println(thrill.exists(s => s == 3))

println(thrill.filter(s => s >1))

println(thrill.forall(s => s >1))

thrill.foreach(s => print(s))

thrill.foreach(print)

println(thrill.head)


println(thrill.init)

println(thrill.isEmpty)

println(thrill.last)

println(thrill.length)

println(thrill.map(s => s + 1))

println(thrill.mkString(","))

thrill.remove(s => s == 2)

println(thrill.sort((s,t) => s < t))

println(thrill.tail)
