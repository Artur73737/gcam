import java.util.ArrayList;
import java.util.Arrays;

public final class an extends ar {
   protected final aj af = new aj();
   int ag;
   int ah;
   public int ai = 2;
   public boolean aj = false;
   public boolean ak = false;
   private aq am;
   private int an = 0;
   private int ao = 0;
   private am[] ap = new am[4];
   private am[] aq = new am[4];
   private am[] ar = new am[4];
   private final boolean[] as = new boolean[3];
   private final am[] at = new am[4];

   private final int G(aj var1, am[] var2, am var3, int var4, boolean[] var5) {
      var5[0] = true;
      var5[1] = false;
      var2[0] = null;
      var2[2] = null;
      var2[1] = null;
      var2[3] = null;
      int var6;
      int var7;
      boolean var8;
      boolean var9;
      al var10;
      am var11;
      am var12;
      am var13;
      am var14;
      al var18;
      am var19;
      al var20;
      am[] var21;
      if (var4 == 0) {
         var10 = var3.i.b;
         if (var10 != null && var10.a != this) {
            var8 = false;
         } else {
            var8 = true;
         }

         var3.ab = null;
         if (var3.K != 8) {
            var11 = var3;
         } else {
            var11 = null;
         }

         var19 = var3;
         var14 = null;
         var12 = var11;
         var4 = 0;

         am var15;
         while(true) {
            var13 = var11;
            var15 = var12;
            var6 = var4;
            if (var19.k.b == null) {
               break;
            }

            var19.ab = null;
            if (var19.K != 8) {
               var13 = var11;
               if (var11 == null) {
                  var13 = var19;
               }

               if (var12 != null && var12 != var19) {
                  var12.ab = var19;
               }

               var12 = var19;
               var11 = var13;
            } else {
               var20 = var19.i;
               var1.n(var20.f, var20.b.f, 0, 5);
               var1.n(var19.k.f, var19.i.f, 0, 5);
            }

            var7 = var4;
            if (var19.K != 8) {
               var7 = var4;
               if (var19.ad == 3) {
                  if (var19.ae == 3) {
                     var5[0] = false;
                  }

                  var7 = var4;
                  if (var19.u <= 0.0F) {
                     var5[0] = false;
                     var7 = var4 + 1;
                     var21 = this.ap;
                     var6 = var21.length;
                     if (var7 >= var6) {
                        this.ap = (am[])Arrays.copyOf(var21, var6 + var6);
                     }

                     this.ap[var4] = var19;
                  }
               }
            }

            am var16 = var19.k.b.a;
            al var17 = var16.i.b;
            if (var17 == null) {
               var13 = var11;
               var15 = var12;
               var6 = var7;
               break;
            }

            var13 = var11;
            var15 = var12;
            var6 = var7;
            if (var17.a != var19) {
               break;
            }

            var13 = var11;
            var15 = var12;
            var6 = var7;
            if (var16 == var19) {
               break;
            }

            var14 = var16;
            var19 = var16;
            var4 = var7;
         }

         var18 = var19.k.b;
         var9 = var8;
         if (var18 != null) {
            var9 = var8;
            if (var18.a != this) {
               var9 = false;
            }
         }

         if (var3.i.b == null || var14.k.b == null) {
            var5[1] = true;
         }

         var3.X = var9;
         var14.ab = null;
         var2[0] = var3;
         var2[2] = var13;
         var2[1] = var14;
         var2[3] = var15;
         var4 = var6;
      } else {
         var10 = var3.j.b;
         if (var10 != null && var10.a != this) {
            var8 = false;
         } else {
            var8 = true;
         }

         var3.ac = null;
         if (var3.K != 8) {
            var11 = var3;
         } else {
            var11 = null;
         }

         var19 = var3;
         var12 = var11;
         var14 = null;

         for(var4 = 0; var19.l.b != null; var4 = var6) {
            var19.ac = null;
            if (var19.K != 8) {
               var13 = var11;
               if (var11 == null) {
                  var13 = var19;
               }

               if (var12 != null && var12 != var19) {
                  var12.ac = var19;
               }

               var12 = var19;
               var11 = var13;
            } else {
               var20 = var19.j;
               var1.n(var20.f, var20.b.f, 0, 5);
               var1.n(var19.l.f, var19.j.f, 0, 5);
            }

            if (var19.K != 8) {
               if (var19.ae == 3) {
                  if (var19.ad == 3) {
                     var5[0] = false;
                  }

                  var6 = var4;
                  if (var19.u <= 0.0F) {
                     var5[0] = false;
                     var6 = var4 + 1;
                     var21 = this.ap;
                     var7 = var21.length;
                     if (var6 >= var7) {
                        this.ap = (am[])Arrays.copyOf(var21, var7 + var7);
                     }

                     this.ap[var4] = var19;
                  }
               } else {
                  var6 = var4;
               }
            } else {
               var6 = var4;
            }

            var13 = var19.l.b.a;
            al var22 = var13.j.b;
            if (var22 == null || var22.a != var19 || var13 == var19) {
               var4 = var6;
               break;
            }

            var14 = var13;
            var19 = var13;
         }

         var18 = var19.l.b;
         var9 = var8;
         if (var18 != null) {
            var9 = var8;
            if (var18.a != this) {
               var9 = false;
            }
         }

         if (var3.j.b == null || var14.l.b == null) {
            var5[1] = true;
         }

         var3.Y = var9;
         var14.ac = null;
         var2[0] = var3;
         var2[2] = var11;
         var2[1] = var14;
         var2[3] = var12;
      }

      return var4;
   }

   private final void H(aj var1) {
      int var7 = 0;

      while(true) {
         boolean var8 = false;
         if (var7 >= this.an) {
            return;
         }

         am var17 = this.ar[var7];
         int var12 = this.G(var1, this.at, var17, 0, this.as);
         am var15 = this.at[2];
         if (var15 != null) {
            boolean[] var16 = this.as;
            int var25;
            am var32;
            if (var16[1]) {
               for(var25 = var17.b(); var15 != null; var15 = var32) {
                  var1.h(var15.i.f, var25);
                  var32 = var15.ab;
                  var25 += var15.i.a() + var15.h() + var15.k.a();
               }
            } else {
               int var11 = var17.V;
               boolean var10;
               if (var11 == 0) {
                  var10 = true;
               } else {
                  var10 = false;
               }

               boolean var9;
               if (var11 == 2) {
                  var9 = true;
               } else {
                  var9 = false;
               }

               int var14 = this.ad;
               int var13 = this.ai;
               float var2 = 0.0F;
               am var18;
               int var27;
               int var28;
               ak var31;
               al var33;
               al var34;
               if ((var13 == 2 || var13 == 8) && var16[0] && var17.X && !var9 && var14 != 2 && var11 == 0) {
                  var15 = var17;
                  var18 = null;
                  var11 = 0;
                  float var3 = 0.0F;
                  var27 = 0;

                  label354:
                  while(true) {
                     if (var15 == null) {
                        if (var18 != null) {
                           var34 = var18.k.b;
                           if (var34 != null) {
                              var28 = var34.a.w;
                           } else {
                              var28 = 0;
                           }

                           var25 = var28;
                           if (var34 != null) {
                              var25 = var28;
                              if (var34.a == this) {
                                 var25 = this.g();
                              }
                           }
                        } else {
                           var25 = 0;
                        }

                        var2 = (float)var27;
                        float var6 = (float)var25 - var2;
                        float var4;
                        if (var12 == 0) {
                           var2 = var6 / (float)(var11 + 1);
                           var4 = var2;
                        } else {
                           var4 = var6 / (float)var12;
                           var2 = 0.0F;
                        }

                        while(true) {
                           if (var17 == null) {
                              break label354;
                           }

                           var34 = var17.i;
                           if (var34.b != null) {
                              var25 = var34.a();
                           } else {
                              var25 = 0;
                           }

                           var34 = var17.k;
                           if (var34.b != null) {
                              var28 = var34.a();
                           } else {
                              var28 = 0;
                           }

                           float var5;
                           if (var17.K != 8) {
                              var5 = (float)var25;
                              var2 += var5;
                              var1.h(var17.i.f, (int)(var2 + 0.5F));
                              if (var17.ad == 3) {
                                 if (var3 == 0.0F) {
                                    var2 += var4 - var5 - (float)var28;
                                 } else {
                                    var2 += var17.Z * var6 / var3 - var5 - (float)var28;
                                 }
                              } else {
                                 var2 += (float)var17.h();
                              }

                              var1.h(var17.k.f, (int)(var2 + 0.5F));
                              var5 = var2;
                              if (var12 == 0) {
                                 var5 = var2 + var4;
                              }

                              var2 = var5 + (float)var28;
                           } else {
                              var5 = var4 / 2.0F;
                              var31 = var17.i.f;
                              var25 = (int)(var2 - var5 + 0.5F);
                              var1.h(var31, var25);
                              var1.h(var17.k.f, var25);
                           }

                           var34 = var17.k.b;
                           if (var34 != null) {
                              var15 = var34.a;
                           } else {
                              var15 = null;
                           }

                           label335: {
                              if (var15 != null) {
                                 var33 = var15.i.b;
                                 if (var33 != null && var33.a != var17) {
                                    var32 = null;
                                    break label335;
                                 }
                              }

                              var32 = var15;
                           }

                           var15 = var32;
                           if (var32 == this) {
                              var15 = null;
                           }

                           var17 = var15;
                        }
                     }

                     if (var15.K != 8) {
                        ++var11;
                        if (var15.ad != 3) {
                           var13 = var15.h();
                           var33 = var15.i;
                           if (var33.b != null) {
                              var25 = var33.a();
                           } else {
                              var25 = 0;
                           }

                           var33 = var15.k;
                           if (var33.b != null) {
                              var28 = var33.a();
                           } else {
                              var28 = 0;
                           }

                           var27 = var27 + var13 + var25 + var28;
                        } else {
                           var3 += var15.Z;
                        }
                     }

                     var33 = var15.k.b;
                     if (var33 != null) {
                        var18 = var33.a;
                     } else {
                        var18 = null;
                     }

                     var32 = var18;
                     if (var18 != null) {
                        label435: {
                           al var42 = var18.i.b;
                           if (var42 != null) {
                              var32 = var18;
                              if (var42.a == var15) {
                                 break label435;
                              }
                           }

                           var32 = null;
                        }
                     }

                     var18 = var15;
                     var15 = var32;
                  }
               } else {
                  label444: {
                     am var19;
                     am var20;
                     am var21;
                     al var24;
                     al var35;
                     al var37;
                     al var45;
                     if (var12 != 0) {
                        if (!var9) {
                           for(var32 = null; var15 != null; var15 = var18) {
                              if (var15.ad != 3) {
                                 var25 = var15.i.a();
                                 if (var32 != null) {
                                    var25 += var32.k.a();
                                 }

                                 var33 = var15.i;
                                 var37 = var33.b;
                                 byte var26;
                                 if (var37.a.ad == 3) {
                                    var26 = 2;
                                 } else {
                                    var26 = 3;
                                 }

                                 var1.i(var33.f, var37.f, var25, var26);
                                 var28 = var15.k.a();
                                 var37 = var15.k.b.a.i;
                                 var33 = var37.b;
                                 var25 = var28;
                                 if (var33 != null) {
                                    var25 = var28;
                                    if (var33.a == var15) {
                                       var25 = var28 + var37.a();
                                    }
                                 }

                                 var33 = var15.k;
                                 var37 = var33.b;
                                 if (var37.a.ad == 3) {
                                    var26 = 2;
                                 } else {
                                    var26 = 3;
                                 }

                                 var1.j(var33.f, var37.f, -var25, var26);
                              } else {
                                 var2 += var15.Z;
                                 var33 = var15.k;
                                 if (var33.b != null) {
                                    var28 = var33.a();
                                    var25 = var28;
                                    if (var15 != this.at[3]) {
                                       var25 = var28 + var15.k.b.a.i.a();
                                    }
                                 } else {
                                    var25 = 0;
                                 }

                                 var1.i(var15.k.f, var15.i.f, 0, 1);
                                 var33 = var15.k;
                                 var1.j(var33.f, var33.b.f, -var25, 1);
                              }

                              var18 = var15.ab;
                              var32 = var15;
                           }

                           if (var12 == 1) {
                              var32 = this.ap[0];
                              var28 = var32.i.a();
                              var34 = var32.i.b;
                              var25 = var28;
                              if (var34 != null) {
                                 var25 = var28 + var34.a();
                              }

                              var27 = var32.k.a();
                              var34 = var32.k.b;
                              var28 = var27;
                              if (var34 != null) {
                                 var28 = var27 + var34.a();
                              }

                              var31 = var17.k.b.f;
                              am[] var39 = this.at;
                              if (var32 == var39[3]) {
                                 var31 = var39[1].k.b.f;
                              }

                              if (var32.c == 1) {
                                 var33 = var17.i;
                                 var1.i(var33.f, var33.b.f, var25, 1);
                                 var1.j(var17.k.f, var31, -var28, 1);
                                 var1.n(var17.k.f, var17.i.f, var17.h(), 2);
                              } else {
                                 var35 = var32.i;
                                 var1.n(var35.f, var35.b.f, var25, 1);
                                 var1.n(var32.k.f, var31, -var28, 1);
                              }
                              break label444;
                           }

                           var28 = 0;
                           var25 = var12;

                           while(true) {
                              var12 = var25 - 1;
                              if (var28 >= var12) {
                                 break label444;
                              }

                              am[] var30 = this.ap;
                              var18 = var30[var28];
                              var27 = var28 + 1;
                              var21 = var30[var27];
                              var33 = var18.i;
                              ak var22 = var33.f;
                              ak var38 = var18.k.f;
                              ak var40 = var21.i.f;
                              var31 = var21.k.f;
                              am[] var23 = this.at;
                              if (var21 == var23[3]) {
                                 var31 = var23[1].k.f;
                              }

                              var11 = var33.a();
                              var33 = var18.i.b;
                              var28 = var11;
                              if (var33 != null) {
                                 var45 = var33.a.k;
                                 var33 = var45.b;
                                 var28 = var11;
                                 if (var33 != null) {
                                    var28 = var11;
                                    if (var33.a == var18) {
                                       var28 = var11 + var45.a();
                                    }
                                 }
                              }

                              label369: {
                                 var1.i(var22, var18.i.b.f, var28, 2);
                                 var11 = var18.k.a();
                                 if (var18.k.b != null) {
                                    var32 = var18.ab;
                                    if (var32 != null) {
                                       var33 = var32.i;
                                       if (var33.b != null) {
                                          var28 = var33.a();
                                       } else {
                                          var28 = 0;
                                       }

                                       var28 += var11;
                                       break label369;
                                    }
                                 }

                                 var28 = var11;
                              }

                              var1.j(var38, var18.k.b.f, -var28, 2);
                              if (var27 == var12) {
                                 var11 = var21.i.a();
                                 var33 = var21.i.b;
                                 var28 = var11;
                                 if (var33 != null) {
                                    var33 = var33.a.k;
                                    var45 = var33.b;
                                    var28 = var11;
                                    if (var45 != null) {
                                       var28 = var11;
                                       if (var45.a == var21) {
                                          var28 = var11 + var33.a();
                                       }
                                    }
                                 }

                                 var1.i(var40, var21.i.b.f, var28, 2);
                                 var33 = var21.k;
                                 var23 = this.at;
                                 if (var21 == var23[3]) {
                                    var33 = var23[1].k;
                                 }

                                 var11 = var33.a();
                                 var45 = var33.b;
                                 var28 = var11;
                                 if (var45 != null) {
                                    var45 = var45.a.i;
                                    var24 = var45.b;
                                    var28 = var11;
                                    if (var24 != null) {
                                       var28 = var11;
                                       if (var24.a == var21) {
                                          var28 = var11 + var45.a();
                                       }
                                    }
                                 }

                                 var1.j(var31, var33.b.f, -var28, 2);
                              }

                              var28 = var17.f;
                              if (var28 > 0) {
                                 var1.j(var38, var22, var28, 2);
                              }

                              ah var44 = var1.a();
                              var44.f(var18.Z, var2, var21.Z, var22, var18.i.a(), var38, var18.k.a(), var40, var21.i.a(), var31, var21.k.a());
                              var1.g(var44);
                              var28 = var27;
                           }
                        }

                        var32 = var15;
                        var19 = null;
                        var18 = null;
                        var20 = var17;
                     } else {
                        var32 = var15;
                        var19 = null;
                        var18 = null;
                        var8 = false;
                        var20 = var17;
                     }

                     while(true) {
                        var21 = var32;
                        ak var46;
                        if (var32 == null) {
                           var25 = var7;
                           var7 = var7;
                           if (var9) {
                              var37 = var15.i;
                              var35 = var19.k;
                              var28 = var37.a();
                              var27 = var35.a();
                              var34 = var20.i.b;
                              if (var34 != null) {
                                 var31 = var34.f;
                              } else {
                                 var31 = null;
                              }

                              var33 = var19.k.b;
                              if (var33 != null) {
                                 var46 = var33.f;
                              } else {
                                 var46 = null;
                              }

                              var7 = var25;
                              if (var31 != null) {
                                 var7 = var25;
                                 if (var46 != null) {
                                    var1.j(var35.f, var46, -var27, 1);
                                    var1.m(var37.f, var31, var28, var20.H, var46, var35.f, var27);
                                    var7 = var25;
                                 }
                              }
                           }
                           break;
                        }

                        am var43 = var32.ab;
                        if (var43 == null) {
                           var19 = this.at[1];
                           var8 = true;
                        }

                        label440: {
                           if (var9) {
                              var33 = var32.i;
                              var11 = var33.a();
                              if (var18 != null) {
                                 var11 += var18.k.a();
                              }

                              byte var29;
                              if (var15 != var32) {
                                 var29 = 3;
                              } else {
                                 var29 = 1;
                              }

                              var1.i(var33.f, var33.b.f, var11, var29);
                              if (var32.ad == 3) {
                                 var35 = var32.k;
                                 if (var32.c == 1) {
                                    var11 = Math.max(var32.e, var32.h());
                                    var1.n(var35.f, var33.f, var11, 3);
                                 } else {
                                    var1.i(var33.f, var33.b.f, var33.c, 3);
                                    var1.j(var35.f, var33.f, var32.e, 3);
                                 }
                              }
                           } else if (!var10 && var8 && var18 != null) {
                              var33 = var32.k;
                              if (var33.b == null) {
                                 var1.h(var33.f, var32.b() + var32.y);
                              } else {
                                 var11 = var33.a();
                                 var1.n(var32.k.f, var19.k.b.f, -var11, 5);
                              }
                           } else {
                              if (var10 || var8 || var18 != null) {
                                 var24 = var32.i;
                                 var45 = var32.k;
                                 var11 = var24.a();
                                 var12 = var45.a();
                                 var1.i(var24.f, var24.b.f, var11, 1);
                                 var1.j(var45.f, var45.b.f, -var12, 1);
                                 var33 = var24.b;
                                 if (var33 != null) {
                                    var46 = var33.f;
                                 } else {
                                    var46 = null;
                                 }

                                 ak var36;
                                 if (var18 == null) {
                                    var33 = var20.i.b;
                                    if (var33 != null) {
                                       var36 = var33.f;
                                    } else {
                                       var36 = null;
                                    }
                                 } else {
                                    var36 = var46;
                                 }

                                 if (var43 == null) {
                                    var33 = var19.k.b;
                                    if (var33 != null) {
                                       var32 = var33.a;
                                    } else {
                                       var32 = null;
                                    }
                                 } else {
                                    var32 = var43;
                                 }

                                 if (var32 != null) {
                                    ak var41 = var32.i.f;
                                    if (var8) {
                                       var37 = var19.k.b;
                                       if (var37 != null) {
                                          var41 = var37.f;
                                       } else {
                                          var41 = null;
                                       }
                                    }

                                    if (var36 != null && var41 != null) {
                                       var1.m(var24.f, var36, var11, 0.5F, var41, var45.f, var12);
                                    }
                                 }
                                 break label440;
                              }

                              var33 = var32.i;
                              if (var33.b == null) {
                                 var1.h(var33.f, var32.b());
                              } else {
                                 var11 = var33.a();
                                 var1.n(var32.i.f, var20.i.b.f, var11, 5);
                              }
                           }

                           var32 = var43;
                        }

                        if (var8) {
                           var32 = null;
                        }

                        var18 = var21;
                     }
                  }
               }
            }
         }

         ++var7;
      }
   }

   private final void I(aj var1) {
      int var7 = 0;

      while(true) {
         boolean var8 = false;
         if (var7 >= this.ao) {
            return;
         }

         am var17 = this.aq[var7];
         int var12 = this.G(var1, this.at, var17, 1, this.as);
         am var15 = this.at[2];
         if (var15 != null) {
            boolean[] var16 = this.as;
            int var25;
            am var32;
            if (var16[1]) {
               for(var25 = var17.c(); var15 != null; var15 = var32) {
                  var1.h(var15.j.f, var25);
                  var32 = var15.ac;
                  var25 += var15.j.a() + var15.d() + var15.l.a();
               }
            } else {
               int var9 = var17.W;
               boolean var11;
               if (var9 == 0) {
                  var11 = true;
               } else {
                  var11 = false;
               }

               boolean var10;
               if (var9 == 2) {
                  var10 = true;
               } else {
                  var10 = false;
               }

               int var13 = this.ae;
               int var14 = this.ai;
               float var2 = 0.0F;
               am var18;
               int var27;
               int var28;
               ak var31;
               al var33;
               al var34;
               al var35;
               if ((var14 == 2 || var14 == 8) && var16[0] && var17.Y && !var10 && var13 != 2 && var9 == 0) {
                  var15 = var17;
                  var18 = null;
                  var28 = 0;
                  float var3 = 0.0F;
                  var27 = 0;

                  label364:
                  while(true) {
                     if (var15 == null) {
                        if (var18 != null) {
                           var34 = var18.l.b;
                           if (var34 != null) {
                              var9 = var34.a.w;
                           } else {
                              var9 = 0;
                           }

                           var25 = var9;
                           if (var34 != null) {
                              var25 = var9;
                              if (var34.a == this) {
                                 var25 = this.a();
                              }
                           }
                        } else {
                           var25 = 0;
                        }

                        var2 = (float)var27;
                        float var6 = (float)var25 - var2;
                        float var4;
                        if (var12 == 0) {
                           var2 = var6 / (float)(var28 + 1);
                           var4 = var2;
                           var32 = var17;
                        } else {
                           var4 = var6 / (float)var12;
                           var2 = 0.0F;
                           var32 = var17;
                        }

                        while(true) {
                           if (var32 == null) {
                              break label364;
                           }

                           var34 = var32.j;
                           if (var34.b != null) {
                              var25 = var34.a();
                           } else {
                              var25 = 0;
                           }

                           var34 = var32.l;
                           if (var34.b != null) {
                              var9 = var34.a();
                           } else {
                              var9 = 0;
                           }

                           float var5;
                           if (var32.K != 8) {
                              var5 = (float)var25;
                              var2 += var5;
                              var1.h(var32.j.f, (int)(var2 + 0.5F));
                              if (var32.ae == 3) {
                                 if (var3 == 0.0F) {
                                    var2 += var4 - var5 - (float)var9;
                                 } else {
                                    var2 += var32.aa * var6 / var3 - var5 - (float)var9;
                                 }
                              } else {
                                 var2 += (float)var32.d();
                              }

                              var1.h(var32.l.f, (int)(var2 + 0.5F));
                              var5 = var2;
                              if (var12 == 0) {
                                 var5 = var2 + var4;
                              }

                              var2 = var5 + (float)var9;
                           } else {
                              var5 = var4 / 2.0F;
                              var31 = var32.j.f;
                              var25 = (int)(var2 - var5 + 0.5F);
                              var1.h(var31, var25);
                              var1.h(var32.l.f, var25);
                           }

                           var34 = var32.l.b;
                           if (var34 != null) {
                              var15 = var34.a;
                           } else {
                              var15 = null;
                           }

                           if (var15 != null) {
                              var35 = var15.j.b;
                              if (var35 != null && var35.a != var32) {
                                 var15 = null;
                              }
                           }

                           var32 = var15;
                           if (var15 == this) {
                              var32 = null;
                           }
                        }
                     }

                     if (var15.K != 8) {
                        ++var28;
                        if (var15.ae != 3) {
                           var13 = var15.d();
                           var33 = var15.j;
                           if (var33.b != null) {
                              var25 = var33.a();
                           } else {
                              var25 = 0;
                           }

                           var33 = var15.l;
                           if (var33.b != null) {
                              var9 = var33.a();
                           } else {
                              var9 = 0;
                           }

                           var27 = var27 + var13 + var25 + var9;
                        } else {
                           var3 += var15.aa;
                        }
                     }

                     var33 = var15.l.b;
                     if (var33 != null) {
                        var18 = var33.a;
                     } else {
                        var18 = null;
                     }

                     var32 = var18;
                     if (var18 != null) {
                        label450: {
                           al var42 = var18.j.b;
                           if (var42 != null) {
                              var32 = var18;
                              if (var42.a == var15) {
                                 break label450;
                              }
                           }

                           var32 = null;
                        }
                     }

                     var18 = var15;
                     var15 = var32;
                  }
               } else {
                  label458: {
                     am var19;
                     am var20;
                     am var22;
                     al var24;
                     al var37;
                     al var45;
                     if (var12 != 0) {
                        if (!var10) {
                           for(var32 = null; var15 != null; var15 = var18) {
                              if (var15.ae != 3) {
                                 var25 = var15.j.a();
                                 if (var32 != null) {
                                    var25 += var32.l.a();
                                 }

                                 var37 = var15.j;
                                 var33 = var37.b;
                                 byte var26;
                                 if (var33.a.ae == 3) {
                                    var26 = 2;
                                 } else {
                                    var26 = 3;
                                 }

                                 var1.i(var37.f, var33.f, var25, var26);
                                 var9 = var15.l.a();
                                 var33 = var15.l.b.a.j;
                                 var37 = var33.b;
                                 var25 = var9;
                                 if (var37 != null) {
                                    var25 = var9;
                                    if (var37.a == var15) {
                                       var25 = var9 + var33.a();
                                    }
                                 }

                                 var33 = var15.l;
                                 var37 = var33.b;
                                 if (var37.a.ae == 3) {
                                    var26 = 2;
                                 } else {
                                    var26 = 3;
                                 }

                                 var1.j(var33.f, var37.f, -var25, var26);
                              } else {
                                 var2 += var15.aa;
                                 var33 = var15.l;
                                 if (var33.b != null) {
                                    var9 = var33.a();
                                    var25 = var9;
                                    if (var15 != this.at[3]) {
                                       var25 = var9 + var15.l.b.a.j.a();
                                    }
                                 } else {
                                    var25 = 0;
                                 }

                                 var1.i(var15.l.f, var15.j.f, 0, 1);
                                 var33 = var15.l;
                                 var1.j(var33.f, var33.b.f, -var25, 1);
                              }

                              var18 = var15.ac;
                              var32 = var15;
                           }

                           if (var12 == 1) {
                              var32 = this.ap[0];
                              var9 = var32.j.a();
                              var34 = var32.j.b;
                              var25 = var9;
                              if (var34 != null) {
                                 var25 = var9 + var34.a();
                              }

                              var27 = var32.l.a();
                              var34 = var32.l.b;
                              var9 = var27;
                              if (var34 != null) {
                                 var9 = var27 + var34.a();
                              }

                              var31 = var17.l.b.f;
                              am[] var39 = this.at;
                              if (var32 == var39[3]) {
                                 var31 = var39[1].l.b.f;
                              }

                              if (var32.d == 1) {
                                 var33 = var17.j;
                                 var1.i(var33.f, var33.b.f, var25, 1);
                                 var1.j(var17.l.f, var31, -var9, 1);
                                 var1.n(var17.l.f, var17.j.f, var17.d(), 2);
                              } else {
                                 var35 = var32.j;
                                 var1.n(var35.f, var35.b.f, var25, 1);
                                 var1.n(var32.l.f, var31, -var9, 1);
                              }
                              break label458;
                           }

                           var9 = 0;
                           var25 = var12;

                           while(true) {
                              var12 = var25 - 1;
                              if (var9 >= var12) {
                                 break label458;
                              }

                              am[] var30 = this.ap;
                              var18 = var30[var9];
                              var27 = var9 + 1;
                              var22 = var30[var27];
                              var33 = var18.j;
                              ak var38 = var33.f;
                              ak var40 = var18.l.f;
                              ak var21 = var22.j.f;
                              var31 = var22.l.f;
                              am[] var23 = this.at;
                              if (var22 == var23[3]) {
                                 var31 = var23[1].l.f;
                              }

                              var28 = var33.a();
                              var33 = var18.j.b;
                              var9 = var28;
                              if (var33 != null) {
                                 var45 = var33.a.l;
                                 var33 = var45.b;
                                 var9 = var28;
                                 if (var33 != null) {
                                    var9 = var28;
                                    if (var33.a == var18) {
                                       var9 = var28 + var45.a();
                                    }
                                 }
                              }

                              label379: {
                                 var1.i(var38, var18.j.b.f, var9, 2);
                                 var28 = var18.l.a();
                                 if (var18.l.b != null) {
                                    var32 = var18.ac;
                                    if (var32 != null) {
                                       var33 = var32.j;
                                       if (var33.b != null) {
                                          var9 = var33.a();
                                       } else {
                                          var9 = 0;
                                       }

                                       var9 += var28;
                                       break label379;
                                    }
                                 }

                                 var9 = var28;
                              }

                              var1.j(var40, var18.l.b.f, -var9, 2);
                              if (var27 == var12) {
                                 var28 = var22.j.a();
                                 var33 = var22.j.b;
                                 var9 = var28;
                                 if (var33 != null) {
                                    var33 = var33.a.l;
                                    var45 = var33.b;
                                    var9 = var28;
                                    if (var45 != null) {
                                       var9 = var28;
                                       if (var45.a == var22) {
                                          var9 = var28 + var33.a();
                                       }
                                    }
                                 }

                                 var1.i(var21, var22.j.b.f, var9, 2);
                                 var33 = var22.l;
                                 var23 = this.at;
                                 if (var22 == var23[3]) {
                                    var33 = var23[1].l;
                                 }

                                 var28 = var33.a();
                                 var45 = var33.b;
                                 var9 = var28;
                                 if (var45 != null) {
                                    var24 = var45.a.j;
                                    var45 = var24.b;
                                    var9 = var28;
                                    if (var45 != null) {
                                       var9 = var28;
                                       if (var45.a == var22) {
                                          var9 = var28 + var24.a();
                                       }
                                    }
                                 }

                                 var1.j(var31, var33.b.f, -var9, 2);
                              }

                              var9 = var17.h;
                              if (var9 > 0) {
                                 var1.j(var40, var38, var9, 2);
                              }

                              ah var44 = var1.a();
                              var44.f(var18.aa, var2, var22.aa, var38, var18.j.a(), var40, var18.l.a(), var21, var22.j.a(), var31, var22.l.a());
                              var1.g(var44);
                              var9 = var27;
                           }
                        }

                        var32 = var15;
                        var19 = null;
                        var18 = null;
                        var20 = var17;
                     } else {
                        var32 = var15;
                        var19 = null;
                        var18 = null;
                        var8 = false;
                        var20 = var17;
                     }

                     while(true) {
                        am var41 = var32;
                        ak var46;
                        if (var32 == null) {
                           var25 = var7;
                           var7 = var7;
                           if (var10) {
                              var35 = var15.j;
                              var37 = var19.l;
                              var9 = var35.a();
                              var27 = var37.a();
                              var34 = var20.j.b;
                              if (var34 != null) {
                                 var31 = var34.f;
                              } else {
                                 var31 = null;
                              }

                              var33 = var19.l.b;
                              if (var33 != null) {
                                 var46 = var33.f;
                              } else {
                                 var46 = null;
                              }

                              var7 = var25;
                              if (var31 != null) {
                                 var7 = var25;
                                 if (var46 != null) {
                                    var1.j(var37.f, var46, -var27, 1);
                                    var1.m(var35.f, var31, var9, var20.I, var46, var37.f, var27);
                                    var7 = var25;
                                 }
                              }
                           }
                           break;
                        }

                        var22 = var32.ac;
                        if (var22 == null) {
                           var19 = this.at[1];
                           var8 = true;
                        }

                        label455: {
                           ak var36;
                           if (var10) {
                              var45 = var32.j;
                              var9 = var45.a();
                              if (var18 != null) {
                                 var9 += var18.l.a();
                              }

                              byte var29;
                              if (var15 != var32) {
                                 var29 = 3;
                              } else {
                                 var29 = 1;
                              }

                              var33 = var45.b;
                              if (var33 != null) {
                                 var36 = var45.f;
                                 var46 = var33.f;
                              } else {
                                 var35 = var32.m;
                                 var33 = var35.b;
                                 if (var33 != null) {
                                    var36 = var35.f;
                                    var46 = var33.f;
                                    var9 -= var45.a();
                                 } else {
                                    var46 = null;
                                    var36 = null;
                                 }
                              }

                              if (var36 != null && var46 != null) {
                                 var1.i(var36, var46, var9, var29);
                              }

                              if (var32.ae == 3) {
                                 var33 = var32.l;
                                 if (var32.d == 1) {
                                    var9 = Math.max(var32.g, var32.d());
                                    var1.n(var33.f, var45.f, var9, 3);
                                 } else {
                                    var1.i(var45.f, var45.b.f, var45.c, 3);
                                    var1.j(var33.f, var45.f, var32.g, 3);
                                 }
                              }
                           } else if (!var11 && var8 && var18 != null) {
                              var33 = var32.l;
                              if (var33.b == null) {
                                 var1.h(var33.f, var32.c() + var32.z);
                              } else {
                                 var9 = var33.a();
                                 var1.n(var32.l.f, var19.l.b.f, -var9, 5);
                              }
                           } else {
                              if (var11 || var8 || var18 != null) {
                                 var45 = var32.j;
                                 var24 = var32.l;
                                 var12 = var45.a();
                                 var9 = var24.a();
                                 var1.i(var45.f, var45.b.f, var12, 1);
                                 var1.j(var24.f, var24.b.f, -var9, 1);
                                 var33 = var45.b;
                                 if (var33 != null) {
                                    var46 = var33.f;
                                 } else {
                                    var46 = null;
                                 }

                                 if (var18 == null) {
                                    var33 = var20.j.b;
                                    if (var33 != null) {
                                       var36 = var33.f;
                                    } else {
                                       var36 = null;
                                    }
                                 } else {
                                    var36 = var46;
                                 }

                                 if (var22 == null) {
                                    var33 = var19.l.b;
                                    if (var33 != null) {
                                       var32 = var33.a;
                                    } else {
                                       var32 = null;
                                    }
                                 } else {
                                    var32 = var22;
                                 }

                                 if (var32 != null) {
                                    ak var43 = var32.j.f;
                                    if (var8) {
                                       var37 = var19.l.b;
                                       if (var37 != null) {
                                          var43 = var37.f;
                                       } else {
                                          var43 = null;
                                       }
                                    }

                                    if (var36 != null && var43 != null) {
                                       var1.m(var45.f, var36, var12, 0.5F, var43, var24.f, var9);
                                    }
                                 }
                                 break label455;
                              }

                              var33 = var32.j;
                              if (var33.b == null) {
                                 var1.h(var33.f, var32.c());
                              } else {
                                 var9 = var33.a();
                                 var1.n(var32.j.f, var20.j.b.f, var9, 5);
                              }
                           }

                           var32 = var22;
                        }

                        if (var8) {
                           var32 = null;
                        }

                        var18 = var41;
                     }
                  }
               }
            }
         }

         ++var7;
      }
   }

   final void A(am var1, int var2) {
      byte var3 = 0;
      byte var4 = 0;
      am var5 = var1;
      al var6;
      al var7;
      int var10;
      if (var2 == 0) {
         while(true) {
            var6 = var1.i;
            al var11 = var6.b;
            var2 = var4;
            if (var11 != null) {
               var5 = var11.a;
               var7 = var5.k.b;
               var2 = var4;
               if (var7 != null) {
                  var2 = var4;
                  if (var7 == var6) {
                     var2 = var4;
                     if (var5 != var1) {
                        var1 = var5;
                        continue;
                     }
                  }
               }
            }

            while(true) {
               var10 = this.an;
               if (var2 >= var10) {
                  am[] var12 = this.ar;
                  var2 = var12.length;
                  if (var10 + 1 >= var2) {
                     this.ar = (am[])Arrays.copyOf(var12, var2 + var2);
                  }

                  var12 = this.ar;
                  var2 = this.an;
                  var12[var2] = var1;
                  this.an = var2 + 1;
                  return;
               }

               if (this.ar[var2] == var1) {
                  return;
               }

               ++var2;
            }
         }
      } else {
         while(true) {
            var6 = var5.j;
            al var8 = var6.b;
            var2 = var3;
            if (var8 == null) {
               break;
            }

            var1 = var8.a;
            var7 = var1.l.b;
            var2 = var3;
            if (var7 == null) {
               break;
            }

            var2 = var3;
            if (var7 != var6) {
               break;
            }

            var2 = var3;
            if (var1 == var5) {
               break;
            }

            var5 = var1;
         }

         while(true) {
            var10 = this.ao;
            if (var2 >= var10) {
               am[] var9 = this.aq;
               var2 = var9.length;
               if (var10 + 1 >= var2) {
                  this.aq = (am[])Arrays.copyOf(var9, var2 + var2);
               }

               var9 = this.aq;
               var2 = this.ao;
               var9[var2] = var5;
               this.ao = var2 + 1;
               return;
            }

            if (this.aq[var2] == var5) {
               return;
            }

            ++var2;
         }
      }
   }

   public final void B(am var1, boolean[] var2) {
      int var3 = var1.ad;
      byte var5 = 0;
      boolean var8 = false;
      if (var3 == 3 && var1.ae == 3 && var1.u > 0.0F) {
         var2[0] = false;
      } else {
         var3 = var1.f();
         if (var1.ad == 3 && var1.ae != 3 && var1.u > 0.0F) {
            var2[0] = false;
         } else {
            var1.T = true;
            int var4;
            int var6;
            int var15;
            if (var1 instanceof ao) {
               ao var14 = (ao)var1;
               if (var14.ai == 1) {
                  var3 = var14.ag;
                  if (var3 != -1) {
                     var4 = 0;
                  } else {
                     var4 = var14.ah;
                     if (var4 != -1) {
                        var3 = var5;
                     } else {
                        var4 = 0;
                        var3 = var5;
                     }
                  }
               } else {
                  var4 = var3;
               }
            } else if (!var1.k.c() && !var1.i.c()) {
               var15 = var3 + var1.w;
               var4 = var3;
               var3 = var15;
            } else {
               al var10 = var1.k;
               al var11 = var10.b;
               am var9;
               al var12;
               if (var11 != null) {
                  var12 = var1.i.b;
                  if (var12 != null) {
                     label175: {
                        if (var11 != var12) {
                           var9 = var11.a;
                           if (var9 != var12.a || var9 == var1.r) {
                              break label175;
                           }
                        }

                        var2[0] = false;
                        return;
                     }
                  }
               }

               var9 = null;
               am var16;
               am var17;
               if (var11 != null) {
                  var17 = var11.a;
                  var4 = var10.a() + var3;
                  var15 = var4;
                  var16 = var17;
                  if (!var17.s()) {
                     var15 = var4;
                     var16 = var17;
                     if (!var17.T) {
                        this.B(var17, var2);
                        var15 = var4;
                        var16 = var17;
                     }
                  }
               } else {
                  var15 = var3;
                  var16 = null;
               }

               label142: {
                  var12 = var1.i;
                  var11 = var12.b;
                  var4 = var3;
                  if (var11 != null) {
                     var17 = var11.a;
                     var3 += var12.a();
                     var4 = var3;
                     var9 = var17;
                     if (!var17.s()) {
                        var4 = var3;
                        var9 = var17;
                        if (!var17.T) {
                           this.B(var17, var2);
                           var9 = var17;
                           break label142;
                        }
                     }
                  }

                  var3 = var4;
               }

               var4 = var15;
               boolean var7;
               al var13;
               if (var1.k.b != null) {
                  var4 = var15;
                  if (!var16.s()) {
                     var4 = var1.k.b.g;
                     if (var4 == 4) {
                        var6 = var15 + (var16.N - var16.f());
                     } else {
                        var6 = var15;
                        if (var4 == 2) {
                           var6 = var15 + var16.N;
                        }
                     }

                     if (!var16.Q) {
                        if (var16.i.b != null && var16.k.b != null && var16.ad != 3) {
                           var7 = true;
                        } else {
                           var7 = false;
                        }
                     } else {
                        var7 = true;
                     }

                     var1.Q = var7;
                     var4 = var6;
                     if (var7) {
                        label178: {
                           var13 = var16.i.b;
                           if (var13 != null) {
                              var4 = var6;
                              if (var13.a == var1) {
                                 break label178;
                              }
                           }

                           var4 = var6 + (var6 - var16.N);
                        }
                     }
                  }
               }

               if (var1.i.b != null && !var9.s()) {
                  label186: {
                     var6 = var1.i.b.g;
                     if (var6 == 2) {
                        var15 = var3 + (var9.M - var9.f());
                     } else {
                        var15 = var3;
                        if (var6 == 4) {
                           var15 = var3 + var9.M;
                        }
                     }

                     if (!var9.P) {
                        if (var9.i.b != null && var9.k.b != null && var9.ad != 3) {
                           var7 = true;
                        } else {
                           var7 = var8;
                        }
                     } else {
                        var7 = true;
                     }

                     var1.P = var7;
                     if (var7) {
                        var13 = var9.k.b;
                        if (var13 == null || var13.a != var1) {
                           var3 = var15 + (var15 - var9.M);
                           break label186;
                        }
                     }

                     var3 = var15;
                  }
               }
            }

            var6 = var3;
            var15 = var4;
            if (var1.K == 8) {
               var15 = var1.s;
               var6 = var3 - var15;
               var15 = var4 - var15;
            }

            var1.M = var6;
            var1.N = var15;
         }
      }
   }

   public final void C(am var1, boolean[] var2) {
      int var3 = var1.ae;
      boolean var8 = false;
      byte var5 = 0;
      byte var4 = 0;
      if (var3 == 3 && var1.ad != 3 && var1.u > 0.0F) {
         var2[0] = false;
      } else {
         label189: {
            var3 = var1.e();
            var1.U = true;
            int var6;
            int var14;
            int var15;
            if (var1 instanceof ao) {
               ao var13 = (ao)var1;
               if (var13.ai == 0) {
                  var3 = var13.ag;
                  if (var3 != -1) {
                     var14 = var3;
                     var3 = var5;
                  } else {
                     var15 = var13.ah;
                     var3 = var4;
                     if (var15 != -1) {
                        var3 = var15;
                     }

                     var14 = 0;
                  }
               } else {
                  var14 = var3;
               }
            } else {
               al var9 = var1.m;
               if (var9.b == null && var1.j.b == null && var1.l.b == null) {
                  var14 = var3 + var1.x;
               } else {
                  al var11 = var1.l.b;
                  al var10;
                  am var18;
                  if (var11 != null) {
                     var10 = var1.j.b;
                     if (var10 != null) {
                        if (var11 == var10) {
                           break label189;
                        }

                        var18 = var11.a;
                        if (var18 == var10.a && var18 != var1.r) {
                           break label189;
                        }
                     }
                  }

                  am var16;
                  if (var9.c()) {
                     var16 = var1.m.b.a;
                     if (!var16.U) {
                        this.C(var16, var2);
                     }

                     var15 = Math.max(var16.L - var16.t + var3, var3);
                     var6 = Math.max(var16.O - var16.t + var3, var3);
                     var14 = var6;
                     var3 = var15;
                     if (var1.K == 8) {
                        var14 = var1.t;
                        var3 = var15 - var14;
                        var14 = var6 - var14;
                     }

                     var1.L = var3;
                     var1.O = var14;
                     return;
                  }

                  boolean var7 = var1.j.c();
                  var10 = null;
                  if (var7) {
                     var9 = var1.j;
                     var18 = var9.b.a;
                     var14 = var9.a() + var3;
                     var15 = var14;
                     var16 = var18;
                     if (!var18.s()) {
                        var15 = var14;
                        var16 = var18;
                        if (!var18.U) {
                           this.C(var18, var2);
                           var15 = var14;
                           var16 = var18;
                        }
                     }
                  } else {
                     var15 = var3;
                     var16 = null;
                  }

                  am var12;
                  if (var1.l.c()) {
                     var11 = var1.l;
                     am var17 = var11.b.a;
                     var3 += var11.a();
                     if (!var17.s() && !var17.U) {
                        this.C(var17, var2);
                     }

                     var12 = var17;
                  } else {
                     var12 = var10;
                  }

                  var14 = var15;
                  if (var1.j.b != null) {
                     var14 = var15;
                     if (!var16.s()) {
                        var14 = var1.j.b.g;
                        if (var14 == 3) {
                           var6 = var15 + (var16.L - var16.e());
                        } else {
                           var6 = var15;
                           if (var14 == 5) {
                              var6 = var15 + var16.L;
                           }
                        }

                        if (!var16.R) {
                           label152: {
                              var10 = var16.j.b;
                              if (var10 != null && var10.a != var1) {
                                 var10 = var16.l.b;
                                 if (var10 != null && var10.a != var1 && var16.ae != 3) {
                                    var7 = true;
                                    break label152;
                                 }
                              }

                              var7 = false;
                           }
                        } else {
                           var7 = true;
                        }

                        var1.R = var7;
                        var14 = var6;
                        if (var7) {
                           label188: {
                              var10 = var16.l.b;
                              if (var10 != null) {
                                 var14 = var6;
                                 if (var10.a == var1) {
                                    break label188;
                                 }
                              }

                              var14 = var6 + (var6 - var16.L);
                           }
                        }
                     }
                  }

                  if (var1.l.b != null && !var12.s()) {
                     label195: {
                        var6 = var1.l.b.g;
                        if (var6 == 5) {
                           var15 = var3 + (var12.O - var12.e());
                        } else {
                           var15 = var3;
                           if (var6 == 3) {
                              var15 = var3 + var12.O;
                           }
                        }

                        if (!var12.S) {
                           label129: {
                              var9 = var12.j.b;
                              if (var9 != null && var9.a != var1) {
                                 var9 = var12.l.b;
                                 if (var9 != null && var9.a != var1 && var12.ae != 3) {
                                    var7 = true;
                                    break label129;
                                 }
                              }

                              var7 = var8;
                           }
                        } else {
                           var7 = true;
                        }

                        var1.S = var7;
                        if (var7) {
                           var9 = var12.j.b;
                           if (var9 == null || var9.a != var1) {
                              var3 = var15 + (var15 - var12.O);
                              break label195;
                           }
                        }

                        var3 = var15;
                     }
                  }
               }
            }

            var6 = var3;
            var15 = var14;
            if (var1.K == 8) {
               var6 = var1.t;
               var15 = var14 - var6;
               var6 = var3 - var6;
            }

            var1.L = var15;
            var1.O = var6;
            return;
         }

         var2[0] = false;
      }
   }

   public final void D() {
      int var15 = this.w;
      int var5 = this.x;
      int var16 = Math.max(0, this.h());
      int var17 = Math.max(0, this.d());
      this.aj = false;
      this.ak = false;
      int var4;
      int var6;
      if (this.r != null) {
         if (this.am == null) {
            this.am = new aq(this);
         }

         aq var33 = this.am;
         var33.a = super.w;
         var33.b = super.x;
         var33.c = this.h();
         var33.d = this.d();
         var6 = var33.e.size();

         for(var4 = 0; var4 < var6; ++var4) {
            ap var31 = (ap)var33.e.get(var4);
            var31.a = this.t(var31.a.g);
            al var32 = var31.a;
            if (var32 != null) {
               var31.b = var32.b;
               var31.c = var32.a();
               var31.e = var32.h;
               var31.d = var32.e;
            } else {
               var31.b = null;
               var31.c = 0;
               var31.e = 2;
               var31.d = 0;
            }
         }

         super.w = 0;
         super.x = 0;
         var6 = super.q.size();

         for(var4 = 0; var4 < var6; ++var4) {
            ((al)super.q.get(var4)).b();
         }

         this.z(this.af.g);
      } else {
         this.w = 0;
         this.x = 0;
      }

      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var18;
      int var19;
      int var20;
      int var21;
      int var22;
      int var23;
      boolean var26;
      boolean var27;
      boolean[] var74;
      am var75;
      am var79;
      label733: {
         label683: {
            var20 = this.ae;
            var6 = this.ad;
            if (this.ai == 2) {
               var4 = var6;
               if (var20 == 2) {
                  break label683;
               }

               if (var6 == 2) {
                  var4 = 2;
                  break label683;
               }
            }

            var26 = false;
            var19 = var5;
            var18 = var6;
            break label733;
         }

         ArrayList var76 = this.al;
         var74 = this.as;
         var18 = var76.size();
         var74[0] = true;
         var14 = 0;
         var12 = 0;
         var13 = 0;
         var9 = 0;
         var11 = 0;
         var10 = 0;
         var8 = 0;

         label674:
         while(true) {
            if (var9 >= var18) {
               var6 = Math.max(var14, var13);
               this.ag = Math.max(this.D, Math.max(var6, var12));
               var6 = Math.max(var11, var10);
               this.ah = Math.max(this.E, Math.max(var6, var8));
               var6 = 0;

               while(true) {
                  if (var6 >= var18) {
                     break label674;
                  }

                  var75 = (am)var76.get(var6);
                  var75.T = false;
                  var75.U = false;
                  var75.P = false;
                  var75.Q = false;
                  var75.R = false;
                  var75.S = false;
                  ++var6;
               }
            }

            var79 = (am)var76.get(var9);
            if (!var79.s()) {
               if (!var79.T) {
                  this.B(var79, var74);
               }

               if (!var79.U) {
                  this.C(var79, var74);
               }

               if (!var74[0]) {
                  break;
               }

               var23 = var79.M;
               var6 = var79.N;
               var22 = var79.h();
               var7 = var79.L;
               var21 = var79.O;
               var19 = var79.d();
               if (var79.ad == 4) {
                  var6 = var79.h() + var79.i.c + var79.k.c;
               } else {
                  var6 = var23 + var6 - var22;
               }

               if (var79.ae == 4) {
                  var7 = var79.d() + var79.j.c + var79.l.c;
               } else {
                  var7 = var7 + var21 - var19;
               }

               var19 = var79.K;
               if (var19 == 8) {
                  var7 = 0;
               }

               if (var19 == 8) {
                  var6 = 0;
               }

               var14 = Math.max(var14, var79.M);
               var13 = Math.max(var13, var79.N);
               var10 = Math.max(var10, var79.O);
               var11 = Math.max(var11, var79.L);
               var12 = Math.max(var12, var6);
               var8 = Math.max(var8, var7);
            }

            ++var9;
         }

         var27 = this.as[0];
         var26 = var27;
         if (var16 > 0) {
            var26 = var27;
            if (var17 > 0) {
               if (this.ag <= var16) {
                  var26 = var27;
                  if (this.ah > var17) {
                     var26 = false;
                  }
               } else {
                  var26 = false;
               }
            }
         }

         if (var26) {
            if (this.ad == 2) {
               this.ad = 1;
               if (var16 > 0 && var16 < this.ag) {
                  this.aj = true;
                  this.p(var16);
               } else {
                  this.p(Math.max(this.D, this.ag));
               }
            }

            if (this.ae == 2) {
               this.ae = 1;
               if (var17 > 0 && var17 < this.ah) {
                  this.ak = true;
                  this.j(var17);
               } else {
                  this.j(Math.max(this.E, this.ah));
               }
            }
         }

         var18 = var4;
         var19 = var5;
      }

      this.an = 0;
      this.ao = 0;
      int var24 = this.al.size();

      for(var4 = 0; var4 < var24; ++var4) {
         var75 = (am)this.al.get(var4);
         if (var75 instanceof ar) {
            ((ar)var75).D();
         }
      }

      var9 = 0;
      boolean var28 = true;
      var6 = var20;
      var27 = var26;
      var5 = var17;
      var4 = var16;

      for(var7 = var15; var28; var28 = var26) {
         var23 = var9 + 1;

         boolean var29;
         label632: {
            label631: {
               Exception var77;
               label709: {
                  try {
                     this.af.l();
                     var26 = this.E(this.af);
                  } catch (Exception var70) {
                     var77 = var70;
                     var8 = var7;
                     var26 = var27;
                     var7 = var4;
                     var4 = var8;
                     var27 = var28;
                     break label709;
                  }

                  if (!var26) {
                     var9 = var7;
                     var28 = var26;
                     var7 = var4;
                     var8 = var5;
                     var26 = var27;
                     break label631;
                  }

                  var12 = var7;
                  var11 = var4;
                  var8 = var5;
                  var29 = var27;
                  var28 = var26;
                  var10 = var6;

                  boolean var30;
                  label743: {
                     Exception var10000;
                     label621: {
                        label620: {
                           label711: {
                              boolean var10001;
                              aj var34;
                              try {
                                 var34 = this.af;
                              } catch (Exception var69) {
                                 var10000 = var69;
                                 var10001 = false;
                                 break label711;
                              }

                              var12 = var7;
                              var11 = var4;
                              var8 = var5;
                              var29 = var27;
                              var28 = var26;
                              var10 = var6;

                              ai var35;
                              try {
                                 var35 = var34.b;
                              } catch (Exception var68) {
                                 var10000 = var68;
                                 var10001 = false;
                                 break label711;
                              }

                              var12 = var7;
                              var11 = var4;
                              var8 = var5;
                              var29 = var27;
                              var28 = var26;
                              var10 = var6;

                              try {
                                 var35.a(var34);
                              } catch (Exception var67) {
                                 var10000 = var67;
                                 var10001 = false;
                                 break label711;
                              }

                              var12 = var7;
                              var11 = var4;
                              var8 = var5;
                              var29 = var27;
                              var28 = var26;
                              var10 = var6;

                              try {
                                 var34.o(var35);
                              } catch (Exception var66) {
                                 var10000 = var66;
                                 var10001 = false;
                                 break label711;
                              }

                              var9 = 0;

                              while(true) {
                                 var12 = var7;
                                 var11 = var4;
                                 var8 = var5;
                                 var29 = var27;
                                 var28 = var26;
                                 var10 = var6;

                                 try {
                                    if (var9 >= var34.e) {
                                       break;
                                    }
                                 } catch (Exception var65) {
                                    var10000 = var65;
                                    var10001 = false;
                                    break label711;
                                 }

                                 var12 = var7;
                                 var11 = var4;
                                 var8 = var5;
                                 var29 = var27;
                                 var28 = var26;
                                 var10 = var6;

                                 try {
                                    var34.d[var9] = false;
                                 } catch (Exception var64) {
                                    var10000 = var64;
                                    var10001 = false;
                                    break label711;
                                 }

                                 ++var9;
                              }

                              var9 = 0;
                              boolean var71 = false;

                              label591:
                              while(true) {
                                 ah var80;
                                 if (var71) {
                                    var8 = var5;
                                    var28 = var26;
                                    var5 = var6;
                                    var9 = 0;

                                    while(true) {
                                       var29 = var27;
                                       var17 = var7;
                                       var11 = var8;
                                       var10 = var4;
                                       var6 = var5;

                                       label445: {
                                          try {
                                             if (var9 < var34.f) {
                                                break label445;
                                             }
                                          } catch (Exception var38) {
                                             var10000 = var38;
                                             var10001 = false;
                                             break label621;
                                          }

                                          var26 = var27;
                                          var9 = var7;
                                          var7 = var4;
                                          var6 = var5;
                                          break label631;
                                       }

                                       var29 = var27;
                                       var17 = var7;
                                       var11 = var8;
                                       var10 = var4;
                                       var6 = var5;

                                       try {
                                          var80 = var34.c[var9];
                                       } catch (Exception var37) {
                                          var10000 = var37;
                                          var10001 = false;
                                          break label621;
                                       }

                                       var29 = var27;
                                       var17 = var7;
                                       var11 = var8;
                                       var10 = var4;
                                       var6 = var5;

                                       try {
                                          var80.a.d = var80.b;
                                       } catch (Exception var36) {
                                          var10000 = var36;
                                          var10001 = false;
                                          break label621;
                                       }

                                       ++var9;
                                    }
                                 }

                                 var12 = var7;
                                 var11 = var4;
                                 var8 = var5;
                                 var29 = var27;
                                 var28 = var26;
                                 var10 = var6;

                                 try {
                                    var14 = var35.a.size();
                                 } catch (Exception var63) {
                                    var10000 = var63;
                                    var10001 = false;
                                    break;
                                 }

                                 var30 = var26;
                                 ak var78 = null;
                                 var16 = 0;
                                 var13 = 0;

                                 label584: {
                                    label583:
                                    while(true) {
                                       float var1;
                                       if (var16 >= var14) {
                                          boolean var72;
                                          label579: {
                                             label578: {
                                                var8 = var7;
                                                var28 = var27;
                                                var13 = var9;
                                                if (var78 != null) {
                                                   var15 = var4;
                                                   var12 = var5;
                                                   var11 = var6;
                                                   var10 = var7;

                                                   try {
                                                      var74 = var34.d;
                                                   } catch (Exception var61) {
                                                      var10000 = var61;
                                                      var10001 = false;
                                                      break;
                                                   }

                                                   var15 = var4;
                                                   var12 = var5;
                                                   var11 = var6;
                                                   var10 = var7;

                                                   try {
                                                      var13 = var78.a;
                                                   } catch (Exception var60) {
                                                      var10000 = var60;
                                                      var10001 = false;
                                                      break;
                                                   }

                                                   if (var74[var13]) {
                                                      var78 = null;
                                                      var72 = false;
                                                      break label579;
                                                   }

                                                   var74[var13] = true;
                                                   ++var9;
                                                   var15 = var4;
                                                   var12 = var5;
                                                   var11 = var6;
                                                   var10 = var7;
                                                   var13 = var9;

                                                   try {
                                                      if (var9 >= var34.e) {
                                                         break label578;
                                                      }
                                                   } catch (Exception var62) {
                                                      var10000 = var62;
                                                      var10001 = false;
                                                      break;
                                                   }
                                                }

                                                var9 = var13;
                                                var72 = false;
                                                break label579;
                                             }

                                             var72 = true;
                                          }

                                          if (var78 != null) {
                                             var14 = 0;
                                             float var2 = Float.MAX_VALUE;
                                             var20 = -1;

                                             while(true) {
                                                var15 = var4;
                                                var12 = var5;
                                                var11 = var6;
                                                var10 = var8;

                                                try {
                                                   if (var14 >= var34.f) {
                                                      break;
                                                   }
                                                } catch (Exception var55) {
                                                   var10000 = var55;
                                                   var10001 = false;
                                                   break label583;
                                                }

                                                var15 = var4;
                                                var12 = var5;
                                                var11 = var6;
                                                var10 = var8;

                                                try {
                                                   var80 = var34.c[var14];
                                                } catch (Exception var54) {
                                                   var10000 = var54;
                                                   var10001 = false;
                                                   break label583;
                                                }

                                                var15 = var4;
                                                var12 = var5;
                                                var11 = var6;
                                                var10 = var8;

                                                label720: {
                                                   label548: {
                                                      label547: {
                                                         label721: {
                                                            try {
                                                               if (var80.a.h == 1) {
                                                                  break label721;
                                                               }
                                                            } catch (Exception var58) {
                                                               var10000 = var58;
                                                               var10001 = false;
                                                               break label583;
                                                            }

                                                            var15 = var4;
                                                            var12 = var5;
                                                            var11 = var6;
                                                            var10 = var8;

                                                            ag var81;
                                                            try {
                                                               var81 = var80.d;
                                                            } catch (Exception var53) {
                                                               var10000 = var53;
                                                               var10001 = false;
                                                               break label583;
                                                            }

                                                            var15 = var4;
                                                            var12 = var5;
                                                            var11 = var6;
                                                            var10 = var8;

                                                            try {
                                                               var22 = var81.e;
                                                            } catch (Exception var52) {
                                                               var10000 = var52;
                                                               var10001 = false;
                                                               break label583;
                                                            }

                                                            var16 = var5;
                                                            var15 = var4;
                                                            if (var22 == -1) {
                                                               var1 = var2;
                                                               var10 = var20;
                                                               break label720;
                                                            }

                                                            var21 = 0;

                                                            while(true) {
                                                               var10 = var6;
                                                               if (var22 == -1) {
                                                                  break label547;
                                                               }

                                                               var10 = var6;

                                                               int var25;
                                                               try {
                                                                  if (var21 >= var81.a) {
                                                                     break label547;
                                                                  }

                                                                  var25 = var81.b[var22];
                                                               } catch (Exception var57) {
                                                                  var77 = var57;
                                                                  var4 = var16;
                                                                  var5 = var15;
                                                                  break label620;
                                                               }

                                                               var12 = var6;
                                                               var29 = var28;
                                                               var17 = var8;
                                                               var11 = var16;
                                                               var10 = var15;
                                                               var6 = var6;

                                                               try {
                                                                  if (var25 == var78.a) {
                                                                     break label548;
                                                                  }
                                                               } catch (Exception var56) {
                                                                  var10000 = var56;
                                                                  var10001 = false;
                                                                  break label621;
                                                               }

                                                               var29 = var28;
                                                               var17 = var8;
                                                               var11 = var16;
                                                               var10 = var15;
                                                               var6 = var12;

                                                               try {
                                                                  var22 = var81.c[var22];
                                                               } catch (Exception var49) {
                                                                  var10000 = var49;
                                                                  var10001 = false;
                                                                  break label621;
                                                               }

                                                               ++var21;
                                                               var6 = var12;
                                                            }
                                                         }

                                                         var10 = var6;
                                                      }

                                                      var6 = var10;
                                                      var10 = var20;
                                                      var1 = var2;
                                                      break label720;
                                                   }

                                                   var29 = var28;
                                                   var17 = var8;
                                                   var11 = var16;
                                                   var10 = var15;
                                                   var6 = var12;

                                                   float var3;
                                                   try {
                                                      var3 = var80.d.a(var78);
                                                   } catch (Exception var48) {
                                                      var10000 = var48;
                                                      var10001 = false;
                                                      break label621;
                                                   }

                                                   var1 = var2;
                                                   var10 = var20;
                                                   var6 = var12;
                                                   if (var3 < 0.0F) {
                                                      var29 = var28;
                                                      var17 = var8;
                                                      var11 = var16;
                                                      var10 = var15;
                                                      var6 = var12;

                                                      try {
                                                         var3 = -var80.b / var3;
                                                      } catch (Exception var47) {
                                                         var10000 = var47;
                                                         var10001 = false;
                                                         break label621;
                                                      }

                                                      var1 = var2;
                                                      var10 = var20;
                                                      var6 = var12;
                                                      if (var3 < var2) {
                                                         var1 = var3;
                                                         var10 = var14;
                                                         var6 = var12;
                                                      }
                                                   }
                                                }

                                                ++var14;
                                                var2 = var1;
                                                var20 = var10;
                                             }

                                             var12 = var5;
                                             var5 = var6;
                                             if (var20 >= 0) {
                                                var29 = var28;
                                                var17 = var8;
                                                var11 = var12;
                                                var10 = var4;
                                                var6 = var6;

                                                try {
                                                   var80 = var34.c[var20];
                                                } catch (Exception var46) {
                                                   var10000 = var46;
                                                   var10001 = false;
                                                   break label621;
                                                }

                                                var29 = var28;
                                                var17 = var8;
                                                var11 = var12;
                                                var10 = var4;
                                                var6 = var5;

                                                try {
                                                   var80.a.b = -1;
                                                } catch (Exception var45) {
                                                   var10000 = var45;
                                                   var10001 = false;
                                                   break label621;
                                                }

                                                var29 = var28;
                                                var17 = var8;
                                                var11 = var12;
                                                var10 = var4;
                                                var6 = var5;

                                                try {
                                                   var80.a(var78);
                                                } catch (Exception var44) {
                                                   var10000 = var44;
                                                   var10001 = false;
                                                   break label621;
                                                }

                                                var29 = var28;
                                                var17 = var8;
                                                var11 = var12;
                                                var10 = var4;
                                                var6 = var5;

                                                try {
                                                   var80.a.b = var20;
                                                } catch (Exception var43) {
                                                   var10000 = var43;
                                                   var10001 = false;
                                                   break label621;
                                                }

                                                var7 = 0;

                                                while(true) {
                                                   var29 = var28;
                                                   var17 = var8;
                                                   var11 = var12;
                                                   var10 = var4;
                                                   var6 = var5;

                                                   try {
                                                      if (var7 >= var34.f) {
                                                         break;
                                                      }
                                                   } catch (Exception var50) {
                                                      var10000 = var50;
                                                      var10001 = false;
                                                      break label621;
                                                   }

                                                   var29 = var28;
                                                   var17 = var8;
                                                   var11 = var12;
                                                   var10 = var4;
                                                   var6 = var5;

                                                   try {
                                                      var34.c[var7].k(var80);
                                                   } catch (Exception var42) {
                                                      var10000 = var42;
                                                      var10001 = false;
                                                      break label621;
                                                   }

                                                   ++var7;
                                                }

                                                var29 = var28;
                                                var17 = var8;
                                                var11 = var12;
                                                var10 = var4;
                                                var6 = var5;

                                                try {
                                                   var35.a(var34);
                                                } catch (Exception var41) {
                                                   var10000 = var41;
                                                   var10001 = false;
                                                   break label621;
                                                }

                                                try {
                                                   var34.o(var35);
                                                } catch (Exception var40) {
                                                   var77 = var40;
                                                   var29 = var28;
                                                   var17 = var8;
                                                   var11 = var12;
                                                   var10 = var4;
                                                   var6 = var5;

                                                   try {
                                                      var77.printStackTrace();
                                                   } catch (Exception var39) {
                                                      var10000 = var39;
                                                      var10001 = false;
                                                      break label621;
                                                   }
                                                }

                                                var26 = var26;
                                                var27 = var28;
                                                var7 = var8;
                                                var71 = var72;
                                                var6 = var5;
                                                var5 = var12;
                                                continue label591;
                                             }

                                             var6 = var6;
                                             var5 = var12;
                                          }

                                          var71 = true;
                                          continue label591;
                                       }

                                       ak var82;
                                       try {
                                          var82 = (ak)var35.a.get(var16);
                                       } catch (Exception var59) {
                                          var77 = var59;
                                          var8 = var7;
                                          break label584;
                                       }

                                       for(var8 = 5; var8 >= 0; --var8) {
                                          var15 = var4;
                                          var12 = var5;
                                          var11 = var6;
                                          var10 = var7;

                                          try {
                                             var1 = var82.e[var8];
                                          } catch (Exception var51) {
                                             var10000 = var51;
                                             var10001 = false;
                                             break label583;
                                          }

                                          ak var86 = var78;
                                          var10 = var13;
                                          if (var78 == null) {
                                             var86 = var78;
                                             var10 = var13;
                                             if (var1 < 0.0F) {
                                                var86 = var78;
                                                var10 = var13;
                                                if (var8 >= var13) {
                                                   var10 = var8;
                                                   var86 = var82;
                                                }
                                             }
                                          }

                                          var78 = var86;
                                          var13 = var10;
                                          if (var1 > 0.0F) {
                                             var78 = var86;
                                             var13 = var10;
                                             if (var8 > var10) {
                                                var13 = var8;
                                                var78 = null;
                                             }
                                          }
                                       }

                                       ++var16;
                                    }

                                    var77 = var10000;
                                    var4 = var15;
                                    var5 = var12;
                                    var6 = var11;
                                    var8 = var10;
                                 }

                                 var7 = var4;
                                 var4 = var5;
                                 var28 = var27;
                                 var5 = var7;
                                 break label620;
                              }
                           }

                           var77 = var10000;
                           var5 = var11;
                           var4 = var8;
                           var30 = var28;
                           var8 = var12;
                           var28 = var29;
                           var6 = var10;
                        }

                        var10 = var5;
                        var5 = var4;
                        var4 = var8;
                        break label743;
                     }

                     var77 = var10000;
                     var30 = var26;
                     var28 = var29;
                     var4 = var17;
                     var5 = var11;
                  }

                  var27 = var30;
                  var26 = var28;
                  var7 = var10;
               }

               var77.printStackTrace();
               break label632;
            }

            var27 = var28;
            var4 = var9;
            var5 = var8;
         }

         if (var27) {
            var74 = this.as;
            var74[2] = false;
            this.y();
            var9 = this.al.size();

            for(var8 = 0; var8 < var9; ++var8) {
               am var83 = (am)this.al.get(var8);
               var83.y();
               if (var83.ad == 3 && var83.h() < var83.F) {
                  var74[2] = true;
               }

               if (var83.ae == 3 && var83.d() < var83.G) {
                  var74[2] = true;
               }
            }
         } else {
            this.y();

            for(var8 = 0; var8 < var24; ++var8) {
               var75 = (am)this.al.get(var8);
               if (var75.ad == 3 && var75.h() < var75.F) {
                  this.as[2] = true;
                  break;
               }

               if (var75.ae == 3 && var75.d() < var75.G) {
                  this.as[2] = true;
                  break;
               }
            }
         }

         if (var23 < 8 && this.as[2]) {
            var9 = 0;
            var10 = 0;

            for(var8 = 0; var9 < var24; ++var9) {
               var75 = (am)this.al.get(var9);
               var10 = Math.max(var10, var75.w + var75.h());
               var8 = Math.max(var8, var75.x + var75.d());
            }

            var9 = Math.max(this.D, var10);
            var8 = Math.max(this.E, var8);
            if (var18 == 2 && this.h() < var9) {
               this.p(var9);
               this.ad = 2;
               var28 = true;
               var29 = true;
            } else {
               var28 = false;
               var29 = var26;
            }

            var27 = var28;
            var26 = var29;
            if (var6 == 2) {
               var27 = var28;
               var26 = var29;
               if (this.d() < var8) {
                  this.j(var8);
                  this.ae = 2;
                  var27 = true;
                  var26 = true;
               }
            }
         } else {
            var27 = false;
         }

         var8 = Math.max(this.D, this.h());
         var28 = var27;
         var27 = var26;
         if (var8 > this.h()) {
            this.p(var8);
            this.ad = 1;
            var28 = true;
            var27 = true;
         }

         var8 = Math.max(this.E, this.d());
         var26 = var28;
         if (var8 > this.d()) {
            this.j(var8);
            this.ae = 1;
            var26 = true;
            var27 = true;
         }

         if (!var27) {
            if (this.ad == 2 && var7 > 0) {
               var8 = this.h();
               if (var8 > var7) {
                  this.aj = true;
                  this.ad = 1;
                  this.p(var7);
                  var26 = true;
                  var27 = true;
               }
            }

            if (this.ae == 2 && var5 > 0) {
               var8 = this.d();
               if (var8 > var5) {
                  this.ak = true;
                  this.ae = 1;
                  this.j(var5);
                  var26 = true;
                  var27 = true;
               }
            }
         }

         var8 = var7;
         var9 = var23;
         var7 = var4;
         var4 = var8;
      }

      var4 = 0;
      if (this.r != null) {
         var8 = Math.max(this.D, this.h());
         var5 = Math.max(this.E, this.d());
         aq var87 = this.am;
         super.w = var87.a;
         super.x = var87.b;
         this.p(var87.c);
         this.j(var87.d);

         for(var7 = var87.e.size(); var4 < var7; ++var4) {
            ap var84 = (ap)var87.e.get(var4);
            this.t(var84.a.g).d(var84.b, var84.c, -1, var84.e, var84.d, false);
         }

         this.p(var8);
         this.j(var5);
      } else {
         this.w = var7;
         this.x = var19;
      }

      if (var27) {
         this.ad = var18;
         this.ae = var6;
      }

      this.z(this.af.g);
      var75 = super.r;

      Object var85;
      for(var85 = this; var75 != null; var75 = var79) {
         var79 = var75.r;
         var85 = var75;
      }

      if (this == var85) {
         this.q();
      }

   }

   public final boolean E(aj var1) {
      this.x(var1);
      int var12 = this.al.size();
      int var5 = this.ai;
      int var6;
      int var7;
      int var8;
      int var9;
      am var16;
      al var17;
      boolean var21;
      if (var5 != 2 && var5 != 4) {
         var21 = true;
      } else {
         int var13 = this.al.size();

         for(var5 = 0; var5 < var13; ++var5) {
            var16 = (am)this.al.get(var5);
            var16.a = -1;
            var16.b = -1;
            if (var16.ad == 3 || var16.ae == 3) {
               var16.a = 1;
               var16.b = 1;
            }
         }

         var21 = false;
         var7 = 0;

         for(var8 = 0; !var21; var8 = var6) {
            var9 = 0;
            var5 = 0;

            int var11;
            for(var6 = 0; var9 < var13; var6 = var11) {
               var16 = (am)this.al.get(var9);
               float var2;
               float var3;
               int var10;
               int var14;
               int var15;
               al var18;
               al var19;
               ak var23;
               ao var24;
               ak var25;
               if (var16.a == -1) {
                  var11 = this.ad;
                  if (var11 == 2) {
                     var16.a = 1;
                  } else {
                     var10 = var16.ad;
                     if (var10 == 3) {
                        var16.a = 1;
                     } else if (var11 != 2 && var10 == 4) {
                        var17 = var16.i;
                        var17.f = var1.e(var17);
                        var17 = var16.k;
                        var17.f = var1.e(var17);
                        var17 = var16.i;
                        var10 = var17.c;
                        var11 = this.h() - var16.k.c;
                        var1.h(var17.f, var10);
                        var1.h(var16.k.f, var11);
                        var16.k(var10, var11);
                        var16.a = 2;
                     } else {
                        label427: {
                           var17 = var16.i;
                           var18 = var17.b;
                           if (var18 != null) {
                              var19 = var16.k.b;
                              if (var19 != null) {
                                 if (var18.a == this && var19.a == this) {
                                    var10 = var17.a();
                                    var11 = var16.k.a();
                                    if (this.ad == 3) {
                                       var11 = this.h() - var11;
                                    } else {
                                       var14 = var16.h();
                                       var15 = this.h();
                                       var2 = var16.H;
                                       var10 += (int)((float)(var15 - var10 - var11 - var14) * var2 + 0.5F);
                                       var11 = var10 + var16.h();
                                    }

                                    var17 = var16.i;
                                    var17.f = var1.e(var17);
                                    var17 = var16.k;
                                    var17.f = var1.e(var17);
                                    var1.h(var16.i.f, var10);
                                    var1.h(var16.k.f, var11);
                                    var16.a = 2;
                                    var16.k(var10, var11);
                                    break label427;
                                 }

                                 var16.a = 1;
                                 break label427;
                              }
                           }

                           if (var18 != null && var18.a == this) {
                              var11 = var17.a();
                              var10 = var16.h() + var11;
                              var17 = var16.i;
                              var17.f = var1.e(var17);
                              var17 = var16.k;
                              var17.f = var1.e(var17);
                              var1.h(var16.i.f, var11);
                              var1.h(var16.k.f, var10);
                              var16.a = 2;
                              var16.k(var11, var10);
                           } else {
                              var19 = var16.k.b;
                              if (var19 != null && var19.a == this) {
                                 var17.f = var1.e(var17);
                                 var17 = var16.k;
                                 var17.f = var1.e(var17);
                                 var10 = this.h() - var16.k.a();
                                 var11 = var10 - var16.h();
                                 var1.h(var16.i.f, var11);
                                 var1.h(var16.k.f, var10);
                                 var16.a = 2;
                                 var16.k(var11, var10);
                              } else if (var18 != null && var18.a.a == 2) {
                                 var25 = var18.f;
                                 var17.f = var1.e(var17);
                                 var17 = var16.k;
                                 var17.f = var1.e(var17);
                                 var3 = var25.d;
                                 var2 = (float)var16.i.a();
                                 var11 = var16.h();
                                 var10 = (int)(var3 + var2 + 0.5F);
                                 var11 += var10;
                                 var1.h(var16.i.f, var10);
                                 var1.h(var16.k.f, var11);
                                 var16.a = 2;
                                 var16.k(var10, var11);
                              } else if (var19 != null && var19.a.a == 2) {
                                 var25 = var19.f;
                                 var17.f = var1.e(var17);
                                 var17 = var16.k;
                                 var17.f = var1.e(var17);
                                 var2 = var25.d;
                                 var3 = (float)var16.k.a();
                                 var11 = var16.h();
                                 var10 = (int)(var2 - var3 + 0.5F);
                                 var11 = var10 - var11;
                                 var1.h(var16.i.f, var11);
                                 var1.h(var16.k.f, var10);
                                 var16.a = 2;
                                 var16.k(var11, var10);
                              } else if (var18 == null && var19 == null) {
                                 if (var16 instanceof ao) {
                                    var24 = (ao)var16;
                                    if (var24.ai == 1) {
                                       var17.f = var1.e(var17);
                                       var17 = var16.k;
                                       var17.f = var1.e(var17);
                                       var10 = var24.ag;
                                       if (var10 != -1) {
                                          var2 = (float)var10;
                                       } else {
                                          var10 = var24.ah;
                                          if (var10 != -1) {
                                             var2 = (float)(this.h() - var10);
                                          } else {
                                             var2 = (float)this.h() * var24.af;
                                          }
                                       }

                                       var23 = var16.i.f;
                                       var10 = (int)(var2 + 0.5F);
                                       var1.h(var23, var10);
                                       var1.h(var16.k.f, var10);
                                       var16.a = 2;
                                       var16.b = 2;
                                       var16.k(var10, var10);
                                       var16.o(0, this.d());
                                    }
                                 } else {
                                    var17.f = var1.e(var17);
                                    var17 = var16.k;
                                    var17.f = var1.e(var17);
                                    var10 = var16.w;
                                    var11 = var16.h();
                                    var1.h(var16.i.f, var10);
                                    var1.h(var16.k.f, var11 + var10);
                                    var16.a = 2;
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               if (var16.b == -1) {
                  var10 = this.ae;
                  if (var10 == 2) {
                     var16.b = 1;
                  } else {
                     var11 = var16.ae;
                     if (var11 == 3) {
                        var16.b = 1;
                     } else if (var10 != 2 && var11 == 4) {
                        var17 = var16.j;
                        var17.f = var1.e(var17);
                        var17 = var16.l;
                        var17.f = var1.e(var17);
                        var17 = var16.j;
                        var11 = var17.c;
                        var10 = this.d() - var16.l.c;
                        var1.h(var17.f, var11);
                        var1.h(var16.l.f, var10);
                        if (var16.C > 0 || var16.K == 8) {
                           var17 = var16.m;
                           var17.f = var1.e(var17);
                           var1.h(var16.m.f, var16.C + var11);
                        }

                        var16.o(var11, var10);
                        var16.b = 2;
                     } else {
                        label431: {
                           var17 = var16.j;
                           var18 = var17.b;
                           if (var18 != null) {
                              var19 = var16.l.b;
                              if (var19 != null) {
                                 if (var18.a == this && var19.a == this) {
                                    var10 = var17.a();
                                    var14 = var16.l.a();
                                    if (this.ae == 3) {
                                       var11 = var16.d() + var10;
                                    } else {
                                       var15 = var16.d();
                                       var11 = this.d();
                                       var2 = (float)var10;
                                       float var4 = var16.I;
                                       var3 = (float)(var11 - var10 - var14 - var15);
                                       var11 = var16.d();
                                       var10 = (int)(var2 + var3 * var4 + 0.5F);
                                       var11 += var10;
                                    }

                                    var17 = var16.j;
                                    var17.f = var1.e(var17);
                                    var17 = var16.l;
                                    var17.f = var1.e(var17);
                                    var1.h(var16.j.f, var10);
                                    var1.h(var16.l.f, var11);
                                    if (var16.C > 0 || var16.K == 8) {
                                       var17 = var16.m;
                                       var17.f = var1.e(var17);
                                       var1.h(var16.m.f, var16.C + var10);
                                    }

                                    var16.b = 2;
                                    var16.o(var10, var11);
                                    break label431;
                                 }

                                 var16.b = 1;
                                 break label431;
                              }
                           }

                           if (var18 != null && var18.a == this) {
                              var10 = var17.a();
                              var11 = var16.d() + var10;
                              var17 = var16.j;
                              var17.f = var1.e(var17);
                              var17 = var16.l;
                              var17.f = var1.e(var17);
                              var1.h(var16.j.f, var10);
                              var1.h(var16.l.f, var11);
                              if (var16.C > 0 || var16.K == 8) {
                                 var17 = var16.m;
                                 var17.f = var1.e(var17);
                                 var1.h(var16.m.f, var16.C + var10);
                              }

                              var16.b = 2;
                              var16.o(var10, var11);
                           } else {
                              al var20 = var16.l.b;
                              if (var20 != null && var20.a == this) {
                                 var17.f = var1.e(var17);
                                 var17 = var16.l;
                                 var17.f = var1.e(var17);
                                 var11 = this.d() - var16.l.a();
                                 var10 = var11 - var16.d();
                                 var1.h(var16.j.f, var10);
                                 var1.h(var16.l.f, var11);
                                 if (var16.C > 0 || var16.K == 8) {
                                    var17 = var16.m;
                                    var17.f = var1.e(var17);
                                    var1.h(var16.m.f, var16.C + var10);
                                 }

                                 var16.b = 2;
                                 var16.o(var10, var11);
                              } else if (var18 != null && var18.a.b == 2) {
                                 var25 = var18.f;
                                 var17.f = var1.e(var17);
                                 var17 = var16.l;
                                 var17.f = var1.e(var17);
                                 var2 = var25.d;
                                 var3 = (float)var16.j.a();
                                 var11 = var16.d();
                                 var10 = (int)(var2 + var3 + 0.5F);
                                 var11 += var10;
                                 var1.h(var16.j.f, var10);
                                 var1.h(var16.l.f, var11);
                                 if (var16.C > 0 || var16.K == 8) {
                                    var17 = var16.m;
                                    var17.f = var1.e(var17);
                                    var1.h(var16.m.f, var16.C + var10);
                                 }

                                 var16.b = 2;
                                 var16.o(var10, var11);
                              } else if (var20 != null && var20.a.b == 2) {
                                 var25 = var20.f;
                                 var17.f = var1.e(var17);
                                 var17 = var16.l;
                                 var17.f = var1.e(var17);
                                 var2 = var25.d;
                                 var3 = (float)var16.l.a();
                                 var11 = var16.d();
                                 var10 = (int)(var2 - var3 + 0.5F);
                                 var11 = var10 - var11;
                                 var1.h(var16.j.f, var11);
                                 var1.h(var16.l.f, var10);
                                 if (var16.C > 0 || var16.K == 8) {
                                    var17 = var16.m;
                                    var17.f = var1.e(var17);
                                    var1.h(var16.m.f, var16.C + var11);
                                 }

                                 var16.b = 2;
                                 var16.o(var11, var10);
                              } else {
                                 var19 = var16.m.b;
                                 if (var19 != null && var19.a.b == 2) {
                                    var25 = var19.f;
                                    var17.f = var1.e(var17);
                                    var17 = var16.l;
                                    var17.f = var1.e(var17);
                                    var2 = var25.d;
                                    var3 = (float)var16.C;
                                    var11 = var16.d();
                                    var10 = (int)(var2 - var3 + 0.5F);
                                    var11 += var10;
                                    var1.h(var16.j.f, var10);
                                    var1.h(var16.l.f, var11);
                                    var17 = var16.m;
                                    var17.f = var1.e(var17);
                                    var1.h(var16.m.f, var16.C + var10);
                                    var16.b = 2;
                                    var16.o(var10, var11);
                                 } else if (var19 == null && var18 == null && var20 == null) {
                                    if (var16 instanceof ao) {
                                       var24 = (ao)var16;
                                       if (var24.ai == 0) {
                                          var17.f = var1.e(var17);
                                          var17 = var16.l;
                                          var17.f = var1.e(var17);
                                          var10 = var24.ag;
                                          if (var10 != -1) {
                                             var2 = (float)var10;
                                          } else {
                                             var10 = var24.ah;
                                             if (var10 != -1) {
                                                var2 = (float)(this.d() - var10);
                                             } else {
                                                var2 = (float)this.d() * var24.af;
                                             }
                                          }

                                          var23 = var16.j.f;
                                          var10 = (int)(var2 + 0.5F);
                                          var1.h(var23, var10);
                                          var1.h(var16.l.f, var10);
                                          var16.b = 2;
                                          var16.a = 2;
                                          var16.o(var10, var10);
                                          var16.k(0, this.h());
                                       }
                                    } else {
                                       var17.f = var1.e(var17);
                                       var17 = var16.l;
                                       var17.f = var1.e(var17);
                                       var10 = var16.x;
                                       var11 = var16.d();
                                       var1.h(var16.j.f, var10);
                                       var1.h(var16.l.f, var11 + var10);
                                       if (var16.C > 0 || var16.K == 8) {
                                          var17 = var16.m;
                                          var17.f = var1.e(var17);
                                          var1.h(var16.m.f, var10 + var16.C);
                                       }

                                       var16.b = 2;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               var10 = var5;
               if (var16.b == -1) {
                  var10 = var5 + 1;
               }

               var11 = var6;
               if (var16.a == -1) {
                  var11 = var6 + 1;
               }

               ++var9;
               var5 = var10;
            }

            boolean var22;
            label377: {
               label408: {
                  if (var5 == 0) {
                     if (var6 == 0) {
                        break label408;
                     }

                     var9 = 0;
                  } else {
                     var9 = var5;
                  }

                  if (var7 != var9 || var8 != var6) {
                     var22 = false;
                     break label377;
                  }
               }

               var22 = true;
            }

            var21 = var22;
            var7 = var5;
         }

         var8 = 0;
         var6 = 0;

         for(var5 = 0; var5 < var13; var6 = var9) {
            label242: {
               var16 = (am)this.al.get(var5);
               var9 = var16.a;
               if (var9 != 1) {
                  var7 = var8;
                  if (var9 != -1) {
                     break label242;
                  }
               }

               var7 = var8 + 1;
            }

            label247: {
               var8 = var16.b;
               if (var8 != 1) {
                  var9 = var6;
                  if (var8 != -1) {
                     break label247;
                  }
               }

               var9 = var6 + 1;
            }

            ++var5;
            var8 = var7;
         }

         if (var8 == 0) {
            if (var6 == 0) {
               return false;
            }

            var21 = false;
         } else {
            var21 = false;
         }
      }

      for(var6 = 0; var6 < var12; ++var6) {
         var16 = (am)this.al.get(var6);
         if (var16 instanceof an) {
            var7 = var16.ad;
            var9 = var16.ae;
            if (var7 == 2) {
               var16.v(1);
               var7 = 2;
            }

            var8 = var9;
            if (var9 == 2) {
               var16.w(1);
               var8 = 2;
            }

            var16.x(var1);
            if (var7 == 2) {
               var16.v(2);
            }

            if (var8 == 2) {
               var16.w(2);
            }
         } else {
            if (var21) {
               if (this.ad != 2 && var16.ad == 4) {
                  var17 = var16.i;
                  var17.f = var1.e(var17);
                  var17 = var16.k;
                  var17.f = var1.e(var17);
                  var17 = var16.i;
                  var7 = var17.c;
                  var8 = this.h() - var16.k.c;
                  var1.h(var17.f, var7);
                  var1.h(var16.k.f, var8);
                  var16.k(var7, var8);
                  var16.a = 2;
               }

               if (this.ae != 2 && var16.ae == 4) {
                  var17 = var16.j;
                  var17.f = var1.e(var17);
                  var17 = var16.l;
                  var17.f = var1.e(var17);
                  var17 = var16.j;
                  var8 = var17.c;
                  var7 = this.d() - var16.l.c;
                  var1.h(var17.f, var8);
                  var1.h(var16.l.f, var7);
                  if (var16.C > 0 || var16.K == 8) {
                     var17 = var16.m;
                     var17.f = var1.e(var17);
                     var1.h(var16.m.f, var16.C + var8);
                  }

                  var16.o(var8, var7);
                  var16.b = 2;
               }
            }

            var16.x(var1);
         }
      }

      if (this.an > 0) {
         this.H(var1);
      }

      if (this.ao > 0) {
         this.I(var1);
      }

      return true;
   }

   public final void i() {
      this.af.l();
      super.i();
   }
}
