package lap3;

public class Box {
	 public double width;
	 public double height;
	 public double depth;
	 //constructer
	 
	 public Box() {
	}
	 //เอา setdimesion ออก
	
	 public Box(double width, double height, double depth) {
		 this.width = width;
		 this.height = height;
		 this.depth = depth;
	}
	 
	 
	 
	 public double getVolume() {
	      return width*height*depth;
	 }
	 /*
	 public void setDimension(double width, double height, double depth) {
	       this.width = width;
	       this.height = height;
	       this.depth = depth;
	 }*/
	 



}
/* 
    คลาส Box มีสมาชิกใดบาง
    height,depth,height
*/
