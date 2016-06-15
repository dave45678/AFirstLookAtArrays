import java.util.Random;

public class FirstLook {
	public static void main(String[] args) {
		Random rnd = new Random();
		int randomInt;

		//Declare array to hold ten test scores
		int scores[] = new int[10];
		//Initialize elements of an array
		for (int i = 0; i < 10; i++){
			randomInt = 1 + rnd.nextInt(100);//creates a random number between 1 and 100
			scores[i] = randomInt;
		}
		//Print the elements of an array
		for (int i = 0; i < 10; i++){
			System.out.printf("Element # %d value is %d\n", i, scores[i]);
		}
		//print the fifth element
		System.out.println("The fifth value is " + scores[4]);
		//Print every other element
		for (int i = 0; i < 10; i+=2){
			System.out.printf("Score %s is %d\n", i, scores[i]);
		}
		//Print the number of elements
		System.out.println("The array length is " + scores.length);
		//Change an element
		scores[0] = 100;
		System.out.println("The first element is now 100");

		
		//this line will not generate the ArrayIndexOutOfBoundsException
		//we'll learn more about Exception (error) handling soon
		try{
			System.out.println(scores[10]);
		}catch(Exception e){
			System.out.println("We caught the ArrayIndexOutOfBoundsException error");
		}
		
		//this line will generate an ArrayIndexOutOfBoundsException
		//since we did not wrap it in the try..catch for error handling 
		System.out.println(scores[10]);
	}
}
