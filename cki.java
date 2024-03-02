import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;

final class cki extends InputStream implements DataInput, InputStreamRetargetInterface {
   protected final DataInputStream a;
   protected int b;
   public ByteOrder c;
   public int d;
   private byte[] e;

   public cki(InputStream var1) {
      this(var1, ByteOrder.BIG_ENDIAN);
   }

   public cki(InputStream var1, ByteOrder var2) {
      DataInputStream var4 = new DataInputStream(var1);
      this.a = var4;
      var4.mark(0);
      this.b = 0;
      this.c = var2;
      int var3;
      if (var1 instanceof cki) {
         var3 = ((cki)var1).d;
      } else {
         var3 = -1;
      }

      this.d = var3;
   }

   public cki(InputStream var1, byte[] var2) {
      this(var1);
      if (var1.markSupported()) {
         this.a.mark(Integer.MAX_VALUE);
      } else {
         throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
      }
   }

   public cki(byte[] var1) {
      this((InputStream)(new ByteArrayInputStream(var1)), (ByteOrder)ByteOrder.BIG_ENDIAN);
      this.d = var1.length;
   }

   public cki(byte[] var1, byte[] var2) {
      this(var1);
      this.a.mark(Integer.MAX_VALUE);
   }

   public final long a() {
      return (long)this.readInt() & 4294967295L;
   }

   public final int available() {
      return this.a.available();
   }

   public final void b(int var1) {
      int var2;
      int var3;
      for(var2 = 0; var2 < var1; var2 += var3) {
         DataInputStream var6 = this.a;
         int var5 = var1 - var2;
         int var4 = (int)var6.skip((long)var5);
         var3 = var4;
         if (var4 <= 0) {
            if (this.e == null) {
               this.e = new byte[8192];
            }

            var3 = Math.min(8192, var5);
            var3 = this.a.read(this.e, 0, var3);
            if (var3 == -1) {
               throw new EOFException(c.aK(var1, "Reached EOF while skipping ", " bytes."));
            }
         }
      }

      this.b += var2;
   }

   public final void c(long var1) {
      long var3 = (long)this.b;
      if (var3 > var1) {
         this.b = 0;
         this.a.reset();
      } else {
         var1 -= var3;
      }

      this.b((int)var1);
   }

   public final void mark(int var1) {
      throw new UnsupportedOperationException("Mark is currently unsupported");
   }

   public final int read() {
      ++this.b;
      return this.a.read();
   }

   public final int read(byte[] var1, int var2, int var3) {
      var2 = this.a.read(var1, var2, var3);
      this.b += var2;
      return var2;
   }

   public final boolean readBoolean() {
      ++this.b;
      return this.a.readBoolean();
   }

   public final byte readByte() {
      ++this.b;
      int var1 = this.a.read();
      if (var1 >= 0) {
         return (byte)var1;
      } else {
         throw new EOFException();
      }
   }

   public final char readChar() {
      this.b += 2;
      return this.a.readChar();
   }

   public final double readDouble() {
      return Double.longBitsToDouble(this.readLong());
   }

   public final float readFloat() {
      return Float.intBitsToFloat(this.readInt());
   }

   public final void readFully(byte[] var1) {
      this.b += var1.length;
      this.a.readFully(var1);
   }

   public final void readFully(byte[] var1, int var2, int var3) {
      this.b += var3;
      this.a.readFully(var1, var2, var3);
   }

   public final int readInt() {
      this.b += 4;
      int var3 = this.a.read();
      int var1 = this.a.read();
      int var4 = this.a.read();
      int var2 = this.a.read();
      if ((var3 | var1 | var4 | var2) >= 0) {
         if (this.c == ByteOrder.LITTLE_ENDIAN) {
            return (var2 << 24) + (var4 << 16) + (var1 << 8) + var3;
         } else if (this.c == ByteOrder.BIG_ENDIAN) {
            return (var3 << 24) + (var1 << 16) + (var4 << 8) + var2;
         } else {
            StringBuilder var6 = new StringBuilder();
            var6.append("Invalid byte order: ");
            ByteOrder var5 = this.c;
            var6.append(var5);
            throw new IOException("Invalid byte order: ".concat(String.valueOf(var5)));
         }
      } else {
         throw new EOFException();
      }
   }

   public final String readLine() {
      return null;
   }

   public final long readLong() {
      this.b += 8;
      int var1 = this.a.read();
      int var7 = this.a.read();
      int var8 = this.a.read();
      int var5 = this.a.read();
      int var6 = this.a.read();
      int var4 = this.a.read();
      int var2 = this.a.read();
      int var3 = this.a.read();
      if ((var1 | var7 | var8 | var5 | var6 | var4 | var2 | var3) >= 0) {
         if (this.c == ByteOrder.LITTLE_ENDIAN) {
            return ((long)var3 << 56) + ((long)var2 << 48) + ((long)var4 << 40) + ((long)var6 << 32) + ((long)var5 << 24) + ((long)var8 << 16) + ((long)var7 << 8) + (long)var1;
         } else if (this.c == ByteOrder.BIG_ENDIAN) {
            return ((long)var1 << 56) + ((long)var7 << 48) + ((long)var8 << 40) + ((long)var5 << 32) + ((long)var6 << 24) + ((long)var4 << 16) + ((long)var2 << 8) + (long)var3;
         } else {
            StringBuilder var9 = new StringBuilder();
            var9.append("Invalid byte order: ");
            ByteOrder var10 = this.c;
            var9.append(var10);
            throw new IOException("Invalid byte order: ".concat(String.valueOf(var10)));
         }
      } else {
         throw new EOFException();
      }
   }

   public final short readShort() {
      this.b += 2;
      int var1 = this.a.read();
      int var2 = this.a.read();
      if ((var1 | var2) >= 0) {
         if (this.c == ByteOrder.LITTLE_ENDIAN) {
            return (short)((var2 << 8) + var1);
         } else if (this.c == ByteOrder.BIG_ENDIAN) {
            return (short)((var1 << 8) + var2);
         } else {
            StringBuilder var3 = new StringBuilder();
            var3.append("Invalid byte order: ");
            ByteOrder var4 = this.c;
            var3.append(var4);
            throw new IOException("Invalid byte order: ".concat(String.valueOf(var4)));
         }
      } else {
         throw new EOFException();
      }
   }

   public final String readUTF() {
      this.b += 2;
      return this.a.readUTF();
   }

   public final int readUnsignedByte() {
      ++this.b;
      return this.a.readUnsignedByte();
   }

   public final int readUnsignedShort() {
      this.b += 2;
      int var2 = this.a.read();
      int var1 = this.a.read();
      if ((var2 | var1) >= 0) {
         if (this.c == ByteOrder.LITTLE_ENDIAN) {
            return (var1 << 8) + var2;
         } else if (this.c == ByteOrder.BIG_ENDIAN) {
            return (var2 << 8) + var1;
         } else {
            StringBuilder var4 = new StringBuilder();
            var4.append("Invalid byte order: ");
            ByteOrder var3 = this.c;
            var4.append(var3);
            throw new IOException("Invalid byte order: ".concat(String.valueOf(var3)));
         }
      } else {
         throw new EOFException();
      }
   }

   public final void reset() {
      throw new UnsupportedOperationException("Reset is currently unsupported");
   }

   public final int skipBytes(int var1) {
      throw new UnsupportedOperationException("skipBytes is currently unsupported");
   }

   // $FF: synthetic method
   public final long transferTo(OutputStream var1) {
      return DesugarInputStream.transferTo(this, var1);
   }
}
