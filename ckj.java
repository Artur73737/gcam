import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class ckj {
   public final int a;
   public final int b;
   public final long c;
   public final byte[] d;

   public ckj(int var1, int var2, long var3, byte[] var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var5;
   }

   public ckj(int var1, int var2, byte[] var3) {
      this(var1, var2, -1L, var3);
   }

   public static ckj b(String var0) {
      StringBuilder var1 = new StringBuilder();
      var1.append(var0);
      var1.append('\u0000');
      byte[] var2 = var1.toString().getBytes(ckl.g);
      return new ckj(2, var2.length, var2);
   }

   public static ckj c(long var0, ByteOrder var2) {
      int var3 = 0;
      ByteBuffer var4 = ByteBuffer.wrap(new byte[ckl.e[4]]);
      var4.order(var2);

      while(var3 <= 0) {
         var4.putInt((int)(new long[]{var0})[var3]);
         ++var3;
      }

      return new ckj(4, 1, var4.array());
   }

   public static ckj d(ckk var0, ByteOrder var1) {
      int var2 = 0;
      ByteBuffer var3 = ByteBuffer.wrap(new byte[ckl.e[5]]);
      var3.order(var1);

      while(var2 <= 0) {
         ckk var4 = (new ckk[]{var0})[var2];
         var3.putInt((int)var4.a);
         var3.putInt((int)var4.b);
         ++var2;
      }

      return new ckj(5, 1, var3.array());
   }

   public static ckj e(int var0, ByteOrder var1) {
      ByteBuffer var3 = ByteBuffer.wrap(new byte[ckl.e[3]]);
      var3.order(var1);

      for(int var2 = 0; var2 <= 0; ++var2) {
         var3.putShort((short)(new int[]{var0})[var2]);
      }

      return new ckj(3, 1, var3.array());
   }

   public final int a(ByteOrder var1) {
      Object var2 = this.f(var1);
      if (var2 != null) {
         if (var2 instanceof String) {
            return Integer.parseInt((String)var2);
         } else if (var2 instanceof long[]) {
            long[] var4 = (long[])var2;
            if (var4.length == 1) {
               return (int)var4[0];
            } else {
               throw new NumberFormatException("There are more than one component");
            }
         } else if (var2 instanceof int[]) {
            int[] var3 = (int[])var2;
            if (var3.length == 1) {
               return var3[0];
            } else {
               throw new NumberFormatException("There are more than one component");
            }
         } else {
            throw new NumberFormatException("Couldn't find a integer value");
         }
      } else {
         throw new NumberFormatException("NULL can't be converted to a integer value");
      }
   }

   final Object f(ByteOrder param1) {
      // $FF: Couldn't be decompiled
   }

   public final String g(ByteOrder var1) {
      Object var7 = this.f(var1);
      if (var7 == null) {
         return null;
      } else if (var7 instanceof String) {
         return (String)var7;
      } else {
         StringBuilder var8 = new StringBuilder();
         boolean var6 = var7 instanceof long[];
         int var2 = 0;
         byte var3 = 0;
         byte var4 = 0;
         byte var5 = 0;
         int var9;
         int var10;
         if (var6) {
            long[] var14 = (long[])var7;
            var2 = var5;

            while(true) {
               var10 = var14.length;
               if (var2 >= var10) {
                  return var8.toString();
               }

               var8.append(var14[var2]);
               var9 = var2 + 1;
               var2 = var9;
               if (var9 != var10) {
                  var8.append(",");
                  var2 = var9;
               }
            }
         } else if (var7 instanceof int[]) {
            int[] var13 = (int[])var7;

            while(true) {
               var10 = var13.length;
               if (var2 >= var10) {
                  return var8.toString();
               }

               var8.append(var13[var2]);
               var9 = var2 + 1;
               var2 = var9;
               if (var9 != var10) {
                  var8.append(",");
                  var2 = var9;
               }
            }
         } else if (var7 instanceof double[]) {
            double[] var12 = (double[])var7;
            var2 = var3;

            while(true) {
               var10 = var12.length;
               if (var2 >= var10) {
                  return var8.toString();
               }

               var8.append(var12[var2]);
               var9 = var2 + 1;
               var2 = var9;
               if (var9 != var10) {
                  var8.append(",");
                  var2 = var9;
               }
            }
         } else if (var7 instanceof ckk[]) {
            ckk[] var11 = (ckk[])var7;
            var2 = var4;

            while(true) {
               var10 = var11.length;
               if (var2 >= var10) {
                  return var8.toString();
               }

               var8.append(var11[var2].a);
               var8.append('/');
               var8.append(var11[var2].b);
               var9 = var2 + 1;
               var2 = var9;
               if (var9 != var10) {
                  var8.append(",");
                  var2 = var9;
               }
            }
         } else {
            return null;
         }
      }
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("(");
      var1.append(ckl.d[this.a]);
      var1.append(", data length:");
      var1.append(this.d.length);
      var1.append(")");
      return var1.toString();
   }
}
