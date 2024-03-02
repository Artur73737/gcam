import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public final class ac extends MarginLayoutParams {
   public float A = 0.0F;
   public float B = 0.0F;
   public int C = 0;
   public int D = 0;
   public int E = 0;
   public int F = 0;
   public int G = 0;
   public int H = 0;
   public int I = 0;
   public int J = 0;
   public int K = -1;
   public int L = -1;
   public int M = -1;
   public boolean N = true;
   public boolean O = true;
   public boolean P = false;
   public boolean Q = false;
   public int R = -1;
   public int S = -1;
   public int T = -1;
   public int U = -1;
   public int V = -1;
   public int W = -1;
   public float X = 0.5F;
   public am Y = new am();
   public int a = -1;
   public int b = -1;
   public float c = -1.0F;
   public int d = -1;
   public int e = -1;
   public int f = -1;
   public int g = -1;
   public int h = -1;
   public int i = -1;
   public int j = -1;
   public int k = -1;
   public int l = -1;
   public int m = -1;
   public int n = -1;
   public int o = -1;
   public int p = -1;
   public int q = -1;
   public int r = -1;
   public int s = -1;
   public int t = -1;
   public int u = -1;
   public int v = -1;
   public float w = 0.5F;
   public float x = 0.5F;
   public String y = null;
   int z = 1;

   public ac() {
      super(-2, -2);
   }

   public ac(Context var1, AttributeSet var2) {
      super(var1, var2);
      TypedArray var15 = var1.obtainStyledAttributes(var2, af.a);
      int var7 = var15.getIndexCount();

      for(int var5 = 0; var5 < var7; ++var5) {
         int var6 = var15.getIndex(var5);
         if (var6 == 84) {
            var6 = var15.getResourceId(84, this.d);
            this.d = var6;
            if (var6 == -1) {
               this.d = var15.getInt(84, -1);
            }
         } else if (var6 == 85) {
            var6 = var15.getResourceId(85, this.e);
            this.e = var6;
            if (var6 == -1) {
               this.e = var15.getInt(85, -1);
            }
         } else if (var6 == 87) {
            var6 = var15.getResourceId(87, this.f);
            this.f = var6;
            if (var6 == -1) {
               this.f = var15.getInt(87, -1);
            }
         } else if (var6 == 88) {
            var6 = var15.getResourceId(88, this.g);
            this.g = var6;
            if (var6 == -1) {
               this.g = var15.getInt(88, -1);
            }
         } else if (var6 == 94) {
            var6 = var15.getResourceId(94, this.h);
            this.h = var6;
            if (var6 == -1) {
               this.h = var15.getInt(94, -1);
            }
         } else if (var6 == 93) {
            var6 = var15.getResourceId(93, this.i);
            this.i = var6;
            if (var6 == -1) {
               this.i = var15.getInt(93, -1);
            }
         } else if (var6 == 65) {
            var6 = var15.getResourceId(65, this.j);
            this.j = var6;
            if (var6 == -1) {
               this.j = var15.getInt(65, -1);
            }
         } else if (var6 == 64) {
            var6 = var15.getResourceId(64, this.k);
            this.k = var6;
            if (var6 == -1) {
               this.k = var15.getInt(64, -1);
            }
         } else if (var6 == 60) {
            var6 = var15.getResourceId(60, this.l);
            this.l = var6;
            if (var6 == -1) {
               this.l = var15.getInt(60, -1);
            }
         } else if (var6 == 103) {
            this.K = var15.getDimensionPixelOffset(103, this.K);
         } else if (var6 == 104) {
            this.L = var15.getDimensionPixelOffset(104, this.L);
         } else if (var6 == 72) {
            this.a = var15.getDimensionPixelOffset(72, this.a);
         } else if (var6 == 73) {
            this.b = var15.getDimensionPixelOffset(73, this.b);
         } else if (var6 == 74) {
            this.c = var15.getFloat(74, this.c);
         } else if (var6 == 0) {
            this.M = var15.getInt(0, this.M);
         } else if (var6 == 89) {
            var6 = var15.getResourceId(89, this.m);
            this.m = var6;
            if (var6 == -1) {
               this.m = var15.getInt(89, -1);
            }
         } else if (var6 == 90) {
            var6 = var15.getResourceId(90, this.n);
            this.n = var6;
            if (var6 == -1) {
               this.n = var15.getInt(90, -1);
            }
         } else if (var6 == 71) {
            var6 = var15.getResourceId(71, this.o);
            this.o = var6;
            if (var6 == -1) {
               this.o = var15.getInt(71, -1);
            }
         } else if (var6 == 70) {
            var6 = var15.getResourceId(70, this.p);
            this.p = var6;
            if (var6 == -1) {
               this.p = var15.getInt(70, -1);
            }
         } else if (var6 == 108) {
            this.q = var15.getDimensionPixelSize(108, this.q);
         } else if (var6 == 111) {
            this.r = var15.getDimensionPixelSize(111, this.r);
         } else if (var6 == 109) {
            this.s = var15.getDimensionPixelSize(109, this.s);
         } else if (var6 == 106) {
            this.t = var15.getDimensionPixelSize(106, this.t);
         } else if (var6 == 110) {
            this.u = var15.getDimensionPixelSize(110, this.u);
         } else if (var6 == 107) {
            this.v = var15.getDimensionPixelSize(107, this.v);
         } else if (var6 == 80) {
            this.w = var15.getFloat(80, this.w);
         } else if (var6 == 95) {
            this.x = var15.getFloat(95, this.x);
         } else if (var6 == 69) {
            String var16 = var15.getString(69);
            this.y = var16;
            this.z = -1;
            if (var16 != null) {
               var6 = var16.indexOf(44);
               int var8 = var16.length();
               if (var6 > 0 && var6 < var8 - 1) {
                  var16 = this.y.substring(0, var6);
                  if (var16.equalsIgnoreCase("W")) {
                     this.z = 0;
                  } else if (var16.equalsIgnoreCase("H")) {
                     this.z = 1;
                  }

                  ++var6;
               } else {
                  var6 = 0;
               }

               int var9 = this.y.indexOf(58);
               boolean var10001;
               if (var9 >= 0 && var9 < var8 - 1) {
                  var16 = this.y.substring(var6, var9);
                  String var10 = this.y.substring(var9 + 1);
                  if (var16.length() > 0 && var10.length() > 0) {
                     float var3;
                     float var4;
                     try {
                        var4 = Float.parseFloat(var16);
                        var3 = Float.parseFloat(var10);
                     } catch (NumberFormatException var13) {
                        var10001 = false;
                        continue;
                     }

                     if (var4 > 0.0F && var3 > 0.0F) {
                        try {
                           if (this.z == 1) {
                              Math.abs(var3 / var4);
                              continue;
                           }
                        } catch (NumberFormatException var14) {
                           var10001 = false;
                           continue;
                        }

                        try {
                           Math.abs(var4 / var3);
                        } catch (NumberFormatException var11) {
                           var10001 = false;
                        }
                     }
                  }
               } else {
                  var16 = this.y.substring(var6);
                  if (var16.length() > 0) {
                     try {
                        Float.parseFloat(var16);
                     } catch (NumberFormatException var12) {
                        var10001 = false;
                     }
                  }
               }
            }
         } else if (var6 == 82) {
            this.A = var15.getFloat(82, 0.0F);
         } else if (var6 == 97) {
            this.B = var15.getFloat(97, 0.0F);
         } else if (var6 == 81) {
            this.C = var15.getInt(81, 0);
         } else if (var6 == 96) {
            this.D = var15.getInt(96, 0);
         } else if (var6 == 99) {
            this.E = var15.getInt(99, 0);
         } else if (var6 == 76) {
            this.F = var15.getInt(76, 0);
         } else if (var6 == 101) {
            this.G = var15.getDimensionPixelSize(101, this.G);
         } else if (var6 == 100) {
            this.I = var15.getDimensionPixelSize(100, this.I);
         } else if (var6 == 78) {
            this.H = var15.getDimensionPixelSize(78, this.H);
         } else if (var6 == 77) {
            this.J = var15.getDimensionPixelSize(77, this.J);
         }
      }

      var15.recycle();
      this.a();
   }

   public ac(LayoutParams var1) {
      super(var1);
   }

   public final void a() {
      this.Q = false;
      this.N = true;
      this.O = true;
      if (this.width == 0 || this.width == -1) {
         this.N = false;
      }

      if (this.height == 0 || this.height == -1) {
         this.O = false;
      }

      if (this.c != -1.0F || this.a != -1 || this.b != -1) {
         this.Q = true;
         this.N = true;
         this.O = true;
         if (!(this.Y instanceof ao)) {
            this.Y = new ao();
         }

         ((ao)this.Y).A(this.M);
      }
   }

   public final void resolveLayoutDirection(int var1) {
      super.resolveLayoutDirection(var1);
      this.T = -1;
      this.U = -1;
      this.R = -1;
      this.S = -1;
      this.V = this.q;
      this.W = this.s;
      this.X = this.w;
      if (this.getLayoutDirection() == 1) {
         var1 = this.m;
         if (var1 != -1) {
            this.T = var1;
         } else {
            var1 = this.n;
            if (var1 != -1) {
               this.U = var1;
            }
         }

         var1 = this.o;
         if (var1 != -1) {
            this.S = var1;
         }

         var1 = this.p;
         if (var1 != -1) {
            this.R = var1;
         }

         var1 = this.u;
         if (var1 != -1) {
            this.W = var1;
         }

         var1 = this.v;
         if (var1 != -1) {
            this.V = var1;
         }

         this.X = 1.0F - this.w;
      } else {
         var1 = this.m;
         if (var1 != -1) {
            this.S = var1;
         }

         var1 = this.n;
         if (var1 != -1) {
            this.R = var1;
         }

         var1 = this.o;
         if (var1 != -1) {
            this.T = var1;
         }

         var1 = this.p;
         if (var1 != -1) {
            this.U = var1;
         }

         var1 = this.u;
         if (var1 != -1) {
            this.V = var1;
         }

         var1 = this.v;
         if (var1 != -1) {
            this.W = var1;
         }
      }

      if (this.o == -1 && this.p == -1) {
         var1 = this.f;
         if (var1 != -1) {
            this.T = var1;
         } else {
            var1 = this.g;
            if (var1 != -1) {
               this.U = var1;
            }
         }
      }

      if (this.n == -1 && this.m == -1) {
         var1 = this.d;
         if (var1 != -1) {
            this.R = var1;
            return;
         }

         var1 = this.e;
         if (var1 != -1) {
            this.S = var1;
         }
      }

   }
}
