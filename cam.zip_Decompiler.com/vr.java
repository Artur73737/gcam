@qus(
   b = "androidx.camera.camera2.pipe.core.Threading$runBlockingWithTimeout$1",
   c = "Threading.kt",
   d = "invokeSuspend",
   e = {49}
)
public final class vr extends quw implements qvx {
   int a;
   final qzr b;
   final qvt c;

   public vr(qzr var1, qvt var2, que var3) {
      super(2, var3);
      this.b = var1;
      this.c = var2;
   }

   public final Object b(Object var1) {
      qul var3 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         qzv var4 = vs.a;
         qzr var2 = this.b;
         qvt var5 = this.c;
         vq var6 = new vq(qwo.n(vs.a, var2, new vp(var5, (que)null), 2), (que)null);
         this.a = 1;
         Object var7 = qzy.l(new rcd(5000L, this), var6);
         var1 = var7;
         if (var7 == var3) {
            return var3;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return var1;
   }

   public final que c(Object var1, que var2) {
      return new vr(this.b, this.c, var2);
   }
}
