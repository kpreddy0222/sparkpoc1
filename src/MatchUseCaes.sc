val age = 20
// => means do something action/computation
val res =age match{
  case x if(x<0 && x<10) => "10% off"
  case x if(x>= 10 && x<= 18) => "20% off"

  case age if(age>=18&& age <=60) => "30% off"
  case _=> "no offer"
}
//use case 3
val det=(20,"female")
val det2 = ("chanti","city")
val sres = det match{
  case (a,g) if(a > 18 && g=="female") => "free something"
  case (a,g) if(a > 18 && g=="Male") => "mob free"
  case _ =>"no offer"
}

///Array(1,2,3)
val res123  = det match{ 
  case (20,"female") =>
}