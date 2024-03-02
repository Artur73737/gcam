import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillManager.AutofillCallback;

public final class bbi extends AutofillCallback {
   public static final bbi a = new bbi();

   private bbi() {
   }

   public final void a(bbf var1) {
      var1.getClass();
      ((AutofillManager)var1.c).registerCallback(this);
   }

   public final void b(bbf var1) {
      var1.getClass();
      ((AutofillManager)var1.c).unregisterCallback(this);
   }

   public final void onAutofillEvent(View var1, int var2, int var3) {
      var1.getClass();
      super.onAutofillEvent(var1, var2, var3);
   }
}
