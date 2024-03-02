import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CameraManager.AvailabilityCallback;
import android.view.accessibility.AccessibilityEvent;
import androidx.wear.ambient.AmbientMode.AmbientController;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public final class us extends qwq implements qvi {
   final Object a;
   final Object b;
   private final int c;

   public us(Object var1, Object var2, int var3) {
      super(0);
      this.c = var3;
      this.a = var1;
      this.b = var2;
   }

   public us(Object var1, Object var2, int var3, byte[] var4) {
      super(0);
      this.c = var3;
      this.b = var1;
      this.a = var2;
   }

   // $FF: synthetic method
   public final Object a() {
      int var6 = this.c;
      boolean var7 = true;
      boolean var8 = true;
      byte var4 = 0;
      int var3 = 0;
      byte var5 = 0;
      float var1;
      Object var9;
      Object var11;
      int var18;
      Method var20;
      bml var29;
      Object var30;
      axf var31;
      Object[] var34;
      axa var36;
      switch(var6) {
      case 0:
         ((rdu)this.a).u(new uh((ut)this.b));
         return qsn.a;
      case 1:
         var9 = this.b;
         AvailabilityCallback var55 = (AvailabilityCallback)this.a;
         ((CameraManager)var9).unregisterAvailabilityCallback(var55);
         return qsn.a;
      case 2:
         ((rdb)this.a).u(this.b);
         return qsn.a;
      case 3:
         var9 = this.a;
         var30 = jj.l((blf)this.b, bkc.a);
         ((qwz)var9).a = var30;
         return qsn.a;
      case 4:
         aji var58 = (aji)((qvi)this.a).a();
         if (((ajz)((AmbientController)this.b).a).c()) {
            var1 = (float)var58.b() + 1.0F;
         } else {
            var1 = ((AmbientController)this.b).j();
         }

         return var1;
      case 5:
         if (!c.E(this.a, ((hqs)this.b).b)) {
            pwm.aO((List)((hqs)this.b).c, new aiz(this.a, 20));
            var9 = ((hqs)this.b).a;
            if (var9 != null) {
               ((aug)var9).a();
            }
         }

         return qsn.a;
      case 6:
         var9 = this.b;
         ezu var53 = (ezu)this.a;
         var11 = var53.a;
         var30 = var53.b;
         Object var54 = var53.e;
         ats var49 = (ats)var11;
         asq.aa((asq)var9, var49, (aue)var30, var54);
         return qsn.a;
      case 7:
         var30 = this.a;
         var9 = this.b;
         axb var46 = (axb)var30;
         var34 = var46.b;

         for(var18 = var46.a; var3 < var18; ++var3) {
            var11 = var34[var3];
            var11.getClass();
            ((asw)var9).i(var11);
         }

         return qsn.a;
      case 8:
         var30 = this.a;
         bbv var57 = ((bcd)this.b).d();
         ((qwz)var30).a = var57;
         return qsn.a;
      case 9:
         bmr var52 = ((bmd)this.b).n;
         Object var15 = this.a;
         if ((var52.a() & 8) != 0) {
            label480:
            for(bba var50 = var52.d; var50 != null; var50 = var50.s) {
               if ((var50.q & 8) != 0) {
                  bba var13 = var50;
                  axf var37 = null;

                  while(true) {
                     do {
                        if (var13 == null) {
                           continue label480;
                        }

                        if (var13 instanceof bnj) {
                           bnj var56 = (bnj)var13;
                           if (var56.et()) {
                              ((brl)((qwz)var15).a).b = true;
                           }

                           var56.c((brl)((qwz)var15).a);
                           var31 = var37;
                           break;
                        }

                        var31 = var37;
                        if ((var13.q & 8) == 0) {
                           break;
                        }

                        var31 = var37;
                        if (!(var13 instanceof blh)) {
                           break;
                        }

                        bba var45 = ((blh)var13).A;
                        var3 = 0;

                        for(var31 = var37; var45 != null; var3 = var18) {
                           bba var41 = var13;
                           axf var14 = var31;
                           var18 = var3;
                           if ((var45.q & 8) != 0) {
                              var18 = var3 + 1;
                              if (var18 == 1) {
                                 var41 = var45;
                                 var14 = var31;
                              } else {
                                 var37 = var31;
                                 if (var31 == null) {
                                    var37 = new axf(new bba[16]);
                                 }

                                 if (var13 != null) {
                                    var37.p(var13);
                                 }

                                 var37.p(var45);
                                 var9 = null;
                                 var14 = var37;
                                 var41 = (bba)var9;
                              }
                           }

                           var45 = var45.t;
                           var13 = var41;
                           var31 = var14;
                        }

                        var37 = var31;
                     } while(var3 == 1);

                     var13 = jj.f(var31);
                     var37 = var31;
                  }
               }
            }
         }

         return qsn.a;
      case 10:
         var29 = ((bmh)this.b).t;
         var29.i = 0;
         var31 = var29.a.m();
         var6 = var31.b;
         int var19;
         if (var6 > 0) {
            var34 = var31.a;
            var3 = 0;

            do {
               bmh var47 = ((bmd)var34[var3]).o.o;
               var47.getClass();
               var47.g = var47.h;
               var47.h = Integer.MAX_VALUE;
               if (var47.u == 2) {
                  var47.u = 3;
               }

               var19 = var3 + 1;
               var3 = var19;
            } while(var19 < var6);
         }

         var30 = this.b;
         var36 = axa.p;
         ((bmh)var30).e(var36);
         ((bmo)this.a).C().f();
         var31 = ((bmh)this.b).t.a.m();
         var19 = var31.b;
         if (var19 > 0) {
            Object[] var51 = var31.a;
            var3 = var4;

            do {
               bmh var48 = ((bmd)var51[var3]).o.o;
               var48.getClass();
               var6 = var48.g;
               var18 = var48.h;
               if (var6 != var18 && var18 == Integer.MAX_VALUE) {
                  var48.j();
               }

               var18 = var3 + 1;
               var3 = var18;
            } while(var18 < var19);
         }

         var30 = this.b;
         var36 = axa.q;
         ((bmh)var30).e(var36);
         return qsn.a;
      case 11:
         var29 = ((bmj)this.a).u;
         var29.j = 0;
         var31 = var29.a.m();
         var6 = var31.b;
         if (var6 > 0) {
            var34 = var31.a;
            var3 = 0;

            do {
               bmj var35 = ((bmd)var34[var3]).q();
               var35.g = var35.h;
               var35.h = Integer.MAX_VALUE;
               if (var35.v == 2) {
                  var35.v = 3;
               }

               var18 = var3 + 1;
               var3 = var18;
            } while(var18 < var6);
         }

         var30 = this.a;
         var36 = axa.s;
         ((bmj)var30).e(var36);
         ((bmd)this.b).r().C().f();
         bmd var39 = ((bmj)this.a).u.a;
         axf var40 = var39.m();
         var6 = var40.b;
         if (var6 > 0) {
            Object[] var42 = var40.a;
            var3 = var5;

            do {
               bmd var43 = (bmd)var42[var3];
               if (var43.q().g != var43.j()) {
                  var39.P();
                  var39.G();
                  if (var43.j() == Integer.MAX_VALUE) {
                     var43.q().k();
                  }
               }

               var18 = var3 + 1;
               var3 = var18;
            } while(var18 < var6);
         }

         var9 = this.a;
         axa var44 = axa.t;
         ((bmj)var9).e(var44);
         return qsn.a;
      case 12:
         var30 = this.a;
         var9 = this.b;
         ((bmz)var30).U((bcw)var9);
         return qsn.a;
      case 13:
         bpy var12 = (bpy)this.a;
         brj var25 = var12.d;
         brj var23 = var12.e;
         Float var32 = var12.b;
         Float var33 = var12.c;
         if (var25 != null && var32 != null) {
            var1 = ((Number)var25.a.a()).floatValue() - var32;
         } else {
            var1 = 0.0F;
         }

         float var2;
         if (var23 != null && var33 != null) {
            var2 = ((Number)var23.a.a()).floatValue() - var33;
         } else {
            var2 = 0.0F;
         }

         if (var1 != 0.0F || var2 != 0.0F) {
            var11 = this.b;
            var3 = ((bpy)this.a).a;
            var3 = ((bol)var11).m(var3);
            bol.M((bol)this.b, var3, 2048, 1, 8);
            AccessibilityEvent var38 = ((bol)this.b).o(var3, 4096);
            if (var25 != null) {
               var38.setScrollX((int)((Number)var25.a.a()).floatValue());
               var38.setMaxScrollX((int)((Number)var25.b.a()).floatValue());
            }

            if (var23 != null) {
               var38.setScrollY((int)((Number)var23.a.a()).floatValue());
               var38.setMaxScrollY((int)((Number)var23.b.a()).floatValue());
            }

            boe.a(var38, (int)var1, (int)var2);
            ((bol)this.b).Q(var38);
         }

         if (var25 != null) {
            var11 = this.a;
            Float var28 = (Float)var25.a.a();
            ((bpy)var11).b = var28;
         }

         if (var23 != null) {
            var30 = this.a;
            Float var26 = (Float)var23.a.a();
            ((bpy)var30).c = var26;
         }

         return qsn.a;
      case 14:
         ava var21 = (ava)this.b;
         var21.h((var21.f() + 1) % ((Object[])this.a).length);
         return qsn.a;
      case 15:
         var20 = this.a.getClass().getMethod("getWindowAreaComponent");
         var20.getClass();
         if (!cwm.e(var20) || !cwm.d(var20, ((cxi)this.b).a())) {
            var7 = false;
         }

         return var7;
      case 16:
         ((cyv)this.a).a.b((cew)this.b);
         return qsn.a;
      case 17:
         var9 = this.b;
         String var22 = ((Method)this.a).getName();
         Class[] var27 = ((Method)this.a).getParameterTypes();
         var27 = (Class[])Arrays.copyOf(var27, var27.length);
         var20 = ((Class)var9).getMethod(var22, var27);
         var20.getClass();
         if (cwm.e(var20)) {
            Class var24 = ((Method)this.a).getReturnType();
            var24.getClass();
            if (cwm.d(var20, var24)) {
               var7 = var8;
               return var7;
            }
         }

         var7 = false;
         return var7;
      case 18:
         ddq var10 = ((ddd)this.a).a;
         var11 = this.b;
         var9 = var10.b;
         synchronized(var9){}

         try {
            if (var10.c.remove(var11) && var10.c.isEmpty()) {
               var10.e();
            }
         } finally {
            ;
         }

         return qsn.a;
      default:
         var30 = ((odn)this.a).b;
         oag var59 = (oag)this.b;
         return ((AmbientController)var30).A(var59);
      }
   }
}
