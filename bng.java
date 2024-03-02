public final class bng {
   public final Object a;
   public final Object b;
   public final Object c;
   public final Object d;
   public final Object e;
   public final Object f;
   public final Object g;
   private final Object h;

   public bng(qvt var1) {
      this.a = new bad(var1);
      this.b = bmv.i;
      this.c = bmv.j;
      this.d = bmv.k;
      this.h = bmv.e;
      this.e = bmv.f;
      this.f = bmv.g;
      this.g = bmv.h;
   }

   public bng(vj var1, ve var2) {
      this.h = this;
      this.e = var1;
      this.a = var2;
      bng var3 = (bng)this;
      vj var4 = (vj)var1;
      this.c = qpn.b(new vf(var1, this, 1));
      var3 = (bng)this;
      var4 = (vj)var1;
      this.g = new vf(var1, this, 7);
      this.f = new vf(var1, this, 8);
      this.d = qpn.b(new vf(var1, this, 2));
      var3 = (bng)this;
      var4 = (vj)var1;
      this.b = qpn.b(new vf(var1, this, 0));
   }

   public final void a(bmd var1, boolean var2, qvi var3) {
      if (var2 && var1.e != null) {
         this.d(var1, (qvt)this.f, var3);
      } else {
         this.d(var1, (qvt)this.e, var3);
      }
   }

   public final void b(bmd var1, boolean var2, qvi var3) {
      if (var2 && var1.e != null) {
         this.d(var1, (qvt)this.g, var3);
      } else {
         this.d(var1, (qvt)this.h, var3);
      }
   }

   public final void c(bmd var1, boolean var2, qvi var3) {
      if (var2 && var1.e != null) {
         this.d(var1, (qvt)this.b, var3);
      } else {
         this.d(var1, (qvt)this.c, var3);
      }
   }

   public final void d(bnf var1, qvt var2, qvi var3) {
      var2.getClass();
      Object var14 = this.a;
      bad var12 = (bad)var14;
      axf var13 = var12.f;
      synchronized(var13){}

      bac var322;
      int var4;
      int var5;
      int var6;
      int var7;
      Throwable var10000;
      boolean var10001;
      Throwable var315;
      label2675: {
         label2679: {
            axf var10;
            try {
               var10 = ((bad)var14).f;
               var7 = var10.b;
            } catch (Throwable var314) {
               var10000 = var314;
               var10001 = false;
               break label2679;
            }

            Object var320;
            label2670: {
               var5 = 0;
               if (var7 > 0) {
                  Object[] var11;
                  try {
                     var11 = var10.a;
                  } catch (Throwable var312) {
                     var10000 = var312;
                     var10001 = false;
                     break label2679;
                  }

                  var4 = 0;

                  do {
                     var320 = var11[var4];

                     try {
                        if (((bac)var320).a == var2) {
                           break label2670;
                        }
                     } catch (Throwable var313) {
                        var10000 = var313;
                        var10001 = false;
                        break label2679;
                     }

                     var6 = var4 + 1;
                     var4 = var6;
                  } while(var6 < var7);
               }

               var320 = null;
            }

            bac var321;
            try {
               var321 = (bac)var320;
            } catch (Throwable var311) {
               var10000 = var311;
               var10001 = false;
               break label2679;
            }

            var322 = var321;
            if (var321 != null) {
               break label2675;
            }

            label2652:
            try {
               qxb.e(var2, 1);
               var322 = new bac(var2);
               ((bad)var14).f.p(var322);
               break label2675;
            } catch (Throwable var310) {
               var10000 = var310;
               var10001 = false;
               break label2652;
            }
         }

         var315 = var10000;
         throw var315;
      }

      bac var318 = var12.g;

      label2646: {
         label2682: {
            dhq var323;
            Object var324;
            qvt var325;
            try {
               ((bad)var14).g = var322;
               var325 = ((bad)var14).e;
               var325.getClass();
               var324 = var322.b;
               var323 = var322.k;
               var7 = var322.c;
               var322.b = var1;
               var322.k = (dhq)var322.j.g(var1);
               if (var322.c == -1) {
                  var322.c = azp.b().u();
               }
            } catch (Throwable var309) {
               var10000 = var309;
               var10001 = false;
               break label2682;
            }

            atf var15;
            axf var316;
            try {
               var15 = var322.e;
               var316 = avg.c();
            } catch (Throwable var308) {
               var10000 = var308;
               var10001 = false;
               break label2682;
            }

            try {
               var316.p(var15);
               dp.h(var325, var3);
            } finally {
               try {
                  var316.c(var316.b - 1);
               } catch (Throwable var299) {
                  var10000 = var299;
                  var10001 = false;
                  break label2682;
               }
            }

            Object var16 = var322.b;
            var16.getClass();
            int var8 = var322.c;
            dhq var317 = var322.k;
            if (var317 != null) {
               Object var326;
               try {
                  var326 = var317.c;
                  var14 = var317.b;
                  var6 = var317.a;
               } catch (Throwable var306) {
                  var10000 = var306;
                  var10001 = false;
                  break label2682;
               }

               for(var4 = 0; var5 < var6; ++var5) {
                  int var9;
                  Object var319;
                  try {
                     var319 = ((Object[])var326)[var5];
                     var319.getClass();
                     var9 = ((int[])var14)[var5];
                  } catch (Throwable var305) {
                     var10000 = var305;
                     var10001 = false;
                     break label2682;
                  }

                  if (var9 != var8) {
                     try {
                        var322.a(var16, var319);
                     } catch (Throwable var304) {
                        var10000 = var304;
                        var10001 = false;
                        break label2682;
                     }
                  } else {
                     if (var4 != var5) {
                        try {
                           ((Object[])var326)[var4] = var319;
                           ((int[])var14)[var4] = var9;
                        } catch (Throwable var303) {
                           var10000 = var303;
                           var10001 = false;
                           break label2682;
                        }
                     }

                     ++var4;
                  }
               }

               for(var5 = var4; var5 < var6; ++var5) {
                  try {
                     ((Object[])var326)[var5] = null;
                  } catch (Throwable var302) {
                     var10000 = var302;
                     var10001 = false;
                     break label2682;
                  }
               }

               try {
                  var317.a = var4;
               } catch (Throwable var301) {
                  var10000 = var301;
                  var10001 = false;
                  break label2682;
               }
            }

            label2608:
            try {
               var322.b = var324;
               var322.k = var323;
               var322.c = var7;
               break label2646;
            } catch (Throwable var300) {
               var10000 = var300;
               var10001 = false;
               break label2608;
            }
         }

         var315 = var10000;
         var12.g = var318;
         throw var315;
      }

      var12.g = var318;
   }
}
