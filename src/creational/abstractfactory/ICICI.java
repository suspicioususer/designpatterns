package creational.abstractfactory;

class ICICI implements Bank {

	private final String BNAME;

	public ICICI() {
		BNAME = "ICICI BANK";
	}

	public String getBankName() {
		return BNAME;
	}
}