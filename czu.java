import androidx.work.CoroutineWorker;

@qus(
   b = "androidx.work.CoroutineWorker$startWork$1",
   c = "CoroutineWorker.kt",
   d = "invokeSuspend",
   e = {68}
)
public final class czu extends quw implements qvx {
   int a;
   final CoroutineWorker b;

   public czu(CoroutineWorker var1, que var2) {
      super(2, var2);
      this.b = var1;
   }

   public final Object b(Object var1) {
      Throwable var10000;
      label126: {
         qul var3 = qul.a;
         boolean var10001;
         switch(this.a) {
         case 0:
            pwm.bs(var1);

            Object var2;
            try {
               CoroutineWorker var16 = this.b;
               this.a = 1;
               var2 = var16.b(this);
            } catch (Throwable var14) {
               var10000 = var14;
               var10001 = false;
               break label126;
            }

            var1 = var2;
            if (var2 == var3) {
               return var3;
            }
            break;
         default:
            try {
               pwm.bs(var1);
            } catch (Throwable var15) {
               var10000 = var15;
               var10001 = false;
               break label126;
            }
         }

         label118:
         try {
            cby var18 = (cby)var1;
            this.b.b.h(var18);
            return qsn.a;
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            break label118;
         }
      }

      Throwable var17 = var10000;
      this.b.b.e(var17);
      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new czu(this.b, var2);
   }
}
