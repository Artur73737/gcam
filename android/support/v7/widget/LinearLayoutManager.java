package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class LinearLayoutManager extends .lx implements .mi {
   private .kx a;
   private boolean b;
   private boolean c;
   private boolean d;
   private boolean e;
   private final .kw f;
   private int g;
   private int[] h;
   public int k;
   .ln l;
   boolean m;
   int n;
   int o;
   .ky p;
   final .kv q;

   public LinearLayoutManager() {
      this(1);
   }

   public LinearLayoutManager(int var1) {
      this.k = 1;
      this.c = false;
      this.m = false;
      this.d = false;
      this.e = true;
      this.n = -1;
      this.o = Integer.MIN_VALUE;
      this.p = null;
      this.q = new .kv();
      this.f = new .kw();
      this.g = 2;
      this.h = new int[2];
      this.U(var1);
      this.V(false);
   }

   public LinearLayoutManager(Context var1, AttributeSet var2, int var3, int var4) {
      this.k = 1;
      this.c = false;
      this.m = false;
      this.d = false;
      this.e = true;
      this.n = -1;
      this.o = Integer.MIN_VALUE;
      this.p = null;
      this.q = new .kv();
      this.f = new .kw();
      this.g = 2;
      this.h = new int[2];
      .lw var5 = aw(var1, var2, var3, var4);
      this.U(var5.a);
      this.V(var5.c);
      this.r(var5.d);
   }

   private final View bA() {
      return this.M(0, this.am());
   }

   private final View bB() {
      return this.M(this.am() - 1, -1);
   }

   private final View bC() {
      int var1;
      if (this.m) {
         var1 = 0;
      } else {
         var1 = this.am() - 1;
      }

      return this.ay(var1);
   }

   private final View bD() {
      int var1;
      if (this.m) {
         var1 = this.am() - 1;
      } else {
         var1 = 0;
      }

      return this.ay(var1);
   }

   private final void bE(.mc var1, .kx var2) {
      if (var2.a && !var2.m) {
         int var5 = var2.g;
         int var3 = var2.i;
         int var4;
         View var6;
         if (var2.f == -1) {
            var4 = this.am();
            if (var5 >= 0) {
               var5 = this.l.e() - var5 + var3;
               if (!this.m) {
                  --var4;

                  for(var3 = var4; var3 >= 0; --var3) {
                     var6 = this.ay(var3);
                     if (this.l.d(var6) < var5 || this.l.m(var6) < var5) {
                        this.bF(var1, var4, var3);
                        return;
                     }
                  }
               } else {
                  for(var3 = 0; var3 < var4; ++var3) {
                     var6 = this.ay(var3);
                     if (this.l.d(var6) < var5 || this.l.m(var6) < var5) {
                        this.bF(var1, 0, var3);
                        return;
                     }
                  }
               }
            }
         } else if (var5 >= 0) {
            var5 -= var3;
            var4 = this.am();
            if (!this.m) {
               for(var3 = 0; var3 < var4; ++var3) {
                  var6 = this.ay(var3);
                  if (this.l.a(var6) > var5 || this.l.l(var6) > var5) {
                     this.bF(var1, 0, var3);
                     return;
                  }
               }
            } else {
               --var4;

               for(var3 = var4; var3 >= 0; --var3) {
                  var6 = this.ay(var3);
                  if (this.l.a(var6) > var5 || this.l.l(var6) > var5) {
                     this.bF(var1, var4, var3);
                     return;
                  }
               }
            }
         }

      }
   }

   private final void bF(.mc var1, int var2, int var3) {
      if (var2 != var3) {
         int var4 = var2;
         if (var3 > var2) {
            while(true) {
               --var3;
               if (var3 < var2) {
                  break;
               }

               this.aQ(var3, var1);
            }
         } else {
            while(var4 > var3) {
               this.aQ(var4, var1);
               --var4;
            }
         }

      }
   }

   private final void bG() {
      boolean var1;
      if (this.k != 1 && this.Z()) {
         var1 = this.c ^ true;
      } else {
         var1 = this.c;
      }

      this.m = var1;
   }

   private final void bH(int var1, int var2, boolean var3, .mk var4) {
      this.a.m = this.ab();
      this.a.f = var1;
      int[] var10 = this.h;
      var10[0] = 0;
      byte var9 = 1;
      byte var8 = 1;
      var10[1] = 0;
      this.P(var4, var10);
      int var6 = Math.max(0, this.h[0]);
      int var5 = Math.max(0, this.h[1]);
      int var7;
      if (var1 == 1) {
         var7 = var5;
      } else {
         var7 = var6;
      }

      .kx var13 = this.a;
      var13.h = var7;
      if (var1 != 1) {
         var6 = var5;
      }

      var13.i = var6;
      .kx var11;
      byte var12;
      View var14;
      .kx var15;
      if (var1 == 1) {
         var13.h = var7 + this.l.g();
         var14 = this.bC();
         var11 = this.a;
         if (!this.m) {
            var12 = var8;
         } else {
            var12 = -1;
         }

         var11.e = var12;
         var1 = bh(var14);
         var15 = this.a;
         var11.d = var1 + var15.e;
         var15.b = this.l.a(var14);
         var1 = this.l.a(var14) - this.l.f();
      } else {
         var14 = this.bD();
         var15 = this.a;
         var15.h += this.l.j();
         var11 = this.a;
         if (!this.m) {
            var12 = -1;
         } else {
            var12 = var9;
         }

         var11.e = var12;
         var1 = bh(var14);
         var15 = this.a;
         var11.d = var1 + var15.e;
         var15.b = this.l.d(var14);
         var1 = -this.l.d(var14) + this.l.j();
      }

      var13 = this.a;
      var13.c = var2;
      if (var3) {
         var13.c = var2 - var1;
      }

      var13.g = var1;
   }

   private final void bI(.kv var1) {
      this.bJ(var1.b, var1.c);
   }

   private final void bJ(int var1, int var2) {
      this.a.c = this.l.f() - var2;
      .kx var4 = this.a;
      byte var3;
      if (!this.m) {
         var3 = 1;
      } else {
         var3 = -1;
      }

      var4.e = var3;
      var4.d = var1;
      var4.f = 1;
      var4.b = var2;
      var4.g = Integer.MIN_VALUE;
   }

   private final void bK(.kv var1) {
      this.bL(var1.b, var1.c);
   }

   private final void bL(int var1, int var2) {
      this.a.c = var2 - this.l.j();
      .kx var4 = this.a;
      var4.d = var1;
      boolean var3 = this.m;
      byte var5 = 1;
      if (!var3) {
         var5 = -1;
      }

      var4.e = var5;
      var4.f = -1;
      var4.b = var2;
      var4.g = Integer.MIN_VALUE;
   }

   private final int bw(.mk var1) {
      if (this.am() == 0) {
         return 0;
      } else {
         this.Q();
         return .eu.e(var1, this.l, this.ag(this.e ^ true), this.af(this.e ^ true), this, this.e, this.m);
      }
   }

   private final int bx(.mk var1) {
      if (this.am() == 0) {
         return 0;
      } else {
         this.Q();
         return .eu.f(var1, this.l, this.ag(this.e ^ true), this.af(this.e ^ true), this, this.e);
      }
   }

   private final int by(int var1, .mc var2, .mk var3, boolean var4) {
      int var5 = this.l.f() - var1;
      if (var5 > 0) {
         var5 = -this.J(-var5, var2, var3);
         if (var4) {
            var1 = this.l.f() - (var1 + var5);
            if (var1 > 0) {
               this.l.n(var1);
               return var1 + var5;
            }
         }

         return var5;
      } else {
         return 0;
      }
   }

   private final int bz(int var1, .mc var2, .mk var3, boolean var4) {
      int var5 = var1 - this.l.j();
      if (var5 > 0) {
         int var6 = -this.J(var5, var2, var3);
         var5 = var6;
         if (var4) {
            var1 = var1 + var6 - this.l.j();
            var5 = var6;
            if (var1 > 0) {
               this.l.n(-var1);
               var5 = var6 - var1;
            }
         }

         return var5;
      } else {
         return 0;
      }
   }

   private final int c(.mk var1) {
      if (this.am() == 0) {
         return 0;
      } else {
         this.Q();
         return .eu.d(var1, this.l, this.ag(this.e ^ true), this.af(this.e ^ true), this, this.e);
      }
   }

   public final int A(.mk var1) {
      return this.c(var1);
   }

   public final int B(.mk var1) {
      return this.bw(var1);
   }

   public final int C(.mk var1) {
      return this.bx(var1);
   }

   public int D(.mk var1) {
      return this.c(var1);
   }

   public final int E(.mk var1) {
      return this.bw(var1);
   }

   public final int F(.mk var1) {
      return this.bx(var1);
   }

   final int G(int var1) {
      switch(var1) {
      case 1:
         if (this.k == 1) {
            return -1;
         } else {
            if (this.Z()) {
               return 1;
            }

            return -1;
         }
      case 2:
         if (this.k == 1) {
            return 1;
         } else {
            if (this.Z()) {
               return -1;
            }

            return 1;
         }
      case 17:
         if (this.k == 0) {
            return -1;
         }

         return Integer.MIN_VALUE;
      case 33:
         if (this.k == 1) {
            return -1;
         }

         return Integer.MIN_VALUE;
      case 66:
         if (this.k == 0) {
            return 1;
         }

         return Integer.MIN_VALUE;
      case 130:
         if (this.k == 1) {
            return 1;
         }

         return Integer.MIN_VALUE;
      default:
         return Integer.MIN_VALUE;
      }
   }

   final int H(.mc var1, .kx var2, .mk var3, boolean var4) {
      int var7 = var2.c;
      int var5 = var2.g;
      if (var5 != Integer.MIN_VALUE) {
         if (var7 < 0) {
            var2.g = var5 + var7;
         }

         this.bE(var1, var2);
      }

      int var6 = var2.c + var2.h;
      .kw var9 = this.f;

      while((var2.m || var6 > 0) && var2.d(var3)) {
         var9.a = 0;
         var9.b = false;
         var9.c = false;
         var9.d = false;
         this.k(var1, var3, var2, var9);
         if (var9.b) {
            break;
         }

         int var8;
         label45: {
            var5 = var2.b;
            var8 = var9.a;
            var2.b = var5 + var2.f * var8;
            if (var9.c && var2.l == null) {
               var5 = var6;
               if (var3.g) {
                  break label45;
               }
            }

            var2.c -= var8;
            var5 = var6 - var8;
         }

         var6 = var2.g;
         if (var6 != Integer.MIN_VALUE) {
            var6 += var8;
            var2.g = var6;
            var8 = var2.c;
            if (var8 < 0) {
               var2.g = var6 + var8;
            }

            this.bE(var1, var2);
         }

         var6 = var5;
         if (var4) {
            var6 = var5;
            if (var9.d) {
               break;
            }
         }
      }

      return var7 - var2.c;
   }

   public final int I() {
      View var1 = this.ah(0, this.am(), false);
      return var1 == null ? -1 : bh(var1);
   }

   final int J(int var1, .mc var2, .mk var3) {
      if (this.am() != 0 && var1 != 0) {
         this.Q();
         this.a.a = true;
         byte var4;
         if (var1 > 0) {
            var4 = 1;
         } else {
            var4 = -1;
         }

         int var5 = Math.abs(var1);
         this.bH(var4, var5, true, var3);
         .kx var7 = this.a;
         int var6 = var7.g + this.H(var2, var7, var3, false);
         if (var6 < 0) {
            return 0;
         } else {
            if (var5 > var6) {
               var1 = var4 * var6;
            }

            this.l.n(-var1);
            this.a.k = var1;
            return var1;
         }
      } else {
         return 0;
      }
   }

   public final PointF K(int var1) {
      if (this.am() == 0) {
         return null;
      } else {
         boolean var4 = false;
         int var3 = bh(this.ay(0));
         byte var2 = 1;
         if (var1 < var3) {
            var4 = true;
         }

         byte var5;
         if (var4 != this.m) {
            var5 = -1;
         } else {
            var5 = var2;
         }

         return this.k == 0 ? new PointF((float)var5, 0.0F) : new PointF(0.0F, (float)var5);
      }
   }

   public final Parcelable L() {
      .ky var2 = this.p;
      if (var2 != null) {
         return new .ky(var2);
      } else {
         var2 = new .ky();
         if (this.am() > 0) {
            this.Q();
            boolean var1 = this.b ^ this.m;
            var2.c = var1;
            View var3;
            if (var1) {
               var3 = this.bC();
               var2.b = this.l.f() - this.l.a(var3);
               var2.a = bh(var3);
            } else {
               var3 = this.bD();
               var2.a = bh(var3);
               var2.b = this.l.d(var3) - this.l.j();
            }
         } else {
            var2.a();
         }

         return var2;
      }
   }

   final View M(int var1, int var2) {
      this.Q();
      if (var2 <= var1 && var2 >= var1) {
         return this.ay(var1);
      } else {
         int var5 = this.l.d(this.ay(var1));
         int var4 = this.l.j();
         short var3;
         if (var5 < var4) {
            var3 = 16388;
         } else {
            var3 = 4097;
         }

         short var7;
         if (var5 < var4) {
            var7 = 16644;
         } else {
            var7 = 4161;
         }

         View var6;
         if (this.k == 0) {
            var6 = this.E.u(var1, var2, var7, var3);
         } else {
            var6 = this.F.u(var1, var2, var7, var3);
         }

         return var6;
      }
   }

   public final View N(int var1) {
      int var3 = this.am();
      if (var3 == 0) {
         return null;
      } else {
         int var2 = var1 - bh(this.ay(0));
         if (var2 >= 0 && var2 < var3) {
            View var4 = this.ay(var2);
            if (bh(var4) == var1) {
               return var4;
            }
         }

         return super.N(var1);
      }
   }

   public final void O(String var1) {
      if (this.p == null) {
         super.O(var1);
      }

   }

   protected void P(.mk var1, int[] var2) {
      int var3;
      if (var1.c()) {
         var3 = this.l.k();
      } else {
         var3 = 0;
      }

      int var5 = this.a.f;
      int var4;
      if (var5 == -1) {
         var4 = 0;
      } else {
         var4 = var3;
      }

      if (var5 != -1) {
         var3 = 0;
      }

      var2[0] = var3;
      var2[1] = var4;
   }

   final void Q() {
      if (this.a == null) {
         this.a = new .kx();
      }

   }

   public final void R(AccessibilityEvent var1) {
      super.R(var1);
      if (this.am() > 0) {
         var1.setFromIndex(this.I());
         int var3 = this.am();
         int var2 = -1;
         View var4 = this.ah(var3 - 1, -1, false);
         if (var4 != null) {
            var2 = bh(var4);
         }

         var1.setToIndex(var2);
      }
   }

   public final void S(Parcelable var1) {
      if (var1 instanceof .ky) {
         .ky var2 = (.ky)var1;
         this.p = var2;
         if (this.n != -1) {
            var2.a();
         }

         this.aS();
      }

   }

   public final void T(int var1) {
      this.n = var1;
      this.o = Integer.MIN_VALUE;
      .ky var2 = this.p;
      if (var2 != null) {
         var2.a();
      }

      this.aS();
   }

   public final void U(int var1) {
      if (var1 != 0 && var1 != 1) {
         throw new IllegalArgumentException(.c.aE(var1, "invalid orientation:"));
      } else {
         this.O((String)null);
         if (var1 != this.k || this.l == null) {
            .ln var2 = .ln.q(this, var1);
            this.l = var2;
            this.q.a = var2;
            this.k = var1;
            this.aS();
         }
      }
   }

   public final void V(boolean var1) {
      this.O((String)null);
      if (var1 != this.c) {
         this.c = var1;
         this.aS();
      }
   }

   public final boolean W() {
      return this.k == 0;
   }

   public final boolean X() {
      return this.k == 1;
   }

   public final boolean Y() {
      return true;
   }

   protected final boolean Z() {
      return this.ap() == 1;
   }

   public final boolean aa() {
      return this.c;
   }

   final boolean ab() {
      return this.l.h() == 0 && this.l.e() == 0;
   }

   public final boolean ac() {
      if (super.B != 1073741824 && super.A != 1073741824) {
         int var2 = this.am();

         for(int var1 = 0; var1 < var2; ++var1) {
            LayoutParams var3 = this.ay(var1).getLayoutParams();
            if (var3.width < 0 && var3.height < 0) {
               return true;
            }
         }
      }

      return false;
   }

   public final void ad(int var1, int var2, .mk var3, .ko var4) {
      if (1 == this.k) {
         var1 = var2;
      }

      if (this.am() != 0 && var1 != 0) {
         this.Q();
         byte var5;
         if (var1 > 0) {
            var5 = 1;
         } else {
            var5 = -1;
         }

         this.bH(var5, Math.abs(var1), true, var3);
         this.v(var3, this.a, var4);
      }
   }

   public final void ae(int var1, .ko var2) {
      .ky var8 = this.p;
      byte var4 = -1;
      int var3;
      int var5;
      boolean var6;
      if (var8 != null && var8.b()) {
         var6 = var8.c;
         var3 = var8.a;
      } else {
         this.bG();
         boolean var7 = this.m;
         var5 = this.n;
         var3 = var5;
         var6 = var7;
         if (var5 == -1) {
            if (var7) {
               var3 = var1 - 1;
               var6 = var7;
            } else {
               var3 = 0;
               var6 = var7;
            }
         }
      }

      if (!var6) {
         var4 = 1;
      }

      for(var5 = 0; var5 < this.g && var3 >= 0 && var3 < var1; ++var5) {
         var2.a(var3, 0);
         var3 += var4;
      }

   }

   final View af(boolean var1) {
      return this.m ? this.ah(0, this.am(), var1) : this.ah(this.am() - 1, -1, var1);
   }

   final View ag(boolean var1) {
      return this.m ? this.ah(this.am() - 1, -1, var1) : this.ah(0, this.am(), var1);
   }

   final View ah(int var1, int var2, boolean var3) {
      this.Q();
      int var5 = this.k;
      short var4;
      if (!var3) {
         var4 = 320;
      } else {
         var4 = 24579;
      }

      View var6;
      if (var5 == 0) {
         var6 = this.E.u(var1, var2, var4, 320);
      } else {
         var6 = this.F.u(var1, var2, var4, 320);
      }

      return var6;
   }

   public void ai(RecyclerView var1) {
   }

   public final void aj(int var1) {
      this.n = var1;
      this.o = 0;
      .ky var2 = this.p;
      if (var2 != null) {
         var2.a();
      }

      this.aS();
   }

   public final void ak(RecyclerView var1, int var2) {
      .mj var3 = new .mj(var1.getContext());
      var3.b = var2;
      this.aY(var3);
   }

   public int d(int var1, .mc var2, .mk var3) {
      return this.k == 1 ? 0 : this.J(var1, var2, var3);
   }

   public int e(int var1, .mc var2, .mk var3) {
      return this.k == 0 ? 0 : this.J(var1, var2, var3);
   }

   public .ly f() {
      return new .ly(-2, -2);
   }

   public View i(.mc var1, .mk var2, boolean var3, boolean var4) {
      this.Q();
      int var7 = this.am();
      int var5;
      byte var6;
      if (var4) {
         var5 = this.am();
         var7 = -1;
         --var5;
         var6 = -1;
      } else {
         var5 = 0;
         var6 = 1;
      }

      int var12 = var2.a();
      int var10 = this.l.j();
      int var11 = this.l.f();
      View var20 = null;
      View var15 = null;

      View var18;
      View var19;
      for(var19 = null; var5 != var7; var19 = var18) {
         View var14 = this.ay(var5);
         int var8 = bh(var14);
         int var9 = this.l.d(var14);
         int var13 = this.l.a(var14);
         View var17 = var20;
         View var16 = var15;
         var18 = var19;
         if (var8 >= 0) {
            var17 = var20;
            var16 = var15;
            var18 = var19;
            if (var8 < var12) {
               if (((.ly)var14.getLayoutParams()).c()) {
                  var17 = var20;
                  var16 = var15;
                  var18 = var19;
                  if (var19 == null) {
                     var17 = var20;
                     var16 = var15;
                     var18 = var14;
                  }
               } else {
                  label89: {
                     boolean var21;
                     if (var13 <= var10 && var9 < var10) {
                        var21 = true;
                     } else {
                        var21 = false;
                     }

                     boolean var22;
                     if (var9 >= var11 && var13 > var11) {
                        var22 = true;
                     } else {
                        var22 = false;
                     }

                     if (!var21 && !var22) {
                        return var14;
                     }

                     label66: {
                        if (var3) {
                           if (var22) {
                              break label66;
                           }

                           var17 = var20;
                           var16 = var15;
                           var18 = var19;
                           if (var20 != null) {
                              break label89;
                           }
                        } else {
                           if (var21) {
                              break label66;
                           }

                           var17 = var20;
                           var16 = var15;
                           var18 = var19;
                           if (var20 != null) {
                              break label89;
                           }
                        }

                        var18 = var19;
                        var16 = var15;
                        var17 = var14;
                        break label89;
                     }

                     var17 = var20;
                     var16 = var14;
                     var18 = var19;
                  }
               }
            }
         }

         var5 += var6;
         var20 = var17;
         var15 = var16;
      }

      if (var20 != null) {
         var19 = var20;
      } else if (var15 != null) {
         return var15;
      }

      return var19;
   }

   public View j(View var1, int var2, .mc var3, .mk var4) {
      this.bG();
      if (this.am() == 0) {
         return null;
      } else {
         var2 = this.G(var2);
         if (var2 == Integer.MIN_VALUE) {
            return null;
         } else {
            this.Q();
            this.bH(var2, (int)((float)this.l.k() * 0.33333334F), false, var4);
            .kx var5 = this.a;
            var5.g = Integer.MIN_VALUE;
            var5.a = false;
            this.H(var3, var5, var4, true);
            if (var2 == -1) {
               if (this.m) {
                  var1 = this.bB();
               } else {
                  var1 = this.bA();
               }

               var2 = -1;
            } else if (this.m) {
               var1 = this.bA();
            } else {
               var1 = this.bB();
            }

            View var6;
            if (var2 == -1) {
               var6 = this.bD();
            } else {
               var6 = this.bC();
            }

            if (var6.hasFocusable()) {
               return var1 == null ? null : var6;
            } else {
               return var1;
            }
         }
      }
   }

   public void k(.mc var1, .mk var2, .kx var3, .kw var4) {
      View var12 = var3.a(var1);
      if (var12 == null) {
         var4.b = true;
      } else {
         .ly var14 = (.ly)var12.getLayoutParams();
         boolean var10;
         boolean var11;
         if (var3.l == null) {
            var11 = this.m;
            if (var3.f != -1) {
               var10 = false;
            } else {
               var10 = true;
            }

            if (var11 == var10) {
               this.aC(var12);
            } else {
               this.aD(var12, 0);
            }
         } else {
            var11 = this.m;
            if (var3.f != -1) {
               var10 = false;
            } else {
               var10 = true;
            }

            if (var11 == var10) {
               this.aA(var12);
            } else {
               this.aB(var12, 0);
            }
         }

         .ly var13 = (.ly)var12.getLayoutParams();
         Rect var15 = super.s.e(var12);
         int var8 = var15.left;
         int var7 = var15.right;
         int var6 = var15.top;
         int var5 = var15.bottom;
         var7 = .lx.an(super.C, super.A, this.at() + this.au() + var13.leftMargin + var13.rightMargin + var8 + var7, var13.width, this.W());
         var5 = .lx.an(super.D, super.B, this.av() + this.as() + var13.topMargin + var13.bottomMargin + var6 + var5, var13.height, this.X());
         if (this.bc(var12, var7, var5, var13)) {
            var12.measure(var7, var5);
         }

         var4.a = this.l.b(var12);
         int var9;
         if (this.k == 1) {
            if (this.Z()) {
               var7 = super.C - this.au();
               var6 = var7 - this.l.c(var12);
            } else {
               var6 = this.at();
               var7 = this.l.c(var12) + var6;
            }

            if (var3.f == -1) {
               var5 = var3.b;
               var9 = var5 - var4.a;
               var8 = var6;
               var6 = var9;
            } else {
               var9 = var3.b;
               var5 = var4.a + var9;
               var8 = var6;
               var6 = var9;
            }
         } else {
            var5 = this.av();
            var9 = this.l.c(var12) + var5;
            if (var3.f == -1) {
               var6 = var3.b;
               var8 = var4.a;
               var7 = var6;
               var8 = var6 - var8;
               var6 = var5;
               var5 = var9;
            } else {
               var6 = var3.b;
               var7 = var4.a;
               var8 = var6;
               var7 += var6;
               var6 = var5;
               var5 = var9;
            }
         }

         bm(var12, var8, var6, var7, var5);
         if (var14.c() || var14.b()) {
            var4.c = true;
         }

         var4.d = var12.hasFocusable();
      }
   }

   public void l(.mc var1, .mk var2, .kv var3, int var4) {
   }

   public void m(.mc var1, .mk var2, .cht var3) {
      super.m(var1, var2, var3);
      .lq var4 = this.s.m;
      if (var4 != null && var4.a() > 0) {
         var3.h(.chr.x);
      }

   }

   public void o(.mc var1, .mk var2) {
      .ky var14 = this.p;
      byte var5 = -1;
      if ((var14 != null || this.n != -1) && var2.a() == 0) {
         this.aN(var1);
      } else {
         var14 = this.p;
         if (var14 != null && var14.b()) {
            this.n = var14.a;
         }

         this.Q();
         this.a.a = false;
         this.bG();
         View var15 = this.az();
         .kv var22 = this.q;
         int var3;
         int var4;
         int var6;
         int var7;
         int var8;
         boolean var12;
         if (var22.e && this.n == -1 && this.p == null) {
            if (var15 != null && (this.l.d(var15) >= this.l.f() || this.l.a(var15) <= this.l.j())) {
               this.q.c(var15, bh(var15));
            }
         } else {
            label270: {
               var22.d();
               var22 = this.q;
               var22.d = this.m ^ this.d;
               if (!var2.g) {
                  var3 = this.n;
                  if (var3 != -1) {
                     if (var3 >= 0 && var3 < var2.a()) {
                        var3 = this.n;
                        var22.b = var3;
                        .ky var25 = this.p;
                        if (var25 != null && var25.b()) {
                           var12 = var25.c;
                           var22.d = var12;
                           if (var12) {
                              var22.c = this.l.f() - this.p.b;
                           } else {
                              var22.c = this.l.j() + this.p.b;
                           }
                           break label270;
                        }

                        if (this.o == Integer.MIN_VALUE) {
                           var15 = this.N(var3);
                           if (var15 != null) {
                              if (this.l.b(var15) > this.l.k()) {
                                 var22.a();
                              } else if (this.l.d(var15) - this.l.j() < 0) {
                                 var22.c = this.l.j();
                                 var22.d = false;
                              } else if (this.l.f() - this.l.a(var15) < 0) {
                                 var22.c = this.l.f();
                                 var22.d = true;
                              } else {
                                 if (var22.d) {
                                    var3 = this.l.a(var15) + this.l.o();
                                 } else {
                                    var3 = this.l.d(var15);
                                 }

                                 var22.c = var3;
                              }
                           } else {
                              if (this.am() > 0) {
                                 var3 = bh(this.ay(0));
                                 if (this.n >= var3) {
                                    var12 = false;
                                 } else {
                                    var12 = true;
                                 }

                                 if (var12 == this.m) {
                                    var12 = true;
                                 } else {
                                    var12 = false;
                                 }

                                 var22.d = var12;
                              }

                              var22.a();
                           }
                        } else {
                           var12 = this.m;
                           var22.d = var12;
                           if (var12) {
                              var22.c = this.l.f() - this.o;
                           } else {
                              var22.c = this.l.j() + this.o;
                           }
                        }
                        break label270;
                     }

                     this.n = -1;
                     this.o = Integer.MIN_VALUE;
                  }
               }

               if (this.am() != 0) {
                  var15 = this.az();
                  if (var15 != null) {
                     .ly var16 = (.ly)var15.getLayoutParams();
                     if (!var16.c() && var16.a() >= 0 && var16.a() < var2.a()) {
                        var22.c(var15, bh(var15));
                        break label270;
                     }
                  }

                  boolean var13 = this.b;
                  var12 = this.d;
                  if (var13 == var12) {
                     var15 = this.i(var1, var2, var22.d, var12);
                     if (var15 != null) {
                        var22.b(var15, bh(var15));
                        if (var2.g || !this.u()) {
                           break label270;
                        }

                        var4 = this.l.d(var15);
                        var8 = this.l.a(var15);
                        var6 = this.l.j();
                        var7 = this.l.f();
                        boolean var18;
                        if (var8 <= var6 && var4 < var6) {
                           var18 = true;
                        } else {
                           var18 = false;
                        }

                        boolean var19;
                        if (var4 >= var7 && var8 > var7) {
                           var19 = true;
                        } else {
                           var19 = false;
                        }

                        if (!var18 && !var19) {
                           break label270;
                        }

                        if (!var22.d) {
                           var3 = var6;
                        } else {
                           var3 = var7;
                        }

                        var22.c = var3;
                        break label270;
                     }
                  }
               }

               var22.a();
               if (this.d) {
                  var3 = var2.a() - 1;
               } else {
                  var3 = 0;
               }

               var22.b = var3;
            }

            this.q.e = true;
         }

         .kx var23 = this.a;
         byte var21;
         if (var23.k >= 0) {
            var21 = 1;
         } else {
            var21 = -1;
         }

         label211: {
            var23.f = var21;
            int[] var24 = this.h;
            var24[0] = 0;
            var24[1] = 0;
            this.P(var2, var24);
            var6 = Math.max(0, this.h[0]) + this.l.j();
            var4 = Math.max(0, this.h[1]) + this.l.g();
            if (var2.g) {
               var3 = this.n;
               if (var3 != -1 && this.o != Integer.MIN_VALUE) {
                  View var26 = this.N(var3);
                  if (var26 != null) {
                     if (this.m) {
                        var3 = this.l.f() - this.l.a(var26) - this.o;
                     } else {
                        var3 = this.l.d(var26);
                        var7 = this.l.j();
                        var3 = this.o - (var3 - var7);
                     }

                     if (var3 > 0) {
                        var3 += var6;
                     } else {
                        var4 -= var3;
                        var3 = var6;
                     }
                     break label211;
                  }
               }
            }

            var3 = var6;
         }

         label204: {
            var22 = this.q;
            if (var22.d) {
               if (!this.m) {
                  break label204;
               }
            } else if (this.m) {
               break label204;
            }

            var5 = 1;
         }

         this.l(var1, var2, var22, var5);
         this.aF(var1);
         this.a.m = this.ab();
         var23 = this.a;
         var23.j = var2.g;
         var23.i = 0;
         var22 = this.q;
         int var20;
         if (var22.d) {
            this.bK(var22);
            var23 = this.a;
            var23.h = var3;
            this.H(var1, var23, var2, false);
            var23 = this.a;
            var20 = var23.b;
            var7 = var23.d;
            var6 = var23.c;
            var3 = var4;
            if (var6 > 0) {
               var3 = var4 + var6;
            }

            this.bI(this.q);
            var23 = this.a;
            var23.h = var3;
            var23.d += var23.e;
            this.H(var1, var23, var2, false);
            var23 = this.a;
            var6 = var23.b;
            var8 = var23.c;
            var4 = var20;
            var3 = var6;
            if (var8 > 0) {
               this.bL(var7, var20);
               var23 = this.a;
               var23.h = var8;
               this.H(var1, var23, var2, false);
               var4 = this.a.b;
               var3 = var6;
            }
         } else {
            this.bI(var22);
            var23 = this.a;
            var23.h = var4;
            this.H(var1, var23, var2, false);
            var23 = this.a;
            var20 = var23.b;
            var7 = var23.d;
            var6 = var23.c;
            var4 = var3;
            if (var6 > 0) {
               var4 = var3 + var6;
            }

            this.bK(this.q);
            var23 = this.a;
            var23.h = var4;
            var23.d += var23.e;
            this.H(var1, var23, var2, false);
            var23 = this.a;
            var6 = var23.b;
            var8 = var23.c;
            var4 = var6;
            var3 = var20;
            if (var8 > 0) {
               this.bJ(var7, var20);
               var23 = this.a;
               var23.h = var8;
               this.H(var1, var23, var2, false);
               var3 = this.a.b;
               var4 = var6;
            }
         }

         var6 = var4;
         var20 = var3;
         if (this.am() > 0) {
            if (this.m ^ this.d) {
               var20 = this.by(var3, var1, var2, true);
               var6 = var4 + var20;
               var4 = this.bz(var6, var1, var2, false);
               var6 += var4;
               var20 = var3 + var20 + var4;
            } else {
               var6 = this.bz(var4, var1, var2, true);
               var20 = var3 + var6;
               var3 = this.by(var20, var1, var2, false);
               var6 = var4 + var6 + var3;
               var20 += var3;
            }
         }

         if (var2.k && this.am() != 0 && !var2.g && this.u()) {
            List var28 = var1.d;
            int var10 = var28.size();
            int var11 = bh(this.ay(0));
            var4 = 0;
            var7 = 0;

            for(var3 = 0; var4 < var10; var3 = var8) {
               .mn var27 = (.mn)var28.get(var4);
               int var9 = var7;
               var8 = var3;
               if (!var27.u()) {
                  if (var27.b() >= var11) {
                     var12 = false;
                  } else {
                     var12 = true;
                  }

                  if (var12 != this.m) {
                     var9 = var7 + this.l.b(var27.a);
                     var8 = var3;
                  } else {
                     var8 = var3 + this.l.b(var27.a);
                     var9 = var7;
                  }
               }

               ++var4;
               var7 = var9;
            }

            this.a.l = var28;
            if (var7 > 0) {
               this.bL(bh(this.bD()), var6);
               var23 = this.a;
               var23.h = var7;
               var23.c = 0;
               var23.b();
               this.H(var1, this.a, var2, false);
            }

            if (var3 > 0) {
               this.bJ(bh(this.bC()), var20);
               var23 = this.a;
               var23.h = var3;
               var23.c = 0;
               var23.b();
               this.H(var1, this.a, var2, false);
            }

            this.a.l = null;
         }

         if (!var2.g) {
            .ln var17 = this.l;
            var17.b = var17.k();
         } else {
            this.q.d();
         }

         this.b = this.d;
      }
   }

   public void p(.mk var1) {
      this.p = null;
      this.n = -1;
      this.o = Integer.MIN_VALUE;
      this.q.d();
   }

   public void r(boolean var1) {
      this.O((String)null);
      if (this.d != var1) {
         this.d = var1;
         this.aS();
      }
   }

   public boolean t(int var1, Bundle var2) {
      if (super.t(var1, var2)) {
         return true;
      } else {
         if (var1 == 16908343 && var2 != null) {
            RecyclerView var3;
            if (this.k == 1) {
               var1 = var2.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
               if (var1 < 0) {
                  return false;
               }

               var3 = this.s;
               var1 = Math.min(var1, this.b(var3.f, var3.M) - 1);
            } else {
               var1 = var2.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
               if (var1 < 0) {
                  return false;
               }

               var3 = this.s;
               var1 = Math.min(var1, this.a(var3.f, var3.M) - 1);
            }

            if (var1 >= 0) {
               this.aj(var1);
               return true;
            }
         }

         return false;
      }
   }

   public boolean u() {
      return this.p == null && this.b == this.d;
   }

   public void v(.mk var1, .kx var2, .ko var3) {
      int var4 = var2.d;
      if (var4 >= 0 && var4 < var1.a()) {
         var3.a(var4, Math.max(0, var2.g));
      }

   }
}
