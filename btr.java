import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class btr extends MetricAffectingSpan {
   private final float a;

   public btr(float var1) {
      this.a = var1;
   }

   public final void updateDrawState(TextPaint var1) {
      var1.getClass();
      var1.setLetterSpacing(this.a);
   }

   public final void updateMeasureState(TextPaint var1) {
      var1.getClass();
      var1.setLetterSpacing(this.a);
   }
}
