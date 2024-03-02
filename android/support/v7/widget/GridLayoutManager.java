package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.GridView;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class GridLayoutManager extends LinearLayoutManager {
   private static final Set G = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
   private int H;
   boolean a = false;
   int b = -1;
   int[] c;
   View[] d;
   final SparseIntArray e = new SparseIntArray();
   final SparseIntArray f = new SparseIntArray();
   final Rect g;
   int h;
   int i;
   final .bpe j;

   public GridLayoutManager(Context var1, AttributeSet var2, int var3, int var4) {
      super(var1, var2, var3, var4);
      .bpe var5 = new .bpe((short[])null);
      this.j = var5;
      this.g = new Rect();
      this.H = -1;
      this.h = -1;
      this.i = -1;
      var3 = aw(var1, var2, var3, var4).b;
      if (var3 != this.b) {
         this.a = true;
         if (var3 > 0) {
            this.b = var3;
            var5.l();
            this.aS();
         } else {
            throw new IllegalArgumentException(.c.aE(var3, "Span count should be at least 1. Provided "));
         }
      }
   }

   private final int bA(.mc var1, .mk var2, int var3) {
      if (!var2.g) {
         return 1;
      } else {
         int var4 = this.e.get(var3, -1);
         if (var4 != -1) {
            return var4;
         } else {
            if (var1.a(var3) == -1) {
               Log.w("GridLayoutManager", .c.aE(var3, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"));
            }

            return 1;
         }
      }
   }

   private final Set bB(int var1) {
      return this.bD(this.bw(var1), var1);
   }

   private final Set bC(int var1) {
      return this.bD(this.bx(var1), var1);
   }

   private final Set bD(int var1, int var2) {
      HashSet var4 = new HashSet();
      RecyclerView var5 = this.s;
      int var3 = this.bA(var5.f, var5.M, var2);

      for(var2 = var1; var2 < var1 + var3; ++var2) {
         var4.add(var2);
      }

      return var4;
   }

   private final void bE(int var1) {
      int var2;
      int var6;
      int[] var8;
      label29: {
         int[] var9 = this.c;
         var6 = this.b;
         if (var9 != null) {
            var2 = var9.length;
            if (var2 == var6 + 1) {
               var8 = var9;
               if (var9[var2 - 1] == var1) {
                  break label29;
               }
            }
         }

         var8 = new int[var6 + 1];
      }

      byte var4 = 0;
      var8[0] = 0;
      int var5 = var1 / var6;
      int var7 = var1 % var6;
      int var3 = 0;
      var2 = 1;

      for(var1 = var4; var2 <= var6; ++var2) {
         var1 += var7;
         int var10;
         if (var1 > 0 && var6 - var1 < var7) {
            var10 = var5 + 1;
            var1 -= var6;
         } else {
            var10 = var5;
         }

         var3 += var10;
         var8[var2] = var3;
      }

      this.c = var8;
   }

   private final void bF() {
      View[] var2 = this.d;
      if (var2 != null) {
         int var1 = this.b;
         if (var2.length == var1) {
            return;
         }
      }

      this.d = new View[this.b];
   }

   private final void bG(View var1, int var2, boolean var3) {
      .ks var7 = (.ks)var1.getLayoutParams();
      Rect var8 = var7.d;
      int var5 = var8.top + var8.bottom + var7.topMargin + var7.bottomMargin;
      int var4 = var8.left + var8.right + var7.leftMargin + var7.rightMargin;
      int var6 = this.c(var7.a, var7.b);
      if (this.k == 1) {
         var4 = an(var6, var2, var4, var7.width, false);
         var2 = an(this.l.k(), super.B, var5, var7.height, true);
      } else {
         var2 = an(var6, var2, var5, var7.height, false);
         var4 = an(this.l.k(), super.A, var4, var7.width, true);
      }

      this.bH(var1, var4, var2, var3);
   }

   private final void bH(View var1, int var2, int var3, boolean var4) {
      .ly var6 = (.ly)var1.getLayoutParams();
      if (var4) {
         boolean var5 = super.w;
         var4 = true;
         if (var5 && .lx.aZ(var1.getMeasuredWidth(), var2, var6.width) && .lx.aZ(var1.getMeasuredHeight(), var3, var6.height)) {
            var4 = false;
         }
      } else {
         var4 = this.bc(var1, var2, var3, var6);
      }

      if (var4) {
         var1.measure(var2, var3);
      }

   }

   private final void bI() {
      int var1;
      if (super.k == 1) {
         var1 = super.C - this.au() - this.at();
      } else {
         var1 = super.D - this.as() - this.av();
      }

      this.bE(var1);
   }

   private final int bw(int var1) {
      RecyclerView var2;
      if (this.k == 0) {
         var2 = this.s;
         var1 = this.by(var2.f, var2.M, var1);
      } else {
         var2 = this.s;
         var1 = this.bz(var2.f, var2.M, var1);
      }

      return var1;
   }

   private final int bx(int var1) {
      RecyclerView var2;
      if (this.k == 1) {
         var2 = this.s;
         var1 = this.by(var2.f, var2.M, var1);
      } else {
         var2 = this.s;
         var1 = this.bz(var2.f, var2.M, var1);
      }

      return var1;
   }

   private final int by(.mc var1, .mk var2, int var3) {
      if (!var2.g) {
         return .bpe.m(var3, this.b);
      } else {
         int var4 = var1.a(var3);
         if (var4 == -1) {
            Log.w("GridLayoutManager", .c.aE(var3, "Cannot find span size for pre layout position. "));
            return 0;
         } else {
            return .bpe.m(var4, this.b);
         }
      }
   }

   private final int bz(.mc var1, .mk var2, int var3) {
      if (!var2.g) {
         return var3 % this.b;
      } else {
         int var4 = this.f.get(var3, -1);
         if (var4 != -1) {
            return var4;
         } else {
            var4 = var1.a(var3);
            if (var4 == -1) {
               Log.w("GridLayoutManager", .c.aE(var3, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"));
               return 0;
            } else {
               return var4 % this.b;
            }
         }
      }
   }

   public final int a(.mc var1, .mk var2) {
      if (this.k == 1) {
         return Math.min(this.b, this.ao());
      } else {
         return var2.a() <= 0 ? 0 : this.by(var1, var2, var2.a() - 1) + 1;
      }
   }

   public final int b(.mc var1, .mk var2) {
      if (this.k == 0) {
         return Math.min(this.b, this.ao());
      } else {
         return var2.a() <= 0 ? 0 : this.by(var1, var2, var2.a() - 1) + 1;
      }
   }

   final int c(int var1, int var2) {
      int[] var3;
      if (this.k == 1 && this.Z()) {
         var3 = this.c;
         var1 = this.b - var1;
         return var3[var1] - var3[var1 - var2];
      } else {
         var3 = this.c;
         return var3[var2 + var1] - var3[var1];
      }
   }

   public final int d(int var1, .mc var2, .mk var3) {
      this.bI();
      this.bF();
      return super.d(var1, var2, var3);
   }

   public final int e(int var1, .mc var2, .mk var3) {
      this.bI();
      this.bF();
      return super.e(var1, var2, var3);
   }

   public final .ly f() {
      return this.k == 0 ? new .ks(-2, -1) : new .ks(-1, -2);
   }

   public final .ly g(LayoutParams var1) {
      return var1 instanceof MarginLayoutParams ? new .ks((MarginLayoutParams)var1) : new .ks(var1);
   }

   public final .ly h(Context var1, AttributeSet var2) {
      return new .ks(var1, var2);
   }

   public final View i(.mc var1, .mk var2, boolean var3, boolean var4) {
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

      int var10 = var2.a();
      this.Q();
      int var9 = this.l.j();
      int var8 = this.l.f();
      View var15 = null;

      View var12;
      View var13;
      for(var12 = null; var5 != var7; var12 = var13) {
         View var16 = this.ay(var5);
         int var11 = bh(var16);
         View var14 = var15;
         var13 = var12;
         if (var11 >= 0) {
            var14 = var15;
            var13 = var12;
            if (var11 < var10) {
               if (this.bz(var1, var2, var11) != 0) {
                  var14 = var15;
                  var13 = var12;
               } else if (((.ly)var16.getLayoutParams()).c()) {
                  var14 = var15;
                  var13 = var12;
                  if (var12 == null) {
                     var13 = var16;
                     var14 = var15;
                  }
               } else {
                  if (this.l.d(var16) < var8 && this.l.a(var16) >= var9) {
                     return var16;
                  }

                  var14 = var15;
                  var13 = var12;
                  if (var15 == null) {
                     var14 = var16;
                     var13 = var12;
                  }
               }
            }
         }

         var5 += var6;
         var15 = var14;
      }

      if (var15 != null) {
         return var15;
      } else {
         return var12;
      }
   }

   public final View j(View var1, int var2, .mc var3, .mk var4) {
      View var19 = this.ax(var1);
      View var20 = null;
      if (var19 == null) {
         return null;
      } else {
         .ks var21 = (.ks)var19.getLayoutParams();
         int var14 = var21.a;
         int var15 = var21.b + var14;
         if (super.j(var1, var2, var3, var4) == null) {
            return null;
         } else {
            boolean var18;
            if (this.G(var2) != 1) {
               var18 = false;
            } else {
               var18 = true;
            }

            int var5;
            byte var6;
            if (var18 != this.m) {
               var5 = this.am() - 1;
               var2 = -1;
               var6 = -1;
            } else {
               var2 = this.am();
               var5 = 0;
               var6 = 1;
            }

            boolean var7;
            if (this.k == 1 && this.Z()) {
               var7 = true;
            } else {
               var7 = false;
            }

            int var9 = this.by(var3, var4, var5);
            int var8 = var5;
            int var12 = -1;
            byte var13 = 0;
            int var11 = 0;
            int var10 = -1;
            var1 = null;
            var5 = var9;
            var9 = var2;

            for(var2 = var13; var8 != var9; var8 += var6) {
               int var23 = this.by(var3, var4, var8);
               View var25 = this.ay(var8);
               if (var25 == var19) {
                  break;
               }

               if (var25.hasFocusable() && var23 != var5) {
                  if (var20 != null) {
                     break;
                  }
               } else {
                  .ks var22 = (.ks)var25.getLayoutParams();
                  int var17 = var22.a;
                  int var16 = var22.b + var17;
                  if (var25.hasFocusable() && var17 == var14 && var16 == var15) {
                     return var25;
                  }

                  if ((!var25.hasFocusable() || var20 != null) && (var25.hasFocusable() || var1 != null)) {
                     var23 = Math.max(var17, var14);
                     var23 = Math.min(var16, var15) - var23;
                     boolean var24;
                     if (var25.hasFocusable()) {
                        if (var23 <= var2) {
                           if (var23 != var2) {
                              continue;
                           }

                           if (var17 <= var10) {
                              var24 = false;
                           } else {
                              var24 = true;
                           }

                           if (var7 != var24) {
                              continue;
                           }
                        }
                     } else {
                        if (var20 != null || super.E.v(var25) && super.F.v(var25)) {
                           continue;
                        }

                        if (var23 <= var11) {
                           if (var23 != var11) {
                              continue;
                           }

                           if (var17 <= var12) {
                              var24 = false;
                           } else {
                              var24 = true;
                           }

                           if (var7 != var24) {
                              continue;
                           }
                        }
                     }
                  }

                  if (var25.hasFocusable()) {
                     var10 = var22.a;
                     var2 = Math.min(var16, var15) - Math.max(var17, var14);
                     var20 = var25;
                  } else {
                     var12 = var22.a;
                     var11 = Math.min(var16, var15) - Math.max(var17, var14);
                     var1 = var25;
                  }
               }
            }

            return var20 != null ? var20 : var1;
         }
      }
   }

   public final void k(.mc var1, .mk var2, .kx var3, .kw var4) {
      int var15 = this.l.i();
      int var9;
      if (this.am() > 0) {
         var9 = this.c[this.b];
      } else {
         var9 = 0;
      }

      boolean var10;
      if (var15 != 1073741824) {
         var10 = true;
      } else {
         var10 = false;
      }

      if (var10) {
         this.bI();
      }

      int var16 = var3.e;
      int var8 = this.b;
      int var12;
      if (var16 != 1) {
         var8 = this.bz(var1, var2, var3.d) + this.bA(var1, var2, var3.d);
         var12 = 0;
      } else {
         var12 = 0;
      }

      int var11;
      int var13;
      View var19;
      while(var12 < this.b && var3.d(var2) && var8 > 0) {
         var13 = var3.d;
         var11 = this.bA(var1, var2, var13);
         if (var11 > this.b) {
            StringBuilder var21 = new StringBuilder();
            var21.append("Item at position ");
            var21.append(var13);
            var21.append(" requires ");
            var21.append(var11);
            var21.append(" spans but GridLayoutManager has only ");
            var21.append(this.b);
            var21.append(" spans.");
            throw new IllegalArgumentException(var21.toString());
         }

         var8 -= var11;
         if (var8 < 0) {
            break;
         }

         var19 = var3.a(var1);
         if (var19 == null) {
            break;
         }

         this.d[var12] = var19;
         ++var12;
      }

      if (var12 == 0) {
         var4.b = true;
      } else {
         byte var26;
         if (var16 == 1) {
            var13 = var12;
            var8 = 0;
            var26 = 1;
         } else {
            var8 = var12 - 1;
            var13 = -1;
            var26 = -1;
         }

         int var14;
         for(var14 = 0; var8 != var13; var8 += var26) {
            var19 = this.d[var8];
            .ks var20 = (.ks)var19.getLayoutParams();
            int var17 = this.bA(var1, var2, bh(var19));
            var20.b = var17;
            var20.a = var14;
            var14 += var17;
         }

         float var6 = 0.0F;
         var11 = 0;

         View var22;
         .ks var24;
         for(var8 = 0; var11 < var12; var8 = var13) {
            var22 = this.d[var11];
            if (var3.l == null) {
               if (var16 == 1) {
                  this.aC(var22);
               } else {
                  this.aD(var22, 0);
               }
            } else if (var16 == 1) {
               this.aA(var22);
            } else {
               this.aB(var22, 0);
            }

            this.aE(var22, this.g);
            this.bG(var22, var15, false);
            var14 = this.l.b(var22);
            var13 = var8;
            if (var14 > var8) {
               var13 = var14;
            }

            var24 = (.ks)var22.getLayoutParams();
            float var7 = (float)this.l.c(var22) / (float)var24.b;
            float var5 = var6;
            if (var7 > var6) {
               var5 = var7;
            }

            ++var11;
            var6 = var5;
         }

         var11 = var8;
         int var25;
         if (var10) {
            this.bE(Math.max(Math.round(var6 * (float)this.b), var9));
            var8 = 0;
            var9 = 0;

            while(true) {
               var11 = var8;
               if (var9 >= var12) {
                  break;
               }

               var22 = this.d[var9];
               this.bG(var22, 1073741824, true);
               var11 = this.l.b(var22);
               var25 = var8;
               if (var11 > var8) {
                  var25 = var11;
               }

               ++var9;
               var8 = var25;
            }
         }

         for(var8 = 0; var8 < var12; ++var8) {
            var19 = this.d[var8];
            if (this.l.b(var19) != var11) {
               var24 = (.ks)var19.getLayoutParams();
               Rect var23 = var24.d;
               var9 = var23.top + var23.bottom + var24.topMargin + var24.bottomMargin;
               var25 = var23.left + var23.right + var24.leftMargin + var24.rightMargin;
               var13 = this.c(var24.a, var24.b);
               if (this.k == 1) {
                  var25 = an(var13, 1073741824, var25, var24.width, false);
                  var9 = MeasureSpec.makeMeasureSpec(var11 - var9, 1073741824);
               } else {
                  var25 = MeasureSpec.makeMeasureSpec(var11 - var25, 1073741824);
                  var9 = an(var13, 1073741824, var9, var24.height, false);
               }

               this.bH(var19, var25, var9, true);
            }
         }

         var4.a = var11;
         if (this.k == 1) {
            if (var3.f == -1) {
               var8 = var3.b;
               var9 = 0;
               var25 = 0;
               var11 = var8 - var11;
            } else {
               var13 = var3.b;
               var8 = var13 + var11;
               var9 = 0;
               var25 = 0;
               var11 = var13;
            }
         } else if (var3.f == -1) {
            var25 = var3.b;
            var9 = var25 - var11;
            var8 = 0;
            var11 = 0;
         } else {
            var9 = var3.b;
            var25 = var9 + var11;
            var8 = 0;
            var11 = 0;
         }

         byte var27 = 0;
         var13 = var11;
         var11 = var27;
         var14 = var25;
         var15 = var9;

         for(var25 = var8; var11 < var12; var14 = var9) {
            var22 = this.d[var11];
            var24 = (.ks)var22.getLayoutParams();
            if (this.k == 1) {
               if (this.Z()) {
                  var8 = this.at() + this.c[this.b - var24.a];
                  var14 = this.l.c(var22);
                  var9 = var8;
                  var8 -= var14;
               } else {
                  var8 = this.at() + this.c[var24.a];
                  var9 = this.l.c(var22) + var8;
               }
            } else {
               var8 = this.av() + this.c[var24.a];
               var9 = this.l.c(var22);
               var13 = var8;
               var25 = var9 + var8;
               var9 = var14;
               var8 = var15;
            }

            bm(var22, var8, var13, var9, var25);
            if (var24.c() || var24.b()) {
               var4.c = true;
            }

            boolean var18 = var4.d;
            var4.d = var22.hasFocusable() | var18;
            ++var11;
            var15 = var8;
         }

         Arrays.fill(this.d, (Object)null);
      }
   }

   public final void l(.mc var1, .mk var2, .kv var3, int var4) {
      this.bI();
      if (var2.a() > 0 && !var2.g) {
         int var5 = this.bz(var1, var2, var3.b);
         if (var4 == 1) {
            while(var5 > 0) {
               var4 = var3.b;
               if (var4 <= 0) {
                  break;
               }

               --var4;
               var3.b = var4;
               var5 = this.bz(var1, var2, var4);
            }
         } else {
            int var8 = var2.a();

            int var6;
            for(var4 = var3.b; var4 < var8 - 1; var5 = var6) {
               int var7 = var4 + 1;
               var6 = this.bz(var1, var2, var7);
               if (var6 <= var5) {
                  break;
               }

               var4 = var7;
            }

            var3.b = var4;
         }
      }

      this.bF();
   }

   public final void m(.mc var1, .mk var2, .cht var3) {
      super.m(var1, var2, var3);
      var3.l(GridView.class.getName());
      .lq var4 = this.s.m;
      if (var4 != null && var4.a() > 1) {
         var3.h(.chr.M);
      }

   }

   public final void n(.mc var1, .mk var2, View var3, .cht var4) {
      LayoutParams var6 = var3.getLayoutParams();
      if (!(var6 instanceof .ks)) {
         super.aL(var3, var4);
      } else {
         .ks var7 = (.ks)var6;
         int var5 = this.by(var1, var2, var7.a());
         if (this.k == 0) {
            var4.o(.eze.Z(var7.a, var7.b, var5, 1, false));
         } else {
            var4.o(.eze.Z(var5, 1, var7.a, var7.b, false));
         }
      }
   }

   public final void o(.mc var1, .mk var2) {
      if (var2.g) {
         int var4 = this.am();

         for(int var3 = 0; var3 < var4; ++var3) {
            .ks var6 = (.ks)this.ay(var3).getLayoutParams();
            int var5 = var6.a();
            this.e.put(var5, var6.b);
            this.f.put(var5, var6.a);
         }
      }

      super.o(var1, var2);
      this.e.clear();
      this.f.clear();
   }

   public final void p(.mk var1) {
      super.p(var1);
      this.a = false;
      int var2 = this.H;
      if (var2 != -1) {
         View var3 = this.N(var2);
         if (var3 != null) {
            var3.sendAccessibilityEvent(67108864);
            this.H = -1;
         }
      }

   }

   public final void q(Rect var1, int var2, int var3) {
      if (this.c == null) {
         super.q(var1, var2, var3);
      }

      int var5 = this.at() + this.au();
      int var4 = this.av() + this.as();
      int[] var6;
      if (this.k == 1) {
         var3 = al(var3, var1.height() + var4, this.aq());
         var6 = this.c;
         var4 = al(var2, var6[var6.length - 1] + var5, this.ar());
         var2 = var3;
         var3 = var4;
      } else {
         var2 = al(var2, var1.width() + var5, this.ar());
         var6 = this.c;
         var4 = al(var3, var6[var6.length - 1] + var4, this.aq());
         var3 = var2;
         var2 = var4;
      }

      this.aV(var3, var2);
   }

   public final void r(boolean var1) {
      if (!var1) {
         super.r(false);
      } else {
         throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
      }
   }

   public final boolean s(.ly var1) {
      return var1 instanceof .ks;
   }

   public final boolean t(int var1, Bundle var2) {
      int var5 = .chr.M.a();
      byte var4 = -1;
      int var3 = var1;
      int var6;
      int var7;
      int var8;
      if (var1 == var5) {
         if (var1 != -1) {
            var1 = 0;

            View var9;
            while(true) {
               if (var1 >= this.am()) {
                  var9 = null;
                  break;
               }

               var9 = this.ay(var1);
               var9.getClass();
               if (.kr.a(var9)) {
                  var9 = this.ay(var1);
                  break;
               }

               ++var1;
            }

            if (var9 == null) {
               return false;
            }

            if (var2 == null) {
               return false;
            }

            var6 = var2.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
            if (!G.contains(var6)) {
               return false;
            }

            .mn var12 = this.s.g(var9);
            if (var12 == null) {
               return false;
            }

            var7 = var12.a();
            var5 = this.bx(var7);
            int var14 = this.bw(var7);
            if (var5 >= 0 && var14 >= 0) {
               if (!this.bC(var7).contains(this.h) || !this.bB(var7).contains(this.i)) {
                  this.h = var5;
                  this.i = var14;
               }

               var1 = this.h;
               var3 = var1;
               if (var1 == -1) {
                  var3 = var5;
               }

               var1 = this.i;
               if (var1 != -1) {
                  var14 = var1;
               }

               label281:
               switch(var6) {
               case 17:
                  var1 = var7 - 1;

                  while(true) {
                     if (var1 >= 0) {
                        var8 = this.bx(var1);
                        var7 = this.bw(var1);
                        if (var8 >= 0) {
                           if (var7 < 0) {
                              var1 = -1;
                              break label281;
                           }

                           if (this.k == 1) {
                              if (var8 == var3 && var7 < var14 || var8 < var3) {
                                 this.h = var8;
                                 this.i = var7;
                                 break label281;
                              }
                           } else if (this.bC(var1).contains(var3) && var7 < var14) {
                              this.i = var7;
                              break label281;
                           }

                           --var1;
                           continue;
                        }
                     }

                     var1 = -1;
                     break label281;
                  }
               case 33:
                  for(var1 = var7 - 1; var1 >= 0; --var1) {
                     var8 = this.bx(var1);
                     var7 = this.bw(var1);
                     if (var8 < 0) {
                        break;
                     }

                     if (var7 < 0) {
                        var1 = -1;
                        break label281;
                     }

                     if (this.k == 1) {
                        if (var8 < var3 && this.bB(var1).contains(var14)) {
                           this.h = var8;
                           break label281;
                        }
                     } else if (var8 < var3 && var7 == var14) {
                        this.h = (Integer)Collections.max(this.bC(var1));
                        break label281;
                     }
                  }

                  var1 = -1;
                  break;
               case 66:
                  var1 = var7 + 1;

                  while(true) {
                     if (var1 < this.ao()) {
                        var7 = this.bx(var1);
                        var8 = this.bw(var1);
                        if (var7 >= 0) {
                           if (var8 < 0) {
                              var1 = -1;
                              break label281;
                           }

                           if (this.k == 1) {
                              if (var7 == var3 && var8 > var14 || var7 > var3) {
                                 this.h = var7;
                                 this.i = var8;
                                 break label281;
                              }
                           } else if (var8 > var14 && this.bC(var1).contains(var3)) {
                              this.i = var8;
                              break label281;
                           }

                           ++var1;
                           continue;
                        }
                     }

                     var1 = -1;
                     break label281;
                  }
               case 130:
                  var1 = var7 + 1;

                  while(true) {
                     if (var1 < this.ao()) {
                        var8 = this.bx(var1);
                        var7 = this.bw(var1);
                        if (var8 >= 0) {
                           if (var7 < 0) {
                              var1 = -1;
                              break label281;
                           }

                           if (this.k == 1) {
                              if (var8 > var3 && (var7 == var14 || this.bB(var1).contains(var14))) {
                                 this.h = var8;
                                 break label281;
                              }
                           } else if (var8 > var3 && var7 == var14) {
                              this.h = this.bx(var1);
                              break label281;
                           }

                           ++var1;
                           continue;
                        }
                     }

                     var1 = -1;
                     break label281;
                  }
               default:
                  return false;
               }

               var3 = var1;
               if (var1 == -1) {
                  label201: {
                     if (this.k == 0) {
                        TreeMap var13;
                        Iterator var15;
                        if (var6 == 17) {
                           var13 = new TreeMap(Collections.reverseOrder());

                           for(var1 = 0; var1 < this.ao(); ++var1) {
                              var15 = this.bC(var1).iterator();

                              while(var15.hasNext()) {
                                 var3 = (Integer)var15.next();
                                 if (var3 < 0) {
                                    var3 = -1;
                                    break label201;
                                 }

                                 var13.put(var3, var1);
                              }
                           }

                           var15 = var13.keySet().iterator();

                           do {
                              if (!var15.hasNext()) {
                                 var3 = -1;
                                 break label201;
                              }

                              var1 = (Integer)var15.next();
                           } while(var1 >= var5);

                           var3 = (Integer)var13.get(var1);
                           this.h = var1;
                           this.i = this.bw(var3);
                           break label201;
                        }

                        if (var6 == 66) {
                           var13 = new TreeMap();

                           for(var1 = 0; var1 < this.ao(); ++var1) {
                              var15 = this.bC(var1).iterator();

                              while(var15.hasNext()) {
                                 var3 = (Integer)var15.next();
                                 if (var3 < 0) {
                                    var3 = -1;
                                    break label201;
                                 }

                                 Integer var10 = var3;
                                 if (!var13.containsKey(var10)) {
                                    var13.put(var10, var1);
                                 }
                              }
                           }

                           var15 = var13.keySet().iterator();

                           while(var15.hasNext()) {
                              var1 = (Integer)var15.next();
                              if (var1 > var5) {
                                 var3 = (Integer)var13.get(var1);
                                 this.h = var1;
                                 this.i = 0;
                                 break label201;
                              }
                           }
                        }
                     }

                     var3 = -1;
                  }
               }

               if (var3 != -1) {
                  this.T(var3);
                  this.H = var3;
                  return true;
               }

               return false;
            }

            return false;
         }

         var3 = -1;
      }

      var1 = var3;
      if (var3 == 16908343) {
         if (var2 != null) {
            var3 = var2.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            var5 = var2.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (var3 != -1 && var5 != -1) {
               var6 = this.s.m.a();
               var1 = 0;

               while(true) {
                  if (var1 >= var6) {
                     var1 = var4;
                     break;
                  }

                  RecyclerView var11 = this.s;
                  var8 = this.bz(var11.f, var11.M, var1);
                  var11 = this.s;
                  var7 = this.by(var11.f, var11.M, var1);
                  if (this.k == 1) {
                     if (var8 == var5 && var7 == var3) {
                        break;
                     }
                  } else if (var8 == var3 && var7 == var5) {
                     break;
                  }

                  ++var1;
               }

               if (var1 >= 0) {
                  this.aj(var1);
                  return true;
               }

               return false;
            }

            return false;
         }

         var1 = 16908343;
      }

      return super.t(var1, var2);
   }

   public final boolean u() {
      return this.p == null && !this.a;
   }

   public final void v(.mk var1, .kx var2, .ko var3) {
      int var5 = this.b;

      for(int var4 = 0; var4 < this.b && var2.d(var1) && var5 > 0; ++var4) {
         var3.a(var2.d, Math.max(0, var2.g));
         --var5;
         var2.d += var2.e;
      }

   }

   public final void w(int var1, int var2) {
      this.j.l();
      this.j.k();
   }

   public final void x() {
      this.j.l();
      this.j.k();
   }

   public final void y(int var1, int var2) {
      this.j.l();
      this.j.k();
   }

   public final void z(int var1, int var2) {
      this.j.l();
      this.j.k();
   }
}
