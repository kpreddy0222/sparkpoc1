def daystonum(days:String) = days match{
  case "mon"|"Monday" =>1
  case "tue"|"tuesday" =>2
  case "wed"|"wednesday" =>3
  case "thu"|"thursday" =>4
  case "fri"|"friday" =>5
  case "sat"|"satureday" =>6
  case _ => "wrong input"
}
daystonum(days="mon")