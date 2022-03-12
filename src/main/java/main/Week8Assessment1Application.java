package main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.boot.CommandLineRunner;

import main.beans.Specs;
import main.beans.Computers;

import main.controller.BeanConfiguration;

import main.repository.ComputersRepository;

@SpringBootApplication
public class Week8Assessment1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Week8Assessment1Application.class, args);
		//ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
	//	Computers c = appContext.getBean("computers", Computers.class);
	//	System.out.println(c.toString());
	
	//((AbstractApplicationContext) appContext).close();
	}
	@Autowired
	ComputersRepository repo;

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//Using an existing bean
		Computers c = appContext.getBean("computers", Computers.class);
		c.setBrand("Tandy");
		repo.save(c);
		
		//Create a bean to use - not managed by Spring
		Computers d = new Computers(10002, "SUN", "MK40", 3, 11, 2022);
		Specs a = new Specs("32GB", "1TB", "4.6Ghz");
		d.setSpecs(a);
		repo.save(d);
		
		List<Computers> allMyComputers = repo.findAll();
		for(Computers computers: allMyComputers) {
			System.out.println(computers.toString());
		}
		
		//closes the ApplicationContext resource leak - not imperative to add but nice to clean it up
		((AbstractApplicationContext) appContext).close();
	
	}

}
