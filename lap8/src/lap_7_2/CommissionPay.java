package lap_7_2;
public class CommissionPay extends Employee {
private int sumSalary;
private double rate;

public CommissionPay(String first, String last, String ssn, int sumSalary, double rate) {
super(first, last, ssn);
this.sumSalary = sumSalary;
this.rate = rate;
}

@Override
public double earnings() {
return sumSalary*rate;
}
@Override
public String toString() {
return "commission empolyee: "+super.toString()+"\n"+"gross sales : $"+sumSalary+"; commission rate: "+rate;
}


}
