import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Paint.Style;
import android.graphics.Shader.TileMode;

public final class cwt {
   public final float a;
   public final float b;
   public float c;
   private final int[] d = new int[]{-16777216, 0};
   private final float[] e = new float[]{0.6F, 1.0F};
   private final RectF f = new RectF();
   private final Paint g;
   private float h;
   private final float i;

   public cwt(float var1, float var2, float var3) {
      Paint var4 = new Paint();
      this.g = var4;
      this.a = var1;
      this.b = 0.0F;
      this.c = var2;
      this.i = var3;
      this.h = var2 + var3 + var1 * 0.0F;
      var4.setColor(-16777216);
      var4.setStyle(Style.FILL);
      var4.setAntiAlias(true);
      this.b();
   }

   public final void a(int var1, int var2, int var3, int var4) {
      this.f.set((float)var1, (float)var2, (float)var3, (float)var4);
      this.b();
   }

   public final void b() {
      float var1 = this.c + this.i + this.a * 0.0F;
      this.h = var1;
      if (var1 > 0.0F) {
         this.g.setShader(new RadialGradient(this.f.centerX(), this.f.centerY(), this.h, this.d, this.e, TileMode.MIRROR));
      }

   }
}
