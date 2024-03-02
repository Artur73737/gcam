import android.text.TextPaint;
import android.text.style.CharacterStyle;

public final class btx extends CharacterStyle {
   private final boolean a;
   private final boolean b;

   public btx(boolean var1, boolean var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void updateDrawState(TextPaint var1) {
      var1.getClass();
      var1.setUnderlineText(this.a);
      var1.setStrikeThruText(this.b);
   }
}
