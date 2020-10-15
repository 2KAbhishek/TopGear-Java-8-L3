public class Employee {
    int id;
    double sal;
    String address, name;

    Employee(int id, double sal, String name, String address) {
        this.id = id;
        this.sal = sal;
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSal() {
        return sal;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}
