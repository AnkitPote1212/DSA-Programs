/*You have Employee List Contains name, departments, salary so Sort list by Employee Name
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Employee{
  String name;
  String dept;
  Employee(String name,String dept){
    this.name=name;
    this.dept=dept;
  }
  public String getName() {
        return name;
    }
}
class EmployeeSort {
  public static void main(String[] args) {
    List<Employee> list=new ArrayList<>();
    list.add(new Employee("Salman","com"));
    list.add(new Employee("Sharukh","com"));
    list.add(new Employee("Ankit","ap"));
    list.add(new Employee("Remesh","cds"));
    
    Comparator<Employee> comparator=(emp1,emp2)->emp1.getName().toLowerCase().compareTo(emp2.getName().toLowerCase());
    Collections.sort(list, comparator);
    Iterator<Employee> iterator=list.iterator();
    while(iterator.hasNext()){
      System.out.println(iterator.next().getName());
    }
    


  }
}