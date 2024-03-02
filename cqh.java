import android.os.Bundle;
import android.view.View;

final class cqh extends cfe {
   final cqi a;

   public cqh(cqi var1) {
      this.a = var1;
   }

   public final void b(View var1, cht var2) {
      this.a.d.b(var1, var2);
      int var3 = this.a.c.c(var1);
      lq var4 = this.a.c.m;
      if (var4 instanceof cqe) {
         ((cqe)var4).j(var3);
      }
   }

   public final boolean h(View var1, int var2, Bundle var3) {
      return this.a.d.h(var1, var2, var3);
   }
}
