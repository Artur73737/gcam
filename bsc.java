import java.util.ArrayList;
import java.util.List;

public final class bsc {
   public final bsd a;
   public final boolean b;
   public final float c;
   public final float d;
   public final int e;
   public final List f;
   public final List g;
   private final int h;

   public bsc(bsd var1, long var2, int var4, boolean var5) {
      this.a = var1;
      this.h = var4;
      if (bxq.d(var2) == 0 && bxq.c(var2) == 0) {
         ArrayList var17 = new ArrayList();
         List var22 = var1.c;
         int var10 = var22.size();
         int var9 = 0;
         var4 = 0;
         float var7 = 0.0F;

         int var8;
         while(true) {
            if (var9 < var10) {
               bsf var16 = (bsf)var22.get(var9);
               bsg var18 = var16.a;
               int var11 = bxq.b(var2);
               if (bxq.g(var2)) {
                  var8 = qxb.k(bxq.a(var2) - lb.h(var7), 0);
               } else {
                  var8 = bxq.a(var2);
               }

               long var14 = car.aa(var11, var8, 5);
               brw var27 = bte.e(var18, this.h - var4, var5, var14);
               float var6 = var7 + var27.b();
               var8 = var4 + var27.f();
               var17.add(new bse(var27, var16.b, var16.c, var4, var8, var7, var6));
               boolean var13 = var27.h();
               boolean var12 = true;
               if (!var13) {
                  if (var8 == this.h && var9 != pwm.al(this.a.c)) {
                     var4 = var8;
                     var5 = var12;
                     var7 = var6;
                     break;
                  }

                  ++var9;
                  var4 = var8;
                  var7 = var6;
                  continue;
               }

               var4 = var8;
               var5 = var12;
               var7 = var6;
               break;
            }

            var5 = false;
            break;
         }

         this.d = var7;
         this.e = var4;
         this.b = var5;
         this.g = var17;
         this.c = (float)bxq.b(var2);
         ArrayList var26 = new ArrayList(var17.size());
         var9 = var17.size();

         for(var4 = 0; var4 < var9; ++var4) {
            bse var19 = (bse)var17.get(var4);
            List var20 = var19.g.d;
            ArrayList var28 = new ArrayList(var20.size());
            var10 = var20.size();

            for(var8 = 0; var8 < var10; ++var8) {
               bcj var23 = (bcj)var20.get(var8);
               if (var23 != null) {
                  var23 = var19.f(var23);
               } else {
                  var23 = null;
               }

               var28.add(var23);
            }

            pwm.aJ(var26, var28);
         }

         Object var25;
         if (var26.size() < 0) {
            var8 = -var26.size();
            ArrayList var24 = new ArrayList(var8);

            for(var4 = 0; var4 < var8; ++var4) {
               var24.add((Object)null);
            }

            var25 = pwm.aA(var26, var24);
         } else {
            var25 = var26;
         }

         this.f = (List)var25;
      } else {
         IllegalArgumentException var21 = new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
         throw var21;
      }
   }

   public final bry a() {
      return this.a.a;
   }

   public final void b(int var1) {
      if (var1 < 0 || var1 >= this.e) {
         StringBuilder var2 = new StringBuilder();
         var2.append("lineIndex(");
         var2.append(var1);
         var2.append(") is out of bounds [0, ");
         var2.append(this.e);
         var2.append(')');
         throw new IllegalArgumentException(var2.toString());
      }
   }

   public final void c(bcw var1, long var2, bdq var4, bxd var5, gf var6) {
      var1.getClass();
      var1.e();
      List var9 = this.g;
      int var8 = var9.size();

      for(int var7 = 0; var7 < var8; ++var7) {
         bse var10 = (bse)var9.get(var7);
         var10.g.j(var1, var2, var4, var5, var6);
         var1.g(0.0F, var10.g.b());
      }

      var1.d();
   }
}
