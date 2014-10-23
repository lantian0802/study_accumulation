import java.util.concurrent.TimeUnit
import com.google.common.cache.{CacheBuilder, CacheLoader, LoadingCache}
/**
 * guava 本地缓存模板
 */
abstract class AbstractLoadCache[K <: Object,V <: Object] {

  var cache = CacheBuilder.newBuilder()
      .maximumSize(CacheConfig.maximumSize)
      .refreshAfterWrite(CacheConfig.refreshAfterWrite,TimeUnit.SECONDS)
      .build(new CacheLoader[K,V]() {

          override def load(key: K): V = {
            return getData(key)
          }
      })

  /**
   * 实际获取数据的抽象方法
   * @param key
   * @return
   */
  def getData(key:K) : V

  def getCache() : LoadingCache[K,V] = {
    cache
  }

  def setCache(cache : LoadingCache[K,V]) {
    this.cache = cache
  }
}