import android.graphics.PointF;
import android.view.View;

public class lp extends lz {
   private ln b;
   private ln c;

   private final ln h(lx var1) {
      ln var2 = this.c;
      if (var2 == null || var2.a != var1) {
         this.c = ln.p(var1);
      }

      return this.c;
   }

   private final ln i(lx var1) {
      ln var2 = this.b;
      if (var2 == null || var2.a != var1) {
         this.b = ln.r(var1);
      }

      return this.b;
   }

   private static final int j(View var0, ln var1) {
      return var1.d(var0) + var1.b(var0) / 2 - (var1.j() + var1.k() / 2);
   }

   public final int a(lx var1, int var2, int var3) {
      int var12 = var1.ao();
      if (var12 == 0) {
         return -1;
      } else {
         boolean var14 = var1.X();
         View var17 = null;
         ln var16;
         if (var14) {
            var16 = this.i(var1);
         } else if (var1.W()) {
            var16 = this.h(var1);
         } else {
            var16 = null;
         }

         if (var16 == null) {
            return -1;
         } else {
            int var13 = var1.am();
            boolean var11 = false;
            View var15 = null;
            int var7 = Integer.MAX_VALUE;
            int var4 = Integer.MIN_VALUE;

            int var5;
            int var8;
            for(int var6 = 0; var6 < var13; var4 = var8) {
               View var20 = var1.ay(var6);
               View var21 = var17;
               View var19 = var15;
               int var9 = var7;
               var8 = var4;
               if (var20 != null) {
                  int var10 = j(var20, var16);
                  View var18 = var15;
                  var5 = var4;
                  if (var10 <= 0) {
                     var18 = var15;
                     var5 = var4;
                     if (var10 > var4) {
                        var18 = var20;
                        var5 = var10;
                     }
                  }

                  var21 = var17;
                  var19 = var18;
                  var9 = var7;
                  var8 = var5;
                  if (var10 >= 0) {
                     var21 = var17;
                     var19 = var18;
                     var9 = var7;
                     var8 = var5;
                     if (var10 < var7) {
                        var9 = var10;
                        var8 = var5;
                        var19 = var18;
                        var21 = var20;
                     }
                  }
               }

               ++var6;
               var17 = var21;
               var15 = var19;
               var7 = var9;
            }

            boolean var23;
            byte var25;
            label97: {
               var14 = var1.W();
               var25 = 1;
               if (var14) {
                  if (var2 > 0) {
                     var23 = true;
                     break label97;
                  }
               } else if (var3 > 0) {
                  var23 = true;
                  break label97;
               }

               var23 = false;
            }

            if (var23 && var17 != null) {
               return lx.bh(var17);
            } else if (!var23 && var15 != null) {
               return lx.bh(var15);
            } else {
               if (var23) {
                  var17 = var15;
               }

               if (var17 == null) {
                  return -1;
               } else {
                  boolean var24;
                  label84: {
                     var5 = lx.bh(var17);
                     var3 = var1.ao();
                     if (var1 instanceof mi) {
                        PointF var22 = ((mi)var1).K(var3 - 1);
                        if (var22 != null && (var22.x < 0.0F || var22.y < 0.0F)) {
                           var24 = true;
                           break label84;
                        }
                     }

                     var24 = var11;
                  }

                  if (var24 == var23) {
                     var25 = -1;
                  }

                  var2 = var5 + var25;
                  return var2 >= 0 && var2 < var12 ? var2 : -1;
               }
            }
         }
      }
   }

   public View b(lx var1) {
      if (var1.X()) {
         return dq.b(var1, this.i(var1));
      } else {
         return var1.W() ? dq.b(var1, this.h(var1)) : null;
      }
   }

   public final int[] c(lx var1, View var2) {
      int[] var3 = new int[2];
      if (var1.W()) {
         var3[0] = j(var2, this.h(var1));
      } else {
         var3[0] = 0;
      }

      if (var1.X()) {
         var3[1] = j(var2, this.i(var1));
      } else {
         var3[1] = 0;
      }

      return var3;
   }

   public final mj d(lx var1) {
      return !(var1 instanceof mi) ? null : new lo(this, this.a.getContext());
   }
}
