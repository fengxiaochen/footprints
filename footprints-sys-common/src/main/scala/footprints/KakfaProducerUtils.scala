package footprints

import java.util.Properties

import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}

/**
  * kafka producer  0.10  顺序写入
  * Created by tonychan on 2018/5/30.
  */
object KakfaProducerUtils {

  def sendSingleMessage(topic:String,key:String,message:String): Unit = {
    getKafkaProducer().send(getProducerRecord(topic,key,message))
  }

  def sendBatchMessage(): Unit = {

  }

  def getKafkaProducer(): KafkaProducer[String, String] = {
    val props = new Properties()
    props.put("bootstrap.servers", "10.7.24.41:9092,10.7.24.42:9092,10.7.24.43:9092")
    props.put("acks", "all")
    props.put("retries", "0")
    props.put("batch.size", "16384")
    props.put("linger.ms", "1")
    props.put("buffer.memory", "33554432")
    props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
    props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer")
    new KafkaProducer[String, String](props)
  }

  def getProducerRecord(topic: String, key: String, message: String): ProducerRecord[String, String] = {
    new ProducerRecord[String, String](topic, key, message)
  }

  def main(args: Array[String]) {
    for( a <- 1 to 10){
      sendSingleMessage("test",a.toString,a.toString)
    }
  }
}
