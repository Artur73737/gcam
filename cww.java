import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.util.ArrayList;

public class cww extends FrameLayout {
   final ArrayList a;
   private final Context b;
   private cwv c;
   private final AmbientMode$AmbientController d;

   public cww(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public cww(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public cww(Context var1, AttributeSet var2, int var3) {
      this(var1, var2, var3, 0);
   }

   public cww(Context var1, AttributeSet var2, int var3, int var4) {
      super(var1, var2, var3, var4);
      this.c = null;
      AmbientMode$AmbientController var8 = new AmbientMode$AmbientController(this);
      this.d = var8;
      this.a = new ArrayList();
      this.b = var1;
      TypedArray var6 = var1.obtainStyledAttributes(new int[]{16843763});
      var3 = var6.getIndexCount();
      boolean var5 = false;
      if (var3 > 0) {
         var5 = var6.getBoolean(0, true);
      }

      var6.recycle();
      cwv var7;
      if (var5) {
         if (this.c == null) {
            var7 = new cwv(var1, this);
            this.c = var7;
            var7.n = var8;
            return;
         }
      } else {
         var7 = this.c;
         if (var7 != null) {
            var7.n = null;
            this.c = null;
         }
      }

   }

   protected void a() {
      cwn.b(this);
   }

   protected void b() {
      cwn.b(this);
   }

   protected void c() {
      cwn.b(this);
   }

   public final boolean canScrollHorizontally(int var1) {
      cwv var2 = this.c;
      if (var2 != null) {
         return var1 < 0 && var2.a.getVisibility() == 0;
      } else {
         return super.canScrollHorizontally(var1);
      }
   }

   public final boolean onInterceptTouchEvent(MotionEvent var1) {
      cwv var9 = this.c;
      if (var9 == null) {
         return super.onInterceptTouchEvent(var1);
      } else {
         var9.a(var1);
         boolean var8 = var9.m;
         boolean var7 = true;
         if (!var8) {
            float var2 = var1.getRawX() - var1.getX();
            var1.offsetLocation(var2, 0.0F);
            int var6;
            switch(var1.getActionMasked()) {
            case 0:
               var9.b();
               var9.g = var1.getRawX();
               var9.h = var1.getRawY();
               var9.f = var1.getPointerId(0);
               var9.e.f = VelocityTracker.obtain();
               var9.e.f.addMovement(var1);
               break;
            case 1:
            case 3:
               var9.b();
               break;
            case 2:
               if (var9.e.f != null && !var9.l) {
                  var6 = var1.findPointerIndex(var9.f);
                  if (var6 == -1) {
                     Log.e("SwipeDismissController", "Invalid pointer index: ignoring.");
                     var9.l = true;
                  } else {
                     float var3 = var1.getRawX() - var9.g;
                     float var5 = var1.getX(var6);
                     float var4 = var1.getY(var6);
                     if (var3 != 0.0F && var9.g >= var9.d && var9.d(var9.a, false, var3, var5, var4)) {
                        var9.l = true;
                     } else {
                        var9.c(var1);
                     }
                  }
               }
            case 4:
            default:
               break;
            case 5:
               var9.f = var1.getPointerId(var1.getActionIndex());
               break;
            case 6:
               var6 = var1.getActionIndex();
               if (var1.getPointerId(var6) == var9.f) {
                  byte var10;
                  if (var6 == 0) {
                     var10 = 1;
                  } else {
                     var10 = 0;
                  }

                  var9.f = var1.getPointerId(var10);
               }
            }

            var1.offsetLocation(-var2, 0.0F);
            if (!var9.l && var9.j) {
               return true;
            }

            var7 = false;
         }

         return var7;
      }
   }

   public final boolean onTouchEvent(MotionEvent var1) {
      cwv var6 = this.c;
      if (var6 != null) {
         var6.a(var1);
         if (var6.m) {
            return true;
         }

         if (var6.e.f != null) {
            float var3 = var1.getRawX() - var1.getX();
            var1.offsetLocation(var3, 0.0F);
            float var2;
            float var4;
            cxd var7;
            switch(var1.getActionMasked()) {
            case 1:
               var4 = var1.getRawX() - var6.g;
               VelocityTracker var11 = var6.e.f;
               var11.computeCurrentVelocity(1000);
               var2 = var11.getXVelocity();
               float var5 = var11.getYVelocity();
               if (var6.i == -2.14748365E9F) {
                  var2 = var4 / ((float)(var1.getEventTime() - var1.getDownTime()) / 1000.0F);
               }

               if (!var6.k && (var4 > (float)var6.a.getWidth() * 0.33F && var1.getRawX() >= var6.i || var2 >= (float)var6.c && var2 > Math.abs(var5))) {
                  var6.k = true;
               }

               if (var6.k && var6.j && var2 < (float)(-var6.c)) {
                  var6.k = false;
               }
            case 3:
               AmbientMode$AmbientController var13;
               if (var6.k) {
                  var7 = var6.e;
                  var13 = var6.n;
                  if (var7.f == null) {
                     var7.f = VelocityTracker.obtain();
                  }

                  var7.f.computeCurrentVelocity(1000);
                  if (var13 != null) {
                     ((cww)var13.a).c();
                  }

                  var7.l = var7.b(var7.h, (float)var7.b, var7.f.getXVelocity(), new cxa(var7, 1), new cxb(var7, var13, 1));
               } else if (var6.j && var6.i != -2.14748365E9F) {
                  var7 = var6.e;
                  var13 = var6.n;
                  var7.f.computeCurrentVelocity(1000);
                  var7.m = var7.b(var7.h, 0.0F, var7.f.getXVelocity(), new cxa(var7, 0), new cxb(var7, var13, 0));
               }

               var6.b();
               break;
            case 2:
               var6.e.f.addMovement(var1);
               var6.i = var1.getRawX();
               var6.c(var1);
               if (var6.j) {
                  var7 = var6.e;
                  var2 = var1.getRawX();
                  var4 = var6.g;
                  if (!var7.g) {
                     var7.g = true;
                     ViewGroup var8 = var7.a();
                     if (var8 != null) {
                        if (var7.n == null) {
                           var7.n = var8.getBackground();
                        }

                        Drawable var9 = var7.n;
                        Object var10;
                        if (var9 != null) {
                           var10 = new LayerDrawable(new Drawable[]{var9, var7.c});
                        } else {
                           var10 = var7.c;
                        }

                        var8.setBackground((Drawable)var10);
                        var7.e.setColorFilter((ColorFilter)null);
                        var7.a.setLayerType(2, var7.e);
                        cww var12 = var7.a;
                        var12.setOutlineProvider(new cxc(var7.d));
                        var12.setClipToOutline(true);
                     }
                  }

                  var7.f.addMovement(var1);
                  var2 = (var2 - var4) / (float)var7.a.getWidth();
                  var7.j = var2;
                  var2 = var2 * -0.3F + 1.0F;
                  var7.i = var2;
                  var7.h = Math.max(0.0F, 1.0F - var2) * (float)var7.a.getWidth() / 2.0F;
                  var7.k = Math.min(0.3F, var7.j / 2.0F);
                  var7.e();
               }
            }

            var1.offsetLocation(-var3, 0.0F);
            return true;
         }
      }

      return super.onTouchEvent(var1);
   }

   public final void requestDisallowInterceptTouchEvent(boolean var1) {
      cwv var2 = this.c;
      if (var2 != null) {
         if (var2.a.getParent() != null) {
            var2.a.getParent().requestDisallowInterceptTouchEvent(var1);
         }

      } else {
         super.requestDisallowInterceptTouchEvent(var1);
      }
   }
}
