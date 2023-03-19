package Employee.com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteEmployee 
{
public static void main(String[] args) 
{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
    EntityManager entityManager=entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction=entityManager.getTransaction();
    
    
//    Employee employee=entityManager.find(Employee.class,30);
//    entityTransaction.begin();
//    entityManager.remove(employee);
//    entityTransaction.commit();
    
    
    
    Employee employee=entityManager.find(Employee.class,30);
    if(employee!=null)
    {
    entityTransaction.begin();
    entityManager.remove(employee);
    entityTransaction.commit();
    System.out.println("employee id deleted successfully");
    }
    else
    {
    	System.out.println("Employee details already deleted");
    }
    
}
}
