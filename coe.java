import android.content.BroadcastReceiver;
import android.content.IntentFilter;

final class coe {
   final IntentFilter a;
   final BroadcastReceiver b;
   boolean c;
   boolean d;

   public coe(IntentFilter var1, BroadcastReceiver var2) {
      this.a = var1;
      this.b = var2;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder(128);
      var1.append("Receiver{");
      var1.append(this.b);
      var1.append(" filter=");
      var1.append(this.a);
      if (this.d) {
         var1.append(" DEAD");
      }

      var1.append("}");
      return var1.toString();
   }
}
