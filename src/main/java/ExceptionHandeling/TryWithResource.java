package ExceptionHandeling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {

	
	public static void main(String[] args) {
		try(BufferedReader bf = new BufferedReader(new FileReader("input.txt"))){
			System.out.println("Helllooo javaaaa");
//			bf = new BufferedReader(new FileReader("input.txt"));
		}
		catch(ArithmeticException e) {
			
		}
		catch(IOException e) {
			System.out.println("Exception handl;ed");
		}
	}
}
