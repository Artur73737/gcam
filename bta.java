import android.text.Layout;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.BoringLayout.Metrics;

public final class bta {
   public final CharSequence a;
   public final TextPaint b;
   public float c;
   private final int d;
   private float e;
   private Metrics f;
   private boolean g;

   public bta(CharSequence var1, TextPaint var2, int var3) {
      var1.getClass();
      super();
      this.a = var1;
      this.b = var2;
      this.d = var3;
      this.e = Float.NaN;
      this.c = Float.NaN;
   }

   public final float a() {
      float var1;
      if (!Float.isNaN(this.e)) {
         var1 = this.e;
      } else {
         Metrics var2 = this.b();
         Float var3;
         if (var2 != null) {
            var3 = (float)var2.width;
         } else {
            var3 = null;
         }

         Float var6 = var3;
         if (var3 == null) {
            CharSequence var7 = this.a;
            var6 = (float)Math.ceil((double)Layout.getDesiredWidth(var7, 0, var7.length(), this.b));
         }

         var1 = var6;
         CharSequence var5 = this.a;
         TextPaint var4 = this.b;
         var3 = var6;
         if (var1 != 0.0F) {
            label39: {
               label30: {
                  if (var5 instanceof Spanned) {
                     Spanned var8 = (Spanned)var5;
                     if (btb.b(var8, bts.class) || btb.b(var8, btr.class)) {
                        break label30;
                     }
                  }

                  var3 = var6;
                  if (var4.getLetterSpacing() == 0.0F) {
                     break label39;
                  }
               }

               var3 = var6 + 0.5F;
            }
         }

         var1 = var3;
         this.e = var1;
      }

      return var1;
   }

   public final Metrics b() {
      if (!this.g) {
         TextDirectionHeuristic var2 = btl.b(this.d);
         CharSequence var3 = this.a;
         TextPaint var1 = this.b;
         var2.getClass();
         this.f = bsv.a(var3, var1, var2);
         this.g = true;
      }

      return this.f;
   }
}
