package com.epicode.U5D1.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
	@Bean(name = "toppings_tomato")
	public Topping toppingTomatoBean() {
		return new Topping("Tomato", 0, 0);
	}

	@Bean(name = "toppings_cheese")
	public Topping toppingCheeseBean() {
		return new Topping("Cheese", 92, 0.69);
	}

	@Bean(name = "toppings_ham")
	public Topping toppingHamBean() {
		return new Topping("Ham", 35, 0.99);
	}

	@Bean(name = "toppings_pineapple")
	public Topping toppingPineappleBean() {
		return new Topping("Pineapple", 24, 0.79);
	}

	@Bean(name = "toppings_salami")
	public Topping toppingSalamiBean() {
		return new Topping("Salami", 86, 0.99);
	}


	@Bean(name = "pizza_margherita")
	public Pizza pizzaMargheritaBean() {
		List<Topping> tList = new ArrayList<>();
		tList.add(toppingTomatoBean());
		tList.add(toppingCheeseBean());
		return new Pizza("Pizza Margherita", tList, false);
	}

	@Bean(name = "hawaiian_pizza")
	public Pizza pizzaHawaiianBean() {
		List<Topping> tList = new ArrayList<>();
		tList.add(toppingTomatoBean());
		tList.add(toppingCheeseBean());
		tList.add(toppingHamBean());
		tList.add(toppingPineappleBean());
		return new Pizza("Hawaiian Pizza", tList, false);
	}

	@Bean(name = "salami_pizza")
	public Pizza pizzaSalamiBean() {
		List<Topping> tList = new ArrayList<>();
		tList.add(toppingTomatoBean());
		tList.add(toppingCheeseBean());
		tList.add(toppingSalamiBean());
		return new Pizza("Salami Pizza", tList, false);
	}

	@Bean(name = "salami_pizza_xl")
	public Pizza pizzaSalamiXlBean() {
		List<Topping> tList = new ArrayList<>();
		tList.add(toppingTomatoBean());
		tList.add(toppingCheeseBean());
		tList.add(toppingSalamiBean());
		return new Pizza("Salami Pizza XL", tList, true);
	}

	@Bean(name = "lemonade")
	public Drink lemonadeBean() {
		return new Drink("Lemonade", 128, 1.29);
	}

	@Bean(name = "water")
	public Drink waterBean() {
		return new Drink("Water", 0, 1.29);
	}

	@Bean(name = "wine")
	public Drink wineBean() {
		return new Drink("Wine", 607, 7.49);
	}

	@Bean(name = "menu")
	public Menu menuBean() {
		List<Pizza> pizzaList = new ArrayList<>();
		List<Drink> drinkList = new ArrayList<>();
		List<Topping> toppingsList = new ArrayList<>();

		pizzaList.add(pizzaMargheritaBean());
		pizzaList.add(pizzaHawaiianBean());
		pizzaList.add(pizzaSalamiBean());
		pizzaList.add(pizzaSalamiXlBean());

		drinkList.add(lemonadeBean());
		drinkList.add(waterBean());
		drinkList.add(wineBean());

		toppingsList.add(toppingTomatoBean());
		toppingsList.add(toppingCheeseBean());
		toppingsList.add(toppingSalamiBean());
		toppingsList.add(toppingHamBean());
		toppingsList.add(toppingPineappleBean());

		return new Menu(pizzaList, drinkList, toppingsList);
	}

	@Bean(name = "table")
	public Table table1(){
		return new Table(1, 2, true);
	}
	@Bean(name = "table")
	public Table table2(){
		return new Table(2, 4, false);
	}
	@Bean(name = "table")
	public Table table3(){
		return new Table(3, 4, true);
	}
	@Bean(name = "table")
	public Table table4(){
		return new Table(4, 6, false);
	}

}