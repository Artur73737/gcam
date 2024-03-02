import android.graphics.PathEffect;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

public final class bwq extends CharacterStyle implements UpdateAppearance {
   private final gf a;

   public bwq(gf var1) {
      this.a = var1;
   }

   public final void updateDrawState(TextPaint var1) {
      if (var1 != null) {
         gf var3 = this.a;
         if (c.E(var3, bex.a)) {
            var1.setStyle(Style.FILL);
            return;
         }

         if (var3 instanceof bey) {
            var1.setStyle(Style.STROKE);
            var1.setStrokeWidth(((bey)this.a).a);
            var1.setStrokeMiter(((bey)this.a).b);
            int var2 = ((bey)this.a).d;
            Join var4;
            if (c.n(var2, 0)) {
               var4 = Join.MITER;
            } else if (c.n(var2, 1)) {
               var4 = Join.ROUND;
            } else if (c.n(var2, 2)) {
               var4 = Join.BEVEL;
            } else {
               var4 = Join.MITER;
            }

            var1.setStrokeJoin(var4);
            var2 = ((bey)this.a).c;
            Cap var5;
            if (c.n(var2, 0)) {
               var5 = Cap.BUTT;
            } else if (c.n(var2, 1)) {
               var5 = Cap.ROUND;
            } else if (c.n(var2, 2)) {
               var5 = Cap.SQUARE;
            } else {
               var5 = Cap.BUTT;
            }

            var1.setStrokeCap(var5);
            bey var6 = (bey)this.a;
            var1.setPathEffect((PathEffect)null);
         }
      }

   }
}
