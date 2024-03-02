import java.util.List;

public final class aea {
   public static final afa a = new ads(1);
   public static final afa b = new ads(0);

   public static final float a(bqa var0, int var1) {
      var0.getClass();
      float var2;
      if (c.n(var1, 2)) {
         var2 = var0.a() * 0.0069444445F;
      } else {
         var2 = var0.a();
      }

      return var2;
   }

   public static final boolean b(bhl var0, long var1) {
      List var6 = var0.a;
      int var4 = var6.size();
      boolean var5 = false;
      int var3 = 0;

      Object var7;
      while(true) {
         if (var3 >= var4) {
            var7 = null;
            break;
         }

         var7 = var6.get(var3);
         if (c.o(((bhw)var7).a, var1)) {
            break;
         }

         ++var3;
      }

      bhw var8 = (bhw)var7;
      if (var8 != null) {
         if (!var8.d) {
            return true;
         }
      } else {
         var5 = true;
      }

      return var5;
   }

   public static final Object c(bij var0, long var1, que var3) {
      int var4;
      adt var7;
      adt var14;
      label120: {
         if (var3 instanceof adt) {
            var7 = (adt)var3;
            var4 = var7.b;
            if ((var4 & Integer.MIN_VALUE) != 0) {
               var7.b = var4 + Integer.MIN_VALUE;
               var14 = var7;
               break label120;
            }
         }

         var14 = new adt(var3);
      }

      Object var10 = var14.a;
      qul var11 = qul.a;
      byte var5;
      int var6;
      bij var8;
      List var9;
      qwy var12;
      bij var15;
      qwy var16;
      bhl var21;
      switch(var14.b) {
      case 0:
         pwm.bs(var10);
         if (b(var0.k(), var1)) {
            return null;
         }

         var16 = new qwy();
         var16.a = var1;
         var14.d = var0;
         var14.c = var16;
         var14.b = 1;
         var10 = hf.e(var0, var14);
         if (var10 == var11) {
            return var11;
         }

         var12 = var16;
         var15 = var0;
         var7 = var14;
         var21 = (bhl)var10;
         var9 = var21.a;
         var6 = var9.size();
         var5 = 0;
         var4 = 0;
         break;
      case 1:
         var12 = var14.c;
         var8 = var14.d;
         pwm.bs(var10);
         var7 = var14;
         var15 = var8;
         var21 = (bhl)var10;
         var9 = var21.a;
         var6 = var9.size();
         var5 = 0;
         var4 = 0;
         break;
      default:
         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }

      bhw var13;
      label113:
      while(true) {
         while(true) {
            Object var18;
            bhw var22;
            if (var4 < var6) {
               var18 = var9.get(var4);
               if (!c.o(((bhw)var18).a, var12.a)) {
                  ++var4;
                  continue;
               }

               var22 = (bhw)var18;
               if (var22 == null) {
                  var13 = null;
                  break label113;
               }
            } else {
               var8 = null;
               var22 = (bhw)var8;
               if (var22 == null) {
                  var13 = null;
                  break label113;
               }
            }

            adt var17;
            bij var19;
            if (iy.n(var22)) {
               List var23 = var21.a;
               var6 = var23.size();
               var4 = var5;

               while(true) {
                  bhw var20;
                  if (var4 >= var6) {
                     var8 = null;
                     var20 = (bhw)var8;
                     if (var20 == null) {
                        var13 = var22;
                        break label113;
                     }

                     var12.a = var20.a;
                     var17 = var7;
                     var19 = var15;
                     var16 = var12;
                     break;
                  }

                  var18 = var23.get(var4);
                  if (((bhw)var18).d) {
                     var20 = (bhw)var18;
                     if (var20 == null) {
                        var13 = var22;
                        break label113;
                     }

                     var12.a = var20.a;
                     var17 = var7;
                     var19 = var15;
                     var16 = var12;
                     break;
                  }

                  ++var4;
               }
            } else {
               if (iy.q(var22)) {
                  var13 = var22;
                  break label113;
               }

               var17 = var7;
               var19 = var15;
               var16 = var12;
            }

            var17.d = var19;
            var17.c = var16;
            var17.b = 1;
            var10 = hf.e(var19, var17);
            if (var10 == var11) {
               return var11;
            }

            var12 = var16;
            var15 = var19;
            var7 = var17;
            var21 = (bhl)var10;
            var9 = var21.a;
            var6 = var9.size();
            var5 = 0;
            var4 = 0;
         }
      }

      if (var13 != null && !var13.c()) {
         return var13;
      } else {
         return null;
      }
   }

   public static final Object d(bij var0, long var1, int var3, qvx var4, que var5) {
      int var13;
      adu var27;
      label152: {
         if (var5 instanceof adu) {
            adu var17 = (adu)var5;
            var13 = var17.f;
            if ((var13 & Integer.MIN_VALUE) != 0) {
               var17.f = var13 + Integer.MIN_VALUE;
               var27 = var17;
               break label152;
            }
         }

         var27 = new adu(var5);
      }

      Object var21 = var27.e;
      qul var29 = qul.a;
      var13 = var27.f;
      ads var19 = null;
      float var6;
      float var7;
      float var8;
      int var14;
      adu var18;
      bhw var20;
      Object var24;
      bhw var25;
      qul var26;
      bij var28;
      Object var30;
      qwy var32;
      Object var33;
      List var34;
      bhl var39;
      switch(var13) {
      case 0:
         pwm.bs(var21);
         afa var31 = a;
         if (b(var0.k(), var1)) {
            var25 = var19;
            return var25;
         }

         var8 = a(var0.l(), var3);
         var32 = new qwy();
         var32.a = var1;
         var3 = 1;
         var26 = var29;
         var7 = 0.0F;
         var24 = var31;
         var6 = 0.0F;
         var18 = var27;
         var30 = var4;
         var28 = var0;
         var27.j = (ajb)var4;
         var27.k = (ads)var31;
         var27.i = var0;
         var27.g = var32;
         var27.h = null;
         var27.a = var3;
         var27.b = var8;
         var27.c = var7;
         var27.d = var6;
         var27.f = 1;
         var33 = hf.e(var0, var27);
         if (var33 == var29) {
            return var29;
         }

         var39 = (bhl)var33;
         var34 = var39.a;
         var13 = var34.size();
         var14 = 0;
         break;
      case 1:
         var6 = var27.d;
         var7 = var27.c;
         var8 = var27.b;
         var3 = var27.a;
         var32 = var27.g;
         var0 = var27.i;
         ads var40 = var27.k;
         ajb var35 = var27.j;
         pwm.bs(var21);
         var18 = var27;
         var26 = var29;
         var28 = var0;
         var30 = var35;
         var24 = var40;
         var39 = (bhl)var21;
         var34 = var39.a;
         var13 = var34.size();
         var14 = 0;
         break;
      case 2:
         var6 = var27.d;
         var7 = var27.c;
         var8 = var27.b;
         var3 = var27.a;
         var20 = var27.h;
         qwy var22 = var27.g;
         var0 = var27.i;
         var19 = var27.k;
         ajb var23 = var27.j;
         pwm.bs(var21);
         var18 = var27;
         var26 = var29;
         var30 = var23;
         var28 = var0;
         var24 = var19;
         var32 = var22;
         if (var20.c()) {
            var25 = null;
            return var25;
         }

         var27.j = (ajb)var23;
         var27.k = (ads)var19;
         var27.i = var0;
         var27.g = var22;
         var27.h = null;
         var27.a = var3;
         var27.b = var8;
         var27.c = var7;
         var27.d = var6;
         var27.f = 1;
         var33 = hf.e(var0, var27);
         if (var33 == var29) {
            return var29;
         }

         var39 = (bhl)var33;
         var34 = var39.a;
         var13 = var34.size();
         var14 = 0;
         break;
      default:
         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }

      label144:
      while(true) {
         while(true) {
            if (var14 < var13) {
               var21 = var34.get(var14);
               if (!c.o(((bhw)var21).a, var32.a)) {
                  ++var14;
                  continue;
               }

               var20 = (bhw)var21;
               if (var20 == null) {
                  break label144;
               }

               if (var20.c()) {
                  var25 = null;
                  return var25;
               }
            } else {
               var20 = null;
               var20 = (bhw)var20;
               if (var20 == null) {
                  break label144;
               }

               if (var20.c()) {
                  var25 = null;
                  return var25;
               }
            }

            if (iy.n(var20)) {
               List var38 = var39.a;
               var14 = var38.size();
               var13 = 0;

               while(true) {
                  if (var13 >= var14) {
                     var20 = null;
                     var20 = (bhw)var20;
                     if (var20 == null) {
                        var25 = null;
                        return var25;
                     }

                     var32.a = var20.a;
                     break;
                  }

                  var33 = var38.get(var13);
                  if (((bhw)var33).d) {
                     var20 = (bhw)var33;
                     if (var20 == null) {
                        var25 = null;
                        return var25;
                     }

                     var32.a = var20.a;
                     break;
                  }

                  ++var13;
               }
            } else {
               long var15 = var20.c;
               var1 = var20.g;
               float var12 = bci.b(var15);
               float var11 = bci.b(var1);
               float var9 = bci.c(var15);
               float var10 = bci.c(var1);
               var7 += var12 - var11;
               var9 = var6 + (var9 - var10);
               if (var3 != 0) {
                  var6 = Math.abs(var7);
               } else {
                  var6 = bci.a(es.i(var7, var9));
               }

               if (var6 < var8) {
                  var18.j = (ajb)var30;
                  var18.k = (ads)var24;
                  var18.i = var28;
                  var18.g = var32;
                  var18.h = var20;
                  var18.a = var3;
                  var18.b = var8;
                  var18.c = var7;
                  var18.d = var9;
                  var18.f = 2;
                  var21 = var28.p(3, var18);
                  if (var21 == var26) {
                     return var26;
                  }

                  var6 = var9;
                  if (var20.c()) {
                     var25 = null;
                     return var25;
                  }
               } else {
                  if (var3 != 0) {
                     var1 = es.i(var7 - Math.signum(var7) * var8, var9);
                  } else {
                     var1 = es.i(var7, var9);
                     var1 = bci.e(var1, bci.g(bci.d(var1, var6), var8));
                  }

                  ((qvx)var30).a(var20, quy.d(bci.b(var1)));
                  if (var20.c()) {
                     var25 = var20;
                     return var25;
                  }

                  var6 = 0.0F;
                  var7 = 0.0F;
               }
            }

            var18.j = (ajb)var30;
            var18.k = (ads)var24;
            var18.i = var28;
            var18.g = var32;
            var18.h = null;
            var18.a = var3;
            var18.b = var8;
            var18.c = var7;
            var18.d = var6;
            var18.f = 1;
            var33 = hf.e(var28, var18);
            if (var33 == var26) {
               return var26;
            }

            var39 = (bhl)var33;
            var34 = var39.a;
            var13 = var34.size();
            var14 = 0;
         }
      }

      var25 = null;
      return var25;
   }

   public static final Object e(bij var0, long var1, que var3) {
      int var4;
      adv var16;
      label73: {
         if (var3 instanceof adv) {
            adv var6 = (adv)var3;
            var4 = var6.b;
            if ((var4 & Integer.MIN_VALUE) != 0) {
               var6.b = var4 + Integer.MIN_VALUE;
               var16 = var6;
               break label73;
            }
         }

         var16 = new adv(var3);
      }

      Object var8 = var16.a;
      qul var9 = qul.a;
      var4 = var16.b;
      Object var7 = null;
      bhw var14;
      qwz var17;
      switch(var4) {
      case 0:
         pwm.bs(var8);
         if (b(var0.k(), var1)) {
            return null;
         }

         List var22 = var0.k().a;
         int var5 = var22.size();
         var4 = 0;

         Object var20;
         while(true) {
            if (var4 >= var5) {
               var20 = null;
               break;
            }

            var20 = var22.get(var4);
            if (c.o(((bhw)var20).a, var1)) {
               break;
            }

            ++var4;
         }

         bhw var21 = (bhw)var20;
         if (var21 == null) {
            return null;
         }

         qwz var23 = new qwz();
         qwz var11 = new qwz();
         var11.a = var21;
         var1 = var0.l().c();

         Object var15;
         try {
            adw var10 = new adw(var11, var23, (que)null);
            var16.c = var21;
            var16.d = var23;
            var16.b = 1;
            var15 = var0.m(var1, var10, var16);
         } catch (bhm var13) {
            var17 = var23;
            var14 = var21;
            break;
         }

         if (var15 == var9) {
            return var9;
         }

         var14 = (bhw)var7;
         return var14;
      case 1:
         qwz var19 = var16.d;
         var14 = var16.c;

         try {
            pwm.bs(var8);
         } catch (bhm var12) {
            var17 = var19;
            break;
         }

         var14 = (bhw)var7;
         return var14;
      default:
         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }

      bhw var18 = (bhw)var17.a;
      if (var18 != null) {
         var14 = var18;
      }

      return var14;
   }

   public static final Object f(bij var0, long var1, qvt var3, que var4) {
      ady var9;
      label42: {
         if (var4 instanceof ady) {
            ady var6 = (ady)var4;
            int var5 = var6.b;
            if ((var5 & Integer.MIN_VALUE) != 0) {
               var6.b = var5 + Integer.MIN_VALUE;
               var9 = var6;
               break label42;
            }
         }

         var9 = new ady(var4);
      }

      Object var10 = var9.a;
      qul var8 = qul.a;
      Object var7;
      switch(var9.b) {
      case 0:
         pwm.bs(var10);
         var9.d = var0;
         var9.c = var3;
         var9.b = 1;
         var7 = c(var0, var1, var9);
         var10 = var7;
         if (var7 == var8) {
            return var8;
         }
         break;
      case 1:
         var3 = var9.c;
         var0 = var9.d;
         pwm.bs(var10);
         break;
      default:
         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }

      do {
         bhw var11 = (bhw)var10;
         if (var11 == null) {
            return false;
         }

         if (iy.n(var11)) {
            return true;
         }

         var3.eo(var11);
         var1 = var11.a;
         var9.d = var0;
         var9.c = var3;
         var9.b = 1;
         var7 = c(var0, var1, var9);
         var10 = var7;
      } while(var7 != var8);

      return var8;
   }

   public static final Object g(bij var0, long var1, qvt var3, que var4) {
      int var5;
      adz var18;
      label200: {
         if (var4 instanceof adz) {
            adz var8 = (adz)var4;
            var5 = var8.b;
            if ((var5 & Integer.MIN_VALUE) != 0) {
               var8.b = var5 + Integer.MIN_VALUE;
               var18 = var8;
               break label200;
            }
         }

         var18 = new adz(var4);
      }

      bhw var15;
      label194: {
         Object var13 = var18.a;
         qul var21 = qul.a;
         var5 = var18.b;
         Object var14 = null;
         int var6;
         bij var9;
         qwy var10;
         ou var11;
         List var12;
         adz var16;
         Object var20;
         bhl var29;
         switch(var5) {
         case 0:
            pwm.bs(var13);
            bhl var22 = var0.k();
            if (b(var22, var1)) {
               var15 = (bhw)var14;
               break label194;
            }

            var20 = var3;
            var10 = new qwy();
            var10.a = var1;
            var18.f = (ou)var3;
            var18.d = var0;
            var18.e = var0;
            var18.c = var10;
            var18.b = 1;
            var13 = hf.e(var0, var18);
            if (var13 == var21) {
               return var21;
            }

            var9 = var0;
            var21 = var21;
            var16 = var18;
            var29 = (bhl)var13;
            var12 = var29.a;
            var6 = var12.size();
            var5 = 0;
            break;
         case 1:
            var10 = var18.c;
            var9 = var18.e;
            var0 = var18.d;
            var11 = var18.f;
            pwm.bs(var13);
            var16 = var18;
            var20 = var11;
            var29 = (bhl)var13;
            var12 = var29.a;
            var6 = var12.size();
            var5 = 0;
            break;
         default:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         }

         label193:
         while(true) {
            while(true) {
               Object var25;
               if (var5 < var6) {
                  var25 = var12.get(var5);
                  if (!c.o(((bhw)var25).a, var10.a)) {
                     ++var5;
                     continue;
                  }
               } else {
                  var25 = null;
               }

               bhw var30 = (bhw)var25;
               bij var19;
               adz var26;
               qul var27;
               if (var30 == null) {
                  var9 = null;
                  if (var9 == null) {
                     var15 = (bhw)var14;
                     break label193;
                  }

                  if (var9.c()) {
                     var15 = (bhw)var14;
                     break label193;
                  }

                  if (iy.n(var9)) {
                     var15 = var9;
                     break label193;
                  }

                  ((qvt)var20).eo(var9);
                  var1 = var9.a;
                  var10 = new qwy();
                  var10.a = var1;
                  var27 = var21;
                  var19 = var0;
                  var26 = var16;
               } else if (iy.n(var30)) {
                  List var31 = var29.a;
                  var6 = var31.size();
                  var5 = 0;

                  while(true) {
                     bhw var28;
                     if (var5 >= var6) {
                        var11 = null;
                        var28 = (bhw)var11;
                        if (var28 == null) {
                           if (var30 == null) {
                              var15 = (bhw)var14;
                              break label193;
                           }

                           if (var30.c()) {
                              var15 = (bhw)var14;
                              break label193;
                           }

                           if (iy.n(var30)) {
                              var15 = var30;
                              break label193;
                           }

                           ((qvt)var20).eo(var30);
                           var1 = var30.a;
                           var10 = new qwy();
                           var10.a = var1;
                           var27 = var21;
                           var19 = var0;
                           var26 = var16;
                        } else {
                           var10.a = var28.a;
                           var26 = var16;
                           var27 = var21;
                           var19 = var9;
                        }
                        break;
                     }

                     var25 = var31.get(var5);
                     if (((bhw)var25).d) {
                        var28 = (bhw)var25;
                        if (var28 == null) {
                           if (var30 == null) {
                              var15 = (bhw)var14;
                              break label193;
                           }

                           if (var30.c()) {
                              var15 = (bhw)var14;
                              break label193;
                           }

                           if (iy.n(var30)) {
                              var15 = var30;
                              break label193;
                           }

                           ((qvt)var20).eo(var30);
                           var1 = var30.a;
                           var10 = new qwy();
                           var10.a = var1;
                           var27 = var21;
                           var19 = var0;
                           var26 = var16;
                        } else {
                           var10.a = var28.a;
                           var26 = var16;
                           var27 = var21;
                           var19 = var9;
                        }
                        break;
                     }

                     ++var5;
                  }
               } else if (bci.b(iy.k(var30)) != 0.0F) {
                  if (var30 == null) {
                     var15 = (bhw)var14;
                     break label193;
                  }

                  if (var30.c()) {
                     var15 = (bhw)var14;
                     break label193;
                  }

                  if (iy.n(var30)) {
                     var15 = var30;
                     break label193;
                  }

                  ((qvt)var20).eo(var30);
                  var1 = var30.a;
                  var10 = new qwy();
                  var10.a = var1;
                  var27 = var21;
                  var19 = var0;
                  var26 = var16;
               } else {
                  var26 = var16;
                  var27 = var21;
                  var19 = var9;
               }

               var26.f = (ou)var20;
               var26.d = var0;
               var26.e = var19;
               var26.c = var10;
               var26.b = 1;
               var13 = hf.e(var19, var26);
               if (var13 == var27) {
                  return var27;
               }

               var9 = var19;
               var21 = var27;
               var16 = var26;
               var29 = (bhl)var13;
               var12 = var29.a;
               var6 = var12.size();
               var5 = 0;
            }
         }
      }

      boolean var7;
      if (var15 != null) {
         var7 = true;
      } else {
         var7 = false;
      }

      return var7;
   }
}
