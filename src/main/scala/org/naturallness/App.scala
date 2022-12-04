package org.naturallness
import org.apache.spark.sql.SparkSession

/**
 * @author ${user.name}
 */
object App {

  def main(args : Array[String]) : Unit = {
    System.setProperty("hadoop.home.dir", "c:\\hadoop")
    val spark = SparkSession
      .builder()
      .master("local")
      .appName("Spark SQL basic example")
      .getOrCreate()
    import spark.implicits._
//    val lr = new LinearRegression().setLabelCol("labesl").setFeaturesCol("features").setMaxIter(10).setRegParam(1.0).setElasticNetParam(1.0)
//    val pipeline = new Pipeline().setStages(Array(lr))
//    pipeline.fit(trainingData)
//    val documentAssembler = new DocumentAssembler()
//      .setInputCol("text")
//      .setOutputCol("document")

//    val tokenizer = new Tokenizer()
//      .setInputCols(Array("document"))
//      .setOutputCol("token")

//    val embeddings = DistilBertEmbeddings.pretrained()
//      .setInputCols("document", "token")
//      .setOutputCol("embeddings")
//      .setCaseSensitive(true)

//    val embeddingsFinisher = new EmbeddingsFinisher()
//      .setInputCols("embeddings")
//      .setOutputCols("finished_embeddings")
//      .setOutputAsVector(true)
//      .setCleanAnnotations(false)

//    val pipeline = new Pipeline()
//      .setStages(Array(
//        documentAssembler,
//        tokenizer,
//        embeddings,
//        embeddingsFinisher
//      ))

    val data = Seq(("This is a sentence.",1)).toDF("text","count")
    data.show(true)


  }

}
