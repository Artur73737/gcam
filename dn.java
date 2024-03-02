import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;

public class dn extends Activity implements cmc, cfj {
   private final clx a;

   public dn() {
      new xo();
      this.a = new clx(this);
   }

   public boolean dispatchKeyEvent(KeyEvent var1) {
      if (this.getWindow().getDecorView() != null) {
         int[] var2 = cgm.a;
      }

      return cbz.h(this, var1);
   }

   public final boolean dispatchKeyShortcutEvent(KeyEvent var1) {
      if (this.getWindow().getDecorView() != null) {
         int[] var2 = cgm.a;
      }

      return super.dispatchKeyShortcutEvent(var1);
   }

   public final boolean g(KeyEvent var1) {
      return super.dispatchKeyEvent(var1);
   }

   public clx getLifecycle() {
      return this.a;
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      cmv.a(this);
   }

   protected void onSaveInstanceState(Bundle var1) {
      clx var2 = this.a;
      clw var3 = clw.c;
      var3.getClass();
      clx.e("markState");
      var2.d(var3);
      super.onSaveInstanceState(var1);
   }
}
