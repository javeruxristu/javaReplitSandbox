@Test
public void m2_shouldReturn1Thrd() {
  // Enter code here
Calc c = new Calc();
  double t = c.sumVirkni(-2);
        assertEquals(1./3., t, 0.0000000000000001);
}
