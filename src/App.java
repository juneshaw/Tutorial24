
public class App {

	public static void main(String[] args) {
		Machine mach1 = new Machine();
		mach1.start();
		
		Person person1 = new Person();
		person1.greet();
		
		Info info1 = mach1;
		mach1.showInfo();
		
		Info info2 = person1;
		person1.showInfo();
		
		System.out.println();
		
		outputInfo(info1);
		outputInfo(info2);
	}

	private static void outputInfo(Info info) {
		info.showInfo();
	}
}
