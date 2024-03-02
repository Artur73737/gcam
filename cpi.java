import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;

public final class cpi implements cpr {
   public static cpi a;
   public static cpi b;
   private final int c;

   public cpi(int var1) {
      this.c = var1;
   }

   // $FF: synthetic method
   public final CharSequence a(Preference var1) {
      switch(this.c) {
      case 0:
         ListPreference var2 = (ListPreference)var1;
         Object var3;
         if (TextUtils.isEmpty(var2.l())) {
            var3 = var2.j.getString(2132018045);
         } else {
            var3 = var2.l();
         }

         return (CharSequence)var3;
      default:
         EditTextPreference var4 = (EditTextPreference)var1;
         String var5;
         if (TextUtils.isEmpty(var4.g)) {
            var5 = var4.j.getString(2132018045);
         } else {
            var5 = var4.g;
         }

         return var5;
      }
   }
}
