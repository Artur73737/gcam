import android.graphics.Paint.FontMetricsInt;
import android.text.style.LineHeightSpan;

public final class btt implements LineHeightSpan {
   public final float a;
   public final boolean b;
   public final float c;
   public int d;
   public int e;
   private final int f;
   private final boolean g;
   private int h;
   private int i;
   private int j;
   private int k;

   public btt(float var1, int var2, boolean var3, boolean var4, float var5) {
      this.a = var1;
      this.f = var2;
      this.g = var3;
      this.b = var4;
      this.c = var5;
      this.h = Integer.MIN_VALUE;
      this.i = Integer.MIN_VALUE;
      this.j = Integer.MIN_VALUE;
      this.k = Integer.MIN_VALUE;
      if ((var5 < 0.0F || !(var5 <= 1.0F)) && var5 != -1.0F) {
         throw new IllegalStateException("topRatio should be in [0..1] range or -1");
      }
   }

   public final void chooseHeight(CharSequence var1, int var2, int var3, int var4, int var5, FontMetricsInt var6) {
      var1.getClass();
      var6.getClass();
      if (bte.b(var6) > 0) {
         boolean var11 = true;
         boolean var9;
         if (var2 == 0) {
            var9 = true;
         } else {
            var9 = false;
         }

         boolean var10;
         if (var3 == this.f) {
            var10 = var11;
         } else {
            var10 = false;
         }

         if (!var9 || !var10 || !this.g || !this.b) {
            if (this.h == Integer.MIN_VALUE) {
               var4 = bte.b(var6);
               var5 = (int)((float)Math.ceil((double)this.a));
               var4 = var5 - var4;
               float var8 = this.c;
               float var7 = var8;
               if (var8 == -1.0F) {
                  var7 = Math.abs((float)var6.ascent) / (float)bte.b(var6);
               }

               if (var4 <= 0) {
                  var4 = (int)((float)Math.ceil((double)((float)var4 * var7)));
               } else {
                  var4 = (int)((float)Math.ceil((double)((float)var4 * (1.0F - var7))));
               }

               var4 += var6.descent;
               this.j = var4;
               var4 -= var5;
               this.i = var4;
               if (this.g) {
                  var4 = var6.ascent;
               }

               this.h = var4;
               if (this.b) {
                  var4 = var6.descent;
               } else {
                  var4 = this.j;
               }

               this.k = var4;
               this.d = var6.ascent - this.h;
               this.e = this.k - var6.descent;
            }

            if (var9) {
               var2 = this.h;
            } else {
               var2 = this.i;
            }

            var6.ascent = var2;
            if (var10) {
               var2 = this.k;
            } else {
               var2 = this.j;
            }

            var6.descent = var2;
         }
      }
   }
}
