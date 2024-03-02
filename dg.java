import java.io.Writer;

final class dg extends Writer {
   private final StringBuilder a = new StringBuilder(128);

   public dg() {
   }

   private final void a() {
      if (this.a.length() > 0) {
         this.a.toString();
         StringBuilder var1 = this.a;
         var1.delete(0, var1.length());
      }

   }

   public final void close() {
      this.a();
   }

   public final void flush() {
      this.a();
   }

   public final void write(char[] var1, int var2, int var3) {
      for(int var5 = 0; var5 < var3; ++var5) {
         char var4 = var1[var2 + var5];
         if (var4 == '\n') {
            this.a();
         } else {
            this.a.append(var4);
         }
      }

   }
}
