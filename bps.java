import android.graphics.Matrix;

public final class bps {
   private final qvx a;
   private Matrix b;
   private Matrix c;
   private float[] d;
   private float[] e;
   private boolean f;
   private boolean g;
   private boolean h;

   public bps(qvx var1) {
      this.a = var1;
      this.f = true;
      this.g = true;
      this.h = true;
   }

   public final void a() {
      this.f = true;
      this.g = true;
   }

   public final float[] b(Object var1) {
      float[] var3 = this.e;
      float[] var2 = var3;
      if (var3 == null) {
         var2 = bdf.c();
         this.e = var2;
      }

      if (this.g) {
         this.h = kf.d(this.c(var1), var2);
         this.g = false;
      }

      return this.h ? var2 : null;
   }

   public final float[] c(Object var1) {
      float[] var3 = this.d;
      float[] var2 = var3;
      if (var3 == null) {
         var2 = bdf.c();
         this.d = var2;
      }

      if (!this.f) {
         return var2;
      } else {
         Matrix var4 = this.b;
         Matrix var6 = var4;
         if (var4 == null) {
            var6 = new Matrix();
            this.b = var6;
         }

         this.a.a(var1, var6);
         Matrix var5 = this.c;
         if (var5 == null || !c.E(var6, var5)) {
            eu.j(var2, var6);
            this.b = var5;
            this.c = var6;
         }

         this.f = false;
         return var2;
      }
   }
}
