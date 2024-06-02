public class person {
    private String name;
    private int age;
    private  String address;
    private double salary;

    public void set() {
    System.out.println("angela nako kai gwapa");
    }

    public void set(int age) {
        this.age = age;
    }

    public void set(String name, String address){
        this.name = name;
        this.address = address;
    }
    public void set(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
}