import android.view.View;

@qus(
   b = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1",
   c = "WindowRecomposer.android.kt",
   d = "invokeSuspend",
   e = {233}
)
final class bqk extends quw implements qvx {
   int a;
   final auo b;
   final View c;

   public bqk(auo var1, View var2, que var3) {
      super(2, var3);
      this.b = var1;
      this.c = var2;
   }

   public final Object b(Object var1) {
      label189: {
         qul var3 = qul.a;
         Throwable var10000;
         boolean var10001;
         switch(this.a) {
         case 0:
            pwm.bs(var1);

            Object var18;
            try {
               auo var16 = this.b;
               this.a = 1;
               rga var2 = var16.n;
               auj var17 = new auj((que)null);
               var18 = qwl.j(var2, var17, this);
            } catch (Throwable var14) {
               var10000 = var14;
               var10001 = false;
               break;
            }

            var1 = var18;

            try {
               if (var18 != qul.a) {
                  var1 = qsn.a;
               }
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break;
            }

            if (var1 == var3) {
               return var3;
            }
            break label189;
         default:
            label184:
            try {
               pwm.bs(var1);
               break label189;
            } catch (Throwable var15) {
               var10000 = var15;
               var10001 = false;
               break label184;
            }
         }

         Throwable var19 = var10000;
         if (bqs.a(this.c) == this.b) {
            bqs.b(this.c, (ast)null);
         }

         throw var19;
      }

      if (bqs.a(this.c) == this.b) {
         bqs.b(this.c, (ast)null);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new bqk(this.b, this.c, var2);
   }
}
