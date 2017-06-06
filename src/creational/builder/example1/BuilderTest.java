package creational.builder.example1;

public class BuilderTest {

	public static void main(String args[]) {
		
		CDBuilder cdBuilder = new CDBuilder();
		CDType cdType1 = cdBuilder.buildSonyCD();
		cdType1.showItems();

		CDType cdType2 = cdBuilder.buildSamsungCD();
		cdType2.showItems();
	}
}
