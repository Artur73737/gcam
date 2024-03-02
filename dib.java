import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public final class dib {
   private static final Object a = new Object();
   private static final DocumentBuilderFactory b;

   static {
      DocumentBuilderFactory var1 = DocumentBuilderFactory.newInstance();
      var1.setNamespaceAware(true);
      var1.setIgnoringComments(true);

      try {
         var1.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
      } catch (Exception var2) {
      }

      b = var1;
   }

   public static dhm a(Object var0) {
      car.q(var0);
      dim var11 = new dim();
      String var8;
      Document var32;
      if (var0 instanceof InputStream) {
         InputStream var33 = (InputStream)var0;
         if (!var11.b() && !var11.c()) {
            var32 = b(new InputSource(var33));
         } else {
            try {
               dhq var42 = new dhq(var33);
               var32 = c(var42, var11);
            } catch (IOException var17) {
               throw new dhl("Error reading the XML-file", 204, var17);
            }
         }
      } else if (var0 instanceof byte[]) {
         var32 = c(new dhq((byte[])var0), var11);
      } else {
         var8 = (String)var0;
         InputSource var31 = new InputSource(new StringReader(var8));

         try {
            var32 = b(var31);
         } catch (dhl var30) {
            if (var30.a != 201 || !var11.c()) {
               throw var30;
            }

            var32 = b(new InputSource(new dhs(new StringReader(var8))));
         }
      }

      Object[] var10 = d(var32, var11.h(1), new Object[3]);
      if (var10 != null && var10[1] == a) {
         Node var35 = (Node)var10[0];
         dia var9 = new dia();
         if (!var35.hasAttributes()) {
            throw new dhl("Invalid attributes of rdf:RDF element", 202);
         } else {
            did var12 = var9.a;

            int var1;
            for(var1 = 0; var1 < var35.getChildNodes().getLength(); ++var1) {
               Node var43 = var35.getChildNodes().item(var1);
               if (!car.o(var43)) {
                  car.n(var9, var12, var43, true);
               }
            }

            String var36 = (String)var10[2];
            if (var11.h(32)) {
               return var9;
            } else {
               Map var37 = die.a;
               did var46 = var9.a;
               car.h(var46, "http://purl.org/dc/elements/1.1/", true);
               Iterator var51 = var9.a.h();

               while(true) {
                  int var2;
                  did var13;
                  did var38;
                  did var44;
                  did var53;
                  while(var51.hasNext()) {
                     var13 = (did)var51.next();
                     if ("http://purl.org/dc/elements/1.1/".equals(var13.a)) {
                        for(var1 = 1; var1 <= var13.a(); ++var1) {
                           var44 = var13.e(var1);
                           din var54 = (din)die.a.get(var44.a);
                           if (var54 != null) {
                              if ((var44.g().a & 768) == 0) {
                                 var38 = new did(var44.a, var54);
                                 var44.a = "[]";
                                 var38.k(var44);
                                 var38.c = var13;
                                 var13.j().set(var1 - 1, var38);
                                 if (var54.i() && !var44.g().c()) {
                                    var44.m(new did("xml:lang", "x-default", (din)null));
                                 }
                              } else {
                                 var44.g().f(7680, false);
                                 var44.g().b(var54);
                                 if (var54.i()) {
                                    die.b(var44);
                                 }
                              }
                           }
                        }
                     } else {
                        boolean var10001;
                        if ("http://ns.adobe.com/exif/1.0/".equals(var13.a)) {
                           var53 = car.f(var13, "exif:GPSTimeStamp", false);
                           if (var53 != null) {
                              label406: {
                                 dhu var55;
                                 try {
                                    var55 = dgh.b(var53.b);
                                    if (var55.a != 0 || var55.b != 0 || var55.c != 0) {
                                       break label406;
                                    }

                                    var44 = car.f(var13, "exif:DateTimeOriginal", false);
                                 } catch (dhl var20) {
                                    var10001 = false;
                                    break label406;
                                 }

                                 var38 = var44;
                                 if (var44 == null) {
                                    try {
                                       var38 = car.f(var13, "exif:DateTimeDigitized", false);
                                    } catch (dhl var19) {
                                       var10001 = false;
                                       break label406;
                                    }
                                 }

                                 dhu var40;
                                 Calendar var45;
                                 try {
                                    var40 = dgh.b(var38.b);
                                    var45 = var55.a();
                                    var45.set(1, var40.a);
                                    var1 = var40.b;
                                 } catch (dhl var18) {
                                    var10001 = false;
                                    break label406;
                                 }

                                 try {
                                    var45.set(2, var1);
                                    var45.set(5, var40.c);
                                    var40 = new dhu(var45);
                                    var53.b = dgi.b(var40);
                                 } catch (dhl var16) {
                                 }
                              }
                           }

                           var38 = car.f(var13, "exif:UserComment", false);
                           if (var38 != null) {
                              die.b(var38);
                           }
                        } else if ("http://ns.adobe.com/xmp/1.0/DynamicMedia/".equals(var13.a)) {
                           var38 = car.f(var13, "xmpDM:copyright", false);
                           if (var38 != null) {
                              try {
                                 var13 = car.h(var9.a, "http://purl.org/dc/elements/1.1/", true);
                                 var8 = var38.b;
                                 var13 = car.f(var13, "dc:rights", false);
                              } catch (dhl var29) {
                                 var10001 = false;
                                 continue;
                              }

                              label390: {
                                 label329: {
                                    if (var13 != null) {
                                       try {
                                          if (var13.s()) {
                                             break label329;
                                          }
                                       } catch (dhl var28) {
                                          var10001 = false;
                                          continue;
                                       }
                                    }

                                    try {
                                       StringBuilder var52 = new StringBuilder();
                                       var52.append("\n\n");
                                       var52.append(var8);
                                       var9.j(var52.toString());
                                       break label390;
                                    } catch (dhl var22) {
                                       var10001 = false;
                                       continue;
                                    }
                                 }

                                 try {
                                    var2 = car.e(var13, "x-default");
                                 } catch (dhl var25) {
                                    var10001 = false;
                                    continue;
                                 }

                                 var1 = var2;
                                 if (var2 < 0) {
                                    try {
                                       var9.j(var13.e(1).b);
                                       var1 = car.e(var13, "x-default");
                                    } catch (dhl var24) {
                                       var10001 = false;
                                       continue;
                                    }
                                 }

                                 String var15;
                                 try {
                                    var13 = var13.e(var1);
                                    var15 = var13.b;
                                    var1 = var15.indexOf("\n\n");
                                 } catch (dhl var23) {
                                    var10001 = false;
                                    continue;
                                 }

                                 StringBuilder var14;
                                 if (var1 < 0) {
                                    try {
                                       if (!var8.equals(var15)) {
                                          var14 = new StringBuilder();
                                          var14.append(var15);
                                          var14.append("\n\n");
                                          var14.append(var8);
                                          var13.b = var14.toString();
                                       }
                                    } catch (dhl var27) {
                                       var10001 = false;
                                       continue;
                                    }
                                 } else {
                                    var1 += 2;

                                    try {
                                       if (!var15.substring(var1).equals(var8)) {
                                          var15 = var15.substring(0, var1);
                                          var14 = new StringBuilder();
                                          var14.append(var15);
                                          var14.append(var8);
                                          var13.b = var14.toString();
                                       }
                                    } catch (dhl var26) {
                                       var10001 = false;
                                       continue;
                                    }
                                 }
                              }

                              try {
                                 var38.c.o(var38);
                              } catch (dhl var21) {
                                 var10001 = false;
                              }
                           }
                        } else if ("http://ns.adobe.com/xap/1.0/rights/".equals(var13.a)) {
                           var38 = car.f(var13, "xmpRights:UsageTerms", false);
                           if (var38 != null) {
                              die.b(var38);
                           }
                        }
                     }
                  }

                  if (var46.g) {
                     var46.g = false;
                     boolean var7 = var11.h(4);
                     Iterator var47 = Collections.unmodifiableList(new ArrayList(var46.j())).iterator();

                     label267:
                     while(true) {
                        did var50;
                        do {
                           if (!var47.hasNext()) {
                              break label267;
                           }

                           var50 = (did)var47.next();
                        } while(!var50.g);

                        var51 = var50.h();

                        while(var51.hasNext()) {
                           var13 = (did)var51.next();
                           if (var13.h) {
                              var13.h = false;
                              dif var57 = dho.a.e(var13.a);
                              if (var57 != null) {
                                 var38 = car.i(var46, var57.a, (String)null, true);
                                 var38.f = false;
                                 var53 = car.f(var38, var57.b.concat(var57.c), false);
                                 if (var53 == null) {
                                    dij var56 = var57.d;
                                    if (var56.d()) {
                                       var13.a = var57.b.concat(var57.c);
                                       var38.k(var13);
                                       var51.remove();
                                    } else {
                                       var53 = new did(var57.b.concat(var57.c), var56.b());
                                       var38.k(var53);
                                       die.c(var51, var13, var53);
                                    }
                                 } else {
                                    dij var41 = var57.d;
                                    if (var41.d()) {
                                       if (var7) {
                                          die.a(var13, var53, true);
                                       }

                                       var51.remove();
                                    } else {
                                       if (var41.c()) {
                                          var1 = car.e(var53, "x-default");
                                          if (var1 != -1) {
                                             var38 = var53.e(var1);
                                          } else {
                                             var38 = null;
                                          }
                                       } else if (var53.s()) {
                                          var38 = var53.e(1);
                                       } else {
                                          var38 = null;
                                       }

                                       if (var38 == null) {
                                          die.c(var51, var13, var53);
                                       } else {
                                          if (var7) {
                                             die.a(var13, var38, true);
                                          }

                                          var51.remove();
                                       }
                                    }
                                 }
                              }
                           }
                        }

                        var50.g = false;
                     }
                  }

                  var36 = var46.a;
                  if (var36 != null && var36.length() >= 36) {
                     var8 = var36.toLowerCase();
                     var36 = var8;
                     if (var8.startsWith("uuid:")) {
                        var36 = var8.substring(5);
                     }

                     var1 = dht.a;
                     if (var36 != null) {
                        var1 = 0;
                        boolean var4 = true;

                        int var3;
                        int var6;
                        for(var3 = 0; var1 < var36.length(); var3 = var6) {
                           int var5 = var1;
                           boolean var34 = var4;
                           var6 = var3;
                           if (var36.charAt(var1) == '-') {
                              label395: {
                                 label242: {
                                    var6 = var3 + 1;
                                    if (var4) {
                                       var2 = var1;
                                       if (var1 == 8) {
                                          break label242;
                                       }

                                       var2 = var1;
                                       if (var1 == 13) {
                                          break label242;
                                       }

                                       var2 = var1;
                                       if (var1 == 18) {
                                          break label242;
                                       }

                                       if (var1 == 23) {
                                          var2 = 23;
                                          break label242;
                                       }
                                    }

                                    var34 = false;
                                    var5 = var1;
                                    break label395;
                                 }

                                 boolean var39 = true;
                                 var5 = var2;
                                 var34 = var39;
                              }
                           }

                           var1 = var5 + 1;
                           var4 = var34;
                        }

                        if (var4 && var3 == 4 && var1 == 36) {
                           var44 = car.g(var46, cav.j("http://ns.adobe.com/xap/1.0/mm/", "InstanceID"), true, (din)null);
                           if (var44 == null) {
                              throw new dhl("Failure creating xmpMM:InstanceID", 9);
                           }

                           var44.e = null;
                           var44.b = "uuid:".concat(var36);
                           var44.p();
                           din var48 = var44.g();
                           var48.v(false);
                           var48.u(false);
                           var48.w(false);
                           var44.d = null;
                           var46.a = null;
                        }
                     }
                  }

                  Iterator var49 = var46.h();

                  while(var49.hasNext()) {
                     if (!((did)var49.next()).s()) {
                        var49.remove();
                     }
                  }

                  return var9;
               }
            }
         }
      } else {
         return new dia();
      }
   }

   private static Document b(InputSource var0) {
      try {
         DocumentBuilder var1 = b.newDocumentBuilder();
         var1.setErrorHandler((ErrorHandler)null);
         Document var5 = var1.parse(var0);
         return var5;
      } catch (SAXException var2) {
         throw new dhl("XML parsing failure", 201, var2);
      } catch (ParserConfigurationException var3) {
         throw new dhl("XML Parser not correctly configured", 0, var3);
      } catch (IOException var4) {
         throw new dhl("Error reading the XML-file", 204, var4);
      }
   }

   private static Document c(dhq var0, dim var1) {
      InputSource var10 = new InputSource(var0.a());

      try {
         Document var22 = b(var10);
         return var22;
      } catch (dhl var15) {
         int var3 = var15.a;
         if (var3 != 201 && var3 != 204) {
            throw var15;
         } else {
            dhq var21 = var0;
            if (var1.b()) {
               var21 = var0;
               if ("UTF-8".equals(var0.b())) {
                  byte[] var13 = new byte[8];
                  var21 = new dhq(var0.a * 4 / 3);
                  byte var7 = 0;
                  int var5 = 0;
                  byte var4 = 0;
                  int var6 = 0;
                  var3 = 0;

                  while(true) {
                     label95: {
                        int var8 = var0.a;
                        int var20;
                        if (var5 >= var8) {
                           if (var4 == 11) {
                              for(var20 = var7; var20 < var3; ++var20) {
                                 var21.c(car.t(var13[var20]));
                              }
                           }
                           break;
                        }

                        if (var5 >= var8) {
                           throw new IndexOutOfBoundsException("The index exceeds the valid buffer area");
                        }

                        var8 = ((byte[])var0.b)[var5] & 255;
                        switch(var4) {
                        case 11:
                           if (var6 > 0 && (var8 & 192) == 128) {
                              int var9 = var3 + 1;
                              var13[var3] = (byte)var8;
                              --var6;
                              if (var6 == 0) {
                                 var21.e(var13, var9);
                                 var4 = 0;
                                 var3 = 0;
                              } else {
                                 var3 = var9;
                              }
                              break label95;
                           }

                           var21.c(car.t(var13[0]));
                           var5 -= var3;
                           var4 = 0;
                           var3 = 0;
                           break label95;
                        default:
                           if (var8 < 127) {
                              byte var2 = (byte)var8;
                              var21.d(var21.a + 1);
                              Object var12 = var21.b;
                              var8 = var21.a++;
                              ((byte[])var12)[var8] = var2;
                              break label95;
                           }

                           if (var8 < 192) {
                              var21.c(car.t((byte)var8));
                              break label95;
                           }

                           var20 = var8;
                           var6 = -1;
                        }

                        while(var6 < 8 && (var20 & 128) == 128) {
                           ++var6;
                           var20 += var20;
                        }

                        var13[var3] = (byte)var8;
                        ++var3;
                        var4 = 11;
                     }

                     ++var5;
                  }
               }
            }

            if (var1.c()) {
               try {
                  String var23 = var21.b();
                  InputStreamReader var18 = new InputStreamReader(var21.a(), var23);
                  dhs var16 = new dhs(var18);
                  InputSource var19 = new InputSource(var16);
                  Document var17 = b(var19);
                  return var17;
               } catch (UnsupportedEncodingException var14) {
                  throw new dhl("Unsupported Encoding", 9, var15);
               }
            } else {
               return b(new InputSource(var21.a()));
            }
         }
      }
   }

   private static Object[] d(Node var0, boolean var1, Object[] var2) {
      NodeList var7 = var0.getChildNodes();

      for(int var3 = 0; var3 < var7.getLength(); ++var3) {
         Node var4 = var7.item(var3);
         if (var4.getNodeType() == 7) {
            ProcessingInstruction var5 = (ProcessingInstruction)var4;
            if (var5.getTarget() == "xpacket") {
               var2[2] = var5.getData();
               continue;
            }
         }

         if (var4.getNodeType() != 3 && var4.getNodeType() != 7) {
            String var9 = var4.getNamespaceURI();
            String var6 = var4.getLocalName();
            if (("xmpmeta".equals(var6) || "xapmeta".equals(var6)) && "adobe:ns:meta/".equals(var9)) {
               return d(var4, false, var2);
            }

            if (!var1 && "RDF".equals(var6) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(var9)) {
               var2[0] = var4;
               var2[1] = a;
               return var2;
            }

            Object[] var8 = d(var4, var1, var2);
            if (var8 != null) {
               return var8;
            }
         }
      }

      return null;
   }
}
