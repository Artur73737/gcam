import androidx.wear.ambient.AmbientMode$AmbientController;
import java.util.ArrayList;
import java.util.List;

public final class bfd extends bgb {
   public final List a = new ArrayList();
   public List b;
   public boolean c;
   public qvi d;
   public String e;
   public float f;
   public float g;
   public float h;
   public boolean i;
   private float[] j;
   private float k;
   private float l;
   private float m;
   private float n;
   private bbf o;

   public bfd() {
      this.b = bgj.a;
      this.c = true;
      this.e = "";
      this.m = 1.0F;
      this.n = 1.0F;
      this.i = true;
   }

   private final boolean l() {
      return !this.b.isEmpty();
   }

   public final int a() {
      return this.a.size();
   }

   public final qvi b() {
      return this.d;
   }

   public final void c(bev var1) {
      boolean var21 = this.i;
      byte var20 = 0;
      int var18;
      int var19;
      if (var21) {
         float[] var24 = this.j;
         float var4;
         if (var24 == null) {
            var24 = bdf.c();
            this.j = var24;
         } else {
            for(var18 = 0; var18 < 4; ++var18) {
               for(var19 = 0; var19 < 4; ++var19) {
                  if (var18 == var19) {
                     var4 = 1.0F;
                  } else {
                     var4 = 0.0F;
                  }

                  var24[var19 * 4 + var18] = var4;
               }
            }
         }

         bdf.d(var24, this.g + this.k, this.h + this.l);
         double var2 = (double)this.f;
         Double.isNaN(var2);
         var2 = var2 * 3.141592653589793D / 180.0D;
         float var10 = (float)Math.cos(var2);
         float var7 = (float)Math.sin(var2);
         float var11 = var24[0];
         float var17 = var24[4];
         float var9 = -var7;
         float var16 = var24[1];
         float var15 = var24[5];
         float var13 = var24[2];
         float var14 = var24[6];
         float var8 = var24[3];
         float var12 = var24[7];
         var4 = var10 * var11 + var7 * var17;
         var24[0] = var4;
         float var6 = var10 * var16 + var7 * var15;
         var24[1] = var6;
         float var5 = var10 * var13 + var7 * var14;
         var24[2] = var5;
         var7 = var10 * var8 + var7 * var12;
         var24[3] = var7;
         var11 = var11 * var9 + var17 * var10;
         var24[4] = var11;
         var15 = var16 * var9 + var15 * var10;
         var24[5] = var15;
         var13 = var13 * var9 + var14 * var10;
         var24[6] = var13;
         var10 = var9 * var8 + var10 * var12;
         var24[7] = var10;
         var9 = this.m;
         var8 = this.n;
         var24[0] = var4 * var9;
         var24[1] = var6 * var9;
         var24[2] = var5 * var9;
         var24[3] = var7 * var9;
         var24[4] = var11 * var8;
         var24[5] = var15 * var8;
         var24[6] = var13 * var8;
         var24[7] = var10 * var8;
         bdf.d(var24, -this.k, -this.l);
         this.i = false;
      }

      if (this.c) {
         if (this.l()) {
            bbf var25 = this.o;
            bbf var27 = var25;
            if (var25 == null) {
               var27 = eu.i();
               this.o = var27;
            }

            gg.h(this.b, var27);
         }

         this.c = false;
      }

      bes var30 = var1.m();
      long var22 = var30.a();
      var30.b().e();
      Object var28 = var30.b;
      float[] var26 = this.j;
      if (var26 != null) {
         var26 = (new bdf(var26)).a;
         ((bes)((AmbientMode$AmbientController)var28).a).b().a(var26);
      }

      bbf var31 = this.o;
      if (this.l() && var31 != null) {
         ((bes)((AmbientMode$AmbientController)var28).a).b().r(var31);
      }

      List var29 = this.a;
      var19 = var29.size();

      for(var18 = var20; var18 < var19; ++var18) {
         ((bgb)var29.get(var18)).c(var1);
      }

      var30.b().d();
      var30.c(var22);
   }

   public final void d(int var1, int var2) {
      for(int var3 = 0; var3 < var2; ++var3) {
         if (var1 < this.a.size()) {
            ((bgb)this.a.get(var1)).e((qvi)null);
            this.a.remove(var1);
         }
      }

      this.k();
   }

   public final void e(qvi var1) {
      this.d = var1;
      List var4 = this.a;
      int var3 = var4.size();

      for(int var2 = 0; var2 < var3; ++var2) {
         ((bgb)var4.get(var2)).e(var1);
      }

   }

   public final void f(String var1) {
      this.e = var1;
      this.k();
   }

   public final void g(float var1) {
      this.k = var1;
      this.i = true;
      this.k();
   }

   public final void h(float var1) {
      this.l = var1;
      this.i = true;
      this.k();
   }

   public final void i(float var1) {
      this.m = var1;
      this.i = true;
      this.k();
   }

   public final void j(float var1) {
      this.n = var1;
      this.i = true;
      this.k();
   }

   public final String toString() {
      StringBuilder var4 = new StringBuilder();
      var4.append("VGroup: ");
      var4.append(this.e);
      List var3 = this.a;
      int var2 = var3.size();

      for(int var1 = 0; var1 < var2; ++var1) {
         bgb var5 = (bgb)var3.get(var1);
         var4.append("\t");
         var4.append(var5.toString());
         var4.append("\n");
      }

      return var4.toString();
   }
}
