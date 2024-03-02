public enum zt {
   a,
   b,
   c;

   private static final zt[] d;

   static {
      zt var1 = new zt("Default", 0);
      a = var1;
      zt var2 = new zt("UserInput", 1);
      b = var2;
      zt var0 = new zt("PreventUserInput", 2);
      c = var0;
      d = new zt[]{var1, var2, var0};
   }
}
