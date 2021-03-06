# proxy

**代理是一种设计模式,作用:**
1. 预处理目标对象的方法,增加相关逻辑
2. 控制对目标对象的访问,安全

##静态代理
静态代理比较简单,代理对象包含委托对象,调用方调用代理对象的某个方法时候,代理对象增加自己的处理逻辑后,再调用委托对象的方法。为了增加一致性,往往让代理对象继承委托对象的同一个接口(当然也可以不这样做)。
- 优点:编码简单
- 缺点:硬编码,只服务一种委托对象,工程大,需要代理对象多时候,工作量大,而且依赖委托对象的方法,委托对象稍有变化,比如增加参数,改变返回值等,都需要多处改动,不符合程序员"懒"的目标

##动态代理
* java 动态代理主要包含两种: **jdkProxy** 和 **cglibProxy**。两者都依赖JAVA的反射功能。jdkProxy要求代理类必须implement一个或多个interface,而cglib不需要。
* spring的AOP就是基于动态代理实现的,如果委托对象实现了接口,默认使用jdkProxy,否则,使用cglibProxy

### jdkProxy
jdkProxy是JDK自带的代理方式,要求委托对象必须实现一个或多个接口。jdkProxy最终是生成一个委托对象实现的接口的实现匿名类,拥有接口的所有方法,经过内部invoke方法的处理后(事务控制,日志输出等),在调用委托对象的方法


### cglibProxy
cglibProxy是基于类本身的,通过反射,生成继承委托类的对象。
