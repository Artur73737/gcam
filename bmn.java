import java.util.Map;

public abstract class bmn extends bke implements bjw {
   public boolean h;
   public boolean i;

   protected static final void I(bmz var0) {
      bmz var1 = var0.o;
      bmd var4;
      if (var1 != null) {
         var4 = var1.n;
      } else {
         var4 = null;
      }

      if (!c.E(var4, var0.n)) {
         ((bmj)var0.R()).q.e();
      } else {
         bkw var2 = var0.R().b();
         if (var2 != null) {
            bkv var3 = ((bmj)var2).q;
            if (var3 != null) {
               var3.e();
            }
         }

      }
   }

   public abstract long A();

   public abstract bjf B();

   public abstract bju C();

   public abstract bmd D();

   public abstract bmn E();

   public abstract bmn F();

   public abstract void G();

   public abstract boolean H();

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

   public boolean eM() {
      return false;
   }

   public final int m(bir var1) {
      if (!this.H()) {
         return Integer.MIN_VALUE;
      } else {
         int var3 = this.s(var1);
         if (var3 == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
         } else {
            boolean var4 = var1 instanceof bkn;
            long var5 = super.e;
            int var2;
            if (var4) {
               var2 = bxw.a(var5);
            } else {
               var2 = bxw.b(var5);
            }

            return var3 + var2;
         }
      }
   }

   public abstract int s(bir var1);
}
