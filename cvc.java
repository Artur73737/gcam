import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.Resources.Theme;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Bitmap.Config;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.util.AttributeSet;
import com.google.android.apps.camera.facemetadata.jni.Mc.gREaEL;
import com.google.android.apps.lightcycle.panorama.vSAD.IUDuAuCIaH;
import com.google.android.libraries.oliveoil.bufferflinger.aUnT.zBdGS;
import com.google.googlex.gcam.base.HmAh.RbaSbznIXS;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class cvc extends cuu {
   static final Mode a;
   public cva b;
   public boolean c = true;
   private PorterDuffColorFilter d;
   private ColorFilter f;
   private boolean g;
   private final float[] h = new float[9];
   private final Matrix i = new Matrix();
   private final Rect j = new Rect();

   static {
      a = Mode.SRC_IN;
   }

   public cvc() {
      this.b = new cva();
   }

   public cvc(cva var1) {
      this.b = var1;
      this.d = this.b(var1.c, var1.d);
   }

   static int a(int var0, float var1) {
      return var0 & 16777215 | (int)((float)Color.alpha(var0) * var1) << 24;
   }

   final PorterDuffColorFilter b(ColorStateList var1, Mode var2) {
      return var1 != null && var2 != null ? new PorterDuffColorFilter(var1.getColorForState(this.getState(), 0), var2) : null;
   }

   public final boolean canApplyTheme() {
      Drawable var1 = this.e;
      if (var1 != null) {
         cdm.i(var1);
      }

      return false;
   }

   public final void draw(Canvas var1) {
      Drawable var9 = this.e;
      if (var9 != null) {
         var9.draw(var1);
      } else {
         this.copyBounds(this.j);
         if (this.j.width() > 0 && this.j.height() > 0) {
            ColorFilter var10 = this.f;
            Object var12 = var10;
            if (var10 == null) {
               var12 = this.d;
            }

            var1.getMatrix(this.i);
            this.i.getValues(this.h);
            float var2 = Math.abs(this.h[0]);
            float var3 = Math.abs(this.h[4]);
            float var5 = Math.abs(this.h[1]);
            float var4 = Math.abs(this.h[3]);
            if (var5 == 0.0F) {
               if (var4 != 0.0F) {
                  var2 = 1.0F;
                  var3 = 1.0F;
               }
            } else {
               var2 = 1.0F;
               var3 = 1.0F;
            }

            var4 = (float)this.j.width();
            int var7 = (int)((float)this.j.height() * var3);
            int var6 = Math.min(2048, (int)(var4 * var2));
            int var8 = Math.min(2048, var7);
            if (var6 > 0 && var8 > 0) {
               var7 = var1.save();
               var1.translate((float)this.j.left, (float)this.j.top);
               if (this.isAutoMirrored() && cdn.a(this) == 1) {
                  var1.translate((float)this.j.width(), 0.0F);
                  var1.scale(-1.0F, 1.0F);
               }

               this.j.offsetTo(0, 0);
               cva var13 = this.b;
               Bitmap var11 = var13.f;
               if (var11 == null || var6 != var11.getWidth() || var8 != var13.f.getHeight()) {
                  var13.f = Bitmap.createBitmap(var6, var8, Config.ARGB_8888);
                  var13.k = true;
               }

               if (!this.c) {
                  this.b.a(var6, var8);
               } else {
                  var13 = this.b;
                  if (var13.k || var13.g != var13.c || var13.h != var13.d || var13.j != var13.e || var13.i != var13.b.getRootAlpha()) {
                     this.b.a(var6, var8);
                     var13 = this.b;
                     var13.g = var13.c;
                     var13.h = var13.d;
                     var13.i = var13.b.getRootAlpha();
                     var13.j = var13.e;
                     var13.k = false;
                  }
               }

               cva var15 = this.b;
               Rect var16 = this.j;
               Paint var14;
               if (var15.b.getRootAlpha() >= 255 && var12 == null) {
                  var14 = null;
               } else {
                  if (var15.l == null) {
                     var15.l = new Paint();
                     var15.l.setFilterBitmap(true);
                  }

                  var15.l.setAlpha(var15.b.getRootAlpha());
                  var15.l.setColorFilter((ColorFilter)var12);
                  var14 = var15.l;
               }

               var1.drawBitmap(var15.f, (Rect)null, var16, var14);
               var1.restoreToCount(var7);
            }
         }
      }
   }

   public final int getAlpha() {
      Drawable var1 = this.e;
      return var1 != null ? cdl.a(var1) : this.b.b.getRootAlpha();
   }

   public final int getChangingConfigurations() {
      Drawable var1 = this.e;
      return var1 != null ? var1.getChangingConfigurations() : super.getChangingConfigurations() | this.b.getChangingConfigurations();
   }

   public final ColorFilter getColorFilter() {
      Drawable var1 = this.e;
      return var1 != null ? cdm.a(var1) : this.f;
   }

   public final ConstantState getConstantState() {
      Drawable var1 = this.e;
      if (var1 != null) {
         return new cvb(var1.getConstantState());
      } else {
         this.b.a = this.getChangingConfigurations();
         return this.b;
      }
   }

   public final int getIntrinsicHeight() {
      Drawable var1 = this.e;
      return var1 != null ? var1.getIntrinsicHeight() : (int)this.b.b.f;
   }

   public final int getIntrinsicWidth() {
      Drawable var1 = this.e;
      return var1 != null ? var1.getIntrinsicWidth() : (int)this.b.b.e;
   }

   public final int getOpacity() {
      Drawable var1 = this.e;
      return var1 != null ? var1.getOpacity() : -3;
   }

   public final void inflate(Resources var1, XmlPullParser var2, AttributeSet var3) {
      Drawable var4 = this.e;
      if (var4 != null) {
         var4.inflate(var1, var2, var3);
      } else {
         this.inflate(var1, var2, var3, (Theme)null);
      }
   }

   public final void inflate(Resources var1, XmlPullParser var2, AttributeSet var3, Theme var4) {
      Drawable var10 = this.e;
      if (var10 != null) {
         cdm.c(var10, var1, var2, var3, var4);
      } else {
         cva var11 = this.b;
         var11.b = new cuz();
         TypedArray var21 = cbo.i(var1, var4, var3, cum.a);
         cva var13 = this.b;
         cuz var12 = var13.b;
         var13.d = c.l(cbo.g(var21, var2, "tintMode", 6, -1), Mode.SRC_IN);
         ColorStateList var14 = cbo.r(var21, var2, var4);
         if (var14 != null) {
            var13.c = var14;
         }

         var13.e = cbo.p(var21, var2, var13.e);
         var12.g = cbo.e(var21, var2, "viewportWidth", 7, var12.g);
         float var5 = var12.h;
         var5 = cbo.e(var21, var2, RbaSbznIXS.JYpNzga, 8, var5);
         var12.h = var5;
         if (var12.g <= 0.0F) {
            XmlPullParserException var18 = new XmlPullParserException(String.valueOf(var21.getPositionDescription()).concat(IUDuAuCIaH.Qlrz));
            throw var18;
         } else if (var5 <= 0.0F) {
            throw new XmlPullParserException(String.valueOf(var21.getPositionDescription()).concat("<vector> tag requires viewportHeight > 0"));
         } else {
            var12.e = var21.getDimension(3, var12.e);
            var5 = var21.getDimension(2, var12.f);
            var12.f = var5;
            if (var12.e <= 0.0F) {
               throw new XmlPullParserException(String.valueOf(var21.getPositionDescription()).concat("<vector> tag requires width > 0"));
            } else if (var5 <= 0.0F) {
               throw new XmlPullParserException(String.valueOf(var21.getPositionDescription()).concat("<vector> tag requires height > 0"));
            } else {
               var12.setAlpha(cbo.e(var21, var2, "alpha", 4, var12.getAlpha()));
               String var25 = var21.getString(0);
               if (var25 != null) {
                  var12.j = var25;
                  var12.l.put(var25, var12);
               }

               var21.recycle();
               var11.a = this.getChangingConfigurations();
               var11.k = true;
               cva var24 = this.b;
               cuz var28 = var24.b;
               ArrayDeque var15 = new ArrayDeque();
               var15.push(var28.d);
               int var9 = var2.getEventType();
               int var6 = var2.getDepth() + 1;

               boolean var7;
               boolean var8;
               for(var7 = true; var9 != 1 && (var2.getDepth() >= var6 || var9 != 3); var7 = var8) {
                  if (var9 == 2) {
                     String var22 = var2.getName();
                     cux var27 = (cux)var15.peek();
                     if (var27 != null) {
                        if ("path".equals(var22)) {
                           cuw var16 = new cuw();
                           TypedArray var17 = cbo.i(var1, var4, var3, cum.c);
                           var16.a = null;
                           int var19;
                           if (cbo.m(var2, "pathData")) {
                              var22 = var17.getString(0);
                              if (var22 != null) {
                                 var16.n = var22;
                              }

                              var22 = var17.getString(2);
                              if (var22 != null) {
                                 var16.m = cbs.e(var22);
                              }

                              var16.l = cbo.u(var17, var2, var4, "fillColor", 1);
                              var16.d = cbo.e(var17, var2, "fillAlpha", 12, var16.d);
                              var19 = cbo.g(var17, var2, "strokeLineCap", 8, -1);
                              Cap var23 = var16.h;
                              switch(var19) {
                              case 0:
                                 var23 = Cap.BUTT;
                                 break;
                              case 1:
                                 var23 = Cap.ROUND;
                                 break;
                              case 2:
                                 var23 = Cap.SQUARE;
                              }

                              var16.h = var23;
                              var19 = cbo.g(var17, var2, "strokeLineJoin", 9, -1);
                              Join var26 = var16.i;
                              switch(var19) {
                              case 0:
                                 var26 = Join.MITER;
                                 break;
                              case 1:
                                 var26 = Join.ROUND;
                                 break;
                              case 2:
                                 var26 = Join.BEVEL;
                              }

                              var16.i = var26;
                              var16.j = cbo.e(var17, var2, "strokeMiterLimit", 10, var16.j);
                              var16.k = cbo.u(var17, var2, var4, "strokeColor", 3);
                              var5 = var16.c;
                              var16.c = cbo.e(var17, var2, gREaEL.YmX, 11, var5);
                              var16.b = cbo.e(var17, var2, "strokeWidth", 4, var16.b);
                              var16.f = cbo.e(var17, var2, "trimPathEnd", 6, var16.f);
                              var16.g = cbo.e(var17, var2, "trimPathOffset", 7, var16.g);
                              var16.e = cbo.e(var17, var2, "trimPathStart", 5, var16.e);
                              var16.o = cbo.g(var17, var2, "fillType", 13, var16.o);
                           }

                           var17.recycle();
                           var27.b.add(var16);
                           if (var16.getPathName() != null) {
                              var28.l.put(var16.getPathName(), var16);
                           }

                           var19 = var24.a;
                           var8 = false;
                        } else {
                           int var20;
                           TypedArray var31;
                           String var32;
                           if ("clip-path".equals(var22)) {
                              cuv var29 = new cuv();
                              if (cbo.m(var2, "pathData")) {
                                 var31 = cbo.i(var1, var4, var3, cum.d);
                                 var32 = var31.getString(0);
                                 if (var32 != null) {
                                    var29.n = var32;
                                 }

                                 var32 = var31.getString(1);
                                 if (var32 != null) {
                                    var29.m = cbs.e(var32);
                                 }

                                 var29.o = cbo.g(var31, var2, "fillType", 2, 0);
                                 var31.recycle();
                              }

                              var27.b.add(var29);
                              if (var29.getPathName() != null) {
                                 var28.l.put(var29.getPathName(), var29);
                              }

                              var20 = var24.a;
                              var8 = var7;
                           } else if ("group".equals(var22)) {
                              cux var30 = new cux();
                              var31 = cbo.i(var1, var4, var3, cum.b);
                              var30.l = null;
                              var30.c = cbo.e(var31, var2, "rotation", 5, var30.c);
                              var30.d = var31.getFloat(1, var30.d);
                              var30.e = var31.getFloat(2, var30.e);
                              var30.f = cbo.e(var31, var2, "scaleX", 3, var30.f);
                              var30.g = cbo.e(var31, var2, "scaleY", 4, var30.g);
                              var30.h = cbo.e(var31, var2, "translateX", 6, var30.h);
                              var30.i = cbo.e(var31, var2, "translateY", 7, var30.i);
                              var32 = var31.getString(0);
                              if (var32 != null) {
                                 var30.m = var32;
                              }

                              var30.d();
                              var31.recycle();
                              var27.b.add(var30);
                              var15.push(var30);
                              if (var30.getGroupName() != null) {
                                 var28.l.put(var30.getGroupName(), var30);
                              }

                              var20 = var24.a;
                              var8 = var7;
                           } else {
                              var8 = var7;
                           }
                        }
                     } else {
                        var8 = var7;
                     }
                  } else {
                     var8 = var7;
                     if (var9 == 3) {
                        var8 = var7;
                        if ("group".equals(var2.getName())) {
                           var15.pop();
                           var8 = var7;
                        }
                     }
                  }

                  var9 = var2.next();
               }

               if (!var7) {
                  this.d = this.b(var11.c, var11.d);
               } else {
                  throw new XmlPullParserException(zBdGS.TJMLLKIZHyV);
               }
            }
         }
      }
   }

   public final void invalidateSelf() {
      Drawable var1 = this.e;
      if (var1 != null) {
         var1.invalidateSelf();
      } else {
         super.invalidateSelf();
      }
   }

   public final boolean isAutoMirrored() {
      Drawable var1 = this.e;
      return var1 != null ? cdl.e(var1) : this.b.e;
   }

   public final boolean isStateful() {
      Drawable var3 = this.e;
      if (var3 != null) {
         return var3.isStateful();
      } else {
         boolean var2 = super.isStateful();
         boolean var1 = true;
         if (!var2) {
            cva var4 = this.b;
            if (var4 != null) {
               if (var4.b()) {
                  return var1;
               }

               ColorStateList var5 = this.b.c;
               if (var5 != null) {
                  if (!var5.isStateful()) {
                     return false;
                  }

                  return var1;
               }
            }

            var1 = false;
         }

         return var1;
      }
   }

   public final Drawable mutate() {
      Drawable var1 = this.e;
      if (var1 != null) {
         var1.mutate();
         return this;
      } else {
         if (!this.g && super.mutate() == this) {
            this.b = new cva(this.b);
            this.g = true;
         }

         return this;
      }
   }

   protected final void onBoundsChange(Rect var1) {
      Drawable var2 = this.e;
      if (var2 != null) {
         var2.setBounds(var1);
      }

   }

   protected final boolean onStateChange(int[] var1) {
      Drawable var4 = this.e;
      if (var4 != null) {
         return var4.setState(var1);
      } else {
         cva var5 = this.b;
         ColorStateList var7 = var5.c;
         boolean var2 = false;
         if (var7 != null) {
            Mode var6 = var5.d;
            if (var6 != null) {
               this.d = this.b(var7, var6);
               this.invalidateSelf();
               var2 = true;
            }
         }

         if (var5.b()) {
            boolean var3 = var5.b.d.c(var1);
            var5.k |= var3;
            if (var3) {
               this.invalidateSelf();
               return true;
            }
         }

         return var2;
      }
   }

   public final void scheduleSelf(Runnable var1, long var2) {
      Drawable var4 = this.e;
      if (var4 != null) {
         var4.scheduleSelf(var1, var2);
      } else {
         super.scheduleSelf(var1, var2);
      }
   }

   public final void setAlpha(int var1) {
      Drawable var2 = this.e;
      if (var2 != null) {
         var2.setAlpha(var1);
      } else {
         if (this.b.b.getRootAlpha() != var1) {
            this.b.b.setRootAlpha(var1);
            this.invalidateSelf();
         }

      }
   }

   public final void setAutoMirrored(boolean var1) {
      Drawable var2 = this.e;
      if (var2 != null) {
         cdl.d(var2, var1);
      } else {
         this.b.e = var1;
      }
   }

   public final void setColorFilter(ColorFilter var1) {
      Drawable var2 = this.e;
      if (var2 != null) {
         var2.setColorFilter(var1);
      } else {
         this.f = var1;
         this.invalidateSelf();
      }
   }

   public final void setTint(int var1) {
      Drawable var2 = this.e;
      if (var2 != null) {
         cdm.f(var2, var1);
      } else {
         this.setTintList(ColorStateList.valueOf(var1));
      }
   }

   public final void setTintList(ColorStateList var1) {
      Drawable var2 = this.e;
      if (var2 != null) {
         cdm.g(var2, var1);
      } else {
         cva var3 = this.b;
         if (var3.c != var1) {
            var3.c = var1;
            this.d = this.b(var1, var3.d);
            this.invalidateSelf();
         }

      }
   }

   public final void setTintMode(Mode var1) {
      Drawable var2 = this.e;
      if (var2 != null) {
         cdm.h(var2, var1);
      } else {
         cva var3 = this.b;
         if (var3.d != var1) {
            var3.d = var1;
            this.d = this.b(var3.c, var1);
            this.invalidateSelf();
         }

      }
   }

   public final boolean setVisible(boolean var1, boolean var2) {
      Drawable var3 = this.e;
      return var3 != null ? var3.setVisible(var1, var2) : super.setVisible(var1, var2);
   }

   public final void unscheduleSelf(Runnable var1) {
      Drawable var2 = this.e;
      if (var2 != null) {
         var2.unscheduleSelf(var1);
      } else {
         super.unscheduleSelf(var1);
      }
   }
}
