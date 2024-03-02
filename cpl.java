import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;

final class cpl implements OnMultiChoiceClickListener {
   final cpm a;

   public cpl(cpm var1) {
      this.a = var1;
   }

   public final void onClick(DialogInterface var1, int var2, boolean var3) {
      cpm var4 = this.a;
      if (var3) {
         var3 = var4.ag;
         var4.ag = var4.af.add(var4.ai[var2].toString()) | var3;
      } else {
         var3 = var4.ag;
         var4.ag = var4.af.remove(var4.ai[var2].toString()) | var3;
      }
   }
}
