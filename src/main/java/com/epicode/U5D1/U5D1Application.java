package com.epicode.U5D1;

import com.epicode.U5D1.entities.Menu;
import com.epicode.U5D1.entities.Table;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

@SpringBootApplication
@Slf4j
public class U5D1Application {

	public static void main(String[] args) {
		SpringApplication.run(U5D1Application.class, args);


		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5D1Application.class);

		Menu m = (Menu) ctx.getBean("menu");
		Table t = (Table) ctx.getBean("table");


		Scanner scanner = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("Benvenuto al ristorante Princo Budget!");
		System.out.println("Questo e il nostro Menù");

		System.out.println();

		m.printMenu();


		System.out.println("Cosa vi porto?");



		ctx.close();
	}

}
