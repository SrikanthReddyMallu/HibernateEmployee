package Employee.com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GettingDetails 
{
public static void main(String[] args) 
{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
    EntityManager entityManager=entityManagerFactory.createEntityManager();
    //EntityTransaction entityTransaction=entityManager.getTransaction();
    
    Employee employee=entityManager.find(Employee.class,30);
    
    System.out.println("The Employee id is="+employee.getId());
    System.out.println("The Employee age is="+employee.getAge());
    System.out.println("The Employee name is="+employee.getname());
    System.out.println("The Employee Phone is="+employee.getPhno());
}
}
