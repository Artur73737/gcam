import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public final class ckg implements TextWatcher {
   public boolean a;
   private final EditText b;

   public ckg(EditText var1) {
      this.b = var1;
      this.a = true;
   }

   public final void afterTextChanged(Editable var1) {
   }

   public final void beforeTextChanged(CharSequence var1, int var2, int var3, int var4) {
   }

   public final void onTextChanged(CharSequence var1, int var2, int var3, int var4) {
      if (!this.b.isInEditMode() && this.a) {
         cjx var5 = cjx.a;
      }

   }
}
