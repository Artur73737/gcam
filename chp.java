import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class chp extends ClickableSpan {
   private final int a;
   private final cht b;
   private final int c;

   public chp(int var1, cht var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public final void onClick(View var1) {
      Bundle var4 = new Bundle();
      var4.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
      cht var3 = this.b;
      int var2 = this.c;
      var3.a.performAction(var2, var4);
   }
}
