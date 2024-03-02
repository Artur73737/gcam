import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

public final class ctb extends ctr {
   private static final String[] r = new String[]{"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
   private static final Property s = new cst(PointF.class);
   private static final Property t = new csu(PointF.class);
   private static final Property u = new csv(PointF.class);
   private static final Property v = new csw(PointF.class);
   private static final Property w = new csx(PointF.class);

   private static final void e(cuc var0) {
      View var1 = var0.b;
      if (cga.f(var1) || var1.getWidth() != 0 || var1.getHeight() != 0) {
         var0.a.put("android:changeBounds:bounds", new Rect(var1.getLeft(), var1.getTop(), var1.getRight(), var1.getBottom()));
         var0.a.put("android:changeBounds:parent", var0.b.getParent());
      }
   }

   public final Animator a(ViewGroup var1, cuc var2, cuc var3) {
      if (var2 != null && var3 != null) {
         Map var23 = var2.a;
         Map var25 = var3.a;
         ViewGroup var34 = (ViewGroup)var23.get("android:changeBounds:parent");
         var1 = (ViewGroup)var25.get("android:changeBounds:parent");
         if (var34 != null && var1 != null) {
            int var7;
            int var8;
            int var10;
            int var11;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            int var22;
            Rect var26;
            Rect var27;
            View var35;
            label102: {
               int var9;
               int var12;
               label99: {
                  var35 = var3.b;
                  Rect var24 = (Rect)var2.a.get("android:changeBounds:bounds");
                  var26 = (Rect)var3.a.get("android:changeBounds:bounds");
                  var15 = var24.left;
                  var21 = var26.left;
                  var18 = var24.top;
                  var20 = var26.top;
                  var16 = var24.right;
                  var22 = var26.right;
                  var13 = var24.bottom;
                  var14 = var26.bottom;
                  var17 = var16 - var15;
                  var7 = var13 - var18;
                  var19 = var22 - var21;
                  var12 = var14 - var20;
                  var26 = (Rect)var2.a.get("android:changeBounds:clip");
                  var27 = (Rect)var3.a.get("android:changeBounds:clip");
                  var8 = var7;
                  if (var17 != 0) {
                     var9 = var7;
                     if (var7 != 0) {
                        break label99;
                     }

                     var8 = 0;
                  }

                  if (var19 == 0) {
                     var7 = 0;
                     var11 = var12;
                     var10 = var8;
                     break label102;
                  }

                  var9 = var8;
                  if (var12 == 0) {
                     var11 = 0;
                     var7 = 0;
                     var10 = var8;
                     break label102;
                  }
               }

               byte var33;
               if (var15 == var21 && var18 == var20) {
                  var33 = 0;
               } else {
                  var33 = 1;
               }

               if (var16 == var22) {
                  var10 = var9;
                  var11 = var12;
                  var7 = var33;
                  if (var13 == var14) {
                     break label102;
                  }
               }

               var7 = var33 + 1;
               var10 = var9;
               var11 = var12;
            }

            label104: {
               if (var26 == null || var26.equals(var27)) {
                  var8 = var7;
                  if (var26 != null) {
                     break label104;
                  }

                  var8 = var7;
                  if (var27 == null) {
                     break label104;
                  }
               }

               var8 = var7 + 1;
            }

            if (var8 <= 0) {
               return null;
            } else {
               var7 = cug.b;
               var35.setLeftTopRightBottom(var15, var18, var16, var13);
               Path var29;
               Object var31;
               if (var8 == 2) {
                  if (var17 == var19 && var10 == var11) {
                     var29 = csr.b((float)var15, (float)var18, (float)var21, (float)var20);
                     var31 = ctj.a(var35, w, var29);
                  } else {
                     cta var28 = new cta(var35);
                     var29 = csr.b((float)var15, (float)var18, (float)var21, (float)var20);
                     ObjectAnimator var32 = ctj.a(var28, s, var29);
                     var29 = csr.b((float)var16, (float)var13, (float)var22, (float)var14);
                     ObjectAnimator var36 = ctj.a(var28, t, var29);
                     var31 = new AnimatorSet();
                     ((AnimatorSet)var31).playTogether(new Animator[]{var32, var36});
                     ((AnimatorSet)var31).addListener(new csy(var28));
                  }
               } else if (var15 == var21 && var18 == var20) {
                  var29 = csr.b((float)var16, (float)var13, (float)var22, (float)var14);
                  var31 = ctj.a(var35, u, var29);
               } else {
                  float var4 = (float)var20;
                  float var6 = (float)var21;
                  float var5 = (float)var18;
                  var29 = csr.b((float)var15, var5, var6, var4);
                  var31 = ctj.a(var35, v, var29);
               }

               if (var35.getParent() instanceof ViewGroup) {
                  ViewGroup var30 = (ViewGroup)var35.getParent();
                  cud.b(var30, true);
                  this.i().x(new csz(var30));
               }

               return (Animator)var31;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public final void b(cuc var1) {
      e(var1);
   }

   public final void c(cuc var1) {
      e(var1);
   }

   public final String[] d() {
      return r;
   }
}
