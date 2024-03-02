import android.content.Context;
import java.io.IOException;

public abstract class epn extends lro {
   private static final pds a = pds.h("epn");

   protected abstract epl a(Context var1, eqc var2, eqa var3);

   public final void c(String var1, byte[] var2, byte[] var3, lrn var4, qcn var5) {
      qfc var51;
      qfn var52;
      qed var53;
      try {
         var51 = qfc.a();
         var52 = qfn.Q(qed.c, var2, 0, var2.length, var51);
         qfn.af(var52);
         var53 = (qed)var52;
      } catch (qfz var11) {
         ((pdq)a.c().I(329)).q("Error parsing Any proto from criteria");
         var4.a(10, "Error parsing Any proto from criteria");
         return;
      }

      qfz var10000;
      qfz var58;
      label309: {
         boolean var10001;
         qfz var59;
         label319: {
            try {
               if (!var53.a.isEmpty() && !"type.googleapis.com/com.google.android.apps.camera.brella.examplestore.proto.SelectionCriteria".equals(var53.a)) {
                  break label319;
               }
            } catch (qfz var50) {
               var10000 = var50;
               var10001 = false;
               break label309;
            }

            qet var55;
            qfn var64;
            try {
               qeo var54 = var53.b;
               var51 = qfc.a();
               eqc var63 = eqc.j;
               var55 = var54.l();
               var64 = var63.P();
            } catch (qfz var43) {
               var10000 = var43;
               var10001 = false;
               break label309;
            }

            try {
               qhj var9 = qhd.a.b(var64);
               var9.k(var64, qeu.p(var55), var51);
               var9.f(var64);
            } catch (qfz var46) {
               var58 = var46;
               var59 = var46;

               try {
                  if (var58.a) {
                     var59 = new qfz(var58);
                  }
               } catch (qfz var16) {
                  var10000 = var16;
                  var10001 = false;
                  break label309;
               }

               try {
                  throw var59;
               } catch (qfz var13) {
                  var10000 = var13;
                  var10001 = false;
                  break label309;
               }
            } catch (qhu var47) {
               qhu var60 = var47;

               try {
                  throw var60.a();
               } catch (qfz var15) {
                  var10000 = var15;
                  var10001 = false;
                  break label309;
               }
            } catch (IOException var48) {
               IOException var57 = var48;

               try {
                  if (var57.getCause() instanceof qfz) {
                     throw (qfz)var57.getCause();
                  }
               } catch (qfz var44) {
                  var10000 = var44;
                  var10001 = false;
                  break label309;
               }

               try {
                  var58 = new qfz(var57);
                  throw var58;
               } catch (qfz var17) {
                  var10000 = var17;
                  var10001 = false;
                  break label309;
               }
            } catch (RuntimeException var49) {
               RuntimeException var56 = var49;

               try {
                  if (var56.getCause() instanceof qfz) {
                     throw (qfz)var56.getCause();
                  }
               } catch (qfz var45) {
                  var10000 = var45;
                  var10001 = false;
                  break label309;
               }

               try {
                  throw var56;
               } catch (qfz var14) {
                  var10000 = var14;
                  var10001 = false;
                  break label309;
               }
            }

            try {
               var55.z(0);
            } catch (qfz var42) {
               var58 = var42;

               try {
                  throw var58;
               } catch (qfz var12) {
                  var10000 = var12;
                  var10001 = false;
                  break label309;
               }
            }

            qht var61;
            eqc var66;
            try {
               qfn.af(var64);
               var66 = (eqc)var64;
               var61 = var66.e;
            } catch (qfz var41) {
               var10000 = var41;
               var10001 = false;
               break label309;
            }

            qht var62 = var61;
            if (var61 == null) {
               try {
                  var62 = qht.c;
               } catch (qfz var40) {
                  var10000 = var40;
                  var10001 = false;
                  break label309;
               }
            }

            label270: {
               try {
                  if (var62.a >= 0L) {
                     var61 = var66.e;
                     break label270;
                  }
               } catch (qfz var39) {
                  var10000 = var39;
                  var10001 = false;
                  break label309;
               }

               try {
                  var58 = new qfz("Start date less than zero");
                  throw var58;
               } catch (qfz var38) {
                  var10000 = var38;
                  var10001 = false;
                  break label309;
               }
            }

            if (var61 == null) {
               try {
                  var62 = qht.c;
               } catch (qfz var37) {
                  var10000 = var37;
                  var10001 = false;
                  break label309;
               }
            } else {
               var62 = var61;
            }

            label255: {
               label317: {
                  try {
                     if (var62.b < 0) {
                        break label317;
                     }
                  } catch (qfz var36) {
                     var10000 = var36;
                     var10001 = false;
                     break label309;
                  }

                  if (var61 == null) {
                     try {
                        var62 = qht.c;
                     } catch (qfz var34) {
                        var10000 = var34;
                        var10001 = false;
                        break label309;
                     }
                  } else {
                     var62 = var61;
                  }

                  try {
                     if (var62.b <= 999999999) {
                        var62 = var66.f;
                        break label255;
                     }
                  } catch (qfz var35) {
                     var10000 = var35;
                     var10001 = false;
                     break label309;
                  }
               }

               try {
                  var58 = new qfz("Invalid start date nanos");
                  throw var58;
               } catch (qfz var33) {
                  var10000 = var33;
                  var10001 = false;
                  break label309;
               }
            }

            qht var65;
            if (var62 == null) {
               try {
                  var65 = qht.c;
               } catch (qfz var32) {
                  var10000 = var32;
                  var10001 = false;
                  break label309;
               }
            } else {
               var65 = var62;
            }

            label234: {
               try {
                  if (var65.a >= 0L) {
                     break label234;
                  }
               } catch (qfz var31) {
                  var10000 = var31;
                  var10001 = false;
                  break label309;
               }

               try {
                  var58 = new qfz("End date less than zero");
                  throw var58;
               } catch (qfz var30) {
                  var10000 = var30;
                  var10001 = false;
                  break label309;
               }
            }

            if (var62 == null) {
               try {
                  var65 = qht.c;
               } catch (qfz var29) {
                  var10000 = var29;
                  var10001 = false;
                  break label309;
               }
            } else {
               var65 = var62;
            }

            label318: {
               try {
                  if (var65.b < 0) {
                     break label318;
                  }
               } catch (qfz var28) {
                  var10000 = var28;
                  var10001 = false;
                  break label309;
               }

               if (var62 == null) {
                  try {
                     var65 = qht.c;
                  } catch (qfz var26) {
                     var10000 = var26;
                     var10001 = false;
                     break label309;
                  }
               } else {
                  var65 = var62;
               }

               try {
                  if (var65.b > 999999999) {
                     break label318;
                  }
               } catch (qfz var27) {
                  var10000 = var27;
                  var10001 = false;
                  break label309;
               }

               if (var62 == null) {
                  try {
                     var62 = qht.c;
                  } catch (qfz var24) {
                     var10000 = var24;
                     var10001 = false;
                     break label309;
                  }
               }

               long var6;
               try {
                  var6 = var62.a;
               } catch (qfz var23) {
                  var10000 = var23;
                  var10001 = false;
                  break label309;
               }

               if (var61 == null) {
                  try {
                     var61 = qht.c;
                  } catch (qfz var22) {
                     var10000 = var22;
                     var10001 = false;
                     break label309;
                  }
               }

               boolean var8;
               label193: {
                  try {
                     if (var6 >= var61.a) {
                        var8 = var66.h.isEmpty();
                        break label193;
                     }
                  } catch (qfz var21) {
                     var10000 = var21;
                     var10001 = false;
                     break label309;
                  }

                  try {
                     var58 = new qfz("End date before start date");
                     throw var58;
                  } catch (qfz var20) {
                     var10000 = var20;
                     var10001 = false;
                     break label309;
                  }
               }

               if (!var8) {
                  eqa var67;
                  try {
                     var51 = qfc.a();
                     var52 = qfn.Q(eqa.c, var3, 0, var3.length, var51);
                     qfn.af(var52);
                     var67 = (eqa)var52;
                  } catch (qfz var10) {
                     nx.e("Error parsing ResumptionPoint proto: ", 'Ň', a.c(), var10);
                     var4.a(10, var10.getMessage());
                     return;
                  }

                  var4.b(this.a(this.getApplicationContext(), var66, var67));
                  return;
               }

               try {
                  var58 = new qfz("No table specified to select examples.");
                  throw var58;
               } catch (qfz var19) {
                  var10000 = var19;
                  var10001 = false;
                  break label309;
               }
            }

            try {
               var58 = new qfz("Invalid end date nanos");
               throw var58;
            } catch (qfz var25) {
               var10000 = var25;
               var10001 = false;
               break label309;
            }
         }

         try {
            var59 = new qfz(String.format("Incorrect type url: %s, expected: %s", var53.a, "type.googleapis.com/com.google.android.apps.camera.brella.examplestore.proto.SelectionCriteria"));
            throw var59;
         } catch (qfz var18) {
            var10000 = var18;
            var10001 = false;
         }
      }

      var58 = var10000;
      nx.e("Error parsing SelectionCriteria proto: ", 'ň', a.c(), var58);
      var4.a(10, "Error parsing SelectionCriteria proto: ".concat(String.valueOf(var58.getMessage())));
   }
}
