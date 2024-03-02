import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import androidx.preference.TwoStatePreference;

public final class cqn implements OnCheckedChangeListener {
   final TwoStatePreference a;
   private final int b;

   public cqn(TwoStatePreference var1, int var2) {
      this.b = var2;
      this.a = var1;
   }

   public final void onCheckedChanged(CompoundButton var1, boolean var2) {
      switch(this.b) {
      case 0:
         if (!this.a.W(var2)) {
            var1.setChecked(var2 ^ true);
            return;
         }

         this.a.k(var2);
         return;
      case 1:
         if (!this.a.W(var2)) {
            var1.setChecked(var2 ^ true);
            return;
         }

         this.a.k(var2);
         return;
      default:
         if (!this.a.W(var2)) {
            var1.setChecked(var2 ^ true);
         } else {
            this.a.k(var2);
         }
      }
   }
}
