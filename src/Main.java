import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int i, soma=0;
	
	for (i=7;i<=20;i++) {
		soma+=i;
	}
	System.out.println("Soma "+soma);
	
	
	sc.close();

	}

}
