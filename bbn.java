import androidx.wear.ambient.AmbientMode$AmbientController;

public final class bbn extends bba implements blv, bll {
   public bfa a;
   public boolean b;
   public bar c;
   public bja d;
   public float e;
   public dmw f;

   public bbn(bfa var1, bar var2, bja var3, dmw var4) {
      this.a = var1;
      this.b = true;
      this.c = var2;
      this.d = var3;
      this.e = 1.0F;
      this.f = var4;
   }

   private final boolean d() {
      return this.b && this.a.a() != bcl.b;
   }

   private static final boolean f(long var0) {
      if (!c.o(var0, bcl.b)) {
         float var2 = bcl.a(var0);
         if (!Float.isInfinite(var2) && !Float.isNaN(var2)) {
            return true;
         }
      }

      return false;
   }

   private static final boolean g(long var0) {
      if (!c.o(var0, bcl.b)) {
         float var2 = bcl.c(var0);
         if (!Float.isInfinite(var2) && !Float.isNaN(var2)) {
            return true;
         }
      }

      return false;
   }

   public final bju a(bjw var1, bjs var2, long var3) {
      boolean var13 = bxq.h(var3);
      boolean var8 = true;
      boolean var7;
      if (var13 && bxq.g(var3)) {
         var7 = true;
      } else {
         var7 = false;
      }

      if (!bxq.j(var3) || !bxq.i(var3)) {
         var8 = false;
      }

      if ((this.d() || !var7) && !var8) {
         long var9 = this.a.a();
         int var15;
         if (g(var9)) {
            var15 = qxg.e(bcl.c(var9));
         } else {
            var15 = bxq.d(var3);
         }

         int var16;
         if (f(var9)) {
            var16 = qxg.e(bcl.a(var9));
         } else {
            var16 = bxq.c(var3);
         }

         var15 = car.W(var3, var15);
         var16 = car.V(var3, var16);
         var9 = et.k((float)var15, (float)var16);
         if (this.d()) {
            float var5;
            if (!g(this.a.a())) {
               var5 = bcl.c(var9);
            } else {
               var5 = bcl.c(this.a.a());
            }

            float var6;
            if (!f(this.a.a())) {
               var6 = bcl.a(var9);
            } else {
               var6 = bcl.a(this.a.a());
            }

            long var11 = et.k(var5, var6);
            if (bcl.c(var9) != 0.0F && bcl.a(var9) != 0.0F) {
               var9 = ja.e(var11, this.d.a(var11, var9));
            } else {
               var9 = bcl.a;
            }
         }

         var3 = bxq.k(var3, car.W(var3, qxg.e(bcl.c(var9))), 0, car.V(var3, qxg.e(bcl.a(var9))), 0, 10);
      } else {
         var3 = bxq.k(var3, bxq.b(var3), 0, bxq.a(var3), 0, 10);
      }

      bke var14 = var2.l(var3);
      return ja.g(var1, var14.a, var14.b, new arh(var14, 13));
   }

   // $FF: synthetic method
   public final void es() {
   }

   public final void eu(bmf var1) {
      long var10 = this.a.a();
      float var2;
      if (g(var10)) {
         var2 = bcl.c(var10);
      } else {
         var2 = bcl.c(var1.j());
      }

      float var3;
      if (f(var10)) {
         var3 = bcl.a(var10);
      } else {
         var3 = bcl.a(var1.j());
      }

      var10 = et.k(var2, var3);
      if (bcl.c(var1.j()) != 0.0F && bcl.a(var1.j()) != 0.0F) {
         var10 = ja.e(var10, this.d.a(var10, var1.j()));
      } else {
         var10 = bcl.a;
      }

      long var12 = this.c.a(car.I(qxg.e(bcl.c(var10)), qxg.e(bcl.a(var10))), car.I(qxg.e(bcl.c(var1.j())), qxg.e(bcl.a(var1.j()))), var1.k());
      int var7 = bxw.a(var12);
      int var8 = bxw.b(var12);
      AmbientMode$AmbientController var14 = (AmbientMode$AmbientController)var1.m().b;
      var3 = (float)var7;
      var2 = (float)var8;
      var14.b(var3, var2);
      bfa var16 = this.a;
      float var6 = this.e;
      dmw var15 = this.f;
      if (var16.b != var6) {
         var16.c(var6);
         var16.b = var6;
      }

      if (!c.E(var16.d, var15)) {
         var16.d(var15);
         var16.d = var15;
      }

      bxy var18 = var1.k();
      if (var16.c != var18) {
         var18.getClass();
         var16.c = var18;
      }

      float var5 = bcl.c(var1.j()) - bcl.c(var10);
      float var4 = bcl.a(var1.j()) - bcl.a(var10);
      ((AmbientMode$AmbientController)var1.m().b).c(var5, var4);
      if (var6 > 0.0F && bcl.c(var10) > 0.0F && bcl.a(var10) > 0.0F) {
         boolean var9 = var16.a;
         var16.b(var1);
      }

      Object var17 = var1.m().b;
      var5 = -var5;
      var4 = -var4;
      ((AmbientMode$AmbientController)var17).c(var5, var4);
      var17 = var1.m().b;
      var3 = -var3;
      var2 = -var2;
      ((AmbientMode$AmbientController)var17).b(var3, var2);
      var1.l();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("PainterModifier(painter=");
      var1.append(this.a);
      var1.append(", sizeToIntrinsics=");
      var1.append(this.b);
      var1.append(", alignment=");
      var1.append(this.c);
      var1.append(", alpha=");
      var1.append(this.e);
      var1.append(", colorFilter=");
      var1.append(this.f);
      var1.append(')');
      return var1.toString();
   }

   public final boolean v() {
      return false;
   }
}
