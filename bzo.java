import java.util.ArrayList;

public final class bzo extends bzz {
   ArrayList a = new ArrayList();
   private int b;

   public bzo(bzf var1, int var2) {
      super(var1);
      this.f = var2;
      var1 = this.d;
      bzf var6 = var1.o(var2);
      bzf var5 = var1;

      for(var1 = var6; var1 != null; var1 = var6) {
         var6 = var1.o(this.f);
         var5 = var1;
      }

      this.d = var5;
      this.a.add(var5.p(this.f));

      for(var1 = var5.n(this.f); var1 != null; var1 = var1.n(this.f)) {
         this.a.add(var1.p(this.f));
      }

      ArrayList var7 = this.a;
      int var3 = var7.size();

      for(var2 = 0; var2 < var3; ++var2) {
         bzz var8 = (bzz)var7.get(var2);
         int var4 = this.f;
         if (var4 == 0) {
            var8.d.f = this;
         } else if (var4 == 1) {
            var8.d.g = this;
         }
      }

      if (this.f == 0 && ((bzg)this.d.V).c && this.a.size() > 1) {
         var7 = this.a;
         this.d = ((bzz)var7.get(var7.size() - 1)).d;
      }

      if (this.f == 0) {
         var2 = this.d.ak;
      } else {
         var2 = this.d.al;
      }

      this.b = var2;
   }

   private final bzf g() {
      for(int var1 = 0; var1 < this.a.size(); ++var1) {
         bzf var2 = ((bzz)this.a.get(var1)).d;
         if (var2.ai != 8) {
            return var2;
         }
      }

      return null;
   }

   private final bzf n() {
      for(int var1 = this.a.size() - 1; var1 >= 0; --var1) {
         bzf var2 = ((bzz)this.a.get(var1)).d;
         if (var2.ai != 8) {
            return var2;
         }
      }

      return null;
   }

   public final long a() {
      int var2 = this.a.size();
      int var1 = 0;

      long var3;
      for(var3 = 0L; var1 < var2; ++var1) {
         bzz var5 = (bzz)this.a.get(var1);
         var3 = var3 + (long)var5.h.e + var5.a() + (long)var5.i.e;
      }

      return var3;
   }

   public final void b() {
      ArrayList var3 = this.a;
      int var2 = var3.size();

      int var1;
      for(var1 = 0; var1 < var2; ++var1) {
         ((bzz)var3.get(var1)).b();
      }

      var1 = this.a.size();
      if (var1 > 0) {
         bzf var4 = ((bzz)this.a.get(0)).d;
         bzf var6 = ((bzz)this.a.get(var1 - 1)).d;
         bze var7;
         bzr var9;
         if (this.f == 0) {
            bze var8 = var4.K;
            var7 = var6.M;
            bzr var5 = l(var8, 0);
            var1 = var8.b();
            var4 = this.g();
            if (var4 != null) {
               var1 = var4.K.b();
            }

            if (var5 != null) {
               j(this.h, var5, var1);
            }

            var9 = l(var7, 0);
            var1 = var7.b();
            var6 = this.n();
            if (var6 != null) {
               var1 = var6.M.b();
            }

            if (var9 != null) {
               j(this.i, var9, -var1);
            }
         } else {
            bze var10 = var4.L;
            var7 = var6.N;
            var9 = l(var10, 1);
            var1 = var10.b();
            bzf var11 = this.g();
            if (var11 != null) {
               var1 = var11.L.b();
            }

            if (var9 != null) {
               j(this.h, var9, var1);
            }

            var9 = l(var7, 1);
            var1 = var7.b();
            var6 = this.n();
            if (var6 != null) {
               var1 = var6.N.b();
            }

            if (var9 != null) {
               j(this.i, var9, -var1);
            }
         }

         this.h.a = this;
         this.i.a = this;
      }
   }

   public final void c() {
      for(int var1 = 0; var1 < this.a.size(); ++var1) {
         ((bzz)this.a.get(var1)).c();
      }

   }

   public final void d() {
      this.l = null;
      ArrayList var3 = this.a;
      int var2 = var3.size();

      for(int var1 = 0; var1 < var2; ++var1) {
         ((bzz)var3.get(var1)).d();
      }

   }

   public final boolean e() {
      int var2 = this.a.size();

      for(int var1 = 0; var1 < var2; ++var1) {
         if (!((bzz)this.a.get(var1)).e()) {
            return false;
         }
      }

      return true;
   }

   public final void f() {
      bzr var20 = this.h;
      if (var20.i) {
         bzr var21 = this.i;
         if (var21.i) {
            bzf var22 = this.d.V;
            boolean var19;
            if (var22 instanceof bzg) {
               var19 = ((bzg)var22).c;
            } else {
               var19 = false;
            }

            int var18 = var21.f - var20.f;
            int var17 = this.a.size();
            int var4 = 0;

            int var11;
            while(true) {
               if (var4 >= var17) {
                  var11 = -1;
                  break;
               }

               var11 = var4;
               if (((bzz)this.a.get(var4)).d.ai != 8) {
                  break;
               }

               ++var4;
            }

            int var16 = var17 - 1;
            var4 = var16;

            int var12;
            while(true) {
               if (var4 < 0) {
                  var12 = -1;
                  break;
               }

               var12 = var4;
               if (((bzz)this.a.get(var4)).d.ai != 8) {
                  break;
               }

               --var4;
            }

            int var8 = 0;

            float var1;
            float var2;
            float var3;
            int var5;
            int var6;
            int var7;
            int var9;
            int var10;
            int var13;
            bzz var26;
            bzs var29;
            while(true) {
               if (var8 >= 2) {
                  var5 = 0;
                  var6 = 0;
                  var7 = 0;
                  var1 = 0.0F;
                  break;
               }

               var6 = 0;
               var9 = 0;
               var4 = 0;
               var5 = 0;

               for(var1 = 0.0F; var9 < var17; var1 = var2) {
                  var26 = (bzz)this.a.get(var9);
                  bzf var24 = var26.d;
                  var7 = var6;
                  var10 = var4;
                  var13 = var5;
                  var2 = var1;
                  if (var24.ai != 8) {
                     var13 = var5 + 1;
                     var5 = var6;
                     if (var9 > 0) {
                        var5 = var6;
                        if (var9 >= var11) {
                           var5 = var6 + var26.h.e;
                        }
                     }

                     var29 = var26.e;
                     var6 = var29.f;
                     boolean var23;
                     if (var26.j != 3) {
                        var23 = true;
                     } else {
                        var23 = false;
                     }

                     if (var23) {
                        var10 = this.f;
                        if (var10 == 0) {
                           if (!var24.h.e.i) {
                              return;
                           }
                        } else if (var10 == 1 && !var24.i.e.i) {
                           return;
                        }
                     } else if (var26.c == 1 && var8 == 0) {
                        var6 = var29.m;
                        ++var4;
                        var23 = true;
                     } else if (var29.i) {
                        var23 = true;
                     }

                     if (!var23) {
                        var6 = var4 + 1;
                        var3 = var24.am[this.f];
                        var7 = var5;
                        var4 = var6;
                        var2 = var1;
                        if (var3 >= 0.0F) {
                           var2 = var1 + var3;
                           var7 = var5;
                           var4 = var6;
                        }
                     } else {
                        var7 = var5 + var6;
                        var2 = var1;
                     }

                     if (var9 < var16 && var9 < var12) {
                        var7 += -var26.i.e;
                        var10 = var4;
                     } else {
                        var10 = var4;
                     }
                  }

                  ++var9;
                  var6 = var7;
                  var4 = var10;
                  var5 = var13;
               }

               if (var6 < var18 || var4 == 0) {
                  var7 = var5;
                  var5 = var4;
                  break;
               }

               ++var8;
            }

            var8 = this.h.f;
            if (var19) {
               var8 = this.i.f;
            }

            var4 = var8;
            if (var6 > var18) {
               if (var19) {
                  var4 = var8 + (int)((float)(var6 - var18) / 2.0F + 0.5F);
               } else {
                  var4 = var8 - (int)((float)(var6 - var18) / 2.0F + 0.5F);
               }
            }

            bzz var25;
            if (var5 > 0) {
               var3 = (float)(var18 - var6);
               var2 = var3 / (float)var5 + 0.5F;
               var13 = 0;
               var8 = 0;

               for(var9 = var4; var13 < var17; ++var13) {
                  var25 = (bzz)this.a.get(var13);
                  bzf var28 = var25.d;
                  if (var28.ai != 8 && var25.j == 3) {
                     var29 = var25.e;
                     if (!var29.i) {
                        var4 = (int)var2;
                        if (var1 > 0.0F) {
                           var4 = (int)(var28.am[this.f] * var3 / var1 + 0.5F);
                        }

                        int var14;
                        if (this.f == 0) {
                           var10 = var28.x;
                           var14 = var28.w;
                        } else {
                           var10 = var28.A;
                           var14 = var28.z;
                        }

                        int var15;
                        if (var25.c == 1) {
                           var15 = Math.min(var4, var29.m);
                        } else {
                           var15 = var4;
                        }

                        var14 = Math.max(var14, var15);
                        if (var10 > 0) {
                           var10 = Math.min(var10, var14);
                        } else {
                           var10 = var14;
                        }

                        if (var10 != var4) {
                           ++var8;
                           var4 = var10;
                        }

                        var25.e.c(var4);
                     }
                  }
               }

               if (var8 <= 0) {
                  var4 = var6;
               } else {
                  var10 = var5 - var8;
                  var5 = 0;

                  for(var4 = 0; var5 < var17; ++var5) {
                     var25 = (bzz)this.a.get(var5);
                     if (var25.d.ai != 8) {
                        var6 = var4;
                        if (var5 > 0) {
                           var6 = var4;
                           if (var5 >= var11) {
                              var6 = var4 + var25.h.e;
                           }
                        }

                        var6 += var25.e.f;
                        var4 = var6;
                        if (var5 < var16) {
                           var4 = var6;
                           if (var5 < var12) {
                              var4 = var6 + -var25.i.e;
                           }
                        }
                     }
                  }

                  var5 = var10;
               }

               if (this.b == 2 && var8 == 0) {
                  this.b = 0;
                  var8 = var4;
                  var4 = var9;
               } else {
                  var8 = var4;
                  var4 = var9;
               }
            } else {
               var8 = var6;
            }

            if (var8 > var18) {
               this.b = 2;
            }

            var6 = var5;
            if (var7 > 0) {
               var6 = var5;
               if (var5 == 0) {
                  if (var11 == var12) {
                     this.b = 2;
                     var6 = 0;
                  } else {
                     var6 = 0;
                  }
               }
            }

            var5 = this.b;
            bzs var27;
            if (var5 == 1) {
               if (var7 > 1) {
                  var5 = (var18 - var8) / (var7 - 1);
               } else if (var7 == 1) {
                  var5 = (var18 - var8) / 2;
               } else {
                  var5 = 0;
               }

               var7 = var5;
               if (var6 > 0) {
                  var7 = 0;
               }

               var5 = 0;

               for(var6 = var4; var5 < var17; var6 = var4) {
                  if (var19) {
                     var4 = var17 - (var5 + 1);
                  } else {
                     var4 = var5;
                  }

                  var26 = (bzz)this.a.get(var4);
                  if (var26.d.ai == 8) {
                     var26.h.c(var6);
                     var26.i.c(var6);
                     var4 = var6;
                  } else {
                     var4 = var6;
                     if (var5 > 0) {
                        if (var19) {
                           var4 = var6 - var7;
                        } else {
                           var4 = var6 + var7;
                        }
                     }

                     var6 = var4;
                     if (var5 > 0) {
                        var6 = var4;
                        if (var5 >= var11) {
                           if (var19) {
                              var6 = var4 - var26.h.e;
                           } else {
                              var6 = var4 + var26.h.e;
                           }
                        }
                     }

                     if (var19) {
                        var26.i.c(var6);
                     } else {
                        var26.h.c(var6);
                     }

                     var27 = var26.e;
                     var4 = var27.f;
                     if (var26.j == 3 && var26.c == 1) {
                        var4 = var27.m;
                     }

                     if (var19) {
                        var6 -= var4;
                     } else {
                        var6 += var4;
                     }

                     if (var19) {
                        var26.h.c(var6);
                     } else {
                        var26.i.c(var6);
                     }

                     var26.g = true;
                     var4 = var6;
                     if (var5 < var16) {
                        var4 = var6;
                        if (var5 < var12) {
                           if (var19) {
                              var4 = var6 - -var26.i.e;
                           } else {
                              var4 = var6 + -var26.i.e;
                           }
                        }
                     }
                  }

                  ++var5;
               }
            } else if (var5 == 0) {
               var7 = (var18 - var8) / (var7 + 1);
               if (var6 > 0) {
                  var7 = 0;
               }

               for(var5 = 0; var5 < var17; ++var5) {
                  if (var19) {
                     var6 = var17 - (var5 + 1);
                  } else {
                     var6 = var5;
                  }

                  var26 = (bzz)this.a.get(var6);
                  if (var26.d.ai == 8) {
                     var26.h.c(var4);
                     var26.i.c(var4);
                  } else {
                     if (var19) {
                        var6 = var4 - var7;
                     } else {
                        var6 = var4 + var7;
                     }

                     var4 = var6;
                     if (var5 > 0) {
                        var4 = var6;
                        if (var5 >= var11) {
                           if (var19) {
                              var4 = var6 - var26.h.e;
                           } else {
                              var4 = var6 + var26.h.e;
                           }
                        }
                     }

                     if (var19) {
                        var26.i.c(var4);
                     } else {
                        var26.h.c(var4);
                     }

                     var27 = var26.e;
                     var6 = var27.f;
                     if (var26.j == 3 && var26.c == 1) {
                        var6 = Math.min(var6, var27.m);
                     }

                     if (var19) {
                        var6 = var4 - var6;
                     } else {
                        var6 += var4;
                     }

                     if (var19) {
                        var26.h.c(var6);
                     } else {
                        var26.i.c(var6);
                     }

                     var4 = var6;
                     if (var5 < var16) {
                        var4 = var6;
                        if (var5 < var12) {
                           if (var19) {
                              var4 = var6 - -var26.i.e;
                           } else {
                              var4 = var6 + -var26.i.e;
                           }
                        }
                     }
                  }
               }
            } else if (var5 == 2) {
               if (this.f == 0) {
                  var1 = this.d.af;
               } else {
                  var1 = this.d.ag;
               }

               var2 = var1;
               if (var19) {
                  var2 = 1.0F - var1;
               }

               var5 = (int)((float)(var18 - var8) * var2 + 0.5F);
               if (var5 >= 0) {
                  if (var6 > 0) {
                     var5 = 0;
                  }
               } else {
                  var5 = 0;
               }

               if (var19) {
                  var4 -= var5;
               } else {
                  var4 += var5;
               }

               for(var5 = 0; var5 < var17; ++var5) {
                  if (var19) {
                     var6 = var17 - (var5 + 1);
                  } else {
                     var6 = var5;
                  }

                  var25 = (bzz)this.a.get(var6);
                  if (var25.d.ai == 8) {
                     var25.h.c(var4);
                     var25.i.c(var4);
                  } else {
                     var6 = var4;
                     if (var5 > 0) {
                        var6 = var4;
                        if (var5 >= var11) {
                           if (var19) {
                              var6 = var4 - var25.h.e;
                           } else {
                              var6 = var4 + var25.h.e;
                           }
                        }
                     }

                     if (var19) {
                        var25.i.c(var6);
                     } else {
                        var25.h.c(var6);
                     }

                     bzs var30 = var25.e;
                     var4 = var30.f;
                     if (var25.j == 3 && var25.c == 1) {
                        var4 = var30.m;
                     }

                     if (var19) {
                        var6 -= var4;
                     } else {
                        var6 += var4;
                     }

                     if (var19) {
                        var25.h.c(var6);
                     } else {
                        var25.i.c(var6);
                     }

                     var4 = var6;
                     if (var5 < var16) {
                        var4 = var6;
                        if (var5 < var12) {
                           if (var19) {
                              var4 = var6 - -var25.i.e;
                           } else {
                              var4 = var6 + -var25.i.e;
                           }
                        }
                     }
                  }
               }
            }

            return;
         }
      }

   }

   public final String toString() {
      StringBuilder var4 = new StringBuilder("ChainRun ");
      String var3;
      if (this.f == 0) {
         var3 = "horizontal : ";
      } else {
         var3 = "vertical : ";
      }

      var4.append(var3);
      ArrayList var6 = this.a;
      int var2 = var6.size();

      for(int var1 = 0; var1 < var2; ++var1) {
         bzz var5 = (bzz)var6.get(var1);
         var4.append("<");
         var4.append(var5);
         var4.append("> ");
      }

      return var4.toString();
   }
}
