
// Dequeue using Employee class

import java.util.*;
class Employee4
{
    String name;
    int emp_id;
    Employee4(String name, int emp_id)
    {
        this.name=name;
        this.emp_id=emp_id;
    }
}
public class Assign2_23Aug {
    public static void main(String[] args) {

        Deque<Employee4> d= new ArrayDeque<>();
        d.addFirst(new Employee4("ajay",101));
        d.addLast(new Employee4("sunil",102));
        
    }
}

// Hashmap of email ID and password

public class Assign_23Aug {
    public static void main(String[] args) {

        HashMap<String,String>emailAccountMap = new HashMap<>();
        emailAccountMap.put("Ajay@gmail.com","Ajay");
    }
}

//HashMap of Employee and Address

import java.util.*;
class Employee
{
    String name;
    int emp_id;
    Employee(String name, int emp_id)
    {
        this.name=name;
        this.emp_id=emp_id;
    }
    public String toString()
    {
        return name+" "+emp_id;
    }
}
class Address
{
    String locality;
    String city;
    Address(String locality, String city)
    {
        this.city=city;
        this.locality=locality;
    }
    public String toString(){
        return locality+" "+city;
    }
}
public class Assign_23Aug {
    public static void main(String[] args) {
        HashMap<Employee,Address> map = new HashMap<>();
        map.put(new Employee("Khushi",101),new Address("cantt","kanpur"));
        map.put(new Employee("Akshat",102),new Address("cantt","kanpur"));
        System.out.println(map);

    }
}


