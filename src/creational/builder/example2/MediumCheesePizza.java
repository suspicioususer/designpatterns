package creational.builder.example2;

public class MediumCheesePizza extends VegPizza {

	@Override
	public float price() {
		return 220.f;
	}

	@Override
	public String name() {
		return "Cheeze Pizza";
	}

	@Override
	public String size() {
		return "Medium Size";
	}
}
