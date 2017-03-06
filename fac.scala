def fac( n : Int) = {
  var r =  1
  for (i <- 1 to n) r = r * i
  println(r)
}
fac(9)
