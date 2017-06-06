package creational.builder.example2.pizzas.nonveg;

import creational.builder.example2.pizzas.NonVegPizza;

public class ExtraLargeNonVegPizza extends NonVegPizza {
	
	@Override
	public float price() {
		return 250.0f;
	}

	@Override
	public String name() {
		return "Non-Veg Pizza";
	}

	@Override
	public String size() {
		return "Extra-Large Size";
	}

}