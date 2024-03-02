import java.util.LinkedHashMap;
import java.util.Map;

public final class bjq {
   public final bmd a;
   public ast b;
   public bkm c;
   public int d;
   public int e;
   public final Map f;
   public final Map g;
   public final bjm h;
   public final bjl i;
   public final Map j;
   public final Map k;
   public final axf l;
   public int m;
   public int n;
   public final String o;
   private final bkl p;

   public bjq(bmd var1, bkm var2) {
      this.a = var1;
      this.c = var2;
      this.f = new LinkedHashMap();
      this.g = new LinkedHashMap();
      this.h = new bjm(this);
      this.i = new bjl(this);
      this.j = new LinkedHashMap();
      this.p = new bkl((byte[])null);
      this.k = new LinkedHashMap();
      this.l = new axf(new Object[16]);
      this.o = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing,, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
   }

   private final Object h(int var1) {
      bmd var2 = (bmd)this.a.z().get(var1);
      Object var3 = this.f.get(var2);
      var3.getClass();
      return ((bjk)var3).a;
   }

   public final bmd a(int var1) {
      bmd var2 = new bmd(true, 2, (byte[])null);
      bmd var3 = this.a;
      var3.g = true;
      var3.F(var1, var2);
      var3.g = false;
      return var2;
   }

   public final bmd b(Object var1) {
      int var2 = this.m;
      Object var7 = null;
      if (var2 == 0) {
         return null;
      } else {
         var2 = this.a.z().size() - this.n;
         int var6 = var2 - this.m;
         int var5 = var2 - 1;
         var2 = var5;

         int var3;
         while(true) {
            if (var2 < var6) {
               var3 = -1;
               break;
            }

            if (c.E(this.h(var2), var1)) {
               var3 = var2;
               break;
            }

            --var2;
         }

         int var4 = var2;
         var2 = var3;
         if (var3 == -1) {
            var2 = var5;

            while(true) {
               if (var2 < var6) {
                  var4 = var2;
                  var2 = -1;
                  break;
               }

               bmd var8 = (bmd)this.a.z().get(var2);
               Object var11 = this.f.get(var8);
               var11.getClass();
               bjk var12 = (bjk)var11;
               if (this.c.b(var1, var12.a)) {
                  var12.a = var1;
                  var4 = var2;
                  var2 = var2;
                  break;
               }

               --var2;
            }
         }

         bmd var9;
         if (var2 == -1) {
            var9 = (bmd)var7;
         } else {
            if (var4 != var6) {
               this.g(var4, var6);
            }

            --this.m;
            var9 = (bmd)this.a.z().get(var6);
            var7 = this.f.get(var9);
            var7.getClass();
            bjk var10 = (bjk)var7;
            var10.a(true);
            var10.d = true;
            dp.i();
         }

         return var9;
      }
   }

   public final void c(int var1) {
      this.m = 0;
      int var4 = this.a.z().size() - this.n - 1;
      if (var1 <= var4) {
         this.p.clear();
         int var2;
         if (var1 <= var4) {
            var2 = var1;

            while(true) {
               this.p.a(this.h(var2));
               if (var2 == var4) {
                  break;
               }

               ++var2;
            }
         }

         this.c.a(this.p);
         azk var5 = dp.f();

         boolean var3;
         label1325: {
            Throwable var10000;
            label1338: {
               azk var6;
               boolean var10001;
               try {
                  var6 = var5.v();
               } catch (Throwable var142) {
                  var10000 = var142;
                  var10001 = false;
                  break label1338;
               }

               var3 = false;
               var2 = var4;

               while(true) {
                  if (var2 < var1) {
                     try {
                        azk.D(var6);
                        break label1325;
                     } catch (Throwable var133) {
                        var10000 = var133;
                        var10001 = false;
                        break;
                     }
                  }

                  label1340: {
                     label1316: {
                        Object var7;
                        label1341: {
                           bjk var8;
                           bmd var9;
                           label1342: {
                              bmh var146;
                              try {
                                 var9 = (bmd)this.a.z().get(var2);
                                 var7 = this.f.get(var9);
                                 var7.getClass();
                                 var8 = (bjk)var7;
                                 var7 = var8.a;
                                 if (!this.p.contains(var7)) {
                                    break label1342;
                                 }

                                 var9.q().w();
                                 var146 = var9.p();
                              } catch (Throwable var141) {
                                 var10000 = var141;
                                 var10001 = false;
                                 break label1316;
                              }

                              if (var146 != null) {
                                 try {
                                    var146.u();
                                 } catch (Throwable var139) {
                                    var10000 = var139;
                                    var10001 = false;
                                    break label1316;
                                 }
                              }

                              try {
                                 ++this.m;
                              } catch (Throwable var138) {
                                 var10000 = var138;
                                 var10001 = false;
                                 break label1316;
                              }

                              try {
                                 if (!var8.b()) {
                                    break label1341;
                                 }

                                 var8.a(false);
                              } catch (Throwable var140) {
                                 var10000 = var140;
                                 var10001 = false;
                                 break label1316;
                              }

                              var3 = true;
                              break label1341;
                           }

                           bmd var10;
                           ass var145;
                           try {
                              var10 = this.a;
                              var10.g = true;
                              this.f.remove(var9);
                              var145 = var8.c;
                           } catch (Throwable var137) {
                              var10000 = var137;
                              var10001 = false;
                              break label1316;
                           }

                           if (var145 != null) {
                              try {
                                 var145.b();
                              } catch (Throwable var136) {
                                 var10000 = var136;
                                 var10001 = false;
                                 break label1316;
                              }
                           }

                           try {
                              this.a.R(var2, 1);
                              var10.g = false;
                           } catch (Throwable var135) {
                              var10000 = var135;
                              var10001 = false;
                              break label1316;
                           }
                        }

                        label1292:
                        try {
                           this.g.remove(var7);
                           break label1340;
                        } catch (Throwable var134) {
                           var10000 = var134;
                           var10001 = false;
                           break label1292;
                        }
                     }

                     Throwable var144 = var10000;

                     try {
                        azk.D(var6);
                        throw var144;
                     } catch (Throwable var132) {
                        var10000 = var132;
                        var10001 = false;
                        break;
                     }
                  }

                  --var2;
               }
            }

            Throwable var143 = var10000;
            var5.c();
            throw var143;
         }

         var5.c();
         if (var3) {
            dp.i();
         }
      }

      this.d();
   }

   public final void d() {
      StringBuilder var1;
      if (this.f.size() == this.a.z().size()) {
         if (this.a.z().size() - this.m - this.n >= 0) {
            if (this.j.size() != this.n) {
               var1 = new StringBuilder();
               var1.append("Incorrect state. Precomposed children ");
               var1.append(this.n);
               var1.append(". Map size ");
               var1.append(this.j.size());
               throw new IllegalArgumentException(var1.toString());
            }
         } else {
            var1 = new StringBuilder();
            var1.append("Incorrect state. Total children ");
            var1.append(this.a.z().size());
            var1.append(". Reusable children ");
            var1.append(this.m);
            var1.append(". Precomposed children ");
            var1.append(this.n);
            throw new IllegalArgumentException(var1.toString());
         }
      } else {
         var1 = new StringBuilder();
         var1.append("Inconsistency between the count of nodes tracked by the state (");
         var1.append(this.f.size());
         var1.append(") and the children count on the SubcomposeLayout (");
         var1.append(this.a.z().size());
         var1.append("). Are you trying to use the state of the disposed SubcomposeLayout?");
         throw new IllegalArgumentException(var1.toString());
      }
   }

   public final void e(bmd var1, Object var2, qvx var3) {
      Map var6 = this.f;
      Object var5 = var6.get(var1);
      if (var5 == null) {
         qvx var130 = bix.a;
         var2 = new bjk(var2, bix.a);
         var6.put(var1, var2);
      } else {
         var2 = var5;
      }

      bjk var131 = (bjk)var2;
      ass var132 = var131.c;
      boolean var128;
      if (var132 != null) {
         var2 = ((asw)var132).b;
         synchronized(var2){}
         boolean var111 = false;

         int var4;
         try {
            var111 = true;
            var4 = ((asw)var132).k.a;
            var111 = false;
         } finally {
            if (var111) {
               ;
            }
         }

         if (var4 > 0) {
            var128 = true;
         } else {
            var128 = false;
         }
      } else {
         var128 = true;
      }

      if (var131.b != var3 || var128 || var131.d) {
         var131.b = var3;
         azk var125 = dp.f();

         Throwable var10000;
         Throwable var123;
         label1130: {
            azk var133;
            boolean var10001;
            try {
               var133 = var125.v();
            } catch (Throwable var121) {
               var10000 = var121;
               var10001 = false;
               break label1130;
            }

            label1118: {
               bmd var7;
               ast var8;
               qvx var9;
               ass var126;
               try {
                  var7 = this.a;
                  var7.g = true;
                  var9 = var131.b;
                  var126 = var131.c;
                  var8 = this.b;
               } catch (Throwable var120) {
                  var10000 = var120;
                  var10001 = false;
                  break label1118;
               }

               if (var8 != null) {
                  label1131: {
                     ayt var134;
                     try {
                        afh var10 = new afh(var131, var9, 7, (byte[])null);
                        var134 = sr.r(-34810602, true, var10);
                     } catch (Throwable var119) {
                        var10000 = var119;
                        var10001 = false;
                        break label1131;
                     }

                     ass var122;
                     label1110: {
                        label1109: {
                           if (var126 != null) {
                              try {
                                 if (!((asw)var126).h) {
                                    break label1109;
                                 }
                              } catch (Throwable var118) {
                                 var10000 = var118;
                                 var10001 = false;
                                 break label1131;
                              }
                           }

                           try {
                              String var127 = bqx.a;
                              var1.getClass();
                              bnn var129 = new bnn(var1);
                              var122 = asx.a(var129, var8);
                              break label1110;
                           } catch (Throwable var117) {
                              var10000 = var117;
                              var10001 = false;
                              break label1131;
                           }
                        }

                        var122 = var126;
                     }

                     try {
                        var122.c(var134);
                        var131.c = var122;
                        var7.g = false;
                     } catch (Throwable var116) {
                        var10000 = var116;
                        var10001 = false;
                        break label1131;
                     }

                     try {
                        azk.D(var133);
                     } catch (Throwable var114) {
                        var10000 = var114;
                        var10001 = false;
                        break label1130;
                     }

                     var125.c();
                     var131.d = false;
                     return;
                  }
               } else {
                  label1097:
                  try {
                     IllegalStateException var124 = new IllegalStateException("parent composition reference not set");
                     throw var124;
                  } catch (Throwable var115) {
                     var10000 = var115;
                     var10001 = false;
                     break label1097;
                  }
               }
            }

            var123 = var10000;

            label1091:
            try {
               azk.D(var133);
               throw var123;
            } catch (Throwable var113) {
               var10000 = var113;
               var10001 = false;
               break label1091;
            }
         }

         var123 = var10000;
         var125.c();
         throw var123;
      }
   }

   public final bjp f(Object var1, qvx var2) {
      this.d();
      if (!this.g.containsKey(var1)) {
         this.k.remove(var1);
         Map var5 = this.j;
         Object var4 = var5.get(var1);
         Object var3 = var4;
         if (var4 == null) {
            var3 = this.b(var1);
            if (var3 != null) {
               this.g(this.a.z().indexOf(var3), this.a.z().size());
               ++this.n;
            } else {
               var3 = this.a(this.a.z().size());
               ++this.n;
            }

            var5.put(var1, var3);
         }

         this.e((bmd)var3, var1, var2);
      }

      return new bjp(this, var1);
   }

   public final void g(int var1, int var2) {
      bmd var3 = this.a;
      var3.g = true;
      var3.O(var1, var2, 1);
      var3.g = false;
   }
}
