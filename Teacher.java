public class Teacher extends person {
    private String fname;
    private String lname;
    private int age;
    private double salary;
    
    //@Overload
    public void set(String fname, String lname, double salary) {
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
    }
    //Overload
    public void set(String fname, double salary){
        this.fname = fname;
        this.salary = salary;
    }

    //Override
    public void set(String fname, String lname) {
        System.out.println("Jonathan maot");
    }
    //Override
    public void set(double salary) {
        System.out.println(18.90);
    }
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    

    
}
