import android.view.PointerIcon;
import android.view.View;

public final class bop {
   public static final bop a = new bop();

   private bop() {
   }

   public final void a(View var1, bho var2) {
      var1.getClass();
      if (!(var2 instanceof bhc)) {
         PointerIcon var4;
         if (var2 instanceof bhd) {
            var4 = PointerIcon.getSystemIcon(var1.getContext(), ((bhd)var2).a);
            var4.getClass();
         } else {
            var4 = PointerIcon.getSystemIcon(var1.getContext(), 1000);
            var4.getClass();
         }

         if (!c.E(var1.getPointerIcon(), var4)) {
            var1.setPointerIcon(var4);
         }

      } else {
         bhc var3 = (bhc)var2;
         throw null;
      }
   }
}
