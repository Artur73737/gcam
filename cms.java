@qus(
   b = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3",
   c = "RepeatOnLifecycle.kt",
   d = "invokeSuspend",
   e = {84}
)
final class cms extends quw implements qvx {
   int a;
   final clx b;
   final clw c;
   final qvx d;
   private Object e;

   public cms(clx var1, clw var2, qvx var3, que var4) {
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
         qzv var3 = (qzv)this.e;
         qzr var4 = rah.a;
         rbq var5 = rij.a.h();
         cmr var6 = new cmr(this.b, this.c, var3, this.d, (que)null);
         this.a = 1;
         if (qwo.k(var5, var6, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      cms var3 = new cms(this.b, this.c, this.d, var2);
      var3.e = var1;
      return var3;
   }
}
