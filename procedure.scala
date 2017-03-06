def box(s: String){
    var border = "-" * s.length + "--\n"
    println(border + "|" + s + "|\n" + border)
}
box("test procedurd")
