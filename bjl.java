import java.util.List;
import java.util.Map;

final class bjl implements bkk, bjw {
   final bjq a;
   private final bjm b;

   public bjl(bjq var1) {
      this.a = var1;
      this.b = var1.h;
   }

   public final float a() {
      return this.b.b;
   }

   public final float b() {
      return this.b.c;
   }

   public final float eF(float var1) {
      return car.P(this.b, var1);
   }

   public final float eG(int var1) {
      return car.Q(this.b, var1);
   }

   public final float eH(long var1) {
      return car.R(this.b, var1);
   }

   public final float eI(float var1) {
      return car.S(this.b, var1);
   }

   public final int eJ(float var1) {
      return car.T(this.b, var1);
   }

   public final long eK(long var1) {
      return car.U(this.b, var1);
   }

   public final bju eL(int var1, int var2, Map var3, qvt var4) {
      return ja.f(this.b, var1, var2, var3, var4);
   }

   public final boolean eM() {
      return this.b.eM();
   }

   public final bxy j() {
      return this.b.a;
   }

   public final List l(Object var1, qvx var2) {
      var2.getClass();
      bmd var5 = (bmd)this.a.g.get(var1);
      List var10;
      if (var5 != null) {
         var10 = var5.x();
      } else {
         var10 = null;
      }

      if (var10 != null) {
         return var10;
      } else {
         bjq var11 = this.a;
         axf var6 = var11.l;
         int var4 = var6.b;
         int var3 = var11.e;
         if (var4 >= var3) {
            if (var4 == var3) {
               var6.p(var1);
            } else {
               var6.d(var3, var1);
            }

            ++var11.e;
            if (!var11.j.containsKey(var1)) {
               bjp var9 = var11.f(var1, var2);
               var11.k.put(var1, var9);
               if (var11.a.ag() == 3) {
                  var11.a.T(true);
               } else {
                  bmd.an(var11.a, true, 2);
               }
            }

            bmd var8 = (bmd)var11.j.get(var1);
            if (var8 != null) {
               var1 = var8.q().j();
               var4 = ((List)var1).size();

               for(var3 = 0; var3 < var4; ++var3) {
                  ((bmj)((List)var1).get(var3)).u.b = true;
               }
            } else {
               var1 = qtf.a;
            }

            return (List)var1;
         } else {
            IllegalArgumentException var7 = new IllegalArgumentException("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.");
            throw var7;
         }
      }
   }
}
