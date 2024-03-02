import android.text.Editable;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

public final class ckc extends InputConnectionWrapper {
   private final TextView a;

   public ckc(TextView var1, InputConnection var2) {
      super(var2, false);
      this.a = var1;
      cjx var3 = cjx.a;
   }

   private final Editable a() {
      return this.a.getEditableText();
   }

   public final boolean deleteSurroundingText(int var1, int var2) {
      return cim.d(this, this.a(), var1, var2, false) || super.deleteSurroundingText(var1, var2);
   }

   public final boolean deleteSurroundingTextInCodePoints(int var1, int var2) {
      return cim.d(this, this.a(), var1, var2, true) || super.deleteSurroundingTextInCodePoints(var1, var2);
   }
}
