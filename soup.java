
public class soup {

	public static void main(String[] args) {
		employees soup_factory = new employees("name");
	
		employees s1 = new employees("smith");
		employees s2 = new employees("john");
		employees s3 = new employees("Virat");
		employees s4 = new employees("Ben");
		
		soup_factory.employee(s1);
		soup_factory.employee(s2);
		soup_factory.employee(s3);
		soup_factory.employee(s4);
		
		soup_factory.unregistered(s4);
		
		s1.employee(soup_factory);
		s2.employee(soup_factory);
		s3.employee(soup_factory);
		s4.employee(soup_factory);
		
		soup_factory.upload("");
	}

	

}
