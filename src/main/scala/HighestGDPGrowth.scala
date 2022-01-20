import org.apache.spark.sql.SparkSession
//4. Highest GDP growth - List of Countries with highest GDP growth from 2009 to 2010 in descending order

object HighestGDPGrowth {
  def main(args:Array[String]): Unit = {

    val spark = SparkSession.builder().master("local").appName("wordcount").getOrCreate()
    val data = spark.read.csv("D:\\course\\dataflair\\World_Bank_Indicators.csv").rdd
  val result=data.map(line=>{

    var currgdp=0L;
    if(line.isNullAt(18)){currgdp=0L}
    else{
      currgdp=line.getString(18).replaceAll(",","").toLong
    }
    (line.getString(0),currgdp)
  }).groupByKey()
    .map(
      rec=>{
        val values=rec._2.takeRight(2)
        val gdp09=values.min
        val gdp10=values.max
        var perGrowth=0L
        perGrowth=(gdp10-gdp09)

        (rec._1,perGrowth)
      }
    ).sortBy(rec=>rec._2,false)

    result.foreach(println)
//spark.sparkContext.parallelize(Seq(result)).saveAsTextFile(args(1))

  }
}
