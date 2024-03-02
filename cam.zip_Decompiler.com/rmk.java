import com.google.android.libraries.memorymonitor.Xhk.PUdPFKr;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import org.brotli.wrapper.dec.DecoderJNI;

public final class rmk {
   private static final ByteBuffer c = ByteBuffer.allocate(0);
   ByteBuffer a;
   boolean b;
   private final ReadableByteChannel d;
   private final rml e;

   public rmk(ReadableByteChannel var1) {
      if (var1 != null) {
         this.d = var1;
         this.e = new rml();
      } else {
         throw new NullPointerException(PUdPFKr.ThgkLHO);
      }
   }

   private final void c(String var1) {
      try {
         this.b();
      } catch (IOException var3) {
      }

      throw new IOException(var1);
   }

   final int a() {
      while(true) {
         ByteBuffer var3 = this.a;
         if (var3 != null) {
            if (var3.hasRemaining()) {
               return this.a.remaining();
            }

            this.a = null;
         }

         rml var5 = this.e;
         int var2 = var5.c;
         if (var2 == 0) {
            throw null;
         }

         int var1 = -1;
         switch(var2 - 1) {
         case 1:
            return -1;
         case 2:
            var3 = var5.b;
            var3.clear();
            var2 = this.d.read(var3);
            if (var2 == -1) {
               this.c("unexpected end of input");
            } else {
               var1 = var2;
            }

            if (var1 == 0) {
               this.a = c;
               return 0;
            }

            this.e.c(var1);
            break;
         case 3:
            long[] var4 = var5.a;
            if (var4[0] != 0L) {
               if (var2 != 4 && var4[2] == 0L) {
                  String var6 = qxb.x(var2);
                  StringBuilder var8 = new StringBuilder();
                  var8.append("pulling output from decoder in ");
                  var8.append(var6);
                  var8.append(" state");
                  throw new IllegalStateException(var8.toString());
               }

               ByteBuffer var7 = DecoderJNI.nativePull(var4);
               var5.b();
               this.a = var7;
               break;
            }

            throw new IllegalStateException("brotli decoder is already destroyed");
         case 4:
            var5.c(0);
            break;
         default:
            this.c("corrupted input");
         }
      }
   }

   final void b() {
      if (!this.b) {
         this.b = true;
         this.e.a();
         this.d.close();
      }
   }
}
