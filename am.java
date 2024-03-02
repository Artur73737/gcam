import androidx.wear.ambient.AmbientDelegate;
import com.google.android.apps.camera.hdrplus.fusion.api.qAwe.yGCWWDnsImN;
import java.util.ArrayList;

public class am {
   protected int A;
   protected int B;
   public int C;
   protected int D;
   protected int E;
   public int F;
   public int G;
   public float H;
   public float I;
   public Object J;
   public int K;
   int L;
   int M;
   int N;
   int O;
   boolean P;
   boolean Q;
   boolean R;
   boolean S;
   boolean T;
   boolean U;
   public int V;
   public int W;
   boolean X;
   boolean Y;
   public float Z;
   public int a = -1;
   public float aa;
   am ab;
   am ac;
   public int ad;
   public int ae;
   private int af;
   private int ag;
   public int b = -1;
   public int c = 0;
   public int d = 0;
   public int e = 0;
   public int f = 0;
   public int g = 0;
   public int h = 0;
   final al i;
   final al j;
   final al k;
   final al l;
   final al m;
   final al n;
   final al o;
   final al p;
   protected final ArrayList q;
   public am r;
   int s;
   int t;
   public float u;
   public int v;
   public int w;
   public int x;
   public int y;
   public int z;

   public am() {
      al var8 = new al(this, 2);
      this.i = var8;
      al var4 = new al(this, 3);
      this.j = var4;
      al var7 = new al(this, 4);
      this.k = var7;
      al var1 = new al(this, 5);
      this.l = var1;
      al var2 = new al(this, 6);
      this.m = var2;
      al var3 = new al(this, 8);
      this.n = var3;
      al var5 = new al(this, 9);
      this.o = var5;
      this.p = new al(this, 7);
      ArrayList var6 = new ArrayList();
      this.q = var6;
      this.r = null;
      this.s = 0;
      this.t = 0;
      this.u = 0.0F;
      this.v = -1;
      this.w = 0;
      this.x = 0;
      this.af = 0;
      this.ag = 0;
      this.y = 0;
      this.z = 0;
      this.A = 0;
      this.B = 0;
      this.C = 0;
      this.H = 0.5F;
      this.I = 0.5F;
      this.ad = 1;
      this.ae = 1;
      this.K = 0;
      this.V = 0;
      this.W = 0;
      this.Z = 0.0F;
      this.aa = 0.0F;
      this.ab = null;
      this.ac = null;
      var6.add(var8);
      var6.add(var4);
      var6.add(var7);
      var6.add(var1);
      var6.add(var3);
      var6.add(var5);
      var6.add(var2);
   }

   private final void A(aj var1, boolean var2, boolean var3, al var4, al var5, int var6, int var7, int var8, int var9, float var10, boolean var11, boolean var12, int var13, int var14, int var15) {
      ak var21 = var1.e(var4);
      ak var20 = var1.e(var5);
      ak var23 = var1.e(var4.b);
      ak var22 = var1.e(var5.b);
      int var18 = var4.a();
      int var17 = var5.a();
      int var19 = this.K;
      boolean var16;
      if (var19 == 8) {
         var16 = false;
      } else {
         var16 = true;
      }

      if (var19 == 8) {
         var8 = 0;
      }

      var16 = var16 ^ true | var3;
      ah var25;
      if (var23 == null && var22 == null) {
         var25 = var1.a();
         var25.g(var21, var6);
         var1.g(var25);
         if (!var11) {
            if (var2) {
               var1.g(aj.c(var1, var20, var21, var9, true));
               return;
            }

            if (var16) {
               var1.g(aj.c(var1, var20, var21, var8, false));
               return;
            }

            var25 = var1.a();
            var25.g(var20, var7);
            var1.g(var25);
            return;
         }
      } else if (var23 != null && var22 == null) {
         var25 = var1.a();
         var25.h(var21, var23, var18);
         var1.g(var25);
         if (var2) {
            var1.g(aj.c(var1, var20, var21, var9, true));
            return;
         }

         if (!var11) {
            if (var16) {
               var25 = var1.a();
               var25.h(var20, var21, var8);
               var1.g(var25);
               return;
            }

            var25 = var1.a();
            var25.g(var20, var7);
            var1.g(var25);
            return;
         }
      } else if (var23 == null) {
         var25 = var1.a();
         var25.h(var20, var22, -var17);
         var1.g(var25);
         if (var2) {
            var1.g(aj.c(var1, var20, var21, var9, true));
            return;
         }

         if (!var11) {
            if (var16) {
               var25 = var1.a();
               var25.h(var20, var21, var8);
               var1.g(var25);
               return;
            }

            var25 = var1.a();
            var25.g(var21, var6);
            var1.g(var25);
            return;
         }
      } else if (var16) {
         ah var24;
         if (var2) {
            var1.g(aj.c(var1, var20, var21, var9, true));
         } else {
            var24 = var1.a();
            var24.h(var20, var21, var8);
            var1.g(var24);
         }

         var6 = var4.h;
         if (var6 != var5.h) {
            ak var28;
            if (var6 == 2) {
               var25 = var1.a();
               var25.h(var21, var23, var18);
               var1.g(var25);
               var28 = var1.f();
               var25 = var1.a();
               var25.j(var20, var22, var28, -var17);
               var1.g(var25);
               return;
            }

            var28 = var1.f();
            var25 = var1.a();
            var25.i(var21, var23, var28, var18);
            var1.g(var25);
            var25 = var1.a();
            var25.h(var20, var22, -var17);
            var1.g(var25);
            return;
         }

         if (var23 == var22) {
            var1.g(aj.b(var1, var21, var23, 0, 0.5F, var22, var20, 0, true));
            return;
         }

         if (!var12) {
            var6 = var4.i;
            ak var26 = var1.f();
            var24 = var1.a();
            var24.i(var21, var23, var26, var18);
            if (var6 != 2) {
               var1.k(var24, (int)(-var24.d.a(var26)));
            }

            var1.g(var24);
            var7 = var5.i;
            var6 = -var17;
            var26 = var1.f();
            ah var27 = var1.a();
            var27.j(var20, var22, var26, var6);
            if (var7 != 2) {
               var1.k(var27, (int)(-var27.d.a(var26)));
            }

            var1.g(var27);
            var1.g(aj.b(var1, var21, var23, var18, var10, var22, var20, var17, false));
            return;
         }
      } else {
         if (var11) {
            var1.i(var21, var23, var18, 3);
            var1.j(var20, var22, -var17, 3);
            var1.g(aj.b(var1, var21, var23, var18, var10, var22, var20, var17, true));
            return;
         }

         if (!var12) {
            if (var13 == 1) {
               var6 = var14;
               if (var14 <= var8) {
                  var6 = var8;
               }

               var7 = var6;
               if (var15 > 0) {
                  if (var15 < var6) {
                     var7 = var15;
                  } else {
                     var1.j(var20, var21, var15, 3);
                     var7 = var6;
                  }
               }

               var1.n(var20, var21, var7, 3);
               var1.i(var21, var23, var18, 2);
               var1.j(var20, var22, -var17, 2);
               var1.m(var21, var23, var18, var10, var22, var20, var17);
               return;
            }

            if (var14 == 0 && var15 == 0) {
               var25 = var1.a();
               var25.h(var21, var23, var18);
               var1.g(var25);
               var25 = var1.a();
               var25.h(var20, var22, -var17);
               var1.g(var25);
               return;
            }

            if (var15 > 0) {
               var1.j(var20, var21, var15, 3);
            }

            var1.i(var21, var23, var18, 2);
            var1.j(var20, var22, -var17, 2);
            var1.m(var21, var23, var18, var10, var22, var20, var17);
            return;
         }
      }

   }

   public final int a() {
      return this.x + this.t;
   }

   public final int b() {
      return this.af + this.A;
   }

   public final int c() {
      return this.ag + this.B;
   }

   public final int d() {
      return this.K == 8 ? 0 : this.t;
   }

   public final int e() {
      int var1 = this.t;
      int var2 = var1;
      if (this.ae == 3) {
         if (this.d == 1) {
            var1 = Math.max(this.g, var1);
         } else {
            var1 = this.g;
            if (var1 > 0) {
               this.t = var1;
            } else {
               var1 = 0;
            }
         }

         int var3 = this.h;
         var2 = var1;
         if (var3 > 0) {
            var2 = var1;
            if (var3 < var1) {
               return var3;
            }
         }
      }

      return var2;
   }

   public final int f() {
      int var1 = this.s;
      int var2 = var1;
      if (this.ad == 3) {
         if (this.c == 1) {
            var1 = Math.max(this.e, var1);
         } else {
            var1 = this.e;
            if (var1 > 0) {
               this.s = var1;
            } else {
               var1 = 0;
            }
         }

         int var3 = this.f;
         var2 = var1;
         if (var3 > 0) {
            var2 = var1;
            if (var3 < var1) {
               return var3;
            }
         }
      }

      return var2;
   }

   public final int g() {
      return this.w + this.s;
   }

   public final int h() {
      return this.K == 8 ? 0 : this.s;
   }

   public void i() {
      this.i.b();
      this.j.b();
      this.k.b();
      this.l.b();
      this.m.b();
      this.n.b();
      this.o.b();
      this.p.b();
      this.r = null;
      this.s = 0;
      this.t = 0;
      this.u = 0.0F;
      this.v = -1;
      this.w = 0;
      this.x = 0;
      this.af = 0;
      this.ag = 0;
      this.y = 0;
      this.z = 0;
      this.A = 0;
      this.B = 0;
      this.C = 0;
      this.D = 0;
      this.E = 0;
      this.F = 0;
      this.G = 0;
      this.H = 0.5F;
      this.I = 0.5F;
      this.ad = 1;
      this.ae = 1;
      this.J = null;
      this.K = 0;
      this.T = false;
      this.U = false;
      this.V = 0;
      this.W = 0;
      this.X = false;
      this.Y = false;
      this.Z = 0.0F;
      this.aa = 0.0F;
      this.a = -1;
      this.b = -1;
   }

   public final void j(int var1) {
      this.t = var1;
      int var2 = this.E;
      if (var1 < var2) {
         this.t = var2;
      }

   }

   public final void k(int var1, int var2) {
      this.w = var1;
      var2 -= var1;
      this.s = var2;
      var1 = this.D;
      if (var2 < var1) {
         this.s = var1;
      }

   }

   public final void l(int var1) {
      if (var1 < 0) {
         this.E = 0;
      } else {
         this.E = var1;
      }
   }

   public final void m(int var1) {
      if (var1 < 0) {
         this.D = 0;
      } else {
         this.D = var1;
      }
   }

   public void n(int var1, int var2) {
      this.A = var1;
      this.B = var2;
   }

   public final void o(int var1, int var2) {
      this.x = var1;
      var1 = var2 - var1;
      this.t = var1;
      var2 = this.E;
      if (var1 < var2) {
         this.t = var2;
      }

   }

   public final void p(int var1) {
      this.s = var1;
      int var2 = this.D;
      if (var1 < var2) {
         this.s = var2;
      }

   }

   public void q() {
      int var4 = this.w;
      int var1 = this.x;
      int var2 = this.s;
      int var3 = this.t;
      this.af = var4;
      this.ag = var1;
      this.y = var2 + var4 - var4;
      this.z = var3 + var1 - var1;
   }

   public final boolean r() {
      return this.C > 0;
   }

   public final boolean s() {
      return this.r == null;
   }

   public al t(int var1) {
      switch(var1 - 1) {
      case 1:
         return this.i;
      case 2:
         return this.j;
      case 3:
         return this.k;
      case 4:
         return this.l;
      case 5:
         return this.m;
      case 6:
      default:
         return this.p;
      case 7:
         return this.n;
      case 8:
         return this.o;
      }
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("(");
      var1.append(this.w);
      var1.append(yGCWWDnsImN.fhYpuyUnVsvALb);
      var1.append(this.x);
      var1.append(") - (");
      var1.append(this.s);
      var1.append(" x ");
      var1.append(this.t);
      var1.append(") wrap: (");
      var1.append(this.F);
      var1.append(" x ");
      var1.append(this.G);
      var1.append(")");
      return var1.toString();
   }

   public final void u(int var1, am var2, int var3, int var4, int var5) {
      this.t(var1).d(var2.t(var3), var4, var5, 2, 0, true);
   }

   public final void v(int var1) {
      this.ad = var1;
      if (var1 == 2) {
         this.p(this.F);
      }

   }

   public final void w(int var1) {
      this.ae = var1;
      if (var1 == 2) {
         this.j(this.G);
      }

   }

   public void x(aj var1) {
      ak var23 = var1.e(this.i);
      ak var25 = var1.e(this.k);
      ak var24 = var1.e(this.j);
      ak var20 = var1.e(this.l);
      ak var22 = var1.e(this.m);
      am var19 = this.r;
      boolean var13;
      boolean var14;
      boolean var16;
      boolean var17;
      al var21;
      al var31;
      ah var32;
      ak var33;
      ak var36;
      if (var19 != null) {
         al var26;
         label352: {
            var21 = this.i;
            var26 = var21.b;
            if (var26 == null || var26.b != var21) {
               var26 = this.k;
               var21 = var26.b;
               if (var21 == null || var21.b != var26) {
                  var13 = false;
                  break label352;
               }
            }

            ((an)var19).A(this, 0);
            var13 = true;
         }

         label353: {
            var21 = this.j;
            var31 = var21.b;
            if (var31 == null || var31.b != var21) {
               var31 = this.l;
               var21 = var31.b;
               if (var21 == null || var21.b != var31) {
                  var14 = false;
                  break label353;
               }
            }

            ((an)this.r).A(this, 1);
            var14 = true;
         }

         am var34 = this.r;
         am var38;
         if (var34.ad == 2 && !var13) {
            label341: {
               label303: {
                  var31 = this.i;
                  var26 = var31.b;
                  if (var26 != null) {
                     var38 = var26.a;
                     if (var38 == var34) {
                        if (var38 == var34) {
                           var31.i = 2;
                        }
                        break label303;
                     }
                  }

                  var36 = var1.e(var34.i);
                  var32 = var1.a();
                  var32.i(var23, var36, var1.f(), 0);
                  var1.g(var32);
               }

               var31 = this.k;
               var21 = var31.b;
               if (var21 != null) {
                  var34 = var21.a;
                  var38 = this.r;
                  if (var34 == var38) {
                     if (var34 == var38) {
                        var31.i = 2;
                     }
                     break label341;
                  }
               }

               var33 = var1.e(this.r.k);
               ah var37 = var1.a();
               var37.i(var33, var25, var1.f(), 0);
               var1.g(var37);
            }
         }

         var19 = this.r;
         if (var19.ae == 2 && !var14) {
            label343: {
               label289: {
                  var21 = this.j;
                  var26 = var21.b;
                  if (var26 != null) {
                     var38 = var26.a;
                     if (var38 == var19) {
                        if (var38 == var19) {
                           var21.i = 2;
                        }
                        break label289;
                     }
                  }

                  var36 = var1.e(var19.j);
                  var32 = var1.a();
                  var32.i(var24, var36, var1.f(), 0);
                  var1.g(var32);
               }

               var31 = this.l;
               var21 = var31.b;
               if (var21 != null) {
                  var34 = var21.a;
                  var38 = this.r;
                  if (var34 == var38) {
                     if (var34 == var38) {
                        var31.i = 2;
                     }
                     break label343;
                  }
               }

               var36 = var1.e(this.r.l);
               var32 = var1.a();
               var32.i(var36, var20, var1.f(), 0);
               var1.g(var32);
            }
         }

         var17 = var13;
         var16 = var14;
      } else {
         var17 = false;
         var16 = false;
      }

      int var7 = this.s;
      int var9 = this.D;
      int var5;
      if (var7 < var9) {
         var5 = var9;
      } else {
         var5 = var7;
      }

      int var8 = this.t;
      int var6 = this.E;
      int var4 = var6;
      if (var8 >= var6) {
         var4 = var8;
      }

      int var10 = this.ad;
      if (var10 != 3) {
         var14 = true;
      } else {
         var14 = false;
      }

      int var11 = this.ae;
      boolean var15;
      if (var11 != 3) {
         var15 = true;
      } else {
         var15 = false;
      }

      var13 = var14;
      if (!var14) {
         var31 = this.i;
         var13 = var14;
         if (var31 != null) {
            var21 = this.k;
            var13 = var14;
            if (var21 != null) {
               if (var31.b != null) {
                  var13 = var14;
                  if (var21.b == null) {
                     var13 = true;
                  }
               } else {
                  var13 = true;
               }
            }
         }
      }

      var14 = var15;
      if (!var15) {
         var21 = this.j;
         var14 = var15;
         if (var21 != null) {
            var31 = this.l;
            var14 = var15;
            if (var31 != null) {
               label335: {
                  var21 = var21.b;
                  if (var21 != null) {
                     var14 = var15;
                     if (var31.b != null) {
                        break label335;
                     }
                  }

                  if (this.C != 0) {
                     var31 = this.m;
                     var14 = var15;
                     if (var31 == null) {
                        break label335;
                     }

                     if (var21 != null) {
                        var14 = var15;
                        if (var31.b == null) {
                           var14 = true;
                        }
                        break label335;
                     }
                  }

                  var14 = true;
               }
            }
         }
      }

      float var2;
      float var3;
      boolean var28;
      label259: {
         label258: {
            label257: {
               var6 = this.v;
               var2 = this.u;
               if (var2 > 0.0F) {
                  int var12 = this.K;
                  if (var12 != 8) {
                     if (var10 == 3) {
                        if (var11 == 3) {
                           byte var30;
                           if (var13 && !var14) {
                              var30 = 0;
                              var28 = true;
                              var8 = var10;
                              var7 = var5;
                              var5 = var30;
                              var15 = var14;
                           } else {
                              if (!var13 && var14) {
                                 if (var6 == -1) {
                                    var2 = 1.0F / var2;
                                    var30 = 1;
                                    var28 = true;
                                    var8 = var10;
                                    var7 = var5;
                                    var5 = var30;
                                    var15 = var14;
                                    break label259;
                                 }

                                 var6 = 1;
                              }

                              boolean var29 = true;
                              var8 = var10;
                              var7 = var5;
                              var5 = var6;
                              var15 = var14;
                              var28 = var29;
                           }
                           break label259;
                        }
                        break label258;
                     }

                     if (var10 == 3) {
                        break label258;
                     }

                     if (var11 == 3) {
                        var3 = var2;
                        if (var6 == -1) {
                           var3 = 1.0F / var2;
                        }

                        var4 = (int)((float)var7 * var3);
                        var7 = 1;
                        var14 = true;
                        var2 = var3;
                        break label257;
                     }
                  }
               }

               var7 = var6;
            }

            var8 = var5;
            var28 = false;
            var15 = var14;
            var5 = var7;
            var7 = var8;
            var8 = var10;
            break label259;
         }

         var7 = (int)((float)var8 * var2);
         var13 = true;
         var8 = 3;
         var5 = 0;
         var28 = false;
         var15 = var14;
      }

      label234: {
         if (var28) {
            if (var5 == 0) {
               var14 = true;
               break label234;
            }

            if (var5 == -1) {
               var14 = true;
               break label234;
            }
         }

         var14 = false;
      }

      boolean var18;
      if (var8 == 2 && this instanceof an) {
         var18 = true;
      } else {
         var18 = false;
      }

      ak var27;
      ak var39;
      if (this.a != 2) {
         label221: {
            if (var14) {
               var31 = this.i;
               if (var31.b != null && this.k.b != null) {
                  var27 = var1.e(var31);
                  var36 = var1.e(this.k);
                  var33 = var1.e(this.i.b);
                  var39 = var1.e(this.k.b);
                  var1.i(var27, var33, this.i.a(), 3);
                  var1.j(var36, var39, -this.k.a(), 3);
                  if (!var17) {
                     var1.m(var27, var33, this.i.a(), this.H, var39, var36, this.k.a());
                  }
                  break label221;
               }
            }

            var21 = this.i;
            var31 = this.k;
            var8 = this.w;
            this.A(var1, var18, var13, var21, var31, var8, var8 + var7, var7, var9, this.H, var14, var17, this.c, this.e, this.f);
         }
      }

      if (this.b != 2) {
         if (this.ae == 2 && this instanceof an) {
            var14 = true;
         } else {
            var14 = false;
         }

         label209: {
            if (var28) {
               if (var5 == 1) {
                  var13 = true;
                  break label209;
               }

               if (var5 == -1) {
                  var13 = true;
                  break label209;
               }
            }

            var13 = false;
         }

         var7 = this.C;
         al var35;
         if (var7 > 0) {
            label338: {
               var21 = this.l;
               var1.n(var22, var24, var7, 5);
               var35 = this.m;
               if (var35.b != null) {
                  var7 = this.C;
                  var21 = var35;
               } else {
                  var7 = var4;
               }

               if (var13) {
                  var35 = this.j;
                  if (var35.b != null && this.l.b != null) {
                     var22 = var1.e(var35);
                     var33 = var1.e(this.l);
                     var39 = var1.e(this.j.b);
                     var36 = var1.e(this.l.b);
                     var1.i(var22, var39, this.j.a(), 3);
                     var1.j(var33, var36, -this.l.a(), 3);
                     if (!var16) {
                        var1.m(var22, var39, this.j.a(), this.I, var36, var33, this.l.a());
                     }
                     break label338;
                  }
               }

               var35 = this.j;
               var8 = this.x;
               this.A(var1, var14, var15, var35, var21, var8, var8 + var7, var7, this.E, this.I, var13, var16, this.d, this.g, this.h);
               var1.n(var20, var24, var4, 5);
            }
         } else {
            label195: {
               if (var13) {
                  var21 = this.j;
                  if (var21.b != null && this.l.b != null) {
                     var27 = var1.e(var21);
                     var39 = var1.e(this.l);
                     var36 = var1.e(this.j.b);
                     var22 = var1.e(this.l.b);
                     var1.i(var27, var36, this.j.a(), 3);
                     var1.j(var39, var22, -this.l.a(), 3);
                     if (!var16) {
                        var1.m(var27, var36, this.j.a(), this.I, var22, var39, this.l.a());
                     }
                     break label195;
                  }
               }

               var35 = this.j;
               var21 = this.l;
               var11 = this.x;
               var8 = this.E;
               var3 = this.I;
               var7 = this.d;
               var10 = this.g;
               var9 = this.h;
               this.A(var1, var14, var15, var35, var21, var11, var11 + var4, var4, var8, var3, var13, var16, var7, var10, var9);
            }
         }

         if (var28) {
            var32 = var1.a();
            if (var5 == 0) {
               var32.e(var25, var23, var20, var24, var2);
               var1.g(var32);
            } else if (var5 == 1) {
               var32.e(var20, var24, var25, var23, var2);
               var1.g(var32);
            } else {
               var4 = this.e;
               if (var4 > 0) {
                  var1.i(var25, var23, var4, 3);
               }

               var4 = this.g;
               if (var4 > 0) {
                  var1.i(var20, var24, var4, 3);
               }

               var32.e(var25, var23, var20, var24, var2);
               var20 = var1.d();
               var36 = var1.d();
               var20.c = 4;
               var36.c = 4;
               var32.c(var20, var36);
               var1.g(var32);
            }
         }
      }
   }

   public void y() {
      int var4 = aj.p(this.i);
      int var1 = aj.p(this.j);
      int var2 = aj.p(this.k);
      int var3 = aj.p(this.l);
      var2 -= var4;
      var3 -= var1;
      this.w = var4;
      this.x = var1;
      if (this.K == 8) {
         this.s = 0;
         this.t = 0;
      } else {
         var1 = var2;
         if (this.ad == 1) {
            var1 = this.s;
            if (var2 >= var1) {
               var1 = var2;
            }
         }

         var2 = var3;
         if (this.ae == 1) {
            var2 = this.t;
            if (var3 >= var2) {
               var2 = var3;
            }
         }

         this.s = var1;
         this.t = var2;
         var3 = this.E;
         if (var2 < var3) {
            this.t = var3;
         }

         var2 = this.D;
         if (var1 < var2) {
            this.s = var2;
         }

      }
   }

   public void z(AmbientDelegate var1) {
      this.i.e();
      this.j.e();
      this.k.e();
      this.l.e();
      this.m.e();
      this.p.e();
      this.n.e();
      this.o.e();
   }
}
