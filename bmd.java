import com.google.android.material.snackbar.Lqt.HUJCIBIkzRDQ;
import com.google.googlex.gcam.base.HmAh.RbaSbznIXS;
import java.util.Comparator;
import java.util.List;

public final class bmd implements asi, bkg, bnf, bjh, ble, bne {
   public static final qvi b;
   public static final Comparator c;
   private static final bma t = new blz();
   private static final bqa u;
   private brl A;
   private final axf B;
   private boolean C;
   private bmz D;
   private boolean E;
   private bbb F;
   private boolean G;
   private int H;
   private final bpe I;
   private final lmk J;
   public int d;
   public bmd e;
   public int f;
   public boolean g;
   public bjt h;
   public bxr i;
   public bxy j;
   public bqa k;
   public ata l;
   public boolean m;
   public final bmr n;
   public final bml o;
   public bjq p;
   public boolean q;
   public int r;
   public boa s;
   private final boolean v;
   private int w;
   private axf x;
   private boolean y;
   private bmd z;

   static {
      b = ara.t;
      u = new bly();
      c = wr.a;
   }

   public bmd() {
      this(false, 3, (byte[])null);
   }

   public bmd(boolean var1, int var2) {
      this.v = var1;
      this.d = var2;
      this.I = new bpe(new axf(new bmd[16]), new bmc(this, 0));
      this.B = new axf(new bmd[16]);
      this.C = true;
      this.h = t;
      this.J = new lmk((boolean[])null);
      this.i = bmg.a;
      this.j = bxy.a;
      this.k = u;
      var2 = ata.rY;
      this.l = asz.a;
      this.r = 3;
      this.H = 3;
      this.n = new bmr(this);
      this.o = new bml(this);
      this.E = true;
      this.F = bbb.d;
   }

   // $FF: synthetic method
   public bmd(boolean var1, int var2, byte[] var3) {
      boolean var4 = true;
      boolean var5;
      if (1 != (var1 & (var2 & 1 ^ 1))) {
         var5 = false;
      } else {
         var5 = var4;
      }

      this(var5, brm.a());
   }

   // $FF: synthetic method
   static String aj(bmd var0) {
      return var0.at(0);
   }

   // $FF: synthetic method
   public static boolean al(bmd var0) {
      return var0.af(var0.o.b());
   }

   // $FF: synthetic method
   public static void am(bmd var0) {
      var0.T(false);
   }

   // $FF: synthetic method
   public static void an(bmd var0, boolean var1, int var2) {
      if (var0.e == null) {
         IllegalStateException var7 = new IllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadLayout");
         throw var7;
      } else {
         boa var5 = var0.s;
         if (var5 != null && !var0.g && !var0.v) {
            boolean var4 = false;
            boolean var3;
            if ((var2 & 2) != 0) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var8;
            if (1 != (var1 & (var2 & 1 ^ 1))) {
               var8 = var4;
            } else {
               var8 = true;
            }

            var5.k(var0, true, var8, var3);
            bmh var6 = var0.p();
            var6.getClass();
            bmd var9 = var6.t.a;
            var0 = var9.n();
            var2 = var9.r;
            if (var0 != null && var2 != 3) {
               while(var0.r == var2) {
                  var9 = var0.n();
                  if (var9 == null) {
                     break;
                  }

                  var0 = var9;
               }

               if (var2 != 0) {
                  switch(var2 - 1) {
                  case 0:
                     if (var0.e != null) {
                        an(var0, var8, 2);
                        return;
                     }

                     ap(var0, var8, 2);
                     return;
                  case 1:
                     if (var0.e != null) {
                        var0.T(var8);
                        return;
                     }

                     var0.U(var8);
                     return;
                  default:
                     throw new IllegalStateException("Intrinsics isn't used by the parent");
                  }
               }

               throw null;
            }
         }

      }
   }

   // $FF: synthetic method
   public static void ao(bmd var0) {
      var0.U(false);
   }

   // $FF: synthetic method
   public static void ap(bmd var0, boolean var1, int var2) {
      if (!var0.g && !var0.v) {
         boa var5 = var0.s;
         if (var5 != null) {
            boolean var4 = true;
            boolean var3;
            if ((var2 & 2) != 0) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var6;
            if (1 != (var1 & (var2 & 1 ^ 1))) {
               var6 = false;
            } else {
               var6 = var4;
            }

            var5.k(var0, false, var6, var3);
            bmd var7 = var0.q().u.a;
            var0 = var7.n();
            var2 = var7.r;
            if (var0 != null && var2 != 3) {
               while(var0.r == var2) {
                  var7 = var0.n();
                  if (var7 == null) {
                     break;
                  }

                  var0 = var7;
               }

               if (var2 != 0) {
                  switch(var2 - 1) {
                  case 0:
                     ap(var0, var6, 2);
                     return;
                  case 1:
                     var0.U(var6);
                     return;
                  default:
                     throw new IllegalStateException(HUJCIBIkzRDQ.eqHXBTFIYqPuQz);
                  }
               }

               throw null;
            }
         }
      }

   }

   private final String at(int var1) {
      StringBuilder var5 = new StringBuilder();

      int var2;
      for(var2 = 0; var2 < var1; ++var2) {
         var5.append("  ");
      }

      var5.append("|-");
      var5.append(this.toString());
      var5.append('\n');
      axf var6 = this.m();
      int var4 = var6.b;
      if (var4 > 0) {
         Object[] var8 = var6.a;
         var2 = 0;

         int var3;
         do {
            var5.append(((bmd)var8[var2]).at(var1 + 1));
            var3 = var2 + 1;
            var2 = var3;
         } while(var3 < var4);
      }

      String var7 = var5.toString();
      if (var1 == 0) {
         var7 = var7.substring(0, var7.length() - 1);
         var7.getClass();
         return var7;
      } else {
         return var7;
      }
   }

   private final void au() {
      if (this.w > 0) {
         this.y = true;
      }

      if (this.v) {
         bmd var1 = this.z;
         if (var1 != null) {
            var1.au();
         }
      }

   }

   private final void av(bmd var1) {
      if (var1.o.m > 0) {
         bml var5 = this.o;
         var5.g(var5.m - 1);
      }

      if (this.s != null) {
         var1.C();
      }

      var1.z = null;
      var1.s().p = null;
      if (var1.v) {
         --this.w;
         axf var6 = (axf)var1.I.a;
         int var4 = var6.b;
         if (var4 > 0) {
            Object[] var7 = var6.a;
            int var2 = 0;

            int var3;
            do {
               ((bmd)var7[var2]).s().p = null;
               var3 = var2 + 1;
               var2 = var3;
            } while(var3 < var4);
         }
      }

      this.au();
      this.P();
   }

   private final void aw() {
      this.I();
      bmd var1 = this.n();
      if (var1 != null) {
         var1.G();
      }

      this.H();
   }

   private final void ax() {
      bmr var2 = this.n;

      for(bba var1 = var2.d; var1 != null; var1 = var1.s) {
         if (var1.y) {
            var1.r();
         }
      }

      var2.f();
      var2.c();
   }

   private final void ay(bmd var1) {
      if (!c.E(var1, this.e)) {
         this.e = var1;
         if (var1 != null) {
            bml var3 = this.o;
            if (var3.o == null) {
               var3.o = new bmh(var3);
            }

            bmz var4 = this.s();

            for(bmz var2 = this.r().o; !c.E(var4, var2) && var4 != null; var4 = var4.o) {
               var4.v();
            }
         }

         this.I();
      }

   }

   public final void A() {
      this.H = this.r;
      this.r = 3;
      axf var4 = this.m();
      int var3 = var4.b;
      if (var3 > 0) {
         Object[] var6 = var4.a;
         int var1 = 0;

         int var2;
         do {
            bmd var5 = (bmd)var6[var1];
            if (var5.r != 3) {
               var5.A();
            }

            var2 = var1 + 1;
            var1 = var2;
         } while(var2 < var3);
      }

   }

   public final void B() {
      this.H = this.r;
      this.r = 3;
      axf var4 = this.m();
      int var3 = var4.b;
      if (var3 > 0) {
         Object[] var5 = var4.a;
         int var1 = 0;

         int var2;
         do {
            bmd var6 = (bmd)var5[var1];
            if (var6.r == 2) {
               var6.B();
            }

            var2 = var1 + 1;
            var1 = var2;
         } while(var2 < var3);
      }

   }

   public final void C() {
      boa var10 = this.s;
      String var4 = null;
      if (var10 == null) {
         StringBuilder var13 = new StringBuilder();
         var13.append("Cannot detach node that is already detached!  Tree: ");
         bmd var15 = this.n();
         if (var15 != null) {
            var4 = aj(var15);
         }

         var13.append(var4);
         throw new IllegalStateException(var13.toString());
      } else {
         bmr var11 = this.n;
         int var1;
         int var2;
         axf var12;
         if ((var11.a() & 1024) != 0) {
            label101:
            for(bba var5 = var11.d; var5 != null; var5 = var5.s) {
               if ((var5.q & 1024) != 0) {
                  axf var7 = null;
                  bba var8 = var5;

                  while(true) {
                     do {
                        if (var8 == null) {
                           continue label101;
                        }

                        if (var8 instanceof bcd) {
                           bcd var14 = (bcd)var8;
                           var12 = var7;
                           if (var14.c.a()) {
                              bmg.a(this).w.c(true, false);
                              var14.h();
                              var12 = var7;
                           }
                           break;
                        }

                        var12 = var7;
                        if ((var8.q & 1024) == 0) {
                           break;
                        }

                        var12 = var7;
                        if (!(var8 instanceof blh)) {
                           break;
                        }

                        bba var6 = ((blh)var8).A;
                        var2 = 0;

                        for(var12 = var7; var6 != null; var2 = var1) {
                           bba var17 = var8;
                           axf var9 = var12;
                           var1 = var2;
                           if ((var6.q & 1024) != 0) {
                              var1 = var2 + 1;
                              if (var1 == 1) {
                                 var17 = var6;
                                 var9 = var12;
                              } else {
                                 var7 = var12;
                                 if (var12 == null) {
                                    var7 = new axf(new bba[16]);
                                 }

                                 if (var8 != null) {
                                    var7.p(var8);
                                 }

                                 var7.p(var6);
                                 var4 = null;
                                 var9 = var7;
                                 var17 = var4;
                              }
                           }

                           var6 = var6.t;
                           var8 = var17;
                           var12 = var9;
                        }

                        var7 = var12;
                     } while(var2 == 1);

                     var8 = jj.f(var12);
                     var7 = var12;
                  }
               }
            }
         }

         bmd var16 = this.n();
         bmh var18;
         if (var16 != null) {
            var16.G();
            var16.I();
            this.q().w();
            var18 = this.p();
            if (var18 != null) {
               var18.u();
            }
         }

         bml var19 = this.o;
         var19.n.q.h();
         var18 = var19.o;
         if (var18 != null) {
            bkv var20 = var18.n;
            if (var20 != null) {
               var20.h();
            }
         }

         if (this.n.j(8)) {
            this.J();
         }

         this.n.f();
         this.g = true;
         var12 = (axf)this.I.a;
         int var3 = var12.b;
         if (var3 > 0) {
            Object[] var21 = var12.a;
            var1 = 0;

            do {
               ((bmd)var21[var1]).C();
               var2 = var1 + 1;
               var1 = var2;
            } while(var2 < var3);
         }

         this.g = false;
         this.n.c();
         ((blj)var10.y.f).e(this);
         var10.p();
         this.s = null;
         this.ay((bmd)null);
         this.f = 0;
         bmj var22 = this.q();
         var22.h = Integer.MAX_VALUE;
         var22.g = Integer.MAX_VALUE;
         var22.p = false;
         var18 = this.p();
         if (var18 != null) {
            var18.h = Integer.MAX_VALUE;
            var18.g = Integer.MAX_VALUE;
            var18.m = false;
         }

      }
   }

   public final void D(bcw var1) {
      this.s().T(var1);
   }

   public final void E(long var1, blq var3, boolean var4, boolean var5) {
      var1 = this.s().L(var1);
      this.s().X(bmz.l, var1, var3, var4, var5);
   }

   public final void F(int var1, bmd var2) {
      bmd var3 = var2.z;
      String var4 = RbaSbznIXS.jXt;
      StringBuilder var6;
      if (var3 == null) {
         if (var2.s == null) {
            var2.z = this;
            this.I.c(var1, var2);
            this.P();
            if (var2.v) {
               ++this.w;
            }

            this.au();
            boa var8 = this.s;
            if (var8 != null) {
               var2.as(var8);
            }

            if (var2.o.m > 0) {
               bml var7 = this.o;
               var7.g(var7.m + 1);
            }

         } else {
            var6 = new StringBuilder();
            var6.append(var4);
            var6.append(var2);
            var6.append(" because it already has an owner. This tree: ");
            var6.append(aj(this));
            var6.append(" Other tree: ");
            var6.append(aj(var2));
            throw new IllegalStateException(var6.toString());
         }
      } else {
         var6 = new StringBuilder();
         var6.append(var4);
         var6.append(var2);
         var6.append(" because it already has a parent. This tree: ");
         var6.append(aj(this));
         var6.append(" Other tree: ");
         var2 = var2.z;
         String var5;
         if (var2 != null) {
            var5 = aj(var2);
         } else {
            var5 = null;
         }

         var6.append(var5);
         throw new IllegalStateException(var6.toString());
      }
   }

   public final void G() {
      bmz var1;
      if (this.E) {
         var1 = this.r();
         bmz var3 = this.s().p;
         this.D = null;

         while(!c.E(var1, var3)) {
            bnd var2;
            if (var1 != null) {
               var2 = var1.t;
            } else {
               var2 = null;
            }

            if (var2 != null) {
               this.D = var1;
               break;
            }

            if (var1 != null) {
               var1 = var1.p;
            } else {
               var1 = null;
            }
         }
      }

      var1 = this.D;
      if (var1 != null && var1.t == null) {
         throw new IllegalStateException("layer was not set");
      } else if (var1 != null) {
         var1.Y();
      } else {
         bmd var4 = this.n();
         if (var4 != null) {
            var4.G();
         }

      }
   }

   public final void H() {
      bmz var1 = this.s();

      blx var3;
      bnd var4;
      for(bmz var2 = this.r(); var1 != var2; var1 = var3.o) {
         var1.getClass();
         var3 = (blx)var1;
         var4 = var3.t;
         if (var4 != null) {
            var4.invalidate();
         }
      }

      var4 = this.r().t;
      if (var4 != null) {
         var4.invalidate();
      }

   }

   public final void I() {
      if (this.e != null) {
         an(this, false, 3);
      } else {
         ap(this, false, 3);
      }
   }

   public final void J() {
      this.A = null;
      bmg.a(this).m();
   }

   public final void K() {
      if (this.r == 3) {
         this.B();
      }

      bmh var1 = this.p();
      var1.getClass();

      try {
         var1.f = true;
         if (!var1.j) {
            IllegalStateException var2 = new IllegalStateException("replace() called on item that was not placed");
            throw var2;
         }

         var1.r(var1.l, (qvt)null);
      } finally {
         var1.f = false;
      }

   }

   public final void L() {
      this.o.d();
   }

   public final void M() {
      this.o.f = true;
   }

   public final void N() {
      this.o.f();
   }

   public final void O(int var1, int var2, int var3) {
      if (var1 != var2) {
         for(int var4 = 0; var4 < var3; ++var4) {
            int var5;
            if (var1 > var2) {
               var5 = var1 + var4;
            } else {
               var5 = var1;
            }

            int var6;
            if (var1 > var2) {
               var6 = var2 + var4;
            } else {
               var6 = var2 + var3 - 2;
            }

            bmd var7 = (bmd)this.I.b(var5);
            this.I.c(var6, var7);
         }

         this.P();
         this.au();
         this.I();
      }

   }

   public final void P() {
      if (this.v) {
         bmd var1 = this.n();
         if (var1 != null) {
            var1.P();
         }

      } else {
         this.C = true;
      }
   }

   public final void Q() {
      for(int var1 = ((axf)this.I.a).b - 1; var1 >= 0; --var1) {
         this.av((bmd)((axf)this.I.a).a[var1]);
      }

      bpe var2 = this.I;
      ((axf)var2.a).g();
      ((qvi)var2.b).a();
   }

   public final void R(int var1, int var2) {
      if (var2 < 0) {
         IllegalArgumentException var3 = new IllegalArgumentException(c.aK(var2, "count (", ") must be greater than 0"));
         throw var3;
      } else {
         var2 = var2 + var1 - 1;
         if (var1 <= var2) {
            while(true) {
               this.av((bmd)this.I.b(var2));
               if (var2 == var1) {
                  break;
               }

               --var2;
            }
         }

      }
   }

   public final void S() {
      if (this.r == 3) {
         this.B();
      }

      bmj var1 = this.q();

      try {
         var1.f = true;
         if (!var1.j) {
            IllegalStateException var2 = new IllegalStateException("replace called on unplaced item");
            throw var2;
         }

         var1.v(var1.l, var1.m);
      } finally {
         var1.f = false;
      }

   }

   public final void T(boolean var1) {
      if (!this.v) {
         boa var2 = this.s;
         if (var2 != null) {
            var2.l(this, true, var1);
         }
      }

   }

   public final void U(boolean var1) {
      if (!this.v) {
         boa var2 = this.s;
         if (var2 != null) {
            var2.l(this, false, var1);
         }
      }

   }

   public final void V(bmd var1) {
      var1.getClass();
      int var2 = var1.ag();
      int[] var3 = bmb.a;
      if (var2 != 0) {
         if (var3[var2 - 1] == 1) {
            if (var1.ac()) {
               ap(var1, true, 2);
            } else if (var1.Z()) {
               var1.U(true);
            } else if (var1.ab()) {
               an(var1, true, 2);
            } else if (var1.aa()) {
               var1.T(true);
            }
         } else {
            StringBuilder var4 = new StringBuilder();
            var4.append("Unexpected state ");
            var2 = var1.ag();
            var4.append(jl.k(var2));
            throw new IllegalStateException("Unexpected state ".concat(jl.k(var2)));
         }
      } else {
         throw null;
      }
   }

   public final void W() {
      axf var4 = this.m();
      int var3 = var4.b;
      if (var3 > 0) {
         Object[] var5 = var4.a;
         int var1 = 0;

         int var2;
         do {
            bmd var6 = (bmd)var5[var1];
            var2 = var6.H;
            var6.r = var2;
            if (var2 != 3) {
               var6.W();
            }

            var2 = var1 + 1;
            var1 = var2;
         } while(var2 < var3);
      }

   }

   public final void X(bxr var1) {
      var1.getClass();
      if (!c.E(this.i, var1)) {
         this.i = var1;
         this.aw();
         bmr var9 = this.n;
         if ((var9.a() & 16) != 0) {
            for(bba var4 = var9.e; var4 != null; var4 = var4.t) {
               if ((var4.q & 16) != 0) {
                  bba var7 = var4;
                  axf var6 = null;

                  label64:
                  while(true) {
                     int var2;
                     axf var10;
                     do {
                        if (var7 == null) {
                           break label64;
                        }

                        if (var7 instanceof bni) {
                           ((bni)var7).ez();
                           var10 = var6;
                           break;
                        }

                        var10 = var6;
                        if ((var7.q & 16) == 0) {
                           break;
                        }

                        var10 = var6;
                        if (!(var7 instanceof blh)) {
                           break;
                        }

                        bba var5 = ((blh)var7).A;
                        var2 = 0;

                        int var3;
                        for(var10 = var6; var5 != null; var2 = var3) {
                           bba var11 = var7;
                           axf var8 = var10;
                           var3 = var2;
                           if ((var5.q & 16) != 0) {
                              var3 = var2 + 1;
                              if (var3 == 1) {
                                 var11 = var5;
                                 var8 = var10;
                              } else {
                                 var6 = var10;
                                 if (var10 == null) {
                                    var6 = new axf(new bba[16]);
                                 }

                                 if (var7 != null) {
                                    var6.p(var7);
                                 }

                                 var6.p(var5);
                                 var1 = null;
                                 var8 = var6;
                                 var11 = var1;
                              }
                           }

                           var5 = var5.t;
                           var7 = var11;
                           var10 = var8;
                        }

                        var6 = var10;
                     } while(var2 == 1);

                     var7 = jj.f(var10);
                     var6 = var10;
                  }
               }

               if ((var4.r & 16) == 0) {
                  break;
               }
            }
         }
      }

   }

   public final void Y() {
      if (this.w > 0 && this.y) {
         int var1 = 0;
         this.y = false;
         axf var5 = this.x;
         axf var4 = var5;
         if (var5 == null) {
            var4 = new axf(new bmd[16]);
            this.x = var4;
         }

         var4.g();
         var5 = (axf)this.I.a;
         int var3 = var5.b;
         if (var3 > 0) {
            Object[] var7 = var5.a;

            int var2;
            do {
               bmd var6 = (bmd)var7[var1];
               if (var6.v) {
                  axf var8 = var6.m();
                  var4.q(var4.b, var8);
               } else {
                  var4.p(var6);
               }

               var2 = var1 + 1;
               var1 = var2;
            } while(var2 < var3);
         }

         this.o.c();
      }

   }

   public final boolean Z() {
      return this.o.d;
   }

   public final void a() {
      this.G = true;
      this.ax();
   }

   public final boolean aa() {
      return this.o.g;
   }

   public final boolean ab() {
      return this.o.f;
   }

   public final boolean ac() {
      return this.o.c;
   }

   public final boolean ad() {
      return this.s != null;
   }

   public final boolean ae(bxq var1) {
      if (var1 != null && this.e != null) {
         bmh var2 = this.p();
         var2.getClass();
         return var2.t(var1.b);
      } else {
         return false;
      }
   }

   public final boolean af(bxq var1) {
      boolean var2;
      if (var1 != null) {
         if (this.r == 3) {
            this.A();
         }

         var2 = this.q().u(var1.b);
      } else {
         var2 = false;
      }

      return var2;
   }

   public final int ag() {
      return this.o.p;
   }

   public final int ah() {
      return this.q().v;
   }

   public final int ai() {
      bmh var2 = this.p();
      if (var2 != null) {
         int var1 = var2.u;
         if (var1 != 0) {
            return var1;
         }
      }

      return 3;
   }

   public final void ak(long var1, blq var3, boolean var4) {
      var1 = this.s().L(var1);
      this.s().X(bmz.m, var1, var3, true, var4);
   }

   public final void aq() {
      this.E = true;
   }

   public final void ar() {
      float var1 = this.q().t;
   }

   public final void as(boa var1) {
      if (this.s == null) {
         bmd var7 = this.z;
         bmd var6 = null;
         bmh var5 = null;
         if (var7 != null && !c.E(var7.s, var1)) {
            StringBuilder var21 = new StringBuilder();
            var21.append("Attaching to a different owner(");
            var21.append(var1);
            var21.append(") than the parent's owner(");
            bmd var13 = this.n();
            if (var13 != null) {
               var1 = var13.s;
            } else {
               var1 = null;
            }

            var21.append(var1);
            var21.append("). This tree: ");
            var21.append(aj(this));
            var21.append(" Parent tree: ");
            var13 = this.z;
            String var17;
            if (var13 != null) {
               var17 = aj(var13);
            } else {
               var17 = var5;
            }

            var21.append(var17);
            throw new IllegalStateException(var21.toString());
         } else {
            var7 = this.n();
            if (var7 == null) {
               this.q().p = true;
               var5 = this.p();
               if (var5 != null) {
                  var5.m = true;
               }
            }

            bmz var8 = this.s();
            bmz var18;
            if (var7 != null) {
               var18 = var7.r();
            } else {
               var18 = var6;
            }

            var8.p = var18;
            this.s = var1;
            int var2;
            if (var7 != null) {
               var2 = var7.f;
            } else {
               var2 = -1;
            }

            this.f = var2 + 1;
            if (this.n.j(8)) {
               this.J();
            }

            bmd var19;
            label105: {
               var19 = this.z;
               if (var19 != null) {
                  var6 = var19.e;
                  var19 = var6;
                  if (var6 != null) {
                     break label105;
                  }
               }

               var19 = this.e;
            }

            this.ay(var19);
            this.n.b();
            axf var22 = (axf)this.I.a;
            int var4 = var22.b;
            if (var4 > 0) {
               Object[] var23 = var22.a;
               var2 = 0;

               int var3;
               do {
                  ((bmd)var23[var2]).as(var1);
                  var3 = var2 + 1;
                  var2 = var3;
               } while(var3 < var4);
            }

            this.n.e();
            this.I();
            if (var7 != null) {
               var7.I();
            }

            bmz var11 = this.s();

            for(var18 = this.r().o; !c.E(var11, var18) && var11 != null; var11 = var11.o) {
               var11.ah(var11.q, true);
               bnd var20 = var11.t;
               if (var20 != null) {
                  var20.invalidate();
               }
            }

            this.o.j();
            if ((this.n.a() & 7168) != 0) {
               for(bba var12 = this.n.e; var12 != null; var12 = var12.t) {
                  var4 = var12.q;
                  boolean var15;
                  if ((var4 & 1024) != 0) {
                     var15 = true;
                  } else {
                     var15 = false;
                  }

                  boolean var14;
                  if ((var4 & 2048) != 0) {
                     var14 = true;
                  } else {
                     var14 = false;
                  }

                  boolean var16;
                  if ((var4 & 4096) != 0) {
                     var16 = true;
                  } else {
                     var16 = false;
                  }

                  if (var16 | var15 | var14) {
                     jm.j(var12);
                  }
               }
            }

         }
      } else {
         StringBuilder var9 = new StringBuilder();
         var9.append("Cannot attach ");
         var9.append(this);
         var9.append(" as it already is attached.  Tree: ");
         var9.append(aj(this));
         IllegalStateException var10 = new IllegalStateException(var9.toString());
         throw var10;
      }
   }

   public final void b() {
      bmz var1 = this.s();

      for(bmz var2 = this.r().o; !c.E(var1, var2) && var1 != null; var1 = var1.o) {
         var1.ad();
      }

   }

   public final void c() {
      if (this.G) {
         this.G = false;
      } else {
         this.ax();
      }

      this.d = brm.a();
      this.n.b();
      this.n.e();
   }

   public final boolean d() {
      return this.q().p;
   }

   public final void e() {
      if (this.e != null) {
         an(this, false, 1);
      } else {
         ap(this, false, 1);
      }

      bxq var1 = this.o.b();
      if (var1 != null) {
         boa var2 = this.s;
         if (var2 != null) {
            var2.g(this, var1.b);
            return;
         }
      } else {
         boa var3 = this.s;
         if (var3 != null) {
            kd.i(var3);
            return;
         }
      }

   }

   public final void eN() {
      bmz var5 = this.r();
      boolean var3 = jm.m(128);
      Object var9 = ((bls)var5).f;
      bba var4;
      if (!var3) {
         var4 = ((bba)var9).s;
         var9 = var4;
         if (var4 == null) {
            return;
         }
      }

      for(bba var12 = var5.P(var3); var12 != null && (var12.r & 128) != 0; var12 = var12.t) {
         if ((var12.q & 128) != 0) {
            bba var8 = var12;
            axf var7 = null;

            label69:
            while(true) {
               int var2;
               axf var11;
               do {
                  if (var8 == null) {
                     break label69;
                  }

                  if (var8 instanceof blu) {
                     ((blu)var8).g(this.r());
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
                  var2 = 0;

                  int var1;
                  for(var11 = var7; var6 != null; var2 = var1) {
                     bba var13 = var8;
                     axf var10 = var11;
                     var1 = var2;
                     if ((var6.q & 128) != 0) {
                        var1 = var2 + 1;
                        if (var1 == 1) {
                           var13 = var6;
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
                           var13 = var4;
                        }
                     }

                     var6 = var6.t;
                     var8 = var13;
                     var11 = var10;
                  }

                  var7 = var11;
               } while(var2 == 1);

               var8 = jj.f(var11);
               var7 = var11;
            }
         }

         if (var12 == var9) {
            break;
         }
      }

   }

   public final void f(ata var1) {
      this.l = var1;
      this.X((bxr)var1.a(bpi.b));
      bxy var4 = (bxy)var1.a(bpi.e);
      var4.getClass();
      if (this.j != var4) {
         this.j = var4;
         this.aw();
      }

      bqa var9 = (bqa)var1.a(bpi.f);
      var9.getClass();
      int var2;
      int var3;
      bba var5;
      axf var6;
      bba var7;
      axf var8;
      bmr var10;
      axf var11;
      bba var12;
      bba var14;
      if (!c.E(this.k, var9)) {
         this.k = var9;
         var10 = this.n;
         if ((var10.a() & 16) != 0) {
            for(var12 = var10.e; var12 != null; var12 = var12.t) {
               if ((var12.q & 16) != 0) {
                  var7 = var12;
                  var6 = null;

                  label135:
                  while(true) {
                     do {
                        if (var7 == null) {
                           break label135;
                        }

                        if (var7 instanceof bni) {
                           ((bni)var7).eB();
                           var11 = var6;
                           break;
                        }

                        var11 = var6;
                        if ((var7.q & 16) == 0) {
                           break;
                        }

                        var11 = var6;
                        if (!(var7 instanceof blh)) {
                           break;
                        }

                        var5 = ((blh)var7).A;
                        var2 = 0;

                        for(var11 = var6; var5 != null; var2 = var3) {
                           var14 = var7;
                           var8 = var11;
                           var3 = var2;
                           if ((var5.q & 16) != 0) {
                              var3 = var2 + 1;
                              if (var3 == 1) {
                                 var14 = var5;
                                 var8 = var11;
                              } else {
                                 var6 = var11;
                                 if (var11 == null) {
                                    var6 = new axf(new bba[16]);
                                 }

                                 if (var7 != null) {
                                    var6.p(var7);
                                 }

                                 var6.p(var5);
                                 var1 = null;
                                 var8 = var6;
                                 var14 = var1;
                              }
                           }

                           var5 = var5.t;
                           var7 = var14;
                           var11 = var8;
                        }

                        var6 = var11;
                     } while(var2 == 1);

                     var7 = jj.f(var11);
                     var6 = var11;
                  }
               }

               if ((var12.r & 16) == 0) {
                  break;
               }
            }
         }
      }

      var10 = this.n;
      if ((var10.a() & '耀') != 0) {
         for(var12 = var10.e; var12 != null; var12 = var12.t) {
            if ((var12.q & '耀') != 0) {
               var7 = var12;
               var6 = null;

               label102:
               while(true) {
                  do {
                     if (var7 == null) {
                        break label102;
                     }

                     if (var7 instanceof blf) {
                        bba var13 = ((blf)var7).n();
                        if (var13.y) {
                           jm.l(var13);
                           var11 = var6;
                        } else {
                           var13.x = true;
                           var11 = var6;
                        }
                        break;
                     }

                     var11 = var6;
                     if ((var7.q & '耀') == 0) {
                        break;
                     }

                     var11 = var6;
                     if (!(var7 instanceof blh)) {
                        break;
                     }

                     var5 = ((blh)var7).A;
                     var3 = 0;

                     for(var11 = var6; var5 != null; var3 = var2) {
                        var14 = var7;
                        var8 = var11;
                        var2 = var3;
                        if ((var5.q & '耀') != 0) {
                           var2 = var3 + 1;
                           if (var2 == 1) {
                              var14 = var5;
                              var8 = var11;
                           } else {
                              var6 = var11;
                              if (var11 == null) {
                                 var6 = new axf(new bba[16]);
                              }

                              if (var7 != null) {
                                 var6.p(var7);
                              }

                              var6.p(var5);
                              var1 = null;
                              var8 = var6;
                              var14 = var1;
                           }
                        }

                        var5 = var5.t;
                        var7 = var14;
                        var11 = var8;
                     }

                     var6 = var11;
                  } while(var3 == 1);

                  var7 = jj.f(var11);
                  var6 = var11;
               }
            }

            if ((var12.r & '耀') == 0) {
               break;
            }
         }
      }

   }

   public final void g(bjt var1) {
      if (!c.E(this.h, var1)) {
         this.h = var1;
         lmk var2 = this.J;
         var1.getClass();
         ((att)var2.a).b(var1);
         this.I();
      }

   }

   public final void h(bbb var1) {
      if (this.v && this.F != bbb.d) {
         throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes");
      } else {
         this.F = var1;
         bmr var10 = this.n;
         if (var10.e == bmt.a) {
            IllegalStateException var24 = new IllegalStateException("padChain called on already padded chain");
            throw var24;
         } else {
            bba var6 = var10.e;
            bms var9 = bmt.a;
            var6.s = var9;
            var9.t = var6;
            axf var19 = var10.f;
            boolean var4 = false;
            byte var3 = 0;
            int var2;
            if (var19 != null) {
               var2 = var19.b;
            } else {
               var2 = 0;
            }

            axf var7 = var10.g;
            if (var7 == null) {
               var7 = new axf(new baz[16]);
            }

            axf var8 = new axf(new bbb[qxb.k(var7.b, 16)]);
            var8.p(var1);
            bkh var12 = null;

            while(var8.n()) {
               bbb var11 = (bbb)var8.c(var8.b - 1);
               if (var11 instanceof bav) {
                  bav var26 = (bav)var11;
                  var8.p(var26.b);
                  var8.p(var26.a);
               } else if (var11 instanceof baz) {
                  var7.p(var11);
               } else {
                  if (var12 == null) {
                     var12 = new bkh(var7, 5);
                  }

                  var11.i(var12);
               }
            }

            int var5 = var7.b;
            bba var13;
            boolean var14;
            axf var15;
            if (var5 == var2) {
               var13 = var9.t;
               int var16 = 0;

               bba var22;
               label123:
               while(true) {
                  var22 = var13;
                  if (var13 == null) {
                     break;
                  }

                  var22 = var13;
                  if (var16 >= var2) {
                     break;
                  }

                  if (var19 == null) {
                     throw new IllegalStateException("expected prior modifier list to be non-empty");
                  }

                  baz var23 = (baz)var19.a[var16];
                  baz var27 = (baz)var7.a[var16];
                  switch(bmt.a(var23, var27)) {
                  case 0:
                     var22 = var13.s;
                     break label123;
                  case 1:
                     bmr.m(var23, var27, var13);
                  default:
                     var13 = var13.t;
                     ++var16;
                  }
               }

               if (var16 < var2) {
                  if (var19 == null) {
                     throw new IllegalStateException("expected prior modifier list to be non-empty");
                  }

                  if (var22 == null) {
                     throw new IllegalStateException("structuralUpdate requires a non-null tail");
                  }

                  var10.g(var16, var19, var7, var22, var10.a.ad());
                  var14 = true;
                  var15 = var19;
               } else {
                  var14 = var4;
                  var15 = var19;
               }
            } else if (!var10.a.ad() && var2 == 0) {
               Object var20 = var9;

               for(var2 = var3; var2 < var7.b; ++var2) {
                  var20 = bmr.k((baz)var7.a[var2], (bba)var20);
               }

               var10.h();
               var14 = true;
               var15 = var19;
            } else if (var5 == 0) {
               if (var19 == null) {
                  throw new IllegalStateException("expected prior modifier list to be non-empty");
               }

               var13 = var9.t;

               for(var2 = 0; var13 != null && var2 < var19.b; ++var2) {
                  var13 = bmr.l(var13).t;
               }

               bls var25 = var10.b;
               bmd var17 = var10.a.n();
               bmz var18;
               if (var17 != null) {
                  var18 = var17.r();
               } else {
                  var18 = null;
               }

               var25.p = var18;
               var10.c = var10.b;
               var14 = var4;
               var15 = var19;
            } else {
               if (var19 == null) {
                  var15 = new axf(new baz[16]);
               } else {
                  var15 = var19;
               }

               var10.g(0, var15, var7, var9, var10.a.ad());
               var14 = true;
            }

            var10.f = var7;
            if (var15 != null) {
               var15.g();
            } else {
               var15 = null;
            }

            var10.g = var15;
            bms var21 = bmt.a;
            if (var9 == var21) {
               var6 = var21.t;
               var13 = var6;
               if (var6 == null) {
                  var13 = var10.d;
               }

               var13.s = null;
               var21.t = null;
               var21.r = -1;
               var21.v = null;
               if (var13 != var21) {
                  var10.e = var13;
                  if (var14) {
                     var10.i();
                  }

                  this.o.j();
                  if (this.n.j(512) && this.e == null) {
                     this.ay(this);
                  }

               } else {
                  throw new IllegalStateException("trimChain did not update the head");
               }
            } else {
               throw new IllegalStateException("trimChain called on already trimmed chain");
            }
         }
      }
   }

   public final int i() {
      return this.o.n.b;
   }

   public final int j() {
      return this.q().h;
   }

   public final int k() {
      return this.o.n.a;
   }

   public final axf l() {
      if (this.C) {
         this.B.g();
         axf var1 = this.B;
         axf var2 = this.m();
         var1.q(var1.b, var2);
         this.B.j(c);
         this.C = false;
      }

      return this.B;
   }

   public final axf m() {
      this.Y();
      Object var1;
      if (this.w == 0) {
         var1 = this.I.a;
      } else {
         var1 = this.x;
         var1.getClass();
      }

      return (axf)var1;
   }

   public final bmd n() {
      bmd var1;
      for(var1 = this.z; var1 != null && var1.v; var1 = var1.z) {
      }

      return var1;
   }

   public final bmf o() {
      return bmg.a(this).c;
   }

   public final bmh p() {
      return this.o.o;
   }

   public final bmj q() {
      return this.o.n;
   }

   public final bmz r() {
      return this.n.b;
   }

   public final bmz s() {
      return this.n.c;
   }

   public final brl t() {
      if (this.n.j(8) && this.A == null) {
         qwz var1 = new qwz();
         var1.a = new brl();
         bng var2 = bmg.a(this).j;
         us var3 = new us(this, var1, 9, (byte[])null);
         var2.d(this, (qvt)var2.d, var3);
         brl var4 = (brl)var1.a;
         this.A = var4;
         return var4;
      } else {
         return this.A;
      }
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(bof.c(this));
      var1.append(" children: ");
      var1.append(this.y().size());
      var1.append(" measurePolicy: ");
      var1.append(this.h);
      return var1.toString();
   }

   public final Boolean u() {
      bmh var1 = this.p();
      return var1 != null ? var1.m : null;
   }

   public final List v() {
      bmh var5 = this.p();
      var5.getClass();
      var5.t.a.y();
      List var4;
      if (!var5.p) {
         var4 = var5.o.e();
      } else {
         bmd var6 = var5.t.a;
         axf var9 = var5.o;
         axf var7 = var6.m();
         int var3 = var7.b;
         if (var3 > 0) {
            Object[] var10 = var7.a;
            int var1 = 0;

            int var2;
            do {
               bmd var8 = (bmd)var10[var1];
               bmh var11;
               if (var9.b <= var1) {
                  var11 = var8.o.o;
                  var11.getClass();
                  var9.p(var11);
               } else {
                  var11 = var8.o.o;
                  var11.getClass();
                  var9.d(var1, var11);
               }

               var2 = var1 + 1;
               var1 = var2;
            } while(var2 < var3);
         }

         var9.i(var6.y().size(), var9.b);
         var5.p = false;
         var4 = var5.o.e();
      }

      return var4;
   }

   public final boolean w() {
      return this.ad();
   }

   public final List x() {
      return this.q().j();
   }

   public final List y() {
      return this.m().e();
   }

   public final List z() {
      return ((axf)this.I.a).e();
   }
}
