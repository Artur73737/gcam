import android.content.Context;
import android.util.Log;
import com.google.android.apps.camera.hdrplus.fusion.api.qAwe.yGCWWDnsImN;
import com.google.android.libraries.lens.lenslite.dynamicloading.LjhL.xKbMW;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;

public abstract class lrv extends lro {
   private qbv a;

   protected abstract mzw a(Context var1);

   public final void c(String var1, byte[] var2, byte[] var3, lrn var4, qcn var5) {
      qbv var19 = this.a;
      qcm var18 = null;

      qfn var234;
      qbi var246;
      qfz var10000;
      boolean var10001;
      label985: {
         label984: {
            qfz var241;
            label989: {
               qfc var16;
               qed var236;
               try {
                  var16 = qfc.a();
                  var234 = qfn.Q(qed.c, var2, 0, var2.length, var16);
                  qfn.af(var234);
                  var236 = (qed)var234;
                  if (!var236.a.equals("type.googleapis.com/fedsql.SelectionCriteria")) {
                     break label984;
                  }
               } catch (qfz var198) {
                  var10000 = var198;
                  var10001 = false;
                  break label989;
               }

               qfn var21;
               qet var237;
               try {
                  qeo var17 = var236.b;
                  var16 = qfc.a();
                  qbi var20 = qbi.f;
                  var237 = var17.l();
                  var21 = var20.P();
               } catch (qfz var197) {
                  var10000 = var197;
                  var10001 = false;
                  break label989;
               }

               qfz var240;
               try {
                  qhj var250 = qhd.a.b(var21);
                  var250.k(var21, qeu.p(var237), var16);
                  var250.f(var21);
               } catch (qfz var201) {
                  var240 = var201;
                  var241 = var201;

                  try {
                     if (var240.a) {
                        var241 = new qfz(var240);
                     }
                  } catch (qfz var193) {
                     var10000 = var193;
                     var10001 = false;
                     break label989;
                  }

                  try {
                     throw var241;
                  } catch (qfz var189) {
                     var10000 = var189;
                     var10001 = false;
                     break label989;
                  }
               } catch (qhu var202) {
                  qhu var242 = var202;

                  try {
                     throw var242.a();
                  } catch (qfz var194) {
                     var10000 = var194;
                     var10001 = false;
                     break label989;
                  }
               } catch (IOException var203) {
                  IOException var239 = var203;

                  try {
                     if (var239.getCause() instanceof qfz) {
                        throw (qfz)var239.getCause();
                     }
                  } catch (qfz var200) {
                     var10000 = var200;
                     var10001 = false;
                     break label989;
                  }

                  try {
                     var240 = new qfz(var239);
                     throw var240;
                  } catch (qfz var191) {
                     var10000 = var191;
                     var10001 = false;
                     break label989;
                  }
               } catch (RuntimeException var204) {
                  RuntimeException var238 = var204;

                  try {
                     if (var238.getCause() instanceof qfz) {
                        throw (qfz)var238.getCause();
                     }
                  } catch (qfz var199) {
                     var10000 = var199;
                     var10001 = false;
                     break label989;
                  }

                  try {
                     throw var238;
                  } catch (qfz var192) {
                     var10000 = var192;
                     var10001 = false;
                     break label989;
                  }
               }

               try {
                  var237.z(0);
               } catch (qfz var196) {
                  var240 = var196;

                  try {
                     throw var240;
                  } catch (qfz var190) {
                     var10000 = var190;
                     var10001 = false;
                     break label989;
                  }
               }

               try {
                  qfn.af(var21);
                  var246 = (qbi)var21;
                  nom var247 = qbv.b;
                  var247.g(Level.INFO, (String)var247.a, (Throwable)null, "Parsed selection criteria: %s", var246);
                  break label985;
               } catch (qfz var195) {
                  var10000 = var195;
                  var10001 = false;
               }
            }

            var241 = var10000;
            nom var244 = qbv.b;
            var244.g(Level.WARNING, (String)var244.a, var241, "Could not parse SQL selection criteria.");
            var246 = var18;
            break label985;
         }

         var246 = var18;
      }

      var18 = var5.a;
      qcm var249 = var18;
      if (var18 == null) {
         var249 = qcm.b;
      }

      byte var6;
      switch(var249.a) {
      case 0:
         var6 = 2;
         break;
      case 1:
         var6 = 3;
         break;
      default:
         var6 = 0;
      }

      byte var7 = var6;
      if (var6 == 0) {
         var7 = 1;
      }

      boolean var11;
      qed var222;
      if (var246 == null) {
         qbv.b.e("Not a SQL query; caller should handle query.");

         qfn var224;
         try {
            qfc var218 = qfc.a();
            var224 = qfn.Q(qed.c, var2, 0, var2.length, var218);
            qfn.af(var224);
            var222 = (qed)var224;
         } catch (qfz var23) {
            Log.w("ExampleStoreSvc", "Error parsing Any proto from criteria");
            var4.a(10, "Error parsing Any proto from criteria");
            return;
         }

         qfz var216;
         label805: {
            label994: {
               try {
                  var11 = var222.a.isEmpty();
               } catch (qfz var61) {
                  var10000 = var61;
                  var10001 = false;
                  break label994;
               }

               label995: {
                  if (!var11) {
                     try {
                        if (!"type.googleapis.com/intelligence.brella.proto.examplestore.SelectionCriteria".equals(var222.a)) {
                           break label995;
                        }
                     } catch (qfz var80) {
                        var10000 = var80;
                        var10001 = false;
                        break label994;
                     }
                  }

                  qet var220;
                  qfc var227;
                  try {
                     qeo var219 = var222.b;
                     var227 = qfc.a();
                     qbz var251 = qbz.h;
                     var220 = var219.l();
                     var234 = var251.P();
                  } catch (qfz var60) {
                     var10000 = var60;
                     var10001 = false;
                     break label994;
                  }

                  RuntimeException var209;
                  qhu var214;
                  qfz var229;
                  try {
                     qhj var258 = qhd.a.b(var234);
                     var258.k(var234, qeu.p(var220), var227);
                     var258.f(var234);
                  } catch (qfz var64) {
                     var216 = var64;
                     var229 = var64;

                     try {
                        if (var216.a) {
                           var229 = new qfz(var216);
                        }
                     } catch (qfz var53) {
                        var10000 = var53;
                        var10001 = false;
                        break label994;
                     }

                     try {
                        throw var229;
                     } catch (qfz var46) {
                        var10000 = var46;
                        var10001 = false;
                        break label994;
                     }
                  } catch (qhu var65) {
                     var214 = var65;

                     try {
                        throw var214.a();
                     } catch (qfz var43) {
                        var10000 = var43;
                        var10001 = false;
                        break label994;
                     }
                  } catch (IOException var66) {
                     IOException var212 = var66;

                     try {
                        if (var212.getCause() instanceof qfz) {
                           throw (qfz)var212.getCause();
                        }
                     } catch (qfz var62) {
                        var10000 = var62;
                        var10001 = false;
                        break label994;
                     }

                     try {
                        var229 = new qfz(var212);
                        throw var229;
                     } catch (qfz var42) {
                        var10000 = var42;
                        var10001 = false;
                        break label994;
                     }
                  } catch (RuntimeException var67) {
                     var209 = var67;

                     try {
                        if (var209.getCause() instanceof qfz) {
                           throw (qfz)var209.getCause();
                        }
                     } catch (qfz var63) {
                        var10000 = var63;
                        var10001 = false;
                        break label994;
                     }

                     try {
                        throw var209;
                     } catch (qfz var45) {
                        var10000 = var45;
                        var10001 = false;
                        break label994;
                     }
                  }

                  try {
                     var220.z(0);
                  } catch (qfz var59) {
                     var216 = var59;

                     try {
                        throw var216;
                     } catch (qfz var44) {
                        var10000 = var44;
                        var10001 = false;
                        break label994;
                     }
                  }

                  qht var221;
                  qbz var259;
                  try {
                     qfn.af(var234);
                     var259 = (qbz)var234;
                     var221 = var259.e;
                  } catch (qfz var58) {
                     var10000 = var58;
                     var10001 = false;
                     break label994;
                  }

                  qht var232 = var221;
                  if (var221 == null) {
                     try {
                        var232 = qht.c;
                     } catch (qfz var57) {
                        var10000 = var57;
                        var10001 = false;
                        break label994;
                     }
                  }

                  label793: {
                     try {
                        if (var232.a >= 0L) {
                           var221 = var259.e;
                           break label793;
                        }
                     } catch (qfz var79) {
                        var10000 = var79;
                        var10001 = false;
                        break label994;
                     }

                     try {
                        var216 = new qfz("Start date less than zero");
                        throw var216;
                     } catch (qfz var52) {
                        var10000 = var52;
                        var10001 = false;
                        break label994;
                     }
                  }

                  if (var221 == null) {
                     try {
                        var232 = qht.c;
                     } catch (qfz var56) {
                        var10000 = var56;
                        var10001 = false;
                        break label994;
                     }
                  } else {
                     var232 = var221;
                  }

                  label999: {
                     try {
                        if (var232.b < 0) {
                           break label999;
                        }
                     } catch (qfz var78) {
                        var10000 = var78;
                        var10001 = false;
                        break label994;
                     }

                     if (var221 == null) {
                        try {
                           var232 = qht.c;
                        } catch (qfz var55) {
                           var10000 = var55;
                           var10001 = false;
                           break label994;
                        }
                     } else {
                        var232 = var221;
                     }

                     try {
                        if (var232.b > 999999999) {
                           break label999;
                        }

                        var232 = var259.f;
                     } catch (qfz var77) {
                        var10000 = var77;
                        var10001 = false;
                        break label994;
                     }

                     qht var256;
                     if (var232 == null) {
                        try {
                           var256 = qht.c;
                        } catch (qfz var54) {
                           var10000 = var54;
                           var10001 = false;
                           break label994;
                        }
                     } else {
                        var256 = var232;
                     }

                     label772: {
                        label1000: {
                           try {
                              if (var256.a < 0L) {
                                 break label772;
                              }
                           } catch (qfz var74) {
                              var10000 = var74;
                              var10001 = false;
                              break label1000;
                           }

                           if (var232 == null) {
                              try {
                                 var256 = qht.c;
                              } catch (qfz var73) {
                                 var10000 = var73;
                                 var10001 = false;
                                 break label1000;
                              }
                           } else {
                              var256 = var232;
                           }

                           label769: {
                              label1001: {
                                 try {
                                    if (var256.b < 0) {
                                       break label1001;
                                    }
                                 } catch (qfz var76) {
                                    var10000 = var76;
                                    var10001 = false;
                                    break label1000;
                                 }

                                 if (var232 == null) {
                                    try {
                                       var256 = qht.c;
                                    } catch (qfz var72) {
                                       var10000 = var72;
                                       var10001 = false;
                                       break label1000;
                                    }
                                 } else {
                                    var256 = var232;
                                 }

                                 try {
                                    if (var256.b <= 999999999) {
                                       break label769;
                                    }
                                 } catch (qfz var75) {
                                    var10000 = var75;
                                    var10001 = false;
                                    break label1000;
                                 }
                              }

                              try {
                                 var216 = new qfz("Invalid end date nanos");
                                 throw var216;
                              } catch (qfz var49) {
                                 var10000 = var49;
                                 var10001 = false;
                                 break label994;
                              }
                           }

                           if (var232 == null) {
                              try {
                                 var232 = qht.c;
                              } catch (qfz var71) {
                                 var10000 = var71;
                                 var10001 = false;
                                 break label1000;
                              }
                           }

                           long var12;
                           try {
                              var12 = var232.a;
                           } catch (qfz var70) {
                              var10000 = var70;
                              var10001 = false;
                              break label1000;
                           }

                           if (var221 == null) {
                              try {
                                 var221 = qht.c;
                              } catch (qfz var69) {
                                 var10000 = var69;
                                 var10001 = false;
                                 break label1000;
                              }
                           }

                           long var14;
                           try {
                              var14 = var221.a;
                           } catch (qfz var68) {
                              var10000 = var68;
                              var10001 = false;
                              break label1000;
                           }

                           if (var12 >= var14) {
                              try {
                                 var227 = qfc.a();
                                 var224 = qfn.Q(qed.c, var3, 0, var3.length, var227);
                                 qfn.af(var224);
                                 var222 = (qed)var224;
                              } catch (qfz var22) {
                                 Log.w("ExampleStoreSvc", "Error parsing Any proto from resumptionPoint");
                                 var4.a(10, "Error parsing Any proto from resumptionPoint");
                                 return;
                              }

                              label664: {
                                 label663: {
                                    label1016: {
                                       try {
                                          if (!var222.equals(qed.c) && !"type.googleapis.com/intelligence.brella.proto.examplestore.ResumptionPoint".equals(var222.a)) {
                                             break label1016;
                                          }
                                       } catch (qfz var41) {
                                          var10000 = var41;
                                          var10001 = false;
                                          break label663;
                                       }

                                       qet var213;
                                       try {
                                          qeo var211 = var222.b;
                                          var227 = qfc.a();
                                          qby var226 = qby.c;
                                          var213 = var211.l();
                                          var234 = var226.P();
                                       } catch (qfz var40) {
                                          var10000 = var40;
                                          var10001 = false;
                                          break label663;
                                       }

                                       label1004: {
                                          try {
                                             qhj var228 = qhd.a.b(var234);
                                             var228.k(var234, qeu.p(var213), var227);
                                             var228.f(var234);
                                          } catch (qfz var36) {
                                             var216 = var36;
                                             var229 = var36;

                                             try {
                                                if (var216.a) {
                                                   var229 = new qfz(var216);
                                                }
                                             } catch (qfz var31) {
                                                var10000 = var31;
                                                var10001 = false;
                                                break label1004;
                                             }

                                             try {
                                                throw var229;
                                             } catch (qfz var26) {
                                                var10000 = var26;
                                                var10001 = false;
                                                break label1004;
                                             }
                                          } catch (qhu var37) {
                                             var214 = var37;

                                             try {
                                                throw var214.a();
                                             } catch (qfz var25) {
                                                var10000 = var25;
                                                var10001 = false;
                                                break label1004;
                                             }
                                          } catch (IOException var38) {
                                             IOException var233 = var38;

                                             try {
                                                if (var233.getCause() instanceof qfz) {
                                                   throw (qfz)var233.getCause();
                                                }
                                             } catch (qfz var34) {
                                                var10000 = var34;
                                                var10001 = false;
                                                break label1004;
                                             }

                                             try {
                                                var216 = new qfz(var233);
                                                throw var216;
                                             } catch (qfz var27) {
                                                var10000 = var27;
                                                var10001 = false;
                                                break label1004;
                                             }
                                          } catch (RuntimeException var39) {
                                             var209 = var39;

                                             try {
                                                if (var209.getCause() instanceof qfz) {
                                                   throw (qfz)var209.getCause();
                                                }
                                             } catch (qfz var35) {
                                                var10000 = var35;
                                                var10001 = false;
                                                break label1004;
                                             }

                                             try {
                                                throw var209;
                                             } catch (qfz var28) {
                                                var10000 = var28;
                                                var10001 = false;
                                                break label1004;
                                             }
                                          }

                                          try {
                                             var213.z(0);
                                          } catch (qfz var33) {
                                             var216 = var33;

                                             try {
                                                throw var216;
                                             } catch (qfz var24) {
                                                var10000 = var24;
                                                var10001 = false;
                                                break label1004;
                                             }
                                          }

                                          qby var235;
                                          label628: {
                                             try {
                                                qfn.af(var234);
                                                var235 = (qby)var234;
                                                if (var235.a == 1) {
                                                   var12 = (Long)var235.b;
                                                   break label628;
                                                }
                                             } catch (qfz var32) {
                                                var10000 = var32;
                                                var10001 = false;
                                                break label663;
                                             }

                                             var12 = 0L;
                                          }

                                          if (var12 >= 0L) {
                                             mzw var230 = this.a(this);
                                             mzw.i(var1);
                                             Object var215 = var230.a;
                                             Object var231 = var230.c;
                                             var4.b(new lrx((lsa)var215, var1, var259, var235, (ExecutorService)var231));
                                             return;
                                          }

                                          try {
                                             var216 = new qfz("LastReturnedId less than zero");
                                             throw var216;
                                          } catch (qfz var30) {
                                             var10000 = var30;
                                             var10001 = false;
                                          }
                                       }

                                       var216 = var10000;
                                       break label664;
                                    }

                                    try {
                                       var216 = new qfz(String.format("Incorrect type url: %s, expected: %s", var222.a, "type.googleapis.com/intelligence.brella.proto.examplestore.ResumptionPoint"));
                                       throw var216;
                                    } catch (qfz var29) {
                                       var10000 = var29;
                                       var10001 = false;
                                    }
                                 }

                                 var216 = var10000;
                              }

                              Log.w("ExampleStoreSvc", var216.getMessage());
                              var4.a(10, var216.getMessage());
                              return;
                           }

                           try {
                              var216 = new qfz(yGCWWDnsImN.lEfgAGwoVYolUaT);
                              throw var216;
                           } catch (qfz var48) {
                              var10000 = var48;
                              var10001 = false;
                              break label994;
                           }
                        }

                        var216 = var10000;
                        break label805;
                     }

                     try {
                        var216 = new qfz("End date less than zero");
                        throw var216;
                     } catch (qfz var50) {
                        var10000 = var50;
                        var10001 = false;
                        break label994;
                     }
                  }

                  try {
                     var216 = new qfz("Invalid start date nanos");
                     throw var216;
                  } catch (qfz var51) {
                     var10000 = var51;
                     var10001 = false;
                     break label994;
                  }
               }

               try {
                  var216 = new qfz(String.format("Incorrect type url: %s, expected: %s", var222.a, "type.googleapis.com/intelligence.brella.proto.examplestore.SelectionCriteria"));
                  throw var216;
               } catch (qfz var47) {
                  var10000 = var47;
                  var10001 = false;
               }
            }

            var216 = var10000;
         }

         var1 = "Error parsing SelectionCriteria proto: ".concat(String.valueOf(var216.getMessage()));
         Log.w("ExampleStoreSvc", var1);
         var4.a(10, var1);
      } else {
         qbq var263;
         label929: {
            Object var205;
            label928: {
               NullPointerException var262;
               label927: {
                  IllegalArgumentException var261;
                  label926: {
                     IllegalStateException var260;
                     label1008: {
                        int var223;
                        try {
                           var223 = var246.d;
                        } catch (qbq var185) {
                           var263 = var185;
                           var10001 = false;
                           break label929;
                        } catch (NullPointerException var186) {
                           var262 = var186;
                           var10001 = false;
                           break label927;
                        } catch (IllegalArgumentException var187) {
                           var261 = var187;
                           var10001 = false;
                           break label926;
                        } catch (IllegalStateException var188) {
                           var260 = var188;
                           var10001 = false;
                           break label1008;
                        }

                        if (var223 > 0) {
                           var11 = true;
                        } else {
                           var11 = false;
                        }

                        try {
                           onk.x(var11, "min_client_sql_version must be set to a positive value");
                        } catch (qbq var181) {
                           var263 = var181;
                           var10001 = false;
                           break label929;
                        } catch (NullPointerException var182) {
                           var262 = var182;
                           var10001 = false;
                           break label927;
                        } catch (IllegalArgumentException var183) {
                           var261 = var183;
                           var10001 = false;
                           break label926;
                        } catch (IllegalStateException var184) {
                           var260 = var184;
                           var10001 = false;
                           break label1008;
                        }

                        if (var223 <= 4) {
                           label1009: {
                              ArrayList var252;
                              try {
                                 var252 = new ArrayList();
                              } catch (qbq var173) {
                                 var263 = var173;
                                 var10001 = false;
                                 break label929;
                              } catch (NullPointerException var174) {
                                 var262 = var174;
                                 var10001 = false;
                                 break label927;
                              } catch (IllegalArgumentException var175) {
                                 var261 = var175;
                                 var10001 = false;
                                 break label926;
                              } catch (IllegalStateException var176) {
                                 var260 = var176;
                                 var10001 = false;
                                 break label1009;
                              }

                              int var9 = var7 - 2;
                              qbj var206;
                              qbj var253;
                              qbh var255;
                              switch(var9) {
                              case -1:
                              case 0:
                                 label893: {
                                    label892: {
                                       try {
                                          if (1 != (var246.a & 1)) {
                                             break label892;
                                          }
                                       } catch (qbq var161) {
                                          var263 = var161;
                                          var10001 = false;
                                          break label929;
                                       } catch (NullPointerException var162) {
                                          var262 = var162;
                                          var10001 = false;
                                          break label927;
                                       } catch (IllegalArgumentException var163) {
                                          var261 = var163;
                                          var10001 = false;
                                          break label926;
                                       } catch (IllegalStateException var164) {
                                          var260 = var164;
                                          var10001 = false;
                                          break label1009;
                                       }

                                       var11 = true;
                                       break label893;
                                    }

                                    var11 = false;
                                 }

                                 boolean var225;
                                 label886: {
                                    label885: {
                                       try {
                                          onk.x(var11, "client_query must be set.");
                                          if ((var246.a & 8) == 0) {
                                             break label885;
                                          }
                                       } catch (qbq var157) {
                                          var263 = var157;
                                          var10001 = false;
                                          break label929;
                                       } catch (NullPointerException var158) {
                                          var262 = var158;
                                          var10001 = false;
                                          break label927;
                                       } catch (IllegalArgumentException var159) {
                                          var261 = var159;
                                          var10001 = false;
                                          break label926;
                                       } catch (IllegalStateException var160) {
                                          var260 = var160;
                                          var10001 = false;
                                          break label1009;
                                       }

                                       var225 = true;
                                       break label886;
                                    }

                                    var225 = false;
                                 }

                                 try {
                                    onk.x(var225 ^ true, "client_queries must not be set.");
                                    var253 = var246.b;
                                 } catch (qbq var153) {
                                    var263 = var153;
                                    var10001 = false;
                                    break label929;
                                 } catch (NullPointerException var154) {
                                    var262 = var154;
                                    var10001 = false;
                                    break label927;
                                 } catch (IllegalArgumentException var155) {
                                    var261 = var155;
                                    var10001 = false;
                                    break label926;
                                 } catch (IllegalStateException var156) {
                                    var260 = var156;
                                    var10001 = false;
                                    break label1009;
                                 }

                                 var206 = var253;
                                 if (var253 == null) {
                                    try {
                                       var206 = qbj.f;
                                    } catch (qbq var149) {
                                       var263 = var149;
                                       var10001 = false;
                                       break label929;
                                    } catch (NullPointerException var150) {
                                       var262 = var150;
                                       var10001 = false;
                                       break label927;
                                    } catch (IllegalArgumentException var151) {
                                       var261 = var151;
                                       var10001 = false;
                                       break label926;
                                    } catch (IllegalStateException var152) {
                                       var260 = var152;
                                       var10001 = false;
                                       break label1009;
                                    }
                                 }

                                 try {
                                    var252.add(var206);
                                    break;
                                 } catch (qbq var145) {
                                    var263 = var145;
                                    var10001 = false;
                                    break label929;
                                 } catch (NullPointerException var146) {
                                    var262 = var146;
                                    var10001 = false;
                                    break label927;
                                 } catch (IllegalArgumentException var147) {
                                    var261 = var147;
                                    var10001 = false;
                                    break label926;
                                 } catch (IllegalStateException var148) {
                                    var260 = var148;
                                    var10001 = false;
                                    break label1009;
                                 }
                              default:
                                 try {
                                    var223 = var246.a;
                                 } catch (qbq var141) {
                                    var263 = var141;
                                    var10001 = false;
                                    break label929;
                                 } catch (NullPointerException var142) {
                                    var262 = var142;
                                    var10001 = false;
                                    break label927;
                                 } catch (IllegalArgumentException var143) {
                                    var261 = var143;
                                    var10001 = false;
                                    break label926;
                                 } catch (IllegalStateException var144) {
                                    var260 = var144;
                                    var10001 = false;
                                    break label1009;
                                 }

                                 if (1 != (var223 & 1 ^ 1)) {
                                    var11 = false;
                                 } else {
                                    var11 = true;
                                 }

                                 label908: {
                                    label907: {
                                       try {
                                          onk.x(var11, "client_query must not be set for lightweight client tasks.");
                                          if ((var246.a & 8) != 0) {
                                             break label907;
                                          }
                                       } catch (qbq var169) {
                                          var263 = var169;
                                          var10001 = false;
                                          break label929;
                                       } catch (NullPointerException var170) {
                                          var262 = var170;
                                          var10001 = false;
                                          break label927;
                                       } catch (IllegalArgumentException var171) {
                                          var261 = var171;
                                          var10001 = false;
                                          break label926;
                                       } catch (IllegalStateException var172) {
                                          var260 = var172;
                                          var10001 = false;
                                          break label1009;
                                       }

                                       var11 = false;
                                       break label908;
                                    }

                                    var11 = true;
                                 }

                                 qbl var254;
                                 try {
                                    onk.x(var11, "client_queries must be set.");
                                    var254 = var246.e;
                                 } catch (qbq var137) {
                                    var263 = var137;
                                    var10001 = false;
                                    break label929;
                                 } catch (NullPointerException var138) {
                                    var262 = var138;
                                    var10001 = false;
                                    break label927;
                                 } catch (IllegalArgumentException var139) {
                                    var261 = var139;
                                    var10001 = false;
                                    break label926;
                                 } catch (IllegalStateException var140) {
                                    var260 = var140;
                                    var10001 = false;
                                    break label1009;
                                 }

                                 qbl var210 = var254;
                                 if (var254 == null) {
                                    try {
                                       var210 = qbl.d;
                                    } catch (qbq var133) {
                                       var263 = var133;
                                       var10001 = false;
                                       break label929;
                                    } catch (NullPointerException var134) {
                                       var262 = var134;
                                       var10001 = false;
                                       break label927;
                                    } catch (IllegalArgumentException var135) {
                                       var261 = var135;
                                       var10001 = false;
                                       break label926;
                                    } catch (IllegalStateException var136) {
                                       var260 = var136;
                                       var10001 = false;
                                       break label1009;
                                    }
                                 }

                                 label900: {
                                    label899: {
                                       try {
                                          if (1 != (var210.a & 1)) {
                                             break label899;
                                          }
                                       } catch (qbq var165) {
                                          var263 = var165;
                                          var10001 = false;
                                          break label929;
                                       } catch (NullPointerException var166) {
                                          var262 = var166;
                                          var10001 = false;
                                          break label927;
                                       } catch (IllegalArgumentException var167) {
                                          var261 = var167;
                                          var10001 = false;
                                          break label926;
                                       } catch (IllegalStateException var168) {
                                          var260 = var168;
                                          var10001 = false;
                                          break label1009;
                                       }

                                       var11 = true;
                                       break label900;
                                    }

                                    var11 = false;
                                 }

                                 qbh var243;
                                 try {
                                    onk.x(var11, "SqlQuerySet.database_schema must be set.");
                                    var243 = var210.c;
                                 } catch (qbq var129) {
                                    var263 = var129;
                                    var10001 = false;
                                    break label929;
                                 } catch (NullPointerException var130) {
                                    var262 = var130;
                                    var10001 = false;
                                    break label927;
                                 } catch (IllegalArgumentException var131) {
                                    var261 = var131;
                                    var10001 = false;
                                    break label926;
                                 } catch (IllegalStateException var132) {
                                    var260 = var132;
                                    var10001 = false;
                                    break label1009;
                                 }

                                 var255 = var243;
                                 if (var243 == null) {
                                    try {
                                       var255 = qbh.b;
                                    } catch (qbq var125) {
                                       var263 = var125;
                                       var10001 = false;
                                       break label929;
                                    } catch (NullPointerException var126) {
                                       var262 = var126;
                                       var10001 = false;
                                       break label927;
                                    } catch (IllegalArgumentException var127) {
                                       var261 = var127;
                                       var10001 = false;
                                       break label926;
                                    } catch (IllegalStateException var128) {
                                       var260 = var128;
                                       var10001 = false;
                                       break label1009;
                                    }
                                 }

                                 try {
                                    qbv.a(var255);
                                    var252.addAll(Collections.unmodifiableMap(var210.b).values());
                                 } catch (qbq var121) {
                                    var263 = var121;
                                    var10001 = false;
                                    break label929;
                                 } catch (NullPointerException var122) {
                                    var262 = var122;
                                    var10001 = false;
                                    break label927;
                                 } catch (IllegalArgumentException var123) {
                                    var261 = var123;
                                    var10001 = false;
                                    break label926;
                                 } catch (IllegalStateException var124) {
                                    var260 = var124;
                                    var10001 = false;
                                    break label1009;
                                 }
                              }

                              int var10;
                              try {
                                 var10 = var252.size();
                              } catch (qbq var117) {
                                 var263 = var117;
                                 var10001 = false;
                                 break label929;
                              } catch (NullPointerException var118) {
                                 var262 = var118;
                                 var10001 = false;
                                 break label927;
                              } catch (IllegalArgumentException var119) {
                                 var261 = var119;
                                 var10001 = false;
                                 break label926;
                              } catch (IllegalStateException var120) {
                                 var260 = var120;
                                 var10001 = false;
                                 break label1009;
                              }

                              int var8 = 0;

                              label856:
                              while(true) {
                                 if (var8 >= var10) {
                                    nom var248 = qbv.b;
                                    var253 = var246.b;
                                    var206 = var253;
                                    if (var253 == null) {
                                       var206 = qbj.f;
                                    }

                                    var248.f("Handling SQL query: %s", var206.d);
                                    qed var257 = var246.c;
                                    var222 = var257;
                                    if (var257 == null) {
                                       var222 = qed.c;
                                    }

                                    this.c(var1, var222.J(), var3, new qbr(var19, this, var246, var7, var4), var5);
                                    return;
                                 }

                                 qbj var245;
                                 label853: {
                                    label852: {
                                       label851: {
                                          try {
                                             var245 = (qbj)var252.get(var8);
                                             switch(var245.b) {
                                             case 0:
                                                break;
                                             case 1:
                                                break label851;
                                             default:
                                                break label852;
                                             }
                                          } catch (qbq var113) {
                                             var263 = var113;
                                             var10001 = false;
                                             break label929;
                                          } catch (NullPointerException var114) {
                                             var262 = var114;
                                             var10001 = false;
                                             break label927;
                                          } catch (IllegalArgumentException var115) {
                                             var261 = var115;
                                             var10001 = false;
                                             break label926;
                                          } catch (IllegalStateException var116) {
                                             var260 = var116;
                                             var10001 = false;
                                             break;
                                          }

                                          var6 = 2;
                                          break label853;
                                       }

                                       var6 = 3;
                                       break label853;
                                    }

                                    var6 = 0;
                                 }

                                 if (var6 == 0) {
                                    var11 = false;
                                 } else if (var6 == 3) {
                                    var11 = true;
                                 } else {
                                    var11 = false;
                                 }

                                 try {
                                    onk.x(var11, xKbMW.fiIvXFmvO);
                                 } catch (qbq var105) {
                                    var263 = var105;
                                    var10001 = false;
                                    break label929;
                                 } catch (NullPointerException var106) {
                                    var262 = var106;
                                    var10001 = false;
                                    break label927;
                                 } catch (IllegalArgumentException var107) {
                                    var261 = var107;
                                    var10001 = false;
                                    break label926;
                                 } catch (IllegalStateException var108) {
                                    var260 = var108;
                                    var10001 = false;
                                    break;
                                 }

                                 switch(var9) {
                                 case -1:
                                 case 0:
                                    label834: {
                                       label833: {
                                          try {
                                             if (1 != (var245.a & 1)) {
                                                break label833;
                                             }
                                          } catch (qbq var109) {
                                             var263 = var109;
                                             var10001 = false;
                                             break label929;
                                          } catch (NullPointerException var110) {
                                             var262 = var110;
                                             var10001 = false;
                                             break label927;
                                          } catch (IllegalArgumentException var111) {
                                             var261 = var111;
                                             var10001 = false;
                                             break label926;
                                          } catch (IllegalStateException var112) {
                                             var260 = var112;
                                             var10001 = false;
                                             break label856;
                                          }

                                          var11 = true;
                                          break label834;
                                       }

                                       var11 = false;
                                    }

                                    try {
                                       onk.x(var11, "client_query.database_schema must be set");
                                       var255 = var245.c;
                                    } catch (qbq var101) {
                                       var263 = var101;
                                       var10001 = false;
                                       break label929;
                                    } catch (NullPointerException var102) {
                                       var262 = var102;
                                       var10001 = false;
                                       break label927;
                                    } catch (IllegalArgumentException var103) {
                                       var261 = var103;
                                       var10001 = false;
                                       break label926;
                                    } catch (IllegalStateException var104) {
                                       var260 = var104;
                                       var10001 = false;
                                       break label856;
                                    }

                                    qbh var217 = var255;
                                    if (var255 == null) {
                                       try {
                                          var217 = qbh.b;
                                       } catch (qbq var97) {
                                          var263 = var97;
                                          var10001 = false;
                                          break label929;
                                       } catch (NullPointerException var98) {
                                          var262 = var98;
                                          var10001 = false;
                                          break label927;
                                       } catch (IllegalArgumentException var99) {
                                          var261 = var99;
                                          var10001 = false;
                                          break label926;
                                       } catch (IllegalStateException var100) {
                                          var260 = var100;
                                          var10001 = false;
                                          break label856;
                                       }
                                    }

                                    try {
                                       qbv.a(var217);
                                       break;
                                    } catch (qbq var93) {
                                       var263 = var93;
                                       var10001 = false;
                                       break label929;
                                    } catch (NullPointerException var94) {
                                       var262 = var94;
                                       var10001 = false;
                                       break label927;
                                    } catch (IllegalArgumentException var95) {
                                       var261 = var95;
                                       var10001 = false;
                                       break label926;
                                    } catch (IllegalStateException var96) {
                                       var260 = var96;
                                       var10001 = false;
                                       break label856;
                                    }
                                 default:
                                    try {
                                       var223 = var245.a;
                                    } catch (qbq var89) {
                                       var263 = var89;
                                       var10001 = false;
                                       break label929;
                                    } catch (NullPointerException var90) {
                                       var262 = var90;
                                       var10001 = false;
                                       break label927;
                                    } catch (IllegalArgumentException var91) {
                                       var261 = var91;
                                       var10001 = false;
                                       break label926;
                                    } catch (IllegalStateException var92) {
                                       var260 = var92;
                                       var10001 = false;
                                       break label856;
                                    }

                                    if (1 != (var223 & 1 ^ 1)) {
                                       var11 = false;
                                    } else {
                                       var11 = true;
                                    }

                                    try {
                                       onk.x(var11, "SqlQuery.database_schema must not be set for lightweight client tasks");
                                    } catch (qbq var85) {
                                       var263 = var85;
                                       var10001 = false;
                                       break label929;
                                    } catch (NullPointerException var86) {
                                       var262 = var86;
                                       var10001 = false;
                                       break label927;
                                    } catch (IllegalArgumentException var87) {
                                       var261 = var87;
                                       var10001 = false;
                                       break label926;
                                    } catch (IllegalStateException var88) {
                                       var260 = var88;
                                       var10001 = false;
                                       break label856;
                                    }
                                 }

                                 try {
                                    onk.x(var245.d.isEmpty() ^ true, "client_query.raw_sql must be set.");
                                 } catch (qbq var81) {
                                    var263 = var81;
                                    var10001 = false;
                                    break label929;
                                 } catch (NullPointerException var82) {
                                    var262 = var82;
                                    var10001 = false;
                                    break label927;
                                 } catch (IllegalArgumentException var83) {
                                    var261 = var83;
                                    var10001 = false;
                                    break label926;
                                 } catch (IllegalStateException var84) {
                                    var260 = var84;
                                    var10001 = false;
                                    break;
                                 }

                                 ++var8;
                              }
                           }
                        } else {
                           try {
                              qbn var208 = new qbn(var223);
                              throw var208;
                           } catch (qbq var177) {
                              var263 = var177;
                              var10001 = false;
                              break label929;
                           } catch (NullPointerException var178) {
                              var262 = var178;
                              var10001 = false;
                              break label927;
                           } catch (IllegalArgumentException var179) {
                              var261 = var179;
                              var10001 = false;
                              break label926;
                           } catch (IllegalStateException var180) {
                              var260 = var180;
                              var10001 = false;
                           }
                        }
                     }

                     var205 = var260;
                     break label928;
                  }

                  var205 = var261;
                  break label928;
               }

               var205 = var262;
            }

            var4.a(8, ((RuntimeException)var205).getMessage());
            return;
         }

         qbq var207 = var263;
         var4.a(var207.a, var207.getMessage());
      }
   }

   public final void onCreate() {
      super.onCreate();
      this.a = new qbv(Executors.newSingleThreadExecutor());
   }
}
