@qus(
   b = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1",
   c = "WindowRecomposer.android.kt",
   d = "invokeSuspend",
   e = {389}
)
final class bqn extends quw implements qvx {
   int a;
   final rfy b;
   final bpt c;

   public bqn(rfy var1, bpt var2, que var3) {
      super(2, var3);
      this.b = var1;
      this.c = var2;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         rfy var4 = this.b;
         wv var3 = new wv(this.c, 3);
         this.a = 1;
         if (var4.gY(var3, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      throw new qsc();
   }

   public final que c(Object var1, que var2) {
      return new bqn(this.b, this.c, var2);
   }
}
