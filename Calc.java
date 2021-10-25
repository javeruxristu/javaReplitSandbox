public class Calc{
public double sumVirkni(double x){
  double s, a; int i;
		s = 1./3.;
		a = s;
		i = 2;
		while (i<20) {
			a = -a*(x+2.)*(x+2.)/3.;
      i+=2;
			s = s + a;
      
		}
    return s;
}
}