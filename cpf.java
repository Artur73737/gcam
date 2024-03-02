import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

public final class cpf extends cpu {
   public EditText af;
   public final Runnable ag = new nj(this, 15, (byte[])null);
   public long ah = -1L;
   private CharSequence ai;

   private final EditTextPreference E() {
      return (EditTextPreference)this.D();
   }

   public final void A(boolean var1) {
      if (var1) {
         String var3 = this.af.getText().toString();
         EditTextPreference var2 = this.E();
         if (var2.W(var3)) {
            var2.i(var3);
         }
      }

   }

   protected final boolean B() {
      return true;
   }

   public final void C() {
      this.ah = -1L;
   }

   public final void onCreate(Bundle var1) {
      super.onCreate(var1);
      if (var1 == null) {
         this.ai = this.E().g;
      } else {
         this.ai = var1.getCharSequence("EditTextPreferenceDialogFragment.text");
      }
   }

   public final void onSaveInstanceState(Bundle var1) {
      super.onSaveInstanceState(var1);
      var1.putCharSequence("EditTextPreferenceDialogFragment.text", this.ai);
   }

   protected final void z(View var1) {
      super.z(var1);
      EditText var2 = (EditText)var1.findViewById(16908291);
      this.af = var2;
      if (var2 != null) {
         var2.requestFocus();
         this.af.setText(this.ai);
         var2 = this.af;
         var2.setSelection(var2.getText().length());
         this.E();
      } else {
         throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
      }
   }
}
