package beans;

import javax.annotation.Resource;
public class Bus {
	@Resource	
	private Engine e2;
	
	public void setE2(Engine e2) {
		this.e2 = e2;
	}

	public void printData(){
		System.out.println("Bus model year:"+e2.getModelYear());
	}

}
