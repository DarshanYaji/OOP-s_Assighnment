package exception_handling;

public class Emp {


	    int empid;
	    String Name;
	    String designation;
	    double basic;
	    double hra;

	    int getEmpid() {
	        return empid;
	    }

	    void setEmpid(int empid) {
	        this.empid = empid;
	    }

	    String getName() {
	        return Name;
	    }

	    void setName(String name) {
	        Name = name;
	    }

	    String getDesignation() {
	        return designation;
	    }

	    void setDesignation(String designation) {
	        this.designation = designation;
	    }

	    double getBasic() {
	        if (basic < 500) {
	            try {
	                throw new LowSalException();

	            } catch (LowSalException e) {
	                // TODO Auto-generated catch block
	                // e.printStackTrace();
	                System.out.println(e);
	            }
	        }
	        return basic;
	    }

	    void setBasic(double basic) {
	        this.basic = basic;
	    }

	    public Emp() {

	        this.empid = 1;
	        Name = "Yaji";
	        this.designation = "SOFT ENGG";
	        this.basic = 30000;
	    }

	    public Emp(int empid, String name, String designation, double basic) {

	        this.empid = empid;
	        Name = name;
	        this.designation = designation;
	        this.basic = basic;
	    }

	    public void printDET() {
	        System.out.println("Id Of Employye :" + empid
	                + "\n Name of Employee is :" + Name
	                + "\n Designation Of Employee is:" + designation
	                + "\nSalary Of Employee :" + basic);

	    }

	    public void calculateHRA() {
	        if (designation == "Manager") {

	            hra = basic * 0.1;
	            System.out.println("HRA OF MANAGER : " + hra);
	        }

	        else if (designation == "Officer") {

	            hra = basic * 0.12;
	            System.out.println("HRA OF OFFICER : " + hra);
	        }

	        else {

	            hra = basic * 0.05;
	            System.out.println("HRA OF CLEARK : " + hra);
	        }
	    }

	    public static void main(String[] args) {
	        Emp e = new Emp();
	        e.getBasic();
	        e.printDET();
	        System.out.println();
	        Emp e1 = new Emp(2, "Darshan", "Technical Engineer", 50000);
	        e1.printDET();
	        e1.calculateHRA();
	        System.out.println();
	        Emp e2=new Emp(3,"Madhurank","officer",40000);
	        e2.printDET();
	        e2.calculateHRA();
	        System.out.println();
	        System.out.println();
	        Emp e3=new Emp(4,"Sushant","cleark",15000);
	        e3.printDET();
	        e3.calculateHRA();

	    }

	}

