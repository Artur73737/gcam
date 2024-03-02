@qus(
   b = "androidx.compose.material.ripple.StateLayer$handleInteraction$1",
   c = "Ripple.kt",
   d = "invokeSuspend",
   e = {290}
)
final class aqu extends quw implements qvx {
   int a;
   final aqw b;
   final float c;
   final zb d;

   public aqu(aqw var1, float var2, zb var3, que var4) {
      super(2, var4);
      this.b = var1;
      this.c = var2;
      this.d = var3;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         yt var3 = this.b.c;
         Float var5 = quy.d(this.c);
         zb var4 = this.d;
         this.a = 1;
         if (yt.h(var3, var5, var4, (qvt)null, this, 12) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new aqu(this.b, this.c, this.d, var2);
   }
}
