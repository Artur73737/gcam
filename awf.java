import java.util.ArrayList;

public final class awf extends awu {
   public static final awf a = new awf();

   private awf() {
      super(1, 0, 2);
   }

   public final String a(int var1) {
      String var2;
      if (c.n(var1, 0)) {
         var2 = "offset";
      } else {
         var2 = super.a(var1);
      }

      return var2;
   }

   public final void b(aww var1, asf var2, auw var3, asv var4) {
      int var7 = var1.a(0);
      if (var3.m == 0) {
         if (var7 < 0) {
            asr.k("Parameter offset is out of bounds");
            throw new qsc();
         } else {
            if (var7 != 0) {
               int var6 = var3.o;
               int var12 = var3.p;
               int var8 = var3.g;

               int var5;
               for(var5 = var6; var7 > 0; --var7) {
                  var5 += pu.f(var3.b, var3.f(var5));
                  if (var5 > var8) {
                     asr.k("Parameter offset is out of bounds");
                     throw new qsc();
                  }
               }

               int var13 = pu.f(var3.b, var3.f(var5));
               var7 = var3.h;
               var8 = var3.b(var3.b, var3.f(var5));
               int[] var21 = var3.b;
               int var15 = var5 + var13;
               var5 = var3.b(var21, var3.f(var15));
               int var14 = var5 - var8;
               var3.x(var14, Math.max(var3.o - 1, 0));
               var3.w(var13);
               var21 = var3.b;
               int var9 = var3.f(var15) * 5;
               pwm.bg(var21, var21, var3.f(var6) * 5, var9, var13 * 5 + var9);
               if (var14 > 0) {
                  Object[] var22 = var3.c;
                  pwm.bh(var22, var22, var7, var3.c(var8 + var14), var3.c(var5 + var14));
               }

               int var16 = var8 + var14;
               int var10 = var16 - var7;
               var5 = var3.j;
               var8 = var3.k;
               var7 = var3.c.length;
               int var17 = var3.l;

               for(var9 = var6; var9 < var6 + var13; ++var9) {
                  int var18 = var3.f(var9);
                  int var19 = var3.b(var21, var18);
                  int var11;
                  if (var17 < var18) {
                     var11 = 0;
                  } else {
                     var11 = var5;
                  }

                  pu.n(var21, var18, auw.O(auw.O(var19 - var10, var11, var8, var7), var3.j, var3.k, var3.c.length));
               }

               var7 = var3.e();
               var5 = pu.h(var3.d, var15, var7);
               ArrayList var23 = new ArrayList();

               nxj var25;
               while(var5 < var3.d.size()) {
                  Object var24 = var3.d.get(var5);
                  var24.getClass();
                  var25 = (nxj)var24;
                  var8 = var3.T(var25);
                  if (var8 < var15 || var8 >= var15 + var13) {
                     break;
                  }

                  var23.add(var25);
                  var3.d.remove(var5);
               }

               var8 = var23.size();

               for(var5 = 0; var5 < var8; ++var5) {
                  var25 = (nxj)var23.get(var5);
                  var9 = var3.T(var25) + (var6 - var15);
                  if (var9 >= var3.e) {
                     var25.a = -(var7 - var9);
                  } else {
                     var25.a = var9;
                  }

                  var9 = pu.h(var3.d, var9, var7);
                  var3.d.add(var9, var25);
               }

               if (var3.N(var15, var13)) {
                  asr.k("Unexpectedly removed anchors");
                  throw new qsc();
               }

               var3.v(var12, var3.g, var6);
               if (var14 > 0) {
                  var3.B(var16, var14, var15 - 1);
                  return;
               }
            }

         }
      } else {
         asr.k("Cannot move a group while inserting");
         qsc var20 = new qsc();
         throw var20;
      }
   }
}
