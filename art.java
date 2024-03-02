public final class art {
   private static final auf a;

   static {
      a = li.d(aup.c, ara.f);
   }

   public static final void a(bss var0, qvx var1, asm var2, int var3) {
      asm var6 = var2.b(-460300127);
      int var9;
      if ((var3 & 14) == 0) {
         byte var4;
         if (!var6.B(var0)) {
            var4 = 2;
         } else {
            var4 = 4;
         }

         var9 = var4 | var3;
      } else {
         var9 = var3;
      }

      int var5 = var9;
      if ((var3 & 112) == 0) {
         byte var10;
         if (!var6.D(var1)) {
            var10 = 16;
         } else {
            var10 = 32;
         }

         var5 = var9 | var10;
      }

      if ((var5 & 91) == 18 && var6.G()) {
         var6.q();
      } else {
         auf var7 = a;
         li.g(new ouk[]{var7.b(((bss)var6.e(var7)).f(var0))}, var1, var6, var5 & 112 | 8);
      }

      aug var8 = var6.H();
      if (var8 != null) {
         var8.c = new aai(var0, var1, var3, 15, (byte[])null);
      }
   }

   public static final void b(String var0, bbb var1, long var2, long var4, bvc var6, long var7, long var9, int var11, boolean var12, int var13, int var14, bss var15, asm var16, int var17, int var18, int var19) {
      int var21 = var11;
      asm var37 = var16.b(-2055108902);
      int var20;
      byte var39;
      if ((var19 & 1) != 0) {
         var20 = var17 | 6;
      } else if ((var17 & 14) == 0) {
         if (!var37.B(var0)) {
            var39 = 2;
         } else {
            var39 = 4;
         }

         var20 = var39 | var17;
      } else {
         var20 = var17;
      }

      int var28 = var19 & 2;
      if (var28 != 0) {
         var20 |= 48;
      } else if ((var17 & 112) == 0) {
         if (!var37.B(var1)) {
            var39 = 16;
         } else {
            var39 = 32;
         }

         var20 |= var39;
      }

      int var29 = var19 & 4;
      short var25 = 128;
      short var40;
      if (var29 != 0) {
         var20 |= 384;
      } else if ((var17 & 896) == 0) {
         if (!var37.A(var2)) {
            var40 = 128;
         } else {
            var40 = 256;
         }

         var20 |= var40;
      }

      int var30 = var19 & 8;
      short var27 = 1024;
      if (var30 != 0) {
         var20 |= 3072;
      } else if ((var17 & 7168) == 0) {
         if (!var37.A(var4)) {
            var40 = 1024;
         } else {
            var40 = 2048;
         }

         var20 |= var40;
      }

      short var26 = 16384;
      if ((var19 & 16) != 0) {
         var11 = var20 | 24576;
      } else {
         var11 = var20;
         if ((var17 & '\ue000') == 0) {
            if (!var37.B((Object)null)) {
               var40 = 8192;
            } else {
               var40 = 16384;
            }

            var11 = var20 | var40;
         }
      }

      int var31 = var19 & 32;
      if (var31 != 0) {
         var11 |= 196608;
      } else if ((var17 & 458752) == 0) {
         if (!var37.B(var6)) {
            var20 = 65536;
         } else {
            var20 = 131072;
         }

         var11 |= var20;
      }

      label303: {
         if ((var19 & 64) != 0) {
            var20 = 1572864;
         } else {
            var20 = var11;
            if ((var17 & 3670016) != 0) {
               break label303;
            }

            if (!var37.B((Object)null)) {
               var20 = 524288;
            } else {
               var20 = 1048576;
            }
         }

         var20 |= var11;
      }

      int var32 = var19 & 128;
      if (var32 != 0) {
         var11 = var20 | 12582912;
      } else {
         var11 = var20;
         if ((29360128 & var17) == 0) {
            if (!var37.A(var7)) {
               var11 = 4194304;
            } else {
               var11 = 8388608;
            }

            var11 |= var20;
         }
      }

      label296: {
         if ((var19 & 256) != 0) {
            var20 = 100663296;
         } else {
            var20 = var11;
            if ((234881024 & var17) != 0) {
               break label296;
            }

            if (!var37.B((Object)null)) {
               var20 = 33554432;
            } else {
               var20 = 67108864;
            }
         }

         var20 |= var11;
      }

      int var22;
      label290: {
         if ((var19 & 512) != 0) {
            var11 = 805306368;
         } else {
            var22 = var20;
            if ((1879048192 & var17) != 0) {
               break label290;
            }

            if (!var37.B((Object)null)) {
               var11 = 268435456;
            } else {
               var11 = 536870912;
            }
         }

         var22 = var20 | var11;
      }

      int var33 = var19 & 1024;
      if (var33 != 0) {
         var20 = var18 | 6;
      } else if ((var18 & 14) == 0) {
         if (!var37.A(var9)) {
            var39 = 2;
         } else {
            var39 = 4;
         }

         var20 = var18 | var39;
      } else {
         var20 = var18;
      }

      var11 = var19 & 2048;
      byte var23;
      if (var11 != 0) {
         var23 = 0;
      } else {
         var23 = 1;
      }

      if (var11 != 0) {
         var11 = var20 | 48;
      } else {
         var11 = var20;
         if ((var18 & 112) == 0) {
            if (!var37.z(var21)) {
               var39 = 16;
            } else {
               var39 = 32;
            }

            var11 = var20 | var39;
         }
      }

      var20 = var19 & 4096;
      boolean var24;
      if (var20 != 0) {
         var24 = false;
      } else {
         var24 = true;
      }

      if (var20 != 0) {
         var20 = var11 | 384;
      } else {
         var20 = var11;
         if ((var18 & 896) == 0) {
            short var46;
            if (!var37.C(var12)) {
               var46 = var25;
            } else {
               var46 = 256;
            }

            var20 = var11 | var46;
         }
      }

      int var34 = var19 & 8192;
      if (var34 != 0) {
         var20 |= 3072;
      } else if ((var18 & 7168) == 0) {
         if (!var37.z(var13)) {
            var40 = var27;
         } else {
            var40 = 2048;
         }

         var20 |= var40;
      }

      var11 = var19 & 16384;
      byte var45;
      if (var11 != 0) {
         var45 = 0;
      } else {
         var45 = 1;
      }

      if (var11 != 0) {
         var11 = var20 | 24576;
      } else {
         var11 = var20;
         if ((var18 & '\ue000') == 0) {
            var40 = var26;
            if (!var37.z(var14)) {
               var40 = 8192;
            }

            var11 = var20 | var40;
         }
      }

      label283: {
         if (('耀' & var19) != 0) {
            var20 = 196608;
         } else {
            var20 = var11;
            if ((var18 & 458752) != 0) {
               break label283;
            }

            if (!var37.D((Object)null)) {
               var20 = 65536;
            } else {
               var20 = 131072;
            }
         }

         var20 |= var11;
      }

      if ((var18 & 3670016) == 0) {
         if ((var19 & 65536) == 0 && var37.B(var15)) {
            var11 = 1048576;
         } else {
            var11 = 524288;
         }

         var11 |= var20;
      } else {
         var11 = var20;
      }

      long var35;
      bss var38;
      Object var41;
      if ((1533916891 & var22) == 306783378 && (2995931 & var11) == 599186 && var37.G()) {
         var37.q();
         bss var43 = var15;
         var11 = var21;
         var41 = var1;
         var35 = var7;
         var38 = var43;
      } else {
         var37.r();
         Object var42;
         if ((var17 & 1) != 0 && !var37.E()) {
            var37.q();
            var20 = var11;
            if ((var19 & 65536) != 0) {
               var20 = var11 & -3670017;
            }

            var35 = var4;
            var4 = var7;
            var11 = var21;
            var42 = var1;
            var7 = var35;
            var38 = var15;
         } else {
            if (var28 != 0) {
               var42 = bbb.d;
            } else {
               var42 = var1;
            }

            if (var29 != 0) {
               var2 = bcy.f;
            }

            if (var30 != 0) {
               var35 = bxz.a;
            } else {
               var35 = var4;
            }

            if (var31 != 0) {
               var6 = null;
            }

            if (var32 != 0) {
               var4 = bxz.a;
            } else {
               var4 = var7;
            }

            if (var33 != 0) {
               var9 = bxz.a;
            }

            var21 |= var23 ^ 1;
            var12 |= var24 ^ true;
            if (var34 != 0) {
               var13 = Integer.MAX_VALUE;
            }

            var14 |= var45 ^ 1;
            if ((var19 & 65536) != 0) {
               var38 = (bss)var37.e(a);
               var20 = var11 & -3670017;
               var11 = var21;
               var7 = var35;
            } else {
               var38 = var15;
               var20 = var11;
               var7 = var35;
               var11 = var21;
            }
         }

         var37.l();
         var37.u(79582827);
         if (var2 != bcy.f) {
            var35 = var2;
         } else {
            var35 = var38.b();
            if (var35 == bcy.f) {
               var35 = ((bcy)var37.e(arc.a)).g;
            }
         }

         ((asq)var37).S();
         var15 = bss.u(var38, var35, var7, var6, var4, var9, 16609104);
         var21 = var20 << 9;
         jk.f(var0, (bbb)var42, var15, (qvt)null, var11, var12, var13, var14, (qnd)null, var37, var22 & 14 | var22 & 112 | var20 >> 6 & 7168 | var21 & '\ue000' | var21 & 458752 | var21 & 3670016 | var21 & 29360128, 256);
         var41 = var42;
         var35 = var4;
         var4 = var7;
      }

      aug var44 = var37.H();
      if (var44 != null) {
         var44.c = new ars(var0, (bbb)var41, var2, var4, var6, var35, var9, var11, var12, var13, var14, var38, var17, var18, var19, 0);
      }
   }
}
