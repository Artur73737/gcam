import android.view.accessibility.AccessibilityManager;

@qus(
   b = "androidx.compose.material.SnackbarHostKt$SnackbarHost$1",
   c = "SnackbarHost.kt",
   d = "invokeSuspend",
   e = {164}
)
public final class aot extends quw implements qvx {
   int a;
   final aor b;
   final lmk c;

   public aot(aor var1, lmk var2, que var3) {
      super(2, var3);
      this.b = var1;
      this.c = var2;
   }

   public final Object b(Object var1) {
      qul var8 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         aor var10 = this.b;
         if (var10 == null) {
            return qsn.a;
         }

         int var2 = var10.e();
         String var9 = this.b.a();
         lmk var11 = this.c;
         if (var2 == 0) {
            throw null;
         }

         long var6 = Long.MAX_VALUE;
         long var4;
         switch(var2 - 1) {
         case 1:
            var4 = 10000L;
            break;
         case 2:
            var4 = Long.MAX_VALUE;
            break;
         default:
            var4 = 4000L;
         }

         if (var11 != null && var4 < 2147483647L) {
            byte var12;
            if (var9 == null) {
               var12 = 3;
            } else {
               var12 = 7;
            }

            int var3 = (int)var4;
            var2 = bpd.a.a((AccessibilityManager)var11.a, var3, var12);
            if (var2 == Integer.MAX_VALUE) {
               var4 = var6;
            } else {
               var4 = (long)var2;
            }
         }

         this.a = 1;
         if (qzy.d(var4, this) == var8) {
            return var8;
         }
         break;
      default:
         pwm.bs(var1);
      }

      this.b.c();
      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new aot(this.b, this.c, var2);
   }
}
