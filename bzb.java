public final class bzb extends bzj {
   public int a = 0;
   public boolean b = true;
   public int c = 0;
   boolean d = false;

   public final int a() {
      switch(this.a) {
      case 0:
      case 1:
         return 0;
      case 2:
      case 3:
         return 1;
      default:
         return -1;
      }
   }

   public final void b(byv var1, boolean var2) {
      bze[] var9 = this.S;
      var9[0] = this.K;
      var9[2] = this.L;
      var9[1] = this.M;
      var9[3] = this.N;
      int var3 = 0;

      while(true) {
         var9 = this.S;
         int var4 = var9.length;
         bze var19;
         if (var3 >= 6) {
            var3 = this.a;
            if (var3 >= 0 && var3 < 4) {
               var19 = var9[var3];
               if (!this.d) {
                  this.c();
               }

               if (this.d) {
                  this.d = false;
                  var3 = this.a;
                  if (var3 != 0 && var3 != 1) {
                     if (var3 != 2 && var3 != 3) {
                        return;
                     } else {
                        var1.f(this.L.i, this.ab);
                        var1.f(this.N.i, this.ab);
                        return;
                     }
                  } else {
                     var1.f(this.K.i, this.aa);
                     var1.f(this.M.i, this.aa);
                     return;
                  }
               } else {
                  var3 = 0;

                  boolean var5;
                  while(true) {
                     if (var3 >= this.at) {
                        var5 = false;
                        break;
                     }

                     bzf var10 = this.as[var3];
                     if (this.b || var10.d()) {
                        var4 = this.a;
                        if ((var4 == 0 || var4 == 1) && var10.O() == 3 && var10.K.f != null && var10.M.f != null) {
                           var5 = true;
                           break;
                        }

                        var4 = this.a;
                        if ((var4 == 2 || var4 == 3) && var10.P() == 3 && var10.L.f != null && var10.N.f != null) {
                           var5 = true;
                           break;
                        }
                     }

                     ++var3;
                  }

                  boolean var15;
                  if (!this.K.f()) {
                     if (this.M.f()) {
                        var15 = true;
                     } else {
                        var15 = false;
                     }
                  } else {
                     var15 = true;
                  }

                  boolean var14;
                  if (!this.L.f()) {
                     if (this.N.f()) {
                        var14 = true;
                     } else {
                        var14 = false;
                     }
                  } else {
                     var14 = true;
                  }

                  byte var16;
                  int var17;
                  label149: {
                     byte var7;
                     label148: {
                        if (!var5) {
                           int var8 = this.a;
                           var7 = 5;
                           var17 = var8;
                           boolean var6 = var15;
                           if (var8 == 0) {
                              if (var15) {
                                 break label148;
                              }

                              var17 = 0;
                              var6 = false;
                           }

                           var15 = var14;
                           if (var17 == 2) {
                              if (var14) {
                                 break label148;
                              }

                              var15 = false;
                           }

                           if (var17 == 1 && var6) {
                              break label148;
                           }

                           if (var17 == 3 && var15) {
                              var16 = var7;
                              break label149;
                           }
                        }

                        var16 = 4;
                        break label149;
                     }

                     var16 = var7;
                  }

                  for(var4 = 0; var4 < this.at; ++var4) {
                     bzf var11 = this.as[var4];
                     if (this.b || var11.d()) {
                        byz var20 = var1.b(var11.S[this.a]);
                        bze[] var21 = var11.S;
                        int var18 = this.a;
                        bze var22 = var21[var18];
                        var22.i = var20;
                        bze var12 = var22.f;
                        if (var12 != null && var12.d == this) {
                           var17 = var22.g;
                        } else {
                           var17 = 0;
                        }

                        byz var13;
                        byz var23;
                        byu var24;
                        if (var18 != 0 && var18 != 2) {
                           var23 = var19.i;
                           var18 = this.c;
                           var24 = var1.a();
                           var13 = var1.c();
                           var13.e = 0;
                           var24.h(var23, var20, var13, var18 + var17);
                           var1.e(var24);
                        } else {
                           var23 = var19.i;
                           var18 = this.c;
                           var24 = var1.a();
                           var13 = var1.c();
                           var13.e = 0;
                           var24.i(var23, var20, var13, var18 - var17);
                           var1.e(var24);
                        }

                        var1.m(var19.i, var20, this.c + var17, var16);
                     }
                  }

                  var3 = this.a;
                  if (var3 == 0) {
                     var1.m(this.M.i, this.K.i, 0, 8);
                     var1.m(this.K.i, this.V.M.i, 0, 4);
                     var1.m(this.K.i, this.V.K.i, 0, 0);
                     return;
                  } else if (var3 == 1) {
                     var1.m(this.K.i, this.M.i, 0, 8);
                     var1.m(this.K.i, this.V.K.i, 0, 4);
                     var1.m(this.K.i, this.V.M.i, 0, 0);
                     return;
                  } else if (var3 == 2) {
                     var1.m(this.N.i, this.L.i, 0, 8);
                     var1.m(this.L.i, this.V.N.i, 0, 4);
                     var1.m(this.L.i, this.V.L.i, 0, 0);
                     return;
                  } else {
                     if (var3 == 3) {
                        var1.m(this.L.i, this.N.i, 0, 8);
                        var1.m(this.L.i, this.V.L.i, 0, 4);
                        var1.m(this.L.i, this.V.N.i, 0, 0);
                     }

                     return;
                  }
               }
            } else {
               return;
            }
         }

         var19 = var9[var3];
         var19.i = var1.b(var19);
         ++var3;
      }
   }

   public final boolean c() {
      int var4 = 0;
      int var2 = 0;
      boolean var3 = true;

      while(true) {
         boolean var7;
         label101: {
            int var1 = this.at;
            bzf var6;
            if (var2 >= var1) {
               if (var3 && var1 > 0) {
                  int var9 = 0;

                  for(boolean var8 = false; var4 < this.at; var9 = var1) {
                     var6 = this.as[var4];
                     if (!this.b && !var6.d()) {
                        var1 = var9;
                     } else {
                        var1 = var9;
                        if (!var8) {
                           var2 = this.a;
                           if (var2 == 0) {
                              var1 = var6.m(bzd.b).a();
                           } else if (var2 == 1) {
                              var1 = var6.m(bzd.d).a();
                           } else if (var2 == 2) {
                              var1 = var6.m(bzd.c).a();
                           } else {
                              var1 = var9;
                              if (var2 == 3) {
                                 var1 = var6.m(bzd.e).a();
                              }
                           }
                        }

                        var2 = this.a;
                        if (var2 == 0) {
                           var1 = Math.min(var1, var6.m(bzd.b).a());
                           var8 = true;
                        } else if (var2 == 1) {
                           var1 = Math.max(var1, var6.m(bzd.d).a());
                           var8 = true;
                        } else if (var2 == 2) {
                           var1 = Math.min(var1, var6.m(bzd.c).a());
                           var8 = true;
                        } else {
                           if (var2 == 3) {
                              var1 = Math.max(var1, var6.m(bzd.e).a());
                           }

                           var8 = true;
                        }
                     }

                     ++var4;
                  }

                  var1 = var9 + this.c;
                  var2 = this.a;
                  if (var2 != 0 && var2 != 1) {
                     this.z(var1, var1);
                  } else {
                     this.y(var1, var1);
                  }

                  this.d = true;
                  return true;
               }

               return false;
            }

            var6 = this.as[var2];
            if (!this.b) {
               var7 = var3;
               if (!var6.d()) {
                  break label101;
               }
            }

            var1 = this.a;
            if ((var1 == 0 || var1 == 1) && !var6.e()) {
               var7 = false;
            } else {
               label104: {
                  int var5 = this.a;
                  if (var5 != 2) {
                     var7 = var3;
                     if (var5 != 3) {
                        break label104;
                     }
                  }

                  var7 = var3;
                  if (!var6.f()) {
                     var7 = false;
                  }
               }
            }
         }

         ++var2;
         var3 = var7;
      }
   }

   public final boolean d() {
      return true;
   }

   public final boolean e() {
      return this.d;
   }

   public final boolean f() {
      return this.d;
   }

   public final String toString() {
      StringBuilder var2 = new StringBuilder();
      var2.append("[Barrier] ");
      var2.append(super.aj);
      var2.append(" {");
      String var5 = var2.toString();

      for(int var1 = 0; var1 < this.at; ++var1) {
         bzf var4 = this.as[var1];
         String var3 = var5;
         if (var1 > 0) {
            var3 = var5.concat(", ");
         }

         var5 = var3.concat(String.valueOf(var4.aj));
      }

      return var5.concat("}");
   }
}
