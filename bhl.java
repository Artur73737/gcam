import android.view.MotionEvent;
import java.util.List;

public final class bhl {
   public final List a;
   public final int b;
   public int c;
   private final blj d;

   public bhl(List var1) {
      this(var1, (blj)null);
   }

   public bhl(List var1, blj var2) {
      this.a = var1;
      this.d = var2;
      MotionEvent var6 = this.a();
      byte var5 = 0;
      byte var4 = 0;
      int var3;
      if (var6 != null) {
         var3 = var6.getButtonState();
      } else {
         var3 = 0;
      }

      this.b = var3;
      var6 = this.a();
      if (var6 != null) {
         var6.getMetaState();
      }

      var6 = this.a();
      byte var8;
      if (var6 != null) {
         switch(var6.getActionMasked()) {
         case 0:
         case 5:
            var8 = 1;
            break;
         case 1:
         case 6:
            var8 = 2;
            break;
         case 2:
         case 7:
            var8 = 3;
            break;
         case 3:
         case 4:
         default:
            var8 = var5;
            break;
         case 8:
            var8 = 6;
            break;
         case 9:
            var8 = 4;
            break;
         case 10:
            var8 = 5;
         }
      } else {
         int var9 = var1.size();
         var3 = var4;

         while(true) {
            if (var3 >= var9) {
               var8 = 3;
               break;
            }

            bhw var7 = (bhw)var1.get(var3);
            if (iy.n(var7)) {
               var8 = 2;
               break;
            }

            if (iy.l(var7)) {
               var8 = 1;
               break;
            }

            ++var3;
         }
      }

      this.c = var8;
   }

   public final MotionEvent a() {
      blj var1 = this.d;
      return var1 != null ? (MotionEvent)((blj)var1.b).a : null;
   }
}
