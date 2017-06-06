package creational.singleton;

import java.io.Serializable;

public class EarlySingleton implements Serializable {

	private static final long serialVersionUID = -8934972848739199450L;
	private static EarlySingleton instance = new EarlySingleton();

	private EarlySingleton() {

	}

	public static EarlySingleton getInstance() {
		return instance;
	}

	public void doSomething() {

	}
	
	protected Object readResolve(){
		return getInstance();
	}

}
