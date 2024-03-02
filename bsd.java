import java.util.ArrayList;
import java.util.List;

public final class bsd implements bsg {
   public final bry a;
   public final List b;
   public final List c;
   private final qsd d;

   public bsd(bry var1, bss var2, List var3, bxr var4, fwf var5) {
      var1.getClass();
      var5.getClass();
      super();
      this.a = var1;
      this.b = var3;
      pwm.bu(3, new bmc(this, 8));
      this.d = pwm.bu(3, new bmc(this, 7));
      bsh var15 = var2.c;
      int var6 = brz.a;
      int var10 = var1.a.length();
      List var14 = var1.c;
      Object var23 = var14;
      if (var14 == null) {
         var23 = qtf.a;
      }

      ArrayList var25 = new ArrayList();
      int var9 = ((List)var23).size();
      int var7 = 0;

      int var8;
      int var11;
      for(var6 = 0; var7 < var9; var6 = var8) {
         brx var17 = (brx)((List)var23).get(var7);
         bsh var16 = (bsh)var17.a;
         var11 = var17.b;
         var8 = var17.c;
         if (var11 != var6) {
            var25.add(new brx(var15, var6, var11));
         }

         var25.add(new brx(var15.a(var16), var11, var8));
         ++var7;
      }

      if (var6 != var10) {
         var25.add(new brx(var15, var6, var10));
      }

      if (var25.isEmpty()) {
         var25.add(new brx(var15, 0, 0));
      }

      ArrayList var18 = new ArrayList(var25.size());
      var6 = var25.size();
      var7 = 0;

      for(ArrayList var24 = var25; var7 < var6; ++var7) {
         brx var19 = (brx)var24.get(var7);
         var9 = var19.b;
         var11 = var19.c;
         String var27;
         if (var9 != var11) {
            var27 = var1.a.substring(var9, var11);
            var27.getClass();
         } else {
            var27 = "";
         }

         Object var26;
         if (var9 == var11) {
            var26 = null;
         } else {
            List var29 = var1.b;
            if (var29 == null) {
               var26 = null;
            } else {
               label114: {
                  var8 = var9;
                  if (var9 == 0) {
                     if (var11 >= var1.a.length()) {
                        var26 = var29;
                        break label114;
                     }

                     var8 = 0;
                  }

                  var25 = new ArrayList(var29.size());
                  var9 = var29.size();

                  brx var20;
                  for(var10 = 0; var10 < var9; ++var10) {
                     Object var21 = var29.get(var10);
                     var20 = (brx)var21;
                     if (brz.c(var8, var11, var20.b, var20.c)) {
                        var25.add(var21);
                     }
                  }

                  ArrayList var32 = new ArrayList(var25.size());
                  var10 = var25.size();

                  for(var9 = 0; var9 < var10; ++var9) {
                     var20 = (brx)var25.get(var9);
                     var32.add(new brx(var20.a, qxb.m(var20.b, var8, var11) - var8, qxb.m(var20.c, var8, var11) - var8));
                  }

                  var26 = var32;
               }
            }
         }

         bry var30 = new bry(var27, (List)var26, (List)null, (List)null);
         bsh var28 = (bsh)var19.a;
         if (var28.b == null) {
            bxe var33 = var15.b;
            var28 = new bsh(var28.a, var33, var28.c, var28.d, var28.e, var28.f, var28.g, var28.h, var28.i);
         }

         String var35 = var30.a;
         bss var36 = new bss(var2.b, var2.c.a(var28));
         List var31 = var30.b;
         var26 = var31;
         if (var31 == null) {
            var26 = qtf.a;
         }

         var11 = var19.b;
         var9 = var19.c;
         ArrayList var22 = new ArrayList(0);
         ArrayList var37 = new ArrayList(var22.size());
         var10 = var22.size();

         for(var8 = 0; var8 < var10; ++var8) {
            brx var34 = (brx)var22.get(var8);
            int var12 = var34.b;
            if (var11 > var12) {
               throw new IllegalArgumentException("placeholder can not overlap with paragraph.");
            }

            int var13 = var34.c;
            if (var13 > var9) {
               throw new IllegalArgumentException("placeholder can not overlap with paragraph.");
            }

            var37.add(new brx(var34.a, var12 - var11, var13 - var11));
         }

         var18.add(new bsf(la.m(var35, var36, (List)var26, var37, var4, var5), var19.b, var19.c));
      }

      this.c = var18;
   }

   public final float a() {
      return ((Number)this.d.a()).floatValue();
   }

   public final float b() {
      throw null;
   }

   public final boolean c() {
      List var4 = this.c;
      int var2 = var4.size();
      boolean var3 = false;

      for(int var1 = 0; var1 < var2; ++var1) {
         if (((bsf)var4.get(var1)).a.c()) {
            var3 = true;
            break;
         }
      }

      return var3;
   }
}
