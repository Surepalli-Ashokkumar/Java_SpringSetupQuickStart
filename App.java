package com.cisco.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	HelloWorld hello = (HelloWorld)context.getBean("obj");
    	hello.print();
    	

    	Student s=(Student) context.getBean("s1");
    	System.out.println("Id: "+s.getId());
    	System.out.println("Name: "+s.getName());
    	
    	Marks m=s.getMarks();
    	
    	System.out.println("Physics: "+m.getPhy());
    	System.out.println("Chemistry: "+m.getChem());
    	System.out.println("Mathematics: "+m.getMaths());
    	
    }
}
