import android.content.Context;
import android.view.View;
import java.lang.ref.Reference;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class bmz extends bmn implements bjs, bjf, bnf, qvt {
   private static final qvt f;
   private static final qvt g;
   public static final bdo j;
   public static final blt k;
   public static final bmw l;
   public static final bmw m;
   private Map A;
   private long B;
   private bch C;
   private final qvi D;
   public final bmd n;
   public bmz o;
   public bmz p;
   public qvt q;
   public blt r;
   public boolean s;
   public bnd t;
   private boolean u;
   private boolean v;
   private bxr w;
   private bxy x;
   private float y;
   private bju z;

   static {
      f = bmv.a;
      g = bmv.b;
      j = new bdo();
      k = new blt();
      bdf.c();
      l = new bmu(1);
      m = new bmu(0);
   }

   public bmz(bmd var1) {
      this.n = var1;
      this.w = var1.i;
      this.x = var1.j;
      this.y = 0.8F;
      this.B = bxw.a;
      this.D = new bmc(this, 2);
   }

   // $FF: synthetic method
   public static void am(bmz var0, qvt var1) {
      var0.ah(var1, false);
   }

   // $FF: synthetic method
   static void an(bmz var0) {
      var0.aq(true);
   }

   private final bng ao() {
      return bmg.a(this.n).j;
   }

   private final void ap(bmz var1, bch var2, boolean var3) {
      if (var1 != this) {
         bmz var10 = this.p;
         if (var10 != null) {
            var10.ap(var1, var2, var3);
         }

         long var8 = this.B;
         int var6 = bxw.a(var8);
         float var5 = var2.a;
         float var4 = (float)var6;
         var2.a = var5 - var4;
         var2.c -= var4;
         var6 = bxw.b(var8);
         var5 = var2.b;
         var4 = (float)var6;
         var2.b = var5 - var4;
         var2.d -= var4;
         bnd var11 = this.t;
         if (var11 != null) {
            var11.d(var2, true);
            if (this.v && var3) {
               var8 = super.c;
               int var7 = bxx.b(var8);
               var6 = bxx.a(var8);
               var2.a(0.0F, 0.0F, (float)var7, (float)var6);
            }
         }

      }
   }

   private final void aq(boolean var1) {
      bnd var19 = this.t;
      if (var19 != null) {
         qvt var17 = this.q;
         if (var17 == null) {
            throw new IllegalStateException("updateLayerParameters requires a non-null layerBlock");
         }

         bdo var18 = j;
         var18.a = 1.0F;
         var18.b = 1.0F;
         var18.c = 1.0F;
         var18.d = 0.0F;
         var18.e = bdd.a;
         var18.f = bdd.a;
         var18.g = 0.0F;
         var18.h = 8.0F;
         var18.i = bdx.a;
         var18.i(bdm.a);
         var18.k = false;
         var18.l = 0;
         long var9 = bcl.a;
         bxr var16 = this.n.i;
         var16.getClass();
         var18.m = var16;
         car.J(super.c);
         this.ao().d(this, f, new bmc(var17, 3));
         blt var21 = this.r;
         blt var20 = var21;
         if (var21 == null) {
            var20 = new blt();
            this.r = var20;
         }

         var18.getClass();
         var20.a = var18.a;
         var20.b = var18.b;
         var20.c = var18.g;
         var20.d = var18.h;
         var20.e = var18.i;
         float var4 = var18.a;
         float var7 = var18.b;
         float var3 = var18.c;
         float var2 = var18.d;
         long var11 = var18.e;
         long var13 = var18.f;
         float var5 = var18.g;
         float var6 = var18.h;
         var9 = var18.i;
         bdr var23 = var18.j;
         boolean var15 = var18.k;
         int var8 = var18.l;
         bmd var22 = this.n;
         var19.j(var4, var7, var3, var2, var5, var6, var9, var23, var15, var11, var13, var8, var22.j, var22.i);
         this.v = var18.k;
         this.y = var18.c;
         if (var1) {
            bmd var25 = this.n;
            boa var24 = var25.s;
            if (var24 != null) {
               var24.j(var25);
               return;
            }
         }
      } else if (this.q != null) {
         throw new IllegalStateException("non-null layer with a null layerBlock");
      }

   }

   private static final bmz ar(bjf var0) {
      bjr var1;
      if (var0 instanceof bjr) {
         var1 = (bjr)var0;
      } else {
         var1 = null;
      }

      return var1 != null ? var1.a() : (bmz)var0;
   }

   private final long z(bmz var1, long var2) {
      if (var1 == this) {
         return var2;
      } else {
         bmz var4 = this.p;
         return var4 != null && !c.E(var1, var4) ? this.L(var4.z(var1, var2)) : this.L(var2);
      }
   }

   public final long A() {
      return this.B;
   }

   public final bjf B() {
      return this;
   }

   public final bju C() {
      bju var1 = this.z;
      if (var1 != null) {
         return var1;
      } else {
         throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
      }
   }

   public final bmd D() {
      return this.n;
   }

   public final bmn E() {
      return this.o;
   }

   public final bmn F() {
      return this.p;
   }

   public final void G() {
      this.r(this.B, this.q);
   }

   public final boolean H() {
      return this.z != null;
   }

   protected final float J(long var1, long var3) {
      if ((float)this.o() >= bcl.c(var3) && (float)this.n() >= bcl.a(var3)) {
         return Float.POSITIVE_INFINITY;
      } else {
         var3 = this.K(var3);
         float var6 = bcl.c(var3);
         float var7 = bcl.a(var3);
         float var5 = bci.b(var1);
         if (var5 < 0.0F) {
            var5 = -var5;
         } else {
            var5 -= (float)this.o();
         }

         float var8 = Math.max(0.0F, var5);
         var5 = bci.c(var1);
         if (var5 < 0.0F) {
            var5 = -var5;
         } else {
            var5 -= (float)this.n();
         }

         var1 = es.i(var8, Math.max(0.0F, var5));
         return (var6 > 0.0F || var7 > 0.0F) && bci.b(var1) <= var6 && bci.c(var1) <= var7 ? bci.b(var1) * bci.b(var1) + bci.c(var1) * bci.c(var1) : Float.POSITIVE_INFINITY;
      }
   }

   public final long K(long var1) {
      float var4 = bcl.c(var1);
      float var5 = (float)this.o();
      float var3 = (bcl.a(var1) - (float)this.n()) / 2.0F;
      return et.k(Math.max(0.0F, (var4 - var5) / 2.0F), Math.max(0.0F, var3));
   }

   public final long L(long var1) {
      long var6 = this.B;
      int var5 = bxw.a(var6);
      float var3 = bci.b(var1);
      float var4 = (float)var5;
      var5 = bxw.b(var6);
      var6 = es.i(var3 - var4, bci.c(var1) - (float)var5);
      bnd var8 = this.t;
      var1 = var6;
      if (var8 != null) {
         var1 = var8.a(var6, true);
      }

      return var1;
   }

   public final long M() {
      return this.w.eK(this.n.k.d());
   }

   public final long N(long var1) {
      bnd var8 = this.t;
      if (var8 != null) {
         var1 = var8.a(var1, false);
      }

      long var6 = this.B;
      int var5 = bxw.a(var6);
      float var3 = bci.b(var1);
      float var4 = (float)var5;
      var5 = bxw.b(var6);
      return es.i(var3 + var4, bci.c(var1) + (float)var5);
   }

   public final bba O(int var1) {
      boolean var2 = jm.m(var1);
      bba var3 = this.t();
      bba var4;
      if (!var2) {
         var4 = var3.s;
         var3 = var4;
         if (var4 == null) {
            return null;
         }
      }

      for(var4 = this.P(var2); var4 != null && (var4.r & var1) != 0; var4 = var4.t) {
         if ((var4.q & var1) != 0) {
            return var4;
         }

         if (var4 == var3) {
            break;
         }
      }

      return null;
   }

   public final bba P(boolean var1) {
      bba var2;
      if (this.n.s() == this) {
         var2 = this.n.n.e;
      } else {
         bmz var3;
         if (var1) {
            var3 = this.p;
            if (var3 != null) {
               var2 = var3.t();
               if (var2 != null) {
                  return var2.t;
               }
            }
         } else {
            var3 = this.p;
            if (var3 != null) {
               return var3.t();
            }
         }

         var2 = null;
      }

      return var2;
   }

   public final bch Q() {
      bch var2 = this.C;
      bch var1 = var2;
      if (var2 == null) {
         var1 = new bch();
         this.C = var1;
      }

      return var1;
   }

   public final bkw R() {
      return this.n.o.n;
   }

   public final bmz S(bmz var1) {
      bmd var3 = var1.n;
      bmd var4 = this.n;
      bmd var2 = var3;
      if (var3 == var4) {
         bba var8 = var1.t();
         bba var6 = this.t();
         if (var6.n().y) {
            var6 = var6.n();

            while(true) {
               bba var7 = var6.s;
               if (var7 == null) {
                  return this;
               }

               var6 = var7;
               if ((var7.q & 2) != 0) {
                  if (var7 == var8) {
                     return var1;
                  }

                  var6 = var7;
               }
            }
         } else {
            throw new IllegalStateException("visitLocalAncestors called on an unattached node");
         }
      } else {
         while(true) {
            var3 = var4;
            if (var2.f <= var4.f) {
               while(true) {
                  bmd var5 = var2;
                  var4 = var3;
                  if (var3.f <= var2.f) {
                     do {
                        if (var5 == var4) {
                           if (var4 != this.n) {
                              if (var5 != var1.n) {
                                 return var5.r();
                              }
                           } else {
                              var1 = this;
                           }

                           return var1;
                        }

                        var5 = var5.n();
                        var4 = var4.n();
                     } while(var5 != null && var4 != null);

                     throw new IllegalArgumentException("layouts are not part of the same hierarchy");
                  }

                  var3 = var3.n();
                  var3.getClass();
               }
            }

            var2 = var2.n();
            var2.getClass();
         }
      }
   }

   public final void T(bcw var1) {
      bnd var8 = this.t;
      if (var8 != null) {
         var8.c(var1);
      } else {
         long var6 = this.B;
         int var4 = bxw.a(var6);
         int var5 = bxw.b(var6);
         float var2 = (float)var4;
         float var3 = (float)var5;
         var1.g(var2, var3);
         this.U(var1);
         var1.g(-var2, -var3);
      }
   }

   public final void U(bcw var1) {
      bba var8 = this.O(4);
      if (var8 == null) {
         this.y(var1);
      } else {
         bmf var11 = this.n.o();
         long var4 = car.J(super.c);
         axf var7 = null;

         while(true) {
            int var2;
            axf var6;
            do {
               if (var8 == null) {
                  return;
               }

               if (var8 instanceof bll) {
                  var11.n(var1, var4, this, (bll)var8);
                  var6 = var7;
                  break;
               }

               var6 = var7;
               if ((var8.q & 4) == 0) {
                  break;
               }

               var6 = var7;
               if (!(var8 instanceof blh)) {
                  break;
               }

               bba var9 = ((blh)var8).A;
               var2 = 0;
               var6 = var7;
               bba var12 = var9;

               axf var10;
               for(var9 = var8; var12 != null; var6 = var10) {
                  var8 = var9;
                  int var3 = var2;
                  var10 = var6;
                  if ((var12.q & 4) != 0) {
                     var3 = var2 + 1;
                     if (var3 == 1) {
                        var8 = var12;
                        var10 = var6;
                     } else {
                        axf var13 = var6;
                        if (var6 == null) {
                           var13 = new axf(new bba[16]);
                        }

                        if (var9 != null) {
                           var13.p(var9);
                        }

                        var13.p(var12);
                        var6 = null;
                        var10 = var13;
                        var8 = var6;
                     }
                  }

                  var12 = var12.t;
                  var9 = var8;
                  var2 = var3;
               }

               var8 = var9;
               var7 = var6;
            } while(var2 == 1);

            var8 = jj.f(var6);
            var7 = var6;
         }
      }
   }

   public final void V(bba var1, bmw var2, long var3, blq var5, boolean var6, boolean var7) {
      if (var1 == null) {
         this.x(var2, var3, var5, var6, var7);
      } else {
         var5.b(var1, -1.0F, var7, new bmx(this, var1, var2, var3, var5, var6, var7));
      }
   }

   public final void W(bba var1, bmw var2, long var3, blq var5, boolean var6, boolean var7, float var8) {
      if (var1 == null) {
         this.x(var2, var3, var5, var6, var7);
      } else {
         var5.b(var1, var8, var7, new bmy(this, var1, var2, var3, var5, var6, var7, var8));
      }
   }

   public final void X(bmw var1, long var2, blq var4, boolean var5, boolean var6) {
      var1.getClass();
      bba var9 = this.O(var1.a());
      float var7;
      if (!this.aj(var2)) {
         if (var5) {
            var7 = this.J(var2, this.M());
            if (!Float.isInfinite(var7) && !Float.isNaN(var7) && var4.d(var7, false)) {
               this.W(var9, var1, var2, var4, true, false, var7);
            }
         }

      } else if (var9 == null) {
         this.x(var1, var2, var4, var5, var6);
      } else {
         var7 = bci.b(var2);
         float var8 = bci.c(var2);
         if (var7 >= 0.0F && var8 >= 0.0F && var7 < (float)this.o() && var8 < (float)this.n()) {
            this.V(var9, var1, var2, var4, var5, var6);
         } else {
            if (!var5) {
               var7 = Float.POSITIVE_INFINITY;
            } else {
               var7 = this.J(var2, this.M());
            }

            if (!Float.isInfinite(var7) && !Float.isNaN(var7) && var4.d(var7, var6)) {
               this.W(var9, var1, var2, var4, var5, var6, var7);
            } else {
               this.ag(var9, var1, var2, var4, var5, var6, var7);
            }
         }
      }
   }

   public final void Y() {
      bnd var1 = this.t;
      if (var1 != null) {
         var1.invalidate();
      } else {
         bmz var2 = this.p;
         if (var2 != null) {
            var2.Y();
         }

      }
   }

   public final void Z() {
      int var1;
      bml var4;
      label26: {
         var4 = this.n.o;
         int var2 = var4.a.ag();
         var1 = var2;
         if (var2 != 3) {
            var1 = var2;
            if (var2 != 4) {
               break label26;
            }

            var1 = 4;
         }

         if (var4.n.s) {
            var4.i(true);
         } else {
            var4.h(true);
         }
      }

      if (var1 == 4) {
         bmh var3 = var4.o;
         if (var3 != null && var3.q) {
            var4.i(true);
            return;
         }

         var4.h(true);
      }

   }

   public final float a() {
      return this.n.i.a();
   }

   public final void aa() {
      bnd var1 = this.t;
      if (var1 != null) {
         var1.invalidate();
      }

   }

   public final void ab() {
      bba var4 = this.P(jm.m(128));
      if (var4 != null && (var4.n().r & 128) != 0) {
         azk var11 = dp.f();

         label3385: {
            Throwable var10000;
            Throwable var357;
            label3392: {
               azk var12;
               boolean var10001;
               try {
                  var12 = var11.v();
               } catch (Throwable var354) {
                  var10000 = var354;
                  var10001 = false;
                  break label3392;
               }

               label3393: {
                  label3394: {
                     boolean var3;
                     try {
                        var3 = jm.m(128);
                     } catch (Throwable var353) {
                        var10000 = var353;
                        var10001 = false;
                        break label3394;
                     }

                     bba var9;
                     if (var3) {
                        try {
                           var9 = this.t();
                        } catch (Throwable var352) {
                           var10000 = var352;
                           var10001 = false;
                           break label3394;
                        }
                     } else {
                        try {
                           var4 = this.t().s;
                        } catch (Throwable var351) {
                           var10000 = var351;
                           var10001 = false;
                           break label3394;
                        }

                        var9 = var4;
                        if (var4 == null) {
                           break label3393;
                        }
                     }

                     bba var6;
                     try {
                        var6 = this.P(var3);
                     } catch (Throwable var350) {
                        var10000 = var350;
                        var10001 = false;
                        break label3394;
                     }

                     label3366:
                     while(true) {
                        if (var6 == null) {
                           break label3393;
                        }

                        label3396: {
                           try {
                              if ((var6.r & 128) == 0) {
                                 break label3393;
                              }

                              if ((var6.q & 128) == 0) {
                                 break label3396;
                              }
                           } catch (Throwable var349) {
                              var10000 = var349;
                              var10001 = false;
                              break;
                           }

                           bba var8 = var6;
                           axf var5 = null;

                           label3357:
                           while(true) {
                              int var2;
                              axf var355;
                              do {
                                 if (var8 == null) {
                                    break label3357;
                                 }

                                 label3352: {
                                    try {
                                       if (!(var8 instanceof blu)) {
                                          break label3352;
                                       }

                                       ((blu)var8).h(super.c);
                                    } catch (Throwable var348) {
                                       var10000 = var348;
                                       var10001 = false;
                                       break label3366;
                                    }

                                    var355 = var5;
                                    break;
                                 }

                                 var355 = var5;

                                 try {
                                    if ((var8.q & 128) == 0) {
                                       break;
                                    }
                                 } catch (Throwable var346) {
                                    var10000 = var346;
                                    var10001 = false;
                                    break label3366;
                                 }

                                 var355 = var5;

                                 bba var7;
                                 try {
                                    if (!(var8 instanceof blh)) {
                                       break;
                                    }

                                    var7 = ((blh)var8).A;
                                 } catch (Throwable var345) {
                                    var10000 = var345;
                                    var10001 = false;
                                    break label3366;
                                 }

                                 var2 = 0;

                                 int var1;
                                 for(var355 = var5; var7 != null; var2 = var1) {
                                    bba var356 = var8;
                                    axf var10 = var355;
                                    var1 = var2;

                                    label3341: {
                                       try {
                                          if ((var7.q & 128) == 0) {
                                             break label3341;
                                          }
                                       } catch (Throwable var347) {
                                          var10000 = var347;
                                          var10001 = false;
                                          break label3366;
                                       }

                                       var1 = var2 + 1;
                                       if (var1 == 1) {
                                          var356 = var7;
                                          var10 = var355;
                                       } else {
                                          var5 = var355;
                                          if (var355 == null) {
                                             try {
                                                var5 = new axf(new bba[16]);
                                             } catch (Throwable var344) {
                                                var10000 = var344;
                                                var10001 = false;
                                                break label3366;
                                             }
                                          }

                                          if (var8 != null) {
                                             try {
                                                var5.p(var8);
                                             } catch (Throwable var343) {
                                                var10000 = var343;
                                                var10001 = false;
                                                break label3366;
                                             }
                                          }

                                          try {
                                             var5.p(var7);
                                          } catch (Throwable var342) {
                                             var10000 = var342;
                                             var10001 = false;
                                             break label3366;
                                          }

                                          var4 = null;
                                          var10 = var5;
                                          var356 = var4;
                                       }
                                    }

                                    try {
                                       var7 = var7.t;
                                    } catch (Throwable var341) {
                                       var10000 = var341;
                                       var10001 = false;
                                       break label3366;
                                    }

                                    var8 = var356;
                                    var355 = var10;
                                 }

                                 var5 = var355;
                              } while(var2 == 1);

                              try {
                                 var8 = jj.f(var355);
                              } catch (Throwable var340) {
                                 var10000 = var340;
                                 var10001 = false;
                                 break label3366;
                              }

                              var5 = var355;
                           }
                        }

                        if (var6 == var9) {
                           break label3393;
                        }

                        try {
                           var6 = var6.t;
                        } catch (Throwable var339) {
                           var10000 = var339;
                           var10001 = false;
                           break;
                        }
                     }
                  }

                  var357 = var10000;

                  try {
                     azk.D(var12);
                     throw var357;
                  } catch (Throwable var337) {
                     var10000 = var337;
                     var10001 = false;
                     break label3392;
                  }
               }

               label3299:
               try {
                  azk.D(var12);
                  break label3385;
               } catch (Throwable var338) {
                  var10000 = var338;
                  var10001 = false;
                  break label3299;
               }
            }

            var357 = var10000;
            var11.c();
            throw var357;
         }

         var11.c();
      }
   }

   public final void ac() {
      boolean var3 = jm.m(128);
      bba var9 = this.t();
      bba var4;
      if (!var3) {
         var4 = var9.s;
         var9 = var4;
         if (var4 == null) {
            return;
         }
      }

      for(bba var5 = this.P(var3); var5 != null && (var5.r & 128) != 0; var5 = var5.t) {
         if ((var5.q & 128) != 0) {
            bba var8 = var5;
            axf var7 = null;

            label69:
            while(true) {
               int var1;
               axf var11;
               do {
                  if (var8 == null) {
                     break label69;
                  }

                  if (var8 instanceof blu) {
                     ((blu)var8).g(this);
                     var11 = var7;
                     break;
                  }

                  var11 = var7;
                  if ((var8.q & 128) == 0) {
                     break;
                  }

                  var11 = var7;
                  if (!(var8 instanceof blh)) {
                     break;
                  }

                  bba var6 = ((blh)var8).A;
                  var1 = 0;

                  int var2;
                  for(var11 = var7; var6 != null; var1 = var2) {
                     bba var12 = var8;
                     axf var10 = var11;
                     var2 = var1;
                     if ((var6.q & 128) != 0) {
                        var2 = var1 + 1;
                        if (var2 == 1) {
                           var12 = var6;
                           var10 = var11;
                        } else {
                           var7 = var11;
                           if (var11 == null) {
                              var7 = new axf(new bba[16]);
                           }

                           if (var8 != null) {
                              var7.p(var8);
                           }

                           var7.p(var6);
                           var4 = null;
                           var10 = var7;
                           var12 = var4;
                        }
                     }

                     var6 = var6.t;
                     var8 = var12;
                     var11 = var10;
                  }

                  var7 = var11;
               } while(var1 == 1);

               var8 = jj.f(var11);
               var7 = var11;
            }
         }

         if (var5 == var9) {
            break;
         }
      }

   }

   public final void ad() {
      this.u = true;
      if (this.t != null) {
         am(this, (qvt)null);
      }

   }

   public final void ae(bch var1, boolean var2, boolean var3) {
      bnd var12 = this.t;
      float var4;
      float var5;
      int var8;
      long var10;
      if (var12 != null) {
         if (this.v) {
            if (var3) {
               var10 = this.M();
               var5 = bcl.c(var10) / 2.0F;
               float var7 = bcl.a(var10) / 2.0F;
               var10 = super.c;
               var8 = bxx.b(var10);
               float var6 = (float)bxx.a(var10);
               var4 = (float)var8;
               var1.a(-var5, -var7, var4 + var5, var6 + var7);
            } else if (var2) {
               var10 = super.c;
               var8 = bxx.b(var10);
               int var9 = bxx.a(var10);
               var1.a(0.0F, 0.0F, (float)var8, (float)var9);
            }

            if (var1.b()) {
               return;
            }
         }

         var12.d(var1, false);
      }

      var10 = this.B;
      var8 = bxw.a(var10);
      var4 = var1.a;
      var5 = (float)var8;
      var1.a = var4 + var5;
      var1.c += var5;
      var8 = bxw.b(var10);
      var4 = var1.b;
      var5 = (float)var8;
      var1.b = var4 + var5;
      var1.d += var5;
   }

   public final void af(bju var1) {
      var1.getClass();
      bju var5 = this.z;
      if (var1 != var5) {
         this.z = var1;
         if (var5 == null || var1.d() != var5.d() || var1.c() != var5.c()) {
            int var3 = var1.d();
            int var2 = var1.c();
            bnd var12 = this.t;
            if (var12 != null) {
               var12.f(car.I(var3, var2));
            } else {
               bmz var13 = this.p;
               if (var13 != null) {
                  var13.Y();
               }
            }

            label120: {
               this.p(car.I(var3, var2));
               this.aq(false);
               boolean var4 = jm.m(4);
               bba var10;
               if (var4) {
                  var10 = this.t();
               } else {
                  bba var14 = this.t().s;
                  var10 = var14;
                  if (var14 == null) {
                     break label120;
                  }
               }

               for(bba var6 = this.P(var4); var6 != null && (var6.r & 4) != 0; var6 = var6.t) {
                  if ((var6.q & 4) != 0) {
                     bba var9 = var6;
                     axf var8 = null;

                     label102:
                     while(true) {
                        axf var15;
                        do {
                           if (var9 == null) {
                              break label102;
                           }

                           if (var9 instanceof bll) {
                              ((bll)var9).es();
                              var15 = var8;
                              break;
                           }

                           var15 = var8;
                           if ((var9.q & 4) == 0) {
                              break;
                           }

                           var15 = var8;
                           if (!(var9 instanceof blh)) {
                              break;
                           }

                           bba var7 = ((blh)var9).A;
                           var2 = 0;

                           for(var15 = var8; var7 != null; var2 = var3) {
                              bba var17 = var9;
                              axf var11 = var15;
                              var3 = var2;
                              if ((var7.q & 4) != 0) {
                                 var3 = var2 + 1;
                                 if (var3 == 1) {
                                    var17 = var7;
                                    var11 = var15;
                                 } else {
                                    var8 = var15;
                                    if (var15 == null) {
                                       var8 = new axf(new bba[16]);
                                    }

                                    if (var9 != null) {
                                       var8.p(var9);
                                    }

                                    var8.p(var7);
                                    var5 = null;
                                    var11 = var8;
                                    var17 = var5;
                                 }
                              }

                              var7 = var7.t;
                              var9 = var17;
                              var15 = var11;
                           }

                           var8 = var15;
                        } while(var2 == 1);

                        var9 = jj.f(var15);
                        var8 = var15;
                     }
                  }

                  if (var6 == var10) {
                     break;
                  }
               }
            }

            bmd var16 = this.n;
            boa var18 = var16.s;
            if (var18 != null) {
               var18.j(var16);
            }
         }

         Map var19 = this.A;
         if ((var19 != null && !var19.isEmpty() || !var1.e().isEmpty()) && !c.E(var1.e(), this.A)) {
            ((bmj)this.R()).q.e();
            Object var20 = this.A;
            if (var20 == null) {
               var20 = new LinkedHashMap();
               this.A = (Map)var20;
            }

            ((Map)var20).clear();
            ((Map)var20).putAll(var1.e());
            return;
         }
      }

   }

   public final void ag(bba var1, bmw var2, long var3, blq var5, boolean var6, boolean var7, float var8) {
      if (var1 == null) {
         this.x(var2, var3, var5, var6, var7);
      } else {
         var2.d(var1);
         this.ag(jm.n(var1, var2.a()), var2, var3, var5, var6, var7, var8);
      }
   }

   public final void ah(qvt var1, boolean var2) {
      bmd var5 = this.n;
      boolean var3 = true;
      if (!var2 && this.q == var1 && c.E(this.w, var5.i) && this.x == var5.j) {
         var3 = false;
      }

      this.q = var1;
      this.w = var5.i;
      this.x = var5.j;
      var2 = this.k();
      Object var4 = null;
      if (var2 && var1 != null) {
         if (this.t != null) {
            if (var3) {
               an(this);
            }

         } else {
            boa var6 = bmg.a(var5);
            qvi var7 = this.D;
            var7.getClass();
            ebt var8 = var6.J;
            var8.w();

            Object var15;
            do {
               axf var14 = (axf)var8.b;
               if (!var14.n()) {
                  var15 = var4;
                  break;
               }

               var15 = ((Reference)var14.c(var14.b - 1)).get();
            } while(var15 == null);

            var15 = (bnd)var15;
            if (var15 != null) {
               ((bnd)var15).g(this, var7);
            } else {
               label164: {
                  if (var6.isHardwareAccelerated() && var6.o) {
                     boolean var10 = false;

                     label144:
                     try {
                        var10 = true;
                        bpx var16 = new bpx(var6, this, var7);
                        var10 = false;
                        break label164;
                     } finally {
                        if (var10) {
                           var6.o = false;
                           break label144;
                        }
                     }
                  }

                  if (var6.l == null) {
                     if (!bqc.c) {
                        kf.b(new View(var6.getContext()));
                     }

                     Context var17;
                     if (bqc.d) {
                        var17 = var6.getContext();
                        var17.getClass();
                        var15 = new bpm(var17);
                     } else {
                        var17 = var6.getContext();
                        var17.getClass();
                        var15 = new bqd(var17);
                     }

                     var6.l = (bpm)var15;
                     var6.addView(var6.l);
                  }

                  bpm var18 = var6.l;
                  var18.getClass();
                  var15 = new bqc(var6, var18, this, var7);
               }
            }

            ((bnd)var15).f(super.c);
            ((bnd)var15).e(this.B);
            this.t = (bnd)var15;
            an(this);
            var5.aq();
            this.D.a();
         }
      } else {
         bnd var12 = this.t;
         if (var12 != null) {
            var12.b();
            var5.aq();
            this.D.a();
            if (this.k()) {
               boa var13 = var5.s;
               if (var13 != null) {
                  var13.j(var5);
               }
            }
         }

         this.t = null;
         this.s = false;
      }
   }

   public final boolean ai() {
      if (this.t != null && this.y <= 0.0F) {
         return true;
      } else {
         bmz var1 = this.p;
         return var1 != null ? var1.ai() : false;
      }
   }

   protected final boolean aj(long var1) {
      if (!es.j(var1)) {
         return false;
      } else {
         bnd var3 = this.t;
         return var3 == null || !this.v || var3.i(var1);
      }
   }

   protected final void ak(bcw var1, bco var2) {
      var2.getClass();
      long var5 = super.c;
      int var4 = bxx.b(var5);
      float var3 = (float)bxx.a(var5);
      var1.j(new bcj(0.5F, 0.5F, (float)var4 - 0.5F, var3 - 0.5F), var2);
   }

   public final void al(long var1, qvt var3) {
      am(this, var3);
      if (!c.o(this.B, var1)) {
         this.B = var1;
         this.n.o.n.s();
         bnd var5 = this.t;
         if (var5 != null) {
            var5.e(var1);
         } else {
            bmz var6 = this.p;
            if (var6 != null) {
               var6.Y();
            }
         }

         I(this);
         bmd var7 = this.n;
         boa var4 = var7.s;
         if (var4 != null) {
            var4.j(var7);
            return;
         }
      }

   }

   public final float b() {
      return this.n.i.b();
   }

   public final Object c() {
      if (!this.n.n.j(64)) {
         return null;
      } else {
         this.t();
         qwz var9 = new qwz();

         label65:
         for(bba var4 = this.n.n.d; var4 != null; var4 = var4.s) {
            if ((var4.q & 64) != 0) {
               axf var6 = null;
               bba var7 = var4;

               while(true) {
                  int var1;
                  axf var3;
                  do {
                     if (var7 == null) {
                        continue label65;
                     }

                     if (var7 instanceof bnh) {
                        var9.a = ((bnh)var7).eD(this.n.i, var9.a);
                        var3 = var6;
                        break;
                     }

                     var3 = var6;
                     if ((var7.q & 64) == 0) {
                        break;
                     }

                     var3 = var6;
                     if (!(var7 instanceof blh)) {
                        break;
                     }

                     bba var5 = ((blh)var7).A;
                     var1 = 0;

                     int var2;
                     for(var3 = var6; var5 != null; var1 = var2) {
                        bba var10 = var7;
                        axf var8 = var3;
                        var2 = var1;
                        if ((var5.q & 64) != 0) {
                           var2 = var1 + 1;
                           if (var2 == 1) {
                              var10 = var5;
                              var8 = var3;
                           } else {
                              var6 = var3;
                              if (var3 == null) {
                                 var6 = new axf(new bba[16]);
                              }

                              if (var7 != null) {
                                 var6.p(var7);
                              }

                              var6.p(var5);
                              var3 = null;
                              var8 = var6;
                              var10 = var3;
                           }
                        }

                        var5 = var5.t;
                        var7 = var10;
                        var3 = var8;
                     }

                     var6 = var3;
                  } while(var1 == 1);

                  var7 = jj.f(var3);
                  var6 = var3;
               }
            }
         }

         return var9.a;
      }
   }

   public final long d() {
      return super.c;
   }

   public final long e(bjf var1, long var2) {
      if (var1 instanceof bjr) {
         return bci.h(var1.e(this, bci.h(var2)));
      } else {
         bmz var5 = ar(var1);
         var5.Z();
         bmz var4 = this.S(var5);

         while(var5 != var4) {
            var2 = var5.N(var2);
            var5 = var5.p;
            var5.getClass();
         }

         return this.z(var4, var2);
      }
   }

   public final long f(long var1) {
      if (!this.k()) {
         IllegalStateException var4 = new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
         throw var4;
      } else {
         this.Z();

         for(bmz var3 = this; var3 != null; var3 = var3.p) {
            var1 = var3.N(var1);
         }

         return var1;
      }
   }

   public final long g(long var1) {
      var1 = this.f(var1);
      boa var3 = bmg.a(this.n);
      var3.n();
      return bdf.a(var3.n, var1);
   }

   public final bcj h(bjf var1, boolean var2) {
      if (this.k()) {
         if (var1.k()) {
            bmz var3 = ar(var1);
            var3.Z();
            bmz var5 = this.S(var3);
            bch var4 = this.Q();
            var4.a = 0.0F;
            var4.b = 0.0F;
            var4.c = (float)bxx.b(var1.d());
            var4.d = (float)bxx.a(var1.d());
            bmz var7 = var3;

            while(var7 != var5) {
               var7.ae(var4, var2, false);
               if (var4.b()) {
                  return bcj.a;
               }

               var7 = var7.p;
               var7.getClass();
            }

            this.ap(var5, var4, var2);
            return er.j(var4);
         } else {
            throw new IllegalStateException(c.aF(var1, "LayoutCoordinates ", " is not attached!"));
         }
      } else {
         IllegalStateException var6 = new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
         throw var6;
      }
   }

   public final bjf i() {
      if (this.k()) {
         this.Z();
         return this.n.s().p;
      } else {
         throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
      }
   }

   public final bxy j() {
      return this.n.j;
   }

   public final boolean k() {
      return !this.u && this.n.ad();
   }

   public void r(long var1, qvt var3) {
      throw null;
   }

   public abstract bba t();

   public abstract bmo u();

   public abstract void v();

   public final boolean w() {
      return this.t != null && this.k();
   }

   public void x(bmw var1, long var2, blq var4, boolean var5, boolean var6) {
      bmz var7 = this.o;
      if (var7 != null) {
         var7.X(var1, var7.L(var2), var4, var5, var6);
      }

   }

   public void y(bcw var1) {
      throw null;
   }
}
