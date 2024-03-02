import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

final class bg implements OnCancelListener {
   final bk a;

   public bg(bk var1) {
      this.a = var1;
   }

   public final void onCancel(DialogInterface var1) {
      bk var2 = this.a;
      Dialog var3 = var2.c;
      if (var3 != null) {
         var2.onCancel(var3);
      }

   }
}
