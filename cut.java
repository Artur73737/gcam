import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public final class cut extends cuu implements Animatable {
   public final cuq a;
   public AnimatorListener b;
   public ArrayList c;
   public final Callback d;
   private final Context f;

   public cut() {
      this((Context)null);
   }

   public cut(Context var1) {
      this.b = null;
      this.c = null;
      this.d = new cwr(this, 1);
      this.f = var1;
      this.a = new cuq();
   }

   public final void applyTheme(Theme var1) {
      Drawable var2 = this.e;
      if (var2 != null) {
         cdm.b(var2, var1);
      }

   }

   public final boolean canApplyTheme() {
      Drawable var1 = this.e;
      return var1 != null ? cdm.i(var1) : false;
   }

   public final void draw(Canvas var1) {
      Drawable var2 = this.e;
      if (var2 != null) {
         var2.draw(var1);
      } else {
         this.a.b.draw(var1);
         if (this.a.c.isStarted()) {
            this.invalidateSelf();
         }

      }
   }

   public final int getAlpha() {
      Drawable var1 = this.e;
      return var1 != null ? cdl.a(var1) : this.a.b.getAlpha();
   }

   public final int getChangingConfigurations() {
      Drawable var3 = this.e;
      if (var3 != null) {
         return var3.getChangingConfigurations();
      } else {
         int var1 = super.getChangingConfigurations();
         int var2 = this.a.a;
         return var1;
      }
   }

   public final ColorFilter getColorFilter() {
      Drawable var1 = this.e;
      return var1 != null ? cdm.a(var1) : this.a.b.getColorFilter();
   }

   public final ConstantState getConstantState() {
      Drawable var1 = this.e;
      return var1 != null ? new cur(var1.getConstantState()) : null;
   }

   public final int getIntrinsicHeight() {
      Drawable var1 = this.e;
      return var1 != null ? var1.getIntrinsicHeight() : this.a.b.getIntrinsicHeight();
   }

   public final int getIntrinsicWidth() {
      Drawable var1 = this.e;
      return var1 != null ? var1.getIntrinsicWidth() : this.a.b.getIntrinsicWidth();
   }

   public final int getOpacity() {
      Drawable var1 = this.e;
      return var1 != null ? var1.getOpacity() : this.a.b.getOpacity();
   }

   public final void inflate(Resources var1, XmlPullParser var2, AttributeSet var3) {
      this.inflate(var1, var2, var3, (Theme)null);
   }

   public final void inflate(Resources var1, XmlPullParser var2, AttributeSet var3, Theme var4) {
      Drawable var7 = this.e;
      if (var7 != null) {
         cdm.c(var7, var1, var2, var3, var4);
      } else {
         int var5 = var2.getEventType();

         for(int var6 = var2.getDepth(); var5 != 1 && (var2.getDepth() >= var6 + 1 || var5 != 3); var5 = var2.next()) {
            if (var5 == 2) {
               String var12 = var2.getName();
               if ("animated-vector".equals(var12)) {
                  TypedArray var13 = cbo.i(var1, var4, var3, cum.e);
                  var5 = var13.getResourceId(0, 0);
                  if (var5 != 0) {
                     cvc var8 = new cvc();
                     var8.e = ccx.a(var1, var5, var4);
                     var8.c = false;
                     var8.setCallback(this.d);
                     cvc var9 = this.a.b;
                     if (var9 != null) {
                        var9.setCallback((Callback)null);
                     }

                     this.a.b = var8;
                  }

                  var13.recycle();
               } else if ("target".equals(var12)) {
                  TypedArray var14 = var1.obtainAttributes(var3, cum.f);
                  var12 = var14.getString(0);
                  var5 = var14.getResourceId(1, 0);
                  if (var5 != 0) {
                     Context var15 = this.f;
                     if (var15 == null) {
                        var14.recycle();
                        throw new IllegalStateException("Context can't be null when inflating animators");
                     }

                     Animator var10 = AnimatorInflater.loadAnimator(var15, var5);
                     var10.setTarget(this.a.b.b.b.l.get(var12));
                     cuq var16 = this.a;
                     if (var16.d == null) {
                        var16.d = new ArrayList();
                        this.a.e = new xh();
                     }

                     this.a.d.add(var10);
                     this.a.e.put(var10, var12);
                  }

                  var14.recycle();
               }
            }
         }

         cuq var11 = this.a;
         if (var11.c == null) {
            var11.c = new AnimatorSet();
         }

         var11.c.playTogether(var11.d);
      }
   }

   public final boolean isAutoMirrored() {
      Drawable var1 = this.e;
      return var1 != null ? cdl.e(var1) : this.a.b.isAutoMirrored();
   }

   public final boolean isRunning() {
      Drawable var1 = this.e;
      return var1 != null ? ((AnimatedVectorDrawable)var1).isRunning() : this.a.c.isRunning();
   }

   public final boolean isStateful() {
      Drawable var1 = this.e;
      return var1 != null ? var1.isStateful() : this.a.b.isStateful();
   }

   public final Drawable mutate() {
      Drawable var1 = this.e;
      if (var1 != null) {
         var1.mutate();
      }

      return this;
   }

   protected final void onBoundsChange(Rect var1) {
      Drawable var2 = this.e;
      if (var2 != null) {
         var2.setBounds(var1);
      } else {
         this.a.b.setBounds(var1);
      }
   }

   protected final boolean onLevelChange(int var1) {
      Drawable var2 = this.e;
      return var2 != null ? var2.setLevel(var1) : this.a.b.setLevel(var1);
   }

   protected final boolean onStateChange(int[] var1) {
      Drawable var2 = this.e;
      return var2 != null ? var2.setState(var1) : this.a.b.setState(var1);
   }

   public final void setAlpha(int var1) {
      Drawable var2 = this.e;
      if (var2 != null) {
         var2.setAlpha(var1);
      } else {
         this.a.b.setAlpha(var1);
      }
   }

   public final void setAutoMirrored(boolean var1) {
      Drawable var2 = this.e;
      if (var2 != null) {
         cdl.d(var2, var1);
      } else {
         this.a.b.setAutoMirrored(var1);
      }
   }

   public final void setColorFilter(ColorFilter var1) {
      Drawable var2 = this.e;
      if (var2 != null) {
         var2.setColorFilter(var1);
      } else {
         this.a.b.setColorFilter(var1);
      }
   }

   public final void setTint(int var1) {
      Drawable var2 = this.e;
      if (var2 != null) {
         cdm.f(var2, var1);
      } else {
         this.a.b.setTint(var1);
      }
   }

   public final void setTintList(ColorStateList var1) {
      Drawable var2 = this.e;
      if (var2 != null) {
         cdm.g(var2, var1);
      } else {
         this.a.b.setTintList(var1);
      }
   }

   public final void setTintMode(Mode var1) {
      Drawable var2 = this.e;
      if (var2 != null) {
         cdm.h(var2, var1);
      } else {
         this.a.b.setTintMode(var1);
      }
   }

   public final boolean setVisible(boolean var1, boolean var2) {
      Drawable var3 = this.e;
      if (var3 != null) {
         return var3.setVisible(var1, var2);
      } else {
         this.a.b.setVisible(var1, var2);
         return super.setVisible(var1, var2);
      }
   }

   public final void start() {
      Drawable var1 = this.e;
      if (var1 != null) {
         ((AnimatedVectorDrawable)var1).start();
      } else if (!this.a.c.isStarted()) {
         this.a.c.start();
         this.invalidateSelf();
      }
   }

   public final void stop() {
      Drawable var1 = this.e;
      if (var1 != null) {
         ((AnimatedVectorDrawable)var1).stop();
      } else {
         this.a.c.end();
      }
   }
}
