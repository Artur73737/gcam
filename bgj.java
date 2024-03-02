import java.util.ArrayList;
import java.util.List;

public final class bgj {
   public static final List a;

   static {
      a = qtf.a;
      long var0 = bcy.a;
   }

   public static final List a(String var0) {
      Object var35;
      if (var0 == null) {
         var35 = a;
         return (List)var35;
      } else {
         var35 = new ArrayList();
         float[] var36 = new float[64];
         ((List)var35).clear();
         int var5 = 0;

         int var6;
         int var15;
         while(true) {
            var6 = var0.length();
            var15 = var6;
            if (var5 >= var6) {
               break;
            }

            var15 = var6;
            if (qwp.a(var0.charAt(var5), 32) > 0) {
               break;
            }

            ++var5;
         }

         while(true) {
            if (var15 <= var5) {
               var6 = 0;
               break;
            }

            var6 = var15 - 1;
            if (qwp.a(var0.charAt(var6), 32) > 0) {
               var6 = 0;
               break;
            }

            var15 = var6;
         }

         while(true) {
            char var1;
            int var7;
            do {
               if (var5 >= var15) {
                  return (List)var35;
               }

               var7 = var5;

               while(true) {
                  var5 = var7 + 1;
                  var1 = var0.charAt(var7);
                  var7 = var1 | 32;
                  if ((var7 - 97) * (var7 - 122) <= 0 && var7 != 101) {
                     break;
                  }

                  if (var5 >= var15) {
                     var1 = 0;
                     break;
                  }

                  var7 = var5;
               }
            } while(var1 == 0);

            float var2;
            float var3;
            Object var61;
            if ((var1 | 32) == 122) {
               var61 = var35;
            } else {
               var6 = 0;
               float[] var34 = var36;

               while(true) {
                  while(var5 < var15 && qwp.a(var0.charAt(var5), 32) <= 0) {
                     ++var5;
                  }

                  var36 = bfc.a;
                  boolean var51;
                  int var52;
                  float[] var62;
                  if (var5 == var15) {
                     var7 = var6;
                     var2 = Float.NaN;
                     var51 = false;
                     var61 = var35;
                     var62 = var34;
                  } else {
                     label2575: {
                        char var12 = var0.charAt(var5);
                        boolean var8;
                        if (var12 == '-') {
                           var8 = true;
                        } else {
                           var8 = false;
                        }

                        if (var8) {
                           var7 = var5 + 1;
                           if (var7 == var15) {
                              var62 = var34;
                              var5 = var7;
                              var2 = Float.NaN;
                              var51 = false;
                              var7 = var6;
                              var61 = var35;
                              break label2575;
                           }

                           var12 = var0.charAt(var7);
                           if ((char)(var12 - 48) >= '\n' && var12 != '.') {
                              var5 = var7;
                              var2 = Float.NaN;
                              var51 = false;
                              var7 = var6;
                              var61 = var35;
                              var62 = var34;
                              break label2575;
                           }
                        } else {
                           var7 = var5;
                        }

                        long var24 = 0L;
                        int var9 = var7;

                        int var10;
                        long var22;
                        for(var22 = 0L; var9 != var15; var22 = var22 * 10L + (long)var10) {
                           var10 = var12 - 48;
                           if ((char)var10 >= '\n') {
                              break;
                           }

                           ++var9;
                           if (var9 < var0.length()) {
                              var12 = var0.charAt(var9);
                           } else {
                              var12 = 0;
                           }
                        }

                        int var14 = var9 - var7;
                        int var11;
                        boolean var16;
                        int var17;
                        long var26;
                        long var28;
                        char var50;
                        int var56;
                        int var57;
                        if (var9 != var15 && var12 == '.') {
                           var11 = var9 + 1;

                           for(var10 = var11; var15 - var10 >= 4; var22 = var22 * 10000L + (long)var57) {
                              var26 = (long)var0.charAt(var10);
                              var26 = (long)var0.charAt(var10 + 1) << 16 | var26 | (long)var0.charAt(var10 + 2) << 32 | (long)var0.charAt(var10 + 3) << 48;
                              var28 = var26 - 13511005043687472L;
                              if (((19703549022044230L + var26 | var28) & -35747867511423104L) != 0L) {
                                 var57 = -1;
                              } else {
                                 var57 = (int)(var28 * 281475406208040961L >>> 48);
                              }

                              if (var57 < 0) {
                                 break;
                              }

                              var10 += 4;
                           }

                           var56 = var9;
                           var17 = var5;
                           var16 = var8;
                           var61 = var35;
                           var52 = var6;
                           if (var10 < var0.length()) {
                              var50 = var0.charAt(var10);
                           } else {
                              var50 = 0;
                           }

                           for(var6 = var10; var6 != var15; var22 = var22 * 10L + (long)var9) {
                              var9 = var50 - 48;
                              if ((char)var9 >= '\n') {
                                 break;
                              }

                              ++var6;
                              if (var6 < var0.length()) {
                                 var50 = var0.charAt(var6);
                              } else {
                                 var50 = 0;
                              }
                           }

                           var57 = var11 - var6;
                           var10 = var14 - var57;
                           var9 = var11;
                           var11 = var10;
                           var62 = var34;
                           var10 = var56;
                        } else {
                           var17 = var5;
                           var10 = var9;
                           var9 = var9;
                           byte var13 = 0;
                           var16 = var8;
                           var62 = var34;
                           var61 = var35;
                           var52 = var6;
                           var6 = var9;
                           var11 = var14;
                           var50 = var12;
                           var57 = var13;
                        }

                        if (var11 == 0) {
                           var5 = var6;
                           var2 = Float.NaN;
                           var51 = false;
                           var7 = var52;
                        } else {
                           label2576: {
                              if ((var50 | 32) == 101) {
                                 var56 = var6 + 1;
                                 if (var56 < var0.length()) {
                                    var50 = var0.charAt(var56);
                                 } else {
                                    var50 = 0;
                                 }

                                 boolean var18;
                                 if (var50 == '-') {
                                    var18 = true;
                                 } else {
                                    var18 = false;
                                 }

                                 if (!var18 && var50 != '+') {
                                    var5 = var56;
                                 } else {
                                    var5 = var56 + 1;
                                 }

                                 char var58 = var0.charAt(var5);
                                 var56 = 0;

                                 while(var5 != var15) {
                                    var14 = var58 - 48;
                                    if ((char)var14 >= '\n') {
                                       break;
                                    }

                                    int var19 = var56;
                                    if (var56 < 1024) {
                                       var19 = var56 * 10 + var14;
                                    }

                                    ++var5;
                                    if (var5 < var0.length()) {
                                       var58 = var0.charAt(var5);
                                       var56 = var19;
                                    } else {
                                       var58 = 0;
                                       var56 = var19;
                                    }
                                 }

                                 var14 = var56;
                                 if (var18) {
                                    var14 = -var56;
                                 }

                                 var57 += var14;
                              } else {
                                 var5 = var6;
                                 var14 = 0;
                              }

                              label2336: {
                                 if (var11 > 19) {
                                    char var60 = var0.charAt(var7);
                                    int var59 = var7;
                                    var56 = var11;
                                    char var54 = var60;

                                    while(var5 != var15) {
                                       if (var54 != '0') {
                                          if (var54 != '.') {
                                             break;
                                          }
                                       } else {
                                          --var56;
                                       }

                                       ++var59;
                                       if (var59 < var0.length()) {
                                          var54 = var0.charAt(var59);
                                       } else {
                                          var54 = 0;
                                       }
                                    }

                                    if (var56 > 19) {
                                       var54 = var0.charAt(var7);

                                       char var53;
                                       for(var22 = 0L; var7 != var10 && gg.m(var22, 1000000000000000000L) < 0; var7 = var57) {
                                          var57 = var7 + 1;
                                          if (var57 < var0.length()) {
                                             var53 = var0.charAt(var57);
                                          } else {
                                             var53 = 0;
                                          }

                                          var22 = var22 * 10L + (long)(var54 - 48);
                                          var54 = var53;
                                       }

                                       if (gg.m(var22, 1000000000000000000L) >= 0) {
                                          var57 = var10 - var7 + var14;
                                          var51 = true;
                                       } else {
                                          char var55 = var0.charAt(var9);

                                          for(var7 = var9; var7 != var6 && gg.m(var22, 1000000000000000000L) < 0; var7 = var11) {
                                             var11 = var7 + 1;
                                             if (var11 < var0.length()) {
                                                var53 = var0.charAt(var11);
                                             } else {
                                                var53 = 0;
                                             }

                                             var22 = var22 * 10L + (long)(var55 - 48);
                                             var55 = var53;
                                          }

                                          var57 = var9 - var7 + var14;
                                          var51 = true;
                                       }
                                       break label2336;
                                    }
                                 }

                                 var51 = false;
                              }

                              if (var57 >= -10 && var57 < 11 && !var51 && gg.m(var22, 16777216L) <= 0) {
                                 var2 = (float)var22;
                                 if (var57 < 0) {
                                    var6 = -var57;
                                    var3 = var2 / bfc.a[var6];
                                 } else {
                                    var3 = var2 * bfc.a[var57];
                                 }

                                 var2 = var3;
                                 if (var16) {
                                    var2 = -var3;
                                 }
                              } else {
                                 if (var22 != 0L) {
                                    String var64;
                                    if (var57 >= -126 && var57 < 128) {
                                       var28 = bfc.b[var57 + 325];
                                       var7 = Long.numberOfLeadingZeros(var22);
                                       var26 = var22 << var7;
                                       var22 = var26 >>> 32;
                                       long var30 = var26 & 4294967295L;
                                       var26 = var28 & 4294967295L;
                                       long var32 = var28 >>> 32;
                                       var28 = var30 * var32;
                                       var26 = var22 * var32 + (var26 * var22 + (var30 * var26 >>> 32) + (4294967295L & var28) >>> 32) + (var28 >>> 32);
                                       var6 = (int)(var26 >>> 63);
                                       var7 += var6 ^ 1;
                                       var22 = 511L & var26;
                                       if (var22 != 511L) {
                                          var26 >>>= var6 + 9;
                                          if (var22 != 0L || (3L & var26) != 1L) {
                                             var26 = var26 + 1L >>> 1;
                                             var6 = var7;
                                             var22 = var26;
                                             if (var26 >= 9007199254740992L) {
                                                var6 = var7 - 1;
                                                var22 = 4503599627370496L;
                                             }

                                             var26 = ((long)var57 * 217706L >> 16) + 1087L - (long)var6;
                                             if (var26 >= 1L && var26 <= 2046L) {
                                                if (var16) {
                                                   var24 = Long.MIN_VALUE;
                                                }

                                                var2 = (float)Double.longBitsToDouble(-4503599627370497L & var22 | var26 << 52 | var24);
                                                var51 = true;
                                                var7 = var52;
                                                break label2576;
                                             }

                                             try {
                                                var64 = var0.substring(var17, var5);
                                                var64.getClass();
                                                var2 = Float.parseFloat(var64);
                                             } finally {
                                                ;
                                             }

                                             var51 = true;
                                             var7 = var52;
                                             break label2576;
                                          }
                                       }

                                       try {
                                          var64 = var0.substring(var17, var5);
                                          var64.getClass();
                                          var2 = Float.parseFloat(var64);
                                       } finally {
                                          ;
                                       }

                                       var51 = true;
                                       var7 = var52;
                                       break label2576;
                                    }

                                    try {
                                       var64 = var0.substring(var17, var5);
                                       var64.getClass();
                                       var2 = Float.parseFloat(var64);
                                    } finally {
                                       ;
                                    }

                                    var51 = true;
                                    var7 = var52;
                                    break label2576;
                                 }

                                 var2 = 0.0F;
                              }

                              var51 = true;
                              var7 = var52;
                           }
                        }
                     }
                  }

                  if (var51) {
                     var52 = var7 + 1;
                     var62[var7] = var2;
                     var7 = var62.length;
                     if (var52 >= var7) {
                        var36 = new float[var52 + var52];
                        pwm.bf(var62, var36, var7);
                        var7 = var52;
                     } else {
                        var7 = var52;
                        var36 = var62;
                     }
                  } else {
                     var36 = var62;
                  }

                  while(var5 < var15 && var0.charAt(var5) == ',') {
                     ++var5;
                  }

                  if (var5 >= var15 || !var51) {
                     var6 = var7;
                     break;
                  }

                  var6 = var7;
                  var35 = var61;
                  var34 = var36;
               }
            }

            if (var1 != 'z' && var1 != 'Z') {
               if (var1 == 'm') {
                  for(var7 = 0; var7 <= var6 - 2; var7 += 2) {
                     var2 = var36[var7];
                     var3 = var36[var7 + 1];
                     var35 = new bfu(var2, var3);
                     if (var7 > 0) {
                        var35 = new bft(var2, var3);
                     }

                     ((List)var61).add(var35);
                  }
               } else if (var1 == 'M') {
                  for(var7 = 0; var7 <= var6 - 2; var7 += 2) {
                     var2 = var36[var7];
                     var3 = var36[var7 + 1];
                     var35 = new bfm(var2, var3);
                     if (var7 > 0) {
                        var35 = new bfl(var2, var3);
                     }

                     ((List)var61).add(var35);
                  }
               } else if (var1 == 'l') {
                  for(var7 = 0; var7 <= var6 - 2; var7 += 2) {
                     ((List)var61).add(new bft(var36[var7], var36[var7 + 1]));
                  }
               } else if (var1 == 'L') {
                  for(var7 = 0; var7 <= var6 - 2; var7 += 2) {
                     ((List)var61).add(new bfl(var36[var7], var36[var7 + 1]));
                  }
               } else if (var1 == 'h') {
                  for(var7 = 0; var7 <= var6 - 1; ++var7) {
                     ((List)var61).add(new bfs(var36[var7]));
                  }
               } else if (var1 == 'H') {
                  for(var7 = 0; var7 <= var6 - 1; ++var7) {
                     ((List)var61).add(new bfk(var36[var7]));
                  }
               } else if (var1 == 'v') {
                  for(var7 = 0; var7 <= var6 - 1; ++var7) {
                     ((List)var61).add(new bfy(var36[var7]));
                  }
               } else if (var1 == 'V') {
                  for(var7 = 0; var7 <= var6 - 1; ++var7) {
                     ((List)var61).add(new bfz(var36[var7]));
                  }
               } else if (var1 == 'c') {
                  for(var7 = 0; var7 <= var6 - 6; var7 += 6) {
                     ((List)var61).add(new bfr(var36[var7], var36[var7 + 1], var36[var7 + 2], var36[var7 + 3], var36[var7 + 4], var36[var7 + 5]));
                  }
               } else if (var1 == 'C') {
                  for(var7 = 0; var7 <= var6 - 6; var7 += 6) {
                     ((List)var61).add(new bfj(var36[var7], var36[var7 + 1], var36[var7 + 2], var36[var7 + 3], var36[var7 + 4], var36[var7 + 5]));
                  }
               } else if (var1 == 's') {
                  for(var7 = 0; var7 <= var6 - 4; var7 += 4) {
                     ((List)var61).add(new bfw(var36[var7], var36[var7 + 1], var36[var7 + 2], var36[var7 + 3]));
                  }
               } else if (var1 == 'S') {
                  for(var7 = 0; var7 <= var6 - 4; var7 += 4) {
                     ((List)var61).add(new bfo(var36[var7], var36[var7 + 1], var36[var7 + 2], var36[var7 + 3]));
                  }
               } else if (var1 == 'q') {
                  for(var7 = 0; var7 <= var6 - 4; var7 += 4) {
                     ((List)var61).add(new bfv(var36[var7], var36[var7 + 1], var36[var7 + 2], var36[var7 + 3]));
                  }
               } else if (var1 == 'Q') {
                  for(var7 = 0; var7 <= var6 - 4; var7 += 4) {
                     ((List)var61).add(new bfn(var36[var7], var36[var7 + 1], var36[var7 + 2], var36[var7 + 3]));
                  }
               } else if (var1 == 't') {
                  for(var7 = 0; var7 <= var6 - 2; var7 += 2) {
                     ((List)var61).add(new bfx(var36[var7], var36[var7 + 1]));
                  }
               } else if (var1 == 'T') {
                  for(var7 = 0; var7 <= var6 - 2; var7 += 2) {
                     ((List)var61).add(new bfp(var36[var7], var36[var7 + 1]));
                  }
               } else {
                  float var4;
                  boolean var20;
                  boolean var21;
                  if (var1 == 'a') {
                     for(var7 = 0; var7 <= var6 - 7; var7 += 7) {
                        var3 = var36[var7];
                        var4 = var36[var7 + 1];
                        var2 = var36[var7 + 2];
                        if (Float.compare(var36[var7 + 3], 0.0F) != 0) {
                           var20 = true;
                        } else {
                           var20 = false;
                        }

                        if (Float.compare(var36[var7 + 4], 0.0F) != 0) {
                           var21 = true;
                        } else {
                           var21 = false;
                        }

                        ((List)var61).add(new bfq(var3, var4, var2, var20, var21, var36[var7 + 5], var36[var7 + 6]));
                     }
                  } else {
                     if (var1 != 'A') {
                        StringBuilder var49 = new StringBuilder();
                        var49.append("Unknown command for: ");
                        var49.append(var1);
                        throw new IllegalArgumentException(var49.toString());
                     }

                     for(var7 = 0; var7 <= var6 - 7; var7 += 7) {
                        var4 = var36[var7];
                        var2 = var36[var7 + 1];
                        var3 = var36[var7 + 2];
                        if (Float.compare(var36[var7 + 3], 0.0F) != 0) {
                           var20 = true;
                        } else {
                           var20 = false;
                        }

                        if (Float.compare(var36[var7 + 4], 0.0F) != 0) {
                           var21 = true;
                        } else {
                           var21 = false;
                        }

                        ((List)var61).add(new bfh(var4, var2, var3, var20, var21, var36[var7 + 5], var36[var7 + 6]));
                     }
                  }
               }
            } else {
               ((List)var61).add(bfi.a);
            }

            var35 = var61;
         }
      }
   }
}
