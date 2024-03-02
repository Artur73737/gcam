import android.text.TextUtils;
import androidx.preference.Preference;

final class cqd {
   final int a;
   final int b;
   final String c;

   public cqd(Preference var1) {
      this.c = var1.getClass().getName();
      this.a = var1.A;
      this.b = var1.B;
   }

   public final boolean equals(Object var1) {
      if (!(var1 instanceof cqd)) {
         return false;
      } else {
         cqd var2 = (cqd)var1;
         return this.a == var2.a && this.b == var2.b && TextUtils.equals(this.c, var2.c);
      }
   }

   public final int hashCode() {
      return ((this.a + 527) * 31 + this.b) * 31 + this.c.hashCode();
   }
}
