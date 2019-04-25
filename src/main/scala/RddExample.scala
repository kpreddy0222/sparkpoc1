import org.apache.spark.sql.SQLContext
import org.apache.spark.{SparkConf, SparkContext}




object RddExample {

  val conf = new SparkConf().setAppName("RddExample").setMaster("local")
  val sc = new SparkContext(conf)
  val sqlContext = new SQLContext(sc)
  def main(args: Array[String]): Unit = {

    //read jsone file with input path
    val jsondata = sqlContext.read.json("D:/work/dataset/zips.json")
    //print schema of json sturcture
    jsondata.printSchema()

    //temp save data in a table
    jsondata.registerTempTable("chanti")
    jsondata.map( x =>x%2==0)

    //sql
    val data=sqlContext.sql("select * from chanti limit 5")

    //show data
    data.show()
    sc.stop()


    val input = sc.parallelize(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
    val input1 = sc.parallelize(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10),2)
    val a = input.getNumPartitions
    val a1 = input1.getNumPartitions
    println(a)
    println(a1)
    input.collect()
    input .collect().foreach(println)

    input1.glom().collect().foreach(println)
    input1.foreach(println)
    val by2 = sc.parallelize(1 to 6,2)
    by2.collect().foreach(println)
    input.map(_+1).collect().foreach(println)
    input.map(_ % 2 == 0).collect().foreach(println)
    input.filter(_%2 ==0).collect().foreach(println)
    val rdd = sc.makeRDD(1 to 6, 2)
    rdd.countByValue()
    rdd.union(rdd).distinct().collect().foreach(println)

    val names = List("kalyan", "raj", "venkat", "sunil", "anil", "ravi", "kiran" , "anvith")
    val rdd2 = sc.makeRDD(names, 2)
    //rdd2.map(x => (x, x.length)).collect().foreach(println)
    //rdd2.sortBy(x=>x,false).collect().foreach(println)
    //val names = List("kalyan", "raj", "venkat", "sunil", "anil", "ravi", "kiran" , "anvith")

    //val rdd2 = sc.makeRDD(names, 2)

    val prdd1 = rdd2.map(name => (name.length, name))
    prdd1.groupBy(t => t._1).collect().foreach(println)
    prdd1.groupBy(t => t._1).map(t => (t._1, t._2.map(x => x._2))).collect().foreach(println)
    //below code working on repl only
    val det1 = ("Venu",30092,"venu@gamil.com")
    val det = ("Venu",32,"hyd")
    val res = (det1._1,det1._2,det1._3,det._1,det._2)match{
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
      def maxele(x:Int,y:Int)=if(x>y) x else y
      maxele(x,maxele(y,z))
    }
    max(8,5,2)

    def add(x:Int,y:Int)={x+y}
    def mul(x:Int,y:Int)={x*y}
    def sub(x:Int,y:Int)={x-y}
    def sq(x:Int)={x*x}
    def cub(x:Int)={x*x*x}
    def hof(f:Int => Int,y:Int): Unit ={
       f(y)
    }
    hof(sq,2)
    hof(cub,3)
   }
  val res= List(12,13,14,15,16)

  val mulres = res.map(_*2)
  mulres

  val odd = (x:Int) =>x%2 ==0

}
