@qus(
   b = "androidx.compose.material.SnackbarHostKt$animatedOpacity$2",
   c = "SnackbarHost.kt",
   d = "invokeSuspend",
   e = {350}
)
final class aou extends quw implements qvx {
   int a;
   final yt b;
   final boolean c;
   final zb d;
   final qvi e;

   public aou(yt var1, boolean var2, zb var3, qvi var4, que var5) {
      super(2, var5);
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
   }

   public final Object b(Object var1) {
      qul var3 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         yt var6 = this.b;
         float var2;
         if (!this.c) {
            var2 = 0.0F;
         } else {
            var2 = 1.0F;
         }

         Float var4 = quy.d(var2);
         zb var5 = this.d;
         this.a = 1;
         if (yt.h(var6, var4, var5, (qvt)null, this, 12) == var3) {
            return var3;
         }
         break;
      default:
         pwm.bs(var1);
      }

      this.e.a();
      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new aou(this.b, this.c, this.d, this.e, var2);
   }
}
