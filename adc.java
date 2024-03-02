@qus(
   b = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1",
   c = "ContentInViewNode.kt",
   d = "invokeSuspend",
   e = {193}
)
final class adc extends quw implements qvx {
   int a;
   final ade b;
   final rbd c;
   private Object d;

   public adc(ade var1, rbd var2, que var3) {
      super(2, var3);
      this.b = var1;
      this.c = var2;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         afj var3 = (afj)this.d;
         ade var5 = this.b;
         var5.i.e = var5.a();
         ade var4 = this.b;
         ahe var6 = var4.i;
         adb var7 = new adb(var4, var3, this.c, 0);
         ov var8 = new ov(var4, 11);
         this.a = 1;
         if (var6.a(var7, var8, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      adc var3 = new adc(this.b, this.c, var2);
      var3.d = var1;
      return var3;
   }
}
