/*
1.
WAP to create employee class with attribute id,name,salary,address. create 5 objects of this class and store them in array and display them. In this program first read size of array from user then read all the values from user then store them in array after that display only those employees whose salary is greater than 10000.
*/

import java.util.Scanner;
class Employee
{
  int id;
  String name;
  float salary;
  String address;

  public Employee()
  {}
  public Employee(int id, String name, float salary ,String address)
  {
    this.id = id;
    this.name = name;
    this.salary = salary;
    this.address = address;
  }
  public int getId()
  {
    return id;
  }
  public String getname()
  {
    return name;
  }
  public float getSalary()
  {
    return salary;
  }
  public String getAddress()
  {
    return address;
  }
  public void getId(int id)
  {
    this.id = id;
  }
  public void getname(String name)
  {
    this.name = name;
  }
  public void getSalary(float salary)
  {
    this.salary = salary;
  }
  public void getAddress( String address)
  {
    this.address = address;
  }

  public String toString()
  {
    return "Id : "+this.id +" Name : "+this.name +" Salary : "+this.salary +" Address : "+this.address ;
  }
}

public class Q4
{
 public static void main(String []args)
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Employees details");
   
   Employee []arr = {
  
   new Employee(1,"Ram",10000.0f,"Ayodhya"),
   new Employee(2,"Sita",20000.0f,"Ayodhya"),
   new Employee(3,"Laxman",30000.0f,"Ayodhya"),
   new Employee(4,"Bharat",40000.0f,"Ayodhya"),
   new Employee(5,"Shatrughan",50000.0f,"Ayodhya")
   
   };

   for(Employee e : arr)
   {
     System.out.println(e);
   }

 }
}