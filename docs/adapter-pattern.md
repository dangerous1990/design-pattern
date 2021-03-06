# 适配器模式
## 一、 模式定义
将一个接口转换成客户希望的另外一个接口，使得原本接口不兼容而不能一起工作的那些类可以一起工作。
适配器分为对象适配器（动态）和类适配器（编译期）
## 二、 解决那些问题
主要解决因为需求变动，导致接口变动，旧的接口还能工作不能完全替换成新的接口，这时候需要一个添加一个适配器，使客户端和服务端可以一起工作
## 三、 使用场景
一个系统A需要与第三方系统B对接，第三方系统的接口有2个版本，不同地区的版本不一致，1.0版本是存储过程的接口，2.0版本是EJB的接口，2个版本的接口方法基本一致，
只是实现不同，这个时候需要引入适配器模式，来使A系统和B系统一起工作。

Client: 系统A

Target: 接口 

Adapter:  适配器类

Adaptee:  系统B的1.0 版本接口、2.0 版本接口

## 四、 类图实现
[!object-adapter](/uml/adapter-pattern-object.png)

* Target: 用户所期待的接口，目标可以是具体的类或者抽象类，也是以是接口
 
* Adapter: 通过内部持有一个Adaptee对象，把源接口转换成目标接口

* Adaptee: 需要的适配的类

## 五、 模式优缺点
+ 优点
1. 可以让任何两个没有关联的类一起运行。 
2. 提高了类的复用。 
3. 增加了类的透明度。 
4. 灵活性好。
+ 缺点

过多地使用适配器，会让系统非常零乱，不易整体进行把握。
比如，明明看到调用的是 A 接口，其实内部被适配成了 B 接口的实现，一个系统如果太多出现这种情况，无异于一场灾难。
因此如果不是很有必要，可以不使用适配器，而是直接对系统进行重构。
## 六、 参考文档

http://w3sdesign.com/index0100.php#gf
https://www.cnblogs.com/laoxia/p/8026201.html