/**
 * Created by jianying.wcj on 2014/10/23 0023.
 */
/**
 * guava cache 实验结果总结：
 *    主要的实现逻辑是getData方法，只要实现getData方法就可以了。通过Key从ltc.getCache获取数据
 * 如果数据没有取到，则会根据key从getData方法里获取数据。去过一次之后数据就会被自动被缓存在本地缓存里面。
 * 等到缓存时间过后，会重新自动再次调用getData方法获取数据。
 */
class LocalTestCache extends AbstractLoadCache[String,Integer]{
  /**
   * 模拟计数器
   */
  private var counter = 0
  /**
   * 实际获取数据的抽象方法
   * @param key
   * @return
   */
  override def getData(key: String): Integer = {
      println("getData is called!")
      counter = counter+1
      counter
  }
}

object LocalTestCache {

  private val key = "cache_value"

  def main(args : Array[String]) {
      val ltc = new LocalTestCache()

      for(i <- 1 to 100) {

        println(ltc.getCache().get(key))
        Thread.sleep(1000)
      }
  }
}


