import j..io.DesugarInputStream;
import j..io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class rmb extends InputStream implements InputStreamRetargetInterface {
   final rmc a;

   public rmb(rmc var1) {
      this.a = var1;
   }

   public final int available() {
      rmc var1 = this.a;
      if (!var1.c) {
         return (int)Math.min(var1.b.b, 2147483647L);
      } else {
         throw new IOException("closed");
      }
   }

   public final void close() {
      this.a.close();
   }

   public final int read() {
      rmc var2 = this.a;
      if (!var2.c) {
         rlv var1 = var2.b;
         return var1.b == 0L && var2.a.t(var1) == -1L ? -1 : this.a.b.b() & 255;
      } else {
         throw new IOException("closed");
      }
   }

   public final int read(byte[] var1, int var2, int var3) {
      var1.getClass();
      if (!this.a.c) {
         long var4 = (long)var2;
         long var6 = (long)var3;
         qwp.O((long)var1.length, var4, var6);
         rmc var9 = this.a;
         rlv var8 = var9.b;
         return var8.b == 0L && var9.a.t(var8) == -1L ? -1 : this.a.b.c(var1, var2, var3);
      } else {
         throw new IOException("closed");
      }
   }

   public final String toString() {
      rmc var1 = this.a;
      StringBuilder var2 = new StringBuilder();
      var2.append(var1);
      var2.append(".inputStream()");
      return var1.toString().concat(".inputStream()");
   }

   // $FF: synthetic method
   public final long transferTo(OutputStream var1) {
      return DesugarInputStream.transferTo(this, var1);
   }
}
