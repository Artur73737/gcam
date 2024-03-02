import java.util.HashSet;
import java.util.Iterator;

public final class bzt {
   public static final bzn a = new bzn();
   public static int b = 0;
   public static int c = 0;

   public static void a(int var0, bzf var1, cae var2, boolean var3) {
      if (!var1.o) {
         ++b;
         if (!(var1 instanceof bzg) && var1.M() && c(var1)) {
            bzg.Z(var1, var2, new bzn());
         }

         bze var10 = var1.m(bzd.b);
         bze var9 = var1.m(bzd.d);
         int var7 = var10.a();
         int var5 = var9.a();
         HashSet var11 = var10.a;
         boolean var4;
         int var6;
         boolean var8;
         bze var13;
         int var15;
         bze var20;
         if (var11 != null && var10.c) {
            Iterator var17 = var11.iterator();

            label221:
            while(true) {
               bzf var12;
               do {
                  do {
                     do {
                        do {
                           while(true) {
                              if (!var17.hasNext()) {
                                 break label221;
                              }

                              var20 = (bze)var17.next();
                              var12 = var20.d;
                              var6 = var0 + 1;
                              var8 = c(var12);
                              if (var12.M() && var8) {
                                 bzg.Z(var12, var2, new bzn());
                              }

                              bze var14;
                              label232: {
                                 var14 = var12.K;
                                 if (var20 == var14) {
                                    var13 = var12.M.f;
                                    if (var13 != null && var13.c) {
                                       var4 = true;
                                       break label232;
                                    }
                                 }

                                 if (var20 == var12.M) {
                                    var13 = var14.f;
                                    if (var13 != null && var13.c) {
                                       var4 = true;
                                       break label232;
                                    }
                                 }

                                 var4 = false;
                              }

                              if (var12.O() == 3 && !var8) {
                                 break;
                              }

                              if (!var12.M()) {
                                 var14 = var12.K;
                                 if (var20 == var14 && var12.M.f == null) {
                                    var15 = var14.b() + var7;
                                    var12.y(var15, var12.j() + var15);
                                    a(var6, var12, var2, var3);
                                 } else {
                                    var13 = var12.M;
                                    if (var20 == var13 && var14.f == null) {
                                       var15 = var7 - var13.b();
                                       var12.y(var15 - var12.j(), var15);
                                       a(var6, var12, var2, var3);
                                    } else if (var4 && !var12.K()) {
                                       e(var6, var2, var12, var3);
                                    }
                                 }
                              }
                           }
                        } while(var12.O() != 3);
                     } while(var12.x < 0);
                  } while(var12.w < 0);
               } while(var12.ai != 8 && (var12.t != 0 || var12.Y != 0.0F));

               if (!var12.K() && var4 && !var12.K()) {
                  f(var6, var1, var2, var12, var3);
               }
            }
         }

         if (!(var1 instanceof bzi)) {
            HashSet var18 = var9.a;
            if (var18 != null && var9.c) {
               Iterator var16 = var18.iterator();

               label168:
               while(true) {
                  bzf var19;
                  do {
                     do {
                        do {
                           do {
                              while(true) {
                                 if (!var16.hasNext()) {
                                    break label168;
                                 }

                                 var20 = (bze)var16.next();
                                 var19 = var20.d;
                                 var6 = var0 + 1;
                                 var8 = c(var19);
                                 if (var19.M() && var8) {
                                    bzg.Z(var19, var2, new bzn());
                                 }

                                 bze var21;
                                 label236: {
                                    var21 = var19.K;
                                    if (var20 == var21) {
                                       var13 = var19.M.f;
                                       if (var13 != null && var13.c) {
                                          var4 = true;
                                          break label236;
                                       }
                                    }

                                    if (var20 == var19.M) {
                                       var21 = var21.f;
                                       if (var21 != null && var21.c) {
                                          var4 = true;
                                          break label236;
                                       }
                                    }

                                    var4 = false;
                                 }

                                 if (var19.O() == 3 && !var8) {
                                    break;
                                 }

                                 if (!var19.M()) {
                                    var13 = var19.K;
                                    if (var20 == var13 && var19.M.f == null) {
                                       var15 = var13.b() + var5;
                                       var19.y(var15, var19.j() + var15);
                                       a(var6, var19, var2, var3);
                                    } else {
                                       var21 = var19.M;
                                       if (var20 == var21 && var13.f == null) {
                                          var15 = var5 - var21.b();
                                          var19.y(var15 - var19.j(), var15);
                                          a(var6, var19, var2, var3);
                                       } else if (var4 && !var19.K()) {
                                          e(var6, var2, var19, var3);
                                       }
                                    }
                                 }
                              }
                           } while(var19.O() != 3);
                        } while(var19.x < 0);
                     } while(var19.w < 0);
                  } while(var19.ai != 8 && (var19.t != 0 || var19.Y != 0.0F));

                  if (!var19.K() && var4 && !var19.K()) {
                     f(var6, var1, var2, var19, var3);
                  }
               }
            }

            var1.o = true;
         }

      }
   }

   public static void b(int var0, bzf var1, cae var2) {
      if (!var1.p) {
         ++c;
         if (!(var1 instanceof bzg) && var1.M() && c(var1)) {
            bzg.Z(var1, var2, new bzn());
         }

         bze var10 = var1.m(bzd.c);
         bze var8 = var1.m(bzd.e);
         int var6 = var10.a();
         int var4 = var8.a();
         HashSet var9 = var10.a;
         boolean var3;
         int var5;
         boolean var7;
         bze var11;
         bze var12;
         int var16;
         bzf var17;
         Iterator var18;
         if (var9 != null && var10.c) {
            var18 = var9.iterator();

            label527:
            while(true) {
               do {
                  do {
                     do {
                        do {
                           while(true) {
                              if (!var18.hasNext()) {
                                 break label527;
                              }

                              var11 = (bze)var18.next();
                              var17 = var11.d;
                              var5 = var0 + 1;
                              var7 = c(var17);
                              if (var17.M() && var7) {
                                 bzg.Z(var17, var2, new bzn());
                              }

                              bze var13;
                              label538: {
                                 var12 = var17.L;
                                 if (var11 == var12) {
                                    var13 = var17.N.f;
                                    if (var13 != null && var13.c) {
                                       var3 = true;
                                       break label538;
                                    }
                                 }

                                 if (var11 == var17.N) {
                                    var12 = var12.f;
                                    if (var12 != null && var12.c) {
                                       var3 = true;
                                       break label538;
                                    }
                                 }

                                 var3 = false;
                              }

                              if (var17.P() == 3 && !var7) {
                                 break;
                              }

                              if (!var17.M()) {
                                 var12 = var17.L;
                                 if (var11 == var12 && var17.N.f == null) {
                                    var16 = var12.b() + var6;
                                    var17.z(var16, var17.h() + var16);
                                    b(var5, var17, var2);
                                 } else {
                                    var13 = var17.N;
                                    if (var11 == var13 && var12.f == null) {
                                       var16 = var6 - var13.b();
                                       var17.z(var16 - var17.h(), var16);
                                       b(var5, var17, var2);
                                    } else if (var3 && !var17.L()) {
                                       g(var5, var2, var17);
                                    }
                                 }
                              }
                           }
                        } while(var17.P() != 3);
                     } while(var17.A < 0);
                  } while(var17.z < 0);
               } while(var17.ai != 8 && (var17.u != 0 || var17.Y != 0.0F));

               if (!var17.L() && var3 && !var17.L()) {
                  h(var5, var1, var2, var17);
               }
            }
         }

         if (!(var1 instanceof bzi)) {
            var9 = var8.a;
            if (var9 != null && var8.c) {
               var18 = var9.iterator();

               label474:
               while(true) {
                  do {
                     do {
                        do {
                           do {
                              while(true) {
                                 if (!var18.hasNext()) {
                                    break label474;
                                 }

                                 var8 = (bze)var18.next();
                                 var17 = var8.d;
                                 var5 = var0 + 1;
                                 var7 = c(var17);
                                 if (var17.M() && var7) {
                                    bzg.Z(var17, var2, new bzn());
                                 }

                                 label543: {
                                    var11 = var17.L;
                                    if (var8 == var11) {
                                       var12 = var17.N.f;
                                       if (var12 != null && var12.c) {
                                          var3 = true;
                                          break label543;
                                       }
                                    }

                                    if (var8 == var17.N) {
                                       var11 = var11.f;
                                       if (var11 != null && var11.c) {
                                          var3 = true;
                                          break label543;
                                       }
                                    }

                                    var3 = false;
                                 }

                                 if (var17.P() == 3 && !var7) {
                                    break;
                                 }

                                 if (!var17.M()) {
                                    var11 = var17.L;
                                    if (var8 == var11 && var17.N.f == null) {
                                       var16 = var11.b() + var4;
                                       var17.z(var16, var17.h() + var16);
                                       b(var5, var17, var2);
                                    } else {
                                       var12 = var17.N;
                                       if (var8 == var12 && var11.f == null) {
                                          var16 = var4 - var12.b();
                                          var17.z(var16 - var17.h(), var16);
                                          b(var5, var17, var2);
                                       } else if (var3 && !var17.L()) {
                                          g(var5, var2, var17);
                                       }
                                    }
                                 }
                              }
                           } while(var17.P() != 3);
                        } while(var17.A < 0);
                     } while(var17.z < 0);
                  } while(var17.ai != 8 && (var17.u != 0 || var17.Y != 0.0F));

                  if (!var17.L() && var3 && !var17.L()) {
                     h(var5, var1, var2, var17);
                  }
               }
            }

            var8 = var1.m(bzd.f);
            if (var8.a != null && var8.c) {
               var5 = var8.a();
               var18 = var8.a.iterator();

               label419:
               while(true) {
                  do {
                     if (!var18.hasNext()) {
                        break label419;
                     }

                     var8 = (bze)var18.next();
                     var17 = var8.d;
                     var7 = c(var17);
                     if (var17.M() && var7) {
                        bzg.Z(var17, var2, new bzn());
                     }
                  } while(var17.P() == 3 && !var7);

                  if (!var17.M() && var8 == var17.O) {
                     var6 = var8.b() + var5;
                     if (var17.G) {
                        var16 = var6 - var17.ac;
                        var4 = var17.X;
                        var17.ab = var16;
                        var17.L.e(var16);
                        var17.N.e(var4 + var16);
                        var17.O.e(var6);
                        var17.n = true;
                     }

                     try {
                        b(var0 + 1, var17, var2);
                     } finally {
                        ;
                     }
                  }
               }
            }

            var1.p = true;
         }

      }
   }

   public static boolean c(bzf var0) {
      int var1 = var0.O();
      int var2 = var0.P();
      bzf var6 = var0.V;
      bzf var5 = var6;
      if (var6 == null) {
         var5 = null;
      }

      if (var5 != null) {
         var5.O();
      }

      if (var5 != null) {
         var5.P();
      }

      boolean var7;
      label98: {
         label116: {
            if (var1 != 1 && !var0.e() && var1 != 2) {
               label110: {
                  if (var1 == 3) {
                     if (var0.t == 0 && var0.Y == 0.0F && var0.I(0)) {
                        break label110;
                     }
                  } else if (var1 != 3) {
                     break label116;
                  }

                  if (var0.t == 1 && var0.J(0, var0.j())) {
                     var7 = true;
                     break label98;
                  }
                  break label116;
               }
            }

            var7 = true;
            break label98;
         }

         var7 = false;
      }

      boolean var8;
      label117: {
         if (var2 != 1 && !var0.f() && var2 != 2) {
            label113: {
               label75: {
                  if (var2 == 3) {
                     if (var0.u == 0 && var0.Y == 0.0F && var0.I(1)) {
                        break label113;
                     }
                  } else if (var2 != 3) {
                     break label75;
                  }

                  if (var0.u == 1 && var0.J(1, var0.h())) {
                     var8 = true;
                     break label117;
                  }
               }

               var8 = false;
               break label117;
            }
         }

         var8 = true;
      }

      boolean var3 = var7;
      boolean var4 = var8;
      if (var0.Y > 0.0F) {
         if (var7 || var8) {
            return true;
         }

         var3 = false;
         var4 = false;
      }

      return var3 && var4;
   }

   public static void d(bzb var0, cae var1, int var2, boolean var3) {
      if (var0.c()) {
         if (var2 == 0) {
            a(1, var0, var1, var3);
            return;
         }

         b(1, var0, var1);
      }

   }

   private static void e(int var0, cae var1, bzf var2, boolean var3) {
      float var4 = var2.af;
      int var8 = var2.K.f.a();
      int var7 = var2.M.f.a();
      int var6 = var2.K.b() + var8;
      int var5 = var7 - var2.M.b();
      if (var8 == var7) {
         var5 = var7;
      }

      if (var8 == var7) {
         var6 = var8;
      }

      if (var8 == var7) {
         var4 = 0.5F;
      }

      var8 = var2.j();
      var7 = var5 - var6 - var8;
      if (var6 > var5) {
         var7 = var6 - var5 - var8;
      }

      if (var7 > 0) {
         var7 = (int)(var4 * (float)var7 + 0.5F);
      } else {
         var7 = (int)(var4 * (float)var7);
      }

      int var9 = var7 + var6;
      var7 = var9 + var8;
      if (var6 > var5) {
         var5 = var9 - var8;
      } else {
         var5 = var7;
      }

      var2.y(var9, var5);
      a(var0 + 1, var2, var1, var3);
   }

   private static void f(int var0, bzf var1, cae var2, bzf var3, boolean var4) {
      float var5 = var3.af;
      int var8 = var3.K.f.a() + var3.K.b();
      int var9 = var3.M.f.a() - var3.M.b();
      if (var9 >= var8) {
         int var6 = var3.j();
         int var7;
         if (var3.ai != 8) {
            var7 = var3.t;
            if (var7 == 2) {
               if (var1 instanceof bzg) {
                  var6 = var1.j();
               } else {
                  var6 = var1.V.j();
               }

               var6 = (int)(var3.af * 0.5F * (float)var6);
            } else if (var7 == 0) {
               var6 = var9 - var8;
            }

            var7 = Math.max(var3.w, var6);
            int var10 = var3.x;
            var6 = var7;
            if (var10 > 0) {
               var6 = Math.min(var10, var7);
            }
         }

         var7 = var8 + (int)(var5 * (float)(var9 - var8 - var6) + 0.5F);
         var3.y(var7, var6 + var7);
         a(var0 + 1, var3, var2, var4);
      }
   }

   private static void g(int var0, cae var1, bzf var2) {
      float var3 = var2.ag;
      int var7 = var2.L.f.a();
      int var6 = var2.N.f.a();
      int var5 = var2.L.b() + var7;
      int var4 = var6 - var2.N.b();
      if (var7 == var6) {
         var4 = var6;
      }

      if (var7 == var6) {
         var5 = var7;
      }

      if (var7 == var6) {
         var3 = 0.5F;
      }

      int var9 = var2.h();
      var6 = var4 - var5 - var9;
      if (var5 > var4) {
         var6 = var5 - var4 - var9;
      }

      if (var6 > 0) {
         var6 = (int)(var3 * (float)var6 + 0.5F);
      } else {
         var6 = (int)(var3 * (float)var6);
      }

      var7 = var5 + var6;
      int var8 = var7 + var9;
      if (var5 > var4) {
         var4 = var5 - var6;
         var5 = var4 - var9;
      } else {
         var5 = var8;
         var4 = var7;
      }

      var2.z(var4, var5);
      b(var0 + 1, var2, var1);
   }

   private static void h(int var0, bzf var1, cae var2, bzf var3) {
      float var4 = var3.ag;
      int var8 = var3.L.f.a() + var3.L.b();
      int var7 = var3.N.f.a() - var3.N.b();
      if (var7 >= var8) {
         int var5 = var3.h();
         int var6;
         if (var3.ai != 8) {
            var6 = var3.u;
            if (var6 == 2) {
               if (var1 instanceof bzg) {
                  var5 = var1.h();
               } else {
                  var5 = var1.V.h();
               }

               var5 = (int)(var4 * 0.5F * (float)var5);
            } else if (var6 == 0) {
               var5 = var7 - var8;
            }

            var6 = Math.max(var3.z, var5);
            int var9 = var3.A;
            var5 = var6;
            if (var9 > 0) {
               var5 = Math.min(var9, var6);
            }
         }

         var6 = var8 + (int)(var4 * (float)(var7 - var8 - var5) + 0.5F);
         var3.z(var6, var5 + var6);
         b(var0 + 1, var3, var2);
      }
   }
}
