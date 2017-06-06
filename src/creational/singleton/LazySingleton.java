package creational.singleton;

import java.io.Serializable;

public class LazySingleton implements Serializable{
	

	private static final long serialVersionUID = 1826527891231065611L;
	private static LazySingleton instance;

	private LazySingleton() {

	}

	public static LazySingleton getInstance() {
		
		if (instance == null) {
			synchronized (LazySingleton.class) {
				if (instance == null) {
					instance = new LazySingleton();
				}
			}
		}
		return instance;
	}

	public void doSomething() {
		
	}
	
	protected Object readResolve(){
		return getInstance();
	}

}
