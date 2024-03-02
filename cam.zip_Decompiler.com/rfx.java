import java.util.List;

public final class rfx implements rfq {
   private final long b = 0L;
   private final long c = Long.MAX_VALUE;

   public final ree a(rfy var1) {
      return rel.a(new reo(rex.a(var1, new rfv(this, (que)null)), new rfw((que)null), 3));
   }

   public final boolean equals(Object var1) {
      if (var1 instanceof rfx) {
         rfx var4 = (rfx)var1;
         long var2 = var4.b;
         var2 = var4.c;
         return true;
      } else {
         return false;
      }
   }

   public final int hashCode() {
      return qwo.B(0L) * 31 + qwo.B(Long.MAX_VALUE);
   }

   public final String toString() {
      List var1 = pwm.aj(2);
      pwm.aQ(var1);
      String var2 = pwm.aN(var1, (CharSequence)null, (CharSequence)null, (CharSequence)null, (qvt)null, 63);
      StringBuilder var3 = new StringBuilder();
      var3.append("SharingStarted.WhileSubscribed(");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }
}
