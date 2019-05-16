List categories = []
new File("datapoints.txt").eachLine {
   categories.add(it.split("\t")[0])
}
categories.sort()
categories.each() {
    println(it)
}
