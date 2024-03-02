import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.PowerManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.List;
import java.util.Locale;

public class es {
   static String a(Locale var0) {
      return var0.toLanguageTag();
   }

   static boolean b(PowerManager var0) {
      return var0.isPowerSaveMode();
   }

   // $FF: synthetic method
   public static Object e(aeq var0, qvx var1, que var2) {
      return var0.a(acn.a, var1, var2);
   }

   public static Object f(bij var0, qvt var1, qvi var2, bin var3, aez var4, que var5) {
      int var13;
      aec var42;
      label299: {
         if (var5 instanceof aec) {
            aec var20 = (aec)var5;
            var13 = var20.k;
            if ((var13 & Integer.MIN_VALUE) != 0) {
               var20.k = var13 + Integer.MIN_VALUE;
               var42 = var20;
               break label299;
            }
         }

         var42 = new aec(var5);
      }

      bhw var26;
      qwy var29;
      qsg var32;
      label303: {
         float var6;
         float var7;
         float var8;
         float var9;
         int var14;
         int var15;
         long var16;
         Object var21;
         bhw var22;
         bhl var23;
         qwy var25;
         bij var27;
         bij var31;
         qwy var35;
         Object var36;
         afa var39;
         qul var46;
         List var50;
         label304: {
            var21 = var42.j;
            var46 = qul.a;
            var13 = var42.k;
            var23 = null;
            aez var28;
            qwy var34;
            afh var37;
            bhw var41;
            afh var47;
            switch(var13) {
            case 0:
               pwm.bs(var21);
               var42.a = var0;
               var42.b = var1;
               var42.c = var2;
               var42.d = var3;
               var42.e = var4;
               var42.k = 1;
               Object var24 = ahb.b(var0, false, 1, var42);
               if (var24 == var46) {
                  return var46;
               }

               var27 = var0;
               var41 = (bhw)var24;
               if (!(Boolean)var1.eo(var41)) {
                  var32 = var23;
                  return var32;
               }

               if ((Boolean)var2.a()) {
                  var41.b();
                  bio.b(var3, var41);
                  var32 = pwm.bq(var41, bci.i(bci.a));
                  return var32;
               }

               var42.a = var0;
               var42.b = var3;
               var42.c = var4;
               var42.d = null;
               var42.e = null;
               var42.k = 2;
               var21 = ahb.d(var0, var42, 2);
               if (var21 == var46) {
                  return var46;
               }

               var41 = (bhw)var21;
               bio.b(var3, var41);
               var34 = new qwy();
               var34.a = bci.a;
               var47 = new afh(var3, var34, 1, (byte[])null);
               var16 = var41.a;
               var13 = var41.i;
               var4.getClass();
               if (var4 == aez.a) {
                  var39 = aea.b;
               } else {
                  var39 = aea.a;
               }

               if (aea.b(var0.k(), var16)) {
                  var0 = null;
                  if (var0 != null) {
                     return pwm.bq(var0, bci.i(var34.a));
                  }

                  var32 = null;
                  return var32;
               }

               var7 = aea.a(var0.l(), var13);
               var25 = new qwy();
               var25.a = var16;
               var35 = var34;
               var37 = var47;
               var8 = 0.0F;
               var13 = 1;
               var6 = 0.0F;
               break;
            case 1:
               var28 = (aez)var42.e;
               bin var38 = (bin)var42.d;
               qvi var33 = (qvi)var42.c;
               qvt var40 = (qvt)var42.b;
               bij var49 = (bij)var42.a;
               pwm.bs(var21);
               var27 = var49;
               var41 = (bhw)var21;
               if (!(Boolean)var40.eo(var41)) {
                  var32 = var23;
                  return var32;
               }

               if ((Boolean)var33.a()) {
                  var41.b();
                  bio.b(var38, var41);
                  var32 = pwm.bq(var41, bci.i(bci.a));
                  return var32;
               }

               var42.a = var49;
               var42.b = var38;
               var42.c = var28;
               var42.d = null;
               var42.e = null;
               var42.k = 2;
               var21 = ahb.d(var49, var42, 2);
               if (var21 == var46) {
                  return var46;
               }

               var41 = (bhw)var21;
               bio.b(var38, var41);
               var34 = new qwy();
               var34.a = bci.a;
               var47 = new afh(var38, var34, 1, (byte[])null);
               var16 = var41.a;
               var13 = var41.i;
               var28.getClass();
               if (var28 == aez.a) {
                  var39 = aea.b;
               } else {
                  var39 = aea.a;
               }

               if (aea.b(var49.k(), var16)) {
                  var0 = null;
                  if (var0 != null) {
                     return pwm.bq(var0, bci.i(var34.a));
                  }

                  var32 = null;
                  return var32;
               }

               var7 = aea.a(var49.l(), var13);
               var25 = new qwy();
               var25.a = var16;
               var35 = var34;
               var37 = var47;
               var8 = 0.0F;
               var13 = 1;
               var6 = 0.0F;
               break;
            case 2:
               var28 = (aez)var42.c;
               var3 = (bin)var42.b;
               var27 = (bij)var42.a;
               pwm.bs(var21);
               var41 = (bhw)var21;
               bio.b(var3, var41);
               var34 = new qwy();
               var34.a = bci.a;
               var47 = new afh(var3, var34, 1, (byte[])null);
               var16 = var41.a;
               var13 = var41.i;
               var28.getClass();
               if (var28 == aez.a) {
                  var39 = aea.b;
               } else {
                  var39 = aea.a;
               }

               if (aea.b(var27.k(), var16)) {
                  var0 = null;
                  if (var0 != null) {
                     return pwm.bq(var0, bci.i(var34.a));
                  }

                  var32 = null;
                  return var32;
               }

               var7 = aea.a(var27.l(), var13);
               var25 = new qwy();
               var25.a = var16;
               var35 = var34;
               var37 = var47;
               var8 = 0.0F;
               var13 = 1;
               var6 = 0.0F;
               break;
            case 3:
               var7 = var42.i;
               var8 = var42.h;
               var6 = var42.g;
               var13 = var42.f;
               var29 = (qwy)var42.e;
               var39 = (afa)var42.d;
               var31 = (bij)var42.c;
               var36 = (qvx)var42.b;
               var25 = (qwy)var42.a;
               pwm.bs(var21);
               var23 = (bhl)var21;
               var50 = var23.a;
               var15 = var50.size();
               var14 = 0;
               break label304;
            case 4:
               var6 = var42.i;
               var8 = var42.h;
               var7 = var42.g;
               var13 = var42.f;
               var22 = var42.l;
               var25 = (qwy)var42.e;
               var39 = (afa)var42.d;
               var27 = (bij)var42.c;
               qvx var30 = (qvx)var42.b;
               var35 = (qwy)var42.a;
               pwm.bs(var21);
               if (var22.c()) {
                  var29 = var35;
                  var26 = null;
                  break label303;
               }

               var42.a = var35;
               var42.b = var30;
               var42.c = var27;
               var42.d = var39;
               var42.e = var25;
               var42.l = null;
               var42.f = var13;
               var42.g = var7;
               var42.h = var8;
               var42.i = var6;
               var42.k = 3;
               var21 = hf.e(var27, var42);
               if (var21 == var46) {
                  return var46;
               }

               var9 = var6;
               var29 = var25;
               var6 = var7;
               var25 = var35;
               var36 = var30;
               var31 = var27;
               var7 = var9;
               var23 = (bhl)var21;
               var50 = var23.a;
               var15 = var50.size();
               var14 = 0;
               break label304;
            default:
               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            var42.a = var35;
            var42.b = var37;
            var42.c = var27;
            var42.d = var39;
            var42.e = var25;
            var42.l = null;
            var42.f = var13;
            var42.g = var7;
            var42.h = var8;
            var42.i = var6;
            var42.k = 3;
            var21 = hf.e(var27, var42);
            if (var21 == var46) {
               return var46;
            }

            var9 = var6;
            var29 = var25;
            var6 = var7;
            var25 = var35;
            var36 = var37;
            var31 = var27;
            var7 = var9;
            var23 = (bhl)var21;
            var50 = var23.a;
            var15 = var50.size();
            var14 = 0;
         }

         label284:
         while(true) {
            label282:
            while(true) {
               if (var14 < var15) {
                  var21 = var50.get(var14);
                  if (!c.o(((bhw)var21).a, var29.a)) {
                     ++var14;
                     continue;
                  }

                  var22 = (bhw)var21;
                  if (var22 == null) {
                     break label284;
                  }

                  if (var22.c()) {
                     var29 = var25;
                     var26 = null;
                     break label303;
                  }
               } else {
                  var21 = null;
                  var22 = (bhw)var21;
                  if (var22 == null) {
                     break label284;
                  }

                  if (var22.c()) {
                     var29 = var25;
                     var26 = null;
                     break label303;
                  }
               }

               if (iy.n(var22)) {
                  var50 = var23.a;
                  var15 = var50.size();

                  bhw var54;
                  for(var14 = 0; var14 < var15; ++var14) {
                     var21 = var50.get(var14);
                     if (((bhw)var21).d) {
                        var54 = (bhw)var21;
                        if (var54 == null) {
                           var29 = var25;
                           var26 = null;
                           break label303;
                        }

                        var29.a = var54.a;
                        var9 = var6;
                        var6 = var7;
                        var7 = var9;
                        var42.a = var25;
                        var42.b = var36;
                        var42.c = var31;
                        var42.d = var39;
                        var42.e = var29;
                        var42.l = null;
                        var42.f = var13;
                        var42.g = var9;
                        var42.h = var8;
                        var42.i = var6;
                        var42.k = 3;
                        var21 = hf.e(var31, var42);
                        if (var21 == var46) {
                           return var46;
                        }

                        var9 = var6;
                        var29 = var29;
                        var6 = var7;
                        var25 = var25;
                        var36 = var36;
                        var31 = var31;
                        var7 = var9;
                        var23 = (bhl)var21;
                        var50 = var23.a;
                        var15 = var50.size();
                        var14 = 0;
                        continue label282;
                     }
                  }

                  var21 = null;
                  var54 = (bhw)var21;
                  if (var54 == null) {
                     var29 = var25;
                     var26 = null;
                     break label303;
                  }

                  var29.a = var54.a;
                  var9 = var6;
                  var6 = var7;
                  var7 = var9;
                  var42.a = var25;
                  var42.b = var36;
                  var42.c = var31;
                  var42.d = var39;
                  var42.e = var29;
                  var42.l = null;
                  var42.f = var13;
                  var42.g = var9;
                  var42.h = var8;
                  var42.i = var6;
                  var42.k = 3;
                  var21 = hf.e(var31, var42);
                  if (var21 == var46) {
                     return var46;
                  }

                  var9 = var6;
                  var29 = var29;
                  var6 = var7;
                  var25 = var25;
                  var36 = var36;
                  var31 = var31;
                  var7 = var9;
                  var23 = (bhl)var21;
                  var50 = var23.a;
                  var15 = var50.size();
                  var14 = 0;
               } else {
                  var16 = var22.c;
                  long var18 = var22.g;
                  float var11 = var39.b(var16);
                  float var12 = var39.b(var18);
                  float var10 = var39.a(var16);
                  var9 = var39.a(var18);
                  var8 += var11 - var12;
                  var9 = var7 + (var10 - var9);
                  if (var13 != 0) {
                     var7 = Math.abs(var8);
                  } else {
                     var7 = bci.a(var39.c(var8, var9));
                  }

                  Object var45;
                  if (var7 < var6) {
                     var42.a = var25;
                     var42.b = var36;
                     var42.c = var31;
                     var42.d = var39;
                     var42.e = var29;
                     var42.l = var22;
                     var42.f = var13;
                     var42.g = var6;
                     var42.h = var8;
                     var42.i = var9;
                     var42.k = 4;
                     if (var31.p(3, var42) == var46) {
                        return var46;
                     }

                     qwy var53 = var25;
                     var25 = var29;
                     var45 = var36;
                     var35 = var53;
                     var27 = var31;
                     var7 = var6;
                     var6 = var9;
                     if (var22.c()) {
                        var29 = var53;
                        var26 = null;
                        break label303;
                     }
                  } else {
                     if (var13 != 0) {
                        var16 = var39.c(var8 - Math.signum(var8) * var6, var9);
                     } else {
                        var16 = var39.c(var8, var9);
                        var16 = bci.e(var16, bci.g(bci.d(var16, var7), var6));
                     }

                     ((qvx)var36).a(var22, bci.i(var16));
                     if (var22.c()) {
                        var29 = var25;
                        var26 = var22;
                        break label303;
                     }

                     var7 = var6;
                     var35 = var25;
                     var6 = 0.0F;
                     var8 = 0.0F;
                     var25 = var29;
                     var27 = var31;
                     var45 = var36;
                  }

                  var42.a = var35;
                  var42.b = var45;
                  var42.c = var27;
                  var42.d = var39;
                  var42.e = var25;
                  var42.l = null;
                  var42.f = var13;
                  var42.g = var7;
                  var42.h = var8;
                  var42.i = var6;
                  var42.k = 3;
                  var21 = hf.e(var27, var42);
                  if (var21 == var46) {
                     return var46;
                  }

                  var9 = var6;
                  var29 = var25;
                  var6 = var7;
                  var25 = var35;
                  var36 = var45;
                  var31 = var27;
                  var7 = var9;
                  var23 = (bhl)var21;
                  var50 = var23.a;
                  var15 = var50.size();
                  var14 = 0;
               }
            }
         }

         var29 = var25;
         var26 = null;
      }

      if (var26 != null) {
         return pwm.bq(var26, bci.i(var29.a));
      } else {
         var32 = null;
         return var32;
      }
   }

   public static Object g(bij var0, aez var1, long var2, qvt var4, que var5) {
      int var6;
      aeg var20;
      label191: {
         if (var5 instanceof aeg) {
            aeg var9 = (aeg)var5;
            var6 = var9.b;
            if ((var6 & Integer.MIN_VALUE) != 0) {
               var9.b = var6 + Integer.MIN_VALUE;
               var20 = var9;
               break label191;
            }
         }

         var20 = new aeg(var5);
      }

      Object var12;
      bhw var21;
      label185: {
         var12 = var20.a;
         qul var10 = qul.a;
         int var7;
         qwy var11;
         List var13;
         bhl var14;
         Object var15;
         bij var16;
         bij var18;
         Object var23;
         switch(var20.b) {
         case 0:
            pwm.bs(var12);
            aal var17;
            if (var1 == aez.a) {
               var17 = aal.f;
            } else {
               var17 = aal.g;
            }

            bhl var24 = var0.k();
            if (aea.b(var24, var2)) {
               var0 = null;
               var12 = var4;
               var21 = var0;
               break label185;
            }

            var16 = var0;
            var23 = var17;
            var15 = var4;
            var11 = new qwy();
            var11.a = var2;
            var10 = var10;
            var18 = var0;
            var20.g = (zy)var4;
            var20.c = var17;
            var20.e = var0;
            var20.f = var0;
            var20.d = var11;
            var20.b = 1;
            var12 = hf.e(var0, var20);
            if (var12 == var10) {
               return var10;
            }

            var14 = (bhl)var12;
            var13 = var14.a;
            var7 = var13.size();
            var6 = 0;
            break;
         case 1:
            var11 = var20.d;
            var18 = var20.f;
            var16 = var20.e;
            var23 = var20.c;
            var15 = var20.g;
            pwm.bs(var12);
            var14 = (bhl)var12;
            var13 = var14.a;
            var7 = var13.size();
            var6 = 0;
            break;
         default:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         }

         label184:
         while(true) {
            while(true) {
               if (var6 < var7) {
                  var12 = var13.get(var6);
                  if (!c.o(((bhw)var12).a, var11.a)) {
                     ++var6;
                     continue;
                  }
               } else {
                  var12 = null;
               }

               bhw var28 = (bhw)var12;
               if (var28 == null) {
                  var11 = null;
                  if (var11 == null) {
                     var21 = null;
                     var12 = var15;
                     break label184;
                  }

                  if (var11.c()) {
                     var21 = null;
                     var12 = var15;
                     break label184;
                  }

                  var12 = var15;
                  var21 = var11;
                  if (iy.n(var11)) {
                     break label184;
                  }

                  ((qvt)var15).eo(var11);
                  var2 = var11.a;
                  var11 = new qwy();
                  var11.a = var2;
                  var10 = var10;
                  var18 = var16;
               } else if (iy.n(var28)) {
                  List var29 = var14.a;
                  var7 = var29.size();
                  var6 = 0;

                  while(true) {
                     bhw var30;
                     if (var6 >= var7) {
                        var12 = null;
                        var30 = (bhw)var12;
                        if (var30 == null) {
                           if (var28 == null) {
                              var21 = null;
                              var12 = var15;
                              break label184;
                           }

                           if (var28.c()) {
                              var21 = null;
                              var12 = var15;
                              break label184;
                           }

                           var12 = var15;
                           var21 = var28;
                           if (iy.n(var28)) {
                              break label184;
                           }

                           ((qvt)var15).eo(var28);
                           var2 = var28.a;
                           var11 = new qwy();
                           var11.a = var2;
                           var10 = var10;
                           var18 = var16;
                        } else {
                           var11.a = var30.a;
                        }
                        break;
                     }

                     var12 = var29.get(var6);
                     if (((bhw)var12).d) {
                        var30 = (bhw)var12;
                        if (var30 == null) {
                           if (var28 == null) {
                              var21 = null;
                              var12 = var15;
                              break label184;
                           }

                           if (var28.c()) {
                              var21 = null;
                              var12 = var15;
                              break label184;
                           }

                           var12 = var15;
                           var21 = var28;
                           if (iy.n(var28)) {
                              break label184;
                           }

                           ((qvt)var15).eo(var28);
                           var2 = var28.a;
                           var11 = new qwy();
                           var11.a = var2;
                           var10 = var10;
                           var18 = var16;
                        } else {
                           var11.a = var30.a;
                        }
                        break;
                     }

                     ++var6;
                  }
               } else if (((Number)((qvt)var23).eo(var28)).floatValue() != 0.0F) {
                  if (var28 == null) {
                     var21 = null;
                     var12 = var15;
                     break label184;
                  }

                  if (var28.c()) {
                     var21 = null;
                     var12 = var15;
                     break label184;
                  }

                  var12 = var15;
                  var21 = var28;
                  if (iy.n(var28)) {
                     break label184;
                  }

                  ((qvt)var15).eo(var28);
                  var2 = var28.a;
                  var11 = new qwy();
                  var11.a = var2;
                  var10 = var10;
                  var18 = var16;
               }

               var20.g = (zy)var15;
               var20.c = (qvt)var23;
               var20.e = var16;
               var20.f = var18;
               var20.d = var11;
               var20.b = 1;
               var12 = hf.e(var18, var20);
               if (var12 == var10) {
                  return var10;
               }

               var14 = (bhl)var12;
               var13 = var14.a;
               var7 = var13.size();
               var6 = 0;
            }
         }
      }

      qsn var22;
      if (var21 != null) {
         ((qvt)var12).eo(var21);
         var22 = qsn.a;
      } else {
         var22 = null;
      }

      boolean var8;
      if (var22 != null) {
         var8 = true;
      } else {
         var8 = false;
      }

      return var8;
   }

   public static bcj h(long var0, long var2) {
      return new bcj(bci.b(var0), bci.c(var0), bci.b(var0) + bcl.c(var2), bci.c(var0) + bcl.a(var2));
   }

   public static long i(float var0, float var1) {
      long var2 = (long)Float.floatToIntBits(var0);
      long var4 = (long)Float.floatToIntBits(var1);
      long var6 = bci.a;
      return var4 & 4294967295L | var2 << 32;
   }

   public static boolean j(long var0) {
      float var2 = bci.b(var0);
      if (!Float.isInfinite(var2) && !Float.isNaN(var2)) {
         var2 = bci.c(var0);
         if (!Float.isInfinite(var2) && !Float.isNaN(var2)) {
            return true;
         }
      }

      return false;
   }

   public static long k(float var0, float var1) {
      long var6 = (long)Float.floatToIntBits(var0);
      long var2 = (long)Float.floatToIntBits(var1);
      long var4 = bcg.a;
      return var2 & 4294967295L | var6 << 32;
   }

   public static boolean l(bcd var0, qvt var1) {
      bcc var4 = var0.c;
      bcc var5 = bcc.a;
      int var2 = var4.ordinal();
      boolean var3 = false;
      switch(var2) {
      case 0:
      case 2:
         var3 = p(var0, var1);
         break;
      case 1:
         bcd var6 = ej.k(var0);
         if (var6 == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild");
         }

         switch(var6.c.ordinal()) {
         case 0:
         case 2:
            var3 = o(var0, var6, 2, var1);
            return var3;
         case 1:
            if (!l(var6, var1)) {
               if (!o(var0, var6, 2, var1)) {
                  if (!((bbw)var6.d()).a) {
                     return var3;
                  }

                  if (!(Boolean)var1.eo(var6)) {
                     return false;
                  }
               }

               var3 = true;
            } else {
               var3 = true;
            }

            return var3;
         case 3:
            throw new IllegalStateException("ActiveParent must have a focusedChild");
         default:
            throw new qse();
         }
      case 3:
         if (!p(var0, var1) && (!((bbw)var0.d()).a || !(Boolean)var1.eo(var0))) {
            return false;
         }

         var3 = true;
         break;
      default:
         throw new qse();
      }

      return var3;
   }

   public static boolean m(bcd var0, qvt var1) {
      bcc var3 = var0.c;
      bcc var4 = bcc.a;
      boolean var2;
      switch(var3.ordinal()) {
      case 0:
      case 2:
         var2 = q(var0, var1);
         break;
      case 1:
         bcd var5 = ej.k(var0);
         if (var5 == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild");
         }

         if (!m(var5, var1)) {
            if (!o(var0, var5, 1, var1)) {
               return false;
            }

            var2 = true;
         } else {
            var2 = true;
         }
         break;
      case 3:
         if (((bbw)var0.d()).a) {
            var2 = (Boolean)var1.eo(var0);
         } else {
            var2 = q(var0, var1);
         }
         break;
      default:
         throw new qse();
      }

      return var2;
   }

   public static boolean n(bcd var0, bcd var1, int var2, qvt var3) {
      if (var0.c != bcc.b) {
         IllegalStateException var16 = new IllegalStateException("This function should only be used within a parent that has focus.");
         throw var16;
      } else {
         axf var13 = new axf(new bcd[16]);
         bba var8 = var0.p;
         if (!var8.y) {
            throw new IllegalStateException("visitChildren called on an unattached node");
         } else {
            axf var15 = new axf(new bba[16]);
            bba var9 = var8.t;
            if (var9 == null) {
               jj.j(var15, var8);
            } else {
               var15.p(var9);
            }

            while(true) {
               label218:
               while(true) {
                  boolean var7 = var15.n();
                  Object var14 = null;
                  int var4;
                  int var5;
                  bba var11;
                  axf var21;
                  bba var22;
                  if (!var7) {
                     var13.j(bce.a);
                     int var6;
                     boolean var20;
                     qxq var23;
                     bcd var24;
                     if (c.n(var2, 1)) {
                        var23 = new qxq(0, var13.b - 1);
                        var5 = var23.a;
                        var6 = var23.b;
                        if (var5 <= var6) {
                           var20 = false;

                           while(true) {
                              if (var20) {
                                 var24 = (bcd)var13.a[var5];
                                 if (ej.m(var24) && m(var24, var3)) {
                                    return true;
                                 }
                              }

                              var20 |= c.E(var13.a[var5], var1);
                              if (var5 == var6) {
                                 break;
                              }

                              ++var5;
                           }
                        }
                     } else {
                        if (!c.n(var2, 2)) {
                           throw new IllegalStateException("This function should only be used for 1-D focus search");
                        }

                        var23 = new qxq(0, var13.b - 1);
                        var6 = var23.a;
                        var5 = var23.b;
                        if (var6 <= var5) {
                           var20 = false;

                           while(true) {
                              if (var20) {
                                 var24 = (bcd)var13.a[var5];
                                 if (ej.m(var24) && l(var24, var3)) {
                                    return true;
                                 }
                              }

                              var20 |= c.E(var13.a[var5], var1);
                              if (var5 == var6) {
                                 break;
                              }

                              --var5;
                           }
                        }
                     }

                     if (!c.n(var2, 1) && ((bbw)var0.d()).a) {
                        bba var17 = var0.p;
                        if (!var17.y) {
                           throw new IllegalStateException("visitAncestors called on an unattached node");
                        }

                        var17 = var17.s;
                        bmd var26 = jj.h(var0);

                        label165:
                        while(true) {
                           while(var26 != null) {
                              var9 = var17;
                              if ((var26.n.e.r & 1024) != 0) {
                                 label156:
                                 for(; var9 != null; var9 = var9.s) {
                                    if ((var9.q & 1024) != 0) {
                                       var8 = var9;
                                       axf var25 = null;

                                       while(true) {
                                          axf var18;
                                          do {
                                             if (var8 == null) {
                                                continue label156;
                                             }

                                             if (var8 instanceof bcd) {
                                                break label165;
                                             }

                                             var18 = var25;
                                             if ((var8.q & 1024) == 0) {
                                                break;
                                             }

                                             var18 = var25;
                                             if (!(var8 instanceof blh)) {
                                                break;
                                             }

                                             var22 = ((blh)var8).A;
                                             var4 = 0;
                                             var18 = var25;

                                             for(var11 = var8; var22 != null; var4 = var2) {
                                                var8 = var11;
                                                var13 = var18;
                                                var2 = var4;
                                                if ((var22.q & 1024) != 0) {
                                                   var2 = var4 + 1;
                                                   if (var2 == 1) {
                                                      var8 = var22;
                                                      var13 = var18;
                                                   } else {
                                                      var21 = var18;
                                                      if (var18 == null) {
                                                         var21 = new axf(new bba[16]);
                                                      }

                                                      if (var11 != null) {
                                                         var21.p(var11);
                                                      }

                                                      var21.p(var22);
                                                      var1 = null;
                                                      var13 = var21;
                                                      var8 = var1;
                                                   }
                                                }

                                                var22 = var22.t;
                                                var11 = var8;
                                                var18 = var13;
                                             }

                                             var8 = var11;
                                             var25 = var18;
                                          } while(var4 == 1);

                                          var8 = jj.f(var18);
                                          var25 = var18;
                                       }
                                    }
                                 }
                              }

                              var26 = var26.n();
                              if (var26 != null) {
                                 bmr var19 = var26.n;
                                 if (var19 != null) {
                                    var17 = var19.d;
                                    continue;
                                 }
                              }

                              var17 = null;
                           }

                           var8 = (bba)var14;
                           break;
                        }

                        if (var8 != null) {
                           return (Boolean)var3.eo(var0);
                        }
                     }

                     return false;
                  }

                  var8 = (bba)var15.c(var15.b - 1);
                  var11 = var8;
                  if ((var8.r & 1024) == 0) {
                     jj.j(var15, var8);
                  } else {
                     while(var11 != null) {
                        if ((var11.q & 1024) != 0) {
                           axf var10 = null;

                           while(true) {
                              do {
                                 if (var11 == null) {
                                    continue label218;
                                 }

                                 if (var11 instanceof bcd) {
                                    var13.p((bcd)var11);
                                    var21 = var10;
                                    break;
                                 }

                                 var21 = var10;
                                 if ((var11.q & 1024) == 0) {
                                    break;
                                 }

                                 var21 = var10;
                                 if (!(var11 instanceof blh)) {
                                    break;
                                 }

                                 var9 = ((blh)var11).A;
                                 var5 = 0;

                                 for(var21 = var10; var9 != null; var5 = var4) {
                                    var22 = var11;
                                    axf var12 = var21;
                                    var4 = var5;
                                    if ((var9.q & 1024) != 0) {
                                       var4 = var5 + 1;
                                       if (var4 == 1) {
                                          var22 = var9;
                                          var12 = var21;
                                       } else {
                                          var10 = var21;
                                          if (var21 == null) {
                                             var10 = new axf(new bba[16]);
                                          }

                                          if (var11 != null) {
                                             var10.p(var11);
                                          }

                                          var10.p(var9);
                                          var8 = null;
                                          var12 = var10;
                                          var22 = var8;
                                       }
                                    }

                                    var9 = var9.t;
                                    var11 = var22;
                                    var21 = var12;
                                 }

                                 var10 = var21;
                              } while(var5 == 1);

                              var11 = jj.f(var21);
                              var10 = var21;
                           }
                        }

                        var11 = var11.t;
                     }
                  }
               }
            }
         }
      }
   }

   private static boolean o(bcd var0, bcd var1, int var2, qvt var3) {
      if (n(var0, var1, var2, var3)) {
         return true;
      } else {
         Boolean var4 = (Boolean)ej.w(var0, var2, new bcf(var0, var1, var2, var3, 1));
         return var4 != null ? var4 : false;
      }
   }

   private static boolean p(bcd var0, qvt var1) {
      axf var8 = new axf(new bcd[16]);
      bba var4 = var0.p;
      if (!var4.y) {
         IllegalStateException var12 = new IllegalStateException("visitChildren called on an unattached node");
         throw var12;
      } else {
         axf var9 = new axf(new bba[16]);
         bba var10 = var4.t;
         if (var10 == null) {
            jj.j(var9, var4);
         } else {
            var9.p(var10);
         }

         while(true) {
            int var2;
            int var3;
            label91:
            while(var9.n()) {
               var10 = (bba)var9.c(var9.b - 1);
               var4 = var10;
               if ((var10.r & 1024) == 0) {
                  jj.j(var9, var10);
               } else {
                  while(var4 != null) {
                     if ((var4.q & 1024) != 0) {
                        axf var5 = null;

                        while(true) {
                           axf var11;
                           do {
                              if (var4 == null) {
                                 continue label91;
                              }

                              if (var4 instanceof bcd) {
                                 var8.p((bcd)var4);
                                 var11 = var5;
                                 break;
                              }

                              var11 = var5;
                              if ((var4.q & 1024) == 0) {
                                 break;
                              }

                              var11 = var5;
                              if (!(var4 instanceof blh)) {
                                 break;
                              }

                              var10 = ((blh)var4).A;
                              var3 = 0;
                              bba var7 = var4;
                              var4 = var10;

                              bba var13;
                              for(var11 = var5; var4 != null; var7 = var13) {
                                 axf var6 = var11;
                                 var2 = var3;
                                 var13 = var7;
                                 if ((var4.q & 1024) != 0) {
                                    var2 = var3 + 1;
                                    if (var2 == 1) {
                                       var13 = var4;
                                       var6 = var11;
                                    } else {
                                       var6 = var11;
                                       if (var11 == null) {
                                          var6 = new axf(new bba[16]);
                                       }

                                       if (var7 != null) {
                                          var6.p(var7);
                                       }

                                       var6.p(var4);
                                       var13 = null;
                                    }
                                 }

                                 var4 = var4.t;
                                 var11 = var6;
                                 var3 = var2;
                              }

                              var5 = var11;
                              var4 = var7;
                           } while(var3 == 1);

                           var4 = jj.f(var11);
                           var5 = var11;
                        }
                     }

                     var4 = var4.t;
                  }
               }
            }

            var8.j(bce.a);
            var2 = var8.b;
            if (var2 > 0) {
               Object[] var14 = var8.a;
               --var2;

               do {
                  var0 = (bcd)var14[var2];
                  if (ej.m(var0) && l(var0, var1)) {
                     return true;
                  }

                  var3 = var2 - 1;
                  var2 = var3;
               } while(var3 >= 0);
            }

            return false;
         }
      }
   }

   private static boolean q(bcd var0, qvt var1) {
      axf var11 = new axf(new bcd[16]);
      bba var7 = var0.p;
      if (!var7.y) {
         IllegalStateException var15 = new IllegalStateException("visitChildren called on an unattached node");
         throw var15;
      } else {
         axf var12 = new axf(new bba[16]);
         bba var13 = var7.t;
         if (var13 == null) {
            jj.j(var12, var7);
         } else {
            var12.p(var13);
         }

         while(true) {
            label90:
            while(true) {
               boolean var6 = var12.n();
               boolean var5 = false;
               int var2;
               int var3;
               if (!var6) {
                  var11.j(bce.a);
                  int var4 = var11.b;
                  if (var4 > 0) {
                     Object[] var17 = var11.a;
                     var2 = 0;

                     do {
                        var0 = (bcd)var17[var2];
                        if (ej.m(var0) && m(var0, var1)) {
                           var5 = true;
                           break;
                        }

                        var3 = var2 + 1;
                        var2 = var3;
                     } while(var3 < var4);
                  }

                  return var5;
               }

               var13 = (bba)var12.c(var12.b - 1);
               var7 = var13;
               if ((var13.r & 1024) == 0) {
                  jj.j(var12, var13);
               } else {
                  while(var7 != null) {
                     if ((var7.q & 1024) != 0) {
                        axf var8 = null;

                        while(true) {
                           axf var14;
                           do {
                              if (var7 == null) {
                                 continue label90;
                              }

                              if (var7 instanceof bcd) {
                                 var11.p((bcd)var7);
                                 var14 = var8;
                                 break;
                              }

                              var14 = var8;
                              if ((var7.q & 1024) == 0) {
                                 break;
                              }

                              var14 = var8;
                              if (!(var7 instanceof blh)) {
                                 break;
                              }

                              var13 = ((blh)var7).A;
                              var3 = 0;
                              bba var10 = var7;
                              var7 = var13;

                              bba var16;
                              for(var14 = var8; var7 != null; var10 = var16) {
                                 axf var9 = var14;
                                 var2 = var3;
                                 var16 = var10;
                                 if ((var7.q & 1024) != 0) {
                                    var2 = var3 + 1;
                                    if (var2 == 1) {
                                       var16 = var7;
                                       var9 = var14;
                                    } else {
                                       var9 = var14;
                                       if (var14 == null) {
                                          var9 = new axf(new bba[16]);
                                       }

                                       if (var10 != null) {
                                          var9.p(var10);
                                       }

                                       var9.p(var7);
                                       var16 = null;
                                    }
                                 }

                                 var7 = var7.t;
                                 var14 = var9;
                                 var3 = var2;
                              }

                              var8 = var14;
                              var7 = var10;
                           } while(var3 == 1);

                           var7 = jj.f(var14);
                           var8 = var14;
                        }
                     }

                     var7 = var7.t;
                  }
               }
            }
         }
      }
   }

   public void c(Rect var1, View var2, RecyclerView var3) {
      ((ly)var2.getLayoutParams()).a();
      var1.set(0, 0, 0, 0);
   }

   public void d(Canvas var1, RecyclerView var2) {
   }
}
