val  blk ={
  val fname = "purushotham"
  val lname="kongara"
  fname+" "+lname


}
val num1 = 20
if(num1>18) num1*num1 else num1+num1

val ageOffer ={
  val age =20
  if(age<10) " 10% discount"
  else if(age>=10 && age <=18) "20% disco unt"
  else if(age>18&&age<60) "30& discount"
  else "no offers"
}
//use case
val name ="chanti"
val id = 1244
val wel = name match{
  case "purushotham" => s"hi $name lis comlete adim task today"
  case "chanti" => s"hi $name pls complete tasting task"
  case _ => s"hello $name you are not a member"
}
//use case2
val days ="monday"
val u2 = days match{
  case "mon"|"Monday" =>1
  case "tue"|"tuesday" =>2
  case "wed"|"wednesday" =>3
  case "thu"|"thursday" =>4
  case "fri"|"friday" =>5
  case "sat"|"satureday" =>6
  case _ => "wrong input"
}

val ddd = days match{
  case "mon"  | "tue" |"wed" => "30% off"
  case _ => "40% off"

}
