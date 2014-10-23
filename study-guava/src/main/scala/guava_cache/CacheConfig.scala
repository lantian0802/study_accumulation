/**
 * Created by jianying.wcj on 2014/10/23 0023.
 */
object CacheConfig {
  /**
   * 配置缓存条目的大小
   */
  val maximumSize = 10
  /**
   * 配置数据加载到缓存后的刷新时间
   */
  val refreshAfterWrite = 12
  /**
   * 配置数据加载到缓存后的移除时间
   */
  val expireAfterWrite = 12
}
