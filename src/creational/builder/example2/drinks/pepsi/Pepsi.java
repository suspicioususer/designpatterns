package creational.builder.example2.drinks.pepsi;

import creational.builder.example2.drinks.ColdDrink;

public abstract class Pepsi extends ColdDrink {

	@Override
	public abstract String name();

	@Override
	public abstract String size();

	@Override
	public abstract float price();

}