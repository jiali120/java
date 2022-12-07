# java

##### Java 定义了两种异常：

　　- Checked exception: 继承自 Exception 类是 checked exception。代码需要处理 API 抛出的 checked exception，要么用 catch 语句，要么直接用 throws 语句抛出去。

　　- Unchecked exception: 也称 RuntimeException，它也是继承自 Exception。但所有 RuntimeException 的子类都有个特点，就是代码不需要处理它们的异常也能通过编译，所以它们称作 unchecked exception。RuntimeException（运行时异常）不需要try...catch...或throws 机制去处理的异常。

* NullpointerException 的继承级别。 

* NullpointerException 继承自 RuntimeException，所以它是个 unchecked exception。
