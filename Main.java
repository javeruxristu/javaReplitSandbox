import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
    System.out.println("061RMC160 Oskars Grauzis 4");
		Scanner sc = new Scanner(System.in);
		System.out.print("x=");
		double x = sc.nextDouble();
		sc.close();

System.out.println("result:");
		if (x<-2 || x> -1) {
			System.out.println("error");
			return;
		}

		double s, a; int i;
		s = -(1+x)*(1+x);
		a = -(1+x)*(1+x);
		i = 1;
		while (Math.abs(a/i) > 0.001) {
			a = -a*(1+x)*(1+x);
      i++;
			s = s + a / i;
      
		}
    
		System.out.printf("function=%.4f", Math.log(1/(2+2*x+x*x)));
    System.out.println();  
		System.out.printf("summa=%.4f", s);
    System.out.println();

	}
}