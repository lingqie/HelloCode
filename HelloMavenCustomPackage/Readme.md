## 关于在maven项目如何自定义打包的例子

* Maven自定义打包格式，使用assembly.xml定义打包格式
* 注意pom加入jar－plugin来配置jar包的主函数和添加classpath，当然也可以在命令行中，输入java －jar  xxx.jar com.yabou.HelloWorld 来运行，如果这样就无需设置主函数
