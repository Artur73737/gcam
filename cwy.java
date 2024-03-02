import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.animation.LinearInterpolator;

public final class cwy extends Drawable {
   private static final Property b = new cwx(Integer.class);
   private static final TimeInterpolator c;
   public final ObjectAnimator a;
   private final RectF d = new RectF();
   private final Paint e;

   static {
      c = cwp.a;
   }

   public cwy() {
      Paint var1 = new Paint();
      this.e = var1;
      var1.setAntiAlias(true);
      var1.setStyle(Style.STROKE);
      ObjectAnimator var2 = ObjectAnimator.ofInt(this, b, new int[]{0, 10000});
      this.a = var2;
      var2.setRepeatCount(-1);
      var2.setRepeatMode(1);
      var2.setDuration(6000L);
      var2.setInterpolator(new LinearInterpolator());
   }

   private static float a(float var0, float var1, float var2) {
      return var0 != var1 ? (var2 - var0) / (var1 - var0) : 0.0F;
   }

   public final void draw(Canvas var1) {
      var1.save();
      this.d.set(this.getBounds());
      this.d.inset(0.0F, 0.0F);
      this.e.setStrokeWidth(0.0F);
      Paint var9 = this.e;
      boolean var7 = false;
      var9.setColor(0);
      int var8 = this.getLevel();
      float var3 = (float)(var8 - var8 / 2000 * 2000) / 2000.0F;
      if (var3 < 0.5F) {
         var7 = true;
      }

      float var2;
      if (var7) {
         var2 = a(0.0F, 0.5F, var3);
         var2 = c.getInterpolation(var2) * 306.0F;
      } else {
         var2 = a(0.5F, 1.0F, var3);
         var2 = (1.0F - c.getInterpolation(var2)) * 306.0F;
      }

      float var4 = Math.max(1.0F, var2);
      float var6 = (float)var8;
      var2 = this.d.centerX();
      float var5 = this.d.centerY();
      var6 *= 1.0E-4F;
      var1.rotate((var6 + var6) * 360.0F - 90.0F + var3 * 54.0F, var2, var5);
      RectF var10 = this.d;
      if (var7) {
         var2 = 0.0F;
      } else {
         var2 = 306.0F - var4;
      }

      var1.drawArc(var10, var2, var4, false, this.e);
      var1.restore();
   }

   public final int getOpacity() {
      return -1;
   }

   protected final boolean onLevelChange(int var1) {
      return true;
   }

   public final void setAlpha(int var1) {
   }

   public final void setColorFilter(ColorFilter var1) {
   }
}
