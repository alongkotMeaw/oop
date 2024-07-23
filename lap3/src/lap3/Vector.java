package lap3;

public class Vector {
	double x;
	double y;
	double z;
	
	public Vector(){ // defal con stuct ter 0
		this.x = 0.0;
		this.y = 0.0;
		this.z = 0.0;
	}
	
	public void Vector(double p1,double p2,double p3) { //asin value //ทำไงไม่ใช่ void
		this.x = p1;
		this.y = p2;
		this.z = p3;
		
	}
	
	
	public void PrintVector() {
	   System.out.printf("(%.0f,%.0f,%.0f)\n",this.x,this.y,this.z);
	}

}
