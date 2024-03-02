import android.content.Context;
import android.graphics.Shader;
import android.view.Window.Callback;
import androidx.compose.foundation.gestures.ScrollableElement;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.util.Iterator;
import java.util.Map;

public class gh {
   public gh() {
   }

   public gh(byte[] var1) {
   }

   static void a(Callback var0, boolean var1) {
      var0.onPointerCaptureChanged(var1);
   }

   public static void b(qvi var0, ajz var1, asm var2, int var3) {
      asm var7 = var2.b(-331135862);
      int var30;
      if ((var3 & 14) == 0) {
         byte var4;
         if (!var7.D(var0)) {
            var4 = 2;
         } else {
            var4 = 4;
         }

         var30 = var4 | var3;
      } else {
         var30 = var3;
      }

      int var5 = var30;
      if ((var3 & 112) == 0) {
         byte var31;
         if (!var7.B(var1)) {
            var31 = 16;
         } else {
            var31 = 32;
         }

         var5 = var30 | var31;
      }

      if ((var5 & 91) == 18 && var7.G()) {
         var7.q();
      } else {
         aji var8 = (aji)var0.a();
         if (var8.b() > 0) {
            azk var28 = dp.f();

            label321: {
               Throwable var10000;
               label320: {
                  azk var6;
                  boolean var10001;
                  try {
                     var6 = var28.v();
                  } catch (Throwable var26) {
                     var10000 = var26;
                     var10001 = false;
                     break label320;
                  }

                  try {
                     var30 = var1.c.a();
                     break label321;
                  } finally {
                     label314:
                     try {
                        azk.D(var6);
                     } catch (Throwable var24) {
                        var10000 = var24;
                        var10001 = false;
                        break label314;
                     }
                  }
               }

               Throwable var27 = var10000;
               var28.c();
               throw var27;
            }

            var28.c();
            var1.h(var8, var30);
         }
      }

      aug var29 = var7.H();
      if (var29 != null) {
         var29.c = new aai(var0, var1, var3, 2);
      }
   }

   public static void c(bbb var0, ajz var1, aip var2, ip var3, boolean var4, bat var5, ahv var6, qvt var7, asm var8, int var9, int var10) {
      var1.getClass();
      var2.getClass();
      var3.getClass();
      asm var19 = var8.b(620764179);
      byte var11;
      int var31;
      if ((var9 & 14) == 0) {
         if (!var19.B(var0)) {
            var11 = 2;
         } else {
            var11 = 4;
         }

         var31 = var11 | var9;
      } else {
         var31 = var9;
      }

      int var12 = var31;
      if ((var9 & 112) == 0) {
         byte var33;
         if (!var19.B(var1)) {
            var33 = 16;
         } else {
            var33 = 32;
         }

         var12 = var31 | var33;
      }

      short var14 = 128;
      var31 = var12;
      short var34;
      if ((var9 & 896) == 0) {
         if (!var19.B(var2)) {
            var34 = 128;
         } else {
            var34 = 256;
         }

         var31 = var12 | var34;
      }

      var12 = var31;
      short var36;
      if ((var9 & 7168) == 0) {
         if (!var19.C(false)) {
            var36 = 1024;
         } else {
            var36 = 2048;
         }

         var12 = var31 | var36;
      }

      var31 = var12;
      if (('\ue000' & var9) == 0) {
         if (!var19.C(false)) {
            var34 = 8192;
         } else {
            var34 = 16384;
         }

         var31 = var12 | var34;
      }

      if ((458752 & var9) == 0) {
         if (!var19.B(var3)) {
            var12 = 65536;
         } else {
            var12 = 131072;
         }

         var31 |= var12;
      }

      int var13 = var31;
      if ((3670016 & var9) == 0) {
         if (!var19.C(var4)) {
            var12 = 524288;
         } else {
            var12 = 1048576;
         }

         var13 = var31 | var12;
      }

      if ((var10 & 14) == 0) {
         if (!var19.B(var5)) {
            var11 = 2;
         } else {
            var11 = 4;
         }

         var12 = var11 | var10;
      } else {
         var12 = var10;
      }

      var31 = var12;
      if ((var10 & 112) == 0) {
         if (!var19.B(var6)) {
            var11 = 16;
         } else {
            var11 = 32;
         }

         var31 = var12 | var11;
      }

      var12 = var31;
      if ((var10 & 896) == 0) {
         if (!var19.D(var7)) {
            var36 = var14;
         } else {
            var36 = 256;
         }

         var12 = var31 | var36;
      }

      var13 |= 918552576;
      if ((var13 & 1533916891) == 306783378 && (var12 & 731) == 146 && var19.G()) {
         var19.q();
      } else {
         var19.u(-343736148);
         avi var17 = so.l(var7, var19);
         var19.u(1157296644);
         boolean var15 = var19.B(var1);
         asq var20 = (asq)var19;
         Object var28 = var20.O();
         if (var15 || var28 == asl.a) {
            bpe var29 = new bpe((char[])null);
            var17 = avg.b(aup.a, new ov(var17, 15));
            var28 = new ajj(avg.b(aup.a, new alq(var17, var1, var29, 1)));
            var20.Y(var28);
         }

         boolean var16;
         qwt var21;
         Object var38;
         label224: {
            var20.S();
            var21 = (qwt)var28;
            var20.S();
            var19.u(596174919);
            var19.u(511388516);
            var16 = var19.B(var1);
            var15 = var19.B(false);
            var38 = var20.O();
            if (!(var16 | var15)) {
               var28 = var38;
               if (var38 != asl.a) {
                  break label224;
               }
            }

            var28 = new AmbientMode$AmbientController(var1);
            var20.Y(var28);
         }

         var20.S();
         AmbientMode$AmbientController var24 = (AmbientMode$AmbientController)var28;
         var20.S();
         var19.u(773894976);
         var19.u(-492369756);
         var38 = var20.O();
         var28 = var38;
         if (var38 == asl.a) {
            var28 = new atb(atj.a(quj.a, var19));
            var20.Y(var28);
         }

         var20.S();
         qzv var30 = ((atb)var28).a;
         var20.S();
         var1.t = var30;
         var19.u(183156450);
         Boolean var32 = false;
         var19.u(-568225417);
         var31 = 0;

         boolean var48;
         for(var48 = false; var31 < 8; ++var31) {
            var48 |= var19.B((new Object[]{var1, var2, var32, var32, null, var5, var6, null})[var31]);
         }

         var28 = var20.O();
         if (var48 || var28 == asl.a) {
            var28 = new ajm(var1, var2, var21, var6, var5);
            var20.Y(var28);
         }

         var20.S();
         qvx var22 = (qvx)var28;
         var20.S();
         b(var21, var1, var19, var13 & 112);
         var19.u(1809802212);
         bbb var35 = abg.a;
         var19.u(-81138291);
         Context var18 = (Context)var19.e(bou.b);
         act var39 = (act)var19.e(acu.a);
         if (var39 == null) {
            var28 = acs.a;
         } else {
            var19.u(511388516);
            var15 = var19.B(var18);
            var16 = var19.B(var39);
            var28 = var20.O();
            if (var15 | var16 || var28 == asl.a) {
               var28 = new abe(var18, var39);
               var20.Y(var28);
            }

            var20.S();
            var28 = (acv)var28;
         }

         var20.S();
         var20.S();
         aez var23 = aez.b;
         bbb var25 = var0.g(var1.v).g(var1.n);
         var21.getClass();
         var24.getClass();
         var23.getClass();
         var19.u(1070136913);
         var19.u(773894976);
         var19.u(-492369756);
         Object var40 = var20.O();
         var38 = var40;
         if (var40 == asl.a) {
            var38 = new atb(atj.a(quj.a, var19));
            var20.Y(var38);
         }

         var20.S();
         qzv var41 = ((atb)var38).a;
         var20.S();
         var19.u(-568225417);
         var31 = 0;

         for(var48 = false; var31 < 4; ++var31) {
            var48 |= var19.B((new Object[]{var21, var24, var23, var4})[var31]);
         }

         var38 = var20.O();
         if (var48 || var38 == asl.a) {
            if (var23 == aez.a) {
               var15 = true;
            } else {
               var15 = false;
            }

            aiz var26 = new aiz(var21, 5);
            brj var27 = new brj(new ov(var24, 17), new us(var21, var24, 4));
            ala var44;
            if (var4) {
               var44 = new ala(var15, var41, var24);
            } else {
               var44 = null;
            }

            adb var42;
            if (var4) {
               var42 = new adb(var21, var41, var24, 6, (char[])null);
            } else {
               var42 = null;
            }

            kr var51 = new kr();
            var38 = brm.b(bbb.d, new aky(var26, var15, var27, var44, var42, var51));
            var20.Y(var38);
         }

         var20.S();
         bbb var43 = var25.g((bbb)var38);
         var20.S();
         bbb var50 = abp.a;
         var23.getClass();
         if (var23 == aez.a) {
            var50 = abp.b;
         } else {
            var50 = abp.a;
         }

         bbb var52;
         bxy var53;
         label187: {
            var52 = var43.g(var50);
            var23.getClass();
            var19.u(1452310458);
            var53 = (bxy)var19.e(bpi.e);
            var19.u(511388516);
            var15 = var19.B(var1);
            var16 = var19.B(0);
            var40 = var20.O();
            if (!(var16 | var15)) {
               var38 = var40;
               if (var40 != asl.a) {
                  break label187;
               }
            }

            var38 = new lmk(var1, (byte[])null);
            var20.Y(var38);
         }

         var20.S();
         lmk var46 = (lmk)var38;
         lmk var54 = var1.y;
         var19.u(-568225417);
         var31 = 0;

         for(var48 = false; var31 < 5; ++var31) {
            var48 |= var19.B((new Object[]{var46, var54, false, var53, var23})[var31]);
         }

         var38 = var20.O();
         if (var48 || var38 == asl.a) {
            var38 = new aki(var46, var54, var53, var23);
            var20.Y(var38);
         }

         var20.S();
         var50 = var52.g((bbb)var38);
         var20.S();
         var28.getClass();
         var50 = var50.g(((acv)var28).b());
         bxy var49 = (bxy)var19.e(bpi.e);
         var49.getClass();
         var23.getClass();
         if (var49 == bxy.b && var23 != aez.a) {
            var15 = false;
         } else {
            var15 = true;
         }

         var46 = var1.z;
         qvt var45 = afs.a;
         var31 = acz.b;
         acz var47 = acy.b;
         var23.getClass();
         iz.k(var21, var50.g(new ScrollableElement(var1, var23, (acv)var28, var4, var15, var3, var46, var47)), var1.x, var22, var19, 0);
      }

      aug var37 = var19.H();
      if (var37 != null) {
         var37.c = new ajk(var0, var1, var2, var3, var4, var5, var6, var7, var9, var10);
      }
   }

   public static void d(bbb var0, ajz var1, aip var2, ahv var3, bat var4, ip var5, boolean var6, qvt var7, asm var8, int var9) {
      asm var15 = var8.b(-1724297413);
      int var31;
      if ((var9 & 14) == 0) {
         byte var11;
         if (!var15.B(var0)) {
            var11 = 2;
         } else {
            var11 = 4;
         }

         var31 = var9 | var11;
      } else {
         var31 = var9;
      }

      int var12 = var31;
      if ((var9 & 112) == 0) {
         var12 = var31 | 16;
      }

      var12 |= 3456;
      var31 = var12;
      if ((var9 & '\ue000') == 0) {
         var31 = var12 | 8192;
      }

      var12 = var31 | 196608;
      var31 = var12;
      if ((var9 & 3670016) == 0) {
         var31 = var12 | 524288;
      }

      var12 = var31 | 12582912;
      if ((var9 & 234881024) == 0) {
         if (!var15.D(var7)) {
            var31 = 33554432;
         } else {
            var31 = 67108864;
         }

         var31 |= var12;
      } else {
         var31 = var12;
      }

      ahv var22;
      bat var23;
      aip var24;
      ip var25;
      ajz var26;
      ip var28;
      aip var33;
      if ((191739611 & var31) == 38347922 && var15.G()) {
         var15.q();
         var33 = var2;
         var22 = var3;
         var23 = var4;
         var28 = var5;
         var26 = var1;
         var24 = var33;
         var25 = var28;
      } else {
         var15.r();
         bat var19;
         if ((var9 & 1) != 0 && !var15.E()) {
            var15.q();
            var33 = var2;
            var19 = var4;
            var28 = var5;
            var31 &= -3727473;
            var26 = var1;
            var24 = var33;
            var25 = var28;
         } else {
            Object var17;
            bjp var21;
            asq var27;
            label73: {
               var15.u(1470655220);
               var21 = ajz.w;
               Integer var16 = 0;
               var15.u(511388516);
               boolean var13 = var15.B(var16);
               var6 = var15.B(var16);
               var27 = (asq)var15;
               Object var18 = var27.O();
               if (!(var6 | var13)) {
                  var17 = var18;
                  if (var18 != asl.a) {
                     break label73;
                  }
               }

               var17 = new vk(7);
               var27.Y(var17);
            }

            var27.S();
            qvi var20 = (qvi)var17;
            var26 = (ajz)dp.n(new Object[0], var21, var20, var15);
            var27.S();
            var24 = new aip(0.0F, 0.0F, 0.0F, 0.0F);
            var3 = aib.a;
            var12 = bar.a;
            var19 = baq.c;
            var15.u(1107739818);
            float var10 = yp.a;
            var15.u(904445851);
            bxr var14 = (bxr)var15.e(bpi.b);
            var10 = var14.a();
            var15.u(1157296644);
            var6 = var15.B(var10);
            var17 = var27.O();
            if (var6 || var17 == asl.a) {
               var17 = dp.p(new lmk(var14));
               var27.Y(var17);
            }

            var27.S();
            lmk var32 = (lmk)var17;
            var27.S();
            var15.u(1157296644);
            var6 = var15.B(var32);
            var17 = var27.O();
            if (var6 || var17 == asl.a) {
               var17 = new ip(var32);
               var27.Y(var17);
            }

            var27.S();
            var25 = (ip)var17;
            var27.S();
            var31 &= -3727473;
            var6 = true;
         }

         var15.l();
         var12 = var31 >> 3;
         c(var0, var26, var24, var25, var6, var19, var3, var7, var15, var31 & 14 | 24576 | var31 & 112 | var31 & 896 | var31 & 7168 | var12 & 458752 | 3670016 & var12, var31 >> 15 & 14 | var31 >> 9 & 112 | var31 >> 18 & 896);
         ahv var29 = var3;
         var23 = var19;
         var22 = var29;
      }

      aug var30 = var15.H();
      if (var30 != null) {
         var30.c = new kns(var0, var26, var24, var22, var23, var25, var6, var7, var9, 1);
      }
   }

   public static void e(bgi var0, Map var1, asm var2, int var3, int var4) {
      var0.getClass();
      var2 = var2.b(-446179233);
      int var10;
      if ((var4 & 1) != 0) {
         var10 = var3 | 6;
      } else if ((var3 & 14) == 0) {
         byte var18;
         if (!var2.B(var0)) {
            var18 = 2;
         } else {
            var18 = 4;
         }

         var10 = var3 | var18;
      } else {
         var10 = var3;
      }

      int var12 = var4 & 2;
      int var11 = var10;
      if (var12 != 0) {
         var11 = var10 | 16;
      }

      if (var12 == 2 && (var11 & 91) == 18 && var2.G()) {
         var2.q();
      } else {
         if (var12 != 0) {
            var1 = qtg.a;
         }

         Iterator var13 = var0.iterator();

         while(var13.hasNext()) {
            gh var14 = (gh)var13.next();
            String var15;
            if (var14 instanceof bgm) {
               var2.u(-326285587);
               bgm var19 = (bgm)var14;
               var15 = var19.a;
               gg.g(var19.b, var19.c, var15, var19.d, Float.valueOf(var19.e).floatValue(), var19.f, Float.valueOf(var19.g).floatValue(), Float.valueOf(var19.h).floatValue(), var19.i, var19.j, var19.k, Float.valueOf(var19.l).floatValue(), Float.valueOf(var19.m).floatValue(), Float.valueOf(var19.n).floatValue(), var2, 8, 0);
               ((asq)var2).S();
            } else if (var14 instanceof bgi) {
               var2.u(-326283729);
               bgi var16 = (bgi)var14;
               var15 = var16.a;
               float var7 = Float.valueOf(var16.b).floatValue();
               float var9 = Float.valueOf(var16.e).floatValue();
               float var6 = Float.valueOf(var16.f).floatValue();
               float var8 = Float.valueOf(var16.g).floatValue();
               float var5 = Float.valueOf(var16.h).floatValue();
               gg.f(var15, var7, Float.valueOf(var16.c).floatValue(), Float.valueOf(var16.d).floatValue(), var9, var6, var8, var5, var16.i, sr.t(var2, 1450046638, new afh(var14, var1, 6, (byte[])null)), var2, 939524096);
               ((asq)var2).S();
            } else {
               var2.u(-326282259);
               ((asq)var2).S();
            }
         }
      }

      aug var17 = var2.H();
      if (var17 != null) {
         var17.c = new akl(var0, (Map)var1, var3, var4, 3);
      }
   }

   public static bcu f(ktf var0) {
      Object var2;
      if (var0.h()) {
         Object var1 = var0.b;
         if (var1 != null) {
            var2 = new bcv((Shader)var1);
         } else {
            var2 = new bdt(bcq.i(var0.a));
         }
      } else {
         var2 = null;
      }

      return (bcu)var2;
   }
}
