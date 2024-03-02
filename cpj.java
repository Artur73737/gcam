import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import androidx.preference.ListPreference;

public final class cpj extends cpu {
   public int af;
   private CharSequence[] ag;
   private CharSequence[] ah;

   private final ListPreference E() {
      return (ListPreference)this.D();
   }

   public final void A(boolean var1) {
      if (var1) {
         int var2 = this.af;
         if (var2 >= 0) {
            String var3 = this.ah[var2].toString();
            ListPreference var4 = this.E();
            if (var4.W(var3)) {
               var4.o(var3);
            }
         }
      }

   }

   protected final void eQ(ee var1) {
      CharSequence[] var5 = this.ag;
      int var2 = this.af;
      eft var4 = new eft(this, 1);
      ea var3 = var1.a;
      var3.n = var5;
      var3.p = var4;
      var3.v = var2;
      var3.u = true;
      var1.h((CharSequence)null, (OnClickListener)null);
   }

   public final void onCreate(Bundle var1) {
      super.onCreate(var1);
      if (var1 == null) {
         ListPreference var2 = this.E();
         if (var2.g != null && var2.h != null) {
            this.af = var2.k(var2.i);
            this.ag = var2.g;
            this.ah = var2.h;
         } else {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
         }
      } else {
         this.af = var1.getInt("ListPreferenceDialogFragment.index", 0);
         this.ag = var1.getCharSequenceArray("ListPreferenceDialogFragment.entries");
         this.ah = var1.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
      }
   }

   public final void onSaveInstanceState(Bundle var1) {
      super.onSaveInstanceState(var1);
      var1.putInt("ListPreferenceDialogFragment.index", this.af);
      var1.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.ag);
      var1.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.ah);
   }
}
