import android.view.View;
import java.util.List;

public final class bqp implements cma {
   final qzv a;
   final auo b;
   final qwz c;
   final View d;
   final bpa e;

   public bqp(qzv var1, bpa var2, auo var3, qwz var4, View var5) {
      this.a = var1;
      this.e = var2;
      this.b = var3;
      this.c = var4;
      this.d = var5;
   }

   public final void ej(cmc var1, clv var2) {
      Throwable var10000;
      label535: {
         int var3 = var2.ordinal();
         var2 = null;
         switch(var3) {
         case 0:
            qwo.o(this.a, (qui)null, 4, new bqo(this.c, this.b, var1, this, this.d, (que)null), 1);
            return;
         case 1:
            bpa var40 = this.e;
            if (var40 != null) {
               Object var8 = var40.a;
               Object var41 = ((atn)var8).a;
               synchronized(var41){}

               boolean var5;
               boolean var10001;
               try {
                  var5 = ((atn)var8).a();
               } catch (Throwable var39) {
                  var10000 = var39;
                  var10001 = false;
                  break label535;
               }

               if (!var5) {
                  int var4;
                  List var6;
                  try {
                     var6 = ((atn)var8).b;
                     List var7 = ((atn)var8).c;
                     ((atn)var8).b = var7;
                     ((atn)var8).c = var6;
                     ((atn)var8).d = true;
                     var4 = var6.size();
                  } catch (Throwable var38) {
                     var10000 = var38;
                     var10001 = false;
                     break label535;
                  }

                  for(var3 = 0; var3 < var4; ++var3) {
                     try {
                        ((que)var6.get(var3)).gP(qsn.a);
                     } catch (Throwable var37) {
                        var10000 = var37;
                        var10001 = false;
                        break label535;
                     }
                  }

                  try {
                     var6.clear();
                  } catch (Throwable var36) {
                     var10000 = var36;
                     var10001 = false;
                     break label535;
                  }
               }
            }

            auo var42 = this.b;
            Object var45 = var42.c;
            synchronized(var45){}
            boolean var14 = false;

            qza var43;
            label482: {
               try {
                  var14 = true;
                  if (var42.k) {
                     var42.k = false;
                     var43 = var42.w();
                     var14 = false;
                     break label482;
                  }

                  var14 = false;
               } finally {
                  if (var14) {
                     ;
                  }
               }

               var43 = var2;
            }

            if (var43 != null) {
               var43.gP(qsn.a);
               return;
            }
         case 2:
         case 3:
         default:
            break;
         case 4:
            this.b.s();
            return;
         case 5:
            this.b.r();
            return;
         }

         return;
      }

      Throwable var44 = var10000;
      throw var44;
   }
}
