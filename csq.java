import android.util.Log;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class csq {
   public static final Map a = new HashMap();
   public final boolean b;
   private final File c;
   private final Lock d;
   private FileChannel e;

   public csq(String var1, File var2) {
      var1.getClass();
      super();
      this.b = false;
      if (var2 != null) {
         var2 = new File(var2, var1.concat(".lck"));
      } else {
         var2 = null;
      }

      this.c = var2;
      Map var3 = a;
      synchronized(var3){}

      Lock var18;
      label143: {
         Throwable var10000;
         label148: {
            boolean var10001;
            Object var19;
            try {
               var19 = var3.get(var1);
            } catch (Throwable var15) {
               var10000 = var15;
               var10001 = false;
               break label148;
            }

            Object var16;
            if (var19 == null) {
               ReentrantLock var20;
               try {
                  var20 = new ReentrantLock();
                  var3.put(var1, var20);
               } catch (Throwable var14) {
                  var10000 = var14;
                  var10001 = false;
                  break label148;
               }

               var16 = var20;
            } else {
               var16 = var19;
            }

            label134:
            try {
               var18 = (Lock)var16;
               break label143;
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label134;
            }
         }

         Throwable var17 = var10000;
         throw var17;
      }

      this.d = var18;
   }

   public final void a(boolean var1) {
      this.d.lock();
      if (var1) {
         IOException var10;
         IOException var10000;
         label41: {
            File var2;
            boolean var10001;
            try {
               var2 = this.c;
            } catch (IOException var7) {
               var10000 = var7;
               var10001 = false;
               break label41;
            }

            if (var2 != null) {
               label45: {
                  try {
                     var2 = var2.getParentFile();
                  } catch (IOException var5) {
                     var10000 = var5;
                     var10001 = false;
                     break label45;
                  }

                  if (var2 != null) {
                     try {
                        var2.mkdirs();
                     } catch (IOException var4) {
                        var10000 = var4;
                        var10001 = false;
                        break label45;
                     }
                  }

                  try {
                     FileOutputStream var8 = new FileOutputStream(this.c);
                     FileChannel var9 = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(var8.getChannel());
                     var9.lock();
                     this.e = var9;
                     return;
                  } catch (IOException var3) {
                     var10000 = var3;
                     var10001 = false;
                  }
               }
            } else {
               try {
                  var10 = new IOException("No lock directory was provided.");
                  throw var10;
               } catch (IOException var6) {
                  var10000 = var6;
                  var10001 = false;
               }
            }
         }

         var10 = var10000;
         this.e = null;
         Log.w("SupportSQLiteLock", "Unable to grab file lock.", var10);
      }
   }

   public final void b() {
      // $FF: Couldn't be decompiled
   }
}
