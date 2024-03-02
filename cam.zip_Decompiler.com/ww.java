@qus(
   b = "androidx.camera.camera2.pipe.internal.GraphLifecycleManager$startMonitoring$1",
   c = "GraphLifecycleManager.kt",
   d = "invokeSuspend",
   e = {87}
)
public final class ww extends quw implements qvx {
   int a;
   final wu b;
   final fwf c;

   public ww(wu var1, fwf var2, que var3) {
      super(2, var3);
      this.b = var1;
      this.c = var2;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         var1 = ((lmk)this.b.c).a;
         wv var3 = new wv(this.c, 0);
         this.a = 1;
         if (rgl.e((rgl)var1, var3, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new ww(this.b, this.c, var2);
   }
}
