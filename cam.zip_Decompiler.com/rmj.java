import j..io.DesugarInputStream;
import j..io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;

public final class rmj extends InputStream implements InputStreamRetargetInterface {
   private final rmk a;

   public rmj(InputStream var1) {
      this.a = new rmk(Channels.newChannel(var1));
   }

   public final int available() {
      ByteBuffer var1 = this.a.a;
      return var1 != null ? var1.remaining() : 0;
   }

   public final void close() {
      this.a.b();
   }

   public final int read() {
      if (this.a.b) {
         IOException var2 = new IOException("read after close");
         throw var2;
      } else {
         int var1;
         do {
            var1 = this.a.a();
         } while(var1 == 0);

         return var1 == -1 ? -1 : this.a.a.get() & 255;
      }
   }

   public final int read(byte[] var1) {
      return this.read(var1, 0, var1.length);
   }

   public final int read(byte[] var1, int var2, int var3) {
      rmk var6 = this.a;
      if (var6.b) {
         IOException var7 = new IOException("read after close");
         throw var7;
      } else if (var6.a() == -1) {
         return -1;
      } else {
         byte var5 = 0;
         int var4 = var2;
         var2 = var5;

         int var8;
         do {
            var8 = var2;
            if (var3 <= 0) {
               break;
            }

            var8 = Math.min(var3, this.a.a.remaining());
            this.a.a.get(var1, var4, var8);
            var4 += var8;
            var3 -= var8;
            var8 += var2;
            var2 = var8;
         } while(this.a.a() != -1);

         return var8;
      }
   }

   public final long skip(long var1) {
      if (this.a.b) {
         IOException var10 = new IOException("read after close");
         throw var10;
      } else {
         long var4;
         long var6;
         for(var4 = 0L; var1 > 0L && this.a.a() != -1; var1 -= var6) {
            int var3 = (int)Math.min(var1, (long)this.a.a.remaining());
            rmk var8 = this.a;
            ByteBuffer var9 = var8.a;
            var9.position(var9.position() + var3);
            if (!var8.a.hasRemaining()) {
               var8.a = null;
            }

            var6 = (long)var3;
            var4 += var6;
         }

         return var4;
      }
   }

   // $FF: synthetic method
   public final long transferTo(OutputStream var1) {
      return DesugarInputStream.transferTo(this, var1);
   }
}
