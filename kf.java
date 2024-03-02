import android.view.View;
import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.foundation.layout.WrapContentElement;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class kf {
   public kf() {
   }

   public kf(byte[] var1) {
   }

   static void a(View var0, float var1, float var2) {
      var0.drawableHotspotChanged(var1, var2);
   }

   public static void b(View var0) {
      label539: {
         Method var1;
         boolean var10001;
         Field var74;
         label540: {
            try {
               if (bqc.c) {
                  break label540;
               }

               bqc.c = true;
               bqc.a = (Method)Class.class.getDeclaredMethod("getDeclaredMethod", String.class, (new Class[0]).getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
               bqc.b = (Field)Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
               var1 = bqc.a;
            } catch (Throwable var73) {
               var10001 = false;
               break label539;
            }

            if (var1 != null) {
               try {
                  var1.setAccessible(true);
               } catch (Throwable var72) {
                  var10001 = false;
                  break label539;
               }
            }

            try {
               var74 = bqc.b;
            } catch (Throwable var71) {
               var10001 = false;
               break label539;
            }

            if (var74 != null) {
               try {
                  var74.setAccessible(true);
               } catch (Throwable var70) {
                  var10001 = false;
                  break label539;
               }
            }
         }

         try {
            var74 = bqc.b;
         } catch (Throwable var69) {
            var10001 = false;
            break label539;
         }

         if (var74 != null) {
            try {
               var74.setBoolean(var0, true);
            } catch (Throwable var68) {
               var10001 = false;
               break label539;
            }
         }

         try {
            var1 = bqc.a;
         } catch (Throwable var67) {
            var10001 = false;
            break label539;
         }

         if (var1 == null) {
            return;
         }

         label511:
         try {
            var1.invoke(var0);
            return;
         } catch (Throwable var66) {
            var10001 = false;
            break label511;
         }
      }

      bqc.d = true;
   }

   public static bbb c(bbb var0, String var1) {
      var0.getClass();
      return brm.b(var0, new bkh(var1, 13));
   }

   public static boolean d(float[] var0, float[] var1) {
      var0.getClass();
      var1.getClass();
      float var28 = var0[0];
      float var18 = var0[1];
      float var14 = var0[2];
      float var15 = var0[3];
      float var22 = var0[4];
      float var10 = var0[5];
      float var16 = var0[6];
      float var20 = var0[7];
      float var19 = var0[8];
      float var23 = var0[9];
      float var11 = var0[10];
      float var7 = var0[11];
      float var25 = var0[12];
      float var9 = var0[13];
      float var17 = var0[14];
      float var13 = var0[15];
      float var5 = var14 * var20 - var15 * var16;
      float var21 = var19 * var9 - var23 * var25;
      float var2 = var18 * var20 - var15 * var10;
      float var26 = var19 * var17 - var11 * var25;
      float var3 = var18 * var16 - var14 * var10;
      float var8 = var19 * var13 - var7 * var25;
      float var24 = var28 * var20 - var15 * var22;
      float var4 = var23 * var17 - var11 * var9;
      float var6 = var28 * var16 - var14 * var22;
      float var12 = var23 * var13 - var7 * var9;
      float var27 = var28 * var10 - var18 * var22;
      float var30 = var11 * var13 - var7 * var17;
      float var29 = var27 * var30 - var6 * var12 + var24 * var4 + var3 * var8 - var2 * var26 + var5 * var21;
      if (var29 == 0.0F) {
         return false;
      } else {
         var29 = 1.0F / var29;
         var1[0] = (var10 * var30 - var16 * var12 + var20 * var4) * var29;
         var1[1] = (-var18 * var30 + var14 * var12 - var15 * var4) * var29;
         var1[2] = (var9 * var5 - var17 * var2 + var13 * var3) * var29;
         var1[3] = (-var23 * var5 + var11 * var2 - var7 * var3) * var29;
         float var31 = -var22;
         var1[4] = (var31 * var30 + var16 * var8 - var20 * var26) * var29;
         var1[5] = (var30 * var28 - var14 * var8 + var15 * var26) * var29;
         var30 = -var25;
         var1[6] = (var30 * var5 + var17 * var24 - var13 * var6) * var29;
         var1[7] = (var5 * var19 - var11 * var24 + var7 * var6) * var29;
         var1[8] = (var22 * var12 - var10 * var8 + var20 * var21) * var29;
         var1[9] = (-var28 * var12 + var8 * var18 - var15 * var21) * var29;
         var1[10] = (var25 * var2 - var9 * var24 + var13 * var27) * var29;
         var1[11] = (-var19 * var2 + var24 * var23 - var7 * var27) * var29;
         var1[12] = (var31 * var4 + var10 * var26 - var16 * var21) * var29;
         var1[13] = (var28 * var4 - var18 * var26 + var14 * var21) * var29;
         var1[14] = (var30 * var3 + var9 * var6 - var17 * var27) * var29;
         var1[15] = (var19 * var3 - var23 * var6 + var11 * var27) * var29;
         return true;
      }
   }

   public static void e(qvx var0, qvi var1, bbb var2, lmk var3, bdr var4, long var5, long var7, kf var9, asm var10, int var11) {
      var0.getClass();
      asm var18 = var10.b(-1555720195);
      int var34;
      if ((var11 & 14) == 0) {
         byte var12;
         if (!var18.D(var0)) {
            var12 = 2;
         } else {
            var12 = 4;
         }

         var34 = var11 | var12;
      } else {
         var34 = var11;
      }

      if ((var11 & 112) == 0) {
         byte var13;
         if (!var18.D(var1)) {
            var13 = 16;
         } else {
            var13 = 32;
         }

         var34 |= var13;
      }

      int var35 = var34 | 28032;
      var34 = var35;
      if ((var11 & 458752) == 0) {
         var34 = var35 | 65536;
      }

      var35 = var34;
      if ((var11 & 3670016) == 0) {
         var35 = var34 | 524288;
      }

      var34 = var35;
      if ((var11 & 29360128) == 0) {
         var34 = var35 | 4194304;
      }

      var35 = var34;
      if ((var11 & 234881024) == 0) {
         var35 = var34 | 33554432;
      }

      long var15;
      Object var22;
      lmk var26;
      kf var27;
      Object var28;
      if ((191739611 & var35) == 38347922 && var18.G()) {
         var18.q();
         var15 = var7;
         var28 = var2;
         var26 = var3;
         var22 = var4;
         var7 = var5;
         var5 = var15;
         var27 = var9;
      } else {
         var18.r();
         if ((var11 & 1) != 0 && !var18.E()) {
            var18.q();
            var22 = var4;
            var15 = var7;
            var34 = var35 & -268369921;
            var28 = var2;
            var26 = var3;
            var7 = var5;
            var5 = var15;
            var27 = var9;
         } else {
            var28 = bbb.d;
            var18.u(-492369756);
            asq var29 = (asq)var18;
            var22 = var29.O();
            Object var21 = var22;
            if (var22 == asl.a) {
               var21 = eu.l();
               var29.Y(var21);
            }

            var29.S();
            var26 = (lmk)var21;
            alt var23 = kh.d(var18).a;
            alu var24 = jk.d(50);
            var22 = new alz(var24, var24, var24, var24);
            var7 = kh.c(var18).j();
            var5 = anh.a(var7, var18);
            var18.u(380403812);
            bxt var17 = bxt.a(6.0F);
            boolean var36 = false;
            bxt var25 = bxt.a(12.0F);
            bxt var20 = bxt.a(8.0F);
            bxt var19 = bxt.a(8.0F);
            var18.u(-568225417);

            for(int var14 = 0; var14 < 4; ++var14) {
               var36 |= var18.B((new Object[]{var17, var25, var20, var19})[var14]);
            }

            var21 = var29.O();
            if (var36 || var21 == asl.a) {
               var21 = new kf((byte[])null);
               var29.Y(var21);
            }

            var29.S();
            var27 = (kf)var21;
            var29.S();
            var34 = var35 & -268369921;
         }

         var18.l();
         WrapContentElement var31 = aix.a;
         var28.getClass();
         SizeElement var38 = new SizeElement(48.0F, 48.0F, Float.NaN, Float.NaN, true);
         ayt var32 = sr.t(var18, 1418981691, new ajh(var34, var0, 3));
         var35 = var34 >> 6;
         f(var1, var38, var26, (bdr)var22, var7, var5, var27, var32, var18, var35 & '\ue000' | var34 >> 3 & 14 | 12582912 | var35 & 896 | var35 & 7168 | 458752 & var35 | 3670016 & var35);
      }

      aug var33 = var18.H();
      if (var33 != null) {
         var33.c = new aob(var0, var1, (bbb)var28, var26, (bdr)var22, var7, var5, var27, var11, 1);
      }
   }

   public static void f(qvi var0, bbb var1, lmk var2, bdr var3, long var4, long var6, kf var8, qvx var9, asm var10, int var11) {
      asm var18 = var10.b(1028985328);
      byte var12;
      int var13;
      if ((var11 & 14) == 0) {
         if (!var18.D(var0)) {
            var12 = 2;
         } else {
            var12 = 4;
         }

         var13 = var12 | var11;
      } else {
         var13 = var11;
      }

      int var23 = var13;
      if ((var11 & 112) == 0) {
         if (!var18.B(var1)) {
            var12 = 16;
         } else {
            var12 = 32;
         }

         var23 = var13 | var12;
      }

      var13 = var23;
      short var24;
      if ((var11 & 896) == 0) {
         if (!var18.B(var2)) {
            var24 = 128;
         } else {
            var24 = 256;
         }

         var13 = var23 | var24;
      }

      if ((var11 & 7168) == 0) {
         short var25;
         if (!var18.B(var3)) {
            var25 = 1024;
         } else {
            var25 = 2048;
         }

         var23 = var13 | var25;
      } else {
         var23 = var13;
      }

      if ((var11 & '\ue000') == 0) {
         if (!var18.A(var4)) {
            var24 = 8192;
         } else {
            var24 = 16384;
         }

         var23 |= var24;
      }

      var13 = var23;
      if ((var11 & 458752) == 0) {
         if (!var18.A(var6)) {
            var13 = 65536;
         } else {
            var13 = 131072;
         }

         var13 |= var23;
      }

      var23 = var13;
      if ((3670016 & var11) == 0) {
         if (!var18.B(var8)) {
            var23 = 524288;
         } else {
            var23 = 1048576;
         }

         var23 |= var13;
      }

      var13 = var23;
      if ((29360128 & var11) == 0) {
         if (!var18.D(var9)) {
            var13 = 4194304;
         } else {
            var13 = 8388608;
         }

         var13 |= var23;
      }

      if ((23967451 & var13) == 4793490 && var18.G()) {
         var18.q();
      } else {
         var18.r();
         if ((var11 & 1) != 0 && !var18.E()) {
            var18.q();
         }

         bbb var16;
         asq var17;
         Object var19;
         label89: {
            var18.l();
            var16 = brm.b(var1, aal.q);
            var2.getClass();
            var18.u(-478475335);
            var18.u(1157296644);
            boolean var14 = var18.B(var2);
            var17 = (asq)var18;
            Object var15 = var17.O();
            if (!var14) {
               var19 = var15;
               if (var15 != asl.a) {
                  break label89;
               }
            }

            var19 = new yt(bxt.a(6.0F), aam.c, (Object)null, 12);
            var17.Y(var19);
         }

         var17.S();
         yt var20 = (yt)var19;
         atj.e(var2, new anr(var2, var8, var20, (que)null), var18);
         zc var21 = var20.a;
         var17.S();
         la.n(var0, var16, false, var3, var4, var6, ((bxt)var21.a()).a, var2, sr.t(var18, 1972871863, new aoa(var6, var9, var13)), var18, var13 & 14 | 805306368 | var13 & 7168 | '\ue000' & var13 | 458752 & var13 | var13 << 18 & 234881024, 68);
      }

      aug var22 = var18.H();
      if (var22 != null) {
         var22.c = new aob(var0, var1, var2, var3, var4, var6, var8, var9, var11, 0);
      }
   }
}
