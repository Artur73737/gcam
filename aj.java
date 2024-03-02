import androidx.wear.ambient.AmbientDelegate;
import java.util.Arrays;

public final class aj {
   private static int h = 1000;
   int a = 0;
   public final ai b = new ai();
   public ah[] c = null;
   public boolean[] d = new boolean[32];
   public int e = 1;
   public int f = 0;
   public final AmbientDelegate g;
   private int i = 32;
   private int j = 32;
   private int k = 32;
   private ak[] l;
   private int m;
   private ah[] n;

   public aj() {
      this.l = new ak[h];
      this.m = 0;
      this.n = new ah[32];
      this.c = new ah[32];
      this.r();
      this.g = new AmbientDelegate((byte[])null);
   }

   public static ah b(aj var0, ak var1, ak var2, int var3, float var4, ak var5, ak var6, int var7, boolean var8) {
      ah var9 = var0.a();
      var9.d(var1, var2, var3, var4, var5, var6, var7);
      if (var8) {
         var1 = var0.d();
         ak var10 = var0.d();
         var1.c = 4;
         var10.c = 4;
         var9.c(var1, var10);
      }

      return var9;
   }

   public static ah c(aj var0, ak var1, ak var2, int var3, boolean var4) {
      ah var5 = var0.a();
      var5.h(var1, var2, var3);
      if (var4) {
         var0.k(var5, 1);
      }

      return var5;
   }

   public static final int p(Object var0) {
      ak var1 = ((al)var0).f;
      return var1 != null ? (int)(var1.d + 0.5F) : 0;
   }

   private final void q() {
      int var1 = this.i;
      var1 += var1;
      this.i = var1;
      this.c = (ah[])Arrays.copyOf(this.c, var1);
      AmbientDelegate var3 = this.g;
      Object var2 = var3.a;
      var1 = this.i;
      var3.a = (ak[])Arrays.copyOf((Object[])var2, var1);
      var1 = this.i;
      this.d = new boolean[var1];
      this.j = var1;
      this.k = var1;
      this.b.a.clear();
   }

   private final void r() {
      int var1 = 0;

      while(true) {
         ah[] var2 = this.c;
         if (var1 >= var2.length) {
            return;
         }

         ah var3 = var2[var1];
         if (var3 != null) {
            ((gtv)this.g.c).k(var3);
         }

         this.c[var1] = null;
         ++var1;
      }
   }

   private final ak s(int var1) {
      ak var3 = (ak)((gtv)this.g.b).j();
      if (var3 == null) {
         var3 = new ak(var1);
      } else {
         var3.b();
         var3.h = var1;
      }

      int var2 = this.m;
      var1 = h;
      if (var2 >= var1) {
         var1 += var1;
         h = var1;
         this.l = (ak[])Arrays.copyOf(this.l, var1);
      }

      ak[] var4 = this.l;
      var1 = this.m++;
      var4[var1] = var3;
      return var3;
   }

   public final ah a() {
      ah var1 = (ah)((gtv)this.g.c).j();
      if (var1 == null) {
         var1 = new ah(this.g);
      } else {
         var1.a = null;
         ag var2 = var1.d;
         var2.e = -1;
         var2.f = -1;
         var2.g = false;
         var2.a = 0;
         var1.b = 0.0F;
         var1.e = false;
      }

      return var1;
   }

   public final ak d() {
      if (this.e + 1 >= this.j) {
         this.q();
      }

      ak var2 = this.s(4);
      int var1 = this.a + 1;
      this.a = var1;
      ++this.e;
      var2.a = var1;
      ((ak[])this.g.a)[var1] = var2;
      return var2;
   }

   public final ak e(Object var1) {
      if (var1 == null) {
         return null;
      } else {
         if (this.e + 1 >= this.j) {
            this.q();
         }

         al var3 = (al)var1;
         ak var4 = var3.f;
         if (var4 == null) {
            var3.e();
            var4 = var3.f;
         }

         int var2 = var4.a;
         if (var2 != -1) {
            if (var2 <= this.a && ((ak[])this.g.a)[var2] != null) {
               return var4;
            }

            if (var2 != -1) {
               var4.b();
            }
         }

         var2 = this.a + 1;
         this.a = var2;
         ++this.e;
         var4.a = var2;
         var4.h = 1;
         ((ak[])this.g.a)[var2] = var4;
         return var4;
      }
   }

   public final ak f() {
      if (this.e + 1 >= this.j) {
         this.q();
      }

      ak var2 = this.s(3);
      int var1 = this.a + 1;
      this.a = var1;
      ++this.e;
      var2.a = var1;
      ((ak[])this.g.a)[var1] = var2;
      return var2;
   }

   public final void g(ah var1) {
      if (this.f + 1 >= this.k || this.e + 1 >= this.j) {
         this.q();
      }

      boolean var7 = var1.e;
      byte var5 = 0;
      int var3;
      int var4;
      ah[] var8;
      ak var15;
      if (!var7) {
         float var2;
         int var6;
         ag var9;
         Object var10;
         ak var18;
         if (this.f > 0) {
            var9 = var1.d;
            var8 = this.c;
            var3 = var9.e;
            var4 = 0;

            while(true) {
               while(var3 != -1 && var4 < var9.a) {
                  var10 = var9.h.a;
                  var6 = var9.b[var3];
                  var18 = ((ak[])var10)[var6];
                  if (var18.b != -1) {
                     var2 = var9.d[var3];
                     var9.c(var18);
                     ah var12 = var8[var18.b];
                     if (!var12.e) {
                        ag var11 = var12.d;
                        var4 = var11.e;

                        for(var3 = 0; var4 != -1 && var3 < var11.a; ++var3) {
                           var10 = var9.h.a;
                           var6 = var11.b[var4];
                           var9.e(((ak[])var10)[var6], var11.d[var4] * var2);
                           var4 = var11.c[var4];
                        }
                     }

                     var1.b += var12.b * var2;
                     var12.a.a(var1);
                     var3 = var9.e;
                     var4 = 0;
                  } else {
                     var3 = var9.c[var3];
                     ++var4;
                  }
               }

               if (var1.d.a == 0) {
                  var1.e = true;
               }
               break;
            }
         }

         var2 = var1.b;
         if (var2 < 0.0F) {
            var1.b = -var2;
            var9 = var1.d;
            var4 = var9.e;

            for(var3 = 0; var4 != -1 && var3 < var9.a; ++var3) {
               float[] var14 = var9.d;
               var14[var4] = -var14[var4];
               var4 = var9.c[var4];
            }
         }

         ag var13 = var1.d;
         var4 = var13.e;
         ak var17 = null;
         var15 = null;
         var3 = 0;

         while(true) {
            if (var4 == -1 || var3 >= var13.a) {
               if (var15 != null) {
                  var17 = var15;
               }
               break;
            }

            float[] var19 = var13.d;
            var2 = var19[var4];
            if (var2 < 0.0F) {
               if (var2 > -0.001F) {
                  var19[var4] = 0.0F;
                  var2 = 0.0F;
               }
            } else if (var2 < 0.001F) {
               var19[var4] = 0.0F;
               var2 = 0.0F;
            }

            ak var22 = var17;
            ak var20 = var15;
            if (var2 != 0.0F) {
               var10 = var13.h.a;
               var6 = var13.b[var4];
               var18 = ((ak[])var10)[var6];
               if (var18.h == 1) {
                  if (var2 < 0.0F) {
                     var17 = var18;
                     break;
                  }

                  var22 = var17;
                  var20 = var15;
                  if (var15 == null) {
                     var22 = var17;
                     var20 = var18;
                  }
               } else {
                  var22 = var17;
                  var20 = var15;
                  if (var2 < 0.0F) {
                     label123: {
                        if (var17 != null) {
                           var22 = var17;
                           var20 = var15;
                           if (var18.c >= var17.c) {
                              break label123;
                           }
                        }

                        var20 = var15;
                        var22 = var18;
                     }
                  }
               }
            }

            var4 = var13.c[var4];
            ++var3;
            var17 = var22;
            var15 = var20;
         }

         if (var17 != null) {
            var1.a(var17);
         }

         if (var1.d.a == 0) {
            var1.e = true;
         }

         var15 = var1.a;
         if (var15 == null || var15.h != 1 && var1.b < 0.0F) {
            return;
         }
      }

      ah var16 = this.c[this.f];
      if (var16 != null) {
         ((gtv)this.g.c).k(var16);
      }

      if (!var1.e) {
         var1.b();
      }

      var8 = this.c;
      var3 = this.f;
      var8[var3] = var1;
      var15 = var1.a;
      var15.b = var3;
      this.f = var3 + 1;
      var4 = var15.g;
      if (var4 > 0) {
         while(true) {
            var8 = this.n;
            var3 = var8.length;
            if (var3 >= var4) {
               for(var3 = 0; var3 < var4; ++var3) {
                  var8[var3] = var1.a.f[var3];
               }

               for(var3 = var5; var3 < var4; ++var3) {
                  ah var21 = var8[var3];
                  if (var21 != var1) {
                     var21.d.g(var21, var1);
                     var21.b();
                  }
               }
               break;
            }

            this.n = new ah[var3 + var3];
         }
      }

   }

   public final void h(ak var1, int var2) {
      int var4 = var1.b;
      ah var5;
      if (var4 != -1) {
         var5 = this.c[var4];
         if (var5.e) {
            var5.b = (float)var2;
         } else {
            var5 = this.a();
            var5.g(var1, var2);
            this.g(var5);
         }
      } else {
         var5 = this.a();
         var5.a = var1;
         float var3 = (float)var2;
         var1.d = var3;
         var5.b = var3;
         var5.e = true;
         this.g(var5);
      }
   }

   public final void i(ak var1, ak var2, int var3, int var4) {
      ah var5 = this.a();
      ak var6 = this.f();
      var6.c = var4;
      var5.i(var1, var2, var6, var3);
      this.g(var5);
   }

   public final void j(ak var1, ak var2, int var3, int var4) {
      ah var6 = this.a();
      ak var5 = this.f();
      var5.c = var4;
      var6.j(var1, var2, var5, var3);
      this.g(var6);
   }

   public final void k(ah var1, int var2) {
      ak var4 = this.d();
      float var3 = (float)var2;
      var1.d.f(var4, var3);
   }

   public final void l() {
      int var1 = 0;

      while(true) {
         AmbientDelegate var5 = this.g;
         ak[] var4 = (ak[])var5.a;
         ak var8;
         if (var1 >= var4.length) {
            Object var6 = var5.b;
            ak[] var7 = this.l;
            int var3 = this.m;
            int var2 = var7.length;
            var1 = var3;
            if (var3 > var2) {
               var1 = var2;
            }

            for(var2 = 0; var2 < var1; ++var2) {
               var8 = var7[var2];
               gtv var9 = (gtv)var6;
               var3 = var9.a;
               if (var3 < 256) {
                  ((Object[])var9.b)[var3] = var8;
                  var9.a = var3 + 1;
               }
            }

            this.m = 0;
            Arrays.fill((Object[])this.g.a, (Object)null);
            this.a = 0;
            this.b.a.clear();
            this.e = 1;

            for(var1 = 0; var1 < this.f; ++var1) {
               this.c[var1].c = false;
            }

            this.r();
            this.f = 0;
            return;
         }

         var8 = var4[var1];
         if (var8 != null) {
            var8.b();
         }

         ++var1;
      }
   }

   public final void m(ak var1, ak var2, int var3, float var4, ak var5, ak var6, int var7) {
      ah var8 = this.a();
      var8.d(var1, var2, var3, var4, var5, var6, var7);
      var1 = this.d();
      var2 = this.d();
      var1.c = 4;
      var2.c = 4;
      var8.c(var1, var2);
      this.g(var8);
   }

   public final void n(ak var1, ak var2, int var3, int var4) {
      ah var5 = this.a();
      var5.h(var1, var2, var3);
      var1 = this.d();
      var2 = this.d();
      var1.c = var4;
      var2.c = var4;
      var5.c(var1, var2);
      this.g(var5);
   }

   public final void o(ai var1) {
      int var5 = 0;

      label100:
      while(true) {
         if (var5 >= this.f) {
            var5 = 0;
            break;
         }

         ah var14 = this.c[var5];
         if (var14.a.h != 1 && var14.b < 0.0F) {
            var5 = 0;
            int var6 = -1;
            int var7 = -1;
            float var2 = Float.MAX_VALUE;
            int var8 = 0;

            while(true) {
               while(var5 >= this.f) {
                  if (var6 == -1) {
                     var5 = 0;
                     break label100;
                  }

                  var14 = this.c[var6];
                  var14.a.b = -1;
                  var14.a(((ak[])this.g.a)[var7]);
                  var14.a.b = var6;

                  for(var5 = 0; var5 < this.f; ++var5) {
                     this.c[var5].k(var14);
                  }

                  var1.a(this);
                  var5 = 0;
                  var6 = -1;
                  var7 = -1;
                  var2 = Float.MAX_VALUE;
                  var8 = 0;
               }

               var14 = this.c[var5];
               float var3;
               int var10;
               int var11;
               int var12;
               if (var14.a.h == 1) {
                  var12 = var6;
                  var10 = var7;
                  var3 = var2;
                  var11 = var8;
               } else {
                  var12 = var6;
                  var10 = var7;
                  var3 = var2;
                  var11 = var8;
                  if (var14.b < 0.0F) {
                     int var9 = 1;

                     while(true) {
                        var12 = var6;
                        var10 = var7;
                        var3 = var2;
                        var11 = var8;
                        if (var9 >= this.e) {
                           break;
                        }

                        ak var15 = ((ak[])this.g.a)[var9];
                        float var4 = var14.d.a(var15);
                        int var13;
                        if (var4 <= 0.0F) {
                           var11 = var8;
                           var3 = var2;
                           var12 = var7;
                           var13 = var6;
                        } else {
                           var10 = 0;

                           while(true) {
                              var13 = var6;
                              var12 = var7;
                              var3 = var2;
                              var11 = var8;
                              if (var10 >= 6) {
                                 break;
                              }

                              label116: {
                                 var3 = var15.e[var10] / var4;
                                 if (!(var3 < var2) || var10 != var8) {
                                    var11 = var8;
                                    if (var10 <= var8) {
                                       break label116;
                                    }
                                 }

                                 var2 = var3;
                                 var6 = var5;
                                 var7 = var9;
                                 var11 = var10;
                              }

                              ++var10;
                              var8 = var11;
                           }
                        }

                        ++var9;
                        var6 = var13;
                        var7 = var12;
                        var2 = var3;
                        var8 = var11;
                     }
                  }
               }

               ++var5;
               var6 = var12;
               var7 = var10;
               var2 = var3;
               var8 = var11;
            }
         }

         ++var5;
      }

      while(var5 < this.f) {
         ah var16 = this.c[var5];
         if (var16.a.h != 1 && var16.b < 0.0F) {
            break;
         }

         ++var5;
      }

   }
}
