package tn.essat.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tn.essat.model.Etudiant;
import tn.essat.model.Metier;

public class AppTest {
	public static void main(String[] args) {
	ApplicationContext cxt= new AnnotationConfigApplicationContext("tn.essat.model");
	Metier m= cxt.getBean(Metier.class);
	System.out.println(m.Message());
}
}
