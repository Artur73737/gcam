import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;

public abstract class olw extends ProgressBar {
   public final olx a;
   public int b;
   public boolean c = false;
   public final int d = 4;
   private final boolean e;
   private final int f;
   private final Runnable g = new nub(this, 6, (byte[])null);
   private final Runnable h = new nub(this, 7, (byte[])null);
   private final cuo i = new olu(this);
   private final cuo j = new olv(this);

   protected olw(Context var1, AttributeSet var2, int var3, int var4) {
      super(ope.a(var1, var2, var3, 2132084871), var2, var3);
      var1 = this.getContext();
      this.a = this.a(var1, var2);
      TypedArray var5 = oli.a(var1, var2, omx.a, var3, var4);
      var5.getInt(5, -1);
      this.f = Math.min(var5.getInt(3, -1), 1000);
      var5.recycle();
      this.e = true;
   }

   public abstract olx a(Context var1, AttributeSet var2);

   public final omg b() {
      return (omg)super.getProgressDrawable();
   }

   public final omn c() {
      return (omn)super.getIndeterminateDrawable();
   }

   protected final void d(boolean var1) {
      if (this.e) {
         Drawable var3 = this.getCurrentDrawable();
         boolean var2 = this.f();
         ((omk)var3).h(var2, false, var1);
      }
   }

   public final void e() {
      if (this.f > 0) {
         SystemClock.uptimeMillis();
      }

      this.setVisibility(0);
   }

   final boolean f() {
      ViewParent var2;
      if (cga.e(this) && this.getWindowVisibility() == 0) {
         for(Object var1 = this; ((View)var1).getVisibility() == 0; var1 = (View)var2) {
            var2 = ((View)var1).getParent();
            if (var2 == null) {
               if (this.getWindowVisibility() == 0) {
                  return true;
               }
               break;
            }

            if (!(var2 instanceof View)) {
               return true;
            }
         }
      }

      return false;
   }

   public void g(int var1) {
      if (this.isIndeterminate()) {
         if (this.b() != null) {
            this.b = var1;
            this.c = true;
            if (this.c().isVisible() && oik.v(this.getContext().getContentResolver()) != 0.0F) {
               this.c().b.c();
               return;
            }

            this.i.b(this.c());
            return;
         }
      } else {
         super.setProgress(var1);
         if (this.b() != null) {
            this.b().jumpToCurrentState();
            return;
         }
      }

   }

   public final Drawable getCurrentDrawable() {
      Object var1;
      if (this.isIndeterminate()) {
         var1 = this.c();
      } else {
         var1 = this.b();
      }

      return (Drawable)var1;
   }

   public final void invalidate() {
      super.invalidate();
      if (this.getCurrentDrawable() != null) {
         this.getCurrentDrawable().invalidateSelf();
      }

   }

   protected final void onAttachedToWindow() {
      super.onAttachedToWindow();
      if (this.b() != null && this.c() != null) {
         this.c().b.b(this.i);
      }

      if (this.b() != null) {
         this.b().d(this.j);
      }

      if (this.c() != null) {
         this.c().d(this.j);
      }

      if (this.f()) {
         this.e();
      }

   }

   protected final void onDetachedFromWindow() {
      this.removeCallbacks(this.h);
      this.removeCallbacks(this.g);
      ((omk)this.getCurrentDrawable()).j();
      if (this.c() != null) {
         this.c().k(this.j);
         this.c().b.e();
      }

      if (this.b() != null) {
         this.b().k(this.j);
      }

      super.onDetachedFromWindow();
   }

   protected final void onDraw(Canvas var1) {
      synchronized(this){}

      try {
         int var2 = var1.save();
         if (this.getPaddingLeft() != 0 || this.getPaddingTop() != 0) {
            var1.translate((float)this.getPaddingLeft(), (float)this.getPaddingTop());
         }

         if (this.getPaddingRight() != 0 || this.getPaddingBottom() != 0) {
            var1.clipRect(0, 0, this.getWidth() - (this.getPaddingLeft() + this.getPaddingRight()), this.getHeight() - (this.getPaddingTop() + this.getPaddingBottom()));
         }

         this.getCurrentDrawable().draw(var1);
         var1.restoreToCount(var2);
      } finally {
         ;
      }

   }

   protected final void onMeasure(int var1, int var2) {
      synchronized(this){}

      Throwable var10000;
      label938: {
         boolean var3;
         boolean var10001;
         try {
            var3 = this.isIndeterminate();
         } catch (Throwable var115) {
            var10000 = var115;
            var10001 = false;
            break label938;
         }

         oml var4 = null;
         Object var5 = null;
         if (var3) {
            label927: {
               try {
                  if (this.c() == null) {
                     break label927;
                  }
               } catch (Throwable var114) {
                  var10000 = var114;
                  var10001 = false;
                  break label938;
               }

               try {
                  var4 = this.c().a;
               } catch (Throwable var112) {
                  var10000 = var112;
                  var10001 = false;
                  break label938;
               }
            }
         } else {
            label923: {
               label922: {
                  try {
                     if (this.b() != null) {
                        break label922;
                     }
                  } catch (Throwable var113) {
                     var10000 = var113;
                     var10001 = false;
                     break label938;
                  }

                  var4 = (oml)var5;
                  break label923;
               }

               try {
                  var4 = this.b().a;
               } catch (Throwable var111) {
                  var10000 = var111;
                  var10001 = false;
                  break label938;
               }
            }
         }

         if (var4 == null) {
            return;
         }

         label911: {
            try {
               if (var4.b() < 0) {
                  var1 = getDefaultSize(this.getSuggestedMinimumWidth(), var1);
                  break label911;
               }
            } catch (Throwable var110) {
               var10000 = var110;
               var10001 = false;
               break label938;
            }

            try {
               var1 = var4.b() + this.getPaddingLeft() + this.getPaddingRight();
            } catch (Throwable var109) {
               var10000 = var109;
               var10001 = false;
               break label938;
            }
         }

         label900: {
            try {
               if (var4.a() < 0) {
                  var2 = getDefaultSize(this.getSuggestedMinimumHeight(), var2);
                  break label900;
               }
            } catch (Throwable var108) {
               var10000 = var108;
               var10001 = false;
               break label938;
            }

            try {
               var2 = var4.a() + this.getPaddingTop() + this.getPaddingBottom();
            } catch (Throwable var107) {
               var10000 = var107;
               var10001 = false;
               break label938;
            }
         }

         label891:
         try {
            this.setMeasuredDimension(var1, var2);
            return;
         } catch (Throwable var106) {
            var10000 = var106;
            var10001 = false;
            break label891;
         }
      }

      Throwable var116 = var10000;
      throw var116;
   }

   protected final void onVisibilityChanged(View var1, int var2) {
      super.onVisibilityChanged(var1, var2);
      boolean var3;
      if (var2 == 0) {
         var3 = true;
      } else {
         var3 = false;
      }

      this.d(var3);
   }

   protected final void onWindowVisibilityChanged(int var1) {
      super.onWindowVisibilityChanged(var1);
      this.d(false);
   }

   public final void setIndeterminate(boolean var1) {
      synchronized(this){}

      Throwable var10000;
      label488: {
         boolean var2;
         boolean var10001;
         try {
            var2 = this.isIndeterminate();
         } catch (Throwable var59) {
            var10000 = var59;
            var10001 = false;
            break label488;
         }

         if (var1 == var2) {
            return;
         }

         Drawable var3;
         try {
            var3 = this.getCurrentDrawable();
         } catch (Throwable var58) {
            var10000 = var58;
            var10001 = false;
            break label488;
         }

         if (var3 != null) {
            try {
               ((omk)var3).j();
            } catch (Throwable var57) {
               var10000 = var57;
               var10001 = false;
               break label488;
            }
         }

         try {
            super.setIndeterminate(var1);
            var3 = this.getCurrentDrawable();
         } catch (Throwable var56) {
            var10000 = var56;
            var10001 = false;
            break label488;
         }

         if (var3 != null) {
            try {
               var1 = this.f();
               ((omk)var3).h(var1, false, false);
            } catch (Throwable var55) {
               var10000 = var55;
               var10001 = false;
               break label488;
            }
         }

         try {
            if (var3 instanceof omn && this.f()) {
               ((omn)var3).b.d();
            }
         } catch (Throwable var54) {
            var10000 = var54;
            var10001 = false;
            break label488;
         }

         try {
            this.c = false;
         } catch (Throwable var53) {
            var10000 = var53;
            var10001 = false;
            break label488;
         }

         return;
      }

      Throwable var60 = var10000;
      throw var60;
   }

   public final void setIndeterminateDrawable(Drawable var1) {
      if (var1 == null) {
         super.setIndeterminateDrawable((Drawable)null);
      } else if (var1 instanceof omn) {
         ((omk)var1).j();
         super.setIndeterminateDrawable(var1);
      } else {
         throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
      }
   }

   public final void setProgress(int var1) {
      synchronized(this){}

      Throwable var10000;
      label78: {
         boolean var10001;
         boolean var2;
         try {
            var2 = this.isIndeterminate();
         } catch (Throwable var9) {
            var10000 = var9;
            var10001 = false;
            break label78;
         }

         if (var2) {
            return;
         }

         try {
            this.g(var1);
         } catch (Throwable var8) {
            var10000 = var8;
            var10001 = false;
            break label78;
         }

         return;
      }

      Throwable var3 = var10000;
      throw var3;
   }

   public final void setProgressDrawable(Drawable var1) {
      if (var1 == null) {
         super.setProgressDrawable((Drawable)null);
      } else if (var1 instanceof omg) {
         omg var2 = (omg)var1;
         var2.j();
         super.setProgressDrawable(var2);
         var2.setLevel((int)((float)this.getProgress() / (float)this.getMax() * 10000.0F));
      } else {
         throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
      }
   }
}
