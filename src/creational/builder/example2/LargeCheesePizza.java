package creational.builder.example2;

public class LargeCheesePizza extends VegPizza {
	
	@Override
	public float price() {
		return 260.0f;
	}

	@Override
	public String name() {
		return "Cheeze Pizza";
	}

	@Override
	public String size() {
		return "Large Size";
	}
	
}