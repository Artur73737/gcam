import java.util.Map;

final class apo implements ref {
   final apu a;
   final float b;

   public apo(apu var1, float var2) {
      this.a = var1;
      this.b = var2;
   }

   // $FF: synthetic method
   public final Object a(Object var1, que var2) {
      Map var5 = (Map)var1;
      Float var4 = la.d(var5, this.a.c());
      var4.getClass();
      float var3 = var4;
      Object var8 = var5.get(quy.d(la.c(this.a.k.h().floatValue(), var3, var5.keySet(), this.a.h(), this.b, this.a.n.f())));
      apu var6;
      if (var8 != null) {
         (Boolean)this.a.b.eo(var8);
         var6 = this.a;
         var1 = var6.b(var8, var6.a, var2);
         if (var1 != qul.a) {
            return qsn.a;
         }
      } else {
         var6 = this.a;
         Object var7 = var6.a(var3, var6.a, var2);
         var1 = var7;
         if (var7 != qul.a) {
            return qsn.a;
         }
      }

      return var1;
   }
}
