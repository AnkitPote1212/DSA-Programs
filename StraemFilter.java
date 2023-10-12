import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Student{
  String sname;
  String dept;
  Student(){}
  Student(String sname,String dept){
    this.sname=sname;
    this.dept=dept;
  }
  public void setSname(String sname){
    this.sname=sname;
  }
  public String getSname(){
    return sname;
  }
  public void setDept(String dept){
    this.dept=dept;
  }
  public String getDept(){
    return dept;
  }
}
public class StraemFilter {
  public static void main(String[] args) {
    List<Student> list=Arrays.asList(new Student("Ankit","Computer"),new Student("vaibhav","Piston"),new Student("Viral","zandu"),new Student("Kshitij","Computer"),new Student("Samir","Computer"),new Student("Virat","12"));
    List<Student> filteredList=list.stream().filter(i->(i.getDept().equals("Computer"))).collect(Collectors.toList());
    list.stream().filter(i->(i.getDept().equals("Computer"))).map(Student::getSname).forEach(System.out::println);
    System.out.println(filteredList);
  }
}
