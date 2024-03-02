import java.util.ArrayList;
import java.util.List;

public final class bhj extends bhk {
   public final bba a;
   public boolean b;
   public final jjc c;
   private final xl e;
   private bjf f;
   private bhl g;
   private boolean h;
   private boolean i;

   public bhj(bba var1) {
      var1.getClass();
      super();
      this.a = var1;
      this.c = new jjc((byte[])null);
      this.e = new xl(2);
      this.b = true;
      this.i = true;
   }

   public final void a() {
      axf var4 = super.d;
      int var3 = var4.b;
      int var1;
      int var2;
      if (var3 > 0) {
         Object[] var9 = var4.a;
         var1 = 0;

         do {
            ((bhj)var9[var1]).a();
            var2 = var1 + 1;
            var1 = var2;
         } while(var2 < var3);
      }

      bba var7 = this.a;
      axf var6 = null;

      while(true) {
         do {
            if (var7 == null) {
               return;
            }

            if (var7 instanceof bni) {
               ((bni)var7).ey();
               var4 = var6;
               break;
            }

            var4 = var6;
            if ((var7.q & 16) == 0) {
               break;
            }

            var4 = var6;
            if (!(var7 instanceof blh)) {
               break;
            }

            bba var5 = ((blh)var7).A;
            var1 = 0;

            for(var4 = var6; var5 != null; var1 = var2) {
               bba var10 = var7;
               axf var8 = var4;
               var2 = var1;
               if ((var5.q & 16) != 0) {
                  var2 = var1 + 1;
                  if (var2 == 1) {
                     var10 = var5;
                     var8 = var4;
                  } else {
                     var6 = var4;
                     if (var4 == null) {
                        var6 = new axf(new bba[16]);
                     }

                     if (var7 != null) {
                        var6.p(var7);
                     }

                     var6.p(var5);
                     var4 = null;
                     var8 = var6;
                     var10 = var4;
                  }
               }

               var5 = var5.t;
               var7 = var10;
               var4 = var8;
            }

            var6 = var4;
         } while(var1 == 1);

         var7 = jj.f(var4);
         var6 = var4;
      }
   }

   public final boolean b(xl var1, bjf var2, blj var3, boolean var4) {
      boolean var23 = super.b(var1, var2, var3, var4);
      bba var30 = this.a;
      if (!var30.y) {
         return true;
      } else {
         axf var29 = null;

         while(true) {
            int var5;
            axf var27;
            do {
               int var6;
               if (var30 == null) {
                  var5 = var1.b();

                  boolean var24;
                  boolean var25;
                  List var40;
                  for(var6 = 0; var6 < var5; ++var6) {
                     long var9 = var1.c(var6);
                     bhw var39 = (bhw)var1.e(var6);
                     if (this.c.c(var9)) {
                        ArrayList var46 = new ArrayList(var39.a().size());
                        var40 = var39.a();
                        int var7 = var40.size();

                        long var11;
                        bjf var44;
                        for(int var8 = 0; var8 < var7; ++var8) {
                           bhg var45 = (bhg)var40.get(var8);
                           var11 = var45.a;
                           var44 = this.f;
                           var44.getClass();
                           var46.add(new bhg(var11, var44.e(var2, var45.b)));
                        }

                        xl var42 = this.e;
                        var44 = this.f;
                        var44.getClass();
                        long var21 = var44.e(var2, var39.g);
                        var44 = this.f;
                        var44.getClass();
                        var11 = var44.e(var2, var39.c);
                        var39.getClass();
                        long var19 = var39.a;
                        long var15 = var39.b;
                        var24 = var39.d;
                        long var13 = var39.f;
                        var25 = var39.h;
                        var7 = var39.i;
                        long var17 = var39.j;
                        bhw var47 = new bhw(var19, var15, var11, var24, var39.e, var13, var21, var25, var7, var46, var17);
                        var47.k = var39.k;
                        var42.g(var9, var47);
                     }
                  }

                  if (this.e.j()) {
                     this.c.a = 0;
                     super.d.g();
                     return true;
                  }

                  for(var5 = this.c.a - 1; var5 >= 0; --var5) {
                     if (!var1.i(this.c.b(var5))) {
                        this.c.e(var5);
                     }
                  }

                  ArrayList var32 = new ArrayList(this.e.b());
                  var6 = this.e.b();

                  for(var5 = 0; var5 < var6; ++var5) {
                     var32.add(this.e.e(var5));
                  }

                  bhl var34 = new bhl(var32, var3);
                  var40 = var34.a;
                  var6 = var40.size();
                  var5 = 0;

                  Object var33;
                  while(true) {
                     if (var5 >= var6) {
                        var33 = null;
                        break;
                     }

                     var33 = var40.get(var5);
                     if (var3.f(((bhw)var33).a)) {
                        break;
                     }

                     ++var5;
                  }

                  bhw var35 = (bhw)var33;
                  if (var35 != null) {
                     label234: {
                        if (!var4) {
                           this.b = false;
                           var4 = false;
                           var24 = false;
                           var25 = false;
                        } else {
                           var4 = this.b;
                           if (var4 || !var35.d && !var35.h) {
                              var24 = var4;
                              var25 = var4;
                           } else {
                              bjf var36 = this.f;
                              var36.getClass();
                              var4 = iy.o(var35, var36.d()) ^ true;
                              this.b = var4;
                              var24 = var4;
                              var25 = var4;
                           }
                        }

                        boolean var26 = this.h;
                        byte var38 = 5;
                        if (var4 != var26) {
                           var6 = var34.c;
                           if (c.n(var6, 3) || c.n(var6, 4) || c.n(var6, 5)) {
                              if (var25) {
                                 var38 = 4;
                              }

                              var34.c = var38;
                              break label234;
                           }
                        }

                        var5 = var34.c;
                        if (c.n(var5, 4) && var26 && !this.i || c.n(var5, 5) && var24 && var35.d) {
                           var34.c = 3;
                        }
                     }
                  }

                  label114: {
                     if (!var23 && c.n(var34.c, 3)) {
                        bhl var37 = this.g;
                        if (var37 != null) {
                           if (var37.a.size() != var34.a.size()) {
                              var4 = true;
                              break label114;
                           }

                           var6 = var34.a.size();
                           var5 = 0;

                           while(true) {
                              if (var5 >= var6) {
                                 var4 = false;
                                 break label114;
                              }

                              var35 = (bhw)var37.a.get(var5);
                              bhw var43 = (bhw)var34.a.get(var5);
                              if (!c.o(var35.c, var43.c)) {
                                 break;
                              }

                              ++var5;
                           }
                        }
                     }

                     var4 = true;
                  }

                  this.g = var34;
                  return var4;
               }

               if (var30 instanceof bni) {
                  this.f = jj.i((bni)var30, 16);
                  var27 = var29;
                  break;
               }

               var27 = var29;
               if ((var30.q & 16) == 0) {
                  break;
               }

               var27 = var29;
               if (!(var30 instanceof blh)) {
                  break;
               }

               bba var28 = ((blh)var30).A;
               var5 = 0;

               for(var27 = var29; var28 != null; var5 = var6) {
                  bba var41 = var30;
                  axf var31 = var27;
                  var6 = var5;
                  if ((var28.q & 16) != 0) {
                     var6 = var5 + 1;
                     if (var6 == 1) {
                        var41 = var28;
                        var31 = var27;
                     } else {
                        var29 = var27;
                        if (var27 == null) {
                           var29 = new axf(new bba[16]);
                        }

                        if (var30 != null) {
                           var29.p(var30);
                        }

                        var29.p(var28);
                        var27 = null;
                        var31 = var29;
                        var41 = var27;
                     }
                  }

                  var28 = var28.t;
                  var30 = var41;
                  var27 = var31;
               }

               var29 = var27;
            } while(var5 == 1);

            var30 = jj.f(var27);
            var29 = var27;
         }
      }
   }

   public final boolean c(blj var1) {
      int var2;
      int var3;
      int var4;
      boolean var6;
      long var7;
      if (this.e.j()) {
         var6 = false;
      } else {
         bba var12 = this.a;
         if (!var12.y) {
            var6 = false;
         } else {
            bhl var14 = this.g;
            var14.getClass();
            bjf var9 = this.f;
            var9.getClass();
            var7 = var9.d();
            axf var11 = null;

            label99:
            while(true) {
               axf var15;
               do {
                  var6 = true;
                  if (var12 == null) {
                     if (this.a.y) {
                        var15 = super.d;
                        var4 = var15.b;
                        if (var4 > 0) {
                           Object[] var18 = var15.a;
                           var2 = 0;

                           do {
                              ((bhj)var18[var2]).c(var1);
                              var3 = var2 + 1;
                              var2 = var3;
                           } while(var3 < var4);
                        }
                     }
                     break label99;
                  }

                  if (var12 instanceof bni) {
                     ((bni)var12).eC(var14, 3, var7);
                     var15 = var11;
                     break;
                  }

                  var15 = var11;
                  if ((var12.q & 16) == 0) {
                     break;
                  }

                  var15 = var11;
                  if (!(var12 instanceof blh)) {
                     break;
                  }

                  bba var10 = ((blh)var12).A;
                  var2 = 0;

                  for(var15 = var11; var10 != null; var2 = var3) {
                     bba var17 = var12;
                     axf var13 = var15;
                     var3 = var2;
                     if ((var10.q & 16) != 0) {
                        var3 = var2 + 1;
                        if (var3 == 1) {
                           var17 = var10;
                           var13 = var15;
                        } else {
                           var11 = var15;
                           if (var15 == null) {
                              var11 = new axf(new bba[16]);
                           }

                           if (var12 != null) {
                              var11.p(var12);
                           }

                           var11.p(var10);
                           var9 = null;
                           var13 = var11;
                           var17 = var9;
                        }
                     }

                     var10 = var10.t;
                     var12 = var17;
                     var15 = var13;
                  }

                  var11 = var15;
               } while(var2 == 1);

               var12 = jj.f(var15);
               var11 = var15;
            }
         }
      }

      super.f();
      bhl var16 = this.g;
      if (var16 != null) {
         this.h = this.b;
         List var20 = var16.a;
         var4 = var20.size();

         for(var2 = 0; var2 < var4; ++var2) {
            bhw var21 = (bhw)var20.get(var2);
            if (!var21.d && (!var1.f(var21.a) || !this.b)) {
               jjc var19 = this.c;
               var7 = var21.a;
               int var5 = var19.a;

               for(var3 = 0; var3 < var5; ++var3) {
                  if (var7 == var19.b(var3)) {
                     var19.e(var3);
                     break;
                  }
               }
            }
         }

         this.b = false;
         this.i = c.n(var16.c, 5);
      }

      this.e.f();
      this.f = null;
      return var6;
   }

   public final boolean d(blj var1, boolean var2) {
      boolean var7 = this.e.j();
      boolean var6 = false;
      if (!var7) {
         bba var13 = this.a;
         if (var13.y) {
            bhl var15 = this.g;
            var15.getClass();
            bjf var10 = this.f;
            var10.getClass();
            long var8 = var10.d();
            axf var12 = null;

            while(true) {
               int var4;
               axf var17;
               do {
                  int var3;
                  bba var11;
                  bba var19;
                  if (var13 == null) {
                     if (this.a.y) {
                        var17 = super.d;
                        int var5 = var17.b;
                        if (var5 > 0) {
                           Object[] var18 = var17.a;
                           var3 = 0;

                           do {
                              bhj var20 = (bhj)var18[var3];
                              this.f.getClass();
                              var20.d(var1, var2);
                              var4 = var3 + 1;
                              var3 = var4;
                           } while(var4 < var5);
                        }
                     }

                     var11 = this.a;
                     if (var11.y) {
                        var17 = null;

                        label88:
                        while(true) {
                           axf var16;
                           do {
                              if (var11 == null) {
                                 break label88;
                              }

                              if (var11 instanceof bni) {
                                 ((bni)var11).eC(var15, 2, var8);
                                 var16 = var17;
                                 break;
                              }

                              var16 = var17;
                              if ((var11.q & 16) == 0) {
                                 break;
                              }

                              var16 = var17;
                              if (!(var11 instanceof blh)) {
                                 break;
                              }

                              var13 = ((blh)var11).A;
                              var3 = 0;
                              var16 = var17;
                              var19 = var11;

                              axf var23;
                              for(bba var22 = var13; var22 != null; var16 = var23) {
                                 var4 = var3;
                                 var11 = var19;
                                 var23 = var16;
                                 if ((var22.q & 16) != 0) {
                                    var4 = var3 + 1;
                                    if (var4 == 1) {
                                       var11 = var22;
                                       var23 = var16;
                                    } else {
                                       axf var21 = var16;
                                       if (var16 == null) {
                                          var21 = new axf(new bba[16]);
                                       }

                                       if (var19 != null) {
                                          var21.p(var19);
                                       }

                                       var21.p(var22);
                                       var1 = null;
                                       var23 = var21;
                                       var11 = var1;
                                    }
                                 }

                                 var22 = var22.t;
                                 var3 = var4;
                                 var19 = var11;
                              }

                              var11 = var19;
                              var17 = var16;
                           } while(var3 == 1);

                           var11 = jj.f(var16);
                           var17 = var16;
                        }
                     }

                     var2 = true;
                     return var2;
                  }

                  if (var13 instanceof bni) {
                     ((bni)var13).eC(var15, 1, var8);
                     var17 = var12;
                     break;
                  }

                  var17 = var12;
                  if ((var13.q & 16) == 0) {
                     break;
                  }

                  var17 = var12;
                  if (!(var13 instanceof blh)) {
                     break;
                  }

                  var11 = ((blh)var13).A;
                  var4 = 0;

                  for(var17 = var12; var11 != null; var4 = var3) {
                     var19 = var13;
                     axf var14 = var17;
                     var3 = var4;
                     if ((var11.q & 16) != 0) {
                        var3 = var4 + 1;
                        if (var3 == 1) {
                           var19 = var11;
                           var14 = var17;
                        } else {
                           var12 = var17;
                           if (var17 == null) {
                              var12 = new axf(new bba[16]);
                           }

                           if (var13 != null) {
                              var12.p(var13);
                           }

                           var12.p(var11);
                           var10 = null;
                           var14 = var12;
                           var19 = var10;
                        }
                     }

                     var11 = var11.t;
                     var13 = var19;
                     var17 = var14;
                  }

                  var12 = var17;
               } while(var4 == 1);

               var13 = jj.f(var17);
               var12 = var17;
            }
         }
      }

      var2 = var6;
      return var2;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Node(pointerInputFilter=");
      var1.append(this.a);
      var1.append(", children=");
      var1.append(super.d);
      var1.append(", pointerIds=");
      var1.append(this.c);
      var1.append(')');
      return var1.toString();
   }
}
