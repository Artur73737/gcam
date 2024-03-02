import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;

public final class bbh {
   public static final bbh a = new bbh();

   private bbh() {
   }

   public final AutofillId a(ViewStructure var1) {
      var1.getClass();
      return var1.getAutofillId();
   }

   public final CharSequence b(AutofillValue var1) {
      var1.getClass();
      CharSequence var2 = var1.getTextValue();
      var2.getClass();
      return var2;
   }

   public final void c(ViewStructure var1, String[] var2) {
      var1.getClass();
      var2.getClass();
      var1.setAutofillHints(var2);
   }

   public final void d(ViewStructure var1, AutofillId var2, int var3) {
      var1.getClass();
      var2.getClass();
      var1.setAutofillId(var2, var3);
   }

   public final void e(ViewStructure var1, int var2) {
      var1.getClass();
      var1.setAutofillType(var2);
   }

   public final boolean f(AutofillValue var1) {
      var1.getClass();
      return var1.isDate();
   }

   public final boolean g(AutofillValue var1) {
      var1.getClass();
      return var1.isList();
   }

   public final boolean h(AutofillValue var1) {
      var1.getClass();
      return var1.isText();
   }

   public final boolean i(AutofillValue var1) {
      var1.getClass();
      return var1.isToggle();
   }
}
