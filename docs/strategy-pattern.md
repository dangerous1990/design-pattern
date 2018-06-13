# 策略模式
## 一、 模式定义
<Strategy lets the algorithm vary independently from clients that use it

策略模式定义了一系列的算法，并将每一个算法封装起来，而且使他们可以相互替换，让算法独立于使用它的客户而独立变化

## 二、 解决那些问题

* 解决可以在运行时配置一个算法实现给类，而不是让这个类实现某个算法接口
* 解决代码中通过switch来选择算法,不易于扩展的代码

## 三、 使用场景

* jdk的Comparator接口，实现不同的排序方式，传入对应比较器算法就可以
* 之前做过税务软件，对于不同的纳税人或者车辆税率都不一样，代码里充斥着“ if else ”来判断对应哪种税率，对于获取税率的可以封装成算法，需求而且经常变动
例如2015-2016 1.6L以下车购税5%
   2017-2018 1.6L以下车购税7.5%

## 四、 类图实现

[!bridge](/uml/strategy-pattern.png)

## 五、 模式优缺点
+ 优点

* 客户端持有接口的引用，不依赖具体实现（面向接口编程）
* 客户端可以灵活切换算法实现，传入不同算法实现类
* 避免选择策略进行多重判断

+ 缺点

* 暴露算法实现，客户端在选择算法时，必须知道算法的不同之处
* 代码层级额外多了一层，context委托算法子类，进行真正的计算

## 六、 参考

http://www.runoob.com/design-pattern/strategy-pattern.html

https://en.wikipedia.org/wiki/Strategy_pattern#cite_note-2

http://w3sdesign.com/?gr=b09&ugr=struct#gf