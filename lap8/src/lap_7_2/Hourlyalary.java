package lap_7_2;
public class Hourlyalary extends Employee {
private double hpay;
private double hwork;
public Hourlyalary(String first, String last, String ssn, double hpay, double hwork) {
super(first, last, ssn);
this.hpay = hpay;
this.hwork = hwork;
}
public  double earnings() {
return hpay*hwork;
}
@Override
public String toString() {
return "hourly empolyee: "+super.toString()+"\n"+"hourly : $"+hpay+"; hours woked "+hwork;
}



}
