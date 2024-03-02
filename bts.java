import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class bts extends MetricAffectingSpan {
   private final float a;

   public bts(float var1) {
      this.a = var1;
   }

   private final void a(TextPaint var1) {
      float var2 = var1.getTextSize() * var1.getTextScaleX();
      if (var2 != 0.0F) {
         var1.setLetterSpacing(this.a / var2);
      }
   }

   public final void updateDrawState(TextPaint var1) {
      var1.getClass();
      this.a(var1);
   }

   public final void updateMeasureState(TextPaint var1) {
      var1.getClass();
      this.a(var1);
   }
}
