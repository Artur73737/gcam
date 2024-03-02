import android.util.AndroidRuntimeException;

public final class cjv extends cjs {
   public cjw q = null;
   public float r = Float.MAX_VALUE;
   private boolean s = false;

   public cjv(jaq var1) {
      super(var1);
   }

   public cjv(Object var1, cju var2) {
      super(var1, var2);
   }

   public final void d() {
      cjw var3 = this.q;
      if (var3 != null) {
         double var1 = (double)var3.a();
         if (!(var1 > (double)this.n)) {
            if (!(var1 < (double)this.o)) {
               var1 = Math.abs((double)this.b());
               var3.c = var1;
               var3.d = var1 * 62.5D;
               super.d();
            } else {
               throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
         } else {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
         }
      } else {
         throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
      }
   }

   public final boolean e(long var1) {
      float var7;
      if (this.s) {
         var7 = this.r;
         if (var7 != Float.MAX_VALUE) {
            this.q.d(var7);
            this.r = Float.MAX_VALUE;
         }

         this.i = this.q.a();
         this.h = 0.0F;
         this.s = false;
         return true;
      } else {
         cjw var9;
         cjo var10;
         if (this.r != Float.MAX_VALUE) {
            var9 = this.q;
            double var3 = (double)this.i;
            double var5 = (double)this.h;
            var1 /= 2L;
            var10 = var9.b(var3, var5, var1);
            this.q.d(this.r);
            this.r = Float.MAX_VALUE;
            var10 = this.q.b((double)var10.a, (double)var10.b, var1);
            var7 = var10.a;
            this.i = var7;
            this.h = var10.b;
         } else {
            var10 = this.q.b((double)this.i, (double)this.h, var1);
            var7 = var10.a;
            this.i = var7;
            this.h = var10.b;
         }

         var7 = Math.max(var7, this.o);
         this.i = var7;
         var7 = Math.min(var7, this.n);
         this.i = var7;
         float var8 = this.h;
         var9 = this.q;
         if ((double)Math.abs(var8) < var9.d && (double)Math.abs(var7 - var9.a()) < var9.c) {
            this.i = this.q.a();
            this.h = 0.0F;
            return true;
         } else {
            return false;
         }
      }
   }

   public final void k() {
      if (this.q.b > 0.0D) {
         if (cjf.a().b()) {
            if (this.m) {
               this.s = true;
            }
         } else {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
         }
      } else {
         throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
      }
   }
}
