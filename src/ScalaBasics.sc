val num= (a: Int,b: Int) =>{a+b}
num(4,5)
def num1(a: Int,b: Int) ={a*b}
num1(4,5)
def num2(a: Int)(b:Int) ={a/b}
num2(8)(2)
def fact(num: Int) :Int={
  if(num==1)1
  else num*fact(num-1)
}
fact(6)
def fact1(num: Int)={
  var res = 1
  for(x <- 1 to num)
    res=res*x
  res
}
fact1(6)
def factorial(n : Int) = {
   var res = 1
    for(x <- 1 to n)
      res = res * x
  res
     }
factorial(6)
val name="chanti"
val course ="spark"
val percentage = 80.35
val count = 100
val msg1 =  s"name:$name ,course: $course ,no of students: $count"
val msg2 =  f"name:$name ,course: $course ,no of students: $count,percentage: $percentage%1.2f"
val msg3 =  s"name:$name\ncourse: $course\nno of students: $count"
val msg4 =  raw"name:$name \n course: $course \n no of students: $count"


