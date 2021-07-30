# 工厂模式
## package simple
### 问题描述
咖啡店跟生产咖啡之间耦合，如果再生产一咖啡，将修改CoffeeStore中的代码，违背“开闭原则”。

## package simple_factory
### 问题描述
解决了咖啡店跟生产咖啡之间的耦合，但是依旧违背“开闭原则”，如果添加一种咖啡，将要修改CoffeeFactory的代码。