public enum aez {
   a,
   b;

   private static final aez[] c;

   static {
      aez var1 = new aez("Vertical", 0);
      a = var1;
      aez var0 = new aez("Horizontal", 1);
      b = var0;
      c = new aez[]{var1, var0};
   }
}
