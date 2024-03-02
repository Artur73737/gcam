public enum rfo {
   a,
   b,
   c;

   private static final rfo[] d;

   static {
      rfo var0 = new rfo("START", 0);
      a = var0;
      rfo var2 = new rfo("STOP", 1);
      b = var2;
      rfo var1 = new rfo("STOP_AND_RESET_REPLAY_CACHE", 2);
      c = var1;
      d = new rfo[]{var0, var2, var1};
   }
}
