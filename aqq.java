import androidx.wear.ambient.AmbientMode$AmbientController;

public abstract class aqq implements acj {
   public final aqw b;

   public aqq(boolean var1, avi var2) {
      this.b = new aqw(var1, var2);
   }

   public abstract void d(ahr var1, qzv var2);

   public abstract void e(ahr var1);

   public final void h(bev var1, float var2, long var3) {
      aqw var9 = this.b;
      if (Float.isNaN(var2)) {
         var2 = lb.d(var1, var9.a, var1.j());
      } else {
         var2 = var1.eI(var2);
      }

      float var5 = ((Number)var9.c.d()).floatValue();
      if (var5 > 0.0F) {
         var3 = bcy.i(var3, var5);
         if (var9.a) {
            float var6 = bcl.c(var1.j());
            var5 = bcl.a(var1.j());
            bes var10 = var1.m();
            long var7 = var10.a();
            var10.b().e();
            ((AmbientMode$AmbientController)var10.b).d(var6, var5);
            gf.r(var1, var3, var2, 0L, (gf)null, 0, 124);
            var10.b().d();
            var10.c(var7);
            return;
         }

         gf.r(var1, var3, var2, 0L, (gf)null, 0, 124);
      }

   }
}
