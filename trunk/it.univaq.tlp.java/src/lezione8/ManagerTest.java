package lezione8;

public class ManagerTest {  
	   public static void main(String[] args) {  
	      // construct a Manager object
	      Manager boss = new Manager("Carl Cracker", 
	                                 80000, 1987, 12, 15);

	      
	      boss.setBonus(5000);

	      Employee[] staff = new Employee[3];

	      // fill the staff array with Manager and Employee objects

	      staff[0] = boss;
	      staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
	      staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);

	      
	      // print out information about all Employee objects
	      for (int i = 0; i < staff.length; i++) {
			System.out.println("name " + staff[i].getName() + ", salary=" + staff[i].getSalary());
	      }
	      
	      
	      System.out.println(staff[0].getSalary());
	      boss.setBonus(5000);         	//OK
	      
	  
	       //staff[0].setBonus(5000);   	//ERRORE
	       
	      
	       /*Manager m = (Manager) staff[0];
	       Manager m = (Manager) staff[1];
	       m.setBonus(7000);
	       */
	      
	       // Manager m = staff[2]; 		//ERRORE    
	      System.out.println(staff[0].getSalary());
	  
	      
	   }
}

