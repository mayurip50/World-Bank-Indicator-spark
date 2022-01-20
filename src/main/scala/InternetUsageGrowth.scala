//5. Internet usage grown - Country where Internet usage has grown the most in the past decade
import org.apache.spark.sql.SparkSession

object InternetUsageGrowth {
  def main(args:Array[String]): Unit = {

    val spark = SparkSession.builder().master("local").appName("wordcount").getOrCreate()
    val data = spark.read.csv("D:\\course\\dataflair\\World_Bank_Indicators.csv").rdd
    val result=data.map(line=>{
      var internetuser=0
      if(line.isNullAt(5))
      {internetuser=0}
      else{
        internetuser= line.getString(5).toInt
      }
      (line.getString(0),internetuser)
    }).groupByKey().map(rec=>{
      val maxg= rec._2.max
      val ming=rec._2.min
      val growth=maxg-ming
      (rec._1,growth)
    }).sortBy(rec=>rec._2,false).first()
    println(result)

    // spark.sparkContext.parallelize(Seq(result)).saveAsTextFile(args(1))
  }

}
