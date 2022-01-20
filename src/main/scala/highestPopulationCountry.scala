//1. Highest urban population - Country having the highest urban population

import org.apache.spark.sql.SparkSession

object highestPopulationCountry {
  def main(args:Array[String]): Unit ={

    val spark =SparkSession.builder().master("local").appName("wordcount").getOrCreate()
    val srdd=spark.read.csv("D:\\course\\dataflair\\World_Bank_Indicators.csv").rdd
    val result=srdd.map(line=>{
      var upopulation = ""
      var upop = 0L
      if(line.getString(10)!=null){
      upopulation=line.getString(10).replaceAll(",","")
     // println(upopulation)
      if(upopulation.length>0){
upop=upopulation.toLong
      }
      }
      (upop,line.getString(0))

    }).sortByKey(false).first()
//spark.sparkContext.parallelize(Seq(result)).saveAsTextFile(args(1))
    println(result)
  }

}
