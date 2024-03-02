import java.text.ParseException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public final class w extends n {
   public static final w a = new w();
   private static final ResourceBundle d = new e();
   public Map b;
   public Map c;
   private final Map e = new HashMap();

   private w() {
   }

   public final v a(String var1) {
      Map var6 = this.e;
      synchronized(var6){}

      boolean var4;
      v var5;
      t var7;
      Throwable var10000;
      boolean var10001;
      Throwable var352;
      label2415: {
         label2416: {
            try {
               var4 = this.e.containsKey(var1);
            } catch (Throwable var351) {
               var10000 = var351;
               var10001 = false;
               break label2416;
            }

            var7 = null;
            if (var4) {
               try {
                  var5 = (v)this.e.get(var1);
               } catch (Throwable var350) {
                  var10000 = var350;
                  var10001 = false;
                  break label2416;
               }
            } else {
               var5 = null;
            }

            label2402:
            try {
               break label2415;
            } catch (Throwable var349) {
               var10000 = var349;
               var10001 = false;
               break label2402;
            }
         }

         while(true) {
            var352 = var10000;

            try {
               throw var352;
            } catch (Throwable var315) {
               var10000 = var315;
               var10001 = false;
               continue;
            }
         }
      }

      v var354 = var5;
      if (!var4) {
         label2418: {
            int var3;
            Object[][] var355;
            try {
               var355 = (Object[][])d.getObject("rules");
               var3 = var355.length;
            } catch (ParseException var341) {
               var10001 = false;
               break label2418;
            } catch (MissingResourceException var342) {
               var10001 = false;
               break label2418;
            }

            int var2 = 0;

            Object[] var8;
            while(true) {
               if (var2 >= var3) {
                  var355 = null;
                  break;
               }

               var8 = var355[var2];

               try {
                  if (var1.equals(var8[0])) {
                     var355 = (Object[][])var8[1];
                     break;
                  }
               } catch (ParseException var347) {
                  var10001 = false;
                  break label2418;
               } catch (MissingResourceException var348) {
                  var10001 = false;
                  break label2418;
               }

               ++var2;
            }

            StringBuilder var9;
            try {
               var9 = new StringBuilder();
               var3 = var355.length;
            } catch (ParseException var339) {
               var10001 = false;
               break label2418;
            } catch (MissingResourceException var340) {
               var10001 = false;
               break label2418;
            }

            for(var2 = 0; var2 < var3; ++var2) {
               var8 = var355[var2];

               try {
                  if (var9.length() > 0) {
                     var9.append("; ");
                  }
               } catch (ParseException var345) {
                  var10001 = false;
                  break label2418;
               } catch (MissingResourceException var346) {
                  var10001 = false;
                  break label2418;
               }

               try {
                  var9.append((String)var8[0]);
                  var9.append(": ");
                  var9.append((String)var8[1]);
               } catch (ParseException var337) {
                  var10001 = false;
                  break label2418;
               } catch (MissingResourceException var338) {
                  var10001 = false;
                  break label2418;
               }
            }

            String var356;
            label2367: {
               try {
                  var356 = var9.toString();
                  var354 = v.a;
                  var356 = var356.trim();
                  if (var356.length() != 0) {
                     break label2367;
                  }

                  var354 = v.a;
               } catch (ParseException var343) {
                  var10001 = false;
                  break label2418;
               } catch (MissingResourceException var344) {
                  var10001 = false;
                  break label2418;
               }

               var5 = var354;
               break label2418;
            }

            u var358;
            try {
               var358 = new u();
            } catch (ParseException var335) {
               var10001 = false;
               break label2418;
            } catch (MissingResourceException var336) {
               var10001 = false;
               break label2418;
            }

            String var357 = var356;

            try {
               if (var356.endsWith(";")) {
                  var357 = var356.substring(0, var356.length() - 1);
               }
            } catch (ParseException var333) {
               var10001 = false;
               break label2418;
            } catch (MissingResourceException var334) {
               var10001 = false;
               break label2418;
            }

            String[] var360;
            try {
               var360 = v.g.split(var357);
            } catch (ParseException var331) {
               var10001 = false;
               break label2418;
            } catch (MissingResourceException var332) {
               var10001 = false;
               break label2418;
            }

            var3 = 0;

            while(true) {
               boolean var353;
               t var359;
               label2340: {
                  label2339: {
                     label2338: {
                        try {
                           if (var3 >= var360.length) {
                              break;
                           }

                           var359 = v.a(var360[var3].trim());
                           var4 = var358.a;
                           if (var359.c == null) {
                              if (var359.d != null) {
                                 break label2339;
                              }
                              break label2338;
                           }
                        } catch (ParseException var329) {
                           var10001 = false;
                           break label2418;
                        } catch (MissingResourceException var330) {
                           var10001 = false;
                           break label2418;
                        }

                        var353 = true;
                        break label2340;
                     }

                     var353 = false;
                     break label2340;
                  }

                  var353 = true;
               }

               try {
                  var358.a = var4 | var353;
                  var358.a(var359);
               } catch (ParseException var327) {
                  var10001 = false;
                  break label2418;
               } catch (MissingResourceException var328) {
                  var10001 = false;
                  break label2418;
               }

               ++var3;
            }

            Iterator var361;
            try {
               var361 = var358.b.iterator();
            } catch (ParseException var325) {
               var10001 = false;
               break label2418;
            } catch (MissingResourceException var326) {
               var10001 = false;
               break label2418;
            }

            t var362 = var7;

            while(true) {
               try {
                  if (!var361.hasNext()) {
                     break;
                  }

                  var7 = (t)var361.next();
                  if (!"other".equals(var7.a)) {
                     continue;
                  }

                  var361.remove();
               } catch (ParseException var323) {
                  var10001 = false;
                  break label2418;
               } catch (MissingResourceException var324) {
                  var10001 = false;
                  break label2418;
               }

               var362 = var7;
            }

            var7 = var362;
            if (var362 == null) {
               try {
                  var7 = v.a("other:");
               } catch (ParseException var321) {
                  var10001 = false;
                  break label2418;
               } catch (MissingResourceException var322) {
                  var10001 = false;
                  break label2418;
               }
            }

            try {
               var358.b.add(var7);
               var354 = new v(var358);
            } catch (ParseException var319) {
               var10001 = false;
               break label2418;
            } catch (MissingResourceException var320) {
               var10001 = false;
               break label2418;
            }

            var5 = var354;
         }

         var6 = this.e;
         synchronized(var6){}

         label2424: {
            label2425: {
               label2292: {
                  try {
                     if (this.e.containsKey(var1)) {
                        var5 = (v)this.e.get(var1);
                        break label2292;
                     }
                  } catch (Throwable var318) {
                     var10000 = var318;
                     var10001 = false;
                     break label2425;
                  }

                  try {
                     this.e.put(var1, var5);
                  } catch (Throwable var317) {
                     var10000 = var317;
                     var10001 = false;
                     break label2425;
                  }
               }

               label2283:
               try {
                  break label2424;
               } catch (Throwable var316) {
                  var10000 = var316;
                  var10001 = false;
                  break label2283;
               }
            }

            while(true) {
               var352 = var10000;

               try {
                  throw var352;
               } catch (Throwable var314) {
                  var10000 = var314;
                  var10001 = false;
                  continue;
               }
            }
         }

         var354 = var5;
      }

      return var354;
   }

   public final void b() {
      // $FF: Couldn't be decompiled
   }
}
