import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;

public class cdt extends Drawable {
   final Bitmap a;
   public final Paint b = new Paint(3);
   public final BitmapShader c;
   public float d;
   final Rect e = new Rect();
   private int f = 160;
   private final int g = 119;
   private final Matrix h = new Matrix();
   private final RectF i = new RectF();
   private boolean j = true;
   private final int k;
   private final int l;

   public cdt(Resources var1, Bitmap var2) {
      if (var1 != null) {
         this.f = var1.getDisplayMetrics().densityDpi;
      }

      this.a = var2;
      BitmapShader var3;
      if (var2 != null) {
         this.k = var2.getScaledWidth(this.f);
         this.l = var2.getScaledHeight(this.f);
         var3 = new BitmapShader(var2, TileMode.CLAMP, TileMode.CLAMP);
      } else {
         this.l = -1;
         this.k = -1;
         var3 = null;
      }

      this.c = var3;
   }

   public static boolean c(float var0) {
      return var0 > 0.05F;
   }

   public void a(int var1, int var2, int var3, Rect var4, Rect var5) {
      throw null;
   }

   final void b() {
      if (this.j) {
         this.a(this.g, this.k, this.l, this.getBounds(), this.e);
         this.i.set(this.e);
         if (this.c != null) {
            this.h.setTranslate(this.i.left, this.i.top);
            this.h.preScale(this.i.width() / (float)this.a.getWidth(), this.i.height() / (float)this.a.getHeight());
            this.c.setLocalMatrix(this.h);
            this.b.setShader(this.c);
         }

         this.j = false;
      }

   }

   public final void draw(Canvas var1) {
      Bitmap var3 = this.a;
      if (var3 != null) {
         this.b();
         if (this.b.getShader() == null) {
            var1.drawBitmap(var3, (Rect)null, this.e, this.b);
         } else {
            RectF var4 = this.i;
            float var2 = this.d;
            var1.drawRoundRect(var4, var2, var2, this.b);
         }
      }
   }

   public final int getAlpha() {
      return this.b.getAlpha();
   }

   public final ColorFilter getColorFilter() {
      return this.b.getColorFilter();
   }

   public final int getIntrinsicHeight() {
      return this.l;
   }

   public final int getIntrinsicWidth() {
      return this.k;
   }

   public final int getOpacity() {
      if (this.g == 119) {
         Bitmap var1 = this.a;
         if (var1 != null && !var1.hasAlpha() && this.b.getAlpha() >= 255 && !c(this.d)) {
            return -1;
         }
      }

      return -3;
   }

   protected final void onBoundsChange(Rect var1) {
      super.onBoundsChange(var1);
      this.j = true;
   }

   public final void setAlpha(int var1) {
      if (var1 != this.b.getAlpha()) {
         this.b.setAlpha(var1);
         this.invalidateSelf();
      }

   }

   public final void setColorFilter(ColorFilter var1) {
      this.b.setColorFilter(var1);
      this.invalidateSelf();
   }

   public final void setDither(boolean var1) {
      this.b.setDither(var1);
      this.invalidateSelf();
   }

   public final void setFilterBitmap(boolean var1) {
      this.b.setFilterBitmap(var1);
      this.invalidateSelf();
   }
}
