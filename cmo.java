@qus(
   b = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1",
   c = "RepeatOnLifecycle.kt",
   d = "invokeSuspend",
   e = {111}
)
final class cmo extends quw implements qvx {
   int a;
   final qvx b;
   private Object c;

   public cmo(qvx var1, que var2) {
      super(2, var2);
      this.b = var1;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         qzv var4 = (qzv)this.c;
         qvx var3 = this.b;
         this.a = 1;
         if (var3.a(var4, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      cmo var3 = new cmo(this.b, var2);
      var3.c = var1;
      return var3;
   }
}
