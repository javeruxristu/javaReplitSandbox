@Test
public void m1_1shouldReturn02() {
 Calc c = new Calc();
  double t = c.sumVirkni(-1.1);
        assertEquals(0.2624666512043777, t, 0.0000000000001); 
  
}
