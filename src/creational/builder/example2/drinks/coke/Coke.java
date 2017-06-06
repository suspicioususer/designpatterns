package creational.builder.example2.drinks.coke;

import creational.builder.example2.drinks.ColdDrink;

public abstract class Coke extends ColdDrink {

	@Override
	public abstract String name();

	@Override
	public abstract String size();

	@Override
	public abstract float price();

}