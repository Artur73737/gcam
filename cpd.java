import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import androidx.preference.ListPreference;
import androidx.preference.Preference;

public final class cpd implements OnItemSelectedListener {
   final Object a;
   private final int b;

   public cpd(Object var1, int var2) {
      this.b = var2;
      this.a = var1;
   }

   public final void onItemSelected(AdapterView var1, View var2, int var3, long var4) {
      switch(this.b) {
      case 0:
         if (var3 >= 0) {
            String var6 = ((ListPreference)this.a).h[var3].toString();
            if (!var6.equals(((ListPreference)this.a).i) && ((Preference)this.a).W(var6)) {
               ((ListPreference)this.a).o(var6);
            }
         }

         return;
      default:
         if (var3 != -1) {
            kj var7 = ((le)this.a).e;
            if (var7 != null) {
               var7.a = false;
               return;
            }
         }

      }
   }

   public final void onNothingSelected(AdapterView var1) {
      int var2 = this.b;
   }
}
