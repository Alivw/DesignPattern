# 单例模式
## 饿汉式
在类初始化的时候就创建该类的对象，相对浪费内存空间
demo1 中使用静态方法

![image-20210819153851878](https://github.com/devAwei/DesignPattern/blob/master/img/image-20210819153851878.png)

demo2 中使用静态代码块的方法

![image-20210819153916267](https://github.com/devAwei/DesignPattern/blob/master/img/image-20210819153916267.png)

## 懒汉式
在首次使用该类对象的时候创建

demo1 中加了 synchronized 保证线程安全，但是效率低下，实际只需要在首次创建该类对象的时候加锁即可。

![image-20210819153943867](https://github.com/devAwei/DesignPattern/blob/master/img/image-20210819153943867.png)

demo2 中采用双重检查锁的方式保证线程安全。效率相对demo1中较高，但会由于 JVM 指令重排序的问题导致 空指针异常
故加 volatile 关键字，保证顺序。

![image-20210819154017182](https://github.com/devAwei/DesignPattern/blob/master/img/image-20210819154017182.png)

demo3 中采用了静态内部类的方式实现单例模式。由于JVM的特性，在加载外部类的时候，不会去加载静态内部类，只有内部类的属性和方法被调用的时候才会去加载，并初始化其内部属性。静态属性由于被static 修饰，保证只被实例化一次，并且严格保证实例化顺序。

![image-20210819154146131](https://github.com/devAwei/DesignPattern/blob/master/img/image-20210819154146131.png)

**静态内部类单例模式是一种优秀的单例模式，是开源项目中比较常用的一种单例模式。在没有加任何锁的情况下，保证了多线程下的安全，并且没有任何性能影响和空间的浪费**



## 枚举方式

枚举类实现单例模式是极力推荐的单例实现模式，因为枚举类型是线程安全的，并且只会装载一次，设计者充分的利用了枚举的这个特性来实现单例模式，枚举类是所有单例模式视线中唯一一种不会被破坏的单例实现模式

> ​	public enum Singleton{
>
> ​			INSTANCE;
>
> ​	}

``说明：`` 

​		枚举方式属于恶汉式方式



## 破坏单例模式

### 序列化反序列化破坏单例模式

解决办法：

反序列化的时候会去自动调用 readResolve（） 方法，直接将该类对象返回即可

![image-20210819153815957](https://github.com/devAwei/DesignPattern/blob/master/img/image-20210819153815957.png)



### 反射破坏单例模式

解决办法：

在反射获取无参构造，在第二次调用无参构造创建对象的时候抛出异常

![image-20210819154428647](https://github.com/devAwei/DesignPattern/blob/master/img/image-20210819154428647.png)

# 工厂模式
## package simple
### 问题描述
咖啡店跟生产咖啡之间耦合，如果再生产一咖啡，将修改CoffeeStore中的代码，违背``开闭原则``。

## package factory_simple
### 问题描述
简单工厂优点：

封装了创建对象的过程，可以通过参数直接获取对象。把对象的创建和业务逻辑分开，这样以后就避免了修改客户代码，如果要实现产品直接修改工厂类，而不需要在原代码中修改，这样降低了客户代码修改的可能性，更容易拓展。

缺点：

增加新产品的时候还需要修改工厂类的代码，违背了``开闭原则``

## package factory_method

![image-20210819165400175](https://github.com/devAwei/DesignPattern/blob/master/img/image-20210819165400175.png)

工厂方法模式优点:

- 用户只需要知道具体工厂的名称就可以得到所要的产品,无需知道产品的具体创建过程;
- 在系统增加新的产品时, 只需要添加具体产品类和对应的具体工厂类,无需对原工厂进行任何修改,满足 ``开闭原则``

缺点:

- 每增加一个产品就要增加一个具体产品类和一个对应的具体工厂类,这增加了系统的复杂度。 

## package factory_abstract

![image-20210819170719554](https://github.com/devAwei/DesignPattern/blob/master/img/image-20210819170719554.png)