import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

final class bh implements OnDismissListener {
   final bk a;

   public bh(bk var1) {
      this.a = var1;
   }

   public final void onDismiss(DialogInterface var1) {
      bk var2 = this.a;
      Dialog var3 = var2.c;
      if (var3 != null) {
         var2.onDismiss(var3);
      }

   }
}
