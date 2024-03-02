@qus(
   b = "androidx.camera.camera2.pipe.core.WakeLock$startTimeout$1",
   c = "WakeLock.kt",
   d = "invokeSuspend",
   e = {118}
)
final class vx extends quw implements qvx {
   int a;
   final vy b;

   public vx(vy var1, que var2) {
      super(2, var2);
      this.b = var1;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         this.a = 1;
         if (qzy.d(1000L, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      vy var15 = this.b;
      var1 = var15.b;
      synchronized(var1){}

      Throwable var10000;
      label179: {
         boolean var10001;
         label181: {
            try {
               if (!var15.e && var15.c == 0) {
                  break label181;
               }
            } catch (Throwable var14) {
               var10000 = var14;
               var10001 = false;
               break label179;
            }

            qsn var16;
            try {
               var16 = qsn.a;
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label179;
            }

            return var16;
         }

         try {
            var15.d = null;
            var15.e = true;
         } catch (Throwable var12) {
            var10000 = var12;
            var10001 = false;
            break label179;
         }

         this.b.a.a();
         return qsn.a;
      }

      Throwable var17 = var10000;
      throw var17;
   }

   public final que c(Object var1, que var2) {
      return new vx(this.b, var2);
   }
}
