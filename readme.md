# 创建者模式

## 1.1 单例模式

### 1.1.1 饿汉式

在类初始化的时候就创建该类的对象，相对浪费内存空间
demo1 中使用静态方法

![image-20210819153851878](https://github.com/devAwei/DesignPattern/blob/master/img/image-20210819153851878.png)

demo2 中使用静态代码块的方法

![image-20210819153916267](https://github.com/devAwei/DesignPattern/blob/master/img/image-20210819153916267.png)

### 1.1.2 懒汉式

在首次使用该类对象的时候创建

demo1 中加了 synchronized 保证线程安全，但是效率低下，实际只需要在首次创建该类对象的时候加锁即可。

![image-20210819153943867](https://github.com/devAwei/DesignPattern/blob/master/img/image-20210819153943867.png)

demo2 中采用双重检查锁的方式保证线程安全。效率相对demo1中较高，但会由于 JVM 指令重排序的问题导致 空指针异常
故加 volatile 关键字，保证顺序。

![image-20210819154017182](https://github.com/devAwei/DesignPattern/blob/master/img/image-20210819154017182.png)

demo3 中采用了静态内部类的方式实现单例模式。由于JVM的特性，在加载外部类的时候，不会去加载静态内部类，只有内部类的属性和方法被调用的时候才会去加载，并初始化其内部属性。静态属性由于被static 修饰，保证只被实例化一次，并且严格保证实例化顺序。

![image-20210819154146131](https://github.com/devAwei/DesignPattern/blob/master/img/image-20210819154146131.png)

**静态内部类单例模式是一种优秀的单例模式，是开源项目中比较常用的一种单例模式。在没有加任何锁的情况下，保证了多线程下的安全，并且没有任何性能影响和空间的浪费**

## 1.2 枚举方式

枚举类实现单例模式是极力推荐的单例实现模式，因为枚举类型是线程安全的，并且只会装载一次，设计者充分的利用了枚举的这个特性来实现单例模式，枚举类是所有单例模式视线中唯一一种不会被破坏的单例实现模式

> ​	public enum Singleton{
>
> ​			INSTANCE;
>
> ​	}

``说明：`` 

​		枚举方式属于恶汉式方式

## 1.3 破坏单例模式

### 1.3.1 序列化反序列化破坏单例模式

解决办法：

反序列化的时候会去自动调用 readResolve（） 方法，直接将该类对象返回即可

![image-20210819153815957](https://github.com/devAwei/DesignPattern/blob/master/img/image-20210819153815957.png)

### 1.3.2 反射破坏单例模式

解决办法：

在反射获取无参构造，在第二次调用无参构造创建对象的时候抛出异常

![image-20210819154428647](https://github.com/devAwei/DesignPattern/blob/master/img/image-20210819154428647.png)

## 1.4 工厂模式

### 1.4.1 package simple

**问题描述**

咖啡店跟生产咖啡之间耦合，如果再生产一咖啡，将修改CoffeeStore中的代码，违背``开闭原则``。

### 1.4.2 package factory_simple

**问题描述**

简单工厂优点：

封装了创建对象的过程，可以通过参数直接获取对象。把对象的创建和业务逻辑分开，这样以后就避免了修改客户代码，如果要实现产品直接修改工厂类，而不需要在原代码中修改，这样降低了客户代码修改的可能性，更容易拓展。

缺点：

增加新产品的时候还需要修改工厂类的代码，违背了``开闭原则``

### 1.4.3 package factory_method

![image-20210819165400175](https://github.com/devAwei/DesignPattern/blob/master/img/image-20210819165400175.png)

工厂方法模式优点:

- 用户只需要知道具体工厂的名称就可以得到所要的产品,无需知道产品的具体创建过程;
- 在系统增加新的产品时, 只需要添加具体产品类和对应的具体工厂类,无需对原工厂进行任何修改,满足 ``开闭原则``

缺点:

- 每增加一个产品就要增加一个具体产品类和一个对应的具体工厂类,这增加了系统的复杂度。 

### 1.4.4 package factory_abstract

![image-20210819170719554](https://github.com/devAwei/DesignPattern/blob/master/img/image-20210819170719554.png)

抽象工厂的优点：

-  当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。

缺点：

-  当产品族中需要增加一个新的产品是，所有的工厂类都需要修改

## 1.5 原型模式

原型模式的克隆分为浅克隆和深克隆

> 浅克隆： 创建一个新对象，新对象的属性和原来对象完全相同，对于非基本类型属性，任指向原有属性所指向的对象的内存地址。
>
> 深克隆： 创建一个新对象，属性中引用的其他对象也会被克隆，不在指向原有对象地址。

JAVA  中 Object 类中提供了 Clone() 方法来实现浅克隆。

### 1.5.1 实现

![image-20210820094556815](https://github.com/devAwei/DesignPattern/blob/master/img/image-20210820094556815.png)

根据结果显示，执行 Clone() 方法创建对象的时候，构造方法没有执行，也就是说底层并不会采用 new 对象的形式进行创建对象；而且 Clone() 出来的对象跟原型对象不是同一个对象。

![image-20210820094822013](https://github.com/devAwei/DesignPattern/blob/master/img/image-20210820094822013.png)

### 1.5.2 使用场景

-  对象的创建非常复杂，可以使用原型模式快捷的创建对象。
-  性能和安全要求比较高。

![image-20210820164016722](https://github.com/devAwei/DesignPattern/blob/master/img/image-20210820164016722.png)

运行结果为：

![image-20210820163744974](https://github.com/devAwei/DesignPattern/blob/master/img/image-20210820163744974.png)

`` 说明 `` 

​    Stu 对象和 stu1 = c2.getStu() 是同一个对象,就会产生将 stu1对象中 name 属性改为 "lisi" ,将两个 Citation 对象中显示的都是 lisi 。这就是浅克隆的效果，对具体原型类（Citation）中的引用类型的属性进行引用的复制。这种情况需要使用深克隆，而进行深克隆需要使用对象流。代码如下：

```java
public static void main(String[] args) throws Exception{
    Citation c1 = new Citation();
    Student stu = new Student();
    stu.setName("zhangsan");
    c1.setStu(stu);

    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Md-003-prototype/src/citation/citation.txt"));
    out.writeObject(c1);

    ObjectInputStream in = new ObjectInputStream(new FileInputStream("Md-003-prototype/src/citation/citation.txt"));
    Citation c2 = ((Citation) in.readObject());
    c2.getStu().setName("lisi");
    c1.show();
    c2.show();
}
```

## 1.6 构建者模式

-  分离了不见得构造（由 Builder 来负责）和装配（由 Director负责）。从而可以构造出复杂的对象。这个模式适用于：某个对象的构建过程复杂的情况。
- 由于实现了构建和装配的解耦，不同的构建器，相同的装配，也可以做出不同的对象；相同的构建器，不同的装配顺序也可以做出不同的对象。也就是实现了构建算法、装配算法的解耦，实现了更好的复用。
- 构造者模式可以将部件和其组装过程分开，一步一步创建复杂的对象。用户只需要指定复杂对象的类型就可以得到该对象，而无须知道其内部的具体构造细节。

**缺点：**

- 建造者模式所创建的产品一般具有较多的共同点，其组成部分相似，如果产品之间的差异性很大，则不适合使用建造者模式，因此其使用范围收到一定的限制。

# 结构性模式

##  代理模式

-   idk代理和CGLIB代理
  使用ceLib实现动态代理，cGLib底层采用ASM字节码生成框架，使用字节码技术生成代理类，在JDK1.6之前比使用Java反射效率要高。唯一需要注意的是，cGLib不能对声明为final的类或者方法进行代理，因为CGLib原理是动态生成被代理类的子类。
  在JDK1.6、JDK1.7、JDK1.8逐步对JpK动态代理优化之后，在调用次数较少的情况下，JDK代理效率高于cGLib代理效率，只有当进行大量调用的时候，JDK1.6和JDK1.7比ccLib代理效率低一点，但是到JDK1.8的时候，JDK代理效率高于cGLib代理。所以如果有接口使用JDK动态代理，如果没有接口使用cGLIB代理。
- 动态代理和静态代理
  动态代理与静态代理相比较，最大的好处是接口中声明的所有方法都被转移到调用处理器一个集中的方法中处理(InvocationHandler.invoke)。这样，在接口方法数量比较多的时候，我们可以进行灵活处理，而不需要像静态代理那样每一个方法进行中转。
  如果接口增加一个方法，静态代理模式除了所有实现类需要实现这个方法外，所有代理类也需要实现此方法。增加了代码维护的复杂度。而动态代理不会出现该问题