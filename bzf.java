import androidx.wear.ambient.AmbientDelegate;
import com.google.android.libraries.lens.lenslite.dynamicloading.LjhL.gThp;
import com.google.android.libraries.oliveoil.bufferflinger.aUnT.DHwXNavBkqbhR;
import com.google.android.libraries.social.licenses.an.fJos;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class bzf {
   public int A;
   public float B;
   int C;
   float D;
   public final int[] E;
   public float F;
   public boolean G;
   public boolean H;
   public int I;
   public int J;
   public final bze K;
   public final bze L;
   public final bze M;
   public final bze N;
   public final bze O;
   final bze P;
   final bze Q;
   public final bze R;
   public final bze[] S;
   protected final ArrayList T;
   public final boolean[] U;
   public bzf V;
   int W;
   public int X;
   public float Y;
   public int Z;
   private boolean a = true;
   public int aa;
   public int ab;
   public int ac;
   public int ad;
   public int ae;
   public float af;
   public float ag;
   public Object ah;
   public int ai;
   public String aj;
   public int ak;
   public int al;
   public final float[] am;
   public final bzf[] an;
   public final bzf[] ao;
   public int ap;
   public int aq;
   public final int[] ar;
   private boolean b;
   public boolean e = false;
   public bzo f;
   public bzo g;
   public bzw h = null;
   public bzx i = null;
   public final boolean[] j = new boolean[]{(boolean)1, (boolean)1};
   public int k = -1;
   public int l = -1;
   public String m;
   public boolean n;
   public boolean o;
   public boolean p;
   public int q;
   public int r;
   public int s;
   public int t;
   public int u;
   public final int[] v;
   public int w;
   public int x;
   public float y;
   public int z;

   public bzf() {
      new HashMap();
      this.b = false;
      this.n = false;
      this.o = false;
      this.p = false;
      this.q = -1;
      this.r = -1;
      this.s = 0;
      this.t = 0;
      this.u = 0;
      this.v = new int[2];
      this.w = 0;
      this.x = 0;
      this.y = 1.0F;
      this.z = 0;
      this.A = 0;
      this.B = 1.0F;
      this.C = -1;
      this.D = 1.0F;
      this.E = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
      this.F = Float.NaN;
      this.G = false;
      this.H = false;
      this.I = 0;
      this.J = 0;
      bze var7 = new bze(this, bzd.b);
      this.K = var7;
      bze var3 = new bze(this, bzd.c);
      this.L = var3;
      bze var6 = new bze(this, bzd.d);
      this.M = var6;
      bze var1 = new bze(this, bzd.e);
      this.N = var1;
      bze var9 = new bze(this, bzd.f);
      this.O = var9;
      bze var4 = new bze(this, bzd.h);
      this.P = var4;
      bze var5 = new bze(this, bzd.i);
      this.Q = var5;
      bze var2 = new bze(this, bzd.g);
      this.R = var2;
      this.S = new bze[]{var7, var6, var3, var1, var9, var2};
      ArrayList var8 = new ArrayList();
      this.T = var8;
      this.U = new boolean[2];
      this.ar = new int[]{1, 1};
      this.V = null;
      this.W = 0;
      this.X = 0;
      this.Y = 0.0F;
      this.Z = -1;
      this.aa = 0;
      this.ab = 0;
      this.ac = 0;
      this.af = 0.5F;
      this.ag = 0.5F;
      this.ai = 0;
      this.aj = null;
      this.ak = 0;
      this.al = 0;
      this.am = new float[]{-1.0F, -1.0F};
      this.an = new bzf[]{null, null};
      this.ao = new bzf[]{null, null};
      this.ap = -1;
      this.aq = -1;
      var8.add(var7);
      var8.add(var3);
      var8.add(var6);
      var8.add(var1);
      var8.add(var4);
      var8.add(var5);
      var8.add(var2);
      var8.add(var9);
   }

   private static final void U(StringBuilder var0, String var1, bze var2) {
      if (var2.f != null) {
         var0.append("    ");
         var0.append(var1);
         var0.append(" : [ '");
         var0.append(var2.f);
         var0.append(fJos.TUUMWaJOgFpco);
         if (var2.h != Integer.MIN_VALUE || var2.g != 0) {
            var0.append(",");
            var0.append(var2.g);
            if (var2.h != Integer.MIN_VALUE) {
               var0.append(",");
               var0.append(var2.h);
               var0.append(",");
            }
         }

         var0.append(" ] ,\n");
      }
   }

   private static final void V(StringBuilder var0, String var1, float var2, float var3) {
      if (var2 != var3) {
         var0.append(var1);
         var0.append(" :   ");
         var0.append(var2);
         var0.append(gThp.cTRAHImGWADOm);
      }
   }

   private static final void W(StringBuilder var0, String var1, int var2, int var3) {
      if (var2 != var3) {
         var0.append(var1);
         var0.append(" :   ");
         var0.append(var2);
         var0.append(",\n");
      }
   }

   private static final void X(StringBuilder var0, String var1, int var2, int var3, int var4, int var5, int var6, float var7, int var8) {
      var0.append(var1);
      var0.append(" :  {\n");
      switch(var8) {
      case 1:
         var1 = "FIXED";
         break;
      case 2:
         var1 = "WRAP_CONTENT";
         break;
      case 3:
         var1 = "MATCH_CONSTRAINT";
         break;
      case 4:
         var1 = "MATCH_PARENT";
         break;
      default:
         var1 = "null";
      }

      if (var8 != 0) {
         if (!"FIXED".equals(var1)) {
            var0.append("      behavior :   ");
            var0.append(var1);
            var0.append(",\n");
         }

         W(var0, "      size", var2, 0);
         W(var0, "      min", var3, 0);
         W(var0, "      max", var4, Integer.MAX_VALUE);
         W(var0, "      matchMin", var5, 0);
         W(var0, "      matchDef", var6, 0);
         V(var0, "      matchPercent", var7, 1.0F);
         var0.append("    },\n");
      } else {
         throw null;
      }
   }

   private final boolean a(int var1) {
      bze[] var2 = this.S;
      var1 += var1;
      bze var4 = var2[var1];
      bze var3 = var4.f;
      if (var3 != null && var3.f != var4) {
         var3 = var2[var1 + 1];
         bze var5 = var3.f;
         if (var5 != null && var5.f == var3) {
            return true;
         }
      }

      return false;
   }

   private final void c(byv var1, boolean var2, boolean var3, boolean var4, boolean var5, byz var6, byz var7, int var8, boolean var9, bze var10, bze var11, int var12, int var13, int var14, int var15, float var16, boolean var17, boolean var18, boolean var19, boolean var20, boolean var21, int var22, int var23, int var24, int var25, float var26, boolean var27) {
      byz var40 = var1.b(var10);
      byz var35 = var1.b(var11);
      byz var39 = var1.b(var10.f);
      byz var38 = var1.b(var11.f);
      byw var36 = byv.b;
      if (var36 != null) {
         ++var36.y;
      }

      boolean var34 = var10.h();
      boolean var33 = var11.h();
      boolean var32 = this.R.h();
      byte var29;
      if (var34) {
         var29 = 1;
      } else {
         var29 = 0;
      }

      int var28 = var29;
      if (var33) {
         var28 = var29 + 1;
      }

      int var61 = var28;
      if (var32) {
         var61 = var28 + 1;
      }

      if (var17) {
         var22 = 3;
      }

      bzd var65 = bzd.a;
      if (var8 == 0) {
         throw null;
      } else {
         boolean var46;
         switch(var8 - 1) {
         case 2:
            if (var22 != 4) {
               var46 = true;
               break;
            }
         case 0:
         case 1:
         case 3:
            var46 = false;
            break;
         default:
            var46 = false;
         }

         var28 = this.k;
         if (var28 != -1 && var2) {
            this.k = -1;
            var46 = false;
            var13 = var28;
         }

         var28 = this.l;
         boolean var47;
         if (var28 != -1 && !var2) {
            this.l = -1;
            var47 = false;
            var8 = var28;
         } else {
            var47 = var46;
            var8 = var13;
         }

         int var30 = this.ai;
         boolean var62;
         if (var30 == 8) {
            var62 = false;
         } else {
            var62 = true;
         }

         if (var30 == 8) {
            var8 = 0;
         }

         if (var27) {
            if (!var34 && !var33 && !var32) {
               var1.f(var40, var12);
            } else if (var34 && !var33) {
               var1.m(var40, var39, var10.b(), 8);
            }
         }

         var62 &= var47;
         if (!var62) {
            if (var9) {
               var1.m(var35, var40, 0, 3);
               if (var14 > 0) {
                  var1.g(var35, var40, var14, 8);
               }

               if (var15 < Integer.MAX_VALUE) {
                  var1.h(var35, var40, var15, 8);
               }
            } else {
               var1.m(var35, var40, var8, 8);
            }

            var8 = var22;
            var13 = var25;
            var12 = var24;
         } else {
            label588: {
               if (var61 != 2 && !var17) {
                  label582: {
                     var15 = var22;
                     if (var22 != 1) {
                        if (var22 != 0) {
                           break label582;
                        }

                        var15 = 0;
                     }

                     var12 = Math.max(var24, var8);
                     var8 = var12;
                     if (var25 > 0) {
                        var8 = Math.min(var25, var12);
                     }

                     var1.m(var35, var40, var8, 8);
                     var62 = false;
                     var12 = var24;
                     var13 = var25;
                     var8 = var15;
                     break label588;
                  }
               }

               var12 = var24;
               if (var24 == -2) {
                  var12 = var8;
               }

               var13 = var25;
               if (var25 == -2) {
                  var13 = var8;
               }

               var15 = var8;
               if (var8 > 0) {
                  var15 = var8;
                  if (var22 != 1) {
                     var15 = 0;
                  }
               }

               var8 = var15;
               if (var12 > 0) {
                  var1.g(var35, var40, var12, 8);
                  var8 = Math.max(var15, var12);
               }

               if (var13 <= 0) {
                  var24 = var8;
                  var8 = var22;
               } else {
                  if (var3 && var22 == 1) {
                     var15 = 1;
                  } else {
                     var1.h(var35, var40, var13, 8);
                     var15 = var22;
                  }

                  var24 = Math.min(var8, var13);
                  var8 = var15;
               }

               if (var22 == 1) {
                  if (var3) {
                     var1.m(var35, var40, var24, 8);
                  } else if (var19) {
                     var1.m(var35, var40, var24, 5);
                     var1.h(var35, var40, var24, 8);
                  } else {
                     var1.m(var35, var40, var24, 5);
                     var1.h(var35, var40, var24, 8);
                  }
               } else if (var22 == 2) {
                  var65 = var10.e;
                  byz var37;
                  byz var66;
                  if (var65 != bzd.c && var65 != bzd.e) {
                     var66 = var1.b(this.V.m(bzd.b));
                     var37 = var1.b(this.V.m(bzd.d));
                  } else {
                     var66 = var1.b(this.V.m(bzd.c));
                     var37 = var1.b(this.V.m(bzd.e));
                  }

                  byu var41 = var1.a();
                  var41.g(var35, var40, var37, var66, var26);
                  var1.e(var41);
                  var62 = var3 ^ true;
               } else {
                  var5 = true;
               }
            }
         }

         bzf var44;
         if (var27 && !var19) {
            byte var50;
            if (!var34 && !var33 && !var32) {
               var2 = var3;
               var50 = 5;
            } else if (var34 && !var33) {
               var44 = var10.f.d;
               if (var3 && var44 instanceof bzb) {
                  var2 = var3;
                  var50 = 8;
               } else {
                  var2 = var3;
                  var50 = 5;
               }
            } else if (!var34 && var33) {
               var1.m(var35, var38, -var11.b(), 8);
               if (var3) {
                  var1.g(var40, var6, 0, 5);
               }

               var2 = var3;
               var50 = 5;
            } else if (var34 && var33) {
               bzf var67 = var10.f.d;
               bzf var42 = var11.f.d;
               bzf var68 = this.V;
               byte var31 = 6;
               byte var48;
               byte var49;
               byte var52;
               boolean var53;
               boolean var56;
               boolean var57;
               byte var60;
               boolean var64;
               if (!var62) {
                  if (var39.g && var38.g) {
                     var1.d(var40, var39, var10.b(), var16, var38, var35, var11.b(), 8);
                     if (var3 && var5) {
                        if (var11.f != null) {
                           var8 = var11.b();
                        } else {
                           var8 = 0;
                        }

                        if (var38 != var7) {
                           var1.g(var7, var35, var8, 5);
                        }
                     }

                     return;
                  }

                  var49 = 6;
                  var29 = 5;
                  var60 = 4;
                  var56 = true;
                  var57 = false;
                  var53 = true;
                  var23 = var12;
                  var48 = var60;
                  var22 = var8;
                  var50 = var29;
               } else if (var8 == 0) {
                  boolean var51;
                  boolean var54;
                  boolean var58;
                  byte var59;
                  if (var13 == 0 && var12 == 0) {
                     if (var39.g) {
                        if (var38.g) {
                           var1.m(var40, var39, var10.b(), 8);
                           var1.m(var35, var38, -var11.b(), 8);
                           return;
                        }

                        var52 = 8;
                        var59 = 8;
                        var13 = 0;
                        var51 = false;
                        var54 = true;
                        var58 = false;
                     } else {
                        var52 = 8;
                        var59 = 8;
                        var13 = 0;
                        var51 = false;
                        var54 = true;
                        var58 = false;
                     }
                  } else {
                     var13 = var12;
                     var52 = 5;
                     var59 = 5;
                     var51 = true;
                     var54 = false;
                     var58 = true;
                  }

                  if (!(var67 instanceof bzb)) {
                     if (var42 instanceof bzb) {
                        var57 = var54;
                        var60 = 6;
                        var50 = var52;
                        var23 = var13;
                        var48 = 4;
                        var49 = var60;
                        var22 = var8;
                        var56 = var51;
                        var53 = var58;
                     } else {
                        var60 = 6;
                        var50 = var52;
                        var23 = var13;
                        var48 = var59;
                        var49 = var60;
                        var22 = var8;
                        var56 = var51;
                        var57 = var54;
                        var53 = var58;
                     }
                  } else {
                     var57 = var54;
                     var60 = 6;
                     var50 = var52;
                     var23 = var13;
                     var48 = 4;
                     var49 = var60;
                     var22 = var8;
                     var56 = var51;
                     var53 = var58;
                  }
               } else {
                  label585: {
                     label457: {
                        label456: {
                           if (var8 == 2) {
                              if (!(var67 instanceof bzb) && !(var42 instanceof bzb)) {
                                 var49 = 5;
                                 var52 = 5;
                                 break label456;
                              }

                              var49 = 5;
                           } else {
                              if (var8 != 1) {
                                 if (var8 != 3) {
                                    var23 = var12;
                                    var22 = var8;
                                    var49 = 6;
                                    var50 = 5;
                                    var48 = 4;
                                    var56 = false;
                                    var57 = false;
                                    var53 = false;
                                    break label585;
                                 }

                                 label445: {
                                    label444: {
                                       if (this.C == -1) {
                                          if (var20) {
                                             if (var3) {
                                                var50 = 5;
                                             } else {
                                                var50 = 4;
                                             }
                                          } else {
                                             var50 = 8;
                                          }

                                          var52 = 8;
                                       } else {
                                          if (var17) {
                                             if (var23 != 2 && var23 != 1) {
                                                var49 = 8;
                                                var50 = 5;
                                             } else {
                                                var49 = 5;
                                                var50 = 4;
                                             }

                                             var23 = var12;
                                             var52 = var49;
                                             var48 = var50;
                                             var49 = 6;
                                             var22 = 3;
                                             var56 = true;
                                             var57 = true;
                                             var64 = true;
                                             var50 = var52;
                                             var53 = var64;
                                             break label585;
                                          }

                                          if (var13 <= 0) {
                                             if (var13 == 0 && var12 == 0) {
                                                if (!var20) {
                                                   var52 = 5;
                                                   var48 = 8;
                                                } else {
                                                   if (var67 != var68 && var42 != var68) {
                                                      var50 = 4;
                                                   } else {
                                                      var50 = 5;
                                                   }

                                                   var48 = 4;
                                                   var52 = var50;
                                                }

                                                var50 = 6;
                                                var23 = 0;
                                                break label445;
                                             }

                                             var50 = 6;
                                             var52 = 5;
                                             var49 = 4;
                                             break label444;
                                          }

                                          var50 = 6;
                                          var52 = 5;
                                       }

                                       var49 = 5;
                                    }

                                    var23 = var12;
                                    var48 = var49;
                                 }

                                 var22 = 3;
                                 var57 = true;
                                 var49 = var50;
                                 var50 = var52;
                                 break label457;
                              }

                              var49 = 8;
                           }

                           var52 = 4;
                        }

                        byte var55 = 6;
                        var57 = false;
                        var23 = var12;
                        var48 = var52;
                        var22 = var8;
                        var50 = var49;
                        var49 = var55;
                     }

                     var56 = true;
                     var53 = true;
                  }
               }

               if (var53 && var39 == var38 && var67 != var68) {
                  var53 = false;
                  var64 = false;
               } else {
                  boolean var63 = true;
                  var64 = var53;
                  var53 = var63;
               }

               if (!var56) {
                  var2 = var3;
                  var47 = var53;
               } else {
                  if (!var62 && !var18 && !var20 && var39 == var6 && var38 == var7) {
                     var2 = false;
                     var50 = 8;
                     var47 = false;
                     var52 = 8;
                  } else {
                     var2 = var3;
                     var47 = var53;
                     var52 = var49;
                  }

                  var1.d(var40, var39, var10.b(), var16, var38, var35, var11.b(), var52);
               }

               if (this.ai == 8 && !var11.g()) {
                  return;
               }

               if (var64) {
                  if (var2 && var39 != var38 && !var62) {
                     if (!(var67 instanceof bzb)) {
                        if (var42 instanceof bzb) {
                           var50 = 6;
                        }
                     } else {
                        var50 = 6;
                     }
                  }

                  var1.g(var40, var39, var10.b(), var50);
                  var1.h(var35, var38, -var11.b(), var50);
               }

               if (var2 && var21 && !(var67 instanceof bzb) && !(var42 instanceof bzb) && var42 != var68) {
                  var50 = 6;
                  var49 = 6;
                  var53 = true;
               } else {
                  var53 = var47;
                  var49 = var50;
                  var50 = var48;
               }

               if (var53) {
                  if (var57) {
                     label577: {
                        if (var20) {
                           var12 = var50;
                           if (!var4) {
                              break label577;
                           }
                        }

                        if (var67 != var68) {
                           if (var42 == var68) {
                              var48 = var31;
                           } else {
                              var48 = var50;
                           }
                        } else {
                           var48 = var31;
                        }

                        if (!(var67 instanceof bzi)) {
                           if (var42 instanceof bzi) {
                              var48 = 5;
                           }
                        } else {
                           var48 = 5;
                        }

                        if (!(var67 instanceof bzb)) {
                           if (var42 instanceof bzb) {
                              var48 = 5;
                           }
                        } else {
                           var48 = 5;
                        }

                        if (var20) {
                           var48 = 5;
                        }

                        var12 = Math.max(var48, var50);
                     }
                  } else {
                     var12 = var50;
                  }

                  var8 = var12;
                  if (var2) {
                     var12 = Math.min(var49, var12);
                     var8 = var12;
                     if (var17) {
                        var8 = var12;
                        if (!var20) {
                           if (var67 != var68) {
                              var8 = var12;
                              if (var42 == var68) {
                                 var8 = 4;
                              }
                           } else {
                              var8 = 4;
                           }
                        }
                     }
                  }

                  var1.m(var40, var39, var10.b(), var8);
                  var1.m(var35, var38, -var11.b(), var8);
               }

               if (var2) {
                  if (var6 == var39) {
                     var8 = var10.b();
                  } else {
                     var8 = 0;
                  }

                  if (var39 != var6) {
                     var1.g(var40, var6, var8, 5);
                  }
               }

               if (var2 && var62 && var14 == 0 && var23 == 0) {
                  if (var22 == 3) {
                     var1.g(var35, var40, 0, 8);
                     var50 = 5;
                  } else {
                     var50 = 5;
                     var1.g(var35, var40, 0, 5);
                  }
               } else {
                  var50 = 5;
               }
            } else {
               var50 = 5;
               var2 = var3;
            }

            if (var2 && var5) {
               if (var11.f != null) {
                  var12 = var11.b();
               } else {
                  var12 = 0;
               }

               if (var38 != var7) {
                  var1.g(var7, var35, var12, var50);
               }
            }

         } else {
            if (var61 < 2 && var3 && var5) {
               var1.g(var40, var6, 0, 8);
               if (!var2) {
                  if (this.O.f == null) {
                     var46 = true;
                  } else {
                     var46 = false;
                  }
               } else {
                  var46 = true;
               }

               label495: {
                  if (!var2) {
                     bze var43 = this.O.f;
                     if (var43 != null) {
                        var44 = var43.d;
                        if (var44.Y == 0.0F) {
                           return;
                        }

                        int[] var45 = var44.ar;
                        if (var45[0] != 3 || var45[1] != 3) {
                           return;
                        }
                        break label495;
                     }
                  }

                  if (!var46) {
                     return;
                  }
               }

               var1.g(var7, var35, 0, 8);
            }

         }
      }
   }

   public final void A(int var1) {
      this.X = var1;
      int var2 = this.ae;
      if (var1 < var2) {
         this.X = var2;
      }

   }

   protected final void B(int var1, boolean var2) {
      this.U[var1] = var2;
   }

   public final void C(int var1, int var2) {
      this.I = var1;
      this.J = var2;
      this.a = false;
   }

   public final void D(int var1) {
      if (var1 < 0) {
         this.ae = 0;
      } else {
         this.ae = var1;
      }
   }

   public final void E(int var1) {
      if (var1 < 0) {
         this.ad = 0;
      } else {
         this.ad = var1;
      }
   }

   public final void F(int var1) {
      this.W = var1;
      int var2 = this.ad;
      if (var1 < var2) {
         this.W = var2;
      }

   }

   public void G(boolean var1, boolean var2) {
      bzw var10 = this.h;
      boolean var9 = var1 & var10.g;
      bzx var11 = this.i;
      boolean var8 = var2 & var11.g;
      int var6 = var10.h.f;
      int var4 = var11.h.f;
      int var5 = var10.i.f;
      int var7 = var11.i.f;
      int var3;
      if (var5 - var6 >= 0 && var7 - var4 >= 0 && var6 != Integer.MIN_VALUE && var6 != Integer.MAX_VALUE && var4 != Integer.MIN_VALUE && var4 != Integer.MAX_VALUE && var5 != Integer.MIN_VALUE && var5 != Integer.MAX_VALUE && var7 != Integer.MIN_VALUE) {
         var3 = var7;
         if (var7 == Integer.MAX_VALUE) {
            var5 = 0;
            var3 = 0;
            var6 = 0;
            var4 = 0;
         }
      } else {
         var5 = 0;
         var3 = 0;
         var6 = 0;
         var4 = 0;
      }

      if (var9) {
         this.aa = var6;
      }

      if (var8) {
         this.ab = var4;
      }

      if (this.ai == 8) {
         this.W = 0;
         this.X = 0;
      } else {
         if (var9) {
            var7 = var5 - var6;
            var5 = var7;
            if (this.ar[0] == 1) {
               var6 = this.W;
               var5 = var7;
               if (var7 < var6) {
                  var5 = var6;
               }
            }

            this.W = var5;
            var6 = this.ad;
            if (var5 < var6) {
               this.W = var6;
            }
         }

         if (var8) {
            var5 = var3 - var4;
            var3 = var5;
            if (this.ar[1] == 1) {
               var4 = this.X;
               var3 = var5;
               if (var5 < var4) {
                  var3 = var4;
               }
            }

            this.X = var3;
            var4 = this.ae;
            if (var3 < var4) {
               this.X = var4;
            }
         }

      }
   }

   final boolean H() {
      return this instanceof bzl || this instanceof bzi;
   }

   public final boolean I(int var1) {
      byte var2;
      byte var4;
      if (var1 == 0) {
         if (this.K.f != null) {
            var4 = 1;
         } else {
            var4 = 0;
         }

         if (this.M.f != null) {
            var2 = 1;
         } else {
            var2 = 0;
         }

         return var4 + var2 < 2;
      } else {
         if (this.L.f != null) {
            var4 = 1;
         } else {
            var4 = 0;
         }

         if (this.N.f != null) {
            var2 = 1;
         } else {
            var2 = 0;
         }

         byte var3;
         if (this.O.f != null) {
            var3 = 1;
         } else {
            var3 = 0;
         }

         return var4 + var2 + var3 < 2;
      }
   }

   public final boolean J(int var1, int var2) {
      bze var3;
      bze var4;
      if (var1 == 0) {
         var3 = this.K.f;
         if (var3 != null && var3.c) {
            var4 = this.M;
            var3 = var4.f;
            if (var3 != null && var3.c) {
               if (var3.a() - var4.b() - (this.K.f.a() + this.K.b()) >= var2) {
                  return true;
               }

               return false;
            }
         }
      } else {
         var3 = this.L.f;
         if (var3 != null && var3.c) {
            var4 = this.N;
            var3 = var4.f;
            if (var3 != null && var3.c) {
               if (var3.a() - var4.b() - (this.L.f.a() + this.L.b()) >= var2) {
                  return true;
               }

               return false;
            }
         }
      }

      return false;
   }

   public final boolean K() {
      bze var2 = this.K;
      bze var1 = var2.f;
      if (var1 == null || var1.f != var2) {
         var1 = this.M;
         var2 = var1.f;
         if (var2 == null || var2.f != var1) {
            return false;
         }
      }

      return true;
   }

   public final boolean L() {
      bze var1 = this.L;
      bze var2 = var1.f;
      if (var2 == null || var2.f != var1) {
         var2 = this.N;
         var1 = var2.f;
         if (var1 == null || var1.f != var2) {
            return false;
         }
      }

      return true;
   }

   public final boolean M() {
      return this.a && this.ai != 8;
   }

   public final int N(int var1) {
      return var1 == 0 ? this.O() : this.P();
   }

   public final int O() {
      return this.ar[0];
   }

   public final int P() {
      return this.ar[1];
   }

   public final void Q(int var1) {
      this.ar[0] = var1;
   }

   public final void R(int var1) {
      this.ar[1] = var1;
   }

   public void S(boolean var1) {
      int var5 = byv.o(this.K);
      int var4 = byv.o(this.L);
      int var7 = byv.o(this.M);
      int var6 = byv.o(this.N);
      int var3 = var5;
      int var2 = var7;
      bzr var8;
      bzr var11;
      if (var1) {
         bzw var9 = this.h;
         var3 = var5;
         var2 = var7;
         if (var9 != null) {
            var8 = var9.h;
            var3 = var5;
            var2 = var7;
            if (var8.i) {
               var11 = var9.i;
               var3 = var5;
               var2 = var7;
               if (var11.i) {
                  var3 = var8.f;
                  var2 = var11.f;
               }
            }
         }
      }

      if (var1) {
         bzx var12 = this.i;
         if (var12 != null) {
            var8 = var12.h;
            if (var8.i) {
               var11 = var12.i;
               if (var11.i) {
                  var4 = var8.f;
                  var6 = var11.f;
               }
            }
         }
      }

      if (var2 - var3 >= 0 && var6 - var4 >= 0 && var3 != Integer.MIN_VALUE && var3 != Integer.MAX_VALUE && var4 != Integer.MIN_VALUE && var4 != Integer.MAX_VALUE && var2 != Integer.MIN_VALUE && var2 != Integer.MAX_VALUE && var6 != Integer.MIN_VALUE) {
         var5 = var3;
         var3 = var4;
         var4 = var6;
         if (var6 == Integer.MAX_VALUE) {
            var5 = 0;
            var3 = 0;
            var2 = 0;
            var4 = 0;
         }
      } else {
         var5 = 0;
         var3 = 0;
         var2 = 0;
         var4 = 0;
      }

      this.aa = var5;
      this.ab = var3;
      if (this.ai == 8) {
         this.W = 0;
         this.X = 0;
      } else {
         var6 = var2 - var5;
         int[] var10 = this.ar;
         var7 = var10[0];
         var5 = var7;
         var2 = var6;
         if (var7 == 1) {
            var2 = this.W;
            if (var6 < var2) {
               var5 = 1;
            } else {
               var5 = 1;
               var2 = var6;
            }
         }

         var4 -= var3;
         var3 = var4;
         if (var10[1] == 1) {
            var6 = this.X;
            var3 = var4;
            if (var4 < var6) {
               var3 = var6;
            }
         }

         this.W = var2;
         this.X = var3;
         var4 = this.ae;
         if (var3 < var4) {
            this.X = var4;
         }

         var4 = this.ad;
         if (var2 < var4) {
            this.W = var4;
         } else {
            var4 = var2;
         }

         var6 = this.x;
         if (var6 > 0 && var5 == 3) {
            this.W = Math.min(var4, var6);
         }

         var4 = this.A;
         if (var4 > 0 && this.ar[1] == 3) {
            this.X = Math.min(this.X, var4);
         }

         var4 = this.W;
         if (var2 != var4) {
            this.k = var4;
         }

         var2 = this.X;
         if (var3 != var2) {
            this.l = var2;
         }

      }
   }

   public void T(AmbientDelegate var1) {
      this.K.i();
      this.L.i();
      this.M.i();
      this.N.i();
      this.O.i();
      this.R.i();
      this.P.i();
      this.Q.i();
   }

   public void b(byv var1, boolean var2) {
      boolean var24;
      boolean var25;
      boolean var26;
      bzf var36;
      byz var38;
      byz var39;
      byz var40;
      byz var41;
      byz var42;
      int[] var53;
      label564: {
         label563: {
            var40 = var1.b(this.K);
            var39 = var1.b(this.M);
            var41 = var1.b(this.L);
            var38 = var1.b(this.N);
            var42 = var1.b(this.O);
            var36 = this.V;
            if (var36 != null) {
               var53 = var36.ar;
               if (var53[0] == 2) {
                  var24 = true;
               } else {
                  var24 = false;
               }

               if (var53[1] == 2) {
                  var25 = true;
               } else {
                  var25 = false;
               }

               switch(this.s) {
               case 1:
                  var25 = var24;
                  var24 = false;
                  break label564;
               case 2:
                  var24 = var25;
                  break label563;
               case 3:
                  break;
               default:
                  var26 = var25;
                  var25 = var24;
                  var24 = var26;
                  break label564;
               }
            }

            var24 = false;
         }

         var25 = false;
      }

      int var11;
      int var12;
      boolean[] var54;
      if (this.ai == 8) {
         var12 = this.T.size();
         var11 = 0;

         while(true) {
            if (var11 >= var12) {
               var54 = this.U;
               if (!var54[0] && !var54[1]) {
                  return;
               }
               break;
            }

            if (((bze)this.T.get(var11)).g()) {
               break;
            }

            ++var11;
         }
      }

      bze var67;
      label590: {
         bze var37;
         WeakReference var43;
         bzg var55;
         WeakReference var56;
         if (!this.b) {
            if (!this.n) {
               break label590;
            }
         } else {
            var1.f(var40, this.aa);
            var1.f(var39, this.aa + this.W);
            if (var25) {
               var36 = this.V;
               if (var36 != null) {
                  var37 = this.K;
                  var55 = (bzg)var36;
                  var43 = var55.aD;
                  if (var43 == null || var43.get() == null || var37.a() > ((bze)var55.aD.get()).a()) {
                     var55.aD = new WeakReference(var37);
                  }

                  var67 = this.M;
                  var56 = var55.aF;
                  if (var56 == null || var56.get() == null || var67.a() > ((bze)var55.aF.get()).a()) {
                     var55.aF = new WeakReference(var67);
                  }
               }
            }
         }

         if (this.n) {
            var1.f(var41, this.ab);
            var1.f(var38, this.ab + this.X);
            if (this.O.g()) {
               var1.f(var42, this.ab + this.ac);
            }

            if (var24) {
               var36 = this.V;
               if (var36 != null) {
                  var37 = this.L;
                  var55 = (bzg)var36;
                  var43 = var55.aC;
                  if (var43 == null || var43.get() == null || var37.a() > ((bze)var55.aC.get()).a()) {
                     var55.aC = new WeakReference(var37);
                  }

                  var67 = this.N;
                  var56 = var55.aE;
                  if (var56 == null || var56.get() == null || var67.a() > ((bze)var55.aE.get()).a()) {
                     var55.aE = new WeakReference(var67);
                  }
               }
            }
         }

         if (this.b && this.n) {
            this.b = false;
            this.n = false;
            return;
         }
      }

      byw var57 = byv.b;
      if (var57 != null) {
         ++var57.A;
      }

      bzw var58;
      if (var2) {
         var58 = this.h;
         if (var58 != null) {
            bzx var69 = this.i;
            if (var69 != null) {
               bzr var44 = var58.h;
               if (var44.i && var58.i.i && var69.h.i && var69.i.i) {
                  if (var57 != null) {
                     ++var57.t;
                  }

                  var1.f(var40, var44.f);
                  var1.f(var39, this.h.i.f);
                  var1.f(var41, this.i.h.f);
                  var1.f(var38, this.i.i.f);
                  var1.f(var42, this.i.a.f);
                  if (this.V != null) {
                     if (var25 && this.j[0] && !this.K()) {
                        var1.g(var1.b(this.V.M), var39, 0, 8);
                     }

                     if (var24 && this.j[1] && !this.L()) {
                        var1.g(var1.b(this.V.N), var38, 0, 8);
                     }
                  }

                  this.b = false;
                  this.n = false;
                  return;
               }
            }
         }
      }

      if (var57 != null) {
         ++var57.u;
      }

      boolean var27;
      boolean var28;
      boolean var29;
      if (this.V != null) {
         if (this.a(0)) {
            ((bzg)this.V).a(this, 0);
            var26 = true;
         } else {
            var26 = this.K();
         }

         if (this.a(1)) {
            ((bzg)this.V).a(this, 1);
            var27 = true;
         } else {
            var27 = this.L();
         }

         if (!var26 && var25 && this.ai != 8 && this.K.f == null && this.M.f == null) {
            var1.g(var1.b(this.V.M), var39, 0, 1);
         }

         if (!var27 && var24 && this.ai != 8 && this.L.f == null && this.N.f == null && this.O == null) {
            var1.g(var1.b(this.V.N), var38, 0, 1);
         }

         var29 = var27;
         var28 = var26;
      } else {
         var29 = false;
         var28 = false;
      }

      int var21 = this.W;
      var11 = this.ad;
      var12 = var11;
      if (var21 >= var11) {
         var12 = var21;
      }

      int var22 = this.X;
      var11 = this.ae;
      int var13 = var11;
      if (var22 >= var11) {
         var13 = var22;
      }

      var53 = this.ar;
      int var16 = var53[0];
      boolean var18;
      if (var16 != 3) {
         var18 = true;
      } else {
         var18 = false;
      }

      int var23 = var53[1];
      boolean var19;
      if (var23 != 3) {
         var19 = true;
      } else {
         var19 = false;
      }

      int var17 = this.Z;
      this.C = var17;
      float var10 = this.Y;
      this.D = var10;
      int var14 = this.t;
      int var20 = this.u;
      float var9;
      int var15;
      boolean var46;
      int var50;
      if (var10 > 0.0F && this.ai != 8) {
         label596: {
            var11 = var14;
            var15 = var16;
            if (var16 == 3) {
               if (var14 == 0) {
                  var11 = 3;
                  var15 = 3;
               } else {
                  var15 = 3;
                  var11 = var14;
               }
            }

            var14 = var20;
            var16 = var23;
            if (var23 == 3) {
               if (var20 == 0) {
                  var14 = 3;
                  var16 = 3;
               } else {
                  var16 = 3;
                  var14 = var20;
               }
            }

            if (var15 == 3 && var16 == 3 && var11 == 3) {
               if (var14 == 3) {
                  label578: {
                     label579: {
                        if (var17 == -1) {
                           if (!var18 || var19) {
                              if (!var18 && var19) {
                                 this.C = 1;
                                 this.D = 1.0F / var10;
                              }
                              break label579;
                           }

                           this.C = 0;
                        } else if (var17 != 0) {
                           break label579;
                        }

                        if (!this.L.h() || !this.N.h()) {
                           this.C = 1;
                           break label578;
                        }
                     }

                     if (this.C == 1 && (!this.K.h() || !this.M.h())) {
                        this.C = 0;
                     }
                  }

                  if (this.C == -1 && (!this.L.h() || !this.N.h() || !this.K.h() || !this.M.h())) {
                     if (this.L.h() && this.N.h()) {
                        this.C = 0;
                     } else if (this.K.h() && this.M.h()) {
                        this.D = 1.0F / this.D;
                        this.C = 1;
                     }
                  }

                  label445: {
                     var15 = this.C;
                     if (var15 == -1) {
                        var16 = this.w;
                        if (var16 > 0 && this.z == 0) {
                           this.C = 0;
                           var15 = var14;
                           var16 = var11;
                           var11 = var13;
                           var14 = 0;
                           var17 = 0;
                           var46 = true;
                           break label596;
                        }

                        if (var16 == 0 && this.z > 0) {
                           this.D = 1.0F / this.D;
                           this.C = 1;
                           var15 = 1;
                           var17 = 1;
                           break label445;
                        }
                     }

                     var17 = var15;
                  }

                  var16 = var11;
                  var50 = var14;
                  var11 = var13;
                  var46 = true;
                  var14 = var15;
                  var15 = var50;
                  break label596;
               }

               var50 = 3;
            } else {
               var50 = var11;
            }

            boolean var48;
            if (var15 == 3 && var50 == 3) {
               this.C = 0;
               var12 = (int)(var10 * (float)var22);
               var15 = var14;
               if (var16 != 3) {
                  var48 = false;
                  var16 = 4;
               } else {
                  boolean var49 = true;
                  var16 = var11;
                  var48 = var49;
               }

               var17 = 0;
               var14 = 0;
               var46 = var48;
               var11 = var13;
            } else {
               label597: {
                  if (var16 == 3 && var14 == 3) {
                     this.C = 1;
                     var9 = var10;
                     if (var17 == -1) {
                        var9 = 1.0F / var10;
                        this.D = var9;
                     }

                     var13 = (int)(var9 * (float)var21);
                     if (var15 != 3) {
                        var16 = var11;
                        var14 = 1;
                        var17 = 1;
                        var46 = false;
                        byte var51 = 4;
                        var11 = var13;
                        var15 = var51;
                        break label597;
                     }

                     var15 = var13;
                     var13 = 1;
                     var17 = 1;
                  } else {
                     var15 = var13;
                     var13 = var17;
                  }

                  var16 = var11;
                  var50 = var14;
                  var48 = true;
                  var14 = var13;
                  var46 = var48;
                  var11 = var15;
                  var15 = var50;
               }
            }
         }
      } else {
         var15 = var20;
         var16 = var14;
         var14 = var17;
         var11 = var13;
         var46 = false;
      }

      label422: {
         var53 = this.v;
         var53[0] = var16;
         var53[1] = var15;
         if (var46) {
            if (var17 == 0) {
               var27 = true;
               break label422;
            }

            if (var17 == -1) {
               var27 = true;
               break label422;
            }
         }

         var27 = false;
      }

      label415: {
         if (var46) {
            if (var14 == 1) {
               var26 = true;
               break label415;
            }

            if (var14 == -1) {
               var26 = true;
               break label415;
            }
         }

         var26 = false;
      }

      boolean var30;
      if (this.ar[0] == 2 && this instanceof bzg) {
         var30 = true;
      } else {
         var30 = false;
      }

      if (var30) {
         var12 = 0;
      }

      boolean var32 = this.R.h() ^ true;
      var54 = this.U;
      boolean var35 = var54[0];
      boolean var33 = var54[1];
      boolean var31;
      bzf var59;
      byz var60;
      byz var62;
      if (this.q != 2 && !this.b) {
         label582: {
            if (var2) {
               var58 = this.h;
               if (var58 != null) {
                  bzr var61 = var58.h;
                  if (var61.i && var58.i.i) {
                     var1.f(var40, var61.f);
                     var1.f(var39, this.h.i.f);
                     if (this.V != null && var25 && this.j[0] && !this.K()) {
                        var1.g(var1.b(this.V.M), var39, 0, 8);
                     }
                     break label582;
                  }
               }
            }

            var36 = this.V;
            if (var36 != null) {
               var62 = var1.b(var36.M);
            } else {
               var62 = null;
            }

            var59 = this.V;
            if (var59 != null) {
               var60 = var1.b(var59.K);
            } else {
               var60 = null;
            }

            boolean var34 = this.j[0];
            int[] var71 = this.ar;
            var14 = var71[0];
            bze var70 = this.K;
            bze var45 = this.M;
            var17 = this.aa;
            int var52 = this.ad;
            var50 = this.E[0];
            var9 = this.af;
            if (var71[1] == 3) {
               var31 = true;
            } else {
               var31 = false;
            }

            this.c(var1, true, var25, var24, var34, var60, var62, var14, var30, var70, var45, var17, var12, var52, var50, var9, var27, var31, var28, var29, var35, var16, var15, this.w, this.x, this.y, var32);
         }
      }

      boolean var47;
      label393: {
         if (var2) {
            bzx var65 = this.i;
            if (var65 != null) {
               bzr var63 = var65.h;
               if (var63.i && var65.i.i) {
                  var12 = var63.f;
                  var1.f(var41, var12);
                  var12 = this.i.i.f;
                  var1.f(var38, var12);
                  var1.f(var42, this.i.a.f);
                  var36 = this.V;
                  if (var36 != null && !var29 && var24 && this.j[1]) {
                     var1.g(var1.b(var36.N), var38, 0, 8);
                     var47 = false;
                  } else {
                     var47 = false;
                  }
                  break label393;
               }
            }
         }

         var47 = true;
      }

      if (this.r != 2 && var47 && !this.n) {
         if (this.ar[1] == 2 && this instanceof bzg) {
            var27 = true;
         } else {
            var27 = false;
         }

         if (var27) {
            var11 = 0;
         }

         var36 = this.V;
         if (var36 != null) {
            var62 = var1.b(var36.N);
         } else {
            var62 = null;
         }

         var59 = this.V;
         if (var59 != null) {
            var60 = var1.b(var59.L);
         } else {
            var60 = null;
         }

         label599: {
            var12 = this.ac;
            if (var12 > 0 || this.ai == 8) {
               var67 = this.O;
               if (var67.f != null) {
                  var1.m(var42, var41, var12, 8);
                  var1.m(var42, var1.b(this.O.f), this.O.b(), 8);
                  if (var24) {
                     var1.g(var62, var1.b(this.N), 0, 5);
                     var2 = false;
                  } else {
                     var2 = false;
                  }
                  break label599;
               }

               if (this.ai == 8) {
                  var1.m(var42, var41, var67.b(), 8);
               } else {
                  var1.m(var42, var41, var12, 8);
               }
            }

            var2 = var32;
         }

         var31 = this.j[1];
         int[] var72 = this.ar;
         var17 = var72[1];
         bze var66 = this.L;
         var67 = this.N;
         var14 = this.ab;
         var12 = this.ae;
         var50 = this.E[1];
         var9 = this.ag;
         if (var72[0] == 3) {
            var30 = true;
         } else {
            var30 = false;
         }

         this.c(var1, false, var24, var25, var31, var60, var62, var17, var27, var66, var67, var14, var11, var12, var50, var9, var26, var30, var29, var28, var33, var15, var16, this.z, this.A, this.B, var2);
      }

      if (var46) {
         if (this.C == 1) {
            var1.n(var38, var41, var39, var40, this.D);
         } else {
            var1.n(var39, var40, var38, var41, this.D);
         }
      }

      if (this.R.h()) {
         bzf var74 = this.R.f.d;
         var9 = (float)Math.toRadians((double)(this.F + 90.0F));
         var11 = this.R.b();
         bze var68 = this.m(bzd.b);
         var38 = var1.b(var68);
         var41 = var1.b(this.m(bzd.c));
         var60 = var1.b(this.m(bzd.d));
         var40 = var1.b(this.m(bzd.e));
         var39 = var1.b(var74.m(bzd.b));
         var42 = var1.b(var74.m(bzd.c));
         var62 = var1.b(var74.m(bzd.d));
         byz var75 = var1.b(var74.m(bzd.e));
         byu var73 = var1.a();
         double var3 = (double)var11;
         double var5 = (double)var9;
         double var7 = Math.sin(var5);
         Double.isNaN(var3);
         var73.j(var41, var40, var42, var75, (float)(var7 * var3));
         var1.e(var73);
         byu var64 = var1.a();
         var5 = Math.cos(var5);
         Double.isNaN(var3);
         var64.j(var38, var60, var39, var62, (float)(var5 * var3));
         var1.e(var64);
      }

      this.b = false;
      this.n = false;
      if (byv.b != null) {
         var11 = var1.j;
         var11 = var1.e;
      }

   }

   public boolean d() {
      return this.ai != 8;
   }

   public boolean e() {
      boolean var3 = this.b;
      boolean var2 = true;
      boolean var1 = var2;
      if (!var3) {
         if (this.K.c) {
            if (!this.M.c) {
               return false;
            }

            var1 = var2;
         } else {
            var1 = false;
         }
      }

      return var1;
   }

   public boolean f() {
      boolean var3 = this.n;
      boolean var2 = true;
      boolean var1 = var2;
      if (!var3) {
         if (this.L.c) {
            if (!this.N.c) {
               return false;
            }

            var1 = var2;
         } else {
            var1 = false;
         }
      }

      return var1;
   }

   public final int g() {
      return this.l() + this.X;
   }

   public final int h() {
      return this.ai == 8 ? 0 : this.X;
   }

   public final int i() {
      return this.k() + this.W;
   }

   public final int j() {
      return this.ai == 8 ? 0 : this.W;
   }

   public final int k() {
      bzf var1 = this.V;
      return var1 != null ? ((bzg)var1).at + this.aa : this.aa;
   }

   public final int l() {
      bzf var1 = this.V;
      return var1 != null ? ((bzg)var1).au + this.ab : this.ab;
   }

   public bze m(bzd var1) {
      bzd var2 = bzd.a;
      switch(var1.ordinal()) {
      case 0:
         return null;
      case 1:
         return this.K;
      case 2:
         return this.L;
      case 3:
         return this.M;
      case 4:
         return this.N;
      case 5:
         return this.O;
      case 6:
         return this.R;
      case 7:
         return this.P;
      case 8:
         return this.Q;
      default:
         throw new AssertionError(var1.name());
      }
   }

   public final bzf n(int var1) {
      bze var2;
      bze var3;
      if (var1 == 0) {
         var2 = this.M;
         var3 = var2.f;
         if (var3 != null && var3.f == var2) {
            return var3.d;
         }
      } else if (var1 == 1) {
         var3 = this.N;
         var2 = var3.f;
         if (var2 != null && var2.f == var3) {
            return var2.d;
         }
      }

      return null;
   }

   public final bzf o(int var1) {
      bze var2;
      bze var3;
      if (var1 == 0) {
         var3 = this.K;
         var2 = var3.f;
         if (var2 != null && var2.f == var3) {
            return var2.d;
         }
      } else if (var1 == 1) {
         var3 = this.L;
         var2 = var3.f;
         if (var2 != null && var2.f == var3) {
            return var2.d;
         }
      }

      return null;
   }

   public final bzz p(int var1) {
      if (var1 == 0) {
         return this.h;
      } else {
         return var1 == 1 ? this.i : null;
      }
   }

   public final void q(bzg var1, byv var2, HashSet var3, int var4, boolean var5) {
      if (var5) {
         if (!var3.contains(this)) {
            return;
         }

         bzk.a(var1, var2, this);
         var3.remove(this);
         this.b(var2, var1.Y(64));
      }

      HashSet var6;
      Iterator var10;
      if (var4 == 0) {
         var6 = this.K.a;
         if (var6 != null) {
            var10 = var6.iterator();

            while(var10.hasNext()) {
               ((bze)var10.next()).d.q(var1, var2, var3, 0, true);
            }
         }

         var6 = this.M.a;
         if (var6 != null) {
            var10 = var6.iterator();

            while(var10.hasNext()) {
               ((bze)var10.next()).d.q(var1, var2, var3, 0, true);
            }
         }
      } else {
         var6 = this.L.a;
         if (var6 != null) {
            var10 = var6.iterator();

            while(var10.hasNext()) {
               ((bze)var10.next()).d.q(var1, var2, var3, 1, true);
            }
         }

         var6 = this.N.a;
         if (var6 != null) {
            var10 = var6.iterator();

            while(var10.hasNext()) {
               ((bze)var10.next()).d.q(var1, var2, var3, 1, true);
            }
         }

         var6 = this.O.a;
         if (var6 != null) {
            var10 = var6.iterator();

            while(var10.hasNext()) {
               bzf var7 = ((bze)var10.next()).d;

               try {
                  var7.q(var1, var2, var3, 1, true);
               } finally {
                  ;
               }
            }
         }
      }

   }

   public final void r(byv var1) {
      var1.b(this.K);
      var1.b(this.L);
      var1.b(this.M);
      var1.b(this.N);
      if (this.ac > 0) {
         var1.b(this.O);
      }

   }

   public final void s() {
      if (this.h == null) {
         this.h = new bzw(this);
      }

      if (this.i == null) {
         this.i = new bzx(this);
      }

   }

   public void t(StringBuilder var1) {
      StringBuilder var10 = new StringBuilder();
      var10.append("  ");
      var10.append(this.m);
      var10.append(":{\n");
      var1.append(var10.toString());
      var10 = new StringBuilder();
      var10.append("    actualWidth:");
      var10.append(this.W);
      var1.append(var10.toString());
      String var12 = DHwXNavBkqbhR.xLngECcS;
      var1.append(var12);
      StringBuilder var11 = new StringBuilder();
      var11.append("    actualHeight:");
      var11.append(this.X);
      var1.append(var11.toString());
      var1.append(var12);
      var11 = new StringBuilder();
      var11.append("    actualLeft:");
      var11.append(this.aa);
      var1.append(var11.toString());
      var1.append(var12);
      var11 = new StringBuilder();
      var11.append("    actualTop:");
      var11.append(this.ab);
      var1.append(var11.toString());
      var1.append(var12);
      U(var1, "left", this.K);
      U(var1, "top", this.L);
      U(var1, "right", this.M);
      U(var1, "bottom", this.N);
      U(var1, "baseline", this.O);
      U(var1, "centerX", this.P);
      U(var1, "centerY", this.Q);
      int var8 = this.W;
      int var9 = this.ad;
      int var6 = this.E[0];
      int var7 = this.w;
      int var4 = this.t;
      float var2 = this.y;
      int var5 = this.ar[0];
      float var3 = this.am[0];
      X(var1, "    width", var8, var9, var6, var7, var4, var2, var5);
      var8 = this.X;
      var7 = this.ae;
      var9 = this.E[1];
      var4 = this.z;
      var6 = this.u;
      var2 = this.B;
      var5 = this.ar[1];
      var3 = this.am[1];
      X(var1, "    height", var8, var7, var9, var4, var6, var2, var5);
      var2 = this.Y;
      var4 = this.Z;
      if (var2 != 0.0F) {
         var1.append("    dimensionRatio :  [");
         var1.append(var2);
         var1.append(",");
         var1.append(var4);
         var1.append("],\n");
      }

      V(var1, "    horizontalBias", this.af, 0.5F);
      V(var1, "    verticalBias", this.ag, 0.5F);
      W(var1, "    horizontalChainStyle", this.ak, 0);
      W(var1, "    verticalChainStyle", this.al, 0);
      var1.append("  }");
   }

   public String toString() {
      StringBuilder var2 = new StringBuilder();
      String var1 = "";
      var2.append("");
      if (this.aj != null) {
         StringBuilder var3 = new StringBuilder();
         var3.append("id: ");
         var3.append(this.aj);
         var3.append(" ");
         var1 = var3.toString();
      }

      var2.append(var1);
      var2.append("(");
      var2.append(this.aa);
      var2.append(", ");
      var2.append(this.ab);
      var2.append(") - (");
      var2.append(this.W);
      var2.append(" x ");
      var2.append(this.X);
      var2.append(")");
      return var2.toString();
   }

   public final void u(bzd var1, bzf var2, bzd var3, int var4, int var5) {
      this.m(var1).j(var2.m(var3), var4, var5);
   }

   public void v() {
      this.K.d();
      this.L.d();
      this.M.d();
      this.N.d();
      this.O.d();
      this.P.d();
      this.Q.d();
      this.R.d();
      this.V = null;
      this.F = Float.NaN;
      this.W = 0;
      this.X = 0;
      this.Y = 0.0F;
      this.Z = -1;
      this.aa = 0;
      this.ab = 0;
      this.ac = 0;
      this.ad = 0;
      this.ae = 0;
      this.af = 0.5F;
      this.ag = 0.5F;
      int[] var1 = this.ar;
      var1[0] = 1;
      var1[1] = 1;
      this.ah = null;
      this.ai = 0;
      this.ak = 0;
      this.al = 0;
      float[] var2 = this.am;
      var2[0] = -1.0F;
      var2[1] = -1.0F;
      this.q = -1;
      this.r = -1;
      var1 = this.E;
      var1[0] = Integer.MAX_VALUE;
      var1[1] = Integer.MAX_VALUE;
      this.t = 0;
      this.u = 0;
      this.y = 1.0F;
      this.B = 1.0F;
      this.x = Integer.MAX_VALUE;
      this.A = Integer.MAX_VALUE;
      this.w = 0;
      this.z = 0;
      this.C = -1;
      this.D = 1.0F;
      boolean[] var3 = this.j;
      var3[0] = true;
      var3[1] = true;
      this.H = false;
      var3 = this.U;
      var3[0] = false;
      var3[1] = false;
      this.a = true;
      var1 = this.v;
      var1[0] = 0;
      var1[1] = 0;
      this.k = -1;
      this.l = -1;
   }

   public final void w() {
      this.b = false;
      this.n = false;
      this.o = false;
      this.p = false;
      int var2 = this.T.size();

      for(int var1 = 0; var1 < var2; ++var1) {
         bze var3 = (bze)this.T.get(var1);
         var3.c = false;
         var3.b = 0;
      }

   }

   public final void x(int var1) {
      this.ac = var1;
      boolean var2;
      if (var1 > 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.G = var2;
   }

   public final void y(int var1, int var2) {
      if (!this.b) {
         this.K.e(var1);
         this.M.e(var2);
         this.aa = var1;
         this.W = var2 - var1;
         this.b = true;
      }
   }

   public final void z(int var1, int var2) {
      if (!this.n) {
         this.L.e(var1);
         this.N.e(var2);
         this.ab = var1;
         this.X = var2 - var1;
         if (this.G) {
            this.O.e(var1 + this.ac);
         }

         this.n = true;
      }
   }
}
