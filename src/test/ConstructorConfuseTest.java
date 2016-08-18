package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.ConstructorConfuse;

public class ConstructorConfuseTest {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("test/constructor-confuse.xml");
		
		ConstructorConfuse con=context.getBean("consconfuseId",ConstructorConfuse.class);
		ConstructorConfuse con1=context.getBean("consconfuse2Id",ConstructorConfuse.class);
		
		System.out.println(con);
		System.out.println(con1);
		
		((ClassPathXmlApplicationContext) context).close();
		
		
		
		
	}

}
