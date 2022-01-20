//2. Most populous Countries - List of top ten countries in the descending order of their population

import org.apache.spark.sql.SparkSession

object CountryOrderedByPopulation {
def main(args:Array[String]): Unit ={
  val spark=SparkSession.builder().master("local").appName("CountryOrderedByPopulation").getOrCreate()
  val data=spark.read.csv("D:\\course\\dataflair\\World_Bank_Indicators.csv").rdd

  val result=data.map(line=>{
    val population=line.getString(9).replaceAll(",","")
    (line.getString(0),population.toLong)
  }).groupByKey().map(rec=>(rec._1,rec._2.max)).sortBy(rec=>rec._2,false).take(10)

 // spark.sparkContext.parallelize(Seq(result)).saveAsTextFile(args(1))

  result.foreach(println)

}
}
