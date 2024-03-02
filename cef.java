import android.os.LocaleList;
import java.util.Locale;

final class cef {
   static LocaleList a(Locale... var0) {
      return new LocaleList(var0);
   }

   static LocaleList b() {
      return LocaleList.getAdjustedDefault();
   }

   static LocaleList c() {
      return LocaleList.getDefault();
   }
}
