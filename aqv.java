@qus(
   b = "androidx.compose.material.ripple.StateLayer$handleInteraction$2",
   c = "Ripple.kt",
   d = "invokeSuspend",
   e = {296}
)
final class aqv extends quw implements qvx {
   int a;
   final aqw b;
   final zb c;

   public aqv(aqw var1, zb var2, que var3) {
      super(2, var3);
      this.b = var1;
      this.c = var2;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         yt var5 = this.b.c;
         Float var3 = quy.d(0.0F);
         zb var4 = this.c;
         this.a = 1;
         if (yt.h(var5, var3, var4, (qvt)null, this, 12) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new aqv(this.b, this.c, var2);
   }
}
