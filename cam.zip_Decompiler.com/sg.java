import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.StateCallback;
import androidx.compose.animation.EnterExitTransitionElement;

public final class sg {
   public static final void a(CameraCaptureSession var0, StateCallback var1) {
      var0.getClass();
      if (var1 != null) {
         var1.onCaptureQueueEmpty(var0);
      }

   }

   public static final void b(boolean var0, bbb var1, yg var2, yh var3, String var4, qvy var5, asm var6, int var7) {
      asm var11 = var6.b(2088733774);
      int var19;
      if ((var7 & 14) == 0) {
         byte var8;
         if (!var11.C(var0)) {
            var8 = 2;
         } else {
            var8 = 4;
         }

         var19 = var8 | var7;
      } else {
         var19 = var7;
      }

      int var9 = var19 | 48;
      if ((var7 & 896) == 0) {
         short var21;
         if (!var11.B(var2)) {
            var21 = 128;
         } else {
            var21 = 256;
         }

         var19 = var9 | var21;
      } else {
         var19 = var9;
      }

      if ((var7 & 7168) == 0) {
         short var20;
         if (!var11.B(var3)) {
            var20 = 1024;
         } else {
            var20 = 2048;
         }

         var19 |= var20;
      }

      var9 = var19 | 24576;
      if ((var7 & 458752) == 0) {
         if (!var11.D(var5)) {
            var19 = 65536;
         } else {
            var19 = 131072;
         }

         var19 |= var9;
      } else {
         var19 = var9;
      }

      if ((374491 & var19) == 74898 && var11.G()) {
         var11.q();
      } else {
         bay var17 = bbb.d;
         Boolean var14 = var0;
         var11.u(2029166765);
         var11.u(-492369756);
         asq var12 = (asq)var11;
         Object var16 = var12.O();
         var1 = var16;
         if (var16 == asl.a) {
            var1 = new jed(new blj(var14), "AnimatedVisibility");
            var12.Y(var1);
         }

         jed var13;
         label58: {
            var9 = var19 & 14 | var19 >> 9 & 112;
            var12.S();
            var13 = (jed)var1;
            var13.f(var14, var11, var9 & 14 | var9 & 8 | 48);
            var11.u(1157296644);
            boolean var10 = var11.B(var13);
            var16 = var12.O();
            if (!var10) {
               var1 = var16;
               if (var16 != asl.a) {
                  break label58;
               }
            }

            var1 = new ou(var13, 15);
            var12.Y(var1);
         }

         var12.S();
         atj.c(var13, (qvt)var1, var11);
         var12.S();
         var9 = var19 << 3;
         yb var15 = yb.b;
         var4 = "AnimatedVisibility";
         e(var13, var15, var17, var2, var3, var5, var11, var19 & 458752 | var9 & 896 | 48 | var9 & 7168 | var9 & '\ue000');
         var1 = var17;
      }

      aug var18 = var11.H();
      if (var18 != null) {
         var18.c = new xx(var0, (bbb)var1, var2, var3, var4, var5, var7);
      }
   }

   public static final ree c(qvi var0) {
      return qwl.u(new avh(var0, (que)null));
   }

   // $FF: synthetic method
   public static att d(Object var0) {
      return so.i(var0, aup.c);
   }

   public static final void e(jed var0, qvt var1, bbb var2, yg var3, yh var4, qvy var5, asm var6, int var7) {
      asm var25 = var6.b(808253933);
      byte var10;
      int var11;
      if ((var7 & 14) == 0) {
         if (!var25.B(var0)) {
            var10 = 2;
         } else {
            var10 = 4;
         }

         var11 = var10 | var7;
      } else {
         var11 = var7;
      }

      int var33 = var11;
      if ((var7 & 112) == 0) {
         if (!var25.D(var1)) {
            var10 = 16;
         } else {
            var10 = 32;
         }

         var33 = var11 | var10;
      }

      short var34;
      if ((var7 & 896) == 0) {
         if (!var25.B(var2)) {
            var34 = 128;
         } else {
            var34 = 256;
         }

         var11 = var33 | var34;
      } else {
         var11 = var33;
      }

      var33 = var11;
      if ((var7 & 7168) == 0) {
         short var36;
         if (!var25.B(var3)) {
            var36 = 1024;
         } else {
            var36 = 2048;
         }

         var33 = var11 | var36;
      }

      var11 = var33;
      if ((var7 & '\ue000') == 0) {
         if (!var25.B(var4)) {
            var34 = 8192;
         } else {
            var34 = 16384;
         }

         var11 = var33 | var34;
      }

      var33 = var11;
      if ((458752 & var7) == 0) {
         if (!var25.D(var5)) {
            var33 = 65536;
         } else {
            var33 = 131072;
         }

         var33 |= var11;
      }

      if ((374491 & var33) == 74898 && var25.G()) {
         var25.q();
      } else {
         boolean var13;
         Object var19;
         asq var24;
         Object var32;
         label379: {
            var25.u(1157296644);
            var13 = var25.B(var0);
            var24 = (asq)var25;
            var19 = var24.O();
            if (!var13) {
               var32 = var19;
               if (var19 != asl.a) {
                  break label379;
               }
            }

            var32 = d(var1.eo(var0.d()));
            var24.Y(var32);
         }

         var24.S();
         att var20 = (att)var32;
         if ((Boolean)var1.eo(var0.e()) || (Boolean)var20.a() || var0.q()) {
            label373: {
               var25.u(1215497572);
               var25.u(1157296644);
               var13 = var25.B(var0);
               var19 = var24.O();
               if (!var13) {
                  var32 = var19;
                  if (var19 != asl.a) {
                     break label373;
                  }
               }

               var32 = var0.d();
               var24.Y(var32);
            }

            var24.S();
            if (var0.q()) {
               var32 = var0.d();
            }

            ya var21;
            ya var22;
            label367: {
               var25.u(-1220581778);
               var21 = f(var0, var1, var32, var25);
               var24.S();
               var32 = var0.e();
               var25.u(-1220581778);
               var22 = f(var0, var1, var32, var25);
               var24.S();
               var0.getClass();
               var25.u(-198307638);
               var25.u(1157296644);
               var13 = var25.B(var0);
               var19 = var24.O();
               if (!var13) {
                  var32 = var19;
                  if (var19 != asl.a) {
                     break label367;
                  }
               }

               var32 = new jed(new blj(var21), ((String)var0.b).concat(" > EnterExitTransition"));
               var24.Y(var32);
            }

            boolean var14;
            jed var26;
            label362: {
               var24.S();
               var26 = (jed)var32;
               var25.u(511388516);
               var13 = var25.B(var0);
               var14 = var25.B(var26);
               var19 = var24.O();
               if (!(var13 | var14)) {
                  var32 = var19;
                  if (var19 != asl.a) {
                     break label362;
                  }
               }

               var32 = new zy(var0, var26, 2);
               var24.Y(var32);
            }

            var24.S();
            atj.c(var26, (qvt)var32, var25);
            if (var0.q()) {
               var26.t(var21, var22);
            } else {
               var26.o(var22, var25, 0);
               var26.l(false);
            }

            label356: {
               var24.S();
               var24.S();
               var25.u(511388516);
               var14 = var25.B(var26);
               var13 = var25.B(var20);
               var19 = var24.O();
               if (!(var14 | var13)) {
                  var32 = var19;
                  if (var19 != asl.a) {
                     break label356;
                  }
               }

               var32 = new xv(var26, var20, (que)null);
               var24.Y(var32);
            }

            var24.S();
            atj.e(var26, (qvx)var32, var25);
            var11 = var33 >> 3;
            var25.u(-1967270694);
            if (var26.d() == ya.b || var26.e() == ya.b) {
               label346: {
                  var25.u(1157296644);
                  var13 = var25.B(var26);
                  var19 = var24.O();
                  if (!var13) {
                     var32 = var19;
                     if (var19 != asl.a) {
                        break label346;
                     }
                  }

                  var32 = new lmk(var26);
                  var24.Y(var32);
               }

               lmk var27;
               label341: {
                  var24.S();
                  var27 = (lmk)var32;
                  zx var35 = yd.a;
                  var26.getClass();
                  var25.u(914000546);
                  var25.u(1157296644);
                  var13 = var25.B(var26);
                  var19 = var24.O();
                  if (!var13) {
                     var32 = var19;
                     if (var19 != asl.a) {
                        break label341;
                     }
                  }

                  var32 = d(false);
                  var24.Y(var32);
               }

               label336: {
                  var24.S();
                  var20 = (att)var32;
                  var25.u(1157296644);
                  var13 = var25.B(var26);
                  var19 = var24.O();
                  if (!var13) {
                     var32 = var19;
                     if (var19 != asl.a) {
                        break label336;
                     }
                  }

                  var32 = d(false);
                  var24.Y(var32);
               }

               var24.S();
               att var46 = (att)var32;
               boolean var37;
               if (var26.d() == var26.e()) {
                  if (var26.q()) {
                     var37 = true;
                  } else {
                     var37 = false;
                  }
               } else {
                  var37 = true;
               }

               if (var37) {
                  if (!yd.e(var20)) {
                     var13 = false;
                  } else {
                     var13 = true;
                  }
               } else {
                  var13 = false;
               }

               var20.b(var13);
               if (var37) {
                  if (!yd.f(var46)) {
                     var13 = false;
                  } else {
                     var13 = true;
                  }
               } else {
                  var13 = false;
               }

               var46.b(var13);
               var25.u(1657241476);
               duu var44;
               if (yd.e(var20)) {
                  bpe var38 = aam.g;
                  var25.u(-492369756);
                  var19 = var24.O();
                  var32 = var19;
                  if (var19 == asl.a) {
                     var32 = "Built-in slide";
                     var24.Y("Built-in slide");
                  }

                  var24.S();
                  var44 = ei.j(var26, var38, (String)var32, var25);
               } else {
                  var44 = null;
               }

               var24.S();
               var25.u(1657241646);
               duu var40;
               if (yd.f(var46)) {
                  bpe var41 = aam.h;
                  var25.u(-492369756);
                  Object var39 = var24.O();
                  var32 = var39;
                  if (var39 == asl.a) {
                     var32 = "Built-in shrink/expand";
                     var24.Y("Built-in shrink/expand");
                  }

                  var24.S();
                  var40 = ei.j(var26, var41, (String)var32, var25);
               } else {
                  var40 = null;
               }

               var24.S();
               var25.u(1657241814);
               duu var45;
               if (yd.f(var46)) {
                  bpe var23 = aam.g;
                  var25.u(-492369756);
                  Object var42 = var24.O();
                  var32 = var42;
                  if (var42 == asl.a) {
                     var32 = "Built-in InterruptionHandlingOffset";
                     var24.Y("Built-in InterruptionHandlingOffset");
                  }

                  var24.S();
                  var45 = ei.j(var26, var23, (String)var32, var25);
               } else {
                  var45 = null;
               }

               Object var48;
               label330: {
                  var24.S();
                  var14 = yd.f(var46);
                  var25.u(-1792417184);
                  var25.u(1157296644);
                  var13 = var25.B(var26);
                  var48 = var24.O();
                  if (!var13) {
                     var32 = var48;
                     if (var48 != asl.a) {
                        break label330;
                     }
                  }

                  var32 = d(false);
                  var24.Y(var32);
               }

               att var51;
               label325: {
                  var24.S();
                  var51 = (att)var32;
                  var25.u(1157296644);
                  var13 = var25.B(var26);
                  var48 = var24.O();
                  if (!var13) {
                     var32 = var48;
                     if (var48 != asl.a) {
                        break label325;
                     }
                  }

                  var32 = d(false);
                  var24.Y(var32);
               }

               var24.S();
               att var28 = (att)var32;
               if (var26.d() == var26.e()) {
                  if (var26.q()) {
                     var37 = true;
                  } else {
                     var37 = false;
                  }
               } else {
                  var37 = true;
               }

               label318: {
                  if (var37) {
                     if (yd.c(var51) || var3.b.a != null) {
                        var13 = true;
                        break label318;
                     }

                     if (var4.b.a != null) {
                        var13 = true;
                        break label318;
                     }
                  }

                  var13 = false;
               }

               var51.b(var13);
               if (var37) {
                  if (!yd.d(var28)) {
                     var13 = false;
                  } else {
                     var13 = true;
                  }
               } else {
                  var13 = false;
               }

               var28.b(var13);
               var25.u(-1158247920);
               ya var30;
               if (yd.c(var51)) {
                  ack var29 = new ack(var3, var4, 1);
                  var25.u(-492369756);
                  var48 = var24.O();
                  var32 = var48;
                  if (var48 == asl.a) {
                     var32 = "Built-in alpha";
                     var24.Y("Built-in alpha");
                  }

                  float var8;
                  float var9;
                  String var43;
                  bpe var53;
                  label303: {
                     var24.S();
                     var43 = (String)var32;
                     var25.u(-1338768149);
                     var53 = aam.a;
                     var25.u(-142660079);
                     var30 = (ya)var26.d();
                     var25.u(244347572);
                     var33 = var30.ordinal();
                     var9 = 0.0F;
                     switch(var33) {
                     case 0:
                        if (var3.b.a != null) {
                           var8 = 0.0F;
                           break label303;
                        }
                     case 1:
                        break;
                     case 2:
                        if (var4.b.a != null) {
                           var8 = 0.0F;
                           break label303;
                        }
                        break;
                     default:
                        throw new qse();
                     }

                     var8 = 1.0F;
                  }

                  label293: {
                     var24.S();
                     var30 = (ya)var26.e();
                     var25.u(244347572);
                     switch(var30.ordinal()) {
                     case 0:
                        if (var3.b.a != null) {
                           break label293;
                        }
                     case 1:
                        break;
                     case 2:
                        if (var4.b.a != null) {
                           break label293;
                        }
                        break;
                     default:
                        throw new qse();
                     }

                     var9 = 1.0F;
                  }

                  var24.S();
                  Object var64 = var29.a(var26.r(), var25, 0);
                  var32 = ei.k(var26, var8, var9, (zp)var64, var53, var43, var25);
                  var24.S();
                  var24.S();
               } else {
                  var32 = yd.d;
               }

               var24.S();
               if (yd.d(var28)) {
                  var25.u(-1158247011);
                  yc var62 = new yc(0);
                  var25.u(-492369756);
                  Object var54 = var24.O();
                  var48 = var54;
                  if (var54 == asl.a) {
                     var48 = "Built-in scale";
                     var24.Y("Built-in scale");
                  }

                  var24.S();
                  String var56 = (String)var48;
                  var25.u(-1338768149);
                  bpe var65 = aam.a;
                  var25.u(-142660079);
                  var22 = (ya)var26.d();
                  var25.u(-483324214);
                  label271:
                  switch(var22.ordinal()) {
                  case 0:
                  case 1:
                  case 2:
                     var24.S();
                     Float var66 = 1.0F;
                     var22 = (ya)var26.e();
                     var25.u(-483324214);
                     switch(var22.ordinal()) {
                     case 0:
                     case 1:
                     case 2:
                        var24.S();
                        aae var31 = var26.r();
                        Integer var58 = 0;
                        avi var57 = ei.k(var26, var66, var66, (zp)var62.a(var31, var25, var58), var65, var56, var25);
                        var24.S();
                        var24.S();
                        var26.d();
                        var65 = yd.e;
                        var25.u(-142660079);
                        var62 = yc.a;
                        var30 = (ya)var26.d();
                        var25.u(1656806878);
                        switch(var30.ordinal()) {
                        case 0:
                        case 1:
                        case 2:
                           long var17 = bdx.a;
                           var24.S();
                           bdx var67 = bdx.c(var17);
                           var30 = (ya)var26.e();
                           var25.u(1656806878);
                           switch(var30.ordinal()) {
                           case 0:
                           case 1:
                           case 2:
                              var17 = bdx.a;
                              var24.S();
                              avi var63 = ei.k(var26, var67, bdx.c(var17), (zp)var62.a(var26.r(), var25, var58), var65, "TransformOriginInterruptionHandling", var25);
                              var24.S();
                              var25.u(1618982084);
                              boolean var16 = var25.B(var32);
                              boolean var15 = var25.B(var57);
                              var13 = var25.B(var63);
                              var48 = var24.O();
                              if (!(var16 | var15 | var13) && var48 != asl.a) {
                                 var32 = var48;
                              } else {
                                 var32 = new adb(var32, var57, var63, 1);
                                 var24.Y(var32);
                              }

                              var24.S();
                              var32 = (qvt)var32;
                              var24.S();
                              break label271;
                           default:
                              throw new qse();
                           }
                        default:
                           throw new qse();
                        }
                     default:
                        throw new qse();
                     }
                  default:
                     throw new qse();
                  }
               } else if (!yd.c(var51)) {
                  var25.u(-1158244852);
                  var24.S();
                  var32 = yb.d;
               } else {
                  var25.u(-1158244896);
                  var25.u(1157296644);
                  var13 = var25.B(var32);
                  var48 = var24.O();
                  if (!var13 && var48 != asl.a) {
                     var32 = var48;
                  } else {
                     var32 = new ou(var32, 8);
                     var24.Y(var32);
                  }

                  var24.S();
                  var32 = (qvt)var32;
                  var24.S();
               }

               var24.S();
               bbb var47 = bdn.c(bbb.d, 0.0F, 0.0F, 0.0F, 0.0F, (bdr)null, var14, 126975).g(new EnterExitTransitionElement(var26, var40, var45, var44, var3, var4, (qvt)var32));
               var24.S();
               var25.u(-492369756);
               var19 = var24.O();
               var32 = var19;
               if (var19 == asl.a) {
                  var32 = new xu(var27);
                  var24.Y(var32);
               }

               var24.S();
               bjt var52 = (bjt)var32;
               var25.u(-1323940314);
               var33 = lh.d(var25);
               aue var50 = var24.L();
               int var12 = ble.a;
               qvi var59 = bld.a;
               qvy var60 = iz.h(var47);
               var25.v();
               if (var24.p) {
                  var25.j(var59);
               } else {
                  var25.x();
               }

               avl.a(var25, var52, bld.d);
               avl.a(var25, var50, bld.c);
               qvx var55 = bld.e;
               if (var24.p || !c.E(var24.O(), var33)) {
                  Integer var49 = var33;
                  var24.Y(var49);
                  var25.h(var49, var55);
               }

               var60.a(aur.a(var25), var25, 0);
               var25.u(2058660585);
               var5.a(var27, var25, (var11 & '\ue000' | var11 & 112 | var11 & 896 | var11 & 7168) >> 9 & 112 | 8);
               var24.S();
               var25.m();
               var24.S();
            }

            var24.S();
         }
      }

      aug var61 = var25.H();
      if (var61 != null) {
         var61.c = new xw(var0, var1, var2, var3, var4, var5, var7);
      }
   }

   private static final ya f(jed var0, qvt var1, Object var2, asm var3) {
      var3.u(361571134);
      var3.s(-721837504, var0);
      ya var7;
      if (var0.q()) {
         if ((Boolean)var1.eo(var2)) {
            var7 = ya.b;
         } else if ((Boolean)var1.eo(var0.d())) {
            var7 = ya.c;
         } else {
            var7 = ya.a;
         }
      } else {
         var3.u(-492369756);
         asq var6 = (asq)var3;
         Object var5 = var6.O();
         Object var4 = var5;
         if (var5 == asl.a) {
            var4 = d(false);
            var6.Y(var4);
         }

         var6.S();
         att var9 = (att)var4;
         if ((Boolean)var1.eo(var0.d())) {
            var9.b(true);
         }

         if ((Boolean)var1.eo(var2)) {
            var7 = ya.b;
         } else if ((Boolean)var9.a()) {
            var7 = ya.c;
         } else {
            var7 = ya.a;
         }
      }

      asq var8 = (asq)var3;
      var8.S();
      var8.S();
      return var7;
   }
}
