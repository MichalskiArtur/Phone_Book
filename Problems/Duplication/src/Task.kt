// Write your code here. Do not import any libraries

val fileName = "MyFile.txt"
val myFile = File(fileName)
val text = myFile.readText()
val text2 = ("$text$text")
myFile.writeText("$text2")
