import androidx.window.layout.adapter.sidecar.nk.OSGHH;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;

public final class rlv implements Cloneable, ByteChannel, Closeable, Flushable, WritableByteChannel, rlw {
   public rmd a;
   public long b;

   public final byte a(long var1) {
      qwp.O(this.b, var1, 1L);
      rmd var10 = this.a;
      if (var10 == null) {
         throw null;
      } else {
         long var6 = this.b;
         byte var3;
         if (var6 - var1 >= var1) {
            var6 = 0L;

            while(true) {
               int var5 = var10.c;
               int var4 = var10.b;
               long var8 = (long)(var5 - var4) + var6;
               if (var8 > var1) {
                  var10.getClass();
                  var8 = (long)var4;
                  var3 = var10.a[(int)(var8 + var1 - var6)];
                  break;
               }

               var10 = var10.f;
               var10.getClass();
               var6 = var8;
            }
         } else {
            while(var6 > var1) {
               var10 = var10.g;
               var10.getClass();
               var6 -= (long)(var10.c - var10.b);
            }

            var10.getClass();
            var3 = var10.a[(int)((long)var10.b + var1 - var6)];
         }

         return var3;
      }
   }

   public final byte b() {
      long var5 = this.b;
      if (var5 != 0L) {
         rmd var7 = this.a;
         var7.getClass();
         int var2 = var7.b;
         int var4 = var2 + 1;
         int var3 = var7.c;
         byte var1 = var7.a[var2];
         this.b = var5 - 1L;
         if (var4 == var3) {
            this.a = var7.a();
            rme.b(var7);
         } else {
            var7.b = var4;
         }

         return var1;
      } else {
         throw new EOFException();
      }
   }

   public final int c(byte[] var1, int var2, int var3) {
      qwp.O((long)var1.length, (long)var2, (long)var3);
      rmd var5 = this.a;
      if (var5 == null) {
         var2 = -1;
      } else {
         var3 = Math.min(var3, var5.c - var5.b);
         byte[] var6 = var5.a;
         int var4 = var5.b;
         pwm.be(var6, var1, var2, var4, var4 + var3);
         var2 = var5.b + var3;
         var5.b = var2;
         this.b -= (long)var3;
         if (var2 == var5.c) {
            this.a = var5.a();
            rme.b(var5);
            return var3;
         }

         var2 = var3;
      }

      return var2;
   }

   // $FF: synthetic method
   public final Object clone() {
      rlv var4 = new rlv();
      if (this.b != 0L) {
         rmd var2 = this.a;
         var2.getClass();
         rmd var3 = var2.b();
         var4.a = var3;
         var3.g = var3;
         var3.f = var3.g;

         for(rmd var1 = var2.f; var1 != var2; var1 = var1.f) {
            rmd var5 = var3.g;
            var5.getClass();
            var1.getClass();
            var5.d(var1.b());
         }

         var4.b = this.b;
      }

      return var4;
   }

   public final void close() {
   }

   public final long d(rlx var1) {
      throw null;
   }

   public final long e(rlx var1) {
      throw null;
   }

   public final boolean equals(Object var1) {
      boolean var11 = true;
      if (this != var1) {
         if (var1 instanceof rlv) {
            long var5 = this.b;
            rlv var14 = (rlv)var1;
            if (var5 == var14.b) {
               if (var5 != 0L) {
                  rmd var13 = this.a;
                  var13.getClass();
                  rmd var12 = var14.a;
                  var12.getClass();
                  int var3 = var13.b;
                  int var2 = var12.b;

                  int var4;
                  for(var5 = 0L; var5 < this.b; var2 = var4) {
                     long var9 = (long)Math.min(var13.c - var3, var12.c - var2);
                     long var7 = 0L;

                     for(var4 = var3; var7 < var9; ++var2) {
                        if (var13.a[var4] != var12.a[var2]) {
                           var11 = false;
                           return var11;
                        }

                        ++var7;
                        ++var4;
                     }

                     rmd var15 = var13;
                     var3 = var4;
                     if (var4 == var13.c) {
                        var15 = var13.f;
                        var15.getClass();
                        var3 = var15.b;
                     }

                     var13 = var12;
                     var4 = var2;
                     if (var2 == var12.c) {
                        var13 = var12.f;
                        var13.getClass();
                        var4 = var13.b;
                     }

                     var5 += var9;
                     var12 = var13;
                     var13 = var15;
                  }
               }

               return var11;
            }
         }

         var11 = false;
      }

      return var11;
   }

   public final InputStream f() {
      throw null;
   }

   public final void flush() {
   }

   public final String g(long var1, Charset var3) {
      var3.getClass();
      if (var1 >= 0L && var1 <= 2147483647L) {
         long var9 = this.b;
         if (var9 >= var1) {
            if (var1 == 0L) {
               return "";
            } else {
               rmd var11 = this.a;
               var11.getClass();
               int var6 = var11.b;
               long var7 = (long)var6;
               int var4 = var11.c;
               if (var7 + var1 > (long)var4) {
                  return new String(this.n(var1), var3);
               } else {
                  byte[] var12 = var11.a;
                  int var5 = (int)var1;
                  String var13 = new String(var12, var6, var5, var3);
                  var5 += var6;
                  var11.b = var5;
                  this.b = var9 - var1;
                  if (var5 == var4) {
                     this.a = var11.a();
                     rme.b(var11);
                  }

                  return var13;
               }
            }
         } else {
            throw new EOFException();
         }
      } else {
         throw new IllegalArgumentException(doe.c(var1, OSGHH.aEtuyGwrxS));
      }
   }

   public final String h(long var1) {
      return this.g(var1, qyk.a);
   }

   public final int hashCode() {
      rmd var5 = this.a;
      int var1;
      if (var5 == null) {
         var1 = 0;
      } else {
         int var2 = 1;

         rmd var6;
         do {
            int var3 = var5.b;
            int var4 = var5.c;

            for(var1 = var2; var3 < var4; ++var3) {
               var1 = var1 * 31 + var5.a[var3];
            }

            var6 = var5.f;
            var6.getClass();
            var5 = var6;
            var2 = var1;
         } while(var6 != this.a);
      }

      return var1;
   }

   public final rlx i(int var1) {
      Object var7;
      if (var1 == 0) {
         var7 = rlx.a;
      } else {
         qwp.O(this.b, 0L, (long)var1);
         rmd var10 = this.a;
         int var4 = 0;
         int var3 = 0;

         int var2;
         for(var2 = 0; var3 < var1; var10 = var10.f) {
            var10.getClass();
            int var6 = var10.c;
            int var5 = var10.b;
            if (var6 == var5) {
               throw new AssertionError("s.limit == s.pos");
            }

            var3 += var6 - var5;
            ++var2;
         }

         byte[][] var8 = new byte[var2][];
         int[] var9 = new int[var2 + var2];
         var10 = this.a;

         for(var3 = 0; var4 < var1; var10 = var10.f) {
            var10.getClass();
            var8[var3] = var10.a;
            var4 += var10.c - var10.b;
            var9[var3] = Math.min(var4, var1);
            var9[var3 + var2] = var10.b;
            var10.d = true;
            ++var3;
         }

         var7 = new rmf(var8, var9);
      }

      return (rlx)var7;
   }

   public final boolean isOpen() {
      return true;
   }

   public final rmd j(int var1) {
      rmd var2 = this.a;
      if (var2 == null) {
         var2 = rme.a();
         this.a = var2;
         var2.g = var2;
         var2.f = var2;
      } else {
         rmd var3 = var2.g;
         var3.getClass();
         if (var3.c + var1 <= 8192 && var3.e) {
            var2 = var3;
         } else {
            var2 = rme.a();
            var3.d(var2);
         }
      }

      return var2;
   }

   public final void k() {
      this.l(this.b);
   }

   public final void l(long var1) {
      while(true) {
         if (var1 > 0L) {
            rmd var8 = this.a;
            if (var8 != null) {
               int var3 = (int)Math.min(var1, (long)(var8.c - var8.b));
               long var4 = this.b;
               long var6 = (long)var3;
               this.b = var4 - var6;
               var1 -= var6;
               var3 += var8.b;
               var8.b = var3;
               if (var3 == var8.c) {
                  this.a = var8.a();
                  rme.b(var8);
               }
               continue;
            }

            throw new EOFException();
         }

         return;
      }
   }

   public final boolean m(long var1) {
      throw null;
   }

   public final byte[] n(long var1) {
      if (this.b >= var1) {
         int var4 = (int)var1;
         byte[] var7 = new byte[var4];

         int var5;
         for(int var3 = 0; var3 < var4; var3 += var5) {
            var5 = this.c(var7, var3, var4 - var3);
            if (var5 == -1) {
               throw new EOFException();
            }
         }

         return var7;
      } else {
         EOFException var6 = new EOFException();
         throw var6;
      }
   }

   public final void o(rmg var1) {
      long var8;
      do {
         rlv var15 = (rlv)var1;
         long var10 = var15.b;
         if (var10 == 0L) {
            var8 = -1L;
         } else {
            if (var10 < 8192L) {
               var8 = var10;
            } else {
               var8 = 8192L;
            }

            if (var1 == this) {
               IllegalArgumentException var19 = new IllegalArgumentException("source == this");
               throw var19;
            }

            qwp.O(var10, 0L, var8);

            long var12;
            for(var10 = var8; var10 > 0L; var10 -= var12) {
               rmd var16 = var15.a;
               var16.getClass();
               int var2 = var16.c;
               var16.getClass();
               int var4 = var2 - var16.b;
               var12 = (long)var4;
               byte var3 = 0;
               rmd var14;
               if (var10 < var12) {
                  var14 = this.a;
                  if (var14 != null) {
                     var14 = var14.g;
                  } else {
                     var14 = null;
                  }

                  if (var14 != null && var14.e) {
                     var12 = (long)var14.c;
                     if (var14.d) {
                        var2 = 0;
                     } else {
                        var2 = var14.b;
                     }

                     if (var12 + var10 - (long)var2 <= 8192L) {
                        var16.getClass();
                        var16.c(var14, (int)var10);
                        var15.b -= var10;
                        this.b += var10;
                        break;
                     }
                  }

                  var16.getClass();
                  var2 = (int)var10;
                  if (var2 > var4) {
                     throw new IllegalArgumentException("byteCount out of range");
                  }

                  if (var2 >= 1024) {
                     var14 = var16.b();
                  } else {
                     var14 = rme.a();
                     byte[] var17 = var16.a;
                     byte[] var18 = var14.a;
                     var4 = var16.b;
                     pwm.bi(var17, var18, var4, var4 + var2);
                  }

                  var14.c = var14.b + var2;
                  var16.b += var2;
                  var16 = var16.g;
                  var16.getClass();
                  var16.d(var14);
                  var15.a = var14;
               }

               var14 = var15.a;
               var14.getClass();
               int var5 = var14.c;
               var4 = var14.b;
               var15.a = var14.a();
               var16 = this.a;
               if (var16 == null) {
                  this.a = var14;
                  var14.g = var14;
                  var14.f = var14.g;
               } else {
                  var16 = var16.g;
                  var16.getClass();
                  var16.d(var14);
                  var16 = var14.g;
                  if (var16 == var14) {
                     throw new IllegalStateException("cannot compact");
                  }

                  var16.getClass();
                  if (var16.e) {
                     int var7 = var14.c - var14.b;
                     var16.getClass();
                     int var6 = var16.c;
                     var16.getClass();
                     if (var16.d) {
                        var2 = var3;
                     } else {
                        var16.getClass();
                        var2 = var16.b;
                     }

                     if (var7 <= 8192 - var6 + var2) {
                        var16.getClass();
                        var14.c(var16, var7);
                        var14.a();
                        rme.b(var14);
                     }
                  }
               }

               var12 = (long)(var5 - var4);
               var15.b -= var12;
               this.b += var12;
            }
         }
      } while(var8 != -1L);

   }

   public final void p(int var1) {
      rmd var4 = this.j(1);
      byte[] var3 = var4.a;
      int var2 = var4.c++;
      var3[var2] = (byte)var1;
      ++this.b;
   }

   public final void r(int var1) {
      rmd var4 = this.j(4);
      byte[] var5 = var4.a;
      int var3 = var4.c;
      int var2 = var3 + 1;
      var5[var3] = (byte)(var1 >> 24);
      var5[var2] = (byte)(var1 >>> 16 & 255);
      ++var2;
      var5[var2] = (byte)(var1 >>> 8 & 255);
      ++var2;
      var5[var2] = (byte)(var1 & 255);
      var4.c = var2 + 1;
      this.b += 4L;
   }

   public final int read(ByteBuffer var1) {
      var1.getClass();
      rmd var4 = this.a;
      if (var4 == null) {
         return -1;
      } else {
         int var2 = Math.min(var1.remaining(), var4.c - var4.b);
         var1.put(var4.a, var4.b, var2);
         int var3 = var4.b + var2;
         var4.b = var3;
         this.b -= (long)var2;
         if (var3 == var4.c) {
            this.a = var4.a();
            rme.b(var4);
         }

         return var2;
      }
   }

   public final void s(String var1, int var2, int var3) {
      var1.getClass();
      if (var2 < 0) {
         IllegalArgumentException var11 = new IllegalArgumentException(c.aE(var2, "beginIndex < 0: "));
         throw var11;
      } else if (var3 < var2) {
         throw new IllegalArgumentException(c.az(var2, var3, "endIndex < beginIndex: ", " < "));
      } else if (var3 > var1.length()) {
         var2 = var1.length();
         StringBuilder var10 = new StringBuilder();
         var10.append("endIndex > string.length: ");
         var10.append(var3);
         var10.append(" > ");
         var10.append(var2);
         throw new IllegalArgumentException(var10.toString());
      } else {
         while(true) {
            while(var2 < var3) {
               char var7 = var1.charAt(var2);
               int var5;
               int var6;
               rmd var8;
               byte[] var9;
               if (var7 < 128) {
                  byte var4 = (byte)var7;
                  var8 = this.j(1);
                  var9 = var8.a;
                  var5 = var8.c - var2;
                  var6 = Math.min(var3, 8192 - var5);
                  var9[var2 + var5] = var4;
                  ++var2;

                  while(var2 < var6) {
                     var7 = var1.charAt(var2);
                     if (var7 >= 128) {
                        break;
                     }

                     var9[var2 + var5] = (byte)var7;
                     ++var2;
                  }

                  var6 = var8.c;
                  var5 = var5 + var2 - var6;
                  var8.c = var6 + var5;
                  this.b += (long)var5;
               } else if (var7 < 2048) {
                  var8 = this.j(2);
                  var9 = var8.a;
                  var5 = var8.c;
                  var9[var5] = (byte)(var7 >> 6 | 192);
                  var9[var5 + 1] = (byte)(var7 & 63 | 128);
                  var8.c = var5 + 2;
                  this.b += 2L;
                  ++var2;
               } else if (var7 >= '\ud800' && var7 <= '\udfff') {
                  var6 = var2 + 1;
                  char var12;
                  if (var6 < var3) {
                     var12 = var1.charAt(var6);
                  } else {
                     var12 = 0;
                  }

                  if (var7 <= '\udbff' && var12 >= '\udc00' && var12 < '\ue000') {
                     rmd var14 = this.j(4);
                     byte[] var13 = var14.a;
                     var6 = var14.c;
                     var5 = ((var7 & 1023) << 10 | var12 & 1023) + 65536;
                     var13[var6] = (byte)(var5 >> 18 | 240);
                     var13[var6 + 1] = (byte)(var5 >> 12 & 63 | 128);
                     var13[var6 + 2] = (byte)(var5 >> 6 & 63 | 128);
                     var13[var6 + 3] = (byte)(var5 & 63 | 128);
                     var14.c = var6 + 4;
                     this.b += 4L;
                     var2 += 2;
                  } else {
                     this.p(63);
                     var2 = var6;
                  }
               } else {
                  var8 = this.j(3);
                  var9 = var8.a;
                  var5 = var8.c;
                  var9[var5] = (byte)(var7 >> 12 | 224);
                  var9[var5 + 1] = (byte)(63 & var7 >> 6 | 128);
                  var9[var5 + 2] = (byte)(var7 & 63 | 128);
                  var8.c = var5 + 3;
                  this.b += 3L;
                  ++var2;
               }
            }

            return;
         }
      }
   }

   public final long t(rlv var1) {
      throw null;
   }

   public final String toString() {
      long var1 = this.b;
      if (var1 <= 2147483647L) {
         return this.i((int)var1).toString();
      } else {
         throw new IllegalStateException(doe.c(var1, "size > Int.MAX_VALUE: "));
      }
   }

   public final int write(ByteBuffer var1) {
      var1.getClass();
      int var3 = var1.remaining();

      int var4;
      rmd var5;
      for(int var2 = var3; var2 > 0; var5.c += var4) {
         var5 = this.j(1);
         var4 = Math.min(var2, 8192 - var5.c);
         var1.get(var5.a, var5.c, var4);
         var2 -= var4;
      }

      this.b += (long)var3;
      return var3;
   }
}
