import android.view.Choreographer.FrameCallback;

final class boz implements FrameCallback {
   final qvt a;
   final qza b;

   public boz(qza var1, qvt var2) {
      this.b = var1;
      this.a = var2;
   }

   public final void doFrame(long var1) {
      qza var4 = this.b;
      qvt var3 = this.a;

      Object var7;
      label24:
      try {
         var7 = var3.eo(var1);
      } catch (Throwable var6) {
         var7 = pwm.br(var6);
         break label24;
      }

      var4.gP(var7);
   }
}
