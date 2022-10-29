import java.util.ArrayList;
import java.util.List;

public class employees implements Observer, Decorator {
	
	private String name;
	private String age;
	private int department;
	private List<employees> subs = new ArrayList<>();
	String title;
	
	@Override
	public void registered(String name) {
		this.name = name;
	}
	
	

	public employees(String name) {
		super();
		this.name = name;
	}



	public void employees1(employees s1) {
		// TODO Auto-generated constructor stub
	}



	@Override
	public void unregistered(Observer sub) {
    	subs.remove(sub);
    }
	
	public void notifyemployees() {
    	for(Decorator sub : subs) {
    		sub.update();
    	}
    }
	
	@Override
	public void upload(String title) {
    	this.title = title;
    	notifyemployees();
    }
	
	public void employee(employees sub) {
	    	subs.add(sub);
	    }
	
	@Override
	public void update() {
		System.out.println(name);
	}
	public void employeesSides(String sh) {
		age = sh;
	}



	public void employeesSides(employees s1) {
		// TODO Auto-generated method stub
		
	}
	
}
