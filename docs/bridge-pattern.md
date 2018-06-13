# 桥接模式
## 一、 模式定义
它的主要特点是把抽象(Abstraction)与行为实现(Implementation)分离开来，从而可以保持各部分的独立性以及应对他们的功能扩展。

桥接模式将继承关系转化成关联关系，它降低了类与类之间的耦合度，减少了系统中类的数量，也减少了代码量
## 二、 解决那些问题

>An abstraction and its implementation should be defined and extended independently from each other.

抽象和具体实现类解耦，并且各自独立变化，没有依赖关系

>A compile-time binding between an abstraction and its implementation should be avoided so that an implementation can be selected at run-time.

编译时绑定其抽象与实现的关系，避免在运行时在选择哪个具体按实现类

>When using subclassing, different subclasses implement an abstract class in different ways. But an implementation is bound to the abstraction at compile-time and can't be changed at run-time.
## 三、 使用场景
      1. 如果一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性，避免在两个层次之间建立静态的继承联系，通过桥接模式可以使它们在抽象层建立一个关联关系。
      2. 对于那些不希望使用继承或因为多层次继承导致系统类的个数急剧增加的系统，桥接模式尤为适用。
      3. 一个类存在两个独立变化的维度，且这两个维度都需要进行扩展。
      3. 适合使用在需要跨越多个平台的图形和窗口系统上。（head first 设计模式）

## 四、 类图实现

[!bridge](/uml/bridge-pattern.png)

## 五、 模式优缺点
+ 优点

      1. 分离抽象接口及其实现部分。提高了比继承更好的解决方案。
      2. 桥接模式提高了系统的可扩充性，在两个变化维度中任意扩展一个维度，都不需要修改原有系统。
      3. 实现细节对客户透明，可以对用户隐藏实现细节。
      
+ 缺点

      1. 桥接模式的引入会增加系统的理解与设计难度，由于聚合关联关系建立在抽象层，要求开发者针对抽象进行设计与编程。 
      2. 桥接模式要求正确识别出系统中两个独立变化的维度，因此其使用范围具有一定的局限性

## 六、 参考

[https://en.wikipedia.org/wiki/Bridge_pattern](https://en.wikipedia.org/wiki/Bridge_pattern)

[http://www.runoob.com/design-pattern/bridge-pattern.html](http://www.runoob.com/design-pattern/bridge-pattern.html)

