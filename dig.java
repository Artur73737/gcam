import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class dig {
   static final Set a = new HashSet(Arrays.asList("xml:lang", "rdf:resource", "rdf:ID", "rdf:bagID", "rdf:nodeID"));
   public static final int b = 0;

   public static final void a(did var0, int var1, dia var2, dhr var3, OutputStreamWriter var4, dio var5, int var6, int var7) {
      Iterator var17 = var0.h();

      while(true) {
         did var18;
         do {
            if (!var17.hasNext()) {
               return;
            }

            var18 = (did)var17.next();
         } while(i(var18));

         String var15 = var18.a;
         boolean var12 = "[]".equals(var15);
         boolean var13 = true;
         if (var12) {
            var15 = "rdf:li";
         }

         g(var1, var4, var5);
         var4.write(60);
         var4.write(var15);
         Iterator var16 = var18.i();
         boolean var14 = false;
         boolean var8 = false;
         var12 = false;

         while(var16.hasNext()) {
            var0 = (did)var16.next();
            if (!a.contains(var0.a)) {
               var8 = true;
            } else {
               var12 = "rdf:resource".equals(var0.a);
               var4.write(32);
               var4.write(var0.a);
               var4.write("=\"");
               k(var0.b, true, var4);
               var4.write(34);
            }
         }

         Iterator var20;
         int var22;
         if (var8) {
            var4.write(" rdf:parseType=\"Resource\">");
            h(var4, var5);
            var22 = var1 + 1;
            b(var18, true, var22, var2, var3, var4, var5, var6, var7);
            var20 = var18.i();

            while(var20.hasNext()) {
               b((did)var20.next(), false, var22, var2, var3, var4, var5, var6, var7);
            }

            var12 = true;
         } else if (!var18.g().l()) {
            Boolean var21 = Boolean.TRUE;
            Boolean var23 = Boolean.TRUE;
            if (var18.g().p()) {
               var4.write(" rdf:resource=\"");
               k(var18.b, true, var4);
               var4.write("\"/>");
               h(var4, var5);
               var21 = Boolean.FALSE;
            } else {
               String var19 = var18.b;
               if (var19 != null && var19.length() != 0) {
                  var4.write(62);
                  k(var18.b, false, var4);
                  var23 = Boolean.FALSE;
               } else {
                  var4.write("/>");
                  h(var4, var5);
                  var21 = Boolean.FALSE;
               }
            }

            Boolean var24 = (Boolean)var21;
            var13 = var21;
            var12 = (Boolean)(new Object[]{var21, var23})[1];
         } else if (var18.g().d()) {
            var4.write(62);
            h(var4, var5);
            var22 = var1 + 1;
            l(var18, true, var22, var4, var5);
            if (var18.g().i()) {
               car.m(var18);
            }

            a(var18, var1 + 2, var2, var3, var4, var5, var6, var7);
            l(var18, false, var22, var4, var5);
            var12 = true;
            var13 = true;
         } else {
            var20 = var18.h();
            boolean var9 = false;
            var8 = false;

            boolean var10;
            boolean var11;
            while(true) {
               var10 = var9;
               var11 = var8;
               if (!var20.hasNext()) {
                  break;
               }

               var13 = i((did)var20.next());
               var10 = var9 | var13 ^ true;
               var11 = var8 | var13;
               var9 = var10;
               var8 = var11;
               if (var11) {
                  var9 = var10;
                  var8 = var11;
                  if (var10) {
                     break;
                  }
               }
            }

            if (var12 && var10) {
               throw new dhl("Can't mix rdf:resource qualifier and element fields", 202);
            }

            if (!var18.s()) {
               var4.write(" rdf:parseType=\"Resource\"/>");
               h(var4, var5);
               var12 = var14;
            } else if (!var10) {
               d(var18, var1 + 1, var2, var3, var4, var5, var6, var7);
               var4.write("/>");
               h(var4, var5);
               var12 = var14;
            } else if (!var11) {
               var4.write(" rdf:parseType=\"Resource\">");
               h(var4, var5);
               a(var18, var1 + 1, var2, var3, var4, var5, var6, var7);
               var12 = true;
            } else {
               var4.write(62);
               h(var4, var5);
               var22 = var1 + 1;
               g(var22, var4, var5);
               var4.write("<rdf:Description");
               d(var18, var1 + 2, var2, var3, var4, var5, var6, var7);
               var4.write(">");
               h(var4, var5);
               a(var18, var22, var2, var3, var4, var5, var6, var7);
               g(var22, var4, var5);
               var4.write("</rdf:Description>");
               h(var4, var5);
               var12 = true;
            }

            var14 = true;
            var13 = var12;
            var12 = var14;
         }

         if (var13) {
            if (var12) {
               g(var1, var4, var5);
            }

            var4.write("</");
            var4.write(var15);
            var4.write(62);
            h(var4, var5);
         }
      }
   }

   public static final void b(did var0, boolean var1, int var2, dia var3, dhr var4, OutputStreamWriter var5, dio var6, int var7, int var8) {
      String var15 = var0.a;
      String var14;
      if (var1) {
         var14 = "rdf:value";
      } else {
         var14 = var15;
         if ("[]".equals(var15)) {
            var14 = "rdf:li";
         }
      }

      g(var2, var5, var6);
      var5.write(60);
      var5.write(var14);
      Iterator var23 = var0.i();
      boolean var10 = false;
      boolean var9 = false;
      boolean var12 = false;

      while(true) {
         boolean var13 = var23.hasNext();
         boolean var11 = true;
         if (!var13) {
            boolean var20;
            boolean var21;
            int var22;
            if (var9 && !var1) {
               if (var12) {
                  throw new dhl("Can't mix rdf:resource and general qualifiers", 202);
               }

               var5.write(" rdf:parseType=\"Resource\">");
               h(var5, var6);
               var22 = var2 + 1;
               b(var0, true, var22, var3, var4, var5, var6, var7, var8);
               var23 = var0.i();

               while(var23.hasNext()) {
                  var0 = (did)var23.next();
                  if (!a.contains(var0.a)) {
                     b(var0, false, var22, var3, var4, var5, var6, var7, var8);
                  }
               }

               var21 = true;
               var20 = var11;
            } else if (!var0.g().l()) {
               if (var0.g().p()) {
                  var5.write(" rdf:resource=\"");
                  k(var0.b, true, var5);
                  var5.write("\"/>");
                  h(var5, var6);
                  var21 = var10;
                  var20 = var11;
               } else {
                  String var18 = var0.b;
                  if (var18 != null && !"".equals(var18)) {
                     var5.write(62);
                     k(var0.b, false, var5);
                     var21 = true;
                     var20 = false;
                  } else {
                     var5.write("/>");
                     h(var5, var6);
                     var21 = var10;
                     var20 = var11;
                  }
               }
            } else if (var0.g().d()) {
               var5.write(62);
               h(var5, var6);
               var22 = var2 + 1;
               l(var0, true, var22, var5, var6);
               if (var0.g().i()) {
                  car.m(var0);
               }

               var23 = var0.h();

               while(var23.hasNext()) {
                  b((did)var23.next(), false, var2 + 2, var3, var4, var5, var6, var7, var8);
               }

               l(var0, false, var22, var5, var6);
               var21 = true;
               var20 = true;
            } else if (!var12) {
               if (!var0.s()) {
                  var5.write(" rdf:parseType=\"Resource\"/>");
                  h(var5, var6);
                  var20 = true;
                  var21 = var10;
               } else {
                  var5.write(" rdf:parseType=\"Resource\">");
                  h(var5, var6);
                  Iterator var17 = var0.h();

                  while(var17.hasNext()) {
                     b((did)var17.next(), false, var2 + 1, var3, var4, var5, var6, var7, var8);
                  }

                  var21 = true;
                  var20 = true;
               }
            } else {
               Iterator var19 = var0.h();

               while(var19.hasNext()) {
                  var0 = (did)var19.next();
                  if (!i(var0)) {
                     throw new dhl("Can't mix rdf:resource and complex fields", 202);
                  }

                  h(var5, var6);
                  g(var2 + 1, var5, var6);
                  var5.write(32);
                  var5.write(var0.a);
                  var5.write("=\"");
                  k(var0.b, true, var5);
                  var5.write(34);
               }

               var5.write("/>");
               h(var5, var6);
               var20 = true;
               var21 = var10;
            }

            if (var21) {
               if (var20) {
                  g(var2, var5, var6);
               }

               var5.write("</");
               var5.write(var14);
               var5.write(62);
               h(var5, var6);
            }

            return;
         }

         did var16 = (did)var23.next();
         if (!a.contains(var16.a)) {
            var9 = true;
         } else {
            var13 = "rdf:resource".equals(var16.a);
            var12 = var13;
            if (!var1) {
               var5.write(32);
               var5.write(var16.a);
               var5.write("=\"");
               k(var16.b, true, var5);
               var5.write(34);
               var12 = var13;
            }
         }
      }
   }

   public static final void c(dia var0, dhr var1, OutputStreamWriter var2, dio var3, int var4, int var5) {
      var2.write(34);
      String var6 = var0.a.a;
      if (var6 != null) {
         k(var6, true, var2);
      }

      var2.write(34);
   }

   public static final boolean d(did var0, int var1, dia var2, dhr var3, OutputStreamWriter var4, dio var5, int var6, int var7) {
      Iterator var9 = var0.h();
      boolean var8 = true;

      while(var9.hasNext()) {
         did var10 = (did)var9.next();
         if (i(var10)) {
            h(var4, var5);
            g(var1, var4, var5);
            var4.write(var10.a);
            var4.write("=\"");
            k(var10.b, true, var4);
            var4.write(34);
         } else {
            var8 = false;
         }
      }

      return var8;
   }

   public static final void e(did var0, Set var1, dia var2, dhr var3, OutputStreamWriter var4, dio var5, int var6, int var7) {
      Iterator var10;
      if (var0.g().n()) {
         String var8 = var0.b;
         j(var8.substring(0, var8.length() - 1), var0.a, var1, var2, var3, var4, var5, var6, var7);
      } else if (var0.g().o()) {
         var10 = var0.h();

         while(var10.hasNext()) {
            j(((did)var10.next()).a, (String)null, var1, var2, var3, var4, var5, var6, var7);
         }
      }

      var10 = var0.h();

      while(var10.hasNext()) {
         e((did)var10.next(), var1, var2, var3, var4, var5, var6, var7);
      }

      Iterator var9 = var0.i();

      while(var9.hasNext()) {
         did var11 = (did)var9.next();
         j(var11.a, (String)null, var1, var2, var3, var4, var5, var6, var7);
         e(var11, var1, var2, var3, var4, var5, var6, var7);
      }

   }

   public static final void f(int var0, OutputStreamWriter var1) {
      while(var0 > 0) {
         var1.write(32);
         --var0;
      }

   }

   public static final void g(int var0, OutputStreamWriter var1, dio var2) {
      while(var0 > 0) {
         var1.write(var2.d);
         --var0;
      }

   }

   public static final void h(OutputStreamWriter var0, dio var1) {
      var0.write(var1.c);
   }

   private static final boolean i(did var0) {
      return !var0.t() && !var0.g().p() && !var0.g().l() && !"[]".equals(var0.a);
   }

   private static final void j(String var0, String var1, Set var2, dia var3, dhr var4, OutputStreamWriter var5, dio var6, int var7, int var8) {
      if (var1 == null) {
         int var9 = var0.indexOf(58);
         if (var9 >= 0) {
            var1 = var0.substring(0, var9);
            var0.substring(var9 + 1);
            var0 = var1;
         } else {
            var0 = "";
         }

         if (var0 == null || var0.length() <= 0) {
            return;
         }

         var1 = var0.concat(":");
         var1 = dho.a.b(var1);
         j(var0, var1, var2, var3, var4, var5, var6, var7, var8);
      }

      if (!var2.contains(var0)) {
         h(var5, var6);
         g(4, var5, var6);
         var5.write("xmlns:");
         var5.write(var0);
         var5.write("=\"");
         var5.write(var1);
         var5.write(34);
         var2.add(var0);
      }

   }

   private static final void k(String var0, boolean var1, OutputStreamWriter var2) {
      int var4 = dht.a;
      byte var5 = 0;
      var4 = 0;

      String var8;
      while(true) {
         var8 = var0;
         if (var4 >= var0.length()) {
            break;
         }

         char var6 = var0.charAt(var4);
         boolean var7 = var1;
         if (var6 != '<') {
            var7 = var1;
            if (var6 != '>') {
               var7 = var1;
               if (var6 != '&') {
                  var7 = var1;
                  if (var6 != '\t') {
                     var7 = var1;
                     if (var6 != '\n') {
                        var7 = var1;
                        if (var6 != '\r') {
                           if (!var1 || var6 != '"') {
                              ++var4;
                              continue;
                           }

                           var7 = true;
                        }
                     }
                  }
               }
            }
         }

         StringBuffer var9 = new StringBuffer(var0.length() * 4 / 3);

         for(var4 = var5; var4 < var0.length(); ++var4) {
            char var3 = var0.charAt(var4);
            if (var3 != '\t' && var3 != '\n' && var3 != '\r') {
               switch(var3) {
               case '"':
                  if (!var7) {
                     var8 = "\"";
                  } else {
                     var8 = "&quot;";
                  }

                  var9.append(var8);
                  break;
               case '&':
                  var9.append("&amp;");
                  break;
               case '<':
                  var9.append("&lt;");
                  break;
               case '>':
                  var9.append("&gt;");
                  break;
               default:
                  var9.append(var3);
               }
            } else {
               var9.append("&#x");
               var9.append(Integer.toHexString(var3).toUpperCase());
               var9.append(';');
            }
         }

         var8 = var9.toString();
         break;
      }

      var2.write(var8);
   }

   private static final void l(did var0, boolean var1, int var2, OutputStreamWriter var3, dio var4) {
      if (var1 || var0.s()) {
         g(var2, var3, var4);
         String var5;
         if (!var1) {
            var5 = "</rdf:";
         } else {
            var5 = "<rdf:";
         }

         var3.write(var5);
         if (var0.g().j()) {
            var3.write("Alt");
         } else if (var0.g().k()) {
            var3.write("Seq");
         } else {
            var3.write("Bag");
         }

         if (var1 && !var0.s()) {
            var3.write("/>");
         } else {
            var3.write(">");
         }

         h(var3, var4);
      }
   }
}
