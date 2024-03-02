import android.icu.util.ULocale;
import java.util.Locale;

public final class ces {
   public static ULocale a(Object var0) {
      return ULocale.addLikelySubtags((ULocale)var0);
   }

   public static ULocale b(Locale var0) {
      return ULocale.forLocale(var0);
   }

   public static String c(Object var0) {
      return ((ULocale)var0).getScript();
   }
}
