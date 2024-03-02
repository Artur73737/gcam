import android.app.Dialog;
import android.view.View;

final class bj extends ca {
   final ca a;
   final bk b;

   public bj(bk var1, ca var2) {
      this.b = var1;
      this.a = var2;
   }

   public final View a(int var1) {
      ca var2 = this.a;
      if (var2.b()) {
         return var2.a(var1);
      } else {
         Dialog var3 = this.b.c;
         return var3 != null ? var3.findViewById(var1) : null;
      }
   }

   public final boolean b() {
      return this.a.b() || this.b.d;
   }
}
