public final class apw {
   private static final auf a;

   static {
      a = li.d(aup.c, vk.q);
   }

   public static final void a(bss var0, qvx var1, asm var2, int var3) {
      var2 = var2.b(1772272796);
      int var8;
      if ((var3 & 14) == 0) {
         byte var4;
         if (!var2.B(var0)) {
            var4 = 2;
         } else {
            var4 = 4;
         }

         var8 = var4 | var3;
      } else {
         var8 = var3;
      }

      int var5 = var8;
      if ((var3 & 112) == 0) {
         byte var9;
         if (!var2.D(var1)) {
            var9 = 16;
         } else {
            var9 = 32;
         }

         var5 = var8 | var9;
      }

      if ((var5 & 91) == 18 && var2.G()) {
         var2.q();
      } else {
         auf var6 = a;
         li.g(new ouk[]{var6.b(((bss)var2.e(var6)).f(var0))}, var1, var2, var5 & 112 | 8);
      }

      aug var7 = var2.H();
      if (var7 != null) {
         var7.c = new aai(var0, var1, var3, 13, (byte[])null);
      }
   }

   public static final void b(String var0, bbb var1, long var2, long var4, long var6, long var8, int var10, boolean var11, int var12, int var13, qvt var14, bss var15, asm var16, int var17, int var18, int var19) {
      int var22 = var10;
      var0.getClass();
      asm var37 = var16.b(1028090691);
      int var21;
      byte var40;
      if ((var19 & 1) != 0) {
         var21 = var17 | 6;
      } else if ((var17 & 14) == 0) {
         if (!var37.B(var0)) {
            var40 = 2;
         } else {
            var40 = 4;
         }

         var21 = var40 | var17;
      } else {
         var21 = var17;
      }

      int var29 = var19 & 2;
      if (var29 != 0) {
         var21 |= 48;
      } else if ((var17 & 112) == 0) {
         if (!var37.B(var1)) {
            var40 = 16;
         } else {
            var40 = 32;
         }

         var21 |= var40;
      }

      int var30 = var19 & 4;
      short var26 = 128;
      short var41;
      if (var30 != 0) {
         var21 |= 384;
      } else if ((var17 & 896) == 0) {
         if (!var37.A(var2)) {
            var41 = 128;
         } else {
            var41 = 256;
         }

         var21 |= var41;
      }

      int var31 = var19 & 8;
      short var28 = 1024;
      if (var31 != 0) {
         var21 |= 3072;
      } else if ((var17 & 7168) == 0) {
         if (!var37.A(var4)) {
            var41 = 1024;
         } else {
            var41 = 2048;
         }

         var21 |= var41;
      }

      short var27 = 16384;
      if ((var19 & 16) != 0) {
         var10 = var21 | 24576;
      } else {
         var10 = var21;
         if ((var17 & '\ue000') == 0) {
            if (!var37.B((Object)null)) {
               var41 = 8192;
            } else {
               var41 = 16384;
            }

            var10 = var21 | var41;
         }
      }

      int var23;
      label305: {
         if ((var19 & 32) != 0) {
            var21 = 196608;
         } else {
            var23 = var10;
            if ((var17 & 458752) != 0) {
               break label305;
            }

            if (!var37.B((Object)null)) {
               var21 = 65536;
            } else {
               var21 = 131072;
            }
         }

         var23 = var10 | var21;
      }

      label299: {
         if ((var19 & 64) != 0) {
            var10 = 1572864;
         } else {
            var21 = var23;
            if ((var17 & 3670016) != 0) {
               break label299;
            }

            if (!var37.B((Object)null)) {
               var10 = 524288;
            } else {
               var10 = 1048576;
            }
         }

         var21 = var23 | var10;
      }

      int var32;
      label293: {
         var32 = var19 & 128;
         if (var32 != 0) {
            var10 = 12582912;
         } else {
            var10 = var21;
            if ((29360128 & var17) != 0) {
               break label293;
            }

            if (!var37.A(var6)) {
               var10 = 4194304;
            } else {
               var10 = 8388608;
            }
         }

         var10 |= var21;
      }

      label287: {
         if ((var19 & 256) != 0) {
            var21 = 100663296;
         } else {
            var23 = var10;
            if ((234881024 & var17) != 0) {
               break label287;
            }

            if (!var37.B((Object)null)) {
               var21 = 33554432;
            } else {
               var21 = 67108864;
            }
         }

         var23 = var10 | var21;
      }

      if ((var19 & 512) != 0) {
         var23 |= 805306368;
      } else if ((1879048192 & var17) == 0) {
         if (!var37.B((Object)null)) {
            var10 = 268435456;
         } else {
            var10 = 536870912;
         }

         var23 |= var10;
      }

      int var33 = var19 & 1024;
      if (var33 != 0) {
         var21 = var18 | 6;
      } else if ((var18 & 14) == 0) {
         if (!var37.A(var8)) {
            var40 = 2;
         } else {
            var40 = 4;
         }

         var21 = var18 | var40;
      } else {
         var21 = var18;
      }

      var10 = var19 & 2048;
      byte var24;
      if (var10 != 0) {
         var24 = 0;
      } else {
         var24 = 1;
      }

      if (var10 != 0) {
         var10 = var21 | 48;
      } else {
         var10 = var21;
         if ((var18 & 112) == 0) {
            if (!var37.z(var22)) {
               var40 = 16;
            } else {
               var40 = 32;
            }

            var10 = var21 | var40;
         }
      }

      var21 = var19 & 4096;
      boolean var25;
      if (var21 != 0) {
         var25 = false;
      } else {
         var25 = true;
      }

      short var46;
      if (var21 != 0) {
         var21 = var10 | 384;
      } else {
         var21 = var10;
         if ((var18 & 896) == 0) {
            if (!var37.C(var11)) {
               var46 = var26;
            } else {
               var46 = 256;
            }

            var21 = var10 | var46;
         }
      }

      int var34 = var19 & 8192;
      if (var34 != 0) {
         var10 = var21 | 3072;
      } else if ((var18 & 7168) == 0) {
         if (!var37.z(var12)) {
            var41 = var28;
         } else {
            var41 = 2048;
         }

         var10 = var21 | var41;
      } else {
         var10 = var21;
      }

      var21 = var19 & 16384;
      byte var44;
      if (var21 != 0) {
         var44 = 0;
      } else {
         var44 = 1;
      }

      if (var21 != 0) {
         var21 = var10 | 24576;
      } else {
         var21 = var10;
         if ((var18 & '\ue000') == 0) {
            var46 = var27;
            if (!var37.z(var13)) {
               var46 = 8192;
            }

            var21 = var10 | var46;
         }
      }

      int var45 = '耀' & var19;
      if (var45 != 0) {
         var10 = var21 | 196608;
      } else if ((var18 & 458752) == 0) {
         if (!var37.D(var14)) {
            var10 = 65536;
         } else {
            var10 = 131072;
         }

         var10 |= var21;
      } else {
         var10 = var21;
      }

      if ((var18 & 3670016) == 0) {
         if ((var19 & 65536) == 0 && var37.B(var15)) {
            var21 = 1048576;
         } else {
            var21 = 524288;
         }

         var10 |= var21;
      }

      long var35;
      bss var39;
      Object var43;
      if ((1533916891 & var23) == 306783378 && (2995931 & var10) == 599186 && var37.G()) {
         var37.q();
         var35 = var8;
         var10 = var22;
         var43 = var1;
         var8 = var6;
         var39 = var15;
      } else {
         var37.r();
         if ((var17 & 1) != 0 && !var37.E()) {
            var37.q();
            var21 = var10;
            if ((var19 & 65536) != 0) {
               var21 = var10 & -3670017;
            }

            var35 = var4;
            var4 = var6;
            var10 = var22;
            var43 = var1;
            var6 = var35;
            var39 = var15;
         } else {
            if (var29 != 0) {
               var43 = bbb.d;
            } else {
               var43 = var1;
            }

            if (var30 != 0) {
               var2 = bcy.f;
            }

            if (var31 != 0) {
               var35 = bxz.a;
            } else {
               var35 = var4;
            }

            if (var32 != 0) {
               var4 = bxz.a;
            } else {
               var4 = var6;
            }

            if (var33 != 0) {
               var8 = bxz.a;
            }

            var22 |= var24 ^ 1;
            var11 |= var25 ^ true;
            if (var34 != 0) {
               var12 = Integer.MAX_VALUE;
            }

            var13 |= var44 ^ 1;
            if (var45 != 0) {
               var14 = null;
            }

            if ((var19 & 65536) != 0) {
               var39 = (bss)var37.e(a);
               var21 = var10 & -3670017;
               var10 = var22;
               var6 = var35;
            } else {
               var39 = var15;
               var21 = var10;
               var6 = var35;
               var10 = var22;
            }
         }

         var37.l();
         var35 = ((bcy)var37.e(anl.a)).g;
         float var20 = ((Number)var37.e(ank.a)).floatValue();
         if (var2 != bcy.f) {
            var35 = var2;
         } else if (var39.b() != bcy.f) {
            var35 = var39.b();
         } else {
            var35 = bcy.i(var35, var20);
         }

         var15 = bss.u(var39, 0L, var6, (bvc)null, var4, var8, 16609105);
         qnd var38 = new qnd(var35);
         var22 = var21 << 9;
         jk.f(var0, (bbb)var43, var15, var14, var10, var11, var12, var13, var38, var37, var23 & 14 | var23 & 112 | var21 >> 6 & 7168 | var22 & '\ue000' | var22 & 458752 | var22 & 3670016 | var22 & 29360128, 0);
         var35 = var8;
         var8 = var4;
         var4 = var6;
      }

      aug var42 = var37.H();
      if (var42 != null) {
         var42.c = new ars(var0, (bbb)var43, var2, var4, var8, var35, var10, var11, var12, var13, var14, var39, var17, var18, var19, 1);
      }
   }

   // $FF: synthetic method
   public static final void c(bbb var0, long var1, long var3, long var5, long var7, int var9, boolean var10, int var11, qvt var12, bss var13, asm var14, int var15, int var16) {
      asm var24 = var14.b(-366126944);
      int var18;
      if ((var15 & 14) == 0) {
         byte var17;
         if (!var24.B("Next")) {
            var17 = 2;
         } else {
            var17 = 4;
         }

         var18 = var15 | var17;
      } else {
         var18 = var15;
      }

      int var19 = var16 | 28086;
      int var32 = var19;
      if ((var16 & 458752) == 0) {
         var32 = var19 | 65536;
      }

      var18 |= 920350128;
      long var20;
      long var22;
      bss var26;
      Object var28;
      bss var30;
      if ((1533916891 & var18) == 306783378 && (374491 & var32) == 74898 && var24.G()) {
         var24.q();
         var30 = var13;
         var28 = var0;
         var22 = var5;
         var20 = var7;
         var26 = var30;
      } else {
         var24.r();
         Object var25;
         bss var27;
         if ((var15 & 1) != 0 && !var24.E()) {
            var24.q();
            bbb var29 = var0;
            var20 = var7;
            var25 = var12;
            var27 = var13;
            var32 &= -458753;
            var7 = var5;
            var28 = var29;
            var5 = var1;
            var1 = var20;
         } else {
            var28 = bbb.d;
            var5 = bcy.f;
            var3 = bxz.a;
            var25 = axa.b;
            var27 = (bss)var24.e(a);
            var32 &= -458753;
            var7 = var3;
            var9 = 1;
            var10 = true;
            var11 = Integer.MAX_VALUE;
            var1 = var3;
         }

         var24.l();
         var19 = var32 << 3;
         b("Next", (bbb)var28, var5, var3, var7, var1, var9, var10, var11, 1, (qvt)var25, var27, var24, var18 & 896 | var18 & 14 | var18 & 112 | var18 & 7168 | var18 & '\ue000' | var18 & 458752 | var18 & 3670016 | var18 & 29360128 | var18 & 234881024 | var18 & 1879048192, var32 & 7168 | var32 & 896 | var32 & 14 | 24576 | var32 & 112 | var19 & 458752 | var19 & 3670016, 0);
         var30 = var27;
         var12 = var25;
         var26 = var30;
         var20 = var1;
         var22 = var7;
         var1 = var5;
      }

      aug var31 = var24.H();
      if (var31 != null) {
         var31.c = new apv((bbb)var28, var1, var3, var22, var20, var9, var10, var11, (qvt)var12, var26, var15, var16);
      }
   }
}
