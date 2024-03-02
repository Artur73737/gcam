import com.google.googlex.gcam.base.HmAh.RbaSbznIXS;
import java.util.List;
import java.util.Map;

final class bjm implements bkk {
   public bxy a;
   public float b;
   public float c;
   final bjq d;

   public bjm(bjq var1) {
      this.d = var1;
      this.a = bxy.b;
   }

   public final float a() {
      return this.b;
   }

   public final float b() {
      return this.c;
   }

   // $FF: synthetic method
   public final float eF(float var1) {
      return car.P(this, var1);
   }

   // $FF: synthetic method
   public final float eG(int var1) {
      return car.Q(this, var1);
   }

   // $FF: synthetic method
   public final float eH(long var1) {
      return car.R(this, var1);
   }

   // $FF: synthetic method
   public final float eI(float var1) {
      return car.S(this, var1);
   }

   // $FF: synthetic method
   public final int eJ(float var1) {
      return car.T(this, var1);
   }

   // $FF: synthetic method
   public final long eK(long var1) {
      return car.U(this, var1);
   }

   // $FF: synthetic method
   public final bju eL(int var1, int var2, Map var3, qvt var4) {
      return ja.f(this, var1, var2, var3, var4);
   }

   public final boolean eM() {
      return this.d.a.ag() == 4 || this.d.a.ag() == 2;
   }

   public final bxy j() {
      return this.a;
   }

   public final List l(Object var1, qvx var2) {
      var2.getClass();
      bjq var8 = this.d;
      var8.d();
      int var3 = var8.a.ag();
      if (var3 != 1 && var3 != 3 && var3 != 2 && var3 != 4) {
         throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks");
      } else {
         Map var9 = var8.g;
         Object var7 = var9.get(var1);
         Object var6 = var7;
         int var4;
         if (var7 == null) {
            var6 = (bmd)var8.j.remove(var1);
            if (var6 != null) {
               var4 = var8.n;
               if (var4 <= 0) {
                  throw new IllegalStateException("Check failed.");
               }

               var8.n = var4 - 1;
            } else {
               bmd var11 = var8.b(var1);
               var6 = var11;
               if (var11 == null) {
                  var6 = var8.a(var8.d);
               }
            }

            var9.put(var1, var6);
         }

         bmd var12 = (bmd)var6;
         var4 = var8.a.z().indexOf(var12);
         int var5 = var8.d;
         if (var4 >= var5) {
            if (var5 != var4) {
               var8.g(var4, var5);
            }

            ++var8.d;
            var8.e(var12, var1, var2);
            List var10;
            if (var3 != 1 && var3 != 3) {
               var10 = var12.v();
            } else {
               var10 = var12.x();
            }

            return var10;
         } else {
            throw new IllegalArgumentException(c.aF(var1, "Key \"", RbaSbznIXS.wBXHvtAfbl));
         }
      }
   }
}
