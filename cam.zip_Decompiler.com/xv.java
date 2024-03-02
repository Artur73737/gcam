@qus(
   b = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1",
   c = "AnimatedVisibility.kt",
   d = "invokeSuspend",
   e = {748}
)
public final class xv extends quw implements qvx {
   int a;
   final att b;
   final jed c;

   public xv(jed var1, att var2, que var3) {
      super(2, var3);
      this.c = var1;
      this.b = var2;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         ree var3 = sg.c(new ov(this.c, 4));
         wv var4 = new wv(this.b, 2);
         this.a = 1;
         if (var3.gY(var4, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new xv(this.c, this.b, var2);
   }
}
