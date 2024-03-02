import android.media.MediaDataSource;
import java.io.IOException;

final class ckh extends MediaDataSource {
   long a;
   final cki b;

   public ckh(cki var1) {
      this.b = var1;
   }

   public final void close() {
   }

   public final long getSize() {
      return -1L;
   }

   public final int readAt(long var1, byte[] var3, int var4, int var5) {
      if (var5 == 0) {
         return 0;
      } else if (var1 < 0L) {
         return -1;
      } else {
         label86: {
            boolean var10001;
            long var7;
            try {
               var7 = this.a;
            } catch (IOException var13) {
               var10001 = false;
               break label86;
            }

            if (var7 != var1) {
               if (var7 >= 0L) {
                  try {
                     if (var1 >= var7 + (long)this.b.available()) {
                        return -1;
                     }
                  } catch (IOException var14) {
                     var10001 = false;
                     break label86;
                  }
               }

               try {
                  this.b.c(var1);
                  this.a = var1;
               } catch (IOException var12) {
                  var10001 = false;
                  break label86;
               }
            }

            int var6 = var5;

            try {
               if (var5 > this.b.available()) {
                  var6 = this.b.available();
               }
            } catch (IOException var11) {
               var10001 = false;
               break label86;
            }

            try {
               var4 = this.b.read(var3, var4, var6);
            } catch (IOException var10) {
               var10001 = false;
               break label86;
            }

            if (var4 >= 0) {
               try {
                  this.a += (long)var4;
                  return var4;
               } catch (IOException var9) {
                  var10001 = false;
               }
            }
         }

         this.a = -1L;
         return -1;
      }
   }
}
