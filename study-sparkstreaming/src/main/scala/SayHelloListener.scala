import org.apache.spark.streaming.StreamingContext
import org.apache.spark.streaming.scheduler._

/**
 * Created by jianying.wcj on 2014/11/23 0023.
 */
class SayHelloListener(ssc : StreamingContext) extends StreamingListener {

  override def onReceiverStarted(receiverStarted: StreamingListenerReceiverStarted): Unit = {
    println("onReceiverStarted event occured!")
    println(receiverStarted.receiverInfo)
  }

  override def onReceiverError(receiverError: StreamingListenerReceiverError): Unit = {
    println("receiverError event occured!")
    println(receiverError.receiverInfo)
  }

  override def onReceiverStopped(receiverStopped: StreamingListenerReceiverStopped): Unit = {
    println("receiverInfo event occurred!")
    println(receiverStopped.receiverInfo)
  }

  override def onBatchSubmitted(batchSubmitted: StreamingListenerBatchSubmitted): Unit = {
    println("batchSubmmited event occured!")
    println(batchSubmitted.batchInfo)
  }

  override def onBatchStarted(batchStarted: StreamingListenerBatchStarted): Unit = {
    println("batchStarted event occured!")
    println(batchStarted.batchInfo)
  }

  override def onBatchCompleted(batchCompleted: StreamingListenerBatchCompleted): Unit = {
    println("batchComplieted event occured!")
    println(batchCompleted.batchInfo)
  }
}
