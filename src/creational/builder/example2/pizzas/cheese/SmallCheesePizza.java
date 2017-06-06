package creational.builder.example2.pizzas.cheese;

import creational.builder.example2.pizzas.VegPizza;

public class SmallCheesePizza extends VegPizza {
	
	@Override
	public float price() {
		return 170.0f;
	}

	@Override
	public String name() {
		return "Cheeze Pizza";
	}

	@Override
	public String size() {
		return "Small size";
	}
	
}