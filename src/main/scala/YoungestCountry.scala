//6. Youngest Country - Yearly distribution of youngest Countries
import org.apache.spark.sql.SparkSession
object YoungestCountry {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().master("local").appName("wordcount").getOrCreate()
    val data = spark.read.csv("D:\\course\\dataflair\\World_Bank_Indicators.csv").rdd
    val result = data.map(line => {
      var youngers = 0
      if (line.isNullAt(16)) {
        youngers = 0;
      }
      else {
        youngers = line.getString(16).toInt
      }
        (line.getString(1).split("/")(2)  , (line.getString(0),youngers))
    }
    ).groupByKey().map(rec=>{
  (rec._1,rec._2.toMap.maxBy(_._2))
}).sortByKey().map(rec=>(rec._1,rec._2._1,rec._2._2))

    result.foreach(println)

  }
}