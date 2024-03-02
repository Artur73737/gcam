// $FF: synthetic class
public final class rir {
   public static final int a = Runtime.getRuntime().availableProcessors();

   public static final String a(String var0) {
      try {
         var0 = System.getProperty(var0);
      } catch (SecurityException var1) {
         var0 = null;
      }

      return var0;
   }
}
