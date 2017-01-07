package beans;

public class Bus {
	private Engine e2;
	
	public void setE2(Engine e2) {
		this.e2 = e2;
	}

	public void printData(){
		System.out.println("Bus model year:"+e2.getModelYear());
	}

}
