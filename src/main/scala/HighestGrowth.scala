import org.apache.spark.sql.SparkSession
//3. Highest population growth - Country with highest % population growth in past decade

object HighestGrowth {
  def main(args:Array[String]): Unit = {

    val spark = SparkSession.builder().master("local").appName("wordcount").getOrCreate()
    val data = spark.read.csv("D:\\course\\dataflair\\World_Bank_Indicators.csv").rdd
  val result=data.map(line=>{
    var popnum=0D
    val population=line.getString(9).replaceAll(",","")
    if(population.length>0){popnum=population.toLong}

    (line.getString(0),population.toDouble)
  }).groupByKey().map(rec=>{
   val maxg= rec._2.max
    val ming=rec._2.min
    var percg:Double = 0D
    percg=((maxg-ming)/ming)*100
println(ming+" "+maxg+" "+percg)
    (rec._1,percg)
  }).sortBy(rec=>rec._2,false).first()
println(result)

  // spark.sparkContext.parallelize(Seq(result)).saveAsTextFile(args(1))
  }

  }
