
public interface Observer {

	void registered(String name);

	void unregistered(Observer sub);

}