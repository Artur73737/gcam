public final class rhz {
   public static final boolean a;

   static {
      Object var0;
      label20:
      try {
         var0 = Class.forName("android.os.Build");
      } catch (Throwable var2) {
         var0 = pwm.br(var2);
         break label20;
      }

      a = qsi.b(var0);
   }
}
