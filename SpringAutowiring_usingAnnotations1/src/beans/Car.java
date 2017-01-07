package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	@Autowired
	@Qualifier(value="e2")
private Engine e;
//We don't need to have setters and constructors for dependency injection
public void printData(){
	System.out.println("Bus model year:"+e.getModelYear());
}


}
