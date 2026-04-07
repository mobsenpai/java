public class Employee {
  String name;
  double sal;

  Employee(String name, double sal) {
    this.name = name;
    this.sal = sal;
  }

  void print() {
    System.out.println("Name: " + name + "\nSalaray: " + sal);
  }
}
