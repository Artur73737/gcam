import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

public final class cql implements OnKeyListener {
   final SeekBarPreference a;

   public cql(SeekBarPreference var1) {
      this.a = var1;
   }

   public final boolean onKey(View var1, int var2, KeyEvent var3) {
      if (var3.getAction() != 0) {
         return false;
      } else {
         SeekBarPreference var4 = this.a;
         if (!var4.e && (var2 == 21 || var2 == 22)) {
            return false;
         } else if (var2 != 23 && var2 != 66) {
            SeekBar var5 = var4.d;
            if (var5 == null) {
               Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
               return false;
            } else {
               return var5.onKeyDown(var2, var3);
            }
         } else {
            return false;
         }
      }
   }
}
