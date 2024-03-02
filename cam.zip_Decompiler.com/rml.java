import java.io.IOException;
import java.nio.ByteBuffer;
import org.brotli.wrapper.dec.DecoderJNI;

public final class rml {
   public final long[] a;
   public final ByteBuffer b;
   public int c;

   public rml() {
      long[] var1 = new long[3];
      this.a = var1;
      this.c = 3;
      var1[1] = 16384L;
      this.b = DecoderJNI.nativeCreate(var1);
      if (var1[0] == 0L) {
         throw new IOException("failed to initialize native brotli decoder");
      }
   }

   public final void a() {
      long[] var1 = this.a;
      if (var1[0] != 0L) {
         DecoderJNI.nativeDestroy(var1);
         this.a[0] = 0L;
      } else {
         throw new IllegalStateException("brotli decoder is already destroyed");
      }
   }

   public final void b() {
      long var2 = this.a[1];
      byte var1;
      if (var2 == 1L) {
         var1 = 2;
      } else if (var2 == 2L) {
         var1 = 3;
      } else if (var2 == 3L) {
         var1 = 4;
      } else {
         if (var2 != 4L) {
            this.c = 1;
            return;
         }

         var1 = 5;
      }

      this.c = var1;
   }

   public final void c(int var1) {
      if (var1 >= 0) {
         long[] var3 = this.a;
         if (var3[0] != 0L) {
            int var2 = this.c;
            if (var2 != 3) {
               if (var2 != 5) {
                  StringBuilder var4 = new StringBuilder();
                  var4.append("pushing input to decoder in ");
                  var4.append(qxb.x(var2));
                  var4.append(" state");
                  throw new IllegalStateException(var4.toString());
               }

               if (var1 != 0) {
                  throw new IllegalStateException("pushing input to decoder in OK state");
               }
            }

            DecoderJNI.nativePush(var3, var1);
            this.b();
         } else {
            throw new IllegalStateException("brotli decoder is already destroyed");
         }
      } else {
         throw new IllegalArgumentException("negative block length");
      }
   }

   protected final void finalize() {
      if (this.a[0] != 0L) {
         this.a();
      }

      super.finalize();
   }
}
