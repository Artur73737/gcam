import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class btw extends MetricAffectingSpan {
   public final void updateDrawState(TextPaint var1) {
      var1.getClass();
      var1.setTextSkewX(var1.getTextSkewX() + 0.0F);
   }

   public final void updateMeasureState(TextPaint var1) {
      var1.getClass();
      var1.setTextSkewX(var1.getTextSkewX() + 0.0F);
   }
}
