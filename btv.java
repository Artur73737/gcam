import android.text.TextPaint;
import android.text.style.CharacterStyle;

public final class btv extends CharacterStyle {
   private final int a;
   private final float b;
   private final float c;
   private final float d;

   public btv(int var1, float var2, float var3, float var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public final void updateDrawState(TextPaint var1) {
      var1.getClass();
      var1.setShadowLayer(this.d, this.b, this.c, this.a);
   }
}
