import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class bto extends MetricAffectingSpan {
   private final String a;

   public bto(String var1) {
      this.a = var1;
   }

   public final void updateDrawState(TextPaint var1) {
      var1.getClass();
      var1.setFontFeatureSettings(this.a);
   }

   public final void updateMeasureState(TextPaint var1) {
      var1.getClass();
      var1.setFontFeatureSettings(this.a);
   }
}
