package Employee.com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class EmployeeMain 
{
public static void main(String[] args) 
{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=emf.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();

	Employee employee1=new Employee();
	employee1.setId(30);
	employee1.setname("suresh");
	employee1.setAge(59);
	employee1.setPhno(55667896);
	

	
	entityTransaction.begin();
	entityManager.persist(employee1);
	entityTransaction.commit();

}
}
