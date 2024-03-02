package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends .lx implements .mi {
   private final Rect G;
   private final .mw H;
   private boolean I;
   private int[] J;
   private final Runnable K;
   .nb[] a;
   public .ln b;
   .ln c;
   public boolean d;
   boolean e;
   int f;
   int g;
   .mz h;
   private int i = -1;
   private int j;
   private int k;
   private final .kt l;
   private BitSet m;
   private int n;
   private boolean o;
   private boolean p;
   private .na q;

   public StaggeredGridLayoutManager(Context var1, AttributeSet var2, int var3, int var4) {
      byte var5 = 0;
      this.d = false;
      this.e = false;
      this.f = -1;
      this.g = Integer.MIN_VALUE;
      this.h = new .mz();
      this.n = 2;
      this.G = new Rect();
      this.H = new .mw(this);
      this.I = true;
      this.K = new .bl(this, 20, (byte[])null);
      .lw var6 = aw(var1, var2, var3, var4);
      var3 = var6.a;
      if (var3 != 0 && var3 != 1) {
         throw new IllegalArgumentException("invalid orientation.");
      } else {
         this.O((String)null);
         if (var3 != this.j) {
            this.j = var3;
            .ln var7 = this.b;
            this.b = this.c;
            this.c = var7;
            this.aS();
         }

         var3 = var6.b;
         this.O((String)null);
         if (var3 != this.i) {
            this.h.a();
            this.aS();
            this.i = var3;
            this.m = new BitSet(var3);
            this.a = new .nb[this.i];

            for(var3 = var5; var3 < this.i; ++var3) {
               this.a[var3] = new .nb(this, var3);
            }

            this.aS();
         }

         this.H(var6.c);
         this.l = new .kt();
         this.b = .ln.q(this, this.j);
         this.c = .ln.q(this, 1 - this.j);
      }
   }

   private final int P(int var1) {
      if (this.am() == 0) {
         return this.e ? 1 : -1;
      } else {
         boolean var2;
         if (var1 >= this.c()) {
            var2 = false;
         } else {
            var2 = true;
         }

         return var2 != this.e ? -1 : 1;
      }
   }

   private final int Q(.mk var1) {
      return this.am() == 0 ? 0 : .eu.d(var1, this.b, this.r(this.I ^ true), this.l(this.I ^ true), this, this.I);
   }

   private final int U(.mk var1) {
      return this.am() == 0 ? 0 : .eu.e(var1, this.b, this.r(this.I ^ true), this.l(this.I ^ true), this, this.I, this.e);
   }

   private final int V(.mk var1) {
      return this.am() == 0 ? 0 : .eu.f(var1, this.b, this.r(this.I ^ true), this.l(this.I ^ true), this, this.I);
   }

   private final int Z(.mc var1, .kt var2, .mk var3) {
      this.m.set(0, this.i, true);
      int var4;
      if (this.l.i) {
         if (var2.e == 1) {
            var4 = Integer.MAX_VALUE;
         } else {
            var4 = Integer.MIN_VALUE;
         }
      } else if (var2.e == 1) {
         var4 = var2.g + var2.b;
      } else {
         var4 = var2.f - var2.b;
      }

      int var6 = var2.e;

      int var5;
      for(var5 = 0; var5 < this.i; ++var5) {
         if (!this.a[var5].a.isEmpty()) {
            this.bD(this.a[var5], var6, var4);
         }
      }

      int var7;
      if (this.e) {
         var7 = this.b.f();
      } else {
         var7 = this.b.j();
      }

      boolean var21;
      for(var21 = false; var2.a(var3) && (this.l.i || !this.m.isEmpty()); var21 = true) {
         View var19 = var1.b(var2.c);
         var2.c += var2.d;
         .mx var18 = (.mx)var19.getLayoutParams();
         int var13 = var18.a();
         int[] var16 = this.h.a;
         if (var16 != null) {
            if (var13 >= var16.length) {
               var5 = -1;
            } else {
               var5 = var16[var13];
            }
         } else {
            var5 = -1;
         }

         boolean var8;
         if (var5 == -1) {
            var8 = true;
         } else {
            var8 = false;
         }

         int var9;
         boolean var15;
         .nb var17;
         .nb var23;
         if (var8) {
            var15 = var18.b;
            byte var10;
            if (this.bE(var2.e)) {
               var5 = this.i - 1;
               var9 = -1;
               var10 = -1;
            } else {
               var9 = this.i;
               var5 = 0;
               var10 = 1;
            }

            var6 = var2.e;
            var23 = null;
            var17 = null;
            int var11;
            int var12;
            int var14;
            if (var6 == 1) {
               var14 = this.b.j();
               var6 = Integer.MAX_VALUE;
               var23 = var17;
               var11 = var5;

               for(var5 = var6; var11 != var9; var5 = var6) {
                  var17 = this.a[var11];
                  var12 = var17.d(var14);
                  if (var12 < var5) {
                     var6 = var12;
                  } else {
                     var6 = var5;
                  }

                  if (var12 < var5) {
                     var23 = var17;
                  }

                  var11 += var10;
               }
            } else {
               var14 = this.b.f();
               var6 = Integer.MIN_VALUE;
               var11 = var5;

               for(var5 = var6; var11 != var9; var5 = var6) {
                  var17 = this.a[var11];
                  var12 = var17.f(var14);
                  if (var12 > var5) {
                     var6 = var12;
                  } else {
                     var6 = var5;
                  }

                  if (var12 > var5) {
                     var23 = var17;
                  }

                  var11 += var10;
               }
            }

            .mz var24 = this.h;
            var24.b(var13);
            var24.a[var13] = var23.e;
         } else {
            var23 = this.a[var5];
         }

         var18.a = var23;
         if (var2.e == 1) {
            this.aC(var19);
         } else {
            this.aD(var19, 0);
         }

         var15 = var18.b;
         if (this.j == 1) {
            this.bF(var19, an(this.k, super.A, 0, var18.width, false), an(super.D, super.B, this.av() + this.as(), var18.height, true));
         } else {
            this.bF(var19, an(super.C, super.A, this.at() + this.au(), var18.width, true), an(this.k, super.B, 0, var18.height, false));
         }

         if (var2.e == 1) {
            var15 = var18.b;
            var5 = var23.d(var7);
            var6 = this.b.b(var19) + var5;
            if (var8) {
               var15 = var18.b;
            }
         } else {
            var15 = var18.b;
            var6 = var23.f(var7);
            var5 = var6 - this.b.b(var19);
            if (var8) {
               var15 = var18.b;
            }
         }

         var15 = var18.b;
         .mx var20;
         if (var2.e == 1) {
            var17 = var18.a;
            var20 = .nb.n(var19);
            var20.a = var17;
            var17.a.add(var19);
            var17.c = Integer.MIN_VALUE;
            if (var17.a.size() == 1) {
               var17.b = Integer.MIN_VALUE;
            }

            if (var20.c() || var20.b()) {
               var17.d += var17.f.b.b(var19);
            }
         } else {
            var17 = var18.a;
            var20 = .nb.n(var19);
            var20.a = var17;
            var17.a.add(0, var19);
            var17.b = Integer.MIN_VALUE;
            if (var17.a.size() == 1) {
               var17.c = Integer.MIN_VALUE;
            }

            if (var20.c() || var20.b()) {
               var17.d += var17.f.b.b(var19);
            }
         }

         int var22;
         if (this.M() && this.j == 1) {
            var15 = var18.b;
            var22 = this.c.f() - (this.i - 1 - var23.e) * this.k;
            var9 = var22 - this.c.b(var19);
         } else {
            var15 = var18.b;
            var22 = var23.e;
            var9 = this.k;
            var9 = this.c.j() + var22 * var9;
            var22 = this.c.b(var19) + var9;
         }

         if (this.j == 1) {
            bm(var19, var9, var5, var22, var6);
         } else {
            bm(var19, var5, var9, var6, var22);
         }

         var15 = var18.b;
         this.bD(var23, this.l.e, var4);
         this.bx(var1, this.l);
         if (this.l.h && var19.hasFocusable()) {
            var15 = var18.b;
            this.m.set(var23.e, false);
         }
      }

      if (!var21) {
         this.bx(var1, this.l);
      }

      if (this.l.e == -1) {
         var4 = this.af(this.b.j());
         var4 = this.b.j() - var4;
      } else {
         var4 = this.ab(this.b.f()) - this.b.f();
      }

      return var4 > 0 ? Math.min(var2.b, var4) : 0;
   }

   private final int ab(int var1) {
      int var4 = this.a[0].d(var1);

      int var3;
      for(int var2 = 1; var2 < this.i; var4 = var3) {
         int var5 = this.a[var2].d(var1);
         var3 = var4;
         if (var5 > var4) {
            var3 = var5;
         }

         ++var2;
      }

      return var4;
   }

   private final int af(int var1) {
      int var3 = this.a[0].f(var1);

      int var4;
      for(int var2 = 1; var2 < this.i; var3 = var4) {
         int var5 = this.a[var2].f(var1);
         var4 = var3;
         if (var5 < var3) {
            var4 = var5;
         }

         ++var2;
      }

      return var3;
   }

   private final void ag(.mc var1, .mk var2, boolean var3) {
      int var4 = this.ab(Integer.MIN_VALUE);
      if (var4 != Integer.MIN_VALUE) {
         int var5 = this.b.f() - var4;
         if (var5 > 0) {
            var4 = -this.k(-var5, var1, var2);
            if (var3) {
               var4 = var5 - var4;
               if (var4 > 0) {
                  this.b.n(var4);
               }
            }
         }

      }
   }

   private final void ah(.mc var1, .mk var2, boolean var3) {
      int var4 = this.af(Integer.MAX_VALUE);
      if (var4 != Integer.MAX_VALUE) {
         var4 -= this.b.j();
         if (var4 > 0) {
            var4 -= this.k(var4, var1, var2);
            if (var3 && var4 > 0) {
               this.b.n(-var4);
            }
         }

      }
   }

   private final void aj(int var1, int var2, int var3) {
      int var5;
      if (this.e) {
         var5 = this.i();
      } else {
         var5 = this.c();
      }

      int var6 = var1 + var2;
      .mz var9 = this.h;
      int[] var8 = var9.a;
      int var4;
      if (var8 != null && var1 < var8.length) {
         List var10 = var9.b;
         if (var10 == null) {
            var4 = -1;
         } else {
            var4 = var10.size() - 1;

            .my var11;
            while(true) {
               if (var4 < 0) {
                  var11 = null;
                  break;
               }

               var11 = (.my)var9.b.get(var4);
               if (var11.a == var1) {
                  break;
               }

               --var4;
            }

            if (var11 != null) {
               var9.b.remove(var11);
            }

            int var7 = var9.b.size();
            var4 = 0;

            while(true) {
               if (var4 >= var7) {
                  var4 = -1;
                  break;
               }

               if (((.my)var9.b.get(var4)).a >= var1) {
                  break;
               }

               ++var4;
            }

            if (var4 != -1) {
               var11 = (.my)var9.b.get(var4);
               var9.b.remove(var4);
               var4 = var11.a;
            } else {
               var4 = -1;
            }
         }

         if (var4 == -1) {
            var8 = var9.a;
            Arrays.fill(var8, var1, var8.length, -1);
            var4 = var9.a.length;
         } else {
            var4 = Math.min(var4 + 1, var9.a.length);
            Arrays.fill(var9.a, var1, var4, -1);
         }
      }

      int[] var12;
      .mz var13;
      List var14;
      .my var15;
      switch(var3) {
      case 1:
         var13 = this.h;
         var12 = var13.a;
         if (var12 != null && var1 < var12.length) {
            var13.b(var6);
            var12 = var13.a;
            System.arraycopy(var12, var1, var12, var6, var12.length - var1 - var2);
            Arrays.fill(var13.a, var1, var6, -1);
            var14 = var13.b;
            if (var14 != null) {
               for(var3 = var14.size() - 1; var3 >= 0; --var3) {
                  var15 = (.my)var13.b.get(var3);
                  var4 = var15.a;
                  if (var4 >= var1) {
                     var15.a = var4 + var2;
                  }
               }
            }
         }
         break;
      case 2:
         var13 = this.h;
         var12 = var13.a;
         if (var12 != null && var1 < var12.length) {
            var13.b(var6);
            var12 = var13.a;
            System.arraycopy(var12, var6, var12, var1, var12.length - var1 - var2);
            var12 = var13.a;
            var3 = var12.length;
            Arrays.fill(var12, var3 - var2, var3, -1);
            var14 = var13.b;
            if (var14 != null) {
               for(var3 = var14.size() - 1; var3 >= 0; --var3) {
                  var15 = (.my)var13.b.get(var3);
                  var4 = var15.a;
                  if (var4 >= var1) {
                     if (var4 < var6) {
                        var13.b.remove(var3);
                     } else {
                        var15.a = var4 - var2;
                     }
                  }
               }
            }
         }
      }

      if (var6 > var5) {
         if (this.e) {
            var2 = this.c();
         } else {
            var2 = this.i();
         }

         if (var1 <= var2) {
            this.aS();
         }

      }
   }

   private final void bA() {
      boolean var1;
      if (this.j != 1 && this.M()) {
         var1 = this.d ^ true;
      } else {
         var1 = this.d;
      }

      this.e = var1;
   }

   private final void bB(int var1) {
      .kt var5 = this.l;
      var5.e = var1;
      boolean var4 = this.e;
      byte var2 = 1;
      boolean var3;
      if (var1 != -1) {
         var3 = false;
      } else {
         var3 = true;
      }

      byte var6;
      if (var4 == var3) {
         var6 = var2;
      } else {
         var6 = -1;
      }

      var5.d = var6;
   }

   private final void bC(int var1, .mk var2) {
      int var3;
      boolean var4;
      boolean var5;
      label38: {
         .kt var7 = this.l;
         var5 = false;
         var7.b = 0;
         var7.c = var1;
         if (this.ba()) {
            var3 = var2.a;
            if (var3 != -1) {
               boolean var6 = this.e;
               if (var3 >= var1) {
                  var4 = false;
               } else {
                  var4 = true;
               }

               if (var6 == var4) {
                  var1 = this.b.k();
                  var3 = 0;
               } else {
                  var3 = this.b.k();
                  var1 = 0;
               }
               break label38;
            }
         }

         var1 = 0;
         var3 = 0;
      }

      RecyclerView var8 = super.s;
      if (var8 != null && var8.i) {
         this.l.f = this.b.j() - var3;
         this.l.g = this.b.f() + var1;
      } else {
         this.l.g = this.b.e() + var1;
         this.l.f = -var3;
      }

      .kt var9 = this.l;
      var9.h = false;
      var9.a = true;
      if (this.b.h() == 0 && this.b.e() == 0) {
         var4 = true;
      } else {
         var4 = var5;
      }

      var9.i = var4;
   }

   private final void bD(.nb var1, int var2, int var3) {
      int var4 = var1.d;
      if (var2 == -1) {
         if (var1.e() + var4 <= var3) {
            this.m.set(var1.e, false);
            return;
         }
      } else if (var1.c() - var4 >= var3) {
         this.m.set(var1.e, false);
         return;
      }

   }

   private final boolean bE(int var1) {
      boolean var2;
      if (this.j == 0) {
         if (var1 != -1) {
            var2 = false;
         } else {
            var2 = true;
         }

         return var2 != this.e;
      } else {
         if (var1 != -1) {
            var2 = false;
         } else {
            var2 = true;
         }

         if (var2 != this.e) {
            var2 = false;
         } else {
            var2 = true;
         }

         return var2 == this.M();
      }
   }

   private final void bF(View var1, int var2, int var3) {
      this.aE(var1, this.G);
      .mx var4 = (.mx)var1.getLayoutParams();
      var2 = bG(var2, var4.leftMargin + this.G.left, var4.rightMargin + this.G.right);
      var3 = bG(var3, var4.topMargin + this.G.top, var4.bottomMargin + this.G.bottom);
      if (this.bc(var1, var2, var3, var4)) {
         var1.measure(var2, var3);
      }

   }

   private static final int bG(int var0, int var1, int var2) {
      int var3 = var1;
      if (var1 == 0) {
         if (var2 == 0) {
            return var0;
         }

         var3 = 0;
      }

      var1 = MeasureSpec.getMode(var0);
      return var1 != Integer.MIN_VALUE && var1 != 1073741824 ? var0 : MeasureSpec.makeMeasureSpec(Math.max(0, MeasureSpec.getSize(var0) - var3 - var2), var1);
   }

   private final void bw(.mc var1, .mk var2, boolean var3) {
      .mw var14 = this.H;
      if ((this.q != null || this.f != -1) && var2.a() == 0) {
         this.aN(var1);
         var14.a();
      } else {
         boolean var13 = var14.e;
         boolean var10 = true;
         boolean var8;
         if (var13 && this.f == -1) {
            if (this.q != null) {
               var8 = true;
            } else {
               var8 = false;
            }
         } else {
            var8 = true;
         }

         int var7;
         int var9;
         int var11;
         int var12;
         .na var15;
         View var22;
         if (var8) {
            var14.a();
            var15 = this.q;
            if (var15 == null) {
               this.bA();
               var14.c = this.e;
            } else {
               var7 = var15.c;
               if (var7 > 0) {
                  if (var7 == this.i) {
                     for(var9 = 0; var9 < this.i; ++var9) {
                        this.a[var9].j();
                        var15 = this.q;
                        var7 = var15.d[var9];
                        if (var7 != Integer.MIN_VALUE) {
                           if (var15.i) {
                              var7 += this.b.f();
                           } else {
                              var7 += this.b.j();
                           }
                        }

                        this.a[var9].l(var7);
                     }
                  } else {
                     var15.b();
                     var15 = this.q;
                     var15.a = var15.b;
                  }
               }

               var15 = this.q;
               this.p = var15.j;
               this.H(var15.h);
               this.bA();
               .na var16 = this.q;
               var7 = var16.a;
               if (var7 != -1) {
                  this.f = var7;
                  var14.c = var16.i;
               } else {
                  var14.c = this.e;
               }

               if (var16.e > 1) {
                  .mz var19 = this.h;
                  var19.a = var16.f;
                  var19.b = var16.g;
               }
            }

            label356: {
               if (!var2.g) {
                  var7 = this.f;
                  if (var7 != -1) {
                     if (var7 >= 0 && var7 < var2.a()) {
                        var15 = this.q;
                        if (var15 != null && var15.a != -1 && var15.c > 0) {
                           var14.b = Integer.MIN_VALUE;
                           var14.a = this.f;
                           break label356;
                        }

                        var22 = this.N(this.f);
                        if (var22 != null) {
                           if (this.e) {
                              var7 = this.i();
                           } else {
                              var7 = this.c();
                           }

                           var14.a = var7;
                           if (this.g != Integer.MIN_VALUE) {
                              if (var14.c) {
                                 var14.b = this.b.f() - this.g - this.b.a(var22);
                              } else {
                                 var14.b = this.b.j() + this.g - this.b.d(var22);
                              }
                           } else if (this.b.b(var22) > this.b.k()) {
                              if (var14.c) {
                                 var7 = this.b.f();
                              } else {
                                 var7 = this.b.j();
                              }

                              var14.b = var7;
                           } else {
                              var7 = this.b.d(var22) - this.b.j();
                              if (var7 < 0) {
                                 var14.b = -var7;
                              } else {
                                 var7 = this.b.f() - this.b.a(var22);
                                 if (var7 < 0) {
                                    var14.b = var7;
                                 } else {
                                    var14.b = Integer.MIN_VALUE;
                                 }
                              }
                           }
                        } else {
                           var7 = this.f;
                           var14.a = var7;
                           var9 = this.g;
                           if (var9 == Integer.MIN_VALUE) {
                              if (this.P(var7) == 1) {
                                 var13 = true;
                              } else {
                                 var13 = false;
                              }

                              var14.c = var13;
                              if (var13) {
                                 var7 = var14.g.b.f();
                              } else {
                                 var7 = var14.g.b.j();
                              }

                              var14.b = var7;
                           } else if (var14.c) {
                              var14.b = var14.g.b.f() - var9;
                           } else {
                              var14.b = var14.g.b.j() + var9;
                           }

                           var14.d = true;
                        }
                        break label356;
                     }

                     this.f = -1;
                     this.g = Integer.MIN_VALUE;
                  }
               }

               if (this.o) {
                  var11 = var2.a();
                  var7 = this.am() - 1;

                  while(true) {
                     if (var7 < 0) {
                        var7 = 0;
                        break;
                     }

                     var9 = bh(this.ay(var7));
                     if (var9 >= 0 && var9 < var11) {
                        var7 = var9;
                        break;
                     }

                     --var7;
                  }
               } else {
                  var11 = var2.a();
                  var12 = this.am();
                  var7 = 0;

                  while(true) {
                     if (var7 >= var12) {
                        var7 = 0;
                        break;
                     }

                     var9 = bh(this.ay(var7));
                     if (var9 >= 0 && var9 < var11) {
                        var7 = var9;
                        break;
                     }

                     ++var7;
                  }
               }

               var14.a = var7;
               var14.b = Integer.MIN_VALUE;
            }

            var14.e = true;
         }

         if (this.q == null && this.f == -1 && (var14.c != this.o || this.M() != this.p)) {
            this.h.a();
            var14.d = true;
         }

         int var18;
         if (this.am() > 0) {
            var15 = this.q;
            if (var15 == null || var15.c <= 0) {
               if (var14.d) {
                  for(var7 = 0; var7 < this.i; ++var7) {
                     this.a[var7].j();
                     var18 = var14.b;
                     if (var18 != Integer.MIN_VALUE) {
                        this.a[var7].l(var18);
                     }
                  }
               } else {
                  label374: {
                     .nb var23;
                     if (!var8) {
                        if (this.H.f != null) {
                           var7 = 0;

                           while(true) {
                              if (var7 >= this.i) {
                                 break label374;
                              }

                              var23 = this.a[var7];
                              var23.j();
                              var23.l(this.H.f[var7]);
                              ++var7;
                           }
                        }

                        var7 = 0;
                     } else {
                        var7 = 0;
                     }

                     for(; var7 < this.i; ++var7) {
                        var23 = this.a[var7];
                        var13 = this.e;
                        var11 = var14.b;
                        if (var13) {
                           var18 = var23.d(Integer.MIN_VALUE);
                        } else {
                           var18 = var23.f(Integer.MIN_VALUE);
                        }

                        var23.j();
                        if (var18 != Integer.MIN_VALUE && (!var13 || var18 >= var23.f.b.f()) && (var13 || var18 <= var23.f.b.j())) {
                           var9 = var18;
                           if (var11 != Integer.MIN_VALUE) {
                              var9 = var18 + var11;
                           }

                           var23.c = var9;
                           var23.b = var9;
                        }
                     }

                     .mw var20 = this.H;
                     .nb[] var17 = this.a;
                     var18 = var17.length;
                     int[] var24 = var20.f;
                     if (var24 != null && var24.length >= var18) {
                        var7 = 0;
                     } else {
                        var20.f = new int[var20.g.a.length];
                        var7 = 0;
                     }

                     while(var7 < var18) {
                        var20.f[var7] = var17[var7].f(Integer.MIN_VALUE);
                        ++var7;
                     }
                  }
               }
            }
         }

         this.aF(var1);
         this.l.a = false;
         this.I(this.c.k());
         this.bC(var14.a, var2);
         .kt var25;
         if (var14.c) {
            this.bB(-1);
            this.Z(var1, this.l, var2);
            this.bB(1);
            var25 = this.l;
            var25.c = var14.a + var25.d;
            this.Z(var1, var25, var2);
         } else {
            this.bB(1);
            this.Z(var1, this.l, var2);
            this.bB(-1);
            var25 = this.l;
            var25.c = var14.a + var25.d;
            this.Z(var1, var25, var2);
         }

         if (this.c.h() != 1073741824) {
            var9 = this.am();
            float var4 = 0.0F;

            float var5;
            for(var7 = 0; var7 < var9; var4 = var5) {
               var22 = this.ay(var7);
               float var6 = (float)this.c.b(var22);
               var5 = var4;
               if (!(var6 < var4)) {
                  .mx var26 = (.mx)var22.getLayoutParams();
                  var5 = Math.max(var4, var6);
               }

               ++var7;
            }

            var11 = this.k;
            var18 = Math.round(var4 * (float)this.i);
            var7 = var18;
            if (this.c.h() == Integer.MIN_VALUE) {
               var7 = Math.min(var18, this.c.k());
            }

            this.I(var7);
            if (this.k != var11) {
               for(var7 = 0; var7 < var9; ++var7) {
                  var22 = this.ay(var7);
                  .mx var21 = (.mx)var22.getLayoutParams();
                  var13 = var21.b;
                  if (this.M() && this.j == 1) {
                     var18 = -(this.i - 1 - var21.a.e);
                     var22.offsetLeftAndRight(this.k * var18 - var18 * var11);
                  } else {
                     var12 = var21.a.e;
                     var18 = this.k * var12;
                     var12 *= var11;
                     if (this.j == 1) {
                        var22.offsetLeftAndRight(var18 - var12);
                     } else {
                        var22.offsetTopAndBottom(var18 - var12);
                     }
                  }
               }
            }
         }

         if (this.am() > 0) {
            if (this.e) {
               this.ag(var1, var2, true);
               this.ah(var1, var2, false);
            } else {
               this.ah(var1, var2, true);
               this.ag(var1, var2, false);
            }
         }

         boolean var27;
         label220: {
            if (var3 && !var2.g && this.n != 0 && this.am() > 0 && this.v() != null) {
               this.bp(this.K);
               if (this.J()) {
                  var27 = var10;
                  break label220;
               }
            }

            var27 = false;
         }

         if (var2.g) {
            this.H.a();
         }

         this.o = var14.c;
         this.p = this.M();
         if (var27) {
            this.H.a();
            this.bw(var1, var2, false);
         }

      }
   }

   private final void bx(.mc var1, .kt var2) {
      if (var2.a && !var2.i) {
         if (var2.b == 0) {
            if (var2.e == -1) {
               this.by(var1, var2.g);
            } else {
               this.bz(var1, var2.f);
            }
         } else {
            int var5 = var2.e;
            byte var4 = 1;
            int var3 = 1;
            int var6;
            int var7;
            int var8;
            if (var5 == -1) {
               var7 = var2.f;

               for(var8 = this.a[0].f(var7); var3 < this.i; var8 = var5) {
                  var6 = this.a[var3].f(var7);
                  var5 = var8;
                  if (var6 > var8) {
                     var5 = var6;
                  }

                  ++var3;
               }

               var3 = var7 - var8;
               if (var3 < 0) {
                  var3 = var2.g;
               } else {
                  var3 = var2.g - Math.min(var3, var2.b);
               }

               this.by(var1, var3);
            } else {
               var7 = var2.g;
               var5 = this.a[0].d(var7);

               for(var3 = var4; var3 < this.i; var5 = var8) {
                  var6 = this.a[var3].d(var7);
                  var8 = var5;
                  if (var6 < var5) {
                     var8 = var6;
                  }

                  ++var3;
               }

               var3 = var5 - var2.g;
               if (var3 < 0) {
                  var3 = var2.f;
               } else {
                  var8 = var2.f;
                  var3 = Math.min(var3, var2.b) + var8;
               }

               this.bz(var1, var3);
            }
         }
      }
   }

   private final void by(.mc var1, int var2) {
      for(int var3 = this.am() - 1; var3 >= 0; --var3) {
         View var6 = this.ay(var3);
         if (this.b.d(var6) < var2 || this.b.m(var6) < var2) {
            break;
         }

         .mx var7 = (.mx)var6.getLayoutParams();
         boolean var5 = var7.b;
         if (var7.a.a.size() == 1) {
            return;
         }

         .nb var9 = var7.a;
         int var4 = var9.a.size();
         View var8 = (View)var9.a.remove(var4 - 1);
         var7 = .nb.n(var8);
         var7.a = null;
         if (var7.c() || var7.b()) {
            var9.d -= var9.f.b.b(var8);
         }

         if (var4 == 1) {
            var9.b = Integer.MIN_VALUE;
         }

         var9.c = Integer.MIN_VALUE;
         this.aP(var6, var1);
      }

   }

   private final void bz(.mc var1, int var2) {
      while(true) {
         if (this.am() > 0) {
            View var4 = this.ay(0);
            if (this.b.a(var4) <= var2 && this.b.l(var4) <= var2) {
               .mx var5 = (.mx)var4.getLayoutParams();
               boolean var3 = var5.b;
               if (var5.a.a.size() == 1) {
                  return;
               }

               .nb var7 = var5.a;
               View var8 = (View)var7.a.remove(0);
               .mx var6 = .nb.n(var8);
               var6.a = null;
               if (var7.a.size() == 0) {
                  var7.c = Integer.MIN_VALUE;
               }

               if (var6.c() || var6.b()) {
                  var7.d -= var7.f.b.b(var8);
               }

               var7.b = Integer.MIN_VALUE;
               this.aP(var4, var1);
               continue;
            }
         }

         return;
      }
   }

   public final int A(.mk var1) {
      return this.Q(var1);
   }

   public final int B(.mk var1) {
      return this.U(var1);
   }

   public final int C(.mk var1) {
      return this.V(var1);
   }

   public final int D(.mk var1) {
      return this.Q(var1);
   }

   public final int E(.mk var1) {
      return this.U(var1);
   }

   public final int F(.mk var1) {
      return this.V(var1);
   }

   final void G(int var1, .mk var2) {
      byte var3;
      int var4;
      if (var1 > 0) {
         var4 = this.i();
         var3 = 1;
      } else {
         var4 = this.c();
         var3 = -1;
      }

      this.l.a = true;
      this.bC(var4, var2);
      this.bB(var3);
      .kt var5 = this.l;
      var5.c = var4 + var5.d;
      var5.b = Math.abs(var1);
   }

   public final void H(boolean var1) {
      this.O((String)null);
      .na var2 = this.q;
      if (var2 != null && var2.h != var1) {
         var2.h = var1;
      }

      this.d = var1;
      this.aS();
   }

   final void I(int var1) {
      this.k = var1 / this.i;
      MeasureSpec.makeMeasureSpec(var1, this.c.h());
   }

   public final boolean J() {
      if (this.am() != 0 && this.n != 0 && super.v) {
         int var1;
         if (this.e) {
            var1 = this.i();
            this.c();
         } else {
            var1 = this.c();
            this.i();
         }

         if (var1 == 0 && this.v() != null) {
            this.h.a();
            super.u = true;
            this.aS();
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public final PointF K(int var1) {
      var1 = this.P(var1);
      PointF var2 = new PointF();
      if (var1 == 0) {
         return null;
      } else {
         if (this.j == 0) {
            var2.x = (float)var1;
            var2.y = 0.0F;
         } else {
            var2.x = 0.0F;
            var2.y = (float)var1;
         }

         return var2;
      }
   }

   public final Parcelable L() {
      .na var4 = this.q;
      if (var4 != null) {
         return new .na(var4);
      } else {
         int var2;
         .na var5;
         label51: {
            var5 = new .na();
            var5.h = this.d;
            var5.i = this.o;
            var5.j = this.p;
            .mz var6 = this.h;
            var2 = 0;
            if (var6 != null) {
               int[] var8 = var6.a;
               if (var8 != null) {
                  var5.f = var8;
                  var5.e = var5.f.length;
                  var5.g = var6.b;
                  break label51;
               }
            }

            var5.e = 0;
         }

         int var1 = this.am();
         byte var3 = -1;
         if (var1 > 0) {
            if (this.o) {
               var1 = this.i();
            } else {
               var1 = this.c();
            }

            var5.a = var1;
            View var9;
            if (this.e) {
               var9 = this.l(true);
            } else {
               var9 = this.r(true);
            }

            if (var9 == null) {
               var1 = var3;
            } else {
               var1 = bh(var9);
            }

            var5.b = var1;
            var1 = this.i;
            var5.c = var1;

            for(var5.d = new int[var1]; var2 < this.i; ++var2) {
               int var7;
               if (this.o) {
                  var7 = this.a[var2].d(Integer.MIN_VALUE);
                  var1 = var7;
                  if (var7 != Integer.MIN_VALUE) {
                     var1 = var7 - this.b.f();
                  }
               } else {
                  var7 = this.a[var2].f(Integer.MIN_VALUE);
                  var1 = var7;
                  if (var7 != Integer.MIN_VALUE) {
                     var1 = var7 - this.b.j();
                  }
               }

               var5.d[var2] = var1;
            }
         } else {
            var5.a = -1;
            var5.b = -1;
            var5.c = 0;
         }

         return var5;
      }
   }

   final boolean M() {
      return this.ap() == 1;
   }

   public final void O(String var1) {
      if (this.q == null) {
         super.O(var1);
      }

   }

   public final void R(AccessibilityEvent var1) {
      super.R(var1);
      if (this.am() > 0) {
         View var5 = this.r(false);
         View var4 = this.l(false);
         if (var5 != null && var4 != null) {
            int var3 = bh(var5);
            int var2 = bh(var4);
            if (var3 < var2) {
               var1.setFromIndex(var3);
               var1.setToIndex(var2);
            } else {
               var1.setFromIndex(var2);
               var1.setToIndex(var3);
            }
         }
      }
   }

   public final void S(Parcelable var1) {
      if (var1 instanceof .na) {
         .na var2 = (.na)var1;
         this.q = var2;
         if (this.f != -1) {
            var2.a();
            this.q.b();
         }

         this.aS();
      }

   }

   public final void T(int var1) {
      .na var2 = this.q;
      if (var2 != null && var2.a != var1) {
         var2.a();
      }

      this.f = var1;
      this.g = Integer.MIN_VALUE;
      this.aS();
   }

   public final boolean W() {
      return this.j == 0;
   }

   public final boolean X() {
      return this.j == 1;
   }

   public final boolean Y() {
      return this.n != 0;
   }

   public final int a(.mc var1, .mk var2) {
      return this.j == 1 ? Math.min(this.i, var2.a()) : -1;
   }

   public final void aI(int var1) {
      super.aI(var1);

      for(int var2 = 0; var2 < this.i; ++var2) {
         this.a[var2].k(var1);
      }

   }

   public final void aJ(int var1) {
      super.aJ(var1);

      for(int var2 = 0; var2 < this.i; ++var2) {
         this.a[var2].k(var1);
      }

   }

   public final void aM(int var1) {
      if (var1 == 0) {
         this.J();
      }

   }

   public final boolean aa() {
      return this.d;
   }

   public final void ad(int var1, int var2, .mk var3, .ko var4) {
      if (1 == this.j) {
         var1 = var2;
      }

      if (this.am() != 0 && var1 != 0) {
         byte var7;
         label48: {
            this.G(var1, var3);
            int[] var8 = this.J;
            var7 = 0;
            if (var8 != null) {
               var1 = this.i;
               if (var8.length >= var1) {
                  var2 = 0;
                  var1 = 0;
                  break label48;
               }
            }

            this.J = new int[this.i];
            var2 = 0;
         }

         int var5;
         .kt var9;
         for(var1 = 0; var2 < this.i; var1 = var5) {
            var9 = this.l;
            int var6;
            if (var9.d == -1) {
               var5 = var9.f;
               var6 = var5 - this.a[var2].f(var5);
            } else {
               var6 = this.a[var2].d(var9.g) - this.l.g;
            }

            var5 = var1;
            if (var6 >= 0) {
               this.J[var1] = var6;
               var5 = var1 + 1;
            }

            ++var2;
         }

         Arrays.sort(this.J, 0, var1);

         for(var2 = var7; var2 < var1 && this.l.a(var3); ++var2) {
            var4.a(this.l.c, this.J[var2]);
            var9 = this.l;
            var9.c += var9.d;
         }

      }
   }

   public final void ai(RecyclerView var1) {
      this.bp(this.K);

      for(int var2 = 0; var2 < this.i; ++var2) {
         this.a[var2].j();
      }

      var1.requestLayout();
   }

   public final void ak(RecyclerView var1, int var2) {
      .mj var3 = new .mj(var1.getContext());
      var3.b = var2;
      this.aY(var3);
   }

   public final int b(.mc var1, .mk var2) {
      return this.j == 0 ? Math.min(this.i, var2.a()) : -1;
   }

   public final void bn() {
      this.h.a();

      for(int var1 = 0; var1 < this.i; ++var1) {
         this.a[var1].j();
      }

   }

   final int c() {
      return this.am() == 0 ? 0 : bh(this.ay(0));
   }

   public final int d(int var1, .mc var2, .mk var3) {
      return this.k(var1, var2, var3);
   }

   public final int e(int var1, .mc var2, .mk var3) {
      return this.k(var1, var2, var3);
   }

   public final .ly f() {
      return this.j == 0 ? new .mx(-2, -1) : new .mx(-1, -2);
   }

   public final .ly g(LayoutParams var1) {
      return var1 instanceof MarginLayoutParams ? new .mx((MarginLayoutParams)var1) : new .mx(var1);
   }

   public final .ly h(Context var1, AttributeSet var2) {
      return new .mx(var1, var2);
   }

   final int i() {
      int var1 = this.am();
      return var1 == 0 ? 0 : bh(this.ay(var1 - 1));
   }

   public final View j(View var1, int var2, .mc var3, .mk var4) {
      if (this.am() == 0) {
         return null;
      } else {
         var1 = this.ax(var1);
         if (var1 == null) {
            return null;
         } else {
            boolean var7;
            label181: {
               label163: {
                  label162: {
                     this.bA();
                     var7 = true;
                     switch(var2) {
                     case 1:
                        if (this.j == 1) {
                           var2 = -1;
                           break label181;
                        }

                        if (this.M()) {
                           break label163;
                        }
                        break label162;
                     case 2:
                        if (this.j != 1) {
                           if (this.M()) {
                              var2 = -1;
                           } else {
                              var2 = 1;
                           }
                           break label181;
                        }
                        break label163;
                     case 17:
                        if (this.j == 0) {
                           break label162;
                        }
                        break;
                     case 33:
                        if (this.j == 1) {
                           break label162;
                        }
                        break;
                     case 66:
                        if (this.j == 0) {
                           break label163;
                        }
                        break;
                     case 130:
                        if (this.j == 1) {
                           break label163;
                        }
                        break;
                     default:
                        var2 = Integer.MIN_VALUE;
                        break label181;
                     }

                     var2 = Integer.MIN_VALUE;
                     break label181;
                  }

                  var2 = -1;
                  break label181;
               }

               var2 = 1;
            }

            if (var2 == Integer.MIN_VALUE) {
               return null;
            } else {
               .mx var10 = (.mx)var1.getLayoutParams();
               boolean var9 = var10.b;
               .nb var14 = var10.a;
               int var5;
               if (var2 == 1) {
                  var5 = this.i();
               } else {
                  var5 = this.c();
               }

               this.bC(var5, var4);
               this.bB(var2);
               .kt var11 = this.l;
               var11.c = var11.d + var5;
               var11.b = (int)((float)this.b.k() * 0.33333334F);
               var11 = this.l;
               var11.h = true;
               byte var8 = 0;
               var11.a = false;
               this.Z(var3, var11, var4);
               this.o = this.e;
               View var12 = var14.g(var5, var2);
               if (var12 != null && var12 != var1) {
                  return var12;
               } else {
                  int var6;
                  if (this.bE(var2)) {
                     for(var6 = this.i - 1; var6 >= 0; --var6) {
                        var12 = this.a[var6].g(var5, var2);
                        if (var12 != null && var12 != var1) {
                           return var12;
                        }
                     }
                  } else {
                     for(var6 = 0; var6 < this.i; ++var6) {
                        var12 = this.a[var6].g(var5, var2);
                        if (var12 != null && var12 != var1) {
                           return var12;
                        }
                     }
                  }

                  var9 = this.d;
                  boolean var13;
                  if (var2 != -1) {
                     var13 = false;
                  } else {
                     var13 = true;
                  }

                  if ((var9 ^ true) == var13) {
                     var13 = var7;
                  } else {
                     var13 = false;
                  }

                  if (var13) {
                     var6 = var14.a();
                  } else {
                     var6 = var14.b();
                  }

                  var12 = this.N(var6);
                  if (var12 != null && var12 != var1) {
                     return var12;
                  } else {
                     if (this.bE(var2)) {
                        for(var2 = this.i - 1; var2 >= 0; --var2) {
                           if (var2 != var14.e) {
                              if (var13) {
                                 var6 = this.a[var2].a();
                              } else {
                                 var6 = this.a[var2].b();
                              }

                              var12 = this.N(var6);
                              if (var12 != null && var12 != var1) {
                                 return var12;
                              }
                           }
                        }
                     } else {
                        for(var2 = var8; var2 < this.i; ++var2) {
                           if (var13) {
                              var6 = this.a[var2].a();
                           } else {
                              var6 = this.a[var2].b();
                           }

                           var12 = this.N(var6);
                           if (var12 != null && var12 != var1) {
                              return var12;
                           }
                        }
                     }

                     return null;
                  }
               }
            }
         }
      }
   }

   final int k(int var1, .mc var2, .mk var3) {
      if (this.am() != 0 && var1 != 0) {
         this.G(var1, var3);
         int var4 = this.Z(var2, this.l, var3);
         if (this.l.b >= var4) {
            if (var1 < 0) {
               var1 = -var4;
            } else {
               var1 = var4;
            }
         }

         this.b.n(-var1);
         this.o = this.e;
         .kt var5 = this.l;
         var5.b = 0;
         this.bx(var2, var5);
         return var1;
      } else {
         return 0;
      }
   }

   final View l(boolean var1) {
      int var4 = this.b.j();
      int var3 = this.b.f();
      int var2 = this.am() - 1;

      View var7;
      View var8;
      for(var7 = null; var2 >= 0; var7 = var8) {
         View var9 = this.ay(var2);
         int var6 = this.b.d(var9);
         int var5 = this.b.a(var9);
         var8 = var7;
         if (var5 > var4) {
            var8 = var7;
            if (var6 < var3) {
               if (var5 <= var3 || !var1) {
                  return var9;
               }

               var8 = var7;
               if (var7 == null) {
                  var8 = var9;
               }
            }
         }

         --var2;
      }

      return var7;
   }

   public final void m(.mc var1, .mk var2, .cht var3) {
      super.m(var1, var2, var3);
      var3.l("android.support.v7.widget.StaggeredGridLayoutManager");
   }

   public final void n(.mc var1, .mk var2, View var3, .cht var4) {
      LayoutParams var7 = var3.getLayoutParams();
      if (!(var7 instanceof .mx)) {
         super.aL(var3, var4);
      } else {
         .mx var8 = (.mx)var7;
         int var5;
         boolean var6;
         if (this.j == 0) {
            var5 = var8.d();
            var6 = var8.b;
            var4.o(.eze.Z(var5, 1, -1, -1, false));
         } else {
            var5 = var8.d();
            var6 = var8.b;
            var4.o(.eze.Z(-1, -1, var5, 1, false));
         }
      }
   }

   public final void o(.mc var1, .mk var2) {
      this.bw(var1, var2, true);
   }

   public final void p(.mk var1) {
      this.f = -1;
      this.g = Integer.MIN_VALUE;
      this.q = null;
      this.H.a();
   }

   public final void q(Rect var1, int var2, int var3) {
      int var5 = this.at() + this.au();
      int var4 = this.av() + this.as();
      if (this.j == 1) {
         var3 = al(var3, var1.height() + var4, this.aq());
         var2 = al(var2, this.k * this.i + var5, this.ar());
      } else {
         var2 = al(var2, var1.width() + var5, this.ar());
         var3 = al(var3, this.k * this.i + var4, this.aq());
      }

      this.aV(var2, var3);
   }

   final View r(boolean var1) {
      int var4 = this.b.j();
      int var5 = this.b.f();
      int var3 = this.am();
      int var2 = 0;

      View var7;
      View var8;
      for(var8 = null; var2 < var3; var8 = var7) {
         View var9 = this.ay(var2);
         int var6 = this.b.d(var9);
         var7 = var8;
         if (this.b.a(var9) > var4) {
            var7 = var8;
            if (var6 < var5) {
               if (var6 >= var4 || !var1) {
                  return var9;
               }

               var7 = var8;
               if (var8 == null) {
                  var7 = var9;
               }
            }
         }

         ++var2;
      }

      return var8;
   }

   public final boolean s(.ly var1) {
      return var1 instanceof .mx;
   }

   public final boolean u() {
      return this.q == null;
   }

   final View v() {
      int var1 = this.am() - 1;
      BitSet var9 = new BitSet(this.i);
      var9.set(0, this.i, true);
      byte var2;
      if (this.j == 1 && this.M()) {
         var2 = 1;
      } else {
         var2 = -1;
      }

      int var3;
      if (this.e) {
         var3 = -1;
      } else {
         var3 = var1 + 1;
         var1 = 0;
      }

      byte var4;
      if (var1 < var3) {
         var4 = 1;
      } else {
         var4 = -1;
      }

      View var8;
      while(true) {
         if (var1 == var3) {
            return null;
         }

         var8 = this.ay(var1);
         .mx var10 = (.mx)var8.getLayoutParams();
         boolean var7;
         if (var9.get(var10.a.e)) {
            .nb var11 = var10.a;
            if (this.e) {
               if (var11.c() < this.b.f()) {
                  ArrayList var14 = var11.a;
                  var7 = .nb.n((View)var14.get(var14.size() - 1)).b;
                  break;
               }
            } else if (var11.e() > this.b.j()) {
               var7 = .nb.n((View)var11.a.get(0)).b;
               break;
            }

            var9.clear(var10.a.e);
         }

         var7 = var10.b;
         int var6 = var1 + var4;
         if (var6 != var3) {
            label89: {
               label88: {
                  View var15 = this.ay(var6);
                  int var5;
                  if (this.e) {
                     var5 = this.b.a(var8);
                     var1 = this.b.a(var15);
                     if (var5 < var1) {
                        return var8;
                     }

                     if (var5 != var1) {
                        break label88;
                     }
                  } else {
                     var1 = this.b.d(var8);
                     var5 = this.b.d(var15);
                     if (var1 > var5) {
                        return var8;
                     }

                     if (var1 != var5) {
                        break label89;
                     }
                  }

                  .mx var16 = (.mx)var15.getLayoutParams();
                  boolean var12;
                  if (var10.a.e - var16.a.e >= 0) {
                     var12 = false;
                  } else {
                     var12 = true;
                  }

                  boolean var13;
                  if (var2 >= 0) {
                     var13 = false;
                  } else {
                     var13 = true;
                  }

                  if (var12 != var13) {
                     return var8;
                  }
               }

               var1 = var6;
               continue;
            }
         }

         var1 = var6;
      }

      return var8;
   }

   public final void w(int var1, int var2) {
      this.aj(var1, var2, 1);
   }

   public final void x() {
      this.h.a();
      this.aS();
   }

   public final void y(int var1, int var2) {
      this.aj(var1, var2, 2);
   }

   public final void z(int var1, int var2) {
      this.aj(var1, var2, 4);
   }
}
