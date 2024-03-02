import java.io.OutputStream;

public final class dhr extends OutputStream {
   public int a = 0;
   private final OutputStream b;

   public dhr(OutputStream var1) {
      this.b = var1;
   }

   public final void write(int var1) {
      this.b.write(var1);
      ++this.a;
   }

   public final void write(byte[] var1) {
      this.b.write(var1);
      this.a += var1.length;
   }

   public final void write(byte[] var1, int var2, int var3) {
      this.b.write(var1, var2, var3);
      this.a += var3;
   }
}
