import com.google.android.libraries.oliveoil.bufferflinger.aUnT.zBdGS;
import com.google.android.material.appbar.XD.SSYOSt;
import java.util.ArrayList;
import java.util.Locale;

public final class y implements Cloneable {
   public static final int[] e;
   private static final int h;
   public String a;
   public ArrayList b = new ArrayList();
   public ArrayList c;
   public boolean d;
   public final int f;
   private boolean g;

   static {
      byte var1;
      byte var3;
      label24: {
         String var2 = a.a();
         int var0 = var2.hashCode();
         var1 = 1;
         switch(var0) {
         case -413919155:
            if (var2.equals("DOUBLE_REQUIRED")) {
               var3 = 1;
               break label24;
            }
            break;
         case -99796978:
            if (var2.equals("DOUBLE_OPTIONAL")) {
               var3 = 0;
               break label24;
            }
         }

         var3 = -1;
      }

      byte var4;
      switch(var3) {
      case 0:
         var4 = var1;
         break;
      case 1:
         var4 = 2;
         break;
      default:
         throw new IllegalArgumentException();
      }

      h = var4;
      e = c.P();
   }

   public y() {
      throw null;
   }

   public y(String var1) {
      this.f = h;
      this.i(var1);
   }

   private final int j(int var1) {
      while(true) {
         if (var1 < this.a.length()) {
            char var2 = this.a.charAt(var1);
            if ((var2 >= '0' || "+-.".indexOf(var2) >= 0) && (var2 <= '9' || var2 == 'e' || var2 == 'E' || var2 == 8734)) {
               ++var1;
               continue;
            }
         }

         return var1;
      }
   }

   private final int k(int var1) {
      String var4 = this.a;

      for(byte[] var3 = d.a; var1 < var4.length(); ++var1) {
         char var2 = var4.charAt(var1);
         if (var2 <= 255) {
            if (d.a[var2] != 0) {
               break;
            }
         } else if (var2 >= 8206) {
            if (var2 <= 12336) {
               if ((d.c[d.b[var2 - 8192 >> 5]] >> (var2 & 31) & 1) != 0) {
                  break;
               }
            } else if (var2 >= '﴾' && var2 <= '﹆' && (var2 <= '﴿' || var2 >= '﹅')) {
               break;
            }
         }
      }

      return var1;
   }

   private final int l(int var1) {
      String var2 = this.a;

      for(byte[] var3 = d.a; var1 < var2.length() && d.a(var2.charAt(var1)); ++var1) {
      }

      return var1;
   }

   private final String m() {
      return o(this.a, 0);
   }

   private final String n(int var1) {
      return o(this.a, var1);
   }

   private static String o(String var0, int var1) {
      StringBuilder var5 = new StringBuilder(44);
      if (var1 == 0) {
         var5.append("\"");
      } else {
         var5.append("[at pattern index ");
         var5.append(var1);
         var5.append("] \"");
      }

      if (var0.length() - var1 <= 24) {
         String var4 = var0;
         if (var1 != 0) {
            var4 = var0.substring(var1);
         }

         var5.append(var4);
      } else {
         int var2 = var1 + 20;
         int var3 = var2 - 1;
         if (Character.isHighSurrogate(var0.charAt(var3))) {
            var2 = var3;
         }

         var5.append(var0, var1, var2);
         var5.append(SSYOSt.vCGOqNdDI);
      }

      var5.append("\"");
      return var5.toString();
   }

   private final void p(double var1, int var3, int var4) {
      ArrayList var6 = this.c;
      int var5;
      if (var6 == null) {
         this.c = new ArrayList();
         var5 = 0;
      } else {
         var5 = var6.size();
         if (var5 > 32767) {
            throw new IndexOutOfBoundsException("Too many numeric values");
         }
      }

      this.c.add(var1);
      this.v(14, var3, var4, var5);
   }

   private final void q(int var1, int var2, boolean var3) {
      char var6 = this.a.charAt(var1);
      int var7 = var1 + 1;
      int var10 = 0;
      byte var8;
      if (var6 == '-') {
         if (var7 == var2) {
            throw new NumberFormatException("Bad syntax for numeric value: ".concat(String.valueOf(this.a.substring(var1, var2))));
         }

         var6 = this.a.charAt(var7);
         ++var7;
         var8 = 1;
      } else {
         if (var6 == '+') {
            if (var7 == var2) {
               throw new NumberFormatException("Bad syntax for numeric value: ".concat(String.valueOf(this.a.substring(var1, var2))));
            }

            var6 = this.a.charAt(var7);
            ++var7;
         }

         var8 = 0;
      }

      if (var6 != 8734) {
         int var11;
         for(char var9 = var6; var9 >= '0' && var9 <= '9'; var10 = var11) {
            var11 = var10 * 10 + (var9 - 48);
            if (var11 > var8 + 32767) {
               break;
            }

            if (var7 == var2) {
               if (var8 != 0) {
                  var11 = -var11;
               }

               this.v(13, var1, var2 - var1, var11);
               return;
            }

            var9 = this.a.charAt(var7);
            ++var7;
         }

         this.p(Double.parseDouble(this.a.substring(var1, var2)), var1, var2 - var1);
      } else if (var3 && var7 == var2) {
         double var4;
         if (1 != var8) {
            var4 = Double.POSITIVE_INFINITY;
         } else {
            var4 = Double.NEGATIVE_INFINITY;
         }

         this.p(var4, var1, var2 - var1);
      } else {
         throw new NumberFormatException("Bad syntax for numeric value: ".concat(String.valueOf(this.a.substring(var1, var2))));
      }
   }

   private final boolean r(int var1) {
      return var1 > 0 || ((x)this.b.get(0)).e == 1;
   }

   private final boolean s(int var1) {
      char var2 = this.a.charAt(var1);
      boolean var3 = false;
      if (var2 == 's' || var2 == 'S') {
         int var6 = var1 + 1;
         char var5 = this.a.charAt(var6);
         if (var5 == 'e' || var5 == 'E') {
            var1 = var6 + 1;
            String var4 = this.a;
            var6 = var1 + 1;
            var5 = var4.charAt(var1);
            if (var5 == 'l' || var5 == 'L') {
               var4 = this.a;
               var1 = var6 + 1;
               var2 = var4.charAt(var6);
               if (var2 == 'e' || var2 == 'E') {
                  var2 = this.a.charAt(var1);
                  if (var2 == 'c' || var2 == 'C') {
                     var5 = this.a.charAt(var1 + 1);
                     if (var5 != 't') {
                        if (var5 == 'T') {
                           return true;
                        }
                     } else {
                        var3 = true;
                     }
                  }
               }
            }
         }
      }

      return var3;
   }

   private final int t(int var1, int var2, int var3, int var4) {
      int var6 = var4;
      if (var3 > 32767) {
         IndexOutOfBoundsException var33 = new IndexOutOfBoundsException();
         throw var33;
      } else {
         int var13 = this.b.size();
         this.v(1, var1, var2, var3);
         var1 += var2;

         label578:
         while(var1 < this.a.length()) {
            String var16 = this.a;
            var2 = var1 + 1;
            char var20 = var16.charAt(var1);
            char var24;
            if (var20 == '\'') {
               if (var2 == this.a.length()) {
                  this.v(4, var2, 0, 39);
               } else {
                  label664: {
                     var24 = this.a.charAt(var2);
                     if (var24 == '\'') {
                        var1 = var2 + 1;
                        this.v(3, var2, 1, 0);
                        continue;
                     }

                     if (this.f != 2 && var24 != '{' && var24 != '}') {
                        label614: {
                           if (var6 == 3) {
                              if (var24 == '|') {
                                 break label614;
                              }

                              var1 = 3;
                           } else {
                              var1 = var6;
                           }

                           if (!c.at(var1) || var24 != '#') {
                              this.v(4, var2, 0, 39);
                              break label664;
                           }
                        }
                     }

                     this.v(3, var2 - 1, 1, 0);
                     var1 = var2;

                     while(true) {
                        var2 = this.a.indexOf(39, var1 + 1);
                        if (var2 < 0) {
                           var1 = this.a.length();
                           this.v(4, var1, 0, 39);
                           continue label578;
                        }

                        var1 = var2 + 1;
                        if (var1 >= this.a.length() || this.a.charAt(var1) != '\'') {
                           this.v(3, var2, 1, 0);
                           continue label578;
                        }

                        this.v(3, var1, 1, 0);
                     }
                  }
               }
            } else if (c.at(var4) && var20 == '#') {
               this.v(5, var2 - 1, 1, 0);
            } else {
               label645: {
                  byte var21;
                  if (var20 == '{') {
                     var1 = var2 - 1;
                     int var14 = this.b.size();
                     this.v(6, var1, 1, 0);
                     int var10 = this.l(var1 + 1);
                     if (var10 == this.a.length()) {
                        throw new IllegalArgumentException("Unmatched '{' braces in message ".concat(this.m()));
                     }

                     int var9 = this.k(var10);
                     var16 = this.a;
                     int var7;
                     char var11;
                     boolean var22;
                     if (var10 >= var9) {
                        var1 = -2;
                     } else {
                        label533: {
                           label532: {
                              var7 = var10 + 1;
                              var20 = var16.charAt(var10);
                              if (var20 == '0') {
                                 if (var7 == var9) {
                                    var1 = 0;
                                    break label533;
                                 }

                                 var22 = true;
                                 var1 = 0;
                              } else {
                                 if (var20 < '1' || var20 > '9') {
                                    break label532;
                                 }

                                 var1 = var20 - 48;
                                 var22 = false;
                              }

                              while(true) {
                                 if (var7 >= var9) {
                                    if (var22) {
                                       var1 = -2;
                                    }
                                    break label533;
                                 }

                                 var11 = var16.charAt(var7);
                                 if (var11 < '0' || var11 > '9') {
                                    break;
                                 }

                                 boolean var8;
                                 if (var1 >= 214748364) {
                                    var8 = false;
                                 } else {
                                    var8 = true;
                                 }

                                 var22 |= var8 ^ true;
                                 var1 = var1 * 10 + (var11 - 48);
                                 ++var7;
                              }
                           }

                           var1 = -1;
                        }
                     }

                     if (var1 >= 0) {
                        var2 = var9 - var10;
                        if (var2 > 65535 || var1 > 32767) {
                           throw new IndexOutOfBoundsException("Argument number too large: ".concat(this.n(var10)));
                        }

                        this.v(8, var10, var2, var1);
                     } else {
                        if (var1 != -1) {
                           throw new IllegalArgumentException("Bad argument syntax: ".concat(this.n(var10)));
                        }

                        var1 = var9 - var10;
                        if (var1 > 65535) {
                           throw new IndexOutOfBoundsException("Argument name too long: ".concat(this.n(var10)));
                        }

                        this.d = true;
                        this.v(9, var10, var1, 0);
                     }

                     var2 = this.l(var9);
                     if (var2 == this.a.length()) {
                        throw new IllegalArgumentException("Unmatched '{' braces in message ".concat(this.m()));
                     }

                     var20 = this.a.charAt(var2);
                     if (var20 == '}') {
                        var21 = 1;
                     } else {
                        if (var20 != ',') {
                           throw new IllegalArgumentException("Bad argument syntax: ".concat(this.n(var10)));
                        }

                        int var25 = this.l(var2 + 1);

                        char var23;
                        for(var1 = var25; var1 < this.a.length(); ++var1) {
                           var23 = this.a.charAt(var1);
                           if ((var23 < 'a' || var23 > 'z') && (var23 < 'A' || var23 > 'Z')) {
                              break;
                           }
                        }

                        var7 = var1 - var25;
                        var9 = this.l(var1);
                        if (var9 == this.a.length()) {
                           throw new IllegalArgumentException("Unmatched '{' braces in message ".concat(this.m()));
                        }

                        label487: {
                           if (var7 != 0) {
                              var20 = this.a.charAt(var9);
                              var23 = var20;
                              if (var20 == ',') {
                                 break label487;
                              }

                              if (var20 == '}') {
                                 var23 = '}';
                                 break label487;
                              }
                           }

                           throw new IllegalArgumentException("Bad argument syntax: ".concat(this.n(var10)));
                        }

                        if (var7 > 65535) {
                           throw new IndexOutOfBoundsException("Argument type name too long: ".concat(this.n(var10)));
                        }

                        int var27;
                        int var28;
                        if (var7 == 6) {
                           label666: {
                              var16 = this.a;
                              var1 = var25 + 1;
                              var11 = var16.charAt(var25);
                              if (var11 == 'c' || var11 == 'C') {
                                 var16 = this.a;
                                 var27 = var1 + 1;
                                 char var12 = var16.charAt(var1);
                                 if (var12 == 'h' || var12 == 'H') {
                                    var16 = this.a;
                                    var28 = var27 + 1;
                                    var11 = var16.charAt(var27);
                                    if (var11 == 'o' || var11 == 'O') {
                                       var16 = this.a;
                                       var27 = var28 + 1;
                                       var12 = var16.charAt(var28);
                                       if (var12 == 'i' || var12 == 'I') {
                                          var12 = this.a.charAt(var27);
                                          if (var12 == 'c' || var12 == 'C') {
                                             var11 = this.a.charAt(var27 + 1);
                                             if (var11 == 'e') {
                                                var21 = 3;
                                                break label666;
                                             }

                                             if (var11 == 'E') {
                                                var21 = 3;
                                                break label666;
                                             }
                                          }
                                       }
                                    }
                                 }
                              }

                              var11 = this.a.charAt(var25);
                              if (var11 == 'p' || var11 == 'P') {
                                 var16 = this.a;
                                 var27 = var1 + 1;
                                 var20 = var16.charAt(var1);
                                 if (var20 == 'l' || var20 == 'L') {
                                    var16 = this.a;
                                    var28 = var27 + 1;
                                    var20 = var16.charAt(var27);
                                    if (var20 == 'u' || var20 == 'U') {
                                       var16 = this.a;
                                       var1 = var28 + 1;
                                       var11 = var16.charAt(var28);
                                       if (var11 == 'r' || var11 == 'R') {
                                          var11 = this.a.charAt(var1);
                                          if (var11 == 'a' || var11 == 'A') {
                                             var20 = this.a.charAt(var1 + 1);
                                             if (var20 == 'l' || var20 == 'L') {
                                                var21 = 4;
                                                break label666;
                                             }
                                          }
                                       }
                                    }
                                 }
                              }

                              if (this.s(var25)) {
                                 var21 = 5;
                              } else {
                                 var21 = 2;
                              }
                           }
                        } else if (var7 == 13) {
                           label625: {
                              if (this.s(var25)) {
                                 var1 = var25 + 6;
                                 var24 = this.a.charAt(var1);
                                 if (var24 == 'o' || var24 == 'O') {
                                    ++var1;
                                    var24 = this.a.charAt(var1);
                                    if (var24 == 'r' || var24 == 'R') {
                                       var7 = var1 + 1;
                                       var16 = this.a;
                                       var1 = var7 + 1;
                                       var24 = var16.charAt(var7);
                                       if (var24 == 'd' || var24 == 'D') {
                                          var16 = this.a;
                                          var7 = var1 + 1;
                                          var20 = var16.charAt(var1);
                                          if (var20 == 'i' || var20 == 'I') {
                                             var16 = this.a;
                                             var1 = var7 + 1;
                                             var24 = var16.charAt(var7);
                                             if (var24 == 'n' || var24 == 'N') {
                                                var24 = this.a.charAt(var1);
                                                if (var24 == 'a' || var24 == 'A') {
                                                   var20 = this.a.charAt(var1 + 1);
                                                   if (var20 == 'l' || var20 == 'L') {
                                                      var21 = 6;
                                                      break label625;
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }

                              var21 = 2;
                           }

                           var7 = 13;
                        } else {
                           var21 = 2;
                        }

                        ((x)this.b.get(var14)).c = (short)(var21 - 1);
                        if (var21 == 2) {
                           this.v(10, var25, var7, 0);
                        }

                        if (var23 == '}') {
                           if (var21 != 2) {
                              throw new IllegalArgumentException("No style field for complex argument: ".concat(this.n(var10)));
                           }

                           var2 = var9;
                        } else {
                           var25 = var9 + 1;
                           if (var21 == 2) {
                              var2 = var25;
                              var7 = 0;

                              label344:
                              while(true) {
                                 while(var2 < this.a.length()) {
                                    var16 = this.a;
                                    var9 = var2 + 1;
                                    var23 = var16.charAt(var2);
                                    if (var23 == '\'') {
                                       var2 = this.a.indexOf(39, var9);
                                       if (var2 < 0) {
                                          throw new IllegalArgumentException("Quoted literal argument style text reaches to the end of the message: ".concat(this.n(var25)));
                                       }

                                       ++var2;
                                    } else {
                                       if (var23 == '{') {
                                          var2 = var7 + 1;
                                       } else {
                                          if (var23 != '}') {
                                             var2 = var9;
                                             continue;
                                          }

                                          if (var7 <= 0) {
                                             var2 = var9 - 1;
                                             var7 = var2 - var25;
                                             if (var7 > 65535) {
                                                throw new IndexOutOfBoundsException("Argument style text too long: ".concat(this.n(var25)));
                                             }

                                             this.v(11, var25, var7, 0);
                                             break label344;
                                          }

                                          var2 = var7 - 1;
                                       }

                                       var7 = var2;
                                       var2 = var9;
                                    }
                                 }

                                 throw new IllegalArgumentException("Unmatched '{' braces in message ".concat(this.m()));
                              }
                           } else {
                              String var17;
                              StringBuilder var32;
                              if (var21 == 3) {
                                 label372: {
                                    var2 = this.l(var25);
                                    if (var2 != this.a.length() && this.a.charAt(var2) != '}') {
                                       while(true) {
                                          var7 = this.j(var2);
                                          var9 = var7 - var2;
                                          if (var9 == 0) {
                                             throw new IllegalArgumentException("Bad choice pattern syntax: ".concat(this.n(var25)));
                                          }

                                          if (var9 > 65535) {
                                             throw new IndexOutOfBoundsException("Choice number too long: ".concat(this.n(var2)));
                                          }

                                          this.q(var2, var7, true);
                                          var2 = this.l(var7);
                                          if (var2 == this.a.length()) {
                                             throw new IllegalArgumentException("Bad choice pattern syntax: ".concat(this.n(var25)));
                                          }

                                          char var5 = this.a.charAt(var2);
                                          if (var5 != '#' && var5 != '<' && var5 != 8804) {
                                             var17 = this.n(var25);
                                             var32 = new StringBuilder();
                                             var32.append("Expected choice separator (#<≤) instead of '");
                                             var32.append(var5);
                                             var32.append("' in choice pattern ");
                                             var32.append(var17);
                                             throw new IllegalArgumentException(var32.toString());
                                          }

                                          this.v(12, var2, 1, 0);
                                          var2 = this.t(var2 + 1, 0, var3 + 1, 3);
                                          if (var2 == this.a.length()) {
                                             break label372;
                                          }

                                          if (this.a.charAt(var2) == '}') {
                                             if (!this.r(var3)) {
                                                throw new IllegalArgumentException("Bad choice pattern syntax: ".concat(this.n(var25)));
                                             }
                                             break label372;
                                          }

                                          var2 = this.l(var2 + 1);
                                       }
                                    }

                                    throw new IllegalArgumentException("Missing choice argument pattern in ".concat(this.m()));
                                 }
                              } else {
                                 var7 = var25;
                                 boolean var26 = false;
                                 var22 = true;

                                 while(true) {
                                    var10 = this.l(var7);
                                    boolean var15;
                                    if (var10 == this.a.length()) {
                                       var15 = true;
                                    } else {
                                       var15 = false;
                                    }

                                    var16 = zBdGS.PPeZuU;
                                    String var18;
                                    String var31;
                                    if (var15 || this.a.charAt(var10) == '}') {
                                       if (var15 == this.r(var3)) {
                                          var18 = c.as(var21).toLowerCase(Locale.ENGLISH);
                                          var31 = this.n(var25);
                                          StringBuilder var29 = new StringBuilder();
                                          var29.append(var16);
                                          var29.append(var18);
                                          var29.append(" pattern syntax: ");
                                          var29.append(var31);
                                          throw new IllegalArgumentException(var29.toString());
                                       }

                                       if (!var26) {
                                          var18 = c.as(var21).toLowerCase(Locale.ENGLISH);
                                          var17 = this.m();
                                          var32 = new StringBuilder();
                                          var32.append("Missing 'other' keyword in ");
                                          var32.append(var18);
                                          var32.append(" pattern in ");
                                          var32.append(var17);
                                          throw new IllegalArgumentException(var32.toString());
                                       }

                                       var2 = var10;
                                       break;
                                    }

                                    if (c.at(var21) && this.a.charAt(var10) == '=') {
                                       var7 = var10 + 1;
                                       var2 = this.j(var7);
                                       var27 = var2 - var10;
                                       if (var27 == 1) {
                                          var31 = c.as(var21).toLowerCase(Locale.ENGLISH);
                                          var17 = this.n(var25);
                                          StringBuilder var30 = new StringBuilder();
                                          var30.append(var16);
                                          var30.append(var31);
                                          var30.append(" pattern syntax: ");
                                          var30.append(var17);
                                          throw new IllegalArgumentException(var30.toString());
                                       }

                                       if (var27 > 65535) {
                                          throw new IndexOutOfBoundsException("Argument selector too long: ".concat(this.n(var10)));
                                       }

                                       this.v(12, var10, var27, 0);
                                       this.q(var7, var2, false);
                                    } else {
                                       var27 = this.k(var10);
                                       var28 = var27 - var10;
                                       if (var28 == 0) {
                                          var17 = c.as(var21).toLowerCase(Locale.ENGLISH);
                                          var18 = this.n(var25);
                                          StringBuilder var19 = new StringBuilder();
                                          var19.append(var16);
                                          var19.append(var17);
                                          var19.append(" pattern syntax: ");
                                          var19.append(var18);
                                          throw new IllegalArgumentException(var19.toString());
                                       }

                                       if (c.at(var21)) {
                                          var7 = var28;
                                          if (var28 == 6) {
                                             if (var27 < this.a.length()) {
                                                if (this.a.regionMatches(var10, "offset:", 0, 7)) {
                                                   if (!var22) {
                                                      throw new IllegalArgumentException("Plural argument 'offset:' (if present) must precede key-message pairs: ".concat(this.n(var25)));
                                                   }

                                                   var2 = this.l(var27 + 1);
                                                   var7 = this.j(var2);
                                                   if (var7 == var2) {
                                                      throw new IllegalArgumentException("Missing value for plural 'offset:' ".concat(this.n(var25)));
                                                   }

                                                   if (var7 - var2 > 65535) {
                                                      throw new IndexOutOfBoundsException("Plural offset value too long: ".concat(this.n(var2)));
                                                   }

                                                   this.q(var2, var7, false);
                                                   var22 = false;
                                                   continue;
                                                }

                                                var7 = 6;
                                             } else {
                                                var7 = 6;
                                             }
                                          }
                                       } else {
                                          var7 = var28;
                                       }

                                       if (var7 > 65535) {
                                          throw new IndexOutOfBoundsException("Argument selector too long: ".concat(this.n(var10)));
                                       }

                                       this.v(12, var10, var7, 0);
                                       var2 = var27;
                                       if (this.a.regionMatches(var10, "other", 0, var7)) {
                                          var26 = true;
                                          var2 = var27;
                                       }
                                    }

                                    var2 = this.l(var2);
                                    if (var2 == this.a.length() || this.a.charAt(var2) != '{') {
                                       var17 = c.as(var21).toLowerCase(Locale.ENGLISH);
                                       var18 = this.n(var10);
                                       var32 = new StringBuilder();
                                       var32.append("No message fragment after ");
                                       var32.append(var17);
                                       var32.append(" selector: ");
                                       var32.append(var18);
                                       throw new IllegalArgumentException(var32.toString());
                                    }

                                    var7 = this.t(var2, 1, var3 + 1, var21);
                                    var22 = false;
                                 }
                              }
                           }
                        }
                     }

                     this.u(var14, 7, var2, 1, var21 - 1);
                     var1 = var2 + 1;
                     continue;
                  }

                  if (var3 > 0 && var20 == '}') {
                     var20 = '}';
                  } else {
                     if (var6 != 3 || var20 != '|') {
                        break label645;
                     }

                     var6 = 3;
                  }

                  if (var6 == 3 && var20 == '}') {
                     var21 = 0;
                  } else {
                     var21 = 1;
                  }

                  var4 = var2 - 1;
                  this.u(var13, 2, var4, var21, var3);
                  if (var6 == 3) {
                     return var4;
                  }

                  return var2;
               }
            }

            var1 = var2;
         }

         if (var3 <= 0 || var3 == 1 && var6 == 3 && ((x)this.b.get(0)).e != 1) {
            this.u(var13, 2, var1, 0, var3);
            return var1;
         } else {
            throw new IllegalArgumentException("Unmatched '{' braces in message ".concat(this.m()));
         }
      }
   }

   private final void u(int var1, int var2, int var3, int var4, int var5) {
      ((x)this.b.get(var1)).d = this.b.size();
      this.v(var2, var3, var4, var5);
   }

   private final void v(int var1, int var2, int var3, int var4) {
      this.b.add(new x(var1, var2, var3, var4));
   }

   public final double a(x var1) {
      int var2 = var1.e;
      if (var2 == 13) {
         return (double)var1.c;
      } else {
         return var2 == 14 ? (Double)this.c.get(var1.c) : -1.23456789E8D;
      }
   }

   public final int b() {
      return this.b.size();
   }

   public final int c(int var1) {
      int var2 = ((x)this.b.get(var1)).d;
      return var2 < var1 ? var1 : var2;
   }

   public final Object clone() {
      return this.e();
   }

   public final x d(int var1) {
      return (x)this.b.get(var1);
   }

   public final y e() {
      y var1;
      try {
         var1 = (y)super.clone();
      } catch (CloneNotSupportedException var3) {
         throw new z(var3);
      }

      var1.b = (ArrayList)this.b.clone();
      ArrayList var2 = this.c;
      if (var2 != null) {
         var1.c = (ArrayList)var2.clone();
      }

      var1.g = false;
      return var1;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         y var4 = (y)var1;
         int var3 = this.f;
         int var2 = var4.f;
         if (var3 == 0) {
            throw null;
         } else {
            if (var3 == var2) {
               String var5 = this.a;
               if (var5 == null) {
                  if (var4.a != null) {
                     return false;
                  }
               } else if (!var5.equals(var4.a)) {
                  return false;
               }

               if (this.b.equals(var4.b)) {
                  return true;
               }
            }

            return false;
         }
      } else {
         return false;
      }
   }

   public final String f(x var1) {
      int var2 = var1.a;
      return this.a.substring(var2, var1.b + var2);
   }

   public final boolean g(x var1, String var2) {
      return this.a.regionMatches(var1.a, var2, 0, var1.b);
   }

   public final int h(int var1) {
      return ((x)this.b.get(var1)).e;
   }

   public final int hashCode() {
      int var2 = this.f;
      c.ai(var2);
      String var3 = this.a;
      int var1;
      if (var3 != null) {
         var1 = var3.hashCode();
      } else {
         var1 = 0;
      }

      return (var2 * 37 + var1) * 37 + this.b.hashCode();
   }

   public final void i(String var1) {
      this.a = var1;
      this.d = false;
      this.b.clear();
      ArrayList var2 = this.c;
      if (var2 != null) {
         var2.clear();
      }

      this.t(0, 0, 0, 1);
   }

   public final String toString() {
      return this.a;
   }
}
