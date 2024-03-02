import java.util.Arrays;

public final class con {
   public static final float[] a = new float[]{1.0F, 1.0F, 1.0909091F, 0.90909094F, 1.4545455F, 1.2121212F, 2.1818182F, 1.8181819F, 2.909091F, 2.4242425F, 1.6363636F, 1.3636364F, 1.939394F, 1.6161616F, 1.3333334F, 1.5F, 2.0F};

   public static orc a(byte[] var0, int var1) {
      int var3;
      byte var10;
      int var11;
      int var12;
      coo var15;
      label119: {
         var15 = new coo(var0, 1, var1);
         int var4 = var15.a(8);
         var12 = var15.a(8);
         var11 = var15.a(8);
         var15.b();
         var10 = 0;
         var1 = var4;
         if (var4 != 100) {
            var1 = var4;
            if (var4 != 110) {
               var1 = var4;
               if (var4 != 122) {
                  var1 = var4;
                  if (var4 != 244) {
                     var1 = var4;
                     if (var4 != 44) {
                        var1 = var4;
                        if (var4 != 83) {
                           var1 = var4;
                           if (var4 != 86) {
                              var1 = var4;
                              if (var4 != 118) {
                                 var1 = var4;
                                 if (var4 != 128) {
                                    var3 = var4;
                                    if (var4 != 138) {
                                       break label119;
                                    }

                                    var1 = 138;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         var3 = var15.b();
         var4 = var3;
         if (var3 == 3) {
            var15.f();
            var4 = 3;
         }

         var15.b();
         var15.b();
         var15.d();
         var3 = var1;
         if (var15.f()) {
            byte var16;
            if (var4 != 3) {
               var16 = 8;
            } else {
               var16 = 12;
            }

            int var5 = 0;

            while(true) {
               var3 = var1;
               if (var5 >= var16) {
                  break;
               }

               if (var15.f()) {
                  byte var6;
                  if (var5 < 6) {
                     var6 = 16;
                  } else {
                     var6 = 64;
                  }

                  int var8 = 0;
                  int var9 = 8;

                  for(int var7 = 8; var8 < var6; var9 = var3) {
                     var3 = var9;
                     if (var9 != 0) {
                        var3 = (var15.c() + var7 + 256) % 256;
                     }

                     if (var3 != 0) {
                        var7 = var3;
                     }

                     ++var8;
                  }
               }

               ++var5;
            }
         }
      }

      var15.b();
      var1 = var15.b();
      if (var1 == 0) {
         var15.b();
      } else if (var1 == 1) {
         var15.f();
         var15.c();
         var15.c();
         long var13 = (long)var15.b();

         for(var1 = var10; (long)var1 < var13; ++var1) {
            var15.b();
         }
      }

      var15.b();
      var15.d();
      var15.b();
      var15.b();
      if (!var15.f()) {
         var15.d();
      }

      var15.d();
      if (var15.f()) {
         var15.b();
         var15.b();
         var15.b();
         var15.b();
      }

      if (var15.f()) {
         if (var15.f()) {
            var1 = var15.a(8);
            if (var1 == 255) {
               var15.a(16);
               var15.a(16);
            } else if (var1 < 17) {
               float var10000 = a[var1];
            } else {
               col.a("NalUnitUtil", c.aE(var1, "Unexpected aspect_ratio_idc value: "));
            }
         }

         if (var15.f()) {
            var15.d();
         }

         if (var15.f()) {
            var15.e(3);
            var15.f();
            if (var15.f()) {
               var15.a(8);
               var15.a(8);
               var15.e(8);
               var1 = cog.e;
            }
         }
      }

      return new orc(var3, var12, var11, (byte[])null);
   }

   public static orc b(byte[] var0, int var1) {
      coo var19 = new coo(var0, 2, var1);
      var19.e(4);
      int var6 = var19.a(3);
      var19.d();
      var19.a(2);
      var19.f();
      var19.a(5);
      int var7 = 0;

      for(var1 = 0; var1 < 32; ++var1) {
         var19.f();
      }

      int[] var22 = new int[6];

      for(var1 = 0; var1 < 6; ++var1) {
         var22[var1] = var19.a(8);
      }

      var19.a(8);
      int var4 = 0;

      int var3;
      for(var3 = 0; var4 < var6; ++var4) {
         var1 = var3;
         if (var19.f()) {
            var1 = var3 + 89;
         }

         var3 = var1;
         if (var19.f()) {
            var3 = var1 + 8;
         }
      }

      var19.e(var3);
      if (var6 > 0) {
         var1 = 8 - var6;
         var19.e(var1 + var1);
      }

      var19.b();
      int var5 = var19.b();
      if (var5 == 3) {
         var19.d();
         var5 = 3;
      }

      var19.b();
      var19.b();
      if (var19.f()) {
         var19.b();
         var19.b();
         var19.b();
         var19.b();
      }

      int var11 = var19.b();
      int var12 = var19.b();
      int var13 = var19.b();
      if (!var19.f()) {
         var1 = var6;
      } else {
         var1 = 0;
      }

      while(var1 <= var6) {
         var19.b();
         var19.b();
         var19.b();
         ++var1;
      }

      var19.b();
      var19.b();
      var19.b();
      var19.b();
      var19.b();
      var19.b();
      if (var19.f() && var19.f()) {
         byte var23;
         for(var3 = 0; var3 < 4; ++var3) {
            for(var4 = 0; var4 < 6; var4 += var23) {
               if (!var19.f()) {
                  var19.b();
               } else {
                  var6 = Math.min(64, 1 << var3 + var3 + 4);
                  if (var3 > 1) {
                     var19.c();
                     var1 = 0;
                  } else {
                     var1 = 0;
                  }

                  while(var1 < var6) {
                     var19.c();
                     ++var1;
                  }
               }

               if (var3 == 3) {
                  var23 = 3;
               } else {
                  var23 = 1;
               }
            }
         }
      }

      var19.e(2);
      if (var19.f()) {
         var19.e(8);
         var19.b();
         var19.b();
         var19.d();
      }

      var6 = var19.b();
      int[] var17 = new int[0];
      var22 = new int[0];
      int var9 = -1;

      for(int var8 = -1; var7 < var6; var8 = var1) {
         if (var7 != 0 && var19.f()) {
            int var14 = var9 + var8;
            byte var10 = var19.f();
            int var16 = var19.b();
            var4 = var14 + 1;
            boolean[] var20 = new boolean[var4];

            for(var1 = 0; var1 <= var14; ++var1) {
               if (!var19.f()) {
                  var20[var1] = var19.f();
               } else {
                  var20[var1] = true;
               }
            }

            var3 = var8 - 1;
            int[] var18 = new int[var4];
            int[] var21 = new int[var4];
            var1 = 0;

            while(true) {
               int var15 = (1 - (var10 + var10)) * (var16 + 1);
               if (var3 < 0) {
                  var3 = var1;
                  if (var15 < 0) {
                     var3 = var1;
                     if (var20[var14]) {
                        var18[var1] = var15;
                        var3 = var1 + 1;
                     }
                  }

                  var1 = var3;

                  int var24;
                  for(var4 = 0; var4 < var9; var1 = var3) {
                     var24 = var17[var4] + var15;
                     var3 = var1;
                     if (var24 < 0) {
                        var3 = var1;
                        if (var20[var4]) {
                           var18[var1] = var24;
                           var3 = var1 + 1;
                        }
                     }

                     ++var4;
                  }

                  var18 = Arrays.copyOf(var18, var1);
                  var4 = var9 - 1;

                  for(var3 = 0; var4 >= 0; var3 = var24) {
                     var16 = var17[var4] + var15;
                     var24 = var3;
                     if (var16 > 0) {
                        var24 = var3;
                        if (var20[var4]) {
                           var21[var3] = var16;
                           var24 = var3 + 1;
                        }
                     }

                     --var4;
                  }

                  var4 = var3;
                  if (var15 > 0) {
                     var4 = var3;
                     if (var20[var14]) {
                        var21[var3] = var15;
                        var4 = var3 + 1;
                     }
                  }

                  var3 = var4;

                  for(var4 = 0; var4 < var8; var3 = var24) {
                     var14 = var22[var4] + var15;
                     var24 = var3;
                     if (var14 > 0) {
                        var24 = var3;
                        if (var20[var9 + var4]) {
                           var21[var3] = var14;
                           var24 = var3 + 1;
                        }
                     }

                     ++var4;
                  }

                  var22 = Arrays.copyOf(var21, var3);
                  var17 = var18;
                  var4 = var3;
                  var3 = var1;
                  var1 = var4;
                  break;
               }

               var15 += var22[var3];
               var4 = var1;
               if (var15 < 0) {
                  var4 = var1;
                  if (var20[var9 + var3]) {
                     var18[var1] = var15;
                     var4 = var1 + 1;
                  }
               }

               --var3;
               var1 = var4;
            }
         } else {
            var3 = var19.b();
            var4 = var19.b();
            var17 = new int[var3];

            for(var1 = 0; var1 < var3; ++var1) {
               var17[var1] = var19.b() + 1;
               var19.d();
            }

            var22 = new int[var4];

            for(var1 = 0; var1 < var4; ++var1) {
               var22[var1] = var19.b() + 1;
               var19.d();
            }

            var1 = var4;
         }

         ++var7;
         var9 = var3;
      }

      if (var19.f()) {
         for(var1 = 0; var1 < var19.b(); ++var1) {
            var19.e(var13 + 5);
         }
      }

      var19.e(2);
      if (var19.f()) {
         if (var19.f()) {
            var1 = var19.a(8);
            if (var1 == 255) {
               var19.a(16);
               var19.a(16);
            } else if (var1 < 17) {
               float var10000 = a[var1];
            } else {
               col.a("NalUnitUtil", c.aE(var1, "Unexpected aspect_ratio_idc value: "));
            }
         }

         if (var19.f()) {
            var19.d();
         }

         if (var19.f()) {
            var19.e(3);
            var19.f();
            if (var19.f()) {
               var19.a(8);
               var19.a(8);
               var19.e(8);
               var1 = cog.e;
            }
         }

         if (var19.f()) {
            var19.b();
            var19.b();
         }

         var19.d();
         var19.f();
      }

      return new orc(var5, var11, var12, (byte[])null, (byte[])null);
   }
}
