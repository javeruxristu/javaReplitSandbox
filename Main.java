import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("x=");
		double x = sc.nextDouble();
		sc.close();

System.out.println("result:");
		if (x<-3 || x> 1) {
			System.out.println("error");
			return;
		}
    Calc c = new Calc();
		double s = c.sumVirkni(x);
    
		System.out.printf("function=%.4f", 1/(x*x+4*x+7));
    System.out.println();  
		System.out.printf("summa=%.4f", s);
    System.out.println();

	}
}
