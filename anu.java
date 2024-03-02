public enum anu {
   a,
   b;

   private static final anu[] c;

   static {
      anu var1 = new anu("Closed", 0);
      a = var1;
      anu var0 = new anu("Open", 1);
      b = var0;
      c = new anu[]{var1, var0};
   }
}
