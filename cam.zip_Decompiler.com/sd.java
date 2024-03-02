import android.os.SystemClock;
import androidx.window.layout.adapter.sidecar.nk.OSGHH;

public final class sd {
   public final long a;
   public final qq b;
   public final Throwable c;
   public final int d;

   // $FF: synthetic method
   public sd(int var1, qq var2, Throwable var3, int var4) {
      long var5;
      if ((var4 & 2) != 0) {
         var5 = SystemClock.elapsedRealtimeNanos();
      } else {
         var5 = 0L;
      }

      if ((var4 & 4) != 0) {
         var2 = null;
      }

      if ((var4 & 8) != 0) {
         var3 = null;
      }

      super();
      this.d = var1;
      this.a = var5;
      this.b = var2;
      this.c = var3;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof sd)) {
         return false;
      } else {
         sd var2 = (sd)var1;
         if (this.d != var2.d) {
            return false;
         } else if (!c.o(this.a, var2.a)) {
            return false;
         } else if (!c.E(this.b, var2.b)) {
            return false;
         } else {
            return c.E(this.c, var2.c);
         }
      }
   }

   public final int hashCode() {
      int var3 = this.d;
      c.ai(var3);
      int var4 = c.p(this.a);
      qq var5 = this.b;
      int var2 = 0;
      int var1;
      if (var5 == null) {
         var1 = 0;
      } else {
         var1 = var5.a;
      }

      Throwable var6 = this.c;
      if (var6 != null) {
         var2 = var6.hashCode();
      }

      return ((var3 * 31 + var4) * 31 + var1) * 31 + var2;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(OSGHH.AkmUKmltcgxAZ);
      var1.append(lb.c(this.d));
      var1.append(", closingTimestamp=");
      var1.append(vt.b(this.a));
      var1.append(", errorCode=");
      var1.append(this.b);
      var1.append(", exception=");
      var1.append(this.c);
      var1.append(')');
      return var1.toString();
   }
}
