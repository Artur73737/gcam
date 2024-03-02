import java.util.concurrent.atomic.AtomicInteger;

@qus(
   b = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1",
   c = "Combine.kt",
   d = "invokeSuspend",
   e = {34}
)
final class rgx extends quw implements qvx {
   int a;
   final ree[] b;
   final int c;
   final AtomicInteger d;
   final rdb e;

   public rgx(ree[] var1, int var2, AtomicInteger var3, rdb var4, que var5) {
      super(2, var5);
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
   }

   public final Object b(Object var1) {
      label173: {
         qul var3 = qul.a;
         Throwable var10000;
         boolean var10001;
         switch(this.a) {
         case 0:
            pwm.bs(var1);

            int var2;
            ree[] var17;
            try {
               var17 = this.b;
               var2 = this.c;
            } catch (Throwable var15) {
               var10000 = var15;
               var10001 = false;
               break;
            }

            ree var18 = var17[var2];

            try {
               rgw var4 = new rgw(this.e, var2);
               this.a = 1;
               var1 = var18.gY(var4, this);
            } catch (Throwable var14) {
               var10000 = var14;
               var10001 = false;
               break;
            }

            if (var1 == var3) {
               return var3;
            }
            break label173;
         default:
            label168:
            try {
               pwm.bs(var1);
               break label173;
            } catch (Throwable var16) {
               var10000 = var16;
               var10001 = false;
               break label168;
            }
         }

         Throwable var19 = var10000;
         if (this.d.decrementAndGet() == 0) {
            quy.w(this.e);
         }

         throw var19;
      }

      if (this.d.decrementAndGet() == 0) {
         quy.w(this.e);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new rgx(this.b, this.c, this.d, this.e, var2);
   }
}
