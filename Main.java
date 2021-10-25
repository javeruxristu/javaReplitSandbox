import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
    System.out.println("061RMC160 Oskars Grauzis 4");
		Scanner sc = new Scanner(System.in);
		System.out.print("x=");
		double x = sc.nextDouble();
		sc.close();

System.out.println("result:");
		if (x<-3 || x> 1) {
			System.out.println("error");
			return;
		}

		double s, a; int i;
		s = 1./3.;
		a = s;
		i = 2;
		while (i<20) {
			a = -a*(x+2)*(x+2)/3;
      i+=2;
			s = s + a;
      
		}
    
		System.out.printf("function=%.4f", 1/(x*x+4*x+7));
    System.out.println();  
		System.out.printf("summa=%.4f", s);
    System.out.println();

	}
}