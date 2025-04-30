package Multithreading;

public class OddorEven {

	public OddorEven() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private boolean isOdd = true;
	public void printOdd(int num) throws InterruptedException {
		while(!isOdd) {
			wait();
		}
		System.out.println("Odd : "+num);
	}

}
