/*Concept - Static Members Difficulty Level 2

Create a class Employee with below attributes:

id - int

name - String

designation - String

ssnNo - int

age - int

salary - double

idCounter - int which is a static field and initialize to 0

Make all the attributes private.Create corresponding getters and setters.

Create a constructor which takes all parameters except the static member and the attribute id in the above sequence.
The constructor should set the value of attributes as parameter values inside the constructor.
Increment the value of 
the static member by 1 inside the constructor and assign to the attribute id

Test from the main method by creating  5 objects of the Employee class and print the idCounter value after creation of each object

Refer below sample main method and test the output:*/
class EmployeeDemo {
public static void main(String args[]){
    /*Employee employee1= new Employee("jirhehb","siarpha",35,70,776.0);
    System.out.println("Value of idCounter : " + Employee.getIdcounter());
    Employee employee2= new Employee("ycrdzsi","voivkqr",32,87,484.0);
    System.out.println("Value of idCounter : " + Employee.getIdcounter());
    Employee employee3= new Employee("txdxrzv","azpjbbb",4,63,369.0);
    System.out.println("Value of idCounter : " + Employee.getIdcounter());
    Employee employee4= new Employee("pefjukm","mctpbqe",36,0,951.0);
    System.out.println("Value of idCounter : " + Employee.getIdcounter());
    Employee employee5= new Employee("shbrzke","lpcnymz",51,86,181.0);
    System.out.println("Value of idCounter : " + Employee.getIdcounter());
    }*/
}
}
class Employee{
    private int id;
    private String name;
    private String designation;
    private int ssnNo;
    private int age;
    private double salary;
    private static int idcounter = 0;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public int getSsnNo() {
        return ssnNo;
    }
    public void setSsnNo(int ssnNo) {
        this.ssnNo = ssnNo;
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
    public static int getIdcounter() {
        return idcounter;
    }
    public static void setIdcounter(int idcounter) {
        Employee.idcounter = idcounter;
    }
    public Employee(String name, String designation, int ssnNo, int age, double salary) {
        this.name = name;
        this.designation = designation;
        this.ssnNo = ssnNo;
        this.age = age;
        this.salary = salary;
        Employee.idcounter = idcounter+1;
    }
    
}

/*Output
Value of idCounter : 1
Value of idCounter : 2
Value of idCounter : 3
Value of idCounter : 4
Value of idCounter : 5*/
