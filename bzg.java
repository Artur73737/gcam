import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public final class bzg extends bzm {
   public final bzq a = new bzq(this);
   public boolean aA = false;
   public boolean aB = false;
   public WeakReference aC = null;
   public WeakReference aD = null;
   public WeakReference aE = null;
   public WeakReference aF = null;
   final HashSet aG = new HashSet();
   public final bzn aH = new bzn();
   public cae aI = null;
   public final ve aJ = new ve(this);
   public final byv as = new byv();
   public int at;
   public int au;
   public int av = 0;
   public int aw = 0;
   public bzc[] ax = new bzc[4];
   public bzc[] ay = new bzc[4];
   public int az = 257;
   public int b;
   public boolean c = false;
   public byw d;

   public static void Z(bzf var0, cae var1, bzn var2) {
      if (var1 != null) {
         if (var0.ai != 8 && !(var0 instanceof bzi) && !(var0 instanceof bzb)) {
            var2.i = var0.O();
            var2.j = var0.P();
            var2.a = var0.j();
            var2.b = var0.h();
            var2.g = false;
            var2.h = 0;
            boolean var4;
            if (var2.i == 3) {
               var4 = true;
            } else {
               var4 = false;
            }

            boolean var5;
            if (var2.j == 3) {
               var5 = true;
            } else {
               var5 = false;
            }

            boolean var7;
            if (var4 && var0.Y > 0.0F) {
               var7 = true;
            } else {
               var7 = false;
            }

            boolean var6;
            if (var5 && var0.Y > 0.0F) {
               var6 = true;
            } else {
               var6 = false;
            }

            boolean var3 = var4;
            if (var4) {
               var3 = var4;
               if (var0.I(0)) {
                  var3 = var4;
                  if (var0.t == 0) {
                     var3 = var4;
                     if (!var7) {
                        var2.i = 2;
                        if (var5 && var0.u == 0) {
                           var2.i = 1;
                           var3 = false;
                        } else {
                           var3 = false;
                        }
                     }
                  }
               }
            }

            var4 = var5;
            if (var5) {
               var4 = var5;
               if (var0.I(1)) {
                  var4 = var5;
                  if (var0.u == 0) {
                     var4 = var5;
                     if (!var6) {
                        var2.j = 2;
                        if (var3 && var0.t == 0) {
                           var2.j = 1;
                           var4 = false;
                        } else {
                           var4 = false;
                        }
                     }
                  }
               }
            }

            if (var0.e()) {
               var2.i = 1;
               var3 = false;
            }

            if (var0.f()) {
               var2.j = 1;
               var4 = false;
            }

            if (var7) {
               if (var0.v[0] == 4) {
                  var2.i = 1;
               } else if (!var4) {
                  int var10;
                  if (var2.j == 1) {
                     var10 = var2.b;
                  } else {
                     var2.i = 2;
                     var1.a(var0, var2);
                     var10 = var2.d;
                  }

                  var2.i = 1;
                  var2.a = (int)(var0.Y * (float)var10);
               }
            }

            if (var6) {
               if (var0.v[1] == 4) {
                  var2.j = 1;
               } else if (!var3) {
                  int var9;
                  if (var2.i == 1) {
                     var9 = var2.a;
                  } else {
                     var2.j = 2;
                     var1.a(var0, var2);
                     var9 = var2.c;
                  }

                  var2.j = 1;
                  if (var0.Z == -1) {
                     var2.b = (int)((float)var9 / var0.Y);
                  } else {
                     var2.b = (int)(var0.Y * (float)var9);
                  }
               }
            }

            var1.a(var0, var2);
            var0.F(var2.c);
            var0.A(var2.d);
            var0.G = var2.f;
            var0.x(var2.e);
            var2.h = 0;
            boolean var8 = var2.g;
         } else {
            var2.c = 0;
            var2.d = 0;
         }
      }
   }

   private final void ab(bze var1, byz var2) {
      byz var3 = this.as.b(var1);
      this.as.g(var2, var3, 0, 5);
   }

   private final void ac(bze var1, byz var2) {
      byz var3 = this.as.b(var1);
      this.as.g(var3, var2, 0, 5);
   }

   private final void ad() {
      this.av = 0;
      this.aw = 0;
   }

   public final void G(boolean var1, boolean var2) {
      super.G(var1, var2);
      int var4 = this.aK.size();

      for(int var3 = 0; var3 < var4; ++var3) {
         ((bzf)this.aK.get(var3)).G(var1, var2);
      }

   }

   public final void U() {
      this.a.b = true;
   }

   public final void V() {
      this.aa = 0;
      this.ab = 0;
      this.aA = false;
      this.aB = false;
      int var4 = this.aK.size();
      int var2 = Math.max(0, this.j());
      int var1 = Math.max(0, this.h());
      int[] var17 = this.ar;
      int var6 = var17[1];
      int var5 = var17[0];
      byw var115 = this.d;
      if (var115 != null) {
         ++var115.B;
      }

      int var3;
      int var7;
      int var8;
      boolean var10;
      int var11;
      int var12;
      boolean var15;
      ArrayList var18;
      bzf var19;
      boolean var104;
      boolean var106;
      bzf var120;
      bzb var124;
      if (this.b == 0 && bzk.b(this.az, 1)) {
         cae var117 = this.aI;
         var7 = this.O();
         var12 = this.P();
         bzt.b = 0;
         bzt.c = 0;
         this.w();
         var18 = super.aK;
         var11 = var18.size();

         for(var3 = 0; var3 < var11; ++var3) {
            ((bzf)var18.get(var3)).w();
         }

         var15 = this.c;
         boolean var9;
         if (var7 == 1) {
            this.y(0, this.j());
            var8 = 0;
            var9 = false;
            var106 = false;
         } else {
            super.K.e(0);
            super.aa = 0;
            var8 = 0;
            var9 = false;
            var106 = false;
         }

         bzi var122;
         while(var8 < var11) {
            var19 = (bzf)var18.get(var8);
            if (var19 instanceof bzi) {
               var122 = (bzi)var19;
               var104 = var9;
               var10 = var106;
               if (var122.as == 1) {
                  var3 = var122.b;
                  if (var3 != -1) {
                     var122.a(var3);
                     var104 = true;
                     var10 = var106;
                  } else if (var122.c != -1 && this.e()) {
                     var122.a(this.j() - var122.c);
                     var104 = true;
                     var10 = var106;
                  } else {
                     if (this.e()) {
                        var122.a((int)(var122.a * (float)this.j() + 0.5F));
                     }

                     var104 = true;
                     var10 = var106;
                  }
               }
            } else {
               var104 = var9;
               var10 = var106;
               if (var19 instanceof bzb) {
                  var104 = var9;
                  var10 = var106;
                  if (((bzb)var19).a() == 0) {
                     var10 = true;
                     var104 = var9;
                  }
               }
            }

            ++var8;
            var9 = var104;
            var106 = var10;
         }

         if (var9) {
            for(var3 = 0; var3 < var11; ++var3) {
               var19 = (bzf)var18.get(var3);
               if (var19 instanceof bzi) {
                  var122 = (bzi)var19;
                  if (var122.as == 1) {
                     bzt.a(0, var122, var117, var15);
                  }
               }
            }
         }

         bzt.a(0, this, var117, var15);
         if (var106) {
            for(var3 = 0; var3 < var11; ++var3) {
               var19 = (bzf)var18.get(var3);
               if (var19 instanceof bzb) {
                  var124 = (bzb)var19;
                  if (var124.a() == 0) {
                     bzt.d(var124, var117, 0, var15);
                  }
               }
            }
         }

         if (var12 == 1) {
            var3 = this.h();
            var8 = 0;
            this.z(0, var3);
            var9 = false;
            var106 = false;
         } else {
            super.L.e(0);
            super.ab = 0;
            var9 = false;
            var8 = 0;
            var106 = false;
         }

         while(var8 < var11) {
            var19 = (bzf)var18.get(var8);
            if (var19 instanceof bzi) {
               var122 = (bzi)var19;
               var104 = var9;
               var10 = var106;
               if (var122.as == 0) {
                  var3 = var122.b;
                  if (var3 != -1) {
                     var122.a(var3);
                     var104 = true;
                     var10 = var106;
                  } else if (var122.c != -1 && this.f()) {
                     var122.a(this.h() - var122.c);
                     var104 = true;
                     var10 = var106;
                  } else {
                     if (this.f()) {
                        var122.a((int)(var122.a * (float)this.h() + 0.5F));
                     }

                     var104 = true;
                     var10 = var106;
                  }
               }
            } else {
               var104 = var9;
               var10 = var106;
               if (var19 instanceof bzb) {
                  var104 = var9;
                  var10 = var106;
                  if (((bzb)var19).a() == 1) {
                     var10 = true;
                     var104 = var9;
                  }
               }
            }

            ++var8;
            var9 = var104;
            var106 = var10;
         }

         if (var9) {
            for(var3 = 0; var3 < var11; ++var3) {
               var19 = (bzf)var18.get(var3);
               if (var19 instanceof bzi) {
                  var122 = (bzi)var19;
                  if (var122.as == 0) {
                     bzt.b(1, var122, var117);
                  }
               }
            }
         }

         bzt.b(0, this, var117);
         if (!var106) {
            var3 = 0;
         } else {
            for(var3 = 0; var3 < var11; ++var3) {
               var19 = (bzf)var18.get(var3);
               if (var19 instanceof bzb) {
                  var124 = (bzb)var19;
                  if (var124.a() == 1) {
                     bzt.d(var124, var117, 1, var15);
                  }
               }
            }

            var3 = 0;
         }

         for(; var3 < var11; ++var3) {
            var19 = (bzf)var18.get(var3);
            if (var19.M() && bzt.c(var19)) {
               Z(var19, var117, bzt.a);
               if (var19 instanceof bzi) {
                  if (((bzi)var19).as == 0) {
                     bzt.b(0, var19, var117);
                  } else {
                     bzt.a(0, var19, var117, var15);
                  }
               } else {
                  bzt.a(0, var19, var117, var15);
                  bzt.b(0, var19, var117);
               }
            }
         }

         for(var3 = 0; var3 < var4; ++var3) {
            var120 = (bzf)this.aK.get(var3);
            if (var120.M() && !(var120 instanceof bzi) && !(var120 instanceof bzb) && !(var120 instanceof bzl)) {
               var15 = var120.H;
               var8 = var120.N(0);
               var7 = var120.N(1);
               if (var8 != 3 || var120.t == 1 || var7 != 3 || var120.u == 1) {
                  bzn var118 = new bzn();
                  Z(var120, this.aI, var118);
               }
            }
         }
      }

      boolean var103;
      int var110;
      int var113;
      ArrayList var121;
      int[] var123;
      label1323: {
         label1322: {
            var7 = var6;
            if (var4 > 2) {
               if (var5 != 2) {
                  if (var6 != 2) {
                     var7 = var5;
                     var5 = var6;
                     var6 = var4;
                     var104 = false;
                     var103 = var104;
                     var3 = var2;
                     var2 = var1;
                     var4 = var7;
                     break label1323;
                  }

                  var3 = 2;
               } else {
                  var3 = var6;
               }

               var7 = var3;
               if (bzk.b(this.az, 1024)) {
                  cae var29 = this.aI;
                  ArrayList var28 = super.aK;
                  var7 = var28.size();

                  bzf var119;
                  for(var6 = 0; var6 < var7; ++var6) {
                     var119 = (bzf)var28.get(var6);
                     if (!car.w(this.O(), this.P(), var119.O(), var119.P())) {
                        var6 = var3;
                        var7 = var4;
                        var104 = false;
                        var103 = var104;
                        var3 = var2;
                        var2 = var1;
                        var4 = var5;
                        var5 = var6;
                        var6 = var7;
                        break label1323;
                     }

                     if (var119 instanceof bzh) {
                        var7 = var3;
                        var6 = var4;
                        var104 = false;
                        var103 = var104;
                        var3 = var2;
                        var2 = var1;
                        var4 = var5;
                        var5 = var7;
                        break label1323;
                     }
                  }

                  var115 = this.d;
                  ArrayList var20;
                  ArrayList var21;
                  ArrayList var22;
                  ArrayList var133;
                  if (var115 != null) {
                     ++var115.C;
                     var22 = null;
                     var6 = 0;
                     var121 = null;
                     var133 = null;
                     var18 = null;
                     var21 = null;
                     var20 = null;
                  } else {
                     var22 = null;
                     var6 = 0;
                     var121 = null;
                     var133 = null;
                     var18 = null;
                     var21 = null;
                     var20 = null;
                  }

                  ArrayList var23;
                  while(var6 < var7) {
                     bzf var30 = (bzf)var28.get(var6);
                     if (!car.w(this.O(), this.P(), var30.O(), var30.P())) {
                        Z(var30, var29, this.aH);
                     }

                     var15 = var30 instanceof bzi;
                     ArrayList var25 = var22;
                     ArrayList var24 = var133;
                     if (var15) {
                        bzi var26 = (bzi)var30;
                        var23 = var133;
                        if (var26.as == 0) {
                           var23 = var133;
                           if (var133 == null) {
                              var23 = new ArrayList();
                           }

                           var23.add(var26);
                        }

                        var25 = var22;
                        var24 = var23;
                        if (var26.as == 1) {
                           var133 = var22;
                           if (var22 == null) {
                              var133 = new ArrayList();
                           }

                           var133.add(var26);
                           var24 = var23;
                           var25 = var133;
                        }
                     }

                     var133 = var121;
                     var23 = var18;
                     if (var30 instanceof bzj) {
                        if (var30 instanceof bzb) {
                           bzb var141 = (bzb)var30;
                           var22 = var121;
                           if (var141.a() == 0) {
                              var22 = var121;
                              if (var121 == null) {
                                 var22 = new ArrayList();
                              }

                              var22.add(var141);
                           }

                           var133 = var22;
                           var23 = var18;
                           if (var141.a() == 1) {
                              var23 = var18;
                              if (var18 == null) {
                                 var23 = new ArrayList();
                              }

                              var23.add(var141);
                              var133 = var22;
                           }
                        } else {
                           bzj var136 = (bzj)var30;
                           var133 = var121;
                           if (var121 == null) {
                              var133 = new ArrayList();
                           }

                           var133.add(var136);
                           var23 = var18;
                           if (var18 == null) {
                              var23 = new ArrayList();
                           }

                           var23.add(var136);
                        }
                     }

                     ArrayList var142 = var21;
                     if (var30.K.f == null) {
                        var142 = var21;
                        if (var30.M.f == null) {
                           var142 = var21;
                           if (!var15) {
                              var142 = var21;
                              if (!(var30 instanceof bzb)) {
                                 var121 = var21;
                                 if (var21 == null) {
                                    var121 = new ArrayList();
                                 }

                                 var121.add(var30);
                                 var142 = var121;
                              }
                           }
                        }
                     }

                     ArrayList var27 = var20;
                     if (var30.L.f == null) {
                        var27 = var20;
                        if (var30.N.f == null) {
                           var27 = var20;
                           if (var30.O.f == null) {
                              var27 = var20;
                              if (!var15) {
                                 var27 = var20;
                                 if (!(var30 instanceof bzb)) {
                                    var121 = var20;
                                    if (var20 == null) {
                                       var121 = new ArrayList();
                                    }

                                    var121.add(var30);
                                    var27 = var121;
                                 }
                              }
                           }
                        }
                     }

                     ++var6;
                     var22 = var25;
                     var121 = var133;
                     var133 = var24;
                     var18 = var23;
                     var21 = var142;
                     var20 = var27;
                  }

                  var6 = var4;
                  var23 = new ArrayList();
                  if (var22 != null) {
                     var8 = var22.size();

                     for(var4 = 0; var4 < var8; ++var4) {
                        car.u((bzi)var22.get(var4), 0, var23, (bzy)null);
                     }
                  }

                  if (var121 != null) {
                     var8 = var121.size();

                     for(var4 = 0; var4 < var8; ++var4) {
                        bzj var138 = (bzj)var121.get(var4);
                        bzy var139 = car.u(var138, 0, var23, (bzy)null);
                        var138.U(var23, 0, var139);
                        var139.b(var23);
                     }
                  }

                  HashSet var129 = this.m(bzd.b).a;
                  Iterator var131;
                  if (var129 != null) {
                     var131 = var129.iterator();

                     while(var131.hasNext()) {
                        car.u(((bze)var131.next()).d, 0, var23, (bzy)null);
                     }
                  }

                  var129 = this.m(bzd.d).a;
                  if (var129 != null) {
                     var131 = var129.iterator();

                     while(var131.hasNext()) {
                        car.u(((bze)var131.next()).d, 0, var23, (bzy)null);
                     }
                  }

                  var129 = this.m(bzd.g).a;
                  if (var129 != null) {
                     var131 = var129.iterator();

                     while(var131.hasNext()) {
                        car.u(((bze)var131.next()).d, 0, var23, (bzy)null);
                     }
                  }

                  if (var21 != null) {
                     var8 = var21.size();

                     for(var4 = 0; var4 < var8; ++var4) {
                        car.u((bzf)var21.get(var4), 0, var23, (bzy)null);
                     }
                  }

                  if (var133 != null) {
                     var8 = var133.size();

                     for(var4 = 0; var4 < var8; ++var4) {
                        car.u((bzi)var133.get(var4), 1, var23, (bzy)null);
                     }
                  }

                  bzy var137;
                  if (var18 != null) {
                     var8 = var18.size();

                     for(var4 = 0; var4 < var8; ++var4) {
                        bzj var143 = (bzj)var18.get(var4);
                        var137 = car.u(var143, 1, var23, (bzy)null);
                        var143.U(var23, 1, var137);
                        var137.b(var23);
                     }
                  }

                  var129 = this.m(bzd.c).a;
                  if (var129 != null) {
                     var131 = var129.iterator();

                     while(var131.hasNext()) {
                        car.u(((bze)var131.next()).d, 1, var23, (bzy)null);
                     }
                  }

                  var129 = this.m(bzd.f).a;
                  if (var129 != null) {
                     var131 = var129.iterator();

                     while(var131.hasNext()) {
                        car.u(((bze)var131.next()).d, 1, var23, (bzy)null);
                     }
                  }

                  var129 = this.m(bzd.e).a;
                  if (var129 != null) {
                     var131 = var129.iterator();

                     while(var131.hasNext()) {
                        car.u(((bze)var131.next()).d, 1, var23, (bzy)null);
                     }
                  }

                  var129 = this.m(bzd.g).a;
                  if (var129 != null) {
                     var131 = var129.iterator();

                     while(var131.hasNext()) {
                        car.u(((bze)var131.next()).d, 1, var23, (bzy)null);
                     }
                  }

                  if (var20 != null) {
                     var8 = var20.size();

                     for(var4 = 0; var4 < var8; ++var4) {
                        car.u((bzf)var20.get(var4), 1, var23, (bzy)null);
                     }

                     var4 = 0;
                  } else {
                     var4 = 0;
                  }

                  bzy var125;
                  for(; var4 < var7; ++var4) {
                     var119 = (bzf)var28.get(var4);
                     var123 = var119.ar;
                     if (var123[0] == 3 && var123[1] == 3) {
                        var125 = car.v(var23, var119.ap);
                        var137 = car.v(var23, var119.aq);
                        if (var125 != null && var137 != null) {
                           var125.c(0, var137);
                           var137.d = 2;
                           var23.remove(var125);
                        }
                     }
                  }

                  if (var23.size() <= 1) {
                     var7 = var3;
                     var103 = false;
                     var3 = var2;
                     var2 = var1;
                     var4 = var5;
                     var5 = var7;
                     break label1323;
                  }

                  bzy var144;
                  label1207: {
                     if (this.O() == 2) {
                        var113 = var23.size();
                        var137 = null;
                        var7 = 0;

                        for(var4 = 0; var7 < var113; var4 = var8) {
                           var144 = (bzy)var23.get(var7);
                           var125 = var137;
                           var8 = var4;
                           if (var144.d != 1) {
                              var110 = var144.a(this.as, 0);
                              if (var110 > var4) {
                                 var137 = var144;
                              }

                              var125 = var137;
                              var8 = var4;
                              if (var110 > var4) {
                                 var8 = var110;
                                 var125 = var137;
                              }
                           }

                           ++var7;
                           var137 = var125;
                        }

                        if (var137 != null) {
                           this.Q(1);
                           this.F(var4);
                           var125 = var137;
                           break label1207;
                        }
                     }

                     var125 = null;
                  }

                  label1196: {
                     if (this.P() == 2) {
                        var113 = var23.size();
                        var137 = null;
                        var7 = 0;

                        for(var4 = 0; var7 < var113; var4 = var8) {
                           bzy var126 = (bzy)var23.get(var7);
                           var144 = var137;
                           var8 = var4;
                           if (var126.d != 0) {
                              var110 = var126.a(this.as, 1);
                              if (var110 > var4) {
                                 var137 = var126;
                              }

                              var144 = var137;
                              var8 = var4;
                              if (var110 > var4) {
                                 var8 = var110;
                                 var144 = var137;
                              }
                           }

                           ++var7;
                           var137 = var144;
                        }

                        if (var137 != null) {
                           this.R(1);
                           this.A(var4);
                           break label1196;
                        }
                     }

                     var137 = null;
                  }

                  if (var125 == null && var137 == null) {
                     var4 = var1;
                     var1 = var3;
                     var3 = var2;
                     var2 = var4;
                     var4 = var5;
                     var5 = var1;
                     break label1322;
                  }

                  if (var5 == 2) {
                     if (var2 < this.j() && var2 > 0) {
                        this.F(var2);
                        this.aA = true;
                        byte var105 = 2;
                        var4 = var2;
                        var2 = var105;
                     } else {
                        var4 = this.j();
                        var2 = 2;
                     }
                  } else {
                     var4 = var2;
                     var2 = var5;
                  }

                  if (var3 != 2) {
                     var5 = var1;
                     var1 = var3;
                     var3 = var5;
                  } else {
                     if (var1 < this.h() && var1 > 0) {
                        this.A(var1);
                        this.aB = true;
                        var3 = var1;
                     } else {
                        var3 = this.h();
                     }

                     var1 = 2;
                  }

                  var7 = var3;
                  var8 = var2;
                  var5 = var1;
                  var103 = true;
                  var3 = var4;
                  var2 = var7;
                  var4 = var8;
                  break label1323;
               }
            }

            var6 = var4;
            var4 = var5;
            var3 = var2;
            var5 = var7;
            var2 = var1;
         }

         var103 = false;
      }

      if (!this.Y(64)) {
         if (this.Y(128)) {
            var106 = true;
         } else {
            var106 = false;
         }
      } else {
         var106 = true;
      }

      byv var146 = this.as;
      var146.g = false;
      var146.h = false;
      if (this.az != 0 && var106) {
         var146.h = true;
      }

      var121 = this.aK;
      boolean var114;
      if (this.O() != 2) {
         if (this.P() == 2) {
            var114 = true;
         } else {
            var114 = false;
         }
      } else {
         var114 = true;
      }

      this.ad();
      byte var116 = 0;
      int var13 = var6;

      for(var6 = var116; var6 < var13; ++var6) {
         var120 = (bzf)this.aK.get(var6);
         if (var120 instanceof bzm) {
            ((bzm)var120).V();
         }
      }

      var106 = true;
      byte var111 = 0;
      boolean var108 = var103;

      for(var1 = var111; var106; var2 = var110) {
         ++var1;
         var7 = var1;

         int var14;
         label1146: {
            label1145: {
               Exception var135;
               label1144: {
                  Exception var10000;
                  label1143: {
                     boolean var10001;
                     label1142: {
                        label1458: {
                           try {
                              this.as.k();
                           } catch (Exception var102) {
                              var10000 = var102;
                              var10001 = false;
                              break label1458;
                           }

                           var7 = var1;

                           try {
                              this.ad();
                           } catch (Exception var101) {
                              var10000 = var101;
                              var10001 = false;
                              break label1458;
                           }

                           var7 = var1;

                           try {
                              this.r(this.as);
                           } catch (Exception var100) {
                              var10000 = var100;
                              var10001 = false;
                              break label1458;
                           }

                           for(var110 = 0; var110 < var13; ++var110) {
                              var7 = var1;

                              try {
                                 ((bzf)this.aK.get(var110)).r(this.as);
                              } catch (Exception var99) {
                                 var10000 = var99;
                                 var10001 = false;
                                 break label1458;
                              }
                           }

                           var7 = var1;

                           byv var127;
                           try {
                              var127 = this.as;
                           } catch (Exception var98) {
                              var10000 = var98;
                              var10001 = false;
                              break label1458;
                           }

                           var7 = var1;

                           try {
                              var15 = this.Y(64);
                           } catch (Exception var97) {
                              var10000 = var97;
                              var10001 = false;
                              break label1458;
                           }

                           var7 = var1;

                           try {
                              this.b(var127, var15);
                           } catch (Exception var96) {
                              var10000 = var96;
                              var10001 = false;
                              break label1458;
                           }

                           var7 = var1;

                           try {
                              var12 = this.aK.size();
                           } catch (Exception var95) {
                              var10000 = var95;
                              var10001 = false;
                              break label1458;
                           }

                           var11 = 0;
                           var10 = false;

                           while(true) {
                              if (var11 < var12) {
                                 label1460: {
                                    var7 = var1;

                                    try {
                                       var19 = (bzf)this.aK.get(var11);
                                    } catch (Exception var92) {
                                       var10000 = var92;
                                       var10001 = false;
                                       break;
                                    }

                                    var7 = var1;

                                    try {
                                       var19.B(0, false);
                                    } catch (Exception var91) {
                                       var10000 = var91;
                                       var10001 = false;
                                       break;
                                    }

                                    var110 = var2;
                                    var18 = var121;
                                    var7 = var1;

                                    try {
                                       var19.B(1, false);
                                    } catch (Exception var94) {
                                       var10000 = var94;
                                       var10001 = false;
                                       break label1460;
                                    }

                                    var110 = var2;
                                    var18 = var121;
                                    var7 = var1;

                                    try {
                                       var10 |= var19 instanceof bzb;
                                    } catch (Exception var93) {
                                       var10000 = var93;
                                       var10001 = false;
                                       break label1460;
                                    }

                                    ++var11;
                                    continue;
                                 }
                              } else {
                                 label1461: {
                                    if (var10) {
                                       for(var113 = 0; var113 < var12; ++var113) {
                                          var110 = var2;
                                          var18 = var121;
                                          var7 = var1;

                                          try {
                                             var19 = (bzf)this.aK.get(var113);
                                          } catch (Exception var86) {
                                             var10000 = var86;
                                             var10001 = false;
                                             break label1461;
                                          }

                                          var110 = var2;
                                          var18 = var121;
                                          var7 = var1;

                                          try {
                                             if (!(var19 instanceof bzb)) {
                                                continue;
                                             }
                                          } catch (Exception var88) {
                                             var10000 = var88;
                                             var10001 = false;
                                             break label1461;
                                          }

                                          var110 = var2;
                                          var18 = var121;
                                          var7 = var1;

                                          try {
                                             var124 = (bzb)var19;
                                          } catch (Exception var85) {
                                             var10000 = var85;
                                             var10001 = false;
                                             break label1461;
                                          }

                                          var11 = 0;

                                          while(true) {
                                             var110 = var2;
                                             var18 = var121;
                                             var7 = var1;

                                             try {
                                                if (var11 >= var124.at) {
                                                   break;
                                                }
                                             } catch (Exception var87) {
                                                var10000 = var87;
                                                var10001 = false;
                                                break label1461;
                                             }

                                             var110 = var2;
                                             var18 = var121;
                                             var7 = var1;

                                             bzf var130;
                                             try {
                                                var130 = var124.as[var11];
                                             } catch (Exception var84) {
                                                var10000 = var84;
                                                var10001 = false;
                                                break label1461;
                                             }

                                             var110 = var2;
                                             var18 = var121;
                                             var7 = var1;

                                             label1464: {
                                                label1465: {
                                                   try {
                                                      if (var124.b) {
                                                         break label1465;
                                                      }
                                                   } catch (Exception var90) {
                                                      var10000 = var90;
                                                      var10001 = false;
                                                      break label1461;
                                                   }

                                                   var110 = var2;
                                                   var18 = var121;
                                                   var7 = var1;

                                                   try {
                                                      if (!var130.d()) {
                                                         break label1464;
                                                      }
                                                   } catch (Exception var89) {
                                                      var10000 = var89;
                                                      var10001 = false;
                                                      break label1461;
                                                   }
                                                }

                                                var110 = var2;
                                                var18 = var121;
                                                var7 = var1;

                                                try {
                                                   var14 = var124.a;
                                                } catch (Exception var83) {
                                                   var10000 = var83;
                                                   var10001 = false;
                                                   break label1461;
                                                }

                                                if (var14 != 0 && var14 != 1) {
                                                   if (var14 == 2 || var14 == 3) {
                                                      var110 = var2;
                                                      var18 = var121;
                                                      var7 = var1;

                                                      try {
                                                         var130.B(1, true);
                                                      } catch (Exception var82) {
                                                         var10000 = var82;
                                                         var10001 = false;
                                                         break label1461;
                                                      }
                                                   }
                                                } else {
                                                   var110 = var2;
                                                   var18 = var121;
                                                   var7 = var1;

                                                   try {
                                                      var130.B(0, true);
                                                   } catch (Exception var81) {
                                                      var10000 = var81;
                                                      var10001 = false;
                                                      break label1461;
                                                   }
                                                }
                                             }

                                             ++var11;
                                          }
                                       }
                                    }

                                    var110 = var2;
                                    var18 = var121;
                                    var7 = var1;

                                    try {
                                       this.aG.clear();
                                    } catch (Exception var80) {
                                       var10000 = var80;
                                       var10001 = false;
                                       break label1461;
                                    }

                                    for(var7 = 0; var7 < var12; ++var7) {
                                       try {
                                          var120 = (bzf)this.aK.get(var7);
                                          if (!var120.H()) {
                                             continue;
                                          }

                                          if (var120 instanceof bzl) {
                                             this.aG.add(var120);
                                             continue;
                                          }
                                       } catch (Exception var34) {
                                          var10000 = var34;
                                          var10001 = false;
                                          break label1143;
                                       }

                                       try {
                                          var120.b(var127, var15);
                                       } catch (Exception var33) {
                                          var10000 = var33;
                                          var10001 = false;
                                          break label1143;
                                       }
                                    }

                                    while(true) {
                                       var110 = var2;
                                       var18 = var121;
                                       var7 = var1;

                                       try {
                                          if (this.aG.size() <= 0) {
                                             break;
                                          }
                                       } catch (Exception var75) {
                                          var10000 = var75;
                                          var10001 = false;
                                          break label1461;
                                       }

                                       var110 = var2;
                                       var18 = var121;
                                       var7 = var1;

                                       try {
                                          var11 = this.aG.size();
                                       } catch (Exception var73) {
                                          var10000 = var73;
                                          var10001 = false;
                                          break label1461;
                                       }

                                       var110 = var2;
                                       var18 = var121;
                                       var7 = var1;

                                       Iterator var145;
                                       try {
                                          var145 = this.aG.iterator();
                                       } catch (Exception var72) {
                                          var10000 = var72;
                                          var10001 = false;
                                          break label1461;
                                       }

                                       label1023:
                                       while(true) {
                                          var110 = var2;
                                          var18 = var121;
                                          var7 = var1;

                                          try {
                                             if (!var145.hasNext()) {
                                                break;
                                             }
                                          } catch (Exception var78) {
                                             var10000 = var78;
                                             var10001 = false;
                                             break label1461;
                                          }

                                          var110 = var2;
                                          var18 = var121;
                                          var7 = var1;

                                          bzl var132;
                                          try {
                                             var132 = (bzl)((bzf)var145.next());
                                          } catch (Exception var71) {
                                             var10000 = var71;
                                             var10001 = false;
                                             break label1461;
                                          }

                                          var110 = var2;
                                          var18 = var121;
                                          var7 = var1;

                                          HashSet var140;
                                          try {
                                             var140 = this.aG;
                                          } catch (Exception var70) {
                                             var10000 = var70;
                                             var10001 = false;
                                             break label1461;
                                          }

                                          var113 = 0;

                                          while(true) {
                                             var110 = var2;
                                             var18 = var121;
                                             var7 = var1;

                                             try {
                                                if (var113 >= var132.at) {
                                                   continue label1023;
                                                }
                                             } catch (Exception var77) {
                                                var10000 = var77;
                                                var10001 = false;
                                                break label1461;
                                             }

                                             var110 = var2;
                                             var18 = var121;
                                             var7 = var1;

                                             try {
                                                if (var140.contains(var132.as[var113])) {
                                                   break;
                                                }
                                             } catch (Exception var79) {
                                                var10000 = var79;
                                                var10001 = false;
                                                break label1461;
                                             }

                                             ++var113;
                                          }

                                          var110 = var2;
                                          var18 = var121;
                                          var7 = var1;

                                          try {
                                             var132.b(var127, var15);
                                          } catch (Exception var69) {
                                             var10000 = var69;
                                             var10001 = false;
                                             break label1461;
                                          }

                                          var110 = var2;
                                          var18 = var121;
                                          var7 = var1;

                                          try {
                                             this.aG.remove(var132);
                                             break;
                                          } catch (Exception var68) {
                                             var10000 = var68;
                                             var10001 = false;
                                             break label1461;
                                          }
                                       }

                                       var110 = var2;
                                       var18 = var121;
                                       var7 = var1;

                                       try {
                                          if (var11 != this.aG.size()) {
                                             continue;
                                          }
                                       } catch (Exception var74) {
                                          var10000 = var74;
                                          var10001 = false;
                                          break label1461;
                                       }

                                       var110 = var2;
                                       var18 = var121;
                                       var7 = var1;

                                       try {
                                          var145 = this.aG.iterator();
                                       } catch (Exception var67) {
                                          var10000 = var67;
                                          var10001 = false;
                                          break label1461;
                                       }

                                       while(true) {
                                          var110 = var2;
                                          var18 = var121;
                                          var7 = var1;

                                          try {
                                             if (!var145.hasNext()) {
                                                break;
                                             }
                                          } catch (Exception var76) {
                                             var10000 = var76;
                                             var10001 = false;
                                             break label1461;
                                          }

                                          var110 = var2;
                                          var18 = var121;
                                          var7 = var1;

                                          try {
                                             ((bzf)var145.next()).b(var127, var15);
                                          } catch (Exception var66) {
                                             var10000 = var66;
                                             var10001 = false;
                                             break label1461;
                                          }
                                       }

                                       var110 = var2;
                                       var18 = var121;
                                       var7 = var1;

                                       try {
                                          this.aG.clear();
                                       } catch (Exception var65) {
                                          var10000 = var65;
                                          var10001 = false;
                                          break label1461;
                                       }
                                    }

                                    var110 = var2;
                                    var18 = var121;
                                    var7 = var1;

                                    boolean var16;
                                    try {
                                       var16 = byv.a;
                                    } catch (Exception var64) {
                                       var10000 = var64;
                                       var10001 = false;
                                       break label1461;
                                    }

                                    label1505: {
                                       if (var16) {
                                          HashSet var134;
                                          label956: {
                                             label1476: {
                                                try {
                                                   var134 = new HashSet();
                                                } catch (Exception var63) {
                                                   var10000 = var63;
                                                   var10001 = false;
                                                   break label1476;
                                                }

                                                for(var113 = 0; var113 < var12; ++var113) {
                                                   var110 = var2;
                                                   var18 = var121;
                                                   var7 = var1;

                                                   try {
                                                      var19 = (bzf)this.aK.get(var113);
                                                   } catch (Exception var38) {
                                                      var10000 = var38;
                                                      var10001 = false;
                                                      break label1461;
                                                   }

                                                   var110 = var2;
                                                   var18 = var121;
                                                   var7 = var1;

                                                   try {
                                                      if (var19.H()) {
                                                         continue;
                                                      }
                                                   } catch (Exception var61) {
                                                      var10000 = var61;
                                                      var10001 = false;
                                                      break label1461;
                                                   }

                                                   var110 = var2;
                                                   var18 = var121;
                                                   var7 = var1;

                                                   try {
                                                      var134.add(var19);
                                                   } catch (Exception var37) {
                                                      var10000 = var37;
                                                      var10001 = false;
                                                      break label1461;
                                                   }
                                                }

                                                try {
                                                   var7 = this.O();
                                                   break label956;
                                                } catch (Exception var62) {
                                                   var10000 = var62;
                                                   var10001 = false;
                                                }
                                             }

                                             var135 = var10000;
                                             break label1144;
                                          }

                                          if (var7 == 2) {
                                             var116 = 0;
                                          } else {
                                             var116 = 1;
                                          }

                                          Iterator var150;
                                          try {
                                             this.q(this, var127, var134, var116, false);
                                             var150 = var134.iterator();
                                          } catch (Exception var50) {
                                             var10000 = var50;
                                             var10001 = false;
                                             break label1505;
                                          }

                                          while(true) {
                                             try {
                                                if (!var150.hasNext()) {
                                                   break;
                                                }

                                                var19 = (bzf)var150.next();
                                                bzk.a(this, var127, var19);
                                                var19.b(var127, var15);
                                             } catch (Exception var60) {
                                                var10000 = var60;
                                                var10001 = false;
                                                break label1505;
                                             }
                                          }
                                       } else {
                                          for(var7 = 0; var7 < var12; ++var7) {
                                             int[] var147;
                                             label923: {
                                                try {
                                                   var120 = (bzf)this.aK.get(var7);
                                                   if (var120 instanceof bzg) {
                                                      var147 = var120.ar;
                                                      break label923;
                                                   }
                                                } catch (Exception var59) {
                                                   var10000 = var59;
                                                   var10001 = false;
                                                   break label1505;
                                                }

                                                try {
                                                   bzk.a(this, var127, var120);
                                                   if (!var120.H()) {
                                                      var120.b(var127, var15);
                                                   }
                                                   continue;
                                                } catch (Exception var44) {
                                                   var10000 = var44;
                                                   var10001 = false;
                                                   break label1505;
                                                }
                                             }

                                             var110 = var147[0];
                                             var113 = var147[1];
                                             if (var110 == 2) {
                                                try {
                                                   var120.Q(1);
                                                } catch (Exception var49) {
                                                   var10000 = var49;
                                                   var10001 = false;
                                                   break label1505;
                                                }

                                                var110 = 2;
                                             }

                                             if (var113 == 2) {
                                                try {
                                                   var120.R(1);
                                                } catch (Exception var48) {
                                                   var10000 = var48;
                                                   var10001 = false;
                                                   break label1505;
                                                }

                                                var113 = 2;
                                             }

                                             try {
                                                var120.b(var127, var15);
                                             } catch (Exception var47) {
                                                var10000 = var47;
                                                var10001 = false;
                                                break label1505;
                                             }

                                             if (var110 == 2) {
                                                try {
                                                   var120.Q(2);
                                                } catch (Exception var46) {
                                                   var10000 = var46;
                                                   var10001 = false;
                                                   break label1505;
                                                }
                                             }

                                             if (var113 == 2) {
                                                try {
                                                   var120.R(2);
                                                } catch (Exception var45) {
                                                   var10000 = var45;
                                                   var10001 = false;
                                                   break label1505;
                                                }
                                             }
                                          }
                                       }

                                       var110 = var2;
                                       var113 = var1;

                                       try {
                                          var7 = this.av;
                                       } catch (Exception var43) {
                                          var10000 = var43;
                                          var10001 = false;
                                          break label1505;
                                       }

                                       WeakReference var151;
                                       label911: {
                                          label1481: {
                                             if (var7 > 0) {
                                                try {
                                                   car.x(this, var127, (ArrayList)null, 0);
                                                } catch (Exception var58) {
                                                   var10000 = var58;
                                                   var10001 = false;
                                                   break label1481;
                                                }
                                             }

                                             try {
                                                var7 = this.aw;
                                             } catch (Exception var42) {
                                                var10000 = var42;
                                                var10001 = false;
                                                break label1505;
                                             }

                                             if (var7 > 0) {
                                                try {
                                                   car.x(this, var127, (ArrayList)null, 1);
                                                } catch (Exception var57) {
                                                   var10000 = var57;
                                                   var10001 = false;
                                                   break label1481;
                                                }
                                             }

                                             try {
                                                var151 = this.aC;
                                             } catch (Exception var41) {
                                                var10000 = var41;
                                                var10001 = false;
                                                break label1505;
                                             }

                                             if (var151 != null) {
                                                label898: {
                                                   try {
                                                      if (var151.get() == null) {
                                                         break label898;
                                                      }

                                                      this.ac((bze)this.aC.get(), this.as.b(this.L));
                                                   } catch (Exception var56) {
                                                      var10000 = var56;
                                                      var10001 = false;
                                                      break label1505;
                                                   }

                                                   try {
                                                      this.aC = null;
                                                   } catch (Exception var55) {
                                                      var10000 = var55;
                                                      var10001 = false;
                                                      break label1481;
                                                   }
                                                }
                                             }

                                             try {
                                                var151 = this.aE;
                                             } catch (Exception var40) {
                                                var10000 = var40;
                                                var10001 = false;
                                                break label1505;
                                             }

                                             if (var151 != null) {
                                                label888: {
                                                   try {
                                                      if (var151.get() == null) {
                                                         break label888;
                                                      }

                                                      this.ab((bze)this.aE.get(), this.as.b(this.N));
                                                   } catch (Exception var54) {
                                                      var10000 = var54;
                                                      var10001 = false;
                                                      break label1505;
                                                   }

                                                   try {
                                                      this.aE = null;
                                                   } catch (Exception var53) {
                                                      var10000 = var53;
                                                      var10001 = false;
                                                      break label1481;
                                                   }
                                                }
                                             }

                                             try {
                                                var151 = this.aD;
                                             } catch (Exception var39) {
                                                var10000 = var39;
                                                var10001 = false;
                                                break label1505;
                                             }

                                             if (var151 == null) {
                                                break label911;
                                             }

                                             try {
                                                if (var151.get() == null) {
                                                   break label911;
                                                }

                                                this.ac((bze)this.aD.get(), this.as.b(this.K));
                                             } catch (Exception var51) {
                                                var10000 = var51;
                                                var10001 = false;
                                                break label1505;
                                             }

                                             try {
                                                this.aD = null;
                                                break label911;
                                             } catch (Exception var52) {
                                                var10000 = var52;
                                                var10001 = false;
                                             }
                                          }

                                          var135 = var10000;
                                          var1 = var1;
                                          var121 = var121;
                                          var2 = var2;
                                          break label1144;
                                       }

                                       try {
                                          var151 = this.aF;
                                       } catch (Exception var36) {
                                          var10000 = var36;
                                          var10001 = false;
                                          break label1505;
                                       }

                                       if (var151 == null) {
                                          break label1142;
                                       }

                                       try {
                                          if (var151.get() == null) {
                                             break label1142;
                                          }

                                          this.ab((bze)this.aF.get(), this.as.b(this.M));
                                       } catch (Exception var35) {
                                          var10000 = var35;
                                          var10001 = false;
                                          break label1505;
                                       }

                                       try {
                                          this.aF = null;
                                          break label1142;
                                       } catch (Exception var32) {
                                          var10000 = var32;
                                          var10001 = false;
                                          break label1143;
                                       }
                                    }

                                    var135 = var10000;
                                    break label1144;
                                 }
                              }

                              Exception var148 = var10000;
                              var2 = var110;
                              var1 = var7;
                              var135 = var148;
                              var121 = var18;
                              break label1144;
                           }
                        }

                        var135 = var10000;
                        var1 = var7;
                        break label1144;
                     }

                     try {
                        this.as.j();
                        break label1145;
                     } catch (Exception var31) {
                        var10000 = var31;
                        var10001 = false;
                     }
                  }

                  var135 = var10000;
               }

               var135.printStackTrace();
               PrintStream var128 = System.out;
               StringBuilder var149 = new StringBuilder();
               var149.append("EXCEPTION : ");
               var149.append(var135);
               var128.println("EXCEPTION : ".concat(var135.toString()));
               var110 = var2;
               var113 = var1;
               break label1146;
            }

            var121 = var121;
         }

         bzk.a[2] = false;
         var15 = this.Y(64);
         this.S(var15);
         var11 = this.aK.size();
         var2 = 0;

         for(var103 = false; var2 < var11; ++var2) {
            var120 = (bzf)this.aK.get(var2);
            var120.S(var15);
            if (var120.k == -1 && var120.l == -1) {
               var106 = false;
            } else {
               var106 = true;
            }

            var103 |= var106;
         }

         var106 = var103;
         boolean var107 = var108;
         if (var114) {
            var106 = var103;
            var107 = var108;
            if (var113 < 8) {
               var106 = var103;
               var107 = var108;
               if (bzk.a[2]) {
                  var11 = 0;
                  var7 = 0;

                  for(var2 = 0; var11 < var13; ++var11) {
                     var120 = (bzf)this.aK.get(var11);
                     var7 = Math.max(var7, var120.aa + var120.j());
                     var2 = Math.max(var2, var120.ab + var120.h());
                  }

                  var7 = Math.max(this.ad, var7);
                  var14 = Math.max(this.ae, var2);
                  boolean var109 = var103;
                  boolean var112 = var108;
                  if (var4 == 2) {
                     var109 = var103;
                     var112 = var108;
                     if (this.j() < var7) {
                        this.F(var7);
                        this.ar[0] = 2;
                        var109 = true;
                        var112 = true;
                     }
                  }

                  var106 = var109;
                  var107 = var112;
                  if (var5 == 2) {
                     var106 = var109;
                     var107 = var112;
                     if (this.h() < var14) {
                        this.A(var14);
                        this.ar[1] = 2;
                        var106 = true;
                        var107 = true;
                     }
                  }
               }
            }
         }

         var6 = Math.max(this.ad, this.j());
         var103 = var106;
         if (var6 > this.j()) {
            this.F(var6);
            this.ar[0] = 1;
            var103 = true;
            var107 = true;
         }

         var6 = Math.max(this.ae, this.h());
         if (var6 > this.h()) {
            this.A(var6);
            this.ar[1] = 1;
            var103 = true;
            var108 = true;
         } else {
            var108 = var107;
         }

         if (!var108) {
            var123 = this.ar;
            var106 = var103;
            var107 = var108;
            if (var123[0] == 2) {
               var106 = var103;
               var107 = var108;
               if (var3 > 0) {
                  var106 = var103;
                  var107 = var108;
                  if (this.j() > var3) {
                     this.aA = true;
                     var123[0] = 1;
                     this.F(var3);
                     var106 = true;
                     var107 = true;
                  }
               }
            }

            var123 = this.ar;
            if (var123[1] == 2 && var110 > 0) {
               var11 = this.h();
               var103 = var106;
               var108 = var107;
               if (var11 > var110) {
                  this.aB = true;
                  var123[1] = 1;
                  this.A(var110);
                  var103 = true;
                  var108 = true;
               }
            } else {
               var103 = var106;
               var108 = var107;
            }
         }

         if (var113 > 8) {
            var107 = false;
         } else {
            var107 = true;
         }

         var106 = var107 & var103;
         var1 = var113;
      }

      this.aK = var121;
      if (var108) {
         var17 = this.ar;
         var17[0] = var4;
         var17[1] = var5;
      }

      this.T(this.as.k);
   }

   public final void W(int var1) {
      this.az = var1;
      byv.a = this.Y(512);
   }

   public final boolean X(boolean var1, int var2) {
      bzq var10 = this.a;
      bzg var11 = var10.a;
      boolean var9 = false;
      int var6 = var11.N(0);
      int var5 = var10.a.N(1);
      var11 = var10.a;
      int var8 = var11.k();
      int var7 = var11.l();
      int var4 = var5;
      int var3;
      bzz var12;
      ArrayList var15;
      if (var1) {
         label118: {
            var3 = var5;
            if (var6 != 2) {
               var4 = var5;
               if (var5 != 2) {
                  break label118;
               }

               var3 = 2;
            }

            var15 = var10.e;
            var5 = var15.size();
            var4 = 0;

            boolean var14;
            while(true) {
               if (var4 >= var5) {
                  var14 = true;
                  break;
               }

               var12 = (bzz)var15.get(var4);
               if (var12.f == var2 && !var12.e()) {
                  var14 = false;
                  break;
               }

               ++var4;
            }

            if (var2 == 0) {
               var4 = var3;
               if (var14) {
                  var4 = var3;
                  if (var6 == 2) {
                     var10.a.Q(1);
                     var11 = var10.a;
                     var11.F(var10.a(var11, 0));
                     var11 = var10.a;
                     var11.h.e.c(var11.j());
                     var4 = var3;
                  }
               }
            } else {
               var4 = var3;
               if (var14) {
                  var4 = var3;
                  if (var3 == 2) {
                     var10.a.R(1);
                     var11 = var10.a;
                     var11.A(var10.a(var11, 1));
                     var11 = var10.a;
                     var11.i.e.c(var11.h());
                     var4 = var3;
                  }
               }
            }
         }
      }

      boolean var13;
      if (var2 == 0) {
         var11 = var10.a;
         var3 = var11.ar[0];
         if (var3 != 1 && var3 != 4) {
            var13 = false;
         } else {
            var3 = var11.j() + var8;
            var11.h.i.c(var3);
            var10.a.h.e.c(var3 - var8);
            var13 = true;
         }
      } else {
         var11 = var10.a;
         var3 = var11.ar[1];
         if (var3 != 1 && var3 != 4) {
            var13 = false;
         } else {
            var3 = var11.h() + var7;
            var11.i.i.c(var3);
            var10.a.i.e.c(var3 - var7);
            var13 = true;
         }
      }

      var10.c();
      ArrayList var16 = var10.e;
      var7 = var16.size();

      for(var5 = 0; var5 < var7; ++var5) {
         bzz var17 = (bzz)var16.get(var5);
         if (var17.f == var2 && (var17.d != var10.a || var17.g)) {
            var17.c();
         }
      }

      var15 = var10.e;
      var7 = var15.size();
      var5 = 0;

      while(true) {
         if (var5 >= var7) {
            var1 = true;
            break;
         }

         var12 = (bzz)var15.get(var5);
         if (var12.f == var2 && (var13 || var12.d != var10.a)) {
            if (!var12.h.i) {
               var1 = var9;
               break;
            }

            if (!var12.i.i) {
               var1 = var9;
               break;
            }

            if (!(var12 instanceof bzo) && !var12.e.i) {
               var1 = var9;
               break;
            }
         }

         ++var5;
      }

      var10.a.Q(var6);
      var10.a.R(var4);
      return var1;
   }

   public final boolean Y(int var1) {
      return (this.az & var1) == var1;
   }

   final void a(bzf var1, int var2) {
      int var3;
      bzc[] var4;
      if (var2 == 0) {
         var3 = this.av;
         var4 = this.ay;
         var2 = var4.length;
         if (var3 + 1 >= var2) {
            this.ay = (bzc[])Arrays.copyOf(var4, var2 + var2);
         }

         var4 = this.ay;
         var2 = this.av;
         var4[var2] = new bzc(var1, 0, this.c);
         this.av = var2 + 1;
      } else {
         var3 = this.aw;
         var4 = this.ax;
         var2 = var4.length;
         if (var3 + 1 >= var2) {
            this.ax = (bzc[])Arrays.copyOf(var4, var2 + var2);
         }

         var4 = this.ax;
         var2 = this.aw;
         var4[var2] = new bzc(var1, 1, this.c);
         this.aw = var2 + 1;
      }
   }

   public final void c(byw var1) {
      this.d = var1;
      byv.b = var1;
   }

   public final void t(StringBuilder var1) {
      var1.append(String.valueOf(this.m).concat(":{\n"));
      StringBuilder var4 = new StringBuilder();
      var4.append("  actualWidth:");
      var4.append(this.W);
      var1.append(var4.toString());
      var1.append("\n");
      var4 = new StringBuilder();
      var4.append("  actualHeight:");
      var4.append(this.X);
      var1.append(var4.toString());
      var1.append("\n");
      ArrayList var5 = super.aK;
      int var3 = var5.size();

      for(int var2 = 0; var2 < var3; ++var2) {
         ((bzf)var5.get(var2)).t(var1);
         var1.append(",\n");
      }

      var1.append("}");
   }

   public final void v() {
      this.as.k();
      this.at = 0;
      this.au = 0;
      super.v();
   }
}
