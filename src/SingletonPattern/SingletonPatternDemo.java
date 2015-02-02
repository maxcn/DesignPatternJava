package SingletonPattern;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SingleObject object = new SingleObject();
		SingleObject object = SingleObject.getInstance();
		object.showMessage();
	}

}
