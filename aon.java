public final class aon {
   public static final auf a;

   static {
      a = li.e(vk.o);
   }

   // $FF: synthetic method
   public static final void a(int var0, qvx var1, qvy var2, qvx var3, qvx var4, qvx var5, asm var6, int var7) {
      asm var11 = var6.b(-1401632215);
      byte var8;
      int var9;
      if ((var7 & 14) == 0) {
         if (!var11.C(false)) {
            var8 = 2;
         } else {
            var8 = 4;
         }

         var9 = var8 | var7;
      } else {
         var9 = var7;
      }

      int var16 = var9;
      if ((var7 & 112) == 0) {
         if (!var11.z(var0)) {
            var8 = 16;
         } else {
            var8 = 32;
         }

         var16 = var9 | var8;
      }

      var9 = var16;
      short var17;
      if ((var7 & 896) == 0) {
         if (!var11.D(var1)) {
            var17 = 128;
         } else {
            var17 = 256;
         }

         var9 = var16 | var17;
      }

      var16 = var9;
      if ((var7 & 7168) == 0) {
         short var18;
         if (!var11.D(var2)) {
            var18 = 1024;
         } else {
            var18 = 2048;
         }

         var16 = var9 | var18;
      }

      var9 = var16;
      if (('\ue000' & var7) == 0) {
         if (!var11.D(var3)) {
            var17 = 8192;
         } else {
            var17 = 16384;
         }

         var9 = var16 | var17;
      }

      var16 = var9;
      if ((458752 & var7) == 0) {
         if (!var11.D(var4)) {
            var16 = 65536;
         } else {
            var16 = 131072;
         }

         var16 |= var9;
      }

      var9 = var16;
      if ((3670016 & var7) == 0) {
         if (!var11.D(var5)) {
            var9 = 524288;
         } else {
            var9 = 1048576;
         }

         var9 |= var16;
      }

      if ((2995931 & var9) == 599186 && var11.G()) {
         var11.q();
      } else {
         any var13 = new any(var0);
         var11.u(-568225417);
         var16 = 0;

         boolean var10;
         for(var10 = false; var16 < 7; ++var16) {
            var10 |= var11.B((new Object[]{var1, var3, var4, var13, false, var5, var2})[var16]);
         }

         asq var12 = (asq)var11;
         Object var14 = var12.O();
         if (var10 || var14 == asl.a) {
            var14 = new aom(var1, var3, var4, var0, var5, var9, var2, 1);
            var12.Y(var14);
         }

         var12.S();
         ja.c((bbb)null, (qvx)var14, var11, 0);
      }

      aug var15 = var11.H();
      if (var15 != null) {
         var15.c = new aom(var0, var1, var2, var3, var4, var5, var7, 0);
      }
   }

   public static final void b(bbb var0, lmk var1, qvx var2, qvx var3, qvy var4, qvx var5, int var6, boolean var7, bdr var8, float var9, long var10, long var12, long var14, long var16, long var18, qvy var20, asm var21, int var22, int var23) {
      int var24 = var22 | 6;
      asm var29 = var21.b(1037492569);
      if ((var22 & 112) == 0) {
         var24 |= 16;
      }

      int var26 = var24 | 28032;
      if ((var22 & 458752) == 0) {
         if (!var29.D(var5)) {
            var24 = 65536;
         } else {
            var24 = 131072;
         }

         var26 |= var24;
      }

      if ((var23 & 14) == 0) {
         var24 = var23 | 2;
      } else {
         var24 = var23;
      }

      int var25 = var24 | 48;
      var24 = var25;
      if ((var23 & 896) == 0) {
         var24 = var25 | 128;
      }

      var25 = var24;
      if ((var23 & 7168) == 0) {
         var25 = var24 | 1024;
      }

      var24 = var25;
      if (('\ue000' & var23) == 0) {
         var24 = var25 | 8192;
      }

      var25 = var24;
      if ((458752 & var23) == 0) {
         var25 = var24 | 65536;
      }

      var24 = var25;
      if ((3670016 & var23) == 0) {
         var24 = var25 | 524288;
      }

      if ((29360128 & var23) == 0) {
         if (!var29.D(var20)) {
            var25 = 4194304;
         } else {
            var25 = 8388608;
         }

         var24 |= var25;
      }

      var25 = 920125440 | var26;
      qvx var28;
      Object var34;
      qvy var39;
      lmk var40;
      Object var41;
      qvx var43;
      qvx var44;
      bdr var46;
      if ((1533916891 & var25) == 306783378 && (23967451 & var24) == 4793490 && var29.G()) {
         var29.q();
         var28 = var2;
         var39 = var4;
         var46 = var8;
         var41 = var0;
         var44 = var28;
         var43 = var3;
         var40 = var1;
         var34 = var46;
      } else {
         var29.r();
         lmk var42;
         if ((var22 & 1) != 0 && !var29.E()) {
            var29.q();
            var28 = var2;
            var39 = var4;
            var46 = var8;
            var25 &= -113;
            var24 &= -4194191;
            var41 = var0;
            var44 = var28;
            var42 = var1;
            var34 = var46;
         } else {
            var41 = bbb.d;
            var29.u(1569641925);
            anu var36 = anu.a;
            aak var30 = ant.a;
            var36.getClass();
            var29.u(-1435874229);
            aal var31 = aal.p;
            bjp var33 = dp.m(ajt.g, new aal(17));
            var29.u(511388516);
            var7 = var29.B(var36);
            boolean var27 = var29.B(var31);
            asq var45 = (asq)var29;
            Object var32 = var45.O();
            if (var27 | var7 || var32 == asl.a) {
               var32 = new amp(var36, 3);
               var45.Y(var32);
            }

            var45.S();
            qvi var35 = (qvi)var32;
            lmk var38 = (lmk)dp.n(new Object[0], var33, var35, var29);
            var45.S();
            var29.u(-492369756);
            var34 = var45.O();
            var32 = var34;
            if (var34 == asl.a) {
               var32 = new lmk((byte[])null, (char[])null, (byte[])null, (byte[])null);
               var45.Y(var32);
            }

            var45.S();
            var1 = (lmk)var32;
            var29.u(-492369756);
            var32 = var45.O();
            if (var32 == asl.a) {
               var32 = new lmk(var38, var1);
               var45.Y(var32);
            }

            var45.S();
            var42 = (lmk)var32;
            var45.S();
            qvx var37 = ani.a;
            var44 = ani.a;
            var3 = ani.b;
            var39 = ani.c;
            var34 = kh.d(var29).b;
            var10 = kh.c(var29).l();
            var12 = anh.a(var10, var29);
            var29.u(617225966);
            var14 = bcy.i(kh.c(var29).g(), 0.32F);
            var45.S();
            var16 = kh.c(var29).a();
            var18 = anh.a(var16, var29);
            var9 = 16.0F;
            var25 &= -113;
            var24 &= -4194191;
            var7 = true;
            var6 = 1;
         }

         var29.l();
         ayt var47 = sr.t(var29, 1823402604, new aok(var16, var18, var24, var6, var44, var20, var5, var3, var25, var39, var42));
         var29.u(-1013847725);
         var47.a(var41, var29, var25 & 14 | 48);
         ((asq)var29).S();
         qvx var48 = var3;
         var40 = var42;
         var43 = var48;
      }

      aug var49 = var29.H();
      if (var49 != null) {
         var49.c = new aoi((bbb)var41, var40, var44, var43, var39, var5, var6, var7, (bdr)var34, var9, var10, var12, var14, var16, var18, var20, var22, var23);
      }
   }
}
