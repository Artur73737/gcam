import java.util.List;

public final class bhz {
   private final bmd a;
   private final blq b;
   private boolean c;
   private final blj d;
   private final dmx e;

   public bhz(bmd var1) {
      var1.getClass();
      super();
      this.a = var1;
      this.d = new blj(var1.r());
      this.e = new dmx((char[])null, (byte[])null);
      this.b = new blq();
   }

   public final void a() {
      if (!this.c) {
         ((xl)this.e.a).f();
         blj var4 = this.d;
         axf var5 = ((bhk)var4.a).d;
         int var3 = var5.b;
         if (var3 > 0) {
            Object[] var6 = var5.a;
            int var1 = 0;

            int var2;
            do {
               ((bhj)var6[var1]).a();
               var2 = var1 + 1;
               var1 = var2;
            } while(var2 < var3);
         }

         ((bhk)var4.a).d.g();
      }

   }

   public final int b(blj var1, boa var2, boolean var3) {
      if (this.c) {
         return iy.i(false, false);
      } else {
         int var4;
         label11291: {
            Throwable var1081;
            label11324: {
               Throwable var10000;
               label11288: {
                  label11297: {
                     boolean var10001;
                     Object var19;
                     xl var20;
                     dmx var21;
                     try {
                        this.c = true;
                        var21 = this.e;
                        var20 = new xl(((List)var1.b).size());
                        var19 = var1.b;
                        var4 = ((List)var19).size();
                     } catch (Throwable var1080) {
                        var10000 = var1080;
                        var10001 = false;
                        break label11297;
                     }

                     int var5 = 0;

                     while(true) {
                        int var6;
                        long var12;
                        boolean var18;
                        if (var5 < var4) {
                           label11298: {
                              bhy var22;
                              Object var23;
                              bhx var1100;
                              try {
                                 var22 = (bhy)((List)var19).get(var5);
                                 var23 = var21.a;
                                 var12 = var22.a;
                                 var1100 = (bhx)((xl)var23).d(var12);
                              } catch (Throwable var1079) {
                                 var10000 = var1079;
                                 var10001 = false;
                                 break label11298;
                              }

                              long var14;
                              if (var1100 == null) {
                                 try {
                                    var12 = var22.b;
                                    var14 = var22.d;
                                 } catch (Throwable var1075) {
                                    var10000 = var1075;
                                    var10001 = false;
                                    break;
                                 }

                                 var18 = false;
                              } else {
                                 try {
                                    var12 = var1100.a;
                                    var14 = var2.c(var1100.b);
                                 } catch (Throwable var1078) {
                                    var10000 = var1078;
                                    var10001 = false;
                                    break label11298;
                                 }

                                 var18 = true;
                              }

                              label11271: {
                                 try {
                                    long var16 = var22.a;
                                    bhw var1101 = new bhw(var16, var22.b, var22.d, var22.e, var22.f, var12, var14, var18, var22.g, var22.i, var22.j);
                                    var20.g(var16, var1101);
                                    if (var22.e) {
                                       var23 = var21.a;
                                       var14 = var22.a;
                                       var12 = var22.b;
                                       var16 = var22.c;
                                       var6 = var22.g;
                                       bhx var24 = new bhx(var12, var16);
                                       ((xl)var23).g(var14, var24);
                                       break label11271;
                                    }
                                 } catch (Throwable var1077) {
                                    var10000 = var1077;
                                    var10001 = false;
                                    break label11298;
                                 }

                                 try {
                                    var23 = var21.a;
                                    var12 = var22.a;
                                    ((xl)var23).h(var12);
                                 } catch (Throwable var1076) {
                                    var10000 = var1076;
                                    var10001 = false;
                                    break label11298;
                                 }
                              }

                              ++var5;
                              continue;
                           }
                        } else {
                           label11299: {
                              blj var1093;
                              try {
                                 var1093 = new blj(var20, var1);
                                 var5 = ((xl)var1093.a).b();
                              } catch (Throwable var1074) {
                                 var10000 = var1074;
                                 var10001 = false;
                                 break label11299;
                              }

                              var4 = 0;

                              bhw var1082;
                              boolean var1088;
                              while(true) {
                                 if (var4 >= var5) {
                                    var1088 = true;
                                    break;
                                 }

                                 label11252: {
                                    label11251: {
                                       try {
                                          var1082 = (bhw)((xl)var1093.a).e(var4);
                                          if (!var1082.d) {
                                             if (var1082.h) {
                                                break label11252;
                                             }
                                             break label11251;
                                          }
                                       } catch (Throwable var1073) {
                                          var10000 = var1073;
                                          var10001 = false;
                                          break label11299;
                                       }

                                       var1088 = false;
                                       break;
                                    }

                                    ++var4;
                                    continue;
                                 }

                                 var1088 = false;
                                 break;
                              }

                              int var9;
                              try {
                                 var9 = ((xl)var1093.a).b();
                              } catch (Throwable var1072) {
                                 var10000 = var1072;
                                 var10001 = false;
                                 break label11299;
                              }

                              var6 = 0;

                              while(true) {
                                 int var7;
                                 int var8;
                                 Object var1084;
                                 axf var1085;
                                 Object var1086;
                                 boolean var1090;
                                 if (var6 >= var9) {
                                    label11317: {
                                       label11183: {
                                          try {
                                             ((bhk)this.d.a).e();
                                             var1 = this.d;
                                             Object var1095 = var1.a;
                                             Object var1097 = var1093.a;
                                             var1086 = var1.b;
                                             xl var1098 = (xl)var1097;
                                             if (((bhk)var1095).b(var1098, (bjf)var1086, var1093, var3)) {
                                                break label11183;
                                             }
                                          } catch (Throwable var1066) {
                                             var10000 = var1066;
                                             var10001 = false;
                                             break label11288;
                                          }

                                          var3 = false;
                                          break label11317;
                                       }

                                       try {
                                          var1085 = ((bhk)var1.a).d;
                                          var8 = var1085.b;
                                       } catch (Throwable var1055) {
                                          var10000 = var1055;
                                          var10001 = false;
                                          break label11288;
                                       }

                                       Object[] var1089;
                                       if (var8 <= 0) {
                                          var1090 = false;
                                       } else {
                                          try {
                                             var1089 = var1085.a;
                                          } catch (Throwable var1054) {
                                             var10000 = var1054;
                                             var10001 = false;
                                             break label11288;
                                          }

                                          boolean var1091 = false;
                                          var5 = 0;

                                          while(true) {
                                             label11173: {
                                                label11172: {
                                                   try {
                                                      if (((bhj)var1089[var5]).d(var1093, var3)) {
                                                         break label11172;
                                                      }
                                                   } catch (Throwable var1065) {
                                                      var10000 = var1065;
                                                      var10001 = false;
                                                      break label11288;
                                                   }

                                                   if (var1091) {
                                                      var1088 = true;
                                                   } else {
                                                      var1088 = false;
                                                   }
                                                   break label11173;
                                                }

                                                var1088 = true;
                                             }

                                             var7 = var5 + 1;
                                             var1091 = var1088;
                                             var5 = var7;
                                             if (var7 >= var8) {
                                                var1090 = var1088;
                                                break;
                                             }
                                          }
                                       }

                                       try {
                                          var1084 = var1.a;
                                          var1085 = ((bhk)var1084).d;
                                          var9 = var1085.b;
                                       } catch (Throwable var1053) {
                                          var10000 = var1053;
                                          var10001 = false;
                                          break label11288;
                                       }

                                       if (var9 <= 0) {
                                          var1088 = false;
                                       } else {
                                          try {
                                             var1089 = var1085.a;
                                          } catch (Throwable var1052) {
                                             var10000 = var1052;
                                             var10001 = false;
                                             break label11288;
                                          }

                                          var6 = 0;
                                          boolean var1092 = false;

                                          do {
                                             label11158: {
                                                label11157: {
                                                   try {
                                                      if (((bhj)var1089[var6]).c(var1093)) {
                                                         break label11157;
                                                      }
                                                   } catch (Throwable var1064) {
                                                      var10000 = var1064;
                                                      var10001 = false;
                                                      break label11288;
                                                   }

                                                   if (var1092) {
                                                      var1088 = true;
                                                   } else {
                                                      var1088 = false;
                                                   }
                                                   break label11158;
                                                }

                                                var1088 = true;
                                             }

                                             var8 = var6 + 1;
                                             var6 = var8;
                                             var1092 = var1088;
                                          } while(var8 < var9);
                                       }

                                       try {
                                          ((bhk)var1084).f();
                                       } catch (Throwable var1051) {
                                          var10000 = var1051;
                                          var10001 = false;
                                          break label11288;
                                       }

                                       if (!var1088 && !var1090) {
                                          var3 = false;
                                       } else {
                                          var3 = true;
                                       }
                                    }

                                    try {
                                       var5 = ((xl)var1093.a).b();
                                    } catch (Throwable var1050) {
                                       var10000 = var1050;
                                       var10001 = false;
                                       break label11288;
                                    }

                                    var4 = 0;

                                    while(true) {
                                       if (var4 >= var5) {
                                          var18 = false;
                                          break;
                                       }

                                       label11138: {
                                          try {
                                             var1082 = (bhw)((xl)var1093.a).e(var4);
                                             var1082.getClass();
                                             if (iy.q(var1082) && var1082.c()) {
                                                break label11138;
                                             }
                                          } catch (Throwable var1063) {
                                             var10000 = var1063;
                                             var10001 = false;
                                             break label11288;
                                          }

                                          ++var4;
                                          continue;
                                       }

                                       var18 = true;
                                       break;
                                    }

                                    try {
                                       var4 = iy.i(var3, var18);
                                       break label11291;
                                    } catch (Throwable var1049) {
                                       var10000 = var1049;
                                       var10001 = false;
                                       break label11288;
                                    }
                                 }

                                 try {
                                    var1082 = (bhw)((xl)var1093.a).e(var6);
                                 } catch (Throwable var1068) {
                                    var10000 = var1068;
                                    var10001 = false;
                                    break;
                                 }

                                 label11302: {
                                    if (!var1088) {
                                       try {
                                          var1082.getClass();
                                          if (!iy.l(var1082)) {
                                             break label11302;
                                          }
                                       } catch (Throwable var1071) {
                                          var10000 = var1071;
                                          var10001 = false;
                                          break;
                                       }
                                    }

                                    try {
                                       var18 = c.n(var1082.i, 1);
                                    } catch (Throwable var1067) {
                                       var10000 = var1067;
                                       var10001 = false;
                                       break;
                                    }

                                    int var10;
                                    blq var1094;
                                    try {
                                       this.a.E(var1082.c, this.b, var18, true);
                                       var1094 = this.b;
                                       if (var1094.isEmpty()) {
                                          break label11302;
                                       }

                                       blj var1083 = this.d;
                                       var12 = var1082.a;
                                       var1084 = var1083.a;
                                       var10 = var1094.d;
                                    } catch (Throwable var1070) {
                                       var10000 = var1070;
                                       var10001 = false;
                                       break label11288;
                                    }

                                    var1090 = true;

                                    for(var7 = 0; var7 < var10; ++var7) {
                                       bba var1096;
                                       try {
                                          var1096 = (bba)var1094.get(var7);
                                       } catch (Throwable var1062) {
                                          var10000 = var1062;
                                          var10001 = false;
                                          break label11288;
                                       }

                                       bhj var1087;
                                       if (var1090) {
                                          int var11;
                                          try {
                                             var1085 = ((bhk)var1084).d;
                                             var11 = var1085.b;
                                          } catch (Throwable var1061) {
                                             var10000 = var1061;
                                             var10001 = false;
                                             break label11288;
                                          }

                                          label11316: {
                                             if (var11 > 0) {
                                                Object[] var1099;
                                                try {
                                                   var1099 = var1085.a;
                                                } catch (Throwable var1060) {
                                                   var10000 = var1060;
                                                   var10001 = false;
                                                   break label11288;
                                                }

                                                var5 = 0;

                                                do {
                                                   var1086 = var1099[var5];

                                                   try {
                                                      if (c.E(((bhj)var1086).a, var1096)) {
                                                         break label11316;
                                                      }
                                                   } catch (Throwable var1069) {
                                                      var10000 = var1069;
                                                      var10001 = false;
                                                      break label11288;
                                                   }

                                                   var8 = var5 + 1;
                                                   var5 = var8;
                                                } while(var8 < var11);
                                             }

                                             var1086 = null;
                                          }

                                          try {
                                             var1087 = (bhj)var1086;
                                          } catch (Throwable var1059) {
                                             var10000 = var1059;
                                             var10001 = false;
                                             break label11288;
                                          }

                                          if (var1087 != null) {
                                             try {
                                                var1087.b = true;
                                                var1087.c.d(var12);
                                             } catch (Throwable var1058) {
                                                var10000 = var1058;
                                                var10001 = false;
                                                break label11288;
                                             }

                                             var1084 = var1087;
                                             var1090 = true;
                                             continue;
                                          }
                                       }

                                       try {
                                          var1087 = new bhj(var1096);
                                          var1087.c.d(var12);
                                          ((bhk)var1084).d.p(var1087);
                                       } catch (Throwable var1057) {
                                          var10000 = var1057;
                                          var10001 = false;
                                          break label11288;
                                       }

                                       var1084 = var1087;
                                       var1090 = false;
                                    }

                                    try {
                                       this.b.clear();
                                    } catch (Throwable var1056) {
                                       var10000 = var1056;
                                       var10001 = false;
                                       break label11288;
                                    }
                                 }

                                 ++var6;
                              }
                           }
                        }

                        var1081 = var10000;
                        break label11324;
                     }
                  }

                  var1081 = var10000;
                  break label11324;
               }

               var1081 = var10000;
            }

            this.c = false;
            throw var1081;
         }

         this.c = false;
         return var4;
      }
   }
}
