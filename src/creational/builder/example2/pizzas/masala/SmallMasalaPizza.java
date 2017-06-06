package creational.builder.example2.pizzas.masala;

import creational.builder.example2.pizzas.VegPizza;

public class SmallMasalaPizza extends VegPizza {
	
	@Override
	public float price() {
		return 100.0f;
	}

	@Override
	public String name() {
		return "Masala Pizza";
	}

	@Override
	public String size() {
		return "Samll Size";
	}
	
}