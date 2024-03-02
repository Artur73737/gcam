@qus(
   b = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1",
   c = "AnimateAsState.kt",
   d = "invokeSuspend",
   e = {435}
)
final class yv extends quw implements qvx {
   int a;
   final Object b;
   final yt c;
   final avi d;
   final avi e;

   public yv(Object var1, yt var2, avi var3, avi var4, que var5) {
      super(2, var5);
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
   }

   public final Object b(Object var1) {
      qul var3 = qul.a;
      int var2;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         if (c.E(this.b, this.c.c())) {
            return qsn.a;
         }

         yt var6 = this.c;
         Object var4 = this.b;
         avi var5 = this.d;
         var2 = yx.a;
         zb var9 = (zb)var5.a();
         this.a = 1;
         if (yt.h(var6, var4, var9, (qvt)null, this, 12) == var3) {
            return var3;
         }
         break;
      default:
         pwm.bs(var1);
      }

      avi var7 = this.e;
      var2 = yx.a;
      qvt var8 = (qvt)var7.a();
      if (var8 != null) {
         var8.eo(this.c.d());
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new yv(this.b, this.c, this.d, this.e, var2);
   }
}
