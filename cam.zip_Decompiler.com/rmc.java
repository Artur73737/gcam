import com.google.lullaby.modules.audio.nwj.OtvMV;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class rmc implements rlw {
   public final rmg a;
   public final rlv b;
   public boolean c;

   public rmc(rmg var1) {
      this.a = var1;
      this.b = new rlv();
   }

   public final void close() {
      if (!this.c) {
         this.c = true;
         this.a.close();
         this.b.k();
      }

   }

   public final long d(rlx var1) {
      rlx var16 = var1;
      var1.getClass();
      if (this.c) {
         IllegalStateException var20 = new IllegalStateException("closed");
         throw var20;
      } else {
         long var6 = 0L;

         while(true) {
            rlv var18 = this.b;
            if (var1.b() <= 0) {
               throw new IllegalArgumentException("bytes is empty");
            }

            if (var6 < 0L) {
               throw new IllegalArgumentException(doe.c(var6, "fromIndex < 0: "));
            }

            rmd var17 = var18.a;
            long var8;
            if (var17 == null) {
               var8 = var6;
               var6 = -1L;
            } else {
               var8 = var18.b;
               int var2;
               int var5;
               long var10;
               long var12;
               long var14;
               byte[] var19;
               rmd var23;
               if (var8 - var6 < var6) {
                  while(var8 > var6) {
                     var17 = var17.g;
                     var17.getClass();
                     var8 -= (long)(var17.c - var17.b);
                  }

                  if (var17 == null) {
                     var8 = var6;
                     var6 = -1L;
                  } else {
                     var19 = var16.b;
                     byte var22 = var19[0];
                     int var21 = var1.b();
                     var12 = var18.b - (long)var21 + 1L;
                     var23 = var17;
                     var10 = var6;

                     label77:
                     while(true) {
                        if (var8 >= var12) {
                           var16 = var1;
                           var8 = var6;
                           var6 = -1L;
                           break;
                        }

                        byte[] var24 = var23.a;
                        var2 = var23.c;
                        var14 = (long)var23.b;
                        var5 = (int)Math.min((long)var2, var14 + var12 - var8);

                        for(var2 = (int)((long)var23.b + var10 - var8); var2 < var5; ++var2) {
                           if (var24[var2] == var22 && rmh.a(var23, var2 + 1, var19, var21)) {
                              var10 = (long)(var2 - var23.b) + var8;
                              var16 = var1;
                              var8 = var6;
                              var6 = var10;
                              break label77;
                           }
                        }

                        var10 = var8 + (long)(var23.c - var23.b);
                        var23 = var23.f;
                        var23.getClass();
                        var8 = var10;
                     }
                  }
               } else {
                  var8 = 0L;
                  var23 = var17;

                  label98:
                  while(true) {
                     var10 = (long)(var23.c - var23.b) + var8;
                     if (var10 > var6) {
                        if (var23 == null) {
                           var8 = var6;
                           var6 = -1L;
                           var16 = var1;
                        } else {
                           var19 = var1.b;
                           byte var3 = var19[0];
                           int var4 = var1.b();
                           var14 = var18.b - (long)var4 + 1L;
                           var10 = var6;

                           for(var12 = var8; var12 < var14; var6 = var8) {
                              byte[] var26 = var23.a;
                              var5 = var23.c;
                              var2 = var23.b;
                              var8 = var6;
                              var6 = (long)var2;
                              var5 = (int)Math.min((long)var5, var6 + var14 - var12);

                              for(var2 = (int)((long)var23.b + var10 - var12); var2 < var5; ++var2) {
                                 if (var26[var2] == var3 && rmh.a(var23, var2 + 1, var19, var4)) {
                                    var6 = var12 + (long)(var2 - var23.b);
                                    var16 = var1;
                                    break label98;
                                 }
                              }

                              var10 = var12 + (long)(var23.c - var23.b);
                              var23 = var23.f;
                              var23.getClass();
                              var12 = var10;
                           }

                           var10 = -1L;
                           var8 = var6;
                           var16 = var1;
                           var6 = var10;
                        }
                        break;
                     }

                     var23 = var23.f;
                     var23.getClass();
                     var8 = var10;
                  }
               }
            }

            if (var6 != -1L) {
               break;
            }

            rlv var25 = this.b;
            var6 = var25.b;
            if (this.a.t(var25) == -1L) {
               var6 = -1L;
               break;
            }

            var6 = Math.max(var8, var6 - (long)var1.b() + 1L);
         }

         return var6;
      }
   }

   public final long e(rlx var1) {
      var1.getClass();
      if (this.c) {
         IllegalStateException var19 = new IllegalStateException("closed");
         throw var19;
      } else {
         long var9 = 0L;

         long var7;
         while(true) {
            rlv var16 = this.b;
            if (var9 < 0L) {
               throw new IllegalArgumentException(doe.c(var9, "fromIndex < 0: "));
            }

            rmd var15 = var16.a;
            if (var15 == null) {
               var7 = -1L;
            } else {
               label211: {
                  var7 = var16.b;
                  int var2;
                  int var3;
                  byte var5;
                  byte var6;
                  long var11;
                  long var13;
                  byte[] var17;
                  byte[] var18;
                  int var21;
                  int var22;
                  if (var7 - var9 < var9) {
                     while(var7 > var9) {
                        var15 = var15.g;
                        var15.getClass();
                        var7 -= (long)(var15.c - var15.b);
                     }

                     if (var15 == null) {
                        var7 = -1L;
                        break label211;
                     }

                     if (var1.b() != 2) {
                        var17 = var1.b;
                        var11 = var7;

                        for(var7 = var9; var11 < var16.b; var11 = var7) {
                           var18 = var15.a;
                           var13 = (long)var15.b;
                           var21 = var15.c;

                           for(var2 = (int)(var13 + var7 - var11); var2 < var21; ++var2) {
                              var6 = var18[var2];
                              var22 = var17.length;

                              for(var3 = 0; var3 < var22; ++var3) {
                                 if (var6 == var17[var3]) {
                                    var7 = (long)(var2 - var15.b) + var11;
                                    break label211;
                                 }
                              }
                           }

                           var7 = (long)(var15.c - var15.b) + var11;
                           var15 = var15.f;
                           var15.getClass();
                        }

                        var7 = -1L;
                        break label211;
                     }

                     var5 = var1.a(0);
                     byte var20 = var1.a(1);

                     for(var11 = var9; var7 < var16.b; var7 = var11) {
                        var17 = var15.a;
                        var13 = (long)var15.b;
                        var21 = var15.c;

                        for(var2 = (int)(var13 + var11 - var7); var2 < var21; ++var2) {
                           var6 = var17[var2];
                           if (var6 == var5 || var6 == var20) {
                              var7 += (long)(var2 - var15.b);
                              break label211;
                           }
                        }

                        var11 = var7 + (long)(var15.c - var15.b);
                        var15 = var15.f;
                        var15.getClass();
                     }
                  } else {
                     var7 = 0L;

                     while(true) {
                        var11 = (long)(var15.c - var15.b) + var7;
                        if (var11 > var9) {
                           if (var15 == null) {
                              var7 = -1L;
                              break label211;
                           }

                           if (var1.b() != 2) {
                              var17 = var1.b;

                              for(var11 = var9; var7 < var16.b; var7 = var11) {
                                 var18 = var15.a;
                                 var13 = (long)var15.b;
                                 var21 = var15.c;

                                 for(var2 = (int)(var13 + var11 - var7); var2 < var21; ++var2) {
                                    var6 = var18[var2];
                                    var22 = var17.length;

                                    for(var3 = 0; var3 < var22; ++var3) {
                                       if (var6 == var17[var3]) {
                                          var7 += (long)(var2 - var15.b);
                                          break label211;
                                       }
                                    }
                                 }

                                 var11 = (long)(var15.c - var15.b) + var7;
                                 var15 = var15.f;
                                 var15.getClass();
                              }

                              var7 = -1L;
                              break label211;
                           }

                           var5 = var1.a(0);
                           byte var4 = var1.a(1);

                           for(var11 = var9; var7 < var16.b; var7 = var11) {
                              var17 = var15.a;
                              var13 = (long)var15.b;
                              var3 = var15.c;

                              for(var2 = (int)(var13 + var11 - var7); var2 < var3; ++var2) {
                                 var6 = var17[var2];
                                 if (var6 == var5 || var6 == var4) {
                                    var7 += (long)(var2 - var15.b);
                                    break label211;
                                 }
                              }

                              var11 = (long)(var15.c - var15.b) + var7;
                              var15 = var15.f;
                              var15.getClass();
                           }
                           break;
                        }

                        var15 = var15.f;
                        var15.getClass();
                        var7 = var11;
                     }
                  }

                  var7 = -1L;
               }
            }

            if (var7 != -1L) {
               break;
            }

            rlv var23 = this.b;
            var7 = var23.b;
            if (this.a.t(var23) == -1L) {
               var7 = -1L;
               break;
            }

            var9 = Math.max(var9, var7);
         }

         return var7;
      }
   }

   public final InputStream f() {
      return new rmb(this);
   }

   public final boolean isOpen() {
      return !this.c;
   }

   public final boolean m(long var1) {
      if (var1 < 0L) {
         IllegalArgumentException var5 = new IllegalArgumentException(doe.c(var1, "byteCount < 0: "));
         throw var5;
      } else if (this.c) {
         throw new IllegalStateException("closed");
      } else {
         boolean var3;
         while(true) {
            rlv var4 = this.b;
            if (var4.b < var1) {
               if (this.a.t(var4) != -1L) {
                  continue;
               }

               var3 = false;
               break;
            }

            var3 = true;
            break;
         }

         return var3;
      }
   }

   public final int read(ByteBuffer var1) {
      var1.getClass();
      rlv var2 = this.b;
      return var2.b == 0L && this.a.t(var2) == -1L ? -1 : this.b.read(var1);
   }

   public final long t(rlv var1) {
      throw null;
   }

   public final String toString() {
      rmg var2 = this.a;
      StringBuilder var1 = new StringBuilder();
      var1.append("buffer(");
      var1.append(var2);
      var1.append(OtvMV.TAPFGUTE);
      return var1.toString();
   }
}
