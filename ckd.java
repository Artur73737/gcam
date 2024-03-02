import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

public final class ckd implements KeyListener {
   private final KeyListener a;

   public ckd(KeyListener var1) {
      this.a = var1;
   }

   public final void clearMetaKeyState(View var1, Editable var2, int var3) {
      this.a.clearMetaKeyState(var1, var2, var3);
   }

   public final int getInputType() {
      return this.a.getInputType();
   }

   public final boolean onKeyDown(View var1, Editable var2, int var3, KeyEvent var4) {
      label20: {
         boolean var5;
         switch(var3) {
         case 67:
            var5 = cim.c(var2, var4, false);
            break;
         case 112:
            var5 = cim.c(var2, var4, true);
            break;
         default:
            break label20;
         }

         if (var5) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(var2);
            return true;
         }
      }

      if (!this.a.onKeyDown(var1, var2, var3, var4)) {
         return false;
      } else {
         return true;
      }
   }

   public final boolean onKeyOther(View var1, Editable var2, KeyEvent var3) {
      return this.a.onKeyOther(var1, var2, var3);
   }

   public final boolean onKeyUp(View var1, Editable var2, int var3, KeyEvent var4) {
      return this.a.onKeyUp(var1, var2, var3, var4);
   }
}
