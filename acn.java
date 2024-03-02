public enum acn {
   a,
   b,
   c;

   private static final acn[] d;

   static {
      acn var0 = new acn("Default", 0);
      a = var0;
      acn var1 = new acn("UserInput", 1);
      b = var1;
      acn var2 = new acn("PreventUserInput", 2);
      c = var2;
      d = new acn[]{var0, var1, var2};
   }
}
