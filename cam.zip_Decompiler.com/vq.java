@qus(
   b = "androidx.camera.camera2.pipe.core.Threading$runBlockingWithTimeout$1$1",
   c = "Threading.kt",
   d = "invokeSuspend",
   e = {50}
)
final class vq extends quw implements qvx {
   int a;
   final rab b;

   public vq(rab var1, que var2) {
      super(2, var2);
      this.b = var1;
   }

   public final Object b(Object var1) {
      qul var3 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         rab var4 = this.b;
         this.a = 1;
         Object var2 = var4.k(this);
         var1 = var2;
         if (var2 == var3) {
            return var3;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return var1;
   }

   public final que c(Object var1, que var2) {
      return new vq(this.b, var2);
   }
}
