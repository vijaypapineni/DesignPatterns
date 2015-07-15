package in.vijay.proxy;

public class BusinessObjectProxy extends BusinessObject {

	protected BusinessObject target;
	
	
	public BusinessObjectProxy(BusinessObject target) {
		super();
		this.target = target;
	}


	@Override
	public void sayHi() {
		System.out.println("About to call real object...");
		this.target.sayHi();
		System.out.println("Completed calling real Object...");
	}

}
