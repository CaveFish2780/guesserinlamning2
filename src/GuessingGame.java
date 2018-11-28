
public class GuessingGame {

	public static void main(String[] args) {
		Guesser guesser = new Guesser(1000, 0);
//		guesser.start();
		Guesser guesser2 = new Guesser(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		guesser2.start();
		
	}

}
