 * guava cache 实验结果总结：
 *    主要的实现逻辑是getData方法，只要实现getData方法就可以了。通过Key从ltc.getCache获取数据
 * 如果数据没有取到，则会根据key从getData方法里获取数据。去过一次之后数据就会被自动被缓存在本地缓存里面。
 * 等到缓存时间过后，会重新自动再次调用getData方法获取数据。