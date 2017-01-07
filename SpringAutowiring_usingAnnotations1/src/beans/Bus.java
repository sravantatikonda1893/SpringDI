package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Bus {
	@Autowired
	@Qualifier(value="e1")
	private Engine e;
	
	
	public void printData(){
		System.out.println("Bus model year:"+e.getModelYear());
	}

}
