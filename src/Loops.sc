val res= List(12,13,14,15,16)
val rem = res.toBuffer
val remd = rem.-(13)
val mul=(x:Int) => x*2
val mulres = res.map(mul)

val odd = (x:Int) =>x%2 ==0
val oddres = res.map(odd)
val num = Array(12,45,1,4,2,5,7,8)

val res1 = List(1,2,3,4,5,6)
def fac1(n:Int) ={
  var res =1
  for(x<-1 to n)
    res = res *x
  res
}
fac1(7)

val num2 = num.map(_+1)
val name="chanti"
val names=Array("puru","raki","chethan","suri")
val nums=Array(4,5,6,5,66,88)

val result = for(x <- nums) x*x
//it returns unit if u want to forthur computation it not avail
//gofor yield
//result.map(x=>x+5) error
val result1 = for(x<-nums) yield x*x
name.toUpperCase
//it(touppercase is applicable for single element
//directly same logic not appli for collection of elements
names.map(x=>x.toUpperCase)
/*val num1 = 1 to 20 toArray
for(x<-num1) yield x match{
  case x if(x == 3)=> x*x
}*/
//in for else is not recommanded
//multi line ctrl+shift+?
def fac(n: Int): Int ={
  var res=1
  for(x<-1 to n)
    res=res*x
  res
}
val fac6=fac(6)
def fact(n: Int): Int = n match{
  case a if(a<=1) => 1
  case _ => n*fact(n-1)
}
val fact6=fact(6)
//recursive function retuern datatype is mantory
def power(n: Int,m: Int):Long = m match{
  case x if(x<1) => 1
  case _ => n*power(n,m-1)
}
power(2,4)
def addnum(x:Int,y:Int):Int ={
  x+y
}
addnum(2,4)
def maxele(x: Int,y: Int)= if(x>y) x else y
//nested functions
maxele(3,9)
def findmax(x:Int,y:Int,z:Int)={
  def maxele(x: Int,y: Int)= if(x>y) x else y
  maxele(x,maxele(y,z))

}
findmax(3,9,5)
//a func call another func with arguments is called higher order func
def add(x:Int,y:Int)=x+y
def mul(x:Int,y:Int)=x*y
def sq(x:Int)=x*x
def cub(x:Int)=x*x*x

def hof(f:Int => Int,y:Int)={
  f(y)
}
hof(cub,4)
hof(sq,8)
def hof1(f:(Int,Int)=>Int,x:Int,y:Int)={
  f(x,y)
}
hof1(add,5,9)
def hof2(f:(Int,Int)=>Int,x:Int,y:Int): Unit ={
  f(x,y)*f(x,y)

}
hof2(add,4,5)
val det1 = ("Venu",30092,"venu@gamil.com")
val det = ("Venu",32,"hyd")
val res2 = (det1._1,det1._2,det1._3,det._1,det._2)match{
  case(a,b,c,d,e) if(a=="Venu" && b==30092)=> e
  case _ => "npthing"

}


def pow(x: Int,y: Int): Long ={
  if(y>=1)
    x*pow(x,y-1)
  else 1
}
pow(2,3)

def max(x:Int,y:Int,z:Int)= {
  def maxele(x:Int,y:Int)= if(x>y) x else y
  println("max no is:")
  maxele(x,maxele(y,z))
}





