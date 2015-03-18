import java.util.Scanner;

class MyMedia {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

		System.out.println("Please insert your note in FIRST test: ");
		double firstTest = input.nextDouble();

		System.out.println("Please insert your note in SECOND test: ");
		double secondTest = input.nextDouble();

		System.out.println("Please insert your media in Other tests: ");
		double mediaOtherTests = input.nextDouble();

		double yourNote = (firstTest + 2 * secondTest + mediaOtherTests)/4;
		System.out.println("Your Final Note=" + yourNote);
	}
}
