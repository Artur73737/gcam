import java.util.Locale;

public final class cee {
   private static final Locale[] a = new Locale[]{new Locale("en", "XA"), new Locale("ar", "XB")};

   public static Locale a(String var0) {
      return Locale.forLanguageTag(var0);
   }

   static boolean b(Locale var0, Locale var1) {
      if (var0.equals(var1)) {
         return true;
      } else if (!var0.getLanguage().equals(var1.getLanguage())) {
         return false;
      } else if (!c(var0) && !c(var1)) {
         String var2 = cbw.g(var0);
         if (var2.isEmpty()) {
            String var3 = var0.getCountry();
            return var3.isEmpty() || var3.equals(var1.getCountry());
         } else {
            return var2.equals(cbw.g(var1));
         }
      } else {
         return false;
      }
   }

   private static boolean c(Locale var0) {
      Locale[] var2 = a;
      int var1 = var2.length;

      for(var1 = 0; var1 < 2; ++var1) {
         if (var2[var1].equals(var0)) {
            return true;
         }
      }

      return false;
   }
}
