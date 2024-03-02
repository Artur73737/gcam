import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;

public final class aqp extends View {
   public static final int[] a = new int[0];
   private static final int[] f = new int[]{16842919, 16842910};
   public aqy b;
   public Boolean c;
   public Runnable d;
   public qvi e;
   private Long g;

   public aqp(Context var1) {
      super(var1);
   }

   public final void a() {
      this.e = null;
      Runnable var1 = this.d;
      aqy var2;
      if (var1 != null) {
         this.removeCallbacks(var1);
         var1 = this.d;
         var1.getClass();
         var1.run();
      } else {
         var2 = this.b;
         if (var2 != null) {
            var2.setState(a);
         }
      }

      var2 = this.b;
      if (var2 != null) {
         var2.setVisible(false, false);
         this.unscheduleDrawable(var2);
      }
   }

   public final void b(boolean var1) {
      long var4 = AnimationUtils.currentAnimationTimeMillis();
      Runnable var6 = this.d;
      if (var6 != null) {
         this.removeCallbacks(var6);
         var6.run();
      }

      Long var8 = this.g;
      long var2;
      if (var8 != null) {
         var2 = var8;
      } else {
         var2 = 0L;
      }

      label23: {
         int[] var9;
         if (!var1) {
            if (var4 - var2 < 5L) {
               nj var10 = new nj(this, 7);
               this.d = var10;
               this.postDelayed(var10, 50L);
               break label23;
            }

            var9 = a;
         } else {
            var9 = f;
         }

         aqy var7 = this.b;
         if (var7 != null) {
            var7.setState(var9);
         }
      }

      this.g = var4;
   }

   public final void c(long var1, int var3, long var4, float var6) {
      aqy var7 = this.b;
      if (var7 != null) {
         Integer var8 = var7.b;
         if (var8 == null || var8 != var3) {
            var7.b = var3;
            aqx.a.a(var7, var3);
         }

         var4 = bcy.i(var4, qxb.i(var6, 1.0F));
         bcy var9 = var7.a;
         if (var9 == null || !c.o(var9.g, var4)) {
            var7.a = bcy.f(var4);
            var7.setColor(ColorStateList.valueOf(bcq.h(var4)));
         }

         Rect var10 = new Rect(0, 0, qxg.e(bcl.c(var1)), qxg.e(bcl.a(var1)));
         this.setLeft(var10.left);
         this.setTop(var10.top);
         this.setRight(var10.right);
         this.setBottom(var10.bottom);
         var7.setBounds(var10);
      }
   }

   public final void invalidateDrawable(Drawable var1) {
      var1.getClass();
      qvi var2 = this.e;
      if (var2 != null) {
         var2.a();
      }

   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
   }

   protected final void onMeasure(int var1, int var2) {
      this.setMeasuredDimension(0, 0);
   }

   public final void refreshDrawableState() {
   }
}
