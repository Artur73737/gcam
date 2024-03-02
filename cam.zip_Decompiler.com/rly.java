import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;

final class rly implements rmg {
   private final InputStream a;

   public rly(InputStream var1) {
      this.a = var1;
   }

   public final void close() {
      this.a.close();
   }

   public final long t(rlv var1) {
      int var2;
      AssertionError var10000;
      label55: {
         rmd var7;
         boolean var10001;
         label54: {
            try {
               if (!Thread.currentThread().isInterrupted()) {
                  var7 = var1.j(1);
                  var2 = (int)Math.min(8192L, (long)(8192 - var7.c));
                  var2 = this.a.read(var7.a, var7.c, var2);
                  break label54;
               }
            } catch (AssertionError var12) {
               var10000 = var12;
               var10001 = false;
               break label55;
            }

            try {
               InterruptedIOException var13 = new InterruptedIOException("interrupted");
               throw var13;
            } catch (AssertionError var11) {
               var10000 = var11;
               var10001 = false;
               break label55;
            }
         }

         if (var2 == -1) {
            try {
               if (var7.b == var7.c) {
                  var1.a = var7.a();
                  rme.b(var7);
               }

               return -1L;
            } catch (AssertionError var8) {
               var10000 = var8;
               var10001 = false;
            }
         } else {
            label58: {
               long var3;
               try {
                  var7.c += var2;
                  var3 = var1.b;
               } catch (AssertionError var10) {
                  var10000 = var10;
                  var10001 = false;
                  break label58;
               }

               long var5 = (long)var2;

               try {
                  var1.b = var3 + var5;
                  return var5;
               } catch (AssertionError var9) {
                  var10000 = var9;
                  var10001 = false;
               }
            }
         }
      }

      AssertionError var14 = var10000;
      var2 = rlz.a;
      if (var14.getCause() != null) {
         String var15 = var14.getMessage();
         if (var15 != null && qwp.p(var15, "getsockname failed")) {
            throw new IOException(var14);
         }
      }

      throw var14;
   }

   public final String toString() {
      InputStream var1 = this.a;
      StringBuilder var2 = new StringBuilder();
      var2.append("source(");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }
}
