import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public final class cpm extends cpu {
   final Set af = new HashSet();
   boolean ag;
   CharSequence[] ah;
   CharSequence[] ai;

   private final MultiSelectListPreference E() {
      return (MultiSelectListPreference)this.D();
   }

   public final void A(boolean var1) {
      if (var1 && this.ag) {
         MultiSelectListPreference var2 = this.E();
         if (var2.W(this.af)) {
            var2.k(this.af);
         }
      }

      this.ag = false;
   }

   protected final void eQ(ee var1) {
      int var3 = this.ai.length;
      boolean[] var4 = new boolean[var3];

      for(int var2 = 0; var2 < var3; ++var2) {
         var4[var2] = this.af.contains(this.ai[var2].toString());
      }

      CharSequence[] var5 = this.ah;
      cpl var6 = new cpl(this);
      ea var7 = var1.a;
      var7.n = var5;
      var7.w = var6;
      var7.s = var4;
      var7.t = true;
   }

   public final void onCreate(Bundle var1) {
      super.onCreate(var1);
      if (var1 == null) {
         MultiSelectListPreference var2 = this.E();
         if (var2.g != null && var2.h != null) {
            this.af.clear();
            this.af.addAll(var2.i);
            this.ag = false;
            this.ah = var2.g;
            this.ai = var2.h;
         } else {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
         }
      } else {
         this.af.clear();
         this.af.addAll(var1.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
         this.ag = var1.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
         this.ah = var1.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
         this.ai = var1.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
      }
   }

   public final void onSaveInstanceState(Bundle var1) {
      super.onSaveInstanceState(var1);
      var1.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList(this.af));
      var1.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.ag);
      var1.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.ah);
      var1.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.ai);
   }
}
