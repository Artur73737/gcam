import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;

final class cod extends Handler {
   final cof a;

   public cod(cof var1, Looper var2) {
      super(var2);
      this.a = var1;
   }

   public final void handleMessage(Message var1) {
      switch(var1.what) {
      case 1:
         cof var6 = this.a;

         label318:
         while(true) {
            HashMap var7 = var6.b;
            synchronized(var7){}

            Throwable var10000;
            boolean var10001;
            label315: {
               int var4;
               try {
                  var4 = var6.c.size();
               } catch (Throwable var28) {
                  var10000 = var28;
                  var10001 = false;
                  break label315;
               }

               if (var4 <= 0) {
                  label308:
                  try {
                     return;
                  } catch (Throwable var26) {
                     var10000 = var26;
                     var10001 = false;
                     break label308;
                  }
               } else {
                  label321: {
                     ebt[] var30;
                     try {
                        var30 = new ebt[var4];
                        var6.c.toArray(var30);
                        var6.c.clear();
                     } catch (Throwable var27) {
                        var10000 = var27;
                        var10001 = false;
                        break label321;
                     }

                     int var2 = 0;

                     while(true) {
                        if (var2 >= var4) {
                           continue label318;
                        }

                        ebt var31 = var30[var2];
                        int var5 = ((ArrayList)var31.b).size();

                        for(int var3 = 0; var3 < var5; ++var3) {
                           coe var8 = (coe)((ArrayList)var31.b).get(var3);
                           if (!var8.d) {
                              var8.b.onReceive(var6.a, (Intent)var31.a);
                           }
                        }

                        ++var2;
                     }
                  }
               }
            }

            while(true) {
               Throwable var29 = var10000;

               try {
                  throw var29;
               } catch (Throwable var25) {
                  var10000 = var25;
                  var10001 = false;
                  continue;
               }
            }
         }
      default:
         super.handleMessage(var1);
      }
   }
}
