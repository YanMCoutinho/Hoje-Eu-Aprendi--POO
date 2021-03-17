public class Program {

	public static void main(String[] args) {
		Square quadrado1 = new Square();
		Square quadrado2 = new Square();
		
		quadrado1.height = 10;
		quadrado1.width = 10;
		quadrado2.height = 5;
		quadrado2.width = 5;
		
		System.out.println("A área do quadrado 1 é de: " + quadrado1.area());
		System.out.println("A área do quadrado 2 é de: " + quadrado2.area());
	}

}