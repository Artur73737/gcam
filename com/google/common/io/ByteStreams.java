package com.google.common.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public final class ByteStreams {
   private static final int BUFFER_SIZE = 8192;
   private static final int MAX_ARRAY_LEN = 2147483639;
   private static final OutputStream NULL_OUTPUT_STREAM = new .pik();
   private static final int TO_BYTE_ARRAY_DEQUE_SIZE = 20;
   private static final int ZERO_COPY_CHUNK_SIZE = 524288;

   private ByteStreams() {
   }

   private static byte[] combineBuffers(Queue var0, int var1) {
      if (var0.isEmpty()) {
         return new byte[0];
      } else {
         byte[] var4 = (byte[])var0.remove();
         int var2 = var4.length;
         if (var2 == var1) {
            return var4;
         } else {
            byte[] var5 = Arrays.copyOf(var4, var1);

            int var3;
            for(var2 = var1 - var2; var2 > 0; var2 -= var3) {
               var4 = (byte[])var0.remove();
               var3 = Math.min(var2, var4.length);
               System.arraycopy(var4, 0, var5, var1 - var2, var3);
            }

            return var5;
         }
      }
   }

   public static long copy(InputStream var0, OutputStream var1) {
      var0.getClass();
      var1.getClass();
      byte[] var5 = createBuffer();
      long var3 = 0L;

      while(true) {
         int var2 = var0.read(var5);
         if (var2 == -1) {
            return var3;
         }

         var1.write(var5, 0, var2);
         var3 += (long)var2;
      }
   }

   public static long copy(ReadableByteChannel var0, WritableByteChannel var1) {
      var0.getClass();
      var1.getClass();
      boolean var8 = var0 instanceof FileChannel;
      long var2 = 0L;
      if (var8) {
         FileChannel var10 = (FileChannel)var0;
         long var4 = var10.position();
         var2 = var4;

         long var6;
         do {
            do {
               var6 = var10.transferTo(var2, 524288L, var1);
               var2 += var6;
               var10.position(var2);
            } while(var6 > 0L);
         } while(var2 < var10.size());

         return var2 - var4;
      } else {
         ByteBuffer var9 = ByteBuffer.wrap(createBuffer());

         while(var0.read(var9) != -1) {
            var9.flip();

            while(var9.hasRemaining()) {
               var2 += (long)var1.write(var9);
            }

            var9.clear();
         }

         return var2;
      }
   }

   static byte[] createBuffer() {
      return new byte[8192];
   }

   public static long exhaust(InputStream var0) {
      byte[] var5 = createBuffer();
      long var1 = 0L;

      while(true) {
         long var3 = (long)var0.read(var5);
         if (var3 == -1L) {
            return var1;
         }

         var1 += var3;
      }
   }

   public static InputStream limit(InputStream var0, long var1) {
      return new .pin(var0, var1);
   }

   public static .pih newDataInput(ByteArrayInputStream var0) {
      var0.getClass();
      return new .pil(var0);
   }

   public static .pih newDataInput(byte[] var0) {
      return newDataInput(new ByteArrayInputStream(var0));
   }

   public static .pih newDataInput(byte[] var0, int var1) {
      int var2 = var0.length;
      .onk.P(var1, var2);
      return newDataInput(new ByteArrayInputStream(var0, var1, var2 - var1));
   }

   public static .pii newDataOutput() {
      return newDataOutput(new ByteArrayOutputStream());
   }

   public static .pii newDataOutput(int var0) {
      if (var0 >= 0) {
         return newDataOutput(new ByteArrayOutputStream(var0));
      } else {
         throw new IllegalArgumentException(String.format("Invalid size: %s", var0));
      }
   }

   public static .pii newDataOutput(ByteArrayOutputStream var0) {
      var0.getClass();
      return new .pim(var0);
   }

   public static OutputStream nullOutputStream() {
      return NULL_OUTPUT_STREAM;
   }

   public static int read(InputStream var0, byte[] var1, int var2, int var3) {
      var0.getClass();
      var1.getClass();
      int var4 = 0;
      if (var3 < 0) {
         IndexOutOfBoundsException var6 = new IndexOutOfBoundsException(String.format("len (%s) cannot be negative", var3));
         throw var6;
      } else {
         .onk.G(var2, var2 + var3, var1.length);

         while(var4 < var3) {
            int var5 = var0.read(var1, var2 + var4, var3 - var4);
            if (var5 == -1) {
               break;
            }

            var4 += var5;
         }

         return var4;
      }
   }

   public static Object readBytes(InputStream var0, .pij var1) {
      var0.getClass();
      var1.getClass();
      byte[] var2 = createBuffer();

      while(var0.read(var2) != -1 && var1.b()) {
      }

      return var1.a();
   }

   public static void readFully(InputStream var0, byte[] var1) {
      readFully(var0, var1, 0, var1.length);
   }

   public static void readFully(InputStream var0, byte[] var1, int var2, int var3) {
      var2 = read(var0, var1, var2, var3);
      if (var2 != var3) {
         throw new EOFException(.c.aI(var3, var2, "reached end of stream after reading ", " bytes; ", " bytes expected"));
      }
   }

   public static void skipFully(InputStream var0, long var1) {
      long var3 = skipUpTo(var0, var1);
      if (var3 < var1) {
         StringBuilder var5 = new StringBuilder();
         var5.append("reached end of stream after skipping ");
         var5.append(var3);
         var5.append(" bytes; ");
         var5.append(var1);
         var5.append(" bytes expected");
         throw new EOFException(var5.toString());
      }
   }

   private static long skipSafely(InputStream var0, long var1) {
      int var3 = var0.available();
      return var3 == 0 ? 0L : var0.skip(Math.min((long)var3, var1));
   }

   static long skipUpTo(InputStream var0, long var1) {
      byte[] var12 = null;

      long var4;
      byte[] var13;
      for(var4 = 0L; var4 < var1; var12 = var13) {
         long var10 = var1 - var4;
         long var8 = skipSafely(var0, var10);
         var13 = var12;
         long var6 = var8;
         if (var8 == 0L) {
            int var3 = (int)Math.min(var10, 8192L);
            var13 = var12;
            if (var12 == null) {
               var13 = new byte[var3];
            }

            var6 = (long)var0.read(var13, 0, var3);
            if (var6 == -1L) {
               break;
            }
         }

         var4 += var6;
      }

      return var4;
   }

   public static byte[] toByteArray(InputStream var0) {
      var0.getClass();
      return toByteArrayInternal(var0, new ArrayDeque(20), 0);
   }

   public static byte[] toByteArray(InputStream var0, long var1) {
      boolean var7;
      if (var1 >= 0L) {
         var7 = true;
      } else {
         var7 = false;
      }

      .onk.A(var7, "expectedSize (%s) must be non-negative", var1);
      if (var1 <= 2147483639L) {
         int var4 = (int)var1;
         byte[] var9 = new byte[var4];

         int var3;
         int var5;
         for(var3 = var4; var3 > 0; var3 -= var5) {
            int var6 = var4 - var3;
            var5 = var0.read(var9, var6, var3);
            if (var5 == -1) {
               return Arrays.copyOf(var9, var6);
            }
         }

         var3 = var0.read();
         if (var3 == -1) {
            return var9;
         } else {
            ArrayDeque var8 = new ArrayDeque(22);
            var8.add(var9);
            var8.add(new byte[]{(byte)var3});
            return toByteArrayInternal(var0, var8, var4 + 1);
         }
      } else {
         StringBuilder var10 = new StringBuilder();
         var10.append(var1);
         var10.append(" bytes is too large to fit in a byte array");
         OutOfMemoryError var11 = new OutOfMemoryError(var10.toString());
         throw var11;
      }
   }

   private static byte[] toByteArrayInternal(InputStream var0, Queue var1, int var2) {
      int var3 = Integer.highestOneBit(var2);
      int var4 = Math.min(8192, Math.max(128, var3 + var3));
      var3 = var2;

      byte var9;
      for(var2 = var4; var3 < 2147483639; var2 = .osh.aM((long)var2 * (long)var9)) {
         int var5 = Math.min(var2, 2147483639 - var3);
         byte[] var7 = new byte[var5];
         var1.add(var7);

         int var6;
         for(var4 = 0; var4 < var5; var3 += var6) {
            var6 = var0.read(var7, var4, var5 - var4);
            if (var6 == -1) {
               return combineBuffers(var1, var3);
            }

            var4 += var6;
         }

         if (var2 < 4096) {
            var9 = 4;
         } else {
            var9 = 2;
         }
      }

      if (var0.read() == -1) {
         return combineBuffers(var1, 2147483639);
      } else {
         OutOfMemoryError var8 = new OutOfMemoryError("input is too large to fit in a byte array");
         throw var8;
      }
   }
}
