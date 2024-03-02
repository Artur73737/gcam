import android.util.Log;
import java.util.Map;

public final class sn implements tt {
   private final qr a;
   private final ws b;
   private final bwc c;

   public sn(bwc var1, qr var2, ws var3, fwf var4) {
      var1.getClass();
      var4.getClass();
      super();
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public final Map a(tl var1, Map var2, tz var3) {
      qt var5 = this.a.f;
      byte var4;
      StringBuilder var9;
      if (c.E(var5, qt.a)) {
         var4 = 0;
      } else {
         if (!c.E(var5, qt.b)) {
            var9 = new StringBuilder();
            var9.append("Unsupported session mode: ");
            qt var7 = this.a.f;
            var9.append(var7);
            throw new IllegalArgumentException("Unsupported session mode: ".concat(var7.toString()));
         }

         var4 = 1;
      }

      ug var8 = kr.b(this.a, this.b, var2);
      if (var8.a.isEmpty()) {
         var9 = new StringBuilder();
         var9.append("Failed to create OutputConfigurations for ");
         qr var6 = this.a;
         var9.append(var6);
         Log.w("CXCP", "Failed to create OutputConfigurations for ".concat(var6.toString()));
         var3.f();
         return qtg.a;
      } else {
         if (!var1.d(new um(var4, var8.a, this.c.f(), var3, this.a.e))) {
            StringBuilder var10 = new StringBuilder();
            var10.append("Failed to create capture session from ");
            var10.append(var1);
            var10.append(" for ");
            var10.append(var3);
            var10.append('!');
            Log.w("CXCP", var10.toString());
            var3.c();
         }

         return var8.b;
      }
   }
}
