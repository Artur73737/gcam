import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class btn extends MetricAffectingSpan {
   public final void updateDrawState(TextPaint var1) {
      var1.getClass();
      var1.baselineShift += (int)((float)Math.ceil((double)(var1.ascent() * 0.0F)));
   }

   public final void updateMeasureState(TextPaint var1) {
      var1.getClass();
      var1.baselineShift += (int)((float)Math.ceil((double)(var1.ascent() * 0.0F)));
   }
}
