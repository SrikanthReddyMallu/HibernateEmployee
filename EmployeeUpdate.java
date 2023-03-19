package Employee.com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeUpdate 
{
public static void main(String[] args)
{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
    EntityManager entityManager=entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction=entityManager.getTransaction();
    
    Employee employee=entityManager.find(Employee.class,20);
    employee.setAge(80);
    employee.setname("jagadesh");
    if(employee!=null)
    {
    	entityTransaction.begin();
    	entityManager.merge(employee);
    	entityTransaction.commit();
    	System.out.println("Employee details updated successfully");
    }
    else
    {
    	System.out.println("Employee not found");
    }
}
}
