import com.google.android.material.search.Ztp.sYWXtqVx;
import com.google.googlex.gcam.base.HmAh.RbaSbznIXS;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.regex.Pattern;

public final class v implements Serializable {
   public static final v a;
   static final Pattern b;
   static final Pattern c;
   static final Pattern d;
   static final Pattern e;
   static final Pattern f;
   static final Pattern g;
   private static final m i;
   private static final t j;
   private static final long serialVersionUID = 1L;
   public final u h;

   static {
      j var0 = new j();
      i = var0;
      t var2 = new t("other", var0, (q)null, (q)null);
      j = var2;
      u var1 = new u();
      var1.a(var2);
      a = new v(var1);
      b = Pattern.compile("\\s*\\Q\\E@\\s*");
      c = Pattern.compile("\\s*or\\s*");
      d = Pattern.compile("\\s*and\\s*");
      e = Pattern.compile("\\s*,\\s*");
      Pattern.compile("\\s*\\Q..\\E\\s*");
      f = Pattern.compile("\\s*~\\s*");
      g = Pattern.compile("\\s*;\\s*");
   }

   public v(u var1) {
      this.h = var1;
      LinkedHashSet var2 = new LinkedHashSet();
      Iterator var3 = var1.b.iterator();

      while(var3.hasNext()) {
         var2.add(((t)var3.next()).a);
      }

      Collections.unmodifiableSet(var2);
   }

   public static t a(String var0) {
      if (var0.length() == 0) {
         return j;
      } else {
         var0 = var0.toLowerCase(Locale.ENGLISH);
         int var6 = var0.indexOf(58);
         if (var6 == -1) {
            ParseException var38 = new ParseException(c.aA(var0, "missing ':' in rule description '", "'"), 0);
            throw var38;
         } else {
            String var22 = var0.substring(0, var6).trim();

            int var5;
            for(var5 = 0; var5 < var22.length(); ++var5) {
               char var7 = var22.charAt(var5);
               if (var7 < 'a' || var7 > 'z') {
                  throw new ParseException(c.aA(var22, "keyword '", " is not valid"), 0);
               }
            }

            String var23 = var0.substring(var6 + 1).trim();
            String[] var21 = b.split(var23);
            q var20;
            q var34;
            switch(var21.length) {
            case 1:
               var34 = null;
               var20 = null;
               break;
            case 2:
               var34 = q.a(var21[1]);
               if (var34.c == 2) {
                  var20 = var34;
                  var34 = null;
               } else {
                  var20 = null;
               }
               break;
            case 3:
               var34 = q.a(var21[1]);
               var20 = q.a(var21[2]);
               if (var34.c == 1 && var20.c == 2) {
                  break;
               }

               throw new IllegalArgumentException("Must have @integer then @decimal in ".concat(String.valueOf(var23)));
            default:
               throw new IllegalArgumentException("Too many samples in ".concat(String.valueOf(var23)));
            }

            boolean var14 = var22.equals("other");
            boolean var13;
            if (var21[0].length() != 0) {
               var13 = false;
            } else {
               var13 = true;
            }

            if (var14 != var13) {
               throw new IllegalArgumentException("The keyword 'other' must have no constraints, just samples.");
            } else {
               Object var44;
               q var45;
               if (var14) {
                  m var47 = i;
                  var45 = var20;
                  var44 = var47;
               } else {
                  String var42 = var21[0];
                  String[] var24 = c.split(var42);
                  Object var43 = null;
                  var5 = 0;

                  while(true) {
                     if (var5 >= var24.length) {
                        var44 = var43;
                        var45 = var20;
                        break;
                     }

                     String[] var27 = d.split(var24[var5]);
                     var6 = 0;

                     Object var51;
                     for(var44 = null; var6 < var27.length; var44 = var51) {
                        m var26 = i;
                        String var29 = var27[var6].trim();
                        ArrayList var25 = new ArrayList();
                        int var40 = 0;

                        int var9;
                        for(var9 = -1; var40 < var29.length(); var9 = var5) {
                           char var39 = var29.charAt(var40);
                           if (var39 > ' ' || var39 != ' ' && var39 != '\t' && var39 != '\n' && var39 != '\f' && var39 != '\r') {
                              if (var39 <= '=' && var39 >= '!' && (var39 == '!' || var39 == '%' || var39 == ',' || var39 == '.' || var39 == '=')) {
                                 if (var9 >= 0) {
                                    var25.add(var29.substring(var9, var40));
                                 }

                                 var25.add(var29.substring(var40, var40 + 1));
                                 var5 = -1;
                              } else {
                                 var5 = var9;
                                 if (var9 < 0) {
                                    var5 = var40;
                                 }
                              }
                           } else {
                              var5 = var9;
                              if (var9 >= 0) {
                                 var25.add(var29.substring(var9, var40));
                                 var5 = -1;
                              }
                           }

                           ++var40;
                        }

                        if (var9 >= 0) {
                           var25.add(var29.substring(var9));
                        }

                        String[] var28 = (String[])var25.toArray(new String[var25.size()]);
                        String var48 = var28[0];

                        boolean var10001;
                        try {
                           var5 = var48.hashCode();
                        } catch (Exception var33) {
                           var10001 = false;
                           throw e(var48, var29);
                        }

                        byte var41;
                        label335: {
                           switch(var5) {
                           case 102:
                              if (var48.equals("f")) {
                                 var41 = 2;
                                 break label335;
                              }
                              break;
                           case 105:
                              if (var48.equals("i")) {
                                 var41 = 1;
                                 break label335;
                              }
                              break;
                           case 106:
                              if (var48.equals("j")) {
                                 var41 = 6;
                                 break label335;
                              }
                              break;
                           case 110:
                              if (var48.equals("n")) {
                                 var41 = 0;
                                 break label335;
                              }
                              break;
                           case 116:
                              if (var48.equals("t")) {
                                 var41 = 3;
                                 break label335;
                              }
                              break;
                           case 118:
                              if (var48.equals("v")) {
                                 var41 = 4;
                                 break label335;
                              }
                              break;
                           case 119:
                              if (var48.equals("w")) {
                                 var41 = 5;
                                 break label335;
                              }
                           }

                           var41 = -1;
                        }

                        switch(var41) {
                        case 0:
                           var5 = 1;
                           break;
                        case 1:
                           var5 = 2;
                           break;
                        case 2:
                           var5 = 3;
                           break;
                        case 3:
                           var5 = 4;
                           break;
                        case 4:
                           var5 = 5;
                           break;
                        case 5:
                           var5 = 6;
                           break;
                        case 6:
                           var5 = 7;
                           break;
                        default:
                           IllegalArgumentException var37;
                           try {
                              var37 = new IllegalArgumentException;
                           } catch (Exception var32) {
                              var10001 = false;
                              throw e(var48, var29);
                           }

                           try {
                              var37.<init>();
                              throw var37;
                           } catch (Exception var31) {
                              var10001 = false;
                              throw e(var48, var29);
                           }
                        }

                        Object var35;
                        if (var28.length <= 1) {
                           var35 = var44;
                           var20 = var34;
                           var51 = var26;
                        } else {
                           var48 = var28[1];
                           if (!sYWXtqVx.TkizJXt.equals(var48) && !"%".equals(var48)) {
                              var40 = 2;
                              var9 = 0;
                           } else {
                              var9 = Integer.parseInt(var28[2]);
                              var48 = d(var28, 3, var29);
                              var40 = 4;
                           }

                           if ("not".equals(var48)) {
                              var48 = d(var28, var40, var29);
                              if ("=".equals(var48)) {
                                 throw e(var48, var29);
                              }

                              var13 = false;
                              ++var40;
                           } else if ("!".equals(var48)) {
                              var48 = d(var28, var40, var29);
                              if (!"=".equals(var48)) {
                                 throw e(var48, var29);
                              }

                              ++var40;
                              var13 = false;
                           } else {
                              var13 = true;
                           }

                           boolean var15;
                           if (!"is".equals(var48) && !"in".equals(var48) && !"=".equals(var48)) {
                              if (!"within".equals(var48)) {
                                 throw e(var48, var29);
                              }

                              var48 = d(var28, var40, var29);
                              var15 = false;
                              ++var40;
                              var14 = false;
                           } else {
                              var14 = "is".equals(var48);
                              if (var14 && !var13) {
                                 throw e(var48, var29);
                              }

                              var48 = d(var28, var40, var29);
                              var15 = true;
                              ++var40;
                           }

                           if ("not".equals(var48)) {
                              if (!var14 && !var13) {
                                 throw e(var48, var29);
                              }

                              var48 = d(var28, var40, var29);
                              var13 ^= true;
                              ++var40;
                           }

                           ArrayList var30 = new ArrayList();
                           double var1 = -9.223372036854776E18D;
                           double var3 = 9.223372036854776E18D;
                           Object var49 = var44;
                           var20 = var34;

                           while(true) {
                              int var10;
                              int var11;
                              long var16;
                              long var18;
                              label301: {
                                 var35 = var49;
                                 var18 = Long.parseLong(var48);
                                 var11 = var28.length;
                                 if (var40 < var11) {
                                    var10 = var40 + 1;
                                    var48 = d(var28, var40, var29);
                                    if (var48.equals(".")) {
                                       int var12 = var10 + 1;
                                       var48 = d(var28, var10, var29);
                                       if (!var48.equals(".")) {
                                          throw e(var48, var29);
                                       }

                                       var40 = var12 + 1;
                                       var48 = d(var28, var12, var29);
                                       var16 = Long.parseLong(var48);
                                       if (var40 < var11) {
                                          var10 = var40 + 1;
                                          var48 = d(var28, var40, var29);
                                          if (!var48.equals(",")) {
                                             throw e(var48, var29);
                                          }

                                          var40 = var10;
                                       }
                                       break label301;
                                    }

                                    if (!var48.equals(",")) {
                                       throw e(var48, var29);
                                    }

                                    var40 = var10;
                                 }

                                 var16 = var18;
                              }

                              StringBuilder var36;
                              if (var18 > var16) {
                                 var36 = new StringBuilder();
                                 var36.append(var18);
                                 var36.append("~");
                                 var36.append(var16);
                                 throw e(var36.toString(), var29);
                              }

                              if (var9 != 0 && var16 >= (long)var9) {
                                 var36 = new StringBuilder();
                                 var36.append(var16);
                                 var36.append(">mod=");
                                 var36.append(var9);
                                 throw e(var36.toString(), var29);
                              }

                              var30.add(var18);
                              var30.add(var16);
                              var3 = Math.min(var3, (double)var18);
                              var1 = Math.max(var1, (double)var16);
                              if (var40 >= var11) {
                                 if (var48.equals(",")) {
                                    throw e(var48, var29);
                                 }

                                 long[] var50;
                                 if (var30.size() == 2) {
                                    var50 = null;
                                 } else {
                                    var10 = var30.size();
                                    var50 = new long[var10];

                                    for(var40 = 0; var40 < var10; ++var40) {
                                       var50[var40] = (Long)var30.get(var40);
                                    }
                                 }

                                 if (var3 != var1 && var14 && !var13) {
                                    throw e("is not <range>", var29);
                                 }

                                 var51 = new s(var9, var13, var5, var15, var3, var1, var50);
                                 break;
                              }

                              var48 = d(var28, var40, var29);
                              ++var40;
                              var49 = var49;
                           }
                        }

                        if (var35 != null) {
                           var51 = new k((m)var35, (m)var51);
                        }

                        ++var6;
                        var34 = var20;
                     }

                     if (var43 == null) {
                        var43 = var44;
                     } else {
                        var43 = new r((m)var43, (m)var44);
                     }

                     ++var5;
                  }
               }

               return new t(var22, (m)var44, var34, var45);
            }
         }
      }
   }

   public static void b(StringBuilder var0, double var1, double var3, boolean var5) {
      if (var5) {
         var0.append(",");
      }

      if (var1 == var3) {
         var0.append(c(var1));
      } else {
         String var7 = c(var1);
         String var6 = c(var3);
         StringBuilder var8 = new StringBuilder();
         var8.append(var7);
         var8.append("..");
         var8.append(var6);
         var0.append(var8.toString());
      }
   }

   private static String c(double var0) {
      long var2 = (long)var0;
      String var4;
      if (var0 == (double)var2) {
         var4 = String.valueOf(var2);
      } else {
         var4 = String.valueOf(var0);
      }

      return var4;
   }

   private static String d(String[] var0, int var1, String var2) {
      if (var1 < var0.length) {
         return var0[var1];
      } else {
         throw new ParseException(c.aA(var2, "missing token at end of '", "'"), -1);
      }
   }

   private static ParseException e(String var0, String var1) {
      StringBuilder var2 = new StringBuilder();
      var2.append(RbaSbznIXS.owQPijZnD);
      var2.append(var0);
      var2.append("' in '");
      var2.append(var1);
      var2.append("'");
      return new ParseException(var2.toString(), -1);
   }

   public final boolean equals(Object var1) {
      if (var1 instanceof v) {
         v var2 = (v)var1;
         if (var2 != null && this.toString().equals(var2.toString())) {
            return true;
         }
      }

      return false;
   }

   @Deprecated
   public final int hashCode() {
      return this.h.hashCode();
   }

   public final String toString() {
      return this.h.toString();
   }
}
