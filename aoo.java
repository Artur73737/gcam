enum aoo {
   a,
   b,
   c,
   d,
   e;

   private static final aoo[] f;

   static {
      aoo var0 = new aoo("TopBar", 0);
      a = var0;
      aoo var2 = new aoo("MainContent", 1);
      b = var2;
      aoo var1 = new aoo("Snackbar", 2);
      c = var1;
      aoo var3 = new aoo("Fab", 3);
      d = var3;
      aoo var4 = new aoo("BottomBar", 4);
      e = var4;
      f = new aoo[]{var0, var2, var1, var3, var4};
   }
}
