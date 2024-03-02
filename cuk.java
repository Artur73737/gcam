import android.animation.Animator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public class cuk extends ctr {
   private static final String[] s = new String[]{"android:visibility:visibility", "android:visibility:parent"};
   public int r = 3;

   public static final void J(cuc var0) {
      int var1 = var0.b.getVisibility();
      var0.a.put("android:visibility:visibility", var1);
      var0.a.put("android:visibility:parent", var0.b.getParent());
      int[] var2 = new int[2];
      var0.b.getLocationOnScreen(var2);
      var0.a.put("android:visibility:screenLocation", var2);
   }

   private static final cuj K(cuc var0, cuc var1) {
      cuj var4 = new cuj();
      var4.a = false;
      var4.b = false;
      if (var0 != null && var0.a.containsKey("android:visibility:visibility")) {
         var4.c = (Integer)var0.a.get("android:visibility:visibility");
         var4.e = (ViewGroup)var0.a.get("android:visibility:parent");
      } else {
         var4.c = -1;
         var4.e = null;
      }

      if (var1 != null && var1.a.containsKey("android:visibility:visibility")) {
         var4.d = (Integer)var1.a.get("android:visibility:visibility");
         var4.f = (ViewGroup)var1.a.get("android:visibility:parent");
      } else {
         var4.d = -1;
         var4.f = null;
      }

      label57: {
         label74: {
            if (var0 != null && var1 != null) {
               int var3 = var4.c;
               int var2 = var4.d;
               if (var3 == var2 && var4.e == var4.f) {
                  return var4;
               }

               if (var3 != var2) {
                  if (var3 != 0) {
                     if (var2 != 0) {
                        return var4;
                     }
                     break label74;
                  }
               } else if (var4.f != null) {
                  if (var4.e != null) {
                     return var4;
                  }
                  break label74;
               }
            } else {
               if (var0 == null && var4.d == 0) {
                  break label74;
               }

               if (var1 != null || var4.c != 0) {
                  return var4;
               }
            }

            var4.b = false;
            break label57;
         }

         var4.b = true;
      }

      var4.a = true;
      return var4;
   }

   public final Animator a(ViewGroup var1, cuc var2, cuc var3) {
      cuj var18 = K(var2, var3);
      boolean var16 = var18.a;
      View var17 = null;
      if (var16 && (var18.e != null || var18.f != null)) {
         var16 = var18.b;
         boolean var7 = true;
         if (var16) {
            if ((this.r & 1) == 1 && var3 != null) {
               if (var2 != null) {
                  return this.e(var3.b, var2);
               }

               View var28 = (View)var3.b.getParent();
               if (!K(this.j(var28, false), this.k(var28, false)).a) {
                  return this.e(var3.b, var2);
               }
            }

            return null;
         } else {
            int var8 = var18.d;
            Animator var24;
            if ((this.r & 2) == 2 && var2 != null) {
               View var20 = var2.b;
               if (var3 != null) {
                  var17 = var3.b;
               } else {
                  var17 = null;
               }

               Object var30 = (View)var20.getTag(2131428151);
               int var9;
               int var29;
               if (var30 != null) {
                  var17 = null;
               } else {
                  label151: {
                     label156: {
                        if (var17 != null && var17.getParent() != null) {
                           if (var8 == 4 || var20 == var17) {
                              var30 = null;
                              var7 = false;
                              break label156;
                           }
                        } else if (var17 != null) {
                           var30 = var17;
                           var7 = false;
                           var17 = null;
                           break label156;
                        }

                        var17 = null;
                        var30 = null;
                        var7 = true;
                     }

                     if (var7) {
                        if (var20.getParent() == null) {
                           var30 = var20;
                           var7 = false;
                           break label151;
                        }

                        if (var20.getParent() instanceof View) {
                           View var19 = (View)var20.getParent();
                           if (!K(this.k(var19, true), this.j(var19, true)).a) {
                              int var10;
                              int var11;
                              int var12;
                              ImageView var21;
                              Bitmap var34;
                              label157: {
                                 Matrix var33 = new Matrix();
                                 var29 = -var19.getScrollX();
                                 var9 = -var19.getScrollY();
                                 var33.setTranslate((float)var29, (float)var9);
                                 var29 = cug.b;
                                 var20.transformMatrixToGlobal(var33);
                                 var1.transformMatrixToLocal(var33);
                                 RectF var22 = new RectF(0.0F, 0.0F, (float)var20.getWidth(), (float)var20.getHeight());
                                 var33.mapRect(var22);
                                 var9 = Math.round(var22.left);
                                 var11 = Math.round(var22.top);
                                 var10 = Math.round(var22.right);
                                 var12 = Math.round(var22.bottom);
                                 var21 = new ImageView(var20.getContext());
                                 var21.setScaleType(ScaleType.CENTER_CROP);
                                 boolean var13 = cua.a(var20) ^ true;
                                 var16 = cua.a(var1);
                                 ViewGroup var32;
                                 if (var13) {
                                    if (!var16) {
                                       var34 = null;
                                       break label157;
                                    }

                                    var32 = (ViewGroup)var20.getParent();
                                    var29 = var32.indexOfChild(var20);
                                    ctz.a(var1, var20);
                                 } else {
                                    var32 = null;
                                    var29 = 0;
                                 }

                                 int var15 = Math.round(var22.width());
                                 int var14 = Math.round(var22.height());
                                 if (var15 > 0 && var14 > 0) {
                                    float var5 = (float)var15;
                                    float var6 = Math.min(1.0F, 1048576.0F / (float)(var15 * var14));
                                    float var4 = (float)var14;
                                    var14 = Math.round(var5 * var6);
                                    var15 = Math.round(var4 * var6);
                                    var33.postTranslate(-var22.left, -var22.top);
                                    var33.postScale(var6, var6);
                                    Picture var23 = new Picture();
                                    Canvas var35 = var23.beginRecording(var14, var15);
                                    var35.concat(var33);
                                    var20.draw(var35);
                                    var23.endRecording();
                                    var34 = cub.a(var23);
                                 } else {
                                    var34 = null;
                                 }

                                 if (var13) {
                                    ctz.b(var1, var20);
                                    var32.addView(var20, var29);
                                 }
                              }

                              if (var34 != null) {
                                 var21.setImageBitmap(var34);
                              }

                              var21.measure(MeasureSpec.makeMeasureSpec(var10 - var9, 1073741824), MeasureSpec.makeMeasureSpec(var12 - var11, 1073741824));
                              var21.layout(var9, var11, var10, var12);
                              var30 = var21;
                              var7 = false;
                              break label151;
                           }

                           var29 = var19.getId();
                           if (var19.getParent() == null && var29 != -1) {
                              var1.findViewById(var29);
                           }
                        }
                     }

                     var7 = false;
                  }
               }

               if (var30 != null) {
                  if (!var7) {
                     int[] var31 = (int[])var2.a.get("android:visibility:screenLocation");
                     var9 = var31[0];
                     var8 = var31[1];
                     var31 = new int[2];
                     var1.getLocationOnScreen(var31);
                     ((View)var30).offsetLeftAndRight(var9 - var31[0] - ((View)var30).getLeft());
                     ((View)var30).offsetTopAndBottom(var8 - var31[1] - ((View)var30).getTop());
                     var1.getOverlay().add((View)var30);
                  }

                  Animator var26 = this.f((View)var30, var2, var3);
                  if (!var7) {
                     if (var26 == null) {
                        var1.getOverlay().remove((View)var30);
                        var24 = var26;
                     } else {
                        var20.setTag(2131428151, var30);
                        cui var25 = new cui(this, var1, (View)var30, var20);
                        var26.addListener(var25);
                        css.a(var26, var25);
                        this.i().x(var25);
                        var24 = var26;
                     }
                  } else {
                     var24 = var26;
                  }
               } else if (var17 != null) {
                  var9 = var17.getVisibility();
                  var29 = cug.b;
                  var17.setTransitionVisibility(0);
                  var24 = this.f(var17, var2, var3);
                  if (var24 != null) {
                     cuh var27 = new cuh(var17, var8);
                     var24.addListener(var27);
                     this.i().x(var27);
                  } else {
                     var17.setTransitionVisibility(var9);
                  }
               } else {
                  var24 = null;
               }
            } else {
               var24 = var17;
            }

            return var24;
         }
      } else {
         return null;
      }
   }

   public final void b(cuc var1) {
      J(var1);
   }

   public void c(cuc var1) {
      throw null;
   }

   public final String[] d() {
      return s;
   }

   public Animator e(View var1, cuc var2) {
      throw null;
   }

   public Animator f(View var1, cuc var2, cuc var3) {
      throw null;
   }

   public final boolean v(cuc var1, cuc var2) {
      boolean var4 = false;
      if (var1 == null && var2 == null) {
         return false;
      } else if (var1 != null && var2 != null && var2.a.containsKey("android:visibility:visibility") != var1.a.containsKey("android:visibility:visibility")) {
         return false;
      } else {
         cuj var5 = K(var1, var2);
         boolean var3 = var4;
         if (var5.a) {
            if (var5.c != 0) {
               if (var5.d == 0) {
                  return true;
               }

               var3 = var4;
            } else {
               var3 = true;
            }
         }

         return var3;
      }
   }
}
