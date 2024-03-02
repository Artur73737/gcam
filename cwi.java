import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

public final class cwi extends ResultReceiver {
   private final byn a;
   private int b;
   private int c;

   public cwi(byn var1, int var2) {
      super((Handler)null);
      this.a = var1;
      this.b = var2;
   }

   protected final void onReceiveResult(int var1, Bundle var2) {
      int var3 = this.b - 1;
      this.b = var3;
      if (var1 != 0) {
         ++this.c;
      }

      if (var3 <= 0) {
         if (this.c == 0) {
            this.a.a((Object)null);
         } else {
            this.a.b(new cwh());
         }
      }
   }
}
