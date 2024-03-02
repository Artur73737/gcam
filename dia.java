import com.google.lullaby.modules.audio.nwj.OtvMV;
import java.util.GregorianCalendar;
import java.util.Iterator;

public final class dia implements dhm {
   public final did a;

   public dia() {
      this.a = new did((String)null, (String)null, (din)null);
   }

   public dia(did var1) {
      this.a = var1;
   }

   static final void n(did var0, Object var1, din var2) {
      var0.g().b(var2);
      if (var0.g().l()) {
         if (var1 != null && var1.toString().length() > 0) {
            throw new dhl("Composite nodes can't have values", 102);
         } else {
            var0.p();
         }
      } else {
         var2 = null;
         byte var5 = 0;
         int var3;
         String var10;
         if (var1 == null) {
            var10 = null;
         } else if (var1 instanceof Boolean) {
            if (!(Boolean)var1) {
               var10 = OtvMV.QWAxEw;
            } else {
               var10 = "True";
            }
         } else if (var1 instanceof Integer) {
            var10 = String.valueOf((Integer)var1);
         } else if (var1 instanceof Long) {
            var10 = String.valueOf((Long)var1);
         } else if (var1 instanceof Double) {
            var10 = String.valueOf((Double)var1);
         } else if (var1 instanceof dhu) {
            var10 = dgi.b((dhu)var1);
         } else if (var1 instanceof GregorianCalendar) {
            var10 = dgi.b(new dhu((GregorianCalendar)var1));
         } else if (var1 instanceof byte[]) {
            byte[] var8 = (byte[])var1;
            var3 = var8.length;
            byte[] var11 = dhp.a;
            var11 = new byte[(var3 + 2) / 3 * 4];
            int var4 = 0;
            var3 = 0;

            while(true) {
               int var6 = var8.length;
               if (var4 + 3 > var6) {
                  var6 -= var4;
                  if (var6 == 2) {
                     byte var14 = var8[var4];
                     var4 = (var8[var4 + 1] & 255) << 8 | (var14 & 255) << 16;
                     var6 = var3 + 1;
                     var8 = dhp.a;
                     var11[var3] = var8[var4 >> 18];
                     var3 = var6 + 1;
                     var11[var6] = var8[var4 >> 12 & 63];
                     var11[var3] = var8[(var4 & 4032) >> 6];
                     var11[var3 + 1] = 61;
                  } else if (var6 == 1) {
                     var4 = (var8[var4] & 255) << 16;
                     var6 = var3 + 1;
                     var8 = dhp.a;
                     var11[var3] = var8[var4 >> 18];
                     var3 = var6 + 1;
                     var11[var6] = var8[var4 >> 12 & 63];
                     var11[var3] = 61;
                     var11[var3 + 1] = 61;
                  }

                  var10 = new String(var11);
                  break;
               }

               var6 = var4 + 1;
               byte var7 = var8[var4];
               var4 = var6 + 1;
               var6 = (var7 & 255) << 16 | (var8[var6] & 255) << 8 | var8[var4] & 255;
               int var13 = var3 + 1;
               byte[] var9 = dhp.a;
               var11[var3] = var9[var6 >> 18];
               var3 = var13 + 1;
               var11[var13] = var9[var6 >> 12 & 63];
               var13 = var3 + 1;
               var11[var3] = var9[(var6 & 4032) >> 6];
               var3 = var13 + 1;
               var11[var13] = var9[var6 & 63];
               ++var4;
            }
         } else {
            var10 = var1.toString();
         }

         if (var10 != null) {
            StringBuffer var12 = new StringBuffer(var10);

            for(var3 = var5; var3 < var12.length(); ++var3) {
               if (dht.b(var12.charAt(var3))) {
                  var12.setCharAt(var3, ' ');
               }
            }

            var10 = var12.toString();
         } else {
            var10 = var2;
         }

         if (var0.g().m() && "xml:lang".equals(var0.a)) {
            var0.b = dht.a(var10);
         } else {
            var0.b = var10;
         }
      }
   }

   private static final Object o(int var0, did var1) {
      boolean var10001;
      dhl var20;
      label184: {
         label153: {
            label139: {
               String var8 = var1.b;
               Object var7;
               switch(var0) {
               case 1:
                  if (var8 == null || var8.length() == 0) {
                     throw new dhl("Empty convert-string", 5);
                  }

                  String var21 = var8.toLowerCase();
                  boolean var6 = false;

                  label84: {
                     try {
                        var0 = Integer.parseInt(var21);
                     } catch (NumberFormatException var9) {
                        if ("true".equals(var21) || "t".equals(var21) || "on".equals(var21) || "yes".equals(var21)) {
                           var6 = true;
                        }
                        break label84;
                     }

                     if (var0 != 0) {
                        var6 = true;
                     }
                  }

                  var7 = new Boolean(var6);
                  break;
               case 2:
                  if (var8 == null) {
                     break label139;
                  }

                  try {
                     if (var8.length() == 0) {
                        break label139;
                     }
                  } catch (NumberFormatException var17) {
                     var10001 = false;
                     throw new dhl("Invalid integer string", 5);
                  }

                  label135: {
                     try {
                        if (var8.startsWith("0x")) {
                           var0 = Integer.parseInt(var8.substring(2), 16);
                           break label135;
                        }
                     } catch (NumberFormatException var19) {
                        var10001 = false;
                        throw new dhl("Invalid integer string", 5);
                     }

                     try {
                        var0 = Integer.parseInt(var8);
                     } catch (NumberFormatException var15) {
                        var10001 = false;
                        throw new dhl("Invalid integer string", 5);
                     }
                  }

                  var7 = new Integer(var0);
                  break;
               case 3:
                  if (var8 == null) {
                     break label153;
                  }

                  try {
                     if (var8.length() == 0) {
                        break label153;
                     }
                  } catch (NumberFormatException var16) {
                     var10001 = false;
                     throw new dhl("Invalid long string", 5);
                  }

                  long var4;
                  label127: {
                     try {
                        if (var8.startsWith("0x")) {
                           var4 = Long.parseLong(var8.substring(2), 16);
                           break label127;
                        }
                     } catch (NumberFormatException var18) {
                        var10001 = false;
                        throw new dhl("Invalid long string", 5);
                     }

                     try {
                        var4 = Long.parseLong(var8);
                     } catch (NumberFormatException var13) {
                        var10001 = false;
                        throw new dhl("Invalid long string", 5);
                     }
                  }

                  var7 = new Long(var4);
                  break;
               case 4:
                  if (var8 == null) {
                     break label184;
                  }

                  double var2;
                  try {
                     if (var8.length() == 0) {
                        break label184;
                     }

                     var2 = Double.parseDouble(var8);
                  } catch (NumberFormatException var14) {
                     var10001 = false;
                     throw new dhl("Invalid double string", 5);
                  }

                  var7 = new Double(var2);
                  break;
               case 5:
                  var7 = dgh.b(var8);
                  break;
               case 6:
                  var7 = dgh.b(var8).a();
                  break;
               default:
                  var7 = var8;
                  if (var8 == null) {
                     if (var1.g().l()) {
                        var7 = var8;
                     } else {
                        var7 = "";
                     }
                  }
               }

               return var7;
            }

            try {
               var20 = new dhl("Empty convert-string", 5);
               throw var20;
            } catch (NumberFormatException var12) {
               var10001 = false;
               throw new dhl("Invalid integer string", 5);
            }
         }

         try {
            var20 = new dhl("Empty convert-string", 5);
            throw var20;
         } catch (NumberFormatException var11) {
            var10001 = false;
            throw new dhl("Invalid long string", 5);
         }
      }

      try {
         var20 = new dhl("Empty convert-string", 5);
         throw var20;
      } catch (NumberFormatException var10) {
         var10001 = false;
         throw new dhl("Invalid double string", 5);
      }
   }

   public final dip a(String var1, String var2) {
      car.s(var1);
      car.r(var2);
      dih var3 = cav.j(var1, var2);
      did var4 = car.g(this.a, var3, false, (din)null);
      return var4 != null ? new dhz(o(0, var4)) : null;
   }

   public final Integer b(String var1, String var2) {
      return (Integer)this.m(var1, var2, 2);
   }

   public final void c(String var1, String var2, Object var3) {
      this.d(var1, var2, var3, (din)null);
   }

   public final Object clone() {
      return new dia((did)this.a.clone());
   }

   public final void d(String var1, String var2, Object var3, din var4) {
      car.s(var1);
      car.r(var2);
      var4 = car.j(var4, var3);
      dih var5 = cav.j(var1, var2);
      did var6 = car.g(this.a, var5, true, var4);
      if (var6 != null) {
         n(var6, var3, var4);
      } else {
         throw new dhl("Specified property does not exist", 102);
      }
   }

   public final boolean e(String var1, String var2) {
      did var5;
      try {
         car.s(var1);
         car.r(var2);
         dih var4 = cav.j(var1, var2);
         var5 = car.g(this.a, var4, false, (din)null);
      } catch (dhl var3) {
         return false;
      }

      return var5 != null;
   }

   public final dhy f() {
      return new dhy(this);
   }

   public final void g(String var1, din var2, String var3, din var4) {
      car.s("http://ns.google.com/photos/1.0/camera/");
      car.p(var1);
      if ((var2.a & -7681) == 0) {
         var2 = car.j(var2, (Object)null);
         dih var6 = cav.j("http://ns.google.com/photos/1.0/camera/", var1);
         did var7 = car.g(this.a, var6, false, (din)null);
         if (var7 != null) {
            if (!var7.g().d()) {
               throw new dhl("The named property is not an array", 102);
            }
         } else {
            if (!var2.d()) {
               throw new dhl("Explicit arrayOptions required to create new array", 103);
            }

            var7 = car.g(this.a, var6, true, var2);
            if (var7 == null) {
               throw new dhl("Failure creating array node", 102);
            }
         }

         did var8 = new did("[]", (din)null);
         var4 = car.j(var4, var3);
         int var5 = var7.a() + 1;
         if (var5 > 0) {
            var7.l(var5, var8);
            n(var8, var3, var4);
         } else {
            throw new dhl("Array index out of bounds", 104);
         }
      } else {
         throw new dhl("Only array form flags allowed for arrayOptions", 103);
      }
   }

   public final int h() {
      car.s("http://ns.google.com/photos/1.0/container/");
      car.p("Directory");
      dih var1 = cav.j("http://ns.google.com/photos/1.0/container/", "Directory");
      did var2 = car.g(this.a, var1, false, (din)null);
      if (var2 == null) {
         return 0;
      } else if (var2.g().d()) {
         return var2.a();
      } else {
         throw new dhl("The named property is not an array", 102);
      }
   }

   public final void i() {
      // $FF: Couldn't be decompiled
   }

   public final void j(String var1) {
      car.s("http://purl.org/dc/elements/1.1/");
      car.p("rights");
      String var12 = dht.a("");
      String var11 = dht.a("x-default");
      dih var5 = cav.j("http://purl.org/dc/elements/1.1/", "rights");
      did var10 = car.g(this.a, var5, true, new din(7680));
      if (var10 == null) {
         dhl var14 = new dhl("Failed to find or create array node", 102);
         throw var14;
      } else {
         if (!var10.g().i()) {
            if (var10.s() || !var10.g().j()) {
               throw new dhl("Specified property is no alt-text array", 102);
            }

            var10.g().r();
         }

         Iterator var15 = var10.h();

         boolean var2;
         did var6;
         while(true) {
            if (var15.hasNext()) {
               var6 = (did)var15.next();
               if (var6.t() && "xml:lang".equals(var6.f(1).a)) {
                  if (!"x-default".equals(var6.f(1).b)) {
                     continue;
                  }

                  var2 = true;
                  break;
               }

               throw new dhl("Language qualifier must be first", 102);
            }

            var6 = null;
            var2 = false;
            break;
         }

         if (var6 != null && var10.a() > 1) {
            var10.o(var6);
            var10.l(1, var6);
         }

         if (!var10.g().i()) {
            throw new dhl("Localized text array is not alt-text", 102);
         } else {
            int var3;
            did var7;
            did var16;
            Object[] var17;
            if (!var10.s()) {
               var17 = new Object[]{new Integer(0), null};
            } else {
               Iterator var13 = var10.h();
               var16 = null;
               var7 = null;
               var3 = 0;

               while(true) {
                  if (!var13.hasNext()) {
                     Object[] var18;
                     if (var3 == 1) {
                        var18 = new Object[]{new Integer(2), var16};
                        var17 = var18;
                     } else if (var3 > 1) {
                        var18 = new Object[]{new Integer(3), var16};
                        var17 = var18;
                     } else if (var7 != null) {
                        var17 = new Object[]{new Integer(4), var7};
                     } else {
                        var17 = new Object[]{new Integer(5), var10.e(1)};
                     }
                     break;
                  }

                  did var8 = (did)var13.next();
                  if (var8.g().l()) {
                     throw new dhl("Alt-text array item is not simple", 102);
                  }

                  if (!var8.t() || !"xml:lang".equals(var8.f(1).a)) {
                     throw new dhl("Alt-text array item has no language qualifier", 102);
                  }

                  String var9 = var8.f(1).b;
                  if (var11.equals(var9)) {
                     var17 = new Object[]{new Integer(1), var8};
                     break;
                  }

                  if (var12 != null && var9.startsWith(var12)) {
                     did var21 = var16;
                     if (var16 == null) {
                        var21 = var8;
                     }

                     ++var3;
                     var16 = var21;
                  } else if ("x-default".equals(var9)) {
                     var7 = var8;
                  }
               }
            }

            var3 = (Integer)var17[0];
            var16 = (did)var17[1];
            boolean var4 = "x-default".equals(var11);
            switch(var3) {
            case 0:
               car.k(var10, "x-default", var1);
               if (!var4) {
                  car.k(var10, var11, var1);
                  return;
               }

               return;
            case 1:
               if (!var4) {
                  if (var2 && var6 != var16 && var6 != null && var6.b.equals(var16.b)) {
                     var6.b = var1;
                  }

                  var16.b = var1;
               } else {
                  Iterator var22 = var10.h();

                  while(var22.hasNext()) {
                     var7 = (did)var22.next();
                     if (var7 != var6) {
                        String var19 = var7.b;
                        String var20;
                        if (var6 != null) {
                           var20 = var6.b;
                        } else {
                           var20 = null;
                        }

                        if (var19.equals(var20)) {
                           var7.b = var1;
                        }
                     }
                  }

                  if (var6 != null) {
                     var6.b = var1;
                  }
               }
               break;
            case 2:
               if (var2 && var6 != var16 && var6 != null && var6.b.equals(var16.b)) {
                  var6.b = var1;
               }

               var16.b = var1;
               break;
            case 3:
               car.k(var10, var11, var1);
               if (var4) {
                  return;
               }
               break;
            case 4:
               if (var6 != null && var10.a() == 1) {
                  var6.b = var1;
               }

               car.k(var10, var11, var1);
               break;
            case 5:
               car.k(var10, var11, var1);
               if (var4) {
                  return;
               }
               break;
            default:
               throw new dhl("Unexpected result from ChooseLocalizedText", 9);
            }

            if (!var2 && var10.a() == 1) {
               car.k(var10, "x-default", var1);
            }
         }
      }
   }

   public final void k(String var1, boolean var2) {
      String var3;
      if (!var2) {
         var3 = "False";
      } else {
         var3 = "True";
      }

      this.d("http://ns.google.com/photos/1.0/panorama/", var1, var3, (din)null);
   }

   public final void l(String var1, int var2) {
      this.d("http://ns.google.com/photos/1.0/panorama/", var1, new Integer(var2), (din)null);
   }

   public final Object m(String var1, String var2, int var3) {
      car.s(var1);
      car.r(var2);
      dih var4 = cav.j(var1, var2);
      did var5 = car.g(this.a, var4, false, (din)null);
      if (var5 != null) {
         if (var3 != 0 && var5.g().l()) {
            throw new dhl("Property must be simple when a value type is requested", 102);
         } else {
            return o(var3, var5);
         }
      } else {
         return null;
      }
   }
}
