import android.os.Trace;
import android.support.constraint.Pv.bmSypa;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public final class asq implements asm {
   private int A;
   private int B;
   private HashMap C;
   private boolean D;
   private aue E;
   private boolean F;
   private int G;
   private int H;
   private final bab I;
   private final jjc J;
   private final jjc K;
   private final jjc L;
   private nxj M;
   private blj N;
   private final dmw O;
   public final asf a;
   public final ast b;
   public final aut c;
   public int[] d;
   public boolean e;
   public final List f;
   public boolean g;
   public int h;
   public boolean i;
   public aus j;
   public aut k;
   public auw l;
   public boolean m;
   public aue n;
   public final avn o;
   public boolean p;
   public int q;
   public final asw r;
   public final jjc s;
   public final dmx t;
   public final dmx u;
   public final dmw v;
   public dmx w;
   public final lmk x;
   private final Set y;
   private aud z;

   public asq(asf var1, ast var2, aut var3, Set var4, dmx var5, dmx var6, asw var7) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.y = var4;
      this.t = var5;
      this.u = var6;
      this.r = var7;
      this.O = new dmw((byte[])null, (byte[])null, (byte[])null, (byte[])null);
      this.J = new jjc((byte[])null, (byte[])null);
      this.K = new jjc((byte[])null, (byte[])null);
      this.f = new ArrayList();
      this.L = new jjc((byte[])null, (byte[])null);
      this.E = ayv.c;
      this.x = new lmk((byte[])null, (short[])null);
      this.s = new jjc((byte[])null, (byte[])null);
      this.G = -1;
      this.I = new bab(this, 1);
      this.v = new dmw((byte[])null, (byte[])null, (byte[])null, (byte[])null);
      aus var10 = var3.a();
      var10.q();
      this.j = var10;
      aut var11 = new aut();
      this.k = var11;
      auw var12 = var11.b();
      var12.s();
      this.l = var12;
      this.o = new avn(this, var5);
      var10 = this.k.a();

      nxj var13;
      try {
         var13 = var10.x(0);
      } finally {
         var10.q();
      }

      this.M = var13;
      this.N = new blj((byte[])null, (byte[])null);
   }

   // $FF: synthetic method
   public static final void aa(asq var0, ats var1, aue var2, Object var3) {
      var0.s(126665345, var1);
      var0.B(var3);
      int var4 = var0.q;

      label313: {
         Throwable var10000;
         label317: {
            boolean var10001;
            try {
               var0.q = 126665345;
               if (var0.p) {
                  auw.Q(var0.l);
               }
            } catch (Throwable var36) {
               var10000 = var36;
               var10001 = false;
               break label317;
            }

            boolean var5;
            label308: {
               label318: {
                  try {
                     if (var0.p) {
                        break label318;
                     }
                  } catch (Throwable var35) {
                     var10000 = var35;
                     var10001 = false;
                     break label317;
                  }

                  label301: {
                     try {
                        if (!c.E(var0.j.g(), var2)) {
                           break label301;
                        }
                     } catch (Throwable var34) {
                        var10000 = var34;
                        var10001 = false;
                        break label317;
                     }

                     var5 = false;
                     break label308;
                  }

                  var5 = true;
                  break label308;
               }

               var5 = false;
            }

            if (var5) {
               try {
                  var0.x.az(var0.j.f, var2);
               } catch (Throwable var33) {
                  var10000 = var33;
                  var10001 = false;
                  break label317;
               }
            }

            label291:
            try {
               var0.V(202, asr.c, 0, var2);
               boolean var6 = var0.g;
               var0.g = var5;
               ajt var38 = new ajt(11);
               lh.f(var0, sr.r(316014703, true, var38));
               var0.g = var6;
               break label313;
            } catch (Throwable var32) {
               var10000 = var32;
               var10001 = false;
               break label291;
            }
         }

         Throwable var37 = var10000;
         var0.S();
         var0.q = var4;
         var0.S();
         throw var37;
      }

      var0.S();
      var0.q = var4;
      var0.S();
   }

   private final int ad(int var1, int var2, int var3) {
      int var4 = var3;
      if (var1 != var2) {
         aus var5 = this.j;
         Object var6;
         if (pu.v(var5.b, var1)) {
            var6 = var5.l(var1);
            if (var6 != null) {
               if (var6 instanceof Enum) {
                  var4 = ((Enum)var6).ordinal();
               } else if (var6 instanceof ats) {
                  var4 = 126665345;
               } else {
                  var4 = var6.hashCode();
               }
            } else {
               var4 = 0;
            }
         } else {
            var4 = var5.b(var1);
            if (var4 == 207) {
               var6 = var5.i(var1);
               if (var6 != null) {
                  if (c.E(var6, asl.a)) {
                     var4 = 207;
                  } else {
                     var4 = var6.hashCode();
                  }
               } else {
                  var4 = 207;
               }
            }
         }

         if (var4 != 126665345) {
            var4 ^= Integer.rotateLeft(this.ad(this.j.e(var1), var2, var3), 3);
         }
      }

      return var4;
   }

   private static final int ae(asq var0, int var1, boolean var2, int var3) {
      Throwable var10000;
      aus var52;
      label946: {
         boolean var9 = pu.u(var0.j.b, var1);
         byte var7 = 1;
         byte var6 = 0;
         int var5 = 0;
         int var4;
         int var39;
         if (!var9) {
            if (pu.s(var0.j.b, var1)) {
               int var40 = var0.j.c(var1);
               var5 = var1 + 1;

               for(var4 = 0; var5 < var40 + var1; var5 += var0.j.c(var5)) {
                  boolean var10 = var0.j.w(var5);
                  if (var10) {
                     var0.o.i();
                     var0.o.d(var0.j.n(var5));
                  }

                  if (!var10) {
                     if (var2) {
                        var9 = true;
                     } else {
                        var9 = false;
                     }
                  } else {
                     var9 = true;
                  }

                  if (var10) {
                     var39 = 0;
                  } else {
                     var39 = var3 + var4;
                  }

                  var4 += ae(var0, var5, var9, var39);
                  if (var10) {
                     var0.o.i();
                     var0.o.f();
                  }
               }

               var1 = var4;
            } else {
               var1 = var0.j.d(var1);
            }
         } else {
            var4 = var0.j.b(var1);
            Object var11 = var0.j.l(var1);
            if (var4 == 126665345) {
               if (var11 instanceof ats) {
                  ats var13 = (ats)var11;
                  var11 = var0.j.k(var1, 0);
                  nxj var12 = var0.j.x(var1);
                  int var8 = var0.j.c(var1);
                  List var16 = var0.f;
                  ArrayList var14 = new ArrayList();

                  atl var15;
                  for(var4 = asr.c(var16, var1); var4 < var16.size(); ++var4) {
                     var15 = (atl)var16.get(var4);
                     if (var15.a >= var8 + var1) {
                        break;
                     }

                     var14.add(var15);
                  }

                  ArrayList var57 = new ArrayList(var14.size());
                  var8 = var14.size();

                  for(var4 = 0; var4 < var8; ++var4) {
                     var15 = (atl)var14.get(var4);
                     var57.add(pwm.bq(var15.b, var15.c));
                  }

                  ezu var55 = new ezu(var13, var11, var0.r, var0.c, var12, var57, var0.af(var1));
                  var0.b.n(var55);
                  var0.o.k();
                  avn var41 = var0.o;
                  asw var47 = var0.r;
                  ast var53 = var0.b;
                  Object var43 = var41.h.a;
                  awi var42 = awi.a;
                  awy var45 = (awy)var43;
                  var45.d(var42);
                  awx.b(var45, 0, var47);
                  awx.b(var45, 1, var53);
                  awx.b(var45, 2, var55);
                  if (var45.g != awy.h(var42.b) || var45.h != awy.h(var42.c)) {
                     StringBuilder var36 = new StringBuilder();
                     var39 = var42.b;
                     var3 = 0;

                     for(var1 = 0; var3 < var39; var1 = var4) {
                        var4 = var1;
                        if ((1 << var3 & var45.g) != 0) {
                           if (var1 > 0) {
                              var36.append(", ");
                           }

                           var36.append(var42.a(var3));
                           var4 = var1 + 1;
                        }

                        ++var3;
                     }

                     String var37 = var36.toString();
                     StringBuilder var50 = new StringBuilder();
                     var39 = var42.c;

                     for(var3 = 0; var5 < var39; var3 = var4) {
                        var4 = var3;
                        if ((1 << var5 & var45.h) != 0) {
                           if (var1 > 0) {
                              var50.append(", ");
                           }

                           var50.append(var42.c(var5));
                           var4 = var3 + 1;
                        }

                        ++var5;
                     }

                     String var46 = var50.toString();
                     throw new IllegalStateException(nx.c(new StringBuilder(), var46, var3, var37, var1, var42));
                  }

                  if (var2) {
                     avn var35 = var0.o;
                     var35.i();
                     var35.g();
                     if (var35.a().w(var1)) {
                        var1 = var7;
                     } else {
                        var1 = var35.a().d(var1);
                     }

                     if (var1 > 0) {
                        var35.l(var3, var1);
                        return 0;
                     }

                     var1 = var6;
                  } else {
                     var1 = var0.j.d(var1);
                  }

                  return var1;
               }
            } else if (var4 == 206 && c.E(var11, asr.f)) {
               var11 = var0.j.k(var1, 0);
               asn var44;
               if (var11 instanceof asn) {
                  var44 = (asn)var11;
               } else {
                  var44 = null;
               }

               if (var44 != null) {
                  Iterator var51 = var44.a.a.iterator();

                  label919:
                  while(true) {
                     aut var49;
                     asq var56;
                     do {
                        do {
                           if (!var51.hasNext()) {
                              break label919;
                           }

                           var56 = (asq)var51.next();
                           var49 = var56.c;
                        } while(var49.b <= 0);
                     } while(!pu.s(var49.a, 0));

                     dmx var59 = new dmx((byte[])null, (byte[])null, (char[])null);
                     var56.w = var59;
                     var52 = var56.c.a();

                     boolean var10001;
                     avn var48;
                     dmx var54;
                     try {
                        var56.j = var52;
                        var48 = var56.o;
                        var54 = var48.h;
                     } catch (Throwable var33) {
                        var10000 = var33;
                        var10001 = false;
                        break label946;
                     }

                     try {
                        var48.p(var59);
                        var56.am(0);
                        avn var58 = var56.o;
                        var58.g();
                        if (var58.a) {
                           var58.m();
                           var58.c();
                        }
                     } finally {
                        try {
                           var48.p(var54);
                        } catch (Throwable var32) {
                           var10000 = var32;
                           var10001 = false;
                           break label946;
                        }
                     }

                     var52.q();
                  }
               }

               var1 = var0.j.d(var1);
               return var1;
            }

            var1 = var0.j.d(var1);
         }

         return var1;
      }

      Throwable var38 = var10000;
      var52.q();
      throw var38;
   }

   private final aue af(int var1) {
      Object var3;
      aue var4;
      if (this.p && this.m) {
         for(int var2 = this.l.p; var2 > 0; var2 = this.l.j(var2)) {
            if (this.l.g(var2) == 202 && c.E(this.l.m(var2), asr.c)) {
               var3 = this.l.l(var2);
               var3.getClass();
               var4 = (aue)var3;
               this.n = var4;
               return var4;
            }
         }
      }

      if (this.j.c > 0) {
         while(var1 > 0) {
            if (this.j.b(var1) == 202 && c.E(this.j.l(var1), asr.c)) {
               var4 = (aue)((SparseArray)this.x.a).get(var1);
               if (var4 == null) {
                  var3 = this.j.i(var1);
                  var3.getClass();
                  var4 = (aue)var3;
               }

               this.n = var4;
               return var4;
            }

            var1 = this.j.e(var1);
         }
      }

      var4 = this.E;
      this.n = var4;
      return var4;
   }

   private final void ag(int var1, int var2) {
      if (var1 > 0 && var1 != var2) {
         this.ag(this.j.e(var1), var2);
         if (this.j.w(var1)) {
            this.o.d(this.j.n(var1));
         }
      }

   }

   private final void ah(boolean var1) {
      int var2;
      auw var14;
      aus var23;
      if (this.p) {
         var14 = this.l;
         var2 = var14.p;
         this.as(var14.g(var2), this.l.m(var2), this.l.l(var2));
      } else {
         var23 = this.j;
         var2 = var23.h;
         this.as(var23.b(var2), this.j.l(var2), this.j.i(var2));
      }

      int var3 = this.B;
      aud var17 = this.z;
      int var4;
      int var5;
      int var6;
      if (var17 != null) {
         if (var17.a.size() > 0) {
            List var18 = var17.a;
            List var16 = var17.d;
            HashSet var24 = new HashSet(var16.size());
            var4 = var16.size();

            for(var2 = 0; var2 < var4; ++var2) {
               var24.add(var16.get(var2));
            }

            LinkedHashSet var15 = new LinkedHashSet();
            int var7 = var16.size();
            var6 = var18.size();
            var2 = 0;
            var5 = 0;
            var4 = 0;

            while(true) {
               while(var2 < var6) {
                  ora var20 = (ora)var18.get(var2);
                  int var8;
                  if (!var24.contains(var20)) {
                     var8 = var17.b(var20);
                     this.o.l(var8 + var17.b, var20.a);
                     var17.a(var20.c, 0);
                     this.o.e(var20.c);
                     this.j.s(var20.c);
                     this.ak();
                     this.j.f();
                     List var50 = this.f;
                     var8 = var20.c;
                     asr.h(var50, var8, this.j.c(var8) + var8);
                     ++var2;
                  } else if (var15.contains(var20)) {
                     ++var2;
                  } else if (var5 < var7) {
                     ora var19 = (ora)var16.get(var5);
                     if (var19 != var20) {
                        int var10 = var17.b(var19);
                        var15.add(var19);
                        if (var10 != var4) {
                           int var9 = var17.c(var19);
                           avn var51 = this.o;
                           int var11 = var17.b;
                           var8 = var10 + var11;
                           var11 += var4;
                           if (var9 > 0) {
                              int var12 = var51.f;
                              if (var12 > 0 && var51.d == var8 - var12 && var51.e == var11 - var12) {
                                 var51.f = var12 + var9;
                              } else {
                                 var51.i();
                                 var51.d = var8;
                                 var51.e = var11;
                                 var51.f = var9;
                              }
                           }

                           Collection var52;
                           if (var10 > var4) {
                              var52 = var17.e.values();
                              var52.getClass();
                              Iterator var21 = var52.iterator();

                              label260:
                              while(true) {
                                 lpz var53;
                                 while(true) {
                                    var8 = var2;
                                    if (!var21.hasNext()) {
                                       break label260;
                                    }

                                    var53 = (lpz)var21.next();
                                    var8 = var53.b;
                                    if (var10 <= var8 && var8 < var10 + var9) {
                                       var8 = var8 - var10 + var4;
                                       break;
                                    }

                                    if (var4 <= var8 && var8 < var10) {
                                       var8 += var9;
                                       break;
                                    }
                                 }

                                 var53.b = var8;
                              }
                           } else {
                              var8 = var2;
                              if (var4 > var10) {
                                 var52 = var17.e.values();
                                 var52.getClass();
                                 Iterator var55 = var52.iterator();

                                 label244:
                                 while(true) {
                                    lpz var54;
                                    while(true) {
                                       var8 = var2;
                                       if (!var55.hasNext()) {
                                          break label244;
                                       }

                                       var54 = (lpz)var55.next();
                                       var8 = var54.b;
                                       if (var10 <= var8 && var8 < var10 + var9) {
                                          var8 = var8 - var10 + var4;
                                          break;
                                       }

                                       if (var10 + 1 <= var8 && var8 < var4) {
                                          var8 -= var9;
                                          break;
                                       }
                                    }

                                    var54.b = var8;
                                 }
                              }
                           }
                        } else {
                           var8 = var2;
                        }
                     } else {
                        var8 = var2 + 1;
                     }

                     ++var5;
                     var4 += var17.c(var19);
                     var2 = var8;
                  }
               }

               this.o.i();
               var2 = var3;
               if (var18.size() > 0) {
                  this.o.e(this.j.g);
                  this.j.t();
                  var2 = var3;
               }
               break;
            }
         } else {
            var2 = var3;
         }
      } else {
         var2 = var3;
      }

      var4 = this.A;

      while(true) {
         var23 = this.j;
         if (var23.v() || var23.f == var23.g) {
            boolean var13 = this.p;
            if (var13) {
               awy var32;
               if (var1) {
                  blj var25 = this.N;
                  awy var26 = (awy)var25.b;
                  if (!var26.f()) {
                     asr.k("Cannot end node insertion, there are no pending operations that can be realized.");
                     throw new qsc();
                  }

                  Object var37 = var25.a;
                  if (var26.e()) {
                     throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
                  }

                  awu[] var29 = var26.a;
                  var2 = var26.b - 1;
                  var26.b = var2;
                  awu var27 = var29[var2];
                  var27.getClass();
                  var29[var2] = null;
                  var32 = (awy)var37;
                  var32.d(var27);
                  var4 = var26.f;
                  var3 = var32.f;
                  var5 = var27.c;

                  for(var2 = 0; var2 < var5; ++var2) {
                     --var3;
                     --var4;
                     Object[] var38 = var32.e;
                     Object[] var44 = var26.e;
                     var38[var3] = var44[var4];
                     var44[var4] = null;
                  }

                  var4 = var26.d;
                  var3 = var32.d;
                  var5 = var27.b;
                  var2 = 0;

                  while(true) {
                     if (var2 >= var5) {
                        var26.f -= var27.c;
                        var26.d -= var27.b;
                        var2 = 1;
                        break;
                     }

                     --var3;
                     --var4;
                     int[] var41 = var32.c;
                     int[] var47 = var26.c;
                     var41[var3] = var47[var4];
                     var47[var4] = 0;
                     ++var2;
                  }
               }

               var23 = this.j;
               var3 = var23.i;
               if (var3 <= 0) {
                  throw new IllegalArgumentException("Unbalanced begin/end empty");
               }

               var23.i = var3 - 1;
               var14 = this.l;
               var4 = var14.p;
               var14.P();
               var3 = var2;
               if (!this.j.v()) {
                  var4 = ax(var4);
                  this.l.t();
                  this.l.s();
                  nxj var30 = this.M;
                  blj var42 = this.N;
                  avn var28;
                  StringBuilder var33;
                  Object var35;
                  String var36;
                  String var39;
                  StringBuilder var49;
                  if (((awy)var42.a).e()) {
                     var28 = this.o;
                     aut var46 = this.k;
                     var30.getClass();
                     var46.getClass();
                     var28.g();
                     var28.h();
                     var35 = var28.h.a;
                     awd var31 = awd.a;
                     var32 = (awy)var35;
                     var32.d(var31);
                     awx.b(var32, 0, var30);
                     awx.b(var32, 1, var46);
                     if (var32.g != awy.h(var31.b) || var32.h != awy.h(var31.c)) {
                        var33 = new StringBuilder();
                        var5 = var31.b;
                        var4 = 0;

                        for(var2 = 0; var4 < var5; var2 = var3) {
                           var3 = var2;
                           if ((1 << var4 & var32.g) != 0) {
                              if (var2 > 0) {
                                 var33.append(", ");
                              }

                              var33.append(var31.a(var4));
                              var3 = var2 + 1;
                           }

                           ++var4;
                        }

                        var36 = var33.toString();
                        var49 = new StringBuilder();
                        var6 = var31.c;
                        var4 = 0;

                        for(var3 = 0; var4 < var6; var3 = var5) {
                           var5 = var3;
                           if ((1 << var4 & var32.h) != 0) {
                              if (var2 > 0) {
                                 var49.append(", ");
                              }

                              var49.append(var31.c(var4));
                              var5 = var3 + 1;
                           }

                           ++var4;
                        }

                        var39 = var49.toString();
                        throw new IllegalStateException(nx.c(new StringBuilder(), var39, var3, var36, var2, var31));
                     }
                  } else {
                     var28 = this.o;
                     aut var48 = this.k;
                     var30.getClass();
                     var48.getClass();
                     var42.getClass();
                     var28.g();
                     var28.h();
                     var35 = var28.h.a;
                     awe var34 = awe.a;
                     var32 = (awy)var35;
                     var32.d(var34);
                     awx.b(var32, 0, var30);
                     awx.b(var32, 1, var48);
                     awx.b(var32, 2, var42);
                     if (var32.g != awy.h(var34.b) || var32.h != awy.h(var34.c)) {
                        byte var22 = 0;
                        var33 = new StringBuilder();
                        var6 = var34.b;
                        var3 = 0;

                        for(var2 = 0; var3 < var6; var2 = var4) {
                           var4 = var2;
                           if ((1 << var3 & var32.g) != 0) {
                              if (var2 > 0) {
                                 var33.append(", ");
                              }

                              var33.append(var34.a(var3));
                              var4 = var2 + 1;
                           }

                           ++var3;
                        }

                        var36 = var33.toString();
                        var49 = new StringBuilder();
                        var6 = var34.c;
                        var4 = 0;

                        for(var3 = var22; var3 < var6; var4 = var5) {
                           var5 = var4;
                           if ((1 << var3 & var32.h) != 0) {
                              if (var2 > 0) {
                                 var49.append(", ");
                              }

                              var49.append(var34.c(var3));
                              var5 = var4 + 1;
                           }

                           ++var3;
                        }

                        var39 = var49.toString();
                        throw new IllegalStateException(nx.c(new StringBuilder(), var39, var4, var36, var2, var34));
                     }

                     this.N = new blj((byte[])null, (byte[])null);
                  }

                  this.p = false;
                  var3 = var2;
                  if (this.c.b != 0) {
                     this.X(var4, 0);
                     this.au(var4, var2);
                     var3 = var2;
                  }
               }
            } else {
               if (var1) {
                  this.o.f();
               }

               avn var40 = this.o;
               var3 = var40.a().h;
               if (var40.g.g(-1) > var3) {
                  asr.k("Missed recording an endGroup");
                  qsc var45 = new qsc();
                  throw var45;
               }

               if (var40.g.g(-1) == var3) {
                  avn.n(var40);
                  var40.g.h();
                  var40.h.j();
               }

               var4 = this.j.h;
               var3 = this.K(var4);
               if (var2 != var3) {
                  this.au(var4, var2);
               }

               if (var1) {
                  var2 = 1;
               }

               this.j.r();
               this.o.i();
               var3 = var2;
            }

            aud var43 = (aud)this.O.l();
            if (var43 != null && !var13) {
               ++var43.c;
            }

            this.z = var43;
            this.A = this.J.h() + var3;
            this.B = this.K.h() + var3;
            return;
         }

         var5 = this.j.f;
         this.ak();
         var3 = this.j.f();
         this.o.l(var4, var3);
         asr.h(this.f, var5, this.j.f);
      }
   }

   private final void ai(boolean var1, aud var2) {
      this.O.p(this.z);
      this.z = var2;
      this.J.j(this.A);
      if (var1) {
         this.A = 0;
      }

      this.K.j(this.B);
      this.B = 0;
   }

   private final void aj() {
      boolean var16 = this.i;
      this.i = true;
      aus var17 = this.j;
      int var7 = var17.h;
      int var12 = var17.c(var7) + var7;
      int var6 = this.A;
      int var10 = this.q;
      int var11 = this.B;
      atl var30 = asr.e(this.f, this.j.f, var12);
      int var2 = var7;

      boolean var1;
      int var29;
      for(var1 = false; var30 != null; var30 = asr.e(this.f, this.j.f, var12)) {
         int var13 = var30.a;
         asr.f(this.f, var13);
         Object var19 = var30.b;
         Object var18 = var30.c;
         int var3;
         int var4;
         int var5;
         if (var18 != null) {
            dhq var20 = ((aug)var19).e;
            if (var20 != null && ((axb)var18).b()) {
               label486: {
                  if (!((Collection)var18).isEmpty()) {
                     Iterator var21 = ((Iterable)var18).iterator();

                     while(var21.hasNext()) {
                        var18 = var21.next();
                        if (!(var18 instanceof ate)) {
                           break label486;
                        }

                        ate var22 = (ate)var18;
                        avf var34 = var22.b;
                        var18 = var34;
                        if (var34 == null) {
                           var18 = aup.c;
                        }

                        if (!((avf)var18).a(var22.f().d, var20.g(var22))) {
                           break label486;
                        }
                     }
                  }

                  this.v.p(var30.b);
                  aug var33 = (aug)var30.b;
                  auh var35 = var33.b;
                  if (var35 != null) {
                     dhq var38 = var33.f;
                     if (var38 != null) {
                        label491: {
                           var33.e(true);

                           Throwable var10000;
                           label472: {
                              boolean var10001;
                              Object var37;
                              try {
                                 var37 = var38.c;
                                 var19 = var38.b;
                                 var4 = var38.a;
                              } catch (Throwable var28) {
                                 var10000 = var28;
                                 var10001 = false;
                                 break label472;
                              }

                              var3 = 0;

                              while(true) {
                                 if (var3 >= var4) {
                                    var33.e(false);
                                    break label491;
                                 }

                                 try {
                                    Object var39 = ((Object[])var37)[var3];
                                    var39.getClass();
                                    var5 = ((int[])var19)[var3];
                                    var35.h(var39);
                                 } catch (Throwable var27) {
                                    var10000 = var27;
                                    var10001 = false;
                                    break;
                                 }

                                 ++var3;
                              }
                           }

                           Throwable var36 = var10000;
                           var33.e(false);
                           throw var36;
                        }
                     }
                  }

                  this.v.l();
                  continue;
               }
            }
         }

         this.j.s(var13);
         int var8 = this.j.f;
         this.al(var2, var8, var7);

         for(var2 = this.j.e(var8); var2 != var7 && !this.j.w(var2); var2 = this.j.e(var2)) {
         }

         if (!this.j.w(var2)) {
            var29 = var6;
         } else {
            var29 = 0;
         }

         if (var2 == var8) {
            var4 = var29;
         } else {
            int var14 = this.K(var2);
            int var15 = this.j.d(var8);
            var4 = var29;
            var5 = var2;

            label407:
            while(true) {
               var2 = var4;
               var4 = var4;
               if (var2 >= var14 - var15 + var29) {
                  break;
               }

               var4 = var2;
               if (var5 == var13) {
                  break;
               }

               var3 = var5 + 1;

               while(true) {
                  var4 = var2;
                  if (var3 >= var13) {
                     break label407;
                  }

                  int var9 = this.j.c(var3) + var3;
                  var5 = var3;
                  var4 = var2;
                  if (var13 < var9) {
                     break;
                  }

                  var2 += this.K(var3);
                  var3 = var9;
               }
            }
         }

         this.A = var4;
         this.q = this.ad(this.j.e(var8), var7, var10);
         this.n = null;
         qvx var31 = ((aug)var30.b).c;
         qsn var32;
         if (var31 != null) {
            var31.a(this, 1);
            var32 = qsn.a;
         } else {
            var32 = null;
         }

         if (var32 == null) {
            throw new IllegalStateException("Invalid restart scope");
         }

         this.n = null;
         var17 = this.j;
         var2 = pu.f(var17.b, var7) + var7;
         var29 = var17.f;
         if (var29 < var7 || var29 > var2) {
            asr.k(c.az(var29, var7, "Index ", " is not a parent of "));
            throw new qsc();
         }

         var17.h = var7;
         var17.g = var2;
         var17.j = 0;
         var17.k = 0;
         var2 = var8;
         var1 = true;
      }

      if (var1) {
         this.al(var2, var7, var7);
         this.j.t();
         var29 = this.K(var7);
         this.A = var6 + var29;
         this.B = var11 + var29;
      } else {
         this.an();
      }

      this.q = var10;
      this.i = var16;
   }

   private final void ak() {
      this.am(this.j.f);
      avn var2 = this.o;
      var2.h();
      Object var3 = var2.h.a;
      awk var4 = awk.a;
      ((awy)var3).c(var4);
      int var1 = var2.c;
      aus var5 = var2.a();
      var2.c = var1 + pu.f(var5.b, var5.f);
   }

   private final void al(int var1, int var2, int var3) {
      int var4;
      int var5;
      aus var10;
      label65: {
         var10 = this.j;
         if (var1 != var2) {
            var5 = var1;
            var4 = var3;
            if (var1 == var3) {
               break label65;
            }

            var5 = var1;
            var4 = var3;
            if (var2 == var3) {
               break label65;
            }

            if (var10.e(var1) == var2) {
               var4 = var2;
               var5 = var1;
               break label65;
            }

            if (var10.e(var2) != var1) {
               if (var10.e(var1) == var10.e(var2)) {
                  var4 = var10.e(var1);
                  var5 = var1;
                  break label65;
               } else {
                  int var8 = asr.b(var10, var1, var3);
                  int var9 = asr.b(var10, var2, var3);
                  int var6 = 0;
                  var3 = var1;

                  for(var4 = 0; var4 < var8 - var9; ++var4) {
                     var3 = var10.e(var3);
                  }

                  var4 = var2;

                  while(true) {
                     int var7 = var4;
                     var5 = var3;
                     if (var6 >= var9 - var8) {
                        while(var5 != var7) {
                           var5 = var10.e(var5);
                           var7 = var10.e(var7);
                        }

                        var4 = var5;
                        var5 = var1;
                        break label65;
                     }

                     var4 = var10.e(var4);
                     ++var6;
                  }
               }
            }
         }

         var4 = var1;
      }

      for(var5 = var1; var5 > 0 && var5 != var4; var5 = var10.e(var5)) {
         if (var10.w(var5)) {
            this.o.f();
         }
      }

      this.ag(var2, var4);
   }

   private final void am(int var1) {
      ae(this, var1, false, 0);
      this.o.i();
   }

   private final void an() {
      aus var2 = this.j;
      int var1 = var2.h;
      if (var1 >= 0) {
         var1 = pu.i(var2.b, var1);
      } else {
         var1 = 0;
      }

      this.B = var1;
      this.j.t();
   }

   private final void ao(int var1) {
      this.V(var1, (Object)null, 0, (Object)null);
   }

   private final void ap(boolean var1, Object var2) {
      if (var1) {
         aus var13 = this.j;
         if (var13.i <= 0) {
            if (pu.w(var13.b, var13.f)) {
               var13.u();
            } else {
               throw new IllegalArgumentException("Expected a node group");
            }
         }
      } else {
         if (var2 != null && this.j.g() != var2) {
            avn var8 = this.o;
            avn.n(var8);
            Object var9 = var8.h.a;
            awp var14 = awp.a;
            awy var15 = (awy)var9;
            var15.d(var14);
            int var6 = 0;
            awx.b(var15, 0, var2);
            if (var15.g != awy.h(var14.b) || var15.h != awy.h(var14.c)) {
               StringBuilder var11 = new StringBuilder();
               int var7 = var14.b;
               int var5 = 0;

               int var3;
               int var4;
               for(var3 = 0; var5 < var7; var3 = var4) {
                  var4 = var3;
                  if ((1 << var5 & var15.g) != 0) {
                     if (var3 > 0) {
                        var11.append(", ");
                     }

                     var11.append(var14.a(var5));
                     var4 = var3 + 1;
                  }

                  ++var5;
               }

               String var12 = var11.toString();
               StringBuilder var10 = new StringBuilder();
               var7 = var14.c;

               for(var5 = 0; var6 < var7; var5 = var4) {
                  var4 = var5;
                  if ((1 << var6 & var15.h) != 0) {
                     if (var3 > 0) {
                        var10.append(", ");
                     }

                     var10.append(var14.c(var6));
                     var4 = var5 + 1;
                  }

                  ++var6;
               }

               String var16 = var10.toString();
               throw new IllegalStateException(nx.c(new StringBuilder(), var16, var5, var12, var3, var14));
            }
         }

         this.j.u();
      }
   }

   private final void aq(int var1, Object var2, Object var3) {
      if (var2 == null) {
         int var4 = var1;
         if (var3 != null) {
            var4 = var1;
            if (var1 == 207) {
               if (!c.E(var3, asl.a)) {
                  this.ar(var3.hashCode());
                  return;
               }

               var4 = 207;
            }
         }

         this.ar(var4);
      } else if (var2 instanceof Enum) {
         this.ar(((Enum)var2).ordinal());
      } else {
         this.ar(var2.hashCode());
      }
   }

   private final void ar(int var1) {
      this.q = var1 ^ Integer.rotateLeft(this.q, 3);
   }

   private final void as(int var1, Object var2, Object var3) {
      if (var2 == null) {
         int var4 = var1;
         if (var3 != null) {
            var4 = var1;
            if (var1 == 207) {
               if (!c.E(var3, asl.a)) {
                  this.at(var3.hashCode());
                  return;
               }

               var4 = 207;
            }
         }

         this.at(var4);
      } else if (var2 instanceof Enum) {
         this.at(((Enum)var2).ordinal());
      } else {
         this.at(var2.hashCode());
      }
   }

   private final void at(int var1) {
      this.q = Integer.rotateRight(var1 ^ this.q, 3);
   }

   private final void au(int var1, int var2) {
      int var6 = this.K(var1);
      if (var6 != var2) {
         int var4 = this.O.k() - 1;
         int var3 = var1;
         var1 = var4;

         while(var3 != -1) {
            int var7 = this.K(var3) + (var2 - var6);
            this.X(var3, var7);
            int var5 = var1;

            while(true) {
               var4 = var1;
               if (var5 < 0) {
                  break;
               }

               aud var8 = (aud)((ArrayList)this.O.a).get(var5);
               if (var8 != null && var8.a(var3, var7)) {
                  var4 = var5 - 1;
                  break;
               }

               --var5;
            }

            if (var3 < 0) {
               var3 = this.j.h;
               var1 = var4;
            } else {
               if (this.j.w(var3)) {
                  break;
               }

               var3 = this.j.e(var3);
               var1 = var4;
            }
         }
      }

   }

   private final void av() {
      if (this.D) {
         this.D = false;
      } else {
         asr.k("A call to createNode(), emitNode() or useNode() expected was not expected");
         throw new qsc();
      }
   }

   private final void aw() {
      if (this.D) {
         asr.k("A call to createNode(), emitNode() or useNode() expected");
         throw new qsc();
      }
   }

   private static final int ax(int var0) {
      return -2 - var0;
   }

   public final boolean A(long var1) {
      Object var3 = this.O();
      if (var3 instanceof Long && var1 == ((Number)var3).longValue()) {
         return false;
      } else {
         this.Y(var1);
         return true;
      }
   }

   public final boolean B(Object var1) {
      if (!c.E(this.O(), var1)) {
         this.Y(var1);
         return true;
      } else {
         return false;
      }
   }

   public final boolean C(boolean var1) {
      Object var2 = this.O();
      if (var2 instanceof Boolean && var1 == (Boolean)var2) {
         return false;
      } else {
         this.Y(var1);
         return true;
      }
   }

   public final boolean D(Object var1) {
      if (this.O() != var1) {
         this.Y(var1);
         return true;
      } else {
         return false;
      }
   }

   public final boolean E() {
      boolean var3 = this.g;
      boolean var2 = true;
      boolean var1 = var2;
      if (!var3) {
         aug var4 = this.N();
         if (var4 != null) {
            if ((var4.a & 4) == 0) {
               return false;
            }

            var1 = var2;
         } else {
            var1 = false;
         }
      }

      return var1;
   }

   public final boolean F() {
      return this.p;
   }

   public final boolean G() {
      if (!this.p && !this.F && !this.g) {
         aug var1 = this.N();
         if (var1 != null && (var1.a & 8) == 0) {
            return true;
         }
      }

      return false;
   }

   public final aug H() {
      boolean var7 = this.v.o();
      Object var10 = null;
      aug var8;
      if (var7) {
         var8 = (aug)this.v.l();
      } else {
         var8 = null;
      }

      byte var5 = 0;
      if (var8 != null) {
         var8.d(false);
      }

      if (var8 != null) {
         int var1;
         int var2;
         int var3;
         Object var12;
         atd var14;
         label101: {
            var2 = this.H;
            dhq var9 = var8.f;
            if (var9 != null && !var8.h()) {
               var12 = var9.c;
               Object var11 = var9.b;
               var3 = var9.a;

               for(var1 = 0; var1 < var3; ++var1) {
                  ((Object[])var12)[var1].getClass();
                  if (((int[])var11)[var1] != var2) {
                     var14 = new atd(var8, var2, var9, 2);
                     break label101;
                  }
               }
            }

            var14 = null;
         }

         if (var14 != null) {
            avn var20 = this.o;
            asw var13 = this.r;
            var12 = var20.h.a;
            avx var21 = avx.a;
            awy var24 = (awy)var12;
            var24.d(var21);
            awx.b(var24, 0, var14);
            awx.b(var24, 1, var13);
            if (var24.g != awy.h(var21.b) || var24.h != awy.h(var21.c)) {
               StringBuilder var15 = new StringBuilder();
               int var4 = var21.b;
               var3 = 0;

               for(var1 = 0; var3 < var4; var1 = var2) {
                  var2 = var1;
                  if ((1 << var3 & var24.g) != 0) {
                     if (var1 > 0) {
                        var15.append(", ");
                     }

                     var15.append(var21.a(var3));
                     var2 = var1 + 1;
                  }

                  ++var3;
               }

               String var16 = var15.toString();
               StringBuilder var22 = new StringBuilder();
               int var6 = var21.c;
               var4 = 0;

               for(var3 = var5; var3 < var6; var4 = var2) {
                  var2 = var4;
                  if ((1 << var3 & var24.h) != 0) {
                     if (var1 > 0) {
                        var22.append(", ");
                     }

                     var22.append(var21.c(var3));
                     var2 = var4 + 1;
                  }

                  ++var3;
               }

               String var23 = var22.toString();
               throw new IllegalStateException(nx.c(new StringBuilder(), var23, var4, var16, var1, var21));
            }
         }
      }

      if (var8 == null || var8.h() || !var8.i() && !this.e) {
         var8 = (aug)var10;
      } else {
         if (var8.g == null) {
            nxj var18;
            if (this.p) {
               auw var17 = this.l;
               var18 = var17.U(var17.p);
            } else {
               aus var19 = this.j;
               var18 = var19.x(var19.h);
            }

            var8.g = var18;
         }

         var8.c(false);
      }

      this.ah(false);
      return var8;
   }

   public final void I(Object var1) {
      if (this.j.a() == 207 && !c.E(this.j.g(), var1) && this.G < 0) {
         this.G = this.j.f;
         this.F = true;
      }

      this.V(207, (Object)null, 0, var1);
   }

   public final void J() {
   }

   public final int K(int var1) {
      if (var1 < 0) {
         HashMap var4 = this.C;
         if (var4 != null) {
            Integer var5 = (Integer)var4.get(var1);
            if (var5 != null) {
               return var5;
            }
         }

         return 0;
      } else {
         int[] var3 = this.d;
         if (var3 != null) {
            int var2 = var3[var1];
            if (var2 >= 0) {
               return var2;
            }
         }

         return this.j.d(var1);
      }
   }

   public final aue L() {
      aue var1 = this.n;
      return var1 != null ? var1 : this.af(this.j.h);
   }

   public final aue M(aue var1, aue var2) {
      ayu var3 = var1.b();
      var3.putAll(var2);
      ayv var4 = var3.h();
      this.W(204, asr.e);
      this.B(var4);
      this.B(var2);
      this.S();
      return var4;
   }

   public final aug N() {
      dmw var2 = this.v;
      if (this.h == 0 && var2.o()) {
         Object var3 = var2.a;
         int var1 = var2.k();
         return (aug)((ArrayList)var3).get(var1 - 1);
      } else {
         return null;
      }
   }

   public final Object O() {
      Object var1;
      if (this.p) {
         this.aw();
         var1 = asl.a;
      } else {
         var1 = this.j.m();
         if (this.F) {
            var1 = asl.a;
         }
      }

      return var1;
   }

   public final void P() {
      this.Q();
      this.O.m();
      this.J.i();
      this.K.i();
      this.L.i();
      this.s.i();
      this.x.ay();
      aus var1 = this.j;
      if (!var1.e) {
         var1.q();
      }

      auw var2 = this.l;
      if (!var2.q) {
         var2.s();
      }

      blj var3 = this.N;
      ((awy)var3.b).b();
      ((awy)var3.a).b();
      this.R();
      this.q = 0;
      this.h = 0;
      this.D = false;
      this.p = false;
      this.F = false;
      this.i = false;
      this.G = -1;
   }

   public final void Q() {
      this.z = null;
      this.A = 0;
      this.B = 0;
      this.q = 0;
      this.D = false;
      avn var1 = this.o;
      var1.a = false;
      var1.g.i();
      var1.c = 0;
      this.v.m();
      this.d = null;
      this.C = null;
   }

   public final void R() {
      asr.i(this.l.q);
      aut var1 = new aut();
      this.k = var1;
      auw var2 = var1.b();
      var2.s();
      this.l = var2;
   }

   public final void S() {
      this.ah(false);
   }

   public final void T(aus var1) {
      var1.getClass();
      this.j = var1;
   }

   public final void U() {
      this.B += this.j.f();
   }

   public final void V(int var1, Object var2, int var3, Object var4) {
      this.aw();
      this.aq(var1, var2, var4);
      boolean var11 = this.p;
      byte var8 = 0;
      byte var7 = 0;
      boolean var10;
      if (var3 != 0) {
         var10 = true;
      } else {
         var10 = false;
      }

      aud var19;
      Object var30;
      auw var32;
      if (var11) {
         this.j.p();
         var32 = this.l;
         var3 = var32.o;
         if (var10) {
            var32.G(var1, asl.a);
         } else if (var4 != null) {
            var30 = var2;
            if (var2 == null) {
               var30 = asl.a;
            }

            var32.D(var1, var30, var4);
         } else {
            var4 = var2;
            if (var2 == null) {
               var4 = asl.a;
            }

            var32.F(var1, var4);
         }

         var19 = this.z;
         if (var19 != null) {
            ora var28 = new ora(var1, -1, ax(var3), -1);
            var19.d(var28, this.A - var19.b);
            var19.e(var28);
         }

         this.ai(var10, (aud)null);
      } else {
         boolean var20;
         if (var3 != 1) {
            var20 = false;
         } else if (this.F) {
            var20 = true;
         } else {
            var20 = false;
         }

         int var5;
         int var6;
         Object var13;
         if (this.z == null) {
            var5 = this.j.a();
            if (!var20 && var5 == var1 && c.E(var2, this.j.h())) {
               this.ap(var10, var4);
            } else {
               aus var14 = this.j;
               ArrayList var12 = new ArrayList();
               if (var14.i <= 0) {
                  for(var5 = var14.f; var5 < var14.g; var5 += pu.f(var14.b, var5)) {
                     int var9 = pu.g(var14.b, var5);
                     var13 = var14.o(var14.b, var5);
                     if (pu.w(var14.b, var5)) {
                        var6 = 1;
                     } else {
                        var6 = pu.i(var14.b, var5);
                     }

                     var12.add(new ora(var9, var13, var5, var6));
                  }
               }

               this.z = new aud(var12, this.A);
            }
         }

         aud var33 = this.z;
         if (var33 != null) {
            if (var2 != null) {
               var30 = new atm(var1, var2);
            } else {
               var30 = var1;
            }

            label189: {
               HashMap var15 = (HashMap)var33.f.a();
               LinkedHashSet var31 = (LinkedHashSet)var15.get(var30);
               if (var31 != null) {
                  var13 = pwm.av(var31);
                  if (var13 != null) {
                     LinkedHashSet var16 = (LinkedHashSet)var15.get(var30);
                     if (var16 != null) {
                        var16.remove(var13);
                        if (var16.isEmpty()) {
                           var15.remove(var30);
                           var30 = var13;
                           break label189;
                        }
                     }

                     var30 = var13;
                     break label189;
                  }
               }

               var30 = null;
            }

            ora var35 = (ora)var30;
            if (!var20 && var35 != null) {
               var33.e(var35);
               var3 = var35.c;
               this.A = var33.b(var35) + var33.b;
               lpz var21 = (lpz)var33.e.get(var35.c);
               if (var21 != null) {
                  var1 = var21.c;
               } else {
                  var1 = -1;
               }

               var5 = var33.c;
               var6 = var1 - var5;
               Collection var22;
               Iterator var23;
               int var29;
               lpz var37;
               if (var1 > var5) {
                  var22 = var33.e.values();
                  var22.getClass();
                  var23 = var22.iterator();

                  while(var23.hasNext()) {
                     var37 = (lpz)var23.next();
                     var29 = var37.c;
                     if (var29 == var1) {
                        var37.c = var5;
                     } else if (var5 <= var29 && var29 < var1) {
                        var37.c = var29 + 1;
                     }
                  }
               } else if (var5 > var1) {
                  var22 = var33.e.values();
                  var22.getClass();
                  var23 = var22.iterator();

                  while(var23.hasNext()) {
                     var37 = (lpz)var23.next();
                     var29 = var37.c;
                     if (var29 == var1) {
                        var37.c = var5;
                     } else if (var1 + 1 <= var29 && var29 < var5) {
                        var37.c = var29 - 1;
                     }
                  }
               }

               this.o.e(var3);
               this.j.s(var3);
               if (var6 > 0) {
                  avn var24 = this.o;
                  var24.h();
                  var30 = var24.h.a;
                  awf var25 = awf.a;
                  awy var38 = (awy)var30;
                  var38.d(var25);
                  awx.a(var38, 0, var6);
                  if (var38.g != awy.h(var25.b) || var38.h != awy.h(var25.c)) {
                     StringBuilder var26 = new StringBuilder();
                     var6 = var25.b;
                     var5 = 0;

                     for(var1 = 0; var5 < var6; var1 = var3) {
                        var3 = var1;
                        if ((1 << var5 & var38.g) != 0) {
                           if (var1 > 0) {
                              var26.append(", ");
                           }

                           var26.append(var25.a(var5));
                           var3 = var1 + 1;
                        }

                        ++var5;
                     }

                     String var27 = var26.toString();
                     StringBuilder var34 = new StringBuilder();
                     var29 = var25.c;
                     var5 = 0;

                     for(var6 = var7; var6 < var29; var5 = var3) {
                        var3 = var5;
                        if ((1 << var6 & var38.h) != 0) {
                           if (var1 > 0) {
                              var34.append(", ");
                           }

                           var34.append(var25.c(var6));
                           var3 = var5 + 1;
                        }

                        ++var6;
                     }

                     String var39 = var34.toString();
                     throw new IllegalStateException(nx.c(new StringBuilder(), var39, var5, var27, var1, var25));
                  }
               }

               this.ap(var10, var4);
               var19 = null;
            } else {
               this.j.p();
               this.p = true;
               this.n = null;
               if (this.l.q) {
                  auw var36 = this.k.b();
                  this.l = var36;
                  var36.C();
                  this.m = false;
                  this.n = null;
               }

               this.l.r();
               var32 = this.l;
               var3 = var32.o;
               if (var10) {
                  var32.G(var1, asl.a);
               } else if (var4 != null) {
                  var30 = var2;
                  if (var2 == null) {
                     var30 = asl.a;
                  }

                  var32.D(var1, var30, var4);
               } else {
                  var4 = var2;
                  if (var2 == null) {
                     var4 = asl.a;
                  }

                  var32.F(var1, var4);
               }

               this.M = this.l.U(var3);
               ora var17 = new ora(var1, -1, ax(var3), -1);
               var33.d(var17, this.A - var33.b);
               var33.e(var17);
               ArrayList var18 = new ArrayList();
               if (var10) {
                  var1 = var8;
               } else {
                  var1 = this.A;
               }

               var19 = new aud(var18, var1);
            }
         } else {
            var19 = null;
         }

         this.ai(var10, var19);
      }
   }

   public final void W(int var1, Object var2) {
      this.V(var1, var2, 0, (Object)null);
   }

   public final void X(int var1, int var2) {
      if (this.K(var1) != var2) {
         if (var1 < 0) {
            HashMap var5 = this.C;
            if (var5 == null) {
               var5 = new HashMap();
               this.C = var5;
            }

            var5.put(var1, var2);
            return;
         }

         int[] var4 = this.d;
         if (var4 == null) {
            int var3 = this.j.c;
            var4 = new int[var3];
            pwm.bk(var4, -1, var3);
            this.d = var4;
         }

         var4[var1] = var2;
      }

   }

   public final void Y(Object var1) {
      boolean var8 = this.p;
      int var5 = 0;
      byte var6 = 0;
      int var2;
      int var3;
      int var4;
      avn var9;
      Object var10;
      StringBuilder var12;
      String var13;
      awy var19;
      String var20;
      StringBuilder var21;
      if (var8) {
         this.l.S(var1);
         if (var1 instanceof auq) {
            var9 = this.o;
            auq var11 = (auq)var1;
            var11.getClass();
            var10 = var9.h.a;
            awj var16 = awj.a;
            var19 = (awy)var10;
            var19.d(var16);
            awx.b(var19, 0, var11);
            if (var19.g == awy.h(var16.b) && var19.h == awy.h(var16.c)) {
               this.y.add(var1);
               return;
            }

            var12 = new StringBuilder();
            var5 = var16.b;
            var3 = 0;

            for(var2 = 0; var3 < var5; var2 = var4) {
               var4 = var2;
               if ((1 << var3 & var19.g) != 0) {
                  if (var2 > 0) {
                     var12.append(", ");
                  }

                  var12.append(var16.a(var3));
                  var4 = var2 + 1;
               }

               ++var3;
            }

            var13 = var12.toString();
            var21 = new StringBuilder();
            int var7 = var16.c;
            var3 = 0;

            for(var5 = var6; var5 < var7; var3 = var4) {
               var4 = var3;
               if ((1 << var5 & var19.h) != 0) {
                  if (var2 > 0) {
                     var21.append(", ");
                  }

                  var21.append(var16.c(var5));
                  var4 = var3 + 1;
               }

               ++var5;
            }

            var20 = var21.toString();
            throw new IllegalStateException(nx.c(new StringBuilder(), var20, var3, var13, var2, var16));
         }
      } else {
         aus var17 = this.j;
         var3 = var17.j;
         var2 = pu.m(var17.b, var17.h);
         if (var1 instanceof auq) {
            this.y.add(var1);
         }

         var9 = this.o;
         var9.j(true);
         var10 = var9.h.a;
         awr var18 = awr.a;
         var19 = (awy)var10;
         var19.d(var18);
         awx.b(var19, 0, var1);
         awx.a(var19, 0, var3 - var2 - 1);
         if (var19.g != awy.h(var18.b) || var19.h != awy.h(var18.c)) {
            var12 = new StringBuilder();
            int var15 = var18.b;
            var3 = 0;

            for(var2 = 0; var3 < var15; var2 = var4) {
               var4 = var2;
               if ((1 << var3 & var19.g) != 0) {
                  if (var2 > 0) {
                     var12.append(", ");
                  }

                  var12.append(var18.a(var3));
                  var4 = var2 + 1;
               }

               ++var3;
            }

            var13 = var12.toString();
            var21 = new StringBuilder();
            var15 = var18.c;

            for(var3 = 0; var5 < var15; var3 = var4) {
               var4 = var3;
               if ((1 << var5 & var19.h) != 0) {
                  if (var2 > 0) {
                     var21.append(", ");
                  }

                  var21.append(var18.c(var5));
                  var4 = var3 + 1;
               }

               ++var5;
            }

            var20 = var21.toString();
            IllegalStateException var14 = new IllegalStateException(nx.c(new StringBuilder(), var20, var3, var13, var2, var18));
            throw var14;
         }
      }

   }

   public final boolean Z(aug var1, Object var2) {
      var1.getClass();
      nxj var5 = var1.g;
      if (var5 == null) {
         return false;
      } else {
         int var3 = var5.e(this.j.a);
         if (this.i && var3 >= this.j.f) {
            List var6 = this.f;
            int var4 = asr.d(var6, var3);
            var5 = null;
            if (var4 < 0) {
               axb var8;
               if (var2 != null) {
                  axb var9 = new axb();
                  var9.add(var2);
                  var8 = var9;
               } else {
                  var8 = var5;
               }

               var6.add(-(var4 + 1), new atl(var1, var3, var8));
            } else if (var2 == null) {
               ((atl)var6.get(var4)).c = null;
            } else {
               Object var7 = ((atl)var6.get(var4)).c;
               if (var7 != null) {
                  ((axb)var7).add(var2);
               }
            }

            return true;
         } else {
            return false;
         }
      }
   }

   public final int a() {
      return this.q;
   }

   public final void ab(asw var1, asw var2, Integer var3, List var4, qvi var5) {
      boolean var11 = this.i;
      int var8 = this.A;

      label1526: {
         Throwable var10000;
         label1530: {
            int var9;
            boolean var10001;
            try {
               this.i = true;
               this.A = 0;
               var9 = var4.size();
            } catch (Throwable var187) {
               var10000 = var187;
               var10001 = false;
               break label1530;
            }

            int var6;
            for(var6 = 0; var6 < var9; ++var6) {
               aug var12;
               axb var14;
               try {
                  qsg var13 = (qsg)var4.get(var6);
                  var12 = (aug)var13.a;
                  var14 = (axb)var13.b;
               } catch (Throwable var186) {
                  var10000 = var186;
                  var10001 = false;
                  break label1530;
               }

               if (var14 != null) {
                  int var10;
                  Object[] var191;
                  try {
                     var191 = var14.b;
                     var10 = var14.a;
                  } catch (Throwable var185) {
                     var10000 = var185;
                     var10001 = false;
                     break label1530;
                  }

                  for(int var7 = 0; var7 < var10; ++var7) {
                     Object var192 = var191[var7];

                     try {
                        var192.getClass();
                        this.Z(var12, var192);
                     } catch (Throwable var184) {
                        var10000 = var184;
                        var10001 = false;
                        break label1530;
                     }
                  }
               } else {
                  try {
                     this.Z(var12, (Object)null);
                  } catch (Throwable var183) {
                     var10000 = var183;
                     var10001 = false;
                     break label1530;
                  }
               }
            }

            if (var1 != null) {
               if (var3 != null) {
                  try {
                     var6 = var3;
                  } catch (Throwable var181) {
                     var10000 = var181;
                     var10001 = false;
                     break label1530;
                  }
               } else {
                  var6 = -1;
               }

               Object var188;
               label1496: {
                  if (var2 != null) {
                     label1494: {
                        try {
                           if (c.E(var2, var1)) {
                              break label1494;
                           }
                        } catch (Throwable var182) {
                           var10000 = var182;
                           var10001 = false;
                           break label1530;
                        }

                        if (var6 >= 0) {
                           try {
                              var1.e = var2;
                              var1.f = var6;
                           } catch (Throwable var180) {
                              var10000 = var180;
                              var10001 = false;
                              break label1530;
                           }

                           Object var190;
                           try {
                              var190 = var5.a();
                           } finally {
                              try {
                                 var1.e = null;
                                 var1.f = 0;
                              } catch (Throwable var176) {
                                 var10000 = var176;
                                 var10001 = false;
                                 break label1530;
                              }
                           }

                           var188 = var190;
                           break label1496;
                        }
                     }
                  }

                  try {
                     var188 = var5.a();
                  } catch (Throwable var178) {
                     var10000 = var178;
                     var10001 = false;
                     break label1530;
                  }
               }

               if (var188 != null) {
                  break label1526;
               }
            }

            label1480:
            try {
               var5.a();
               break label1526;
            } catch (Throwable var177) {
               var10000 = var177;
               var10001 = false;
               break label1480;
            }
         }

         Throwable var189 = var10000;
         this.i = var11;
         this.A = var8;
         throw var189;
      }

      this.i = var11;
      this.A = var8;
   }

   public final void ac(dhq var1, qvx var2) {
      qsc var562;
      if (!this.i) {
         Trace.beginSection("Compose:recompose");

         label4464: {
            Throwable var10000;
            Throwable var569;
            label4470: {
               int var4;
               boolean var10001;
               try {
                  this.H = azp.b().u();
                  this.x.ay();
                  var4 = var1.a;
               } catch (Throwable var561) {
                  var10000 = var561;
                  var10001 = false;
                  break label4470;
               }

               int var3;
               Object var7;
               for(var3 = 0; var3 < var4; ++var3) {
                  axb var6;
                  nxj var8;
                  aug var573;
                  try {
                     var7 = ((Object[])var1.b)[var3];
                     var7.getClass();
                     var6 = (axb)((Object[])var1.c)[var3];
                     var573 = (aug)var7;
                     var8 = var573.g;
                  } catch (Throwable var560) {
                     var10000 = var560;
                     var10001 = false;
                     break label4470;
                  }

                  if (var8 == null) {
                     break label4464;
                  }

                  try {
                     int var5 = var8.a;
                     List var575 = this.f;
                     atl var9 = new atl(var573, var5, var6);
                     var575.add(var9);
                  } catch (Throwable var559) {
                     var10000 = var559;
                     var10001 = false;
                     break label4470;
                  }
               }

               try {
                  List var570 = this.f;
                  if (var570.size() > 1) {
                     wr var563 = new wr(2);
                     pwm.aq(var570, var563);
                  }
               } catch (Throwable var558) {
                  var10000 = var558;
                  var10001 = false;
                  break label4470;
               }

               try {
                  this.A = 0;
                  this.i = true;
               } catch (Throwable var557) {
                  var10000 = var557;
                  var10001 = false;
                  break label4470;
               }

               label4472: {
                  try {
                     this.j = this.c.a();
                     this.ao(100);
                     this.b.h();
                     this.E = this.b.b();
                     this.s.j(asr.a(this.g));
                     this.g = this.B(this.E);
                     this.n = null;
                     if (!this.e) {
                        this.e = this.b.j();
                     }
                  } catch (Throwable var549) {
                     var10000 = var549;
                     var10001 = false;
                     break label4472;
                  }

                  Set var564;
                  try {
                     var564 = (Set)li.b(this.E, bap.a);
                  } catch (Throwable var548) {
                     var10000 = var548;
                     var10001 = false;
                     break label4472;
                  }

                  if (var564 != null) {
                     try {
                        var564.add(this.c);
                        this.b.f(var564);
                     } catch (Throwable var547) {
                        var10000 = var547;
                        var10001 = false;
                        break label4472;
                     }
                  }

                  Object var571;
                  try {
                     this.ao(this.b.a());
                     var571 = this.O();
                  } catch (Throwable var546) {
                     var10000 = var546;
                     var10001 = false;
                     break label4472;
                  }

                  if (var571 != var2 && var2 != null) {
                     try {
                        this.Y(var2);
                     } catch (Throwable var545) {
                        var10000 = var545;
                        var10001 = false;
                        break label4472;
                     }
                  }

                  axf var565;
                  bab var574;
                  try {
                     var574 = this.I;
                     var565 = avg.c();
                  } catch (Throwable var544) {
                     var10000 = var544;
                     var10001 = false;
                     break label4472;
                  }

                  label4473: {
                     label4474: {
                        try {
                           var565.p(var574);
                        } catch (Throwable var554) {
                           var10000 = var554;
                           var10001 = false;
                           break label4474;
                        }

                        if (var2 != null) {
                           label4409:
                           try {
                              this.W(200, asr.a);
                              lh.f(this, var2);
                              this.S();
                           } catch (Throwable var551) {
                              var10000 = var551;
                              var10001 = false;
                              break label4409;
                           }
                        } else {
                           label4476: {
                              label4427: {
                                 try {
                                    if (!this.g) {
                                       break label4427;
                                    }
                                 } catch (Throwable var556) {
                                    var10000 = var556;
                                    var10001 = false;
                                    break label4476;
                                 }

                                 if (var571 != null) {
                                    try {
                                       if (!c.E(var571, asl.a)) {
                                          this.W(200, asr.a);
                                          qxb.e(var571, 2);
                                          lh.f(this, (qvx)var571);
                                          this.S();
                                          break label4473;
                                       }
                                    } catch (Throwable var553) {
                                       var10000 = var553;
                                       var10001 = false;
                                       break label4476;
                                    }
                                 }
                              }

                              try {
                                 if (this.f.isEmpty()) {
                                    this.U();
                                    break label4473;
                                 }
                              } catch (Throwable var555) {
                                 var10000 = var555;
                                 var10001 = false;
                                 break label4476;
                              }

                              label4411:
                              try {
                                 aus var572 = this.j;
                                 var3 = var572.a();
                                 Object var566 = var572.h();
                                 var7 = var572.g();
                                 this.aq(var3, var566, var7);
                                 this.ap(pu.w(var572.b, var572.f), (Object)null);
                                 this.aj();
                                 var572.r();
                                 this.as(var3, var566, var7);
                              } catch (Throwable var552) {
                                 var10000 = var552;
                                 var10001 = false;
                                 break label4411;
                              }
                           }
                        }
                        break label4473;
                     }

                     Throwable var567 = var10000;

                     try {
                        var565.c(var565.b - 1);
                        throw var567;
                     } catch (Throwable var540) {
                        var10000 = var540;
                        var10001 = false;
                        break label4472;
                     }
                  }

                  label4404: {
                     label4403: {
                        try {
                           var565.c(var565.b - 1);
                           this.S();
                           this.b.e();
                           this.S();
                           this.o.c();
                           avn var568 = this.o;
                           var568.g();
                           if (!var568.g.k()) {
                              break label4403;
                           }

                           if (!this.O.n()) {
                              break label4404;
                           }

                           this.Q();
                           this.j.q();
                        } catch (Throwable var550) {
                           var10000 = var550;
                           var10001 = false;
                           break label4472;
                        }

                        try {
                           this.i = false;
                           this.f.clear();
                           break label4464;
                        } catch (Throwable var543) {
                           var10000 = var543;
                           var10001 = false;
                           break label4470;
                        }
                     }

                     try {
                        asr.k("Missed recording an endGroup()");
                        var562 = new qsc();
                        throw var562;
                     } catch (Throwable var542) {
                        var10000 = var542;
                        var10001 = false;
                        break label4472;
                     }
                  }

                  label4375:
                  try {
                     asr.k("Start/end imbalance");
                     var562 = new qsc();
                     throw var562;
                  } catch (Throwable var541) {
                     var10000 = var541;
                     var10001 = false;
                     break label4375;
                  }
               }

               var569 = var10000;

               label4369:
               try {
                  this.i = false;
                  this.f.clear();
                  this.P();
                  throw var569;
               } catch (Throwable var539) {
                  var10000 = var539;
                  var10001 = false;
                  break label4369;
               }
            }

            var569 = var10000;
            Trace.endSection();
            throw var569;
         }

         Trace.endSection();
      } else {
         asr.k("Reentrant composition is not supported");
         var562 = new qsc();
         throw var562;
      }
   }

   public final asm b(int var1) {
      boolean var2 = false;
      this.V(var1, (Object)null, 0, (Object)null);
      aug var3;
      if (this.p) {
         var3 = new aug(this.r);
         this.v.p(var3);
         this.Y(var3);
         var3.g(this.H);
      } else {
         atl var4 = asr.f(this.f, this.j.h);
         Object var5 = this.j.m();
         if (c.E(var5, asl.a)) {
            var3 = new aug(this.r);
            this.Y(var3);
         } else {
            var5.getClass();
            var3 = (aug)var5;
         }

         if (var4 != null) {
            var2 = true;
         }

         var3.d(var2);
         this.v.p(var3);
         var3.g(this.H);
      }

      return this;
   }

   public final ata c() {
      return this.L();
   }

   public final bao d() {
      return this.c;
   }

   public final Object e(asy var1) {
      var1.getClass();
      return li.b(this.L(), var1);
   }

   public final Object f() {
      return this.O();
   }

   public final qui g() {
      return this.b.c();
   }

   public final void h(Object var1, qvx var2) {
      boolean var9 = this.p;
      int var6 = 0;
      byte var7 = 0;
      int var3;
      int var4;
      int var5;
      Object var11;
      StringBuilder var12;
      String var13;
      StringBuilder var15;
      String var16;
      awq var18;
      awy var19;
      if (var9) {
         var11 = this.N.a;
         var18 = awq.a;
         var19 = (awy)var11;
         var19.d(var18);
         awx.b(var19, 0, var1);
         qxb.e(var2, 2);
         awx.b(var19, 1, var2);
         if (var19.g != awy.h(var18.b) || var19.h != awy.h(var18.c)) {
            var12 = new StringBuilder();
            var6 = var18.b;
            var4 = 0;

            for(var3 = 0; var4 < var6; var3 = var5) {
               var5 = var3;
               if ((1 << var4 & var19.g) != 0) {
                  if (var3 > 0) {
                     var12.append(", ");
                  }

                  var12.append(var18.a(var4));
                  var5 = var3 + 1;
               }

               ++var4;
            }

            var13 = var12.toString();
            var15 = new StringBuilder();
            int var8 = var18.c;
            var5 = 0;

            for(var4 = var7; var4 < var8; var5 = var6) {
               var6 = var5;
               if ((1 << var4 & var19.h) != 0) {
                  if (var3 > 0) {
                     var15.append(", ");
                  }

                  var15.append(var18.c(var4));
                  var6 = var5 + 1;
               }

               ++var4;
            }

            var16 = var15.toString();
            throw new IllegalStateException(nx.c(new StringBuilder(), var16, var5, var13, var3, var18));
         }
      } else {
         avn var10 = this.o;
         var10.g();
         var11 = var10.h.a;
         var18 = awq.a;
         var19 = (awy)var11;
         var19.d(var18);
         awx.b(var19, 0, var1);
         qxb.e(var2, 2);
         awx.b(var19, 1, var2);
         if (var19.g != awy.h(var18.b) || var19.h != awy.h(var18.c)) {
            var12 = new StringBuilder();
            int var17 = var18.b;
            var4 = 0;

            for(var3 = 0; var4 < var17; var3 = var5) {
               var5 = var3;
               if ((1 << var4 & var19.g) != 0) {
                  if (var3 > 0) {
                     var12.append(", ");
                  }

                  var12.append(var18.a(var4));
                  var5 = var3 + 1;
               }

               ++var4;
            }

            var13 = var12.toString();
            var15 = new StringBuilder();
            var17 = var18.c;

            for(var4 = 0; var6 < var17; var4 = var5) {
               var5 = var4;
               if ((1 << var6 & var19.h) != 0) {
                  if (var3 > 0) {
                     var15.append(", ");
                  }

                  var15.append(var18.c(var6));
                  var5 = var4 + 1;
               }

               ++var6;
            }

            var16 = var15.toString();
            IllegalStateException var14 = new IllegalStateException(nx.c(new StringBuilder(), var16, var4, var13, var3, var18));
            throw var14;
         }
      }

   }

   public final void i() {
      this.e = true;
   }

   public final void j(qvi var1) {
      var1.getClass();
      this.av();
      if (this.p) {
         int var2 = this.J.f();
         auw var8 = this.l;
         nxj var9 = var8.U(var8.p);
         ++this.B;
         blj var11 = this.N;
         Object var10 = var11.a;
         awc var18 = awc.a;
         awy var24 = (awy)var10;
         var24.d(var18);
         byte var6 = 0;
         byte var5 = 0;
         awx.b(var24, 0, var1);
         awx.a(var24, 0, var2);
         awx.b(var24, 1, var9);
         int var3;
         int var4;
         int var16;
         StringBuilder var21;
         String var23;
         if (var24.g == awy.h(var18.b) && var24.h == awy.h(var18.c)) {
            Object var19 = var11.b;
            awh var15 = awh.a;
            awy var20 = (awy)var19;
            var20.d(var15);
            awx.a(var20, 0, var2);
            awx.b(var20, 0, var9);
            if (var20.g != awy.h(var15.b) || var20.h != awy.h(var15.c)) {
               var21 = new StringBuilder();
               int var17 = var15.b;
               var3 = 0;

               for(var2 = 0; var3 < var17; var2 = var4) {
                  var4 = var2;
                  if ((1 << var3 & var20.g) != 0) {
                     if (var2 > 0) {
                        var21.append(", ");
                     }

                     var21.append(var15.a(var3));
                     var4 = var2 + 1;
                  }

                  ++var3;
               }

               var23 = var21.toString();
               StringBuilder var25 = new StringBuilder();
               var17 = var15.c;
               var3 = 0;

               for(var4 = var5; var4 < var17; var3 = var16) {
                  var16 = var3;
                  if ((1 << var4 & var20.h) != 0) {
                     if (var2 > 0) {
                        var25.append(", ");
                     }

                     var25.append(var15.c(var4));
                     var16 = var3 + 1;
                  }

                  ++var4;
               }

               String var22 = var25.toString();
               throw new IllegalStateException(nx.c(new StringBuilder(), var22, var3, var23, var2, var15));
            }
         } else {
            StringBuilder var13 = new StringBuilder();
            var16 = var18.b;
            var3 = 0;

            for(var2 = 0; var3 < var16; var2 = var4) {
               var4 = var2;
               if ((1 << var3 & var24.g) != 0) {
                  if (var2 > 0) {
                     var13.append(", ");
                  }

                  var13.append(var18.a(var3));
                  var4 = var2 + 1;
               }

               ++var3;
            }

            String var14 = var13.toString();
            var21 = new StringBuilder();
            int var7 = var18.c;
            var4 = 0;

            for(var3 = var6; var3 < var7; var4 = var16) {
               var16 = var4;
               if ((1 << var3 & var24.h) != 0) {
                  if (var2 > 0) {
                     var21.append(", ");
                  }

                  var21.append(var18.c(var3));
                  var16 = var4 + 1;
               }

               ++var3;
            }

            var23 = var21.toString();
            throw new IllegalStateException(nx.c(new StringBuilder(), var23, var4, var14, var2, var18));
         }
      } else {
         asr.k("createNode() can only be called when inserting");
         qsc var12 = new qsc();
         throw var12;
      }
   }

   public final void k(boolean var1) {
      if (this.B != 0) {
         asr.k("No nodes can be emitted before calling dactivateToEndGroup");
         qsc var15 = new qsc();
         throw var15;
      } else if (!this.p) {
         if (!var1) {
            this.an();
         } else {
            aus var8 = this.j;
            int var4 = var8.f;
            int var7 = var8.g;

            int var6;
            for(int var2 = var4; var2 < var7; var2 = var6) {
               int var3;
               int var5;
               if (this.j.w(var2)) {
                  Object var9 = this.j.n(var2);
                  if (var9 instanceof asi) {
                     avn var12 = this.o;
                     asi var10 = (asi)var9;
                     var10.getClass();
                     var9 = var12.h.a;
                     avu var13 = avu.a;
                     awy var16 = (awy)var9;
                     var16.d(var13);
                     var5 = 0;
                     awx.b(var16, 0, var10);
                     if (var16.g != awy.h(var13.b) || var16.h != awy.h(var13.c)) {
                        StringBuilder var20 = new StringBuilder();
                        var6 = var13.b;
                        var3 = 0;

                        for(var2 = 0; var3 < var6; var2 = var4) {
                           var4 = var2;
                           if ((1 << var3 & var16.g) != 0) {
                              if (var2 > 0) {
                                 var20.append(", ");
                              }

                              var20.append(var13.a(var3));
                              var4 = var2 + 1;
                           }

                           ++var3;
                        }

                        String var21 = var20.toString();
                        StringBuilder var11 = new StringBuilder();
                        var6 = var13.c;

                        for(var3 = 0; var5 < var6; var3 = var4) {
                           var4 = var3;
                           if ((1 << var5 & var16.h) != 0) {
                              if (var2 > 0) {
                                 var11.append(", ");
                              }

                              var11.append(var13.c(var5));
                              var4 = var3 + 1;
                           }

                           ++var5;
                        }

                        String var19 = var11.toString();
                        throw new IllegalStateException(nx.c(new StringBuilder(), var19, var3, var21, var2, var13));
                     }
                  }
               }

               aus var18 = this.j;
               ajh var17 = new ajh(this, var2, 7);
               var5 = pu.m(var18.b, var2);
               var6 = var2 + 1;
               aut var14 = var18.a;
               if (var6 < var14.b) {
                  var2 = pu.e(var14.a, var6);
               } else {
                  var2 = var14.d;
               }

               for(var3 = var5; var3 < var2; ++var3) {
                  var17.a(var3 - var5, var18.d[var3]);
               }
            }

            asr.h(this.f, var4, var7);
            this.j.s(var4);
            this.j.t();
         }
      }
   }

   public final void l() {
      this.S();
      aug var1 = this.N();
      if (var1 != null && var1.i()) {
         var1.a |= 2;
      }

   }

   public final void m() {
      this.ah(true);
   }

   public final void n() {
      this.S();
   }

   public final void o() {
      if (this.F && this.j.h == this.G) {
         this.G = -1;
         this.F = false;
      }

      this.ah(false);
   }

   public final void p(qvi var1) {
      Object var8 = this.o.h.a;
      awn var7 = awn.a;
      awy var13 = (awy)var8;
      var13.d(var7);
      int var5 = 0;
      awx.b(var13, 0, var1);
      if (var13.g != awy.h(var7.b) || var13.h != awy.h(var7.c)) {
         StringBuilder var10 = new StringBuilder();
         int var6 = var7.b;
         int var4 = 0;

         int var2;
         int var3;
         for(var2 = 0; var4 < var6; var2 = var3) {
            var3 = var2;
            if ((1 << var4 & var13.g) != 0) {
               if (var2 > 0) {
                  var10.append(", ");
               }

               var10.append(var7.a(var4));
               var3 = var2 + 1;
            }

            ++var4;
         }

         String var11 = var10.toString();
         StringBuilder var9 = new StringBuilder();
         var6 = var7.c;

         for(var4 = 0; var5 < var6; var4 = var3) {
            var3 = var4;
            if ((1 << var5 & var13.h) != 0) {
               if (var2 > 0) {
                  var9.append(", ");
               }

               var9.append(var7.c(var5));
               var3 = var4 + 1;
            }

            ++var5;
         }

         String var14 = var9.toString();
         IllegalStateException var12 = new IllegalStateException(nx.c(new StringBuilder(), var14, var4, var11, var2, var7));
         throw var12;
      }
   }

   public final void q() {
      if (this.B == 0) {
         aug var1 = this.N();
         if (var1 != null) {
            var1.f(true);
         }

         if (this.f.isEmpty()) {
            this.an();
         } else {
            this.aj();
         }
      } else {
         asr.k("No nodes can be emitted before calling skipAndEndGroup");
         throw new qsc();
      }
   }

   public final void r() {
      this.V(-127, (Object)null, 0, (Object)null);
   }

   public final void s(int var1, Object var2) {
      this.V(var1, var2, 0, (Object)null);
   }

   public final void t() {
      this.V(125, (Object)null, 1, (Object)null);
      this.D = true;
   }

   public final void u(int var1) {
      this.V(var1, (Object)null, 0, (Object)null);
   }

   public final void v() {
      this.V(125, (Object)null, 2, (Object)null);
      this.D = true;
   }

   public final void w(Object var1) {
      this.Y(var1);
   }

   public final void x() {
      this.av();
      if (!this.p) {
         aus var1 = this.j;
         Object var3 = var1.n(var1.h);
         this.o.d(var3);
         if (this.F && var3 instanceof asi) {
            avn var4 = this.o;
            var4.g();
            Object var2 = var4.h.a;
            awt var5 = awt.a;
            ((awy)var2).c(var5);
         }
      } else {
         asr.k(bmSypa.aRnQlBhfKo);
         throw new qsc();
      }
   }

   public final boolean y(float var1) {
      Object var2 = this.O();
      if (var2 instanceof Float && var1 == ((Number)var2).floatValue()) {
         return false;
      } else {
         this.Y(var1);
         return true;
      }
   }

   public final boolean z(int var1) {
      Object var2 = this.O();
      if (var2 instanceof Integer && var1 == ((Number)var2).intValue()) {
         return false;
      } else {
         this.Y(var1);
         return true;
      }
   }
}
