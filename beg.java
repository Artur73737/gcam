import java.util.Arrays;

public final class beg extends beh {
   private final ben e;
   private final ben f;
   private final float[] g;

   public beg(ben var1, ben var2) {
      super(var2, var1, var2, (float[])null);
      this.e = var1;
      this.f = var2;
      float[] var9;
      if (bdb.j(var1.d, var2.d)) {
         var9 = bdb.m(var2.j, var1.i);
      } else {
         float[] var4 = var1.i;
         float[] var3 = var2.j;
         float[] var5 = var1.d.a();
         float[] var6 = var2.d.a();
         bep var8 = var1.d;
         bep var7 = bej.a;
         if (!bdb.j(var8, bej.b)) {
            var4 = bea.a.b;
            float[] var11 = Arrays.copyOf(bej.e, 3);
            var11.getClass();
            var9 = bdb.m(bdb.k(var4, var5, var11), var1.i);
         } else {
            var9 = var4;
         }

         float[] var10;
         if (!bdb.j(var2.d, bej.b)) {
            var4 = bea.a.b;
            var3 = Arrays.copyOf(bej.e, 3);
            var3.getClass();
            var10 = bdb.l(bdb.m(bdb.k(var4, var6, var3), var2.i));
         } else {
            var10 = var3;
         }

         var3 = var9;
         if (c.n(0, 3)) {
            var3 = bdb.n(new float[]{var5[0] / var6[0], var5[1] / var6[1], var5[2] / var6[2]}, var9);
         }

         var9 = bdb.m(var10, var3);
      }

      this.g = var9;
   }

   public final long a(float var1, float var2, float var3, float var4) {
      var1 = (float)this.e.p.a((double)var1);
      float var5 = (float)this.e.p.a((double)var2);
      float var6 = (float)this.e.p.a((double)var3);
      var3 = bdb.g(this.g, var1, var5, var6);
      var2 = bdb.h(this.g, var1, var5, var6);
      var1 = bdb.i(this.g, var1, var5, var6);
      return bcq.k((float)this.f.m.a((double)var3), (float)this.f.m.a((double)var2), (float)this.f.m.a((double)var1), var4, this.f);
   }
}
