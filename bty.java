import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class bty extends MetricAffectingSpan {
   private final Typeface a;

   public bty(Typeface var1) {
      this.a = var1;
   }

   private final void a(Paint var1) {
      var1.setTypeface(this.a);
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
