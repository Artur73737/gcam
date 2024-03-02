import android.os.LocaleList;
import java.util.Locale;

public final class ceg {
   public static final ceg a = a();
   public final ceh b;

   private ceg(ceh var1) {
      this.b = var1;
   }

   public static ceg a(Locale... var0) {
      return b(cef.a(var0));
   }

   public static ceg b(LocaleList var0) {
      return new ceg(new ceh(var0));
   }

   public final String c() {
      return this.b.a.toLanguageTags();
   }

   public final boolean equals(Object var1) {
      return var1 instanceof ceg && this.b.equals(((ceg)var1).b);
   }

   public final int hashCode() {
      return this.b.hashCode();
   }

   public final String toString() {
      return this.b.toString();
   }
}
