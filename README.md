----------------------------------------------------------1-Content and Prerequisite-----------------------------------------------------------------------------------------
Content:-
 * Spring core
 * Spring data Integration
 * Spring web
 * Spring other important modules
 

Prerequesite:-
* Core java
*JDBC
*Hibernate
*Servlet & JSP
*Important web and database related terms
*Html,css,mysql,bootstrap

--------------------------------------------------2-What is Spring?,What is dependency injection framework ?---------------------------------------------------
What is spring ?
Spring is a dependency Injection framework which is used to make 
to make java application loosely coupled
Loosely coupled means you can easily make any changes 
 in your application whenever its required.

Tightly coupled means making changes in your application is very tough
 ---Spring framework makes the easy develpment of javaee application
  
what is dependency injection framework?

* It is a design Pattern by using which we can make application
 * class Ramu
 * {
     Geeta ob;
     public void doWork()
     {
       //Ramu is completely dependent on geeta 
       //He cant perform his task without geeta
       //This is called dependency 
       //When one class is dependent on other
       //If we tried to create object by using new keyword then
       our software or application will become highly coupled.
       //Here we gonna perform dependency injection action of spring framework
       It has the ability to create the object of any class and then inject it
       to other class where actually it is required.
       This whole process is called Inversion of control
       when we provide the control of object creation to the spring
       framework and then spring create the object of all dependency
       dynamically at run time then,this whole techniuqe is called 
       Inversion of Control(IOC)
       
     }
    
   }
   class Geeta
   {
     public void doWork()
     {
     
     } 
    }
 *Spring and JEE
 *UI layer-To handle the request->
 *Business/Services Layer-for Writing business logic->
 *Data Access Layer -To access the data->
 *Database
 *ProductController-Acception the requests,It will use the product service code and logics
 *ProductService-Business service logics will be there
 *ProductDao-It can direct contact to database,we will use DAO in Productservice


---------------------------------------------------------3-Spring Module------------------------------------------------------------------------------------
Spring Module:-

* Spring module is the spring framework which contains Spring core 
 * It contains Core,Beans,Context,spEL
 * Core,beans,Context provide the dependency injection of inversion of 
  control.
  * AOP,Aspect,Instrumentation,Messaging
  * Aspect oriented programming-Code should be separated so there
   should be decoupling
  * JDBC,ORM,JMS,OXM(Data integration layer)
  * Web,Servlet,Portlet,WebSocket(For Web application)
  * Test module(Unit testing,integration testing)-Provide junit or testng
 


-------------------------------------------------------------4-Spring IOC Container-------------------------------------------------------------------------
Spring IOC Container:-

/*
 * Spring container is a predefined Program
 * It is a component of spring framework.
 * This is responsible for creating the object
 * Hold the objects in the memory.
 * also able to inject the object if required.
 * We will have ready to use object so can use direct.
 * complete life cycle of object from its creation to destroy is manage
  by Spring container.
 * We will have  to tell which beans classes it need to manage.
 * configuration information
 * ApplicationContext-Its a interface,It represent our Ioc Container.
 * ClasspathXMLApplicatonContext
 * AnnotationConfigApplicatonContext
 * FileSystemXMLApplicatonContext
 these are the classes of that interface we can create object of 
 these classes.
 */


------------------------------------------------------------5-Way of injecting dependencies-------------------------------------------------------------
Way of injecting dependencies:-
* class Student
 {
   int id;
   String name;
   Address address;
   
   }
   class Address
   {
   String street;
   String city;
   String state;
   String country;
   }
   *Dependency injection can be done in two ways
   *Using setter Injection
   *Using Constructor Injection
   
   class Student
   {
     id,name,address;
     setId(id)
     {
     }
     setName(name)
     {
     }
 
     setAddress(address)
     {
     }
 }
 class Address
 {
   street,city,state,country;
   setStreet(street)
   setCity(city)
   setState(state)
   setCountry(country)
   
   }
   *Configuration File
   *we will have to inform to our IOC,It is called beans class.
   *Or it is also called XML file.
   *Where we declare beans and its dependencies.
   *<beans>
   <bean>
   ------
   ------
   ------
   *Data Types(Dependencies)
   1-Primitive DataTypes-Byte,char,int ---
   2-Collection type-List,Set,Map and properties.
   3-Reference Type
   
   </beans>
   
 */
---------------------------------------------------------6-creating a project and add dependencies---------------------------------------------------------

/*
 * -------Creating a New Project---------
 * Click on file
 * click on new 
 * click on Maven project
 * click on next 
 * select Internal from list
 * select quickstart
 * click on next
 * Give groupid
 * Give artifact id
 * Give package name
 * click on finish
 ----------Add dependencies----------
 *open pom.xml
 *search "spring core maven" ,for core dependencies in chrome browser
 *click on first link in browser.
 *select any version of dependecies
 *click on any version
 *copy the code 
 *paste it to pom.xml between <dependencies>  <dependency>
 *search "spring context" for context dependencies in chrome browser
 *select the same version that you have selected for core dependencies
 *paste it to pom.xml after down to previous dependencies.
 *Now we are able to perform any practical related to dependencies.
 *This will be fetch from the internet into our project.
 *If still any error persist in your code 
 *Then follow these steps:
 *click on maven project
 *right click on maven
 *click on update project
 *select your project
 *click on ok
 *---------Creating beans -Java pojo->beans is just nothing its a java class
 which contains some properties and contains the getters setters
 methods.
 *Right click on your package of your project
 *click on new
 *click on class
 *give any name to the class.
 *Now this is your beans class this can hold the data.
 *take some properties like -private int StudentId;
 *Now we will have to generate getters and setters and then constructor.
 *click on source in eclipse menu bar or select all your properties
 and right click and click on generate getters and setters
 *click on generate getter and setters.
 *click on selectall
 *click on generate.
 *now for generating constructor
 *click on source again in eclipse menu bar
 *click on "generate constructor using fields"
 *click on generate.
 *now for generate super class constructor.
 *click on source
 *click on generate constructor for super class.
 *click on generate.
 *Now here we have Getters and setters.
 *we have two constructors here one is default and one is paramerized.
 *Now we have to generate to string method
 *click on source.
 *click on generate tostring()
 *click on generate.
 toString() method-when we will print the object or its reference variable 
 then all the values of its properties like studentid,studentname will
 get printed with the help of this method.
 
 *---------creating configuration file-Configue.xml----------------
 name of xml file could be anything.
 *right click on our src/main/java 
 *click on new
 *click on other
 *search xml
 *click on XML File
 *click on next
 *give any name to your xml file
 *click on finish.
 *Now first of all you will have to defined namespace in this xml file
 *so get this by the documentation itself available on the internet.
 *search "spring 5 documentation pdf"
 *save this pdf for your reference.
 *click on first link
 *and open pdf.
 *click on configuration metadata in pdf which is in core technologies.
 *scroll down the pdf little bit
 *there will be one heading like "The following example shows the basic
 Structure of XML-based configuration metadata:
 *copy the beans code only or only this namespace.
 <?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:context="http://www.springframework.org/schema/context"
	xmlns:p="http://www.springframework.org/schema/p"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans.xsd
    http://www.springframework.org/schema/context
    http://www.springframework.org/schema/context/spring-context.xsd">    
    
      	 

   
    

</beans>


 *Give this code inside beans,
    <!--  this is our beans -->    
    <bean class="com.springcore.Student/Packagename.classname" name="student1">
    	<property name="studentId">
    		<value>22344</value>
    	</property>    	
    	<property name="studentName">
    		<value>John</value>
    	</property>
    	
    	<property name="studentAddress">
    		<value>
    			Lucknow
    		</value>
    	</property>
    
    </bean>
*Setter injection we already have done
*Main class :Which can pull the object and use.
*ApplicationContext context=new ClassPathXmlApplicationContext("Configue.xml");
        Student student1=(Student) context.getBean("student1");
        System.out.println(student1);
        
        
        *************--------------
                  Video-Property injection using p schema and using 
                  value as attribute-------------------*********
*    	
*    Here we are using value attribute to give the value to our properties.
*    
    <property name="studentId" value="23424"/>
    <property name="studentName" value="Monu Verma"/>
    <property name="studentAddress" value="Lucknow"/>
-------------------------------------------------------------------7-Using p schema-----------------------------------------------------------------------
Before using this method we have to pass this link
	xmlns:p="http://www.springframework.org/schema/p"

    <bean class="com.springcore.Student" name="student1" p:studentId="23421" p:studentName="Ram" p:studentAddress="Kotdwara"/>

*    
*        

*    

 */

Installation notes :-
* Install Eclipse/Netbeans/Intellij
 * Install TomcatServer-for Spring web
 * Mysql for database
 * workbench ,phpmyadmin for mysql gui


--------------------------------------------------------8-How to inject collection type- list,set,map,properties-----------------------------------------------------

/*
 * Collection types___
 <bean>
     <property name="">
      <list>
         <value>10</value>
          <value>11</value>
         <value>12</value>
         <value>13</value>
         <null/>
         
         </list>
         </property>
         </bean>


Set-:
<bean>
     <property name="">
      <set>
         <value>10</value>
          <value>11</value>
         <value>12</value>
         <value>13</value>
         <null/>
         
         </set>
         </property>
         </bean>


Map-: is group of entries 
<bean>
<property name="">
  <map>
  <entry key="java",value="2month"/>
  <entry key="python",value="1month"/>
  </map>
  </property>
  </bean>
  
  
  
  Properties-:
  <bean>
  <property name="">
  <props>
  <prop key="name">Monu</prop>
  <prop key="Postname">Tester</prop>
  </props>
  </property>
  </bean>
  
 */

-----------------------------------------------------------9-Injecting Collection types-------------------------------------------------------------
/*
 * Create one package by right click on src/main/java
 * give it name as collection or whatever your choice. 
 * Create one bean class in the newly created package.
 * give it any name let suppose Emp.
 * instantiate the variable or properties in emp (bean)class.
 * click on source.
 * click on generate getter and setters.
 * click on source 
 * click on generate constructors using fields
 * click on source 
 * click on generate constructor from super class.
 Paste below codes to your xml class.
  <bean name="emp1" class="collection.Emp">
  	<property name="name" value="Radhe"/>
<property name="phones">
      <list>
         <value>7534050774</value>
          <value>8534931380</value>
         <value>8057830417</value>
         <value>9760492166</value>
         
         </list>
         </property>
         <property name="addresses">
      <set>
         <value>Delhi</value>
          <value>Kotdwara</value>
         <value>Dhampur</value>
         <value>noida</value>
  
         
         </set>
         </property>
         
         
         <property name="courses">
  <map>
  <entry key="java" value="1month"/>
  <entry key="python" value="2month"/>
  <entry key="c" value="3month"/>
  	
  
  </map>
  </property>
         
     
     
  	
  </bean>    	 

   
*write below code to your main class
ApplicationContext context=new ClassPathXmlApplicationContext("collection/collection_configue.xml");
        Emp emp1=(Emp) context.getBean("emp1");
        System.out.println(emp1.getName());
        System.out.println(emp1.getPhones());
        System.out.println(emp1.getAddresses());
        System.out.println(emp1.getCourses());

 * 
 */


----------------------------------------------------10-Injecting Reference Type--------------------------------------------------------------------
/*
 * 
 * Create one package by right click on src/main/java
 * give it name as reference_Type or whatever your choice. 
 * Create one  class in the newly created package.
 * give it any name let suppose A.
 * create one more class and give it somename let suppose B.
 * generate getters and setters for class A
 * generate constructor from super class for class A
 * generate tostring method for class A.
 * generate getters and setters for class B
 * generate constructor from super class for class B
 * generate tostring method for class B.
 * now create one xml file in the same pckg
 * or we can copy-paste previous xml file to our newly created package
 Paste this code to your xml 
 <bean class="reference_type.B" name="bref">
   	<property name="y" value="90"/>

   	
   	
   </bean>    	 
   <bean class="reference_type.A" name="aref">
   	<property name="x" value="12"/>
   	<property name="ob" ref="bref">

   		
</property>

   		
   	

   	
   	
   </bean>

   
    
for access paste this code
 ApplicationContext context=new ClassPathXmlApplicationContext("reference_type/Ref_Configue.xml");
        A a=(A) context.getBean("aref");
        System.out.println(a.getX());
        System.out.println(a.getOb().getY());
        System.out.println(a);
       


 */
---------------------------------------------------------------------11-Constructor Injection-------------------------------------------------------------
/*
 *---------Constructor-Injection----------------
 *Create one Person class in new pckg
 *define some property in Person class;
    private String name;
	private int personId;
	private Certi certi;
	private List<String>list;
*Make One Constructor in Person class itself;
public Person(String name,int personId,Certi certi,List<String>list)
	{
		this.name=name;
		this.personId=personId;
		this.certi=certi;
		this.list=list;
		
	}

*Make to string method by clicking on source then Generate toString()
@Override
	public String toString() {
		return this.name+" : "+this.personId+""+this.certi.name+""+"  "
				+ "   "+this.list;
		
	}
*create one configuration xml file;
*open xml file,write following code in xml configuration file.
<bean class="constructor_Injection.Certi" name="cer">
    		<constructor-arg value=" Android using kotlin"/>
    	</bean>
   <bean class="constructor_Injection.Person" name="person">
   	<constructor-arg value="MONU_VERMA"/>
   	<constructor-arg value="12" type="int"/>
   	<constructor-arg ref="cer"/>
   			<constructor-arg>
   		 <list>
         <value>Monu</value>
          <value>Shuaib</value>
         <value>Mukul</value>
         <value>Ritik</value> 
         </list>
   	</constructor-arg>	
   </bean>  
*define one Certi class for the reference type concept .
*And give this code there
public class Certi {
	String name;

	public Certi(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
}
*create one Test class and give following code for printing its object
ApplicationContext context=new ClassPathXmlApplicationContext("constructor_Injection/CIConfigue.xml");
        Person p=(Person) context.getBean("person");
        System.out.println(p);
*
*/
--------------------------------------------------------------12-Ambiguit problem and its solution with constructor----------------------------------------
/*
 * Create a class inside a package.
 * Give name as addition to this class.
 * declare two variable.
 * private int a;
 * private int b;
 After it write the following code to your addition class
 public Addition(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Constructor:int,int");
	}
	public Addition(double a,double b)
	{
		this.a=(int) a;
		this.b=(int) b;
		System.out.println("Constructor:double,double");
	}
	public Addition(String a,String b)
	{
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("Constructor: String,String");
		
	}
	public void doSum()
	{
		System.out.println("Sum is=  "+(this.a+this.b));
	}
}
After it write following code in your xml class

<bean class="ambiguity.Addition" name="add">
   	<constructor-arg value="12"/>
   	<constructor-arg value="34"/>
   		
   	
   	
   </bean>    	 

Call the method by writing following code in your main test class
ApplicationContext context=new ClassPathXmlApplicationContext("ambiguity/Configue.xml");
        Addition p=(Addition) context.getBean("add");

        p.doSum();


 */
-------------------------------------------------------------13-LifeCycle Methods of spring bean--------------------------------------------------------
/*
 * Spring provide two important methods to every bean automatically.
 1-public void init()-For initialization,loading config,connecting db
 webservice etc
 {
 }
 2-public void destroy()-for destroy,for clean up code.
 {
 }
 We can change the name of these methods but signature must be same.
 
 Life cycle-
 first of all we will provide a bean class to our spring ioc container
 And then we will provide configuration xml file to spring ioc container.
 it will create object first
 then it will set the values of properties
 then it will call init method
 then we read and use the bean
 then it will call destroy
 this call will be for clean up code
 ----------Configure technique------------
 XML
 Spring interface
 Annotation
 */
-----------------------------------------------------------14-Implementing LifeCycle Method using XML----------------------------------------
/*
 * create one package with name life_cycle
 * create one bean class called it Samosa name.
 * give property price;
 * generate getter and setters in source option
 * generate Constructor from superclass
 * make to string method to print the properties.
 this is the code of samosa class.
 public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
}
*copy xml file or create one new xml file and paste it to life_cycle package.
*Here it is the xml code.
<bean class="life_cycle.Samosa" name="s1" init-method="init" destroy-method="destroy">
   	<property name="price" value="10"/>
create one test class which contain our main method
AbstractApplicationContext context=new ClassPathXmlApplicationContext("life_cycle/Configue.xml");
        context.registerShutdownHook();

		Samosa s1=(Samosa) context.getBean("s1");
        System.out.println(s1);
        
 *Make two methods in bean class 
 public void init()
	{
		System.out.println("We are inside init method");
	}
	public void destroy()
	{
		System.out.println("We are inside destroy method");
	}
	Then define these methods in configue xml file
	        context.registerShutdownHook();
give this method for destroy method which is in AbstractApplicationContext
 * 
 */
---------------------------------------------------------15-Implementing LifeCycle Methods Using Interfaces------------------------------------------
/*
 * InitializingBean
 * DisposableBean
 * create one bean class called it Pepsi name.
 * give property price;
 * generate getter and setters in source option
 * generate Constructor from superclass
 * make to string method to print the properties.
 this is the code of Pepssi class.
 
 public class Pepsi implements InitializingBean ,DisposableBean{

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Taking pepsi: Init");
		
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Taking pepsi: Destroy");

		
	}
	
}

---Code for test class-------
System.out.println("+++++++++++++++++++++");
        Pepsi p1=(Pepsi) context.getBean("p1");
        System.out.println(p1);
-----Code for xml file-------
<bean class="life_cycle.Pepsi" name="p1">
	<property name="price" value="5"/>


 */
-----------------------------------------------------16-Implementing LifeCycle Methods Using Annotations--------------------------------------------------
/*
 *@PostConstruct-work like init
 *@PreDestroy-
 create one bean class called it Example name.
 * give property subject;
 * generate getter and setters in source option
 * generate Constructor from superclass
 * make to string method to print the properties.
 this is the code of Example class.
-----code for xml class-----
	<bean class="life_cycle.Example" name="example">
   		<property name="subject" value="Math"/>
   		
   	</bean>
  -----code for test class------
  Example e1=(Example) context.getBean("example");
		System.out.println(e1);
for adding the dependency for annotation
search "PostConstruct String" in chrome brwoser
open first link
scroll down 
copy the code given in java 9+
paste it to your pom xml
save.
 *
 */

-------------------------------------------------------17-Autowiring in spring framework-----------------------------------------------------------------
/*
 * ----------Autowiring----------------
 * Autowiring is a feature of spring framework in which spring container inject the 
  dependency automatically.
  *Autowiring can't be used to inject primitive and string values.
  It works with reference only.
  *Autowiring can be done in 2 ways.
  1-XML
  2-Annotations.
  *Autowiring modes for xml-
  no
  byName
  byType
  constructor
  autodetect
  Autowiring modes for Annotations-
  @Autowired
  we can use this @Autiwired annotation at 3 places
  1-before the setter injection we can use @Autowired
  2-before property 
  3-before constructor
  ------Advantages of Autowiring-----------
  *Automatic
  *Less code
    ------DisAdvantages of Autowiring-----------
    *No control of programmer
    *It cant be used for primitive and string values.

 */
------------------------------------------------------------18-Autowire using XML-----------------------------------------------------------------------

------------------------------------------------------------19-@Autowired annoatation for autowiring----------------------------------------------------
/*
 * create new package
 * copy all classes of autowiring package to new package.
 * there are 3 ways of performing autowiring using annotation
 1-we can use @autowire annotation up to the setter injection
 2-we can use @autowire annotation up to the Property.
 3-we can use @autowire annotation up to the constructor injection
 

 */
-------------------------------------------------------------20-@Qualifier annotation with autowiring----------------------------------------------------
/*
 * for providing the reference of the particular bean we do used @Qualifier("address")
 */
------------------------------------------------------------21-Spring Standalone collections------------------------------------------------------------
/*
 * --------Standalone Collections-----------
 * scope of stand alone collection is global,we can use it anywhere,but
 normally when we give collection type only in that bean we can use it.
 *for this reason we used stanalone collections.
 *We could also give the implementation class of these collection type
 by using standalone.
 *In normal collection type it gives any class which is set by default.
 *For Xml configuration.
 	<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:context="http://www.springframework.org/schema/context"
	xmlns:p="http://www.springframework.org/schema/p"
	xmlns:util="http://www.springframework.org/schema/util"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans.xsd
    http://www.springframework.org/schema/context
    http://www.springframework.org/schema/context/spring-context.xsd
	http://www.springframework.org/schema/util
    http://www.springframework.org/schema/util/spring-util.xsd">
<util:list list-class="java.util.Vector" id="mybestfriends">
	<value>Aman</value>
	<value>Ram</value>
	<value>Hari</value>
	<value>Lucky</value>
</util:list>



<util:map map-class="java.util.HashMap" id="fees">
	<entry key="Spring Framework" value="8000"/>
	<entry key="Django Framework" value="5000"/>
	<entry key="Hibernate Framework" value="9000"/>
		
	
	
</util:map>
<util:properties id="dbconfig">
	<prop key="driver">com.mysql.jdbc.Driver </prop>
	<prop key="username">Monu</prop>
	<prop key="password">abc</prop>
	<prop key="url">mysql:jdbc://localhost:3306/database</prop>
	
	
</util:properties>
    
   <bean class="stand.beanclass" name="bc">
   	<property name="friends" ref="mybestfriends" />
   	<property name="fs" ref="fees" />
   	 <property name="properties" ref="dbconfig" />
   			
   	
   </bean>
   
     <bean class="stand.beanclass" name="bc2">
   	<property name="friends" ref="mybestfriends" />

   	
   </bean>
  

</beans>


 */
---------------------------------------------------------------22-Stereotype annotation------------------------------------------------------------------
/*
 * Stereotype Annotations provide us the alternate of xml file
 * Here in Stereotype Annotations we can do all that xml bean tag work
 with the help of its annotation.
 Here it provide @Component annotation
 
 */
----------------------------------------------------------------23-collection with @value-----------------------------------------------------
----------------------------------------------------------------24-Spring bean scope------------------------------------------------------------
/*
 * There are some already defined scope.
 * Singleton
 * prototype
 * request
 * session
 * globalsession
 request and session used for web application specifically.
 Singleton-It is apply by default automatically.
 Spring container will create singleton object by default.
 when we configure any class ,and then we ask its object to ioc container
 then ioc container make only single object,and whenever we called it
 ,ioc container will give the reference of this object again and again
 one object per application we can say like that.
 prototype means everytime you will get a new object.
 globalsession is used for ported application.
 
 Everytime you will call for an object to spring container it will give
 you same object.
 ApplicationContext con=new ClassPathXmlApplicationContext("Stereotype/StereoConfigue.xml");
		Student student=(Student)con.getBean("student");
System.out.println(student.hashCode());
		Student s2=con.getBean("student",Student.class);
		System.out.println(s2.hashCode());
 so basically this is what singleton scope means is.
 But if everytime you want a new object so you will have to change by default singleton
 to prototype.
 We can configure bean scope by two ways;
 one is xml
 other is annoation
 for annotation
 @Scope("prototype")
this annotation will be used with @Component only

 
 */
--------------------------------------------------------------25-Spring Expression Language----------------------------------------------------------
/*
 * Spring Expression language support two things with the help of
 @Value annotations.
 syntax-:@Value("#{expression}")
 * 1-Parsing
 * 2-Executing
 * Expression could be anything listed below:
 Classes,Variable,Method,Constructors and Objects
 expression could also be a symbol like-
 char,numerics,operators,keywords and special symbols which return a value
 lets discuss few examples:
 @Value("#{11+22}")
 @Value("#{8>6?88:55}")
we can call static methods and object method also ,and variables as well

 */
-------------------------------------------------------------26-How to invoke static method using expression language-----------------
/*
 * Syntax:
 * T(class).method(parameters)
 * T(class).variable
 * 	@Value("#{T(java.lang.Math).sqrt(289)}")
	@Value("#{T(java.lang.Math).PI}")
How to create object 
new Object(value)
	@Value("#{new java.lang.String('Monu')}")

 * 
 */
-----------------------------------------------------------------27-Boolean Type with SPEL---------------------------------------------------------
/*
 * @Value("#{8-5>3}")

 */
-------------------------------------------------------------28-Removing Complete XML for spring configuration-------------------------------------
