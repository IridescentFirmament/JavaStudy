[toc]

#### 学习第一天

##### 文档注释

<span style="font-family:楷体">格式如下</span>

```java
/**
@author 指定java程序的作者
@version 指定源文件的版本
*/
```

<span style="font-family:楷体">注释内容可以被JDK提供的工具javadoc所解析，生成一套以网页形式体现的该程序的说明文档。</span>

<span style="font-family:楷体">操作方式如下：</span>

```java
javadoc -d mydoc -author -version HelloJava.java
```

##### 总结

- Java程序编写-编译-运行的过程

<span style="font-family:楷体">编写：我们将编写的Java代码保存在以".java"结尾的源文件中。</span>

<span style="font-family:楷体">编译：使用java.exe命令编译Java源文件。格式：javac 源文件名.java，得到字节码文件。</span>

<span style="font-family:楷体">运行：使用java.exe命令解释运行字节码文件。格式：java类名。</span>

- <span style="font-family:楷体">在一个Java源文件里可以声明多个class，但是最多只能有一个类可以声明为public的，且能声明为public的类的类名，必须和源文件名一样。</span>
- <span style="font-family:楷体">程序的入口是main()方法，格式是固定的：public static void main(String[] args)。</span>
- <span style="font-family:楷体">输出语句：System.out.println()，先输出数据再换行；System.out.print()只输出数据，不换行。</span>
- <span style="font-family:楷体">每一行执行语句末尾都有分号。</span>
- <span style="font-family:楷体">编译的过程：编译以后会生成一个或多个字节码文件，字节码文件的文件名与Java源文件中的类名相同。</span>



#### 学习第二天

##### 关键字与保留字

- **<span style="font-family:楷体">关键字（key word）</span>**

<span style="font-family:楷体">Java中的关键字所有字母都是小写的</span>

<table>
	<tr><th colspan = 5>用于定义数据类型的关键字</th></tr>
    <tr><td>class</td><td>interface</td><td>enum</td><td>byte</td><td>short</td></tr>
    <tr><td>int</td><td>long</td><td>float</td><td>double</td><td>char</td></tr>
    <tr><td>boolean</td><td>void</td><td></td><td></td><td></td></tr>
    <tr><th colspan=5>用于定义流程控制的关键字</th></tr>
    <tr><td>if</td><td>else</td><td>switch</td><td>case</td><td>default</td></tr>
    <tr><td>while</td><td>do</td><td>for</td><td>break</td><td>continue</td></tr>
    <tr><td>return</td><td></td><td></td><td></td><td></td></tr>
    <tr><th colspan=5>用于定义访问权限修饰符的关键字</th></tr>
    <tr><td>private</td><td>protected</td><td>public</td><td></td><td></td></tr>
    <tr><th colspan=5>用于定义类，函数，变量修饰符的关键字</th></tr>
    <tr><td>abstract</td><td>final</td><td>static</td><td>synchronized</td><td></td></tr>
    <tr><th colspan=5>用于定义类与类之间关系的关键字</th></tr>
    <tr><td>extends</td><td>implements</td><td></td><td></td><td></td></tr>
    <tr><th colspan=5>用于定义建立实例及引用实例，判断实例的关键字</th></tr>
    <tr><td>new</td><td>this</td><td>super</td><td>instanceof</td></tr>
    <tr><th colspan=5>用于异常处理的关键字</th></tr>
    <tr><td>try</td><td>catch</td><td>finally</td><td>throw</td><td>throws</td></tr>
    <tr><th colspan=5>用于包的关键字</th></tr>
    <tr><td>package</td><td>import</td><td></td><td></td><td></td></tr>
    <tr><th colspan=5>其他修饰符关键字</th></tr>
    <tr><td>native</td><td>strictfp</td><td>transient</td><td>volatile</td><td>assert</td></tr>
    <tr><th colspan=5>用于定义数据类型值的字面值</th></tr>
    <tr><td>true</td><td>false</td><td>null</td><td></td><td></td></tr>
</table>

- **<span style="font-family:楷体">保留字（reserved word）</span>**

<span style="font-family:楷体">现有Java版本尚未使用，但以后版本可能会作为关键字使用，例如goto和const。</span>

##### 标识符

<span style="font-family:楷体">Java中标识符严格区分字母大小写，标识符中不能含有空格，不能用关键字和保留字作为标识符，不能以数字开头。</span>

##### 命名规范

- <span style="font-family:楷体">包名：多单词组成时所有单词都小写：xxxyyyzzz。</span>
- <span style="font-family:楷体">类名、接口名：多单词组成时，所有单词的首字母大写：XxxYyyZzz。</span>
- <span style="font-family:楷体">变量名、方法名：多单词组成时，每一个单词首字母小写，第二个单词开始每个单词首字母大写：xxxYyyZzz。</span>
- <span style="font-family:楷体">常量名：所有字母都大写，多单词时，每个单词之间用下划线链接：XXX_YYY_ZZZ。</span>

<span style="font-family:楷体">Java采用Unicode字符集，所以定义变量名可以用中文，但是不建议这样使用。</span>

##### 定义变量

<span style="font-family:楷体">变量定义后必须要先初始化，然后才能使用；long型变量必须以L或l结尾，例如long l1 = 1234L或long l1 = 1234l，但是如果没加l或L，编译器不会报错，会当成int型数据；float型变量必须以F或f结尾，例如float f1 = 123.4F或float f1 = 123.4f，与long数据类型不同，不加f或F编译器会报错。</span>



#### 学习第三天

##### 自动类型提升

<span style="font-family:楷体">当容量小的数据类型变量与容量大的数据类型变量做运算，则结果的数据类型自动提升为容量大的数据的数据类型，此处容量大不是指占用内存大，而是指数据范围大。</span>

<span style="font-family:楷体">byte --> short --> int --> long --> float --> double</span>

<span style="font-family:楷体">char与byte、short比较特殊，这里不能简单用上面的规律来概括。</span>

<span style="color:red">注意：</span>

- <span style="font-family:楷体">short数据类型与char数据类型做运算，得到的结果是int数据类型。</span>
- <span style="font-family:楷体">short数据类型与byte数据类型做运算，得到的结果是int数据类型。</span>
- <span style="font-family:楷体">byte数据类型与char数据类型做运算，得到的结果是int数据类型。</span>
- <span style="font-family:楷体">byte与byte做数据运算、char与char做数据运算、short与short做数据运算，得到的结果也都是int数据类型。</span>

##### 强制类型转换

<span style="font-family:楷体">强制类型转换是自动类型提升的逆运算。</span>

<span style="font-family:楷体">格式如下：</span>

```java
double d = 12.9;
int i = (int)d;  // i = 12
```

<span style="font-family:楷体">强制类型转换可能造成精度损失。</span>

<span style="color:red">注意：</span>

- <span style="font-family:楷体">整型常量默认类型是int型。</span>
- <span style="font-family:楷体">浮点型常量默认类型是double型。</span>

##### String类型

<span style="font-family:楷体">1、String属于引用数据类型。</span>

<span style="font-family:楷体">2、String可以和八种基本数据类型做运算，且运算只能是连接运算，运算符是“+”，运算结果仍然是String类型。</span>

<span style="color:red">注意：</span>

<span style="font-family:楷体">“+”运算顺序是从左往右进行的，所以c+num+str的结果是107hello，原因就是c是char类型，遇到int类型的num做“+”运算（加法）后，得到结果是int类型的107，然后再与String类型的str做“+”（连接操作）运算，得到107hello，而不是a10hello！</span>

```java
char c = 'a';
int num = 10;
String str = "hello";
System.out.println(c + num + str);  // 107hello
System.out.println(c + str + num);  // ahello10
System.out.println(c + (num + str));  // a10hello
System.out.println((c + num) + str);  // 107hello
System.out.println((str + num) + c);  // hello10a
```

##### 进制转换

<span style="font-family:楷体">二进制用0b或0B开头，八进制用0开头，十六进制用0x或0X开头。</span>

<span style="font-family:楷体">计算机底层存储数据，都是只存储数据的补码。</span>

##### 算数运算符

<table>
    <tr><th>运算符</th><th>运算</th><th>范例</th><th>结果</th></tr>
    <tr><td>+</td><td>正号</td><td>+3</td><td>3</td></tr>
    <tr><td>-</td><td>负号</td><td>b=4;-b</td><td>-4</td></tr>
    <tr><td>+</td><td>加</td><td>5+5</td><td>10</td></tr>
    <tr><td>-</td><td>减号</td><td>10-6</td><td>4</td></tr>
    <tr><td>*</td><td>乘号</td><td>3*2</td><td>6</td></tr>
    <tr><td>/</td><td>除号</td><td>6/3</td><td>2</td></tr>
    <tr><td>%</td><td>取余（取模）</td><td>5%3</td><td>2</td></tr>
    <tr><td>++</td><td>前自增，先运算后取值</td><td>a=2;b=++a</td><td>a=3;b=3</td></tr>
    <tr><td>++</td><td>后自增，先取值后运算</td><td>a=2;b=a++</td><td>a=3;b=2</td></tr>
    <tr><td>--</td><td>前自减，先运算后取值</td><td>a=2;b=--a</td><td>a=1;b=1</td></tr>
    <tr><td>--</td><td>后自减，先取值后运算</td><td>a=2;b=a--</td><td>a=1;b=2</td></tr>
    <tr><td>+</td><td>字符串链接</td><td>"hel"+"lo"</td><td>hello</td></tr>
</table>

<span style="color:red">注意：</span>

- <span style="font-family:楷体">基本数据类型之间运算时，存在自动类型提升现象，byte --> short --> int --> long --> float --> double。</span>

##### 扩展算数运算符

<table>
    <tr><th>运算符</th><th>运算</th><th>范例</th><th>结果</th></tr>
    <tr><td>+=</td><td>加法</td><td>a=3;a+=2</td><td>5</td></tr>
    <tr><td>-=</td><td>减法</td><td>b=4;b-=3</td><td>1</td></tr>
    <tr><td>*=</td><td>乘法</td><td>c=2;c*=3</td><td>6</td></tr>
    <tr><td>/=</td><td>除法</td><td>d=6;d/=2</td><td>3</td></tr>
    <tr><td>%=</td><td>取余（取模）</td><td>e=5;e%=2</td><td>1</td></tr>
</table>

##### 逻辑运算符

<table>
    <tr><th>运算符</th><th>运算</th><th>范例</th><th>结果</th></tr>
    <tr><td>|</td><td>逻辑或</td><td>b=true;a=2;b | (a++>0)</td><td>a=3</td></tr>
    <tr><td>||</td><td>短路或</td><td>b=true;a=2;b || (a++>0)</td><td>a=2</td></tr>
    <tr><td>&</td><td>逻辑与</td><td>b=false;a=2;b & (a++>0)</td><td>a=3</td></tr>
    <tr><td>&&</td><td>逻辑或</td><td>b=false;a=2;b && (a++>0)</td><td>a=2</td></tr>
</table>

##### 位运算符

<table>
    <caption>位运算符</caption>
    <tr><th>运算符</th><th>运算</th><th>范例</th></tr>
    <tr><td><<</td><td>左移</td><td>3<<2=12 --> 3*2*2=12</td></tr>
    <tr><td>>></td><td>右移</td><td>3>>1=1 --> 3/2=1</td></tr>
    <tr><td>>>></td><td>无符号右移</td><td>3>>>1=1 --> 3/2=1</td></tr>
    <tr><td>&</td><td>与运算</td><td>6&2=6</td></tr>
    <tr><td>|</td><td>或运算</td><td>6|1=7</td></tr>
    <tr><td>^</td><td>异或</td><td>6^3=5</td></tr>
    <tr><td>~</td><td>取反</td><td>~6=-7</td></tr>
</table>


#### 学习第四天

##### 三元运算符

<span style="font-family:楷体">格式如下：</span>

<span style="font-family:楷体">(条件表达式)? 表达式1 : 表达式2</span>

<span style="font-family:楷体">条件表达式的结果是boolean类型，根据条件表达式的结果，决定执行表达式1，还是表达式2，如果表达式结果为true，则执行表达式1，如果表达式结果为false，则执行表达式2。</span>

<span style="color:red">注意：</span>

- <span style="font-family:楷体">三元运算符可以嵌套使用。</span>

```java
//求三个数中的最大值
int i1 = 4;
int i2 = 6;
int i3 = 13;
int max = (i1 > i2)? ((i1 > i3)? i1 : i3) : ((i2 > i3)? i2 : i3);  // max = 13
```

<span style="font-family:楷体">所有用三元运算符实现的代码都可以使用if-else结构实现，但是if-else结构实现的代码，三元运算符不一定能够实现，如果某个判断逻辑既可以使用三元运算符也可以使用if-else结构，那么推荐使用三元运算符来实现。</span>

##### 从键盘获取输入值--Scanner

<span style="font-family:楷体">具体实现步骤：</span>

<span style="font-family:楷体">1、导包：import java.util.Scanner</span>

<span style="font-family:楷体">2、Scanner的实例化</span>

<span style="font-family:楷体">3、调用相应方法接收指定类型的变量</span>

```java
import java.util.Scanner
class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        String s = scan.next();
        boolean b = scan.nextBoolean();
        short sh = scan.nextShort();
        double d = scan.nextDouble();
        float f = scan.nextFloat();
    }
}
```

##### if-else

<span style="color:red">注意：</span>

- <span style="font-family:楷体">if-else遵循就近原则！</span>



#### 学习第五天

##### switch-case

<span style="font-family:楷体">格式如下：</span>

```java
switch(表达式) {
    case 常量1:
        执行语句1;
        // break;
    case 常量2:
        执行语句2;
        // break;
    default:
        执行语句n;
        // break;
}
```

<span style="font-family:楷体">说明：</span>

- <span style="font-family:楷体">根据switch表达式中的值，一次匹配各个case中的常量，一旦匹配成功，则进入相应的case结构中，调用其执行语句，当调用完执行语句以后，则仍然继续向下执行其他case结构中的执行语句，直到遇到break关键字或此switch-case结构末尾为止。</span>
- <span style="font-family:楷体">在switch-case结构中遇到break关键字，则跳出switch-case结构。</span>
- <span style="font-family:楷体">switch-case结构中的表达式，只能是如下6种数据类型之一：byte、short、char、int、枚举类型（JDK5.0新增）、String类型（JDK7.0新增），不能放boolean和浮点型数据！</span>
- <span style="font-family:楷体">case之后只能声明一个常量，不能声明一个范围（case age > 18:）！</span>
- <span style="font-family:楷体">default是可选的，并且位置可以任意放。</span>

##### String转char

<span style="font-family:楷体">步骤如下：</span>

<span style="font-family:楷体">1、利用Scanner.next()从键盘获取一个字符串str。</span>

<span style="font-family:楷体">2、利用String.charAt(index)方法获取指定位置的字符，返回的数据类型是char类型。</span>

```java
Scanner scan = new Scanner(System.in);
String str = scan.next();
char c = str.charAt(0);
```

##### 循环结构

<span style="font-family:楷体">循环语句的四个组成部分：</span>

<span style="font-family:楷体">1、循环条件初始化；</span>

<span style="font-family:楷体">2、循环条件；</span>

<span style="font-family:楷体">3、循环体；</span>

<span style="font-family:楷体">4、条件迭代。</span>

```java
int num = 1;
for (System.out.print('a'); num <= 3; System.out.print('b'), num++) {
	System.out.print('c');
}
// 输出结果为 acbcbcb
```

<span style="font-family:楷体">while循环与for循环可以相互转换。</span>

<span style="color:red">do-while与while和for有区别：</span>

<span style="font-family:楷体">do-while循环结构是先执行条件初始化再执行循环体然后才是条件判断，而while与for都是先条件初始化再执行条件判断然后才是执行循环体。所以do-while循环结构至少执行一次循环体，类似于先斩后奏的感觉。</span>

<span style="font-family:楷体">形象点就是如下顺序：</span>

<span style="font-family:楷体">do-while：初始化 --> 循环体 --> 条件判断 -->循环体 --> 条件判断......</span>

<span style="font-family:楷体">while：初始化 --> 条件判断 --> 循环体 --> 条件判断 --> 循环体......</span>

<span style="font-family:楷体">for：初始化 --> 条件判断 --> 循环体 -- > 条件判断 --> 循环体......</span>

##### 获取当前时间

<span style="font-family:楷体">获取方式：</span>

```java
long nowTime = System.currentTimeMillis();  
// long数据类型，获得的是从1970年开始到现在经过的毫秒数
```

![](D:%5Cstudy%5CstudyGit%5Cpictures%5C1.PNG)

<img src="D:%5Cstudy%5CstudyGit%5Cpictures%5C2.PNG" style="zoom:38%;" />

<img src="https://gitee.com/SagaIridescent/pictures/raw/master/img/table_bg.jpg" style="zoom:25%;" />