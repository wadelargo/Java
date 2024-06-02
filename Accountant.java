public class Accountant extends person {
    private String fname;
    private String lname;
    private int age;
    private double salary;
     
    //Overload
    public void set(String fname) {
        this.fname = fname;
    }
    //Overload
    public void set(String fname, int age) {
        this.fname = fname;
        this.age = age;
    }
    //overload
    public void set(String fname, String lname, int age) {
        this.fname = fname;
       this.lname = lname;
       this.age = age;
    }
    //@override
    public void set() {

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
