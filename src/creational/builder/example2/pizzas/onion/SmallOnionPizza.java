package creational.builder.example2.pizzas.onion;

import creational.builder.example2.pizzas.VegPizza;

public class SmallOnionPizza extends VegPizza {
	
	@Override
	public float price() {
		return 120.0f;
	}

	@Override
	public String name() {
		return "Onion Pizza";
	}

	@Override
	public String size() {
		return "Small Size";
	}
	
}