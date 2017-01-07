package beans;

public class Car {
private Engine e1;


//If the IOC finds the type with the corresponding setter, IOC will search in spring.xml for that and will inject using the setter 

public void setE1(Engine e1) {
	this.e1 = e1;
}
public void printData(){
	System.out.println("Bus model year:"+e1.getModelYear());
}


}
