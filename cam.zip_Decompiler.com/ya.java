public enum ya {
   a,
   b,
   c;

   private static final ya[] d;

   static {
      ya var2 = new ya("PreEnter", 0);
      a = var2;
      ya var1 = new ya("Visible", 1);
      b = var1;
      ya var0 = new ya("PostExit", 2);
      c = var0;
      d = new ya[]{var2, var1, var0};
   }
}
