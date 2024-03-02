import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class cpv extends Handler {
   final cqa a;

   public cpv(cqa var1, Looper var2) {
      super(var2);
      this.a = var1;
   }

   public final void handleMessage(Message var1) {
      switch(var1.what) {
      case 1:
         this.a.z();
         return;
      default:
      }
   }
}
