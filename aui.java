public enum aui {
   a,
   b,
   c,
   d,
   e,
   f;

   private static final aui[] g;

   static {
      aui var0 = new aui("ShutDown", 0);
      a = var0;
      aui var3 = new aui("ShuttingDown", 1);
      b = var3;
      aui var1 = new aui("Inactive", 2);
      c = var1;
      aui var2 = new aui("InactivePendingWork", 3);
      d = var2;
      aui var5 = new aui("Idle", 4);
      e = var5;
      aui var4 = new aui("PendingWork", 5);
      f = var4;
      g = new aui[]{var0, var3, var1, var2, var5, var4};
   }
}
