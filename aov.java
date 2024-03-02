@qus(
   b = "androidx.compose.material.SnackbarHostKt$animatedScale$1",
   c = "SnackbarHost.kt",
   d = "invokeSuspend",
   e = {363}
)
final class aov extends quw implements qvx {
   int a;
   final yt b;
   final boolean c;
   final zb d;

   public aov(yt var1, boolean var2, zb var3, que var4) {
      super(2, var4);
      this.b = var1;
      this.c = var2;
      this.d = var3;
   }

   public final Object b(Object var1) {
      qul var3 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         yt var4 = this.b;
         float var2;
         if (!this.c) {
            var2 = 0.8F;
         } else {
            var2 = 1.0F;
         }

         Float var5 = quy.d(var2);
         zb var6 = this.d;
         this.a = 1;
         if (yt.h(var4, var5, var6, (qvt)null, this, 12) == var3) {
            return var3;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new aov(this.b, this.c, this.d, var2);
   }
}
