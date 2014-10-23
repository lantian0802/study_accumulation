package guava_string

import com.google.common.base.{Splitter, Strings, Joiner}

/**
 * Created by jianying.wcj on 2014/10/23 0023.
 */
object StringTest {
  /**
   * 字符串的拼接
   * @return
   */
  def testStrJoin() ={
    val joiner = Joiner.on("; ").skipNulls()
    joiner.join("Harry",null,"Ron","Hermione")
  }
  /**
   * scala 不支持 ++ -- 和三目运算符
   * @return
   * 校验是否为null 操作
   */
  def blankHandle() = {
    val input = ""
    val isNullOrEmpty = Strings.isNullOrEmpty(input)
    if(isNullOrEmpty) "null" else "not null"
  }
  /**
   * 字符串前缀后缀的比较
   */
  def testSuffixPreffix()  {
    val a = "com.jd.coo.Hello";
    val b = "com.jd.coo.Hi";
    val ourCommonPrefix = Strings.commonPrefix(a,b);
    println("a,b common prefix is " + ourCommonPrefix);
    val c = "com.google.Hello";
    val d = "com.jd.Hello";
    val ourSuffix = Strings.commonSuffix(c,d);
    println("c,d common suffix is " + ourSuffix);
  }
  /**
   * 自动补全字符串
   */
  def autoFullStr() {
    val minLength = 4
    val padEndResult = Strings.padEnd("123",minLength,'0')
    println(padEndResult)
    val padStartResult = Strings.padStart("1",2,'0')
    println("padStartResult is " + padStartResult)
  }
  /**
   *  拆分字符串
   */
  def testSplit() {
    val splitRes = Splitter.onPattern("[,，]{1,}")
                            .trimResults()
                            .omitEmptyStrings()
                            .split("hello,world,世界，水平")
    val iterator = splitRes.iterator()
    while(iterator.hasNext) {
      println(iterator.next())
    }
  }
  /**
   * 拆分字符串
   */
  def testSplit2() {
    val toSplitString = "a=b;c=d,e=f"
    val kvs = Splitter.onPattern("[,;]{1,}").withKeyValueSeparator('=').split(toSplitString)
    val iterator = kvs.entrySet().iterator()
    while (iterator.hasNext) {
       println(iterator.next())
    }
  }

  def main(args : Array[String]) {
    testSplit2()
  }
}
