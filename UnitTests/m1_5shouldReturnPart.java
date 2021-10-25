@Test
public void m1_5shouldReturnPart() {
 Calc c = new Calc();
  double t = c.sumVirkni(-1.5);
        assertEquals(0.30769230768733824, t, 0.0000000000001); 
  
}
