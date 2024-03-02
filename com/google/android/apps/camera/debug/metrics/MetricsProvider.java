package com.google.android.apps.camera.debug.metrics;

import android.content.Context;
import android.util.PrintWriterPrinter;
import com.google.android.libraries.lens.lenslite.dynamicloading.LjhL.xKbMW;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MetricsProvider extends .mih {
   public .mnb a;

   public final void a(PrintWriter var1) {
      if (this.a == null) {
         Context var9 = this.getContext();
         var9.getClass();
         ((.fpo)((.gsr)var9.getApplicationContext()).e(.fpo.class)).g(this);
      }

      long var7 = System.nanoTime();
      PrintWriterPrinter var69 = new PrintWriterPrinter(var1);
      .mnb var61 = this.a;
      .onk.p(var61);
      Object var10 = var61.a;
      Object var62 = ((.mus)var10).a;
      synchronized(var62){}

      String var13;
      .mnb var71;
      label1052: {
         Throwable var10000;
         boolean var10001;
         label1053: {
            Iterator var73;
            try {
               Object var11 = ((.mus)var10).b.a;
               var71 = new .mnb((byte[])null, (byte[])null, (byte[])null);
               var73 = ((Map)((.mnb)var11).a).entrySet().iterator();
            } catch (Throwable var58) {
               var10000 = var58;
               var10001 = false;
               break label1053;
            }

            while(true) {
               Object var12;
               Iterator var17;
               .nom var82;
               try {
                  if (!var73.hasNext()) {
                     break;
                  }

                  Entry var14 = (Entry)var73.next();
                  var12 = var71.a;
                  var13 = (String)var14.getKey();
                  .nom var15 = (.nom)var14.getValue();
                  var82 = new .nom((.mzw)var15.a);
                  var17 = ((TreeMap)var15.b).entrySet().iterator();
               } catch (Throwable var60) {
                  var10000 = var60;
                  var10001 = false;
                  break label1053;
               }

               while(true) {
                  try {
                     if (!var17.hasNext()) {
                        break;
                     }

                     Entry var18 = (Entry)var17.next();
                     Object var85 = var82.b;
                     .mug var16 = (.mug)var18.getKey();
                     .muv var88 = ((.muv)var18.getValue()).a();
                     ((TreeMap)var85).put(var16, var88);
                  } catch (Throwable var59) {
                     var10000 = var59;
                     var10001 = false;
                     break label1053;
                  }
               }

               try {
                  ((Map)var12).put(var13, var82);
               } catch (Throwable var57) {
                  var10000 = var57;
                  var10001 = false;
                  break label1053;
               }
            }

            label1025:
            try {
               break label1052;
            } catch (Throwable var56) {
               var10000 = var56;
               var10001 = false;
               break label1025;
            }
         }

         while(true) {
            Throwable var70 = var10000;

            try {
               throw var70;
            } catch (Throwable var55) {
               var10000 = var55;
               var10001 = false;
               continue;
            }
         }
      }

      String var64;
      for(Iterator var72 = ((Map)var71.a).values().iterator(); var72.hasNext(); var69.println(var64)) {
         .nom var63 = (.nom)var72.next();
         if (var63 == null) {
            var64 = xKbMW.zVEXtGaVvGfZiij;
         } else {
            int var4;
            Iterator var81;
            if (var63.i().length == 0) {
               String var75 = var63.h();
               Object[] var78 = .mug.a.b;
               var81 = ((TreeMap)var63.b).entrySet().iterator();

               .muv var65;
               label986:
               while(true) {
                  if (var81.hasNext()) {
                     Entry var66 = (Entry)var81.next();

                     for(var4 = 0; var4 < var78.length; ++var4) {
                        if (var78[var4] != null && ((.mug)var66.getKey()).b[var4] != var78[var4]) {
                           continue label986;
                        }
                     }

                     var65 = (.muv)var66.getValue();
                     break;
                  }

                  var65 = null;
                  break;
               }

               String var80 = .mzx.ay(var65);
               StringBuilder var67 = new StringBuilder();
               var67.append(var75);
               var67.append(": ");
               var67.append(var80);
               var64 = var67.toString();
            } else {
               .muf[] var79 = var63.i();
               Set var83 = ((Map)var63.b).entrySet();
               int var6 = var79.length;
               var4 = var6 + 1;
               int[] var76 = new int[var4];
               String[][] var74 = new String[var83.size() + 1][var4];

               for(var4 = 0; var4 < var6; ++var4) {
                  var74[0][var4] = var79[var4].a;
                  var76[var4] = var79[var4].a.length();
               }

               var74[0][var6] = "";
               var76[var6] = 1;
               var81 = var83.iterator();

               int var5;
               String var84;
               for(var4 = 1; var81.hasNext(); ++var4) {
                  Entry var87 = (Entry)var81.next();

                  for(var5 = 0; var5 < var6; ++var5) {
                     var84 = String.format(Locale.ROOT, "%s", ((.mug)var87.getKey()).b[var5]);
                     var76[var5] = Math.max(var76[var5], var84.length());
                     var74[var4][var5] = var84;
                  }

                  var84 = .mzx.ay((.muv)var87.getValue());
                  var76[var6] = Math.max(var76[var6], var84.length());
                  var74[var4][var6] = var84;
               }

               StringBuilder var86 = new StringBuilder();
               var86.append("  ");
               var4 = 0;

               while(true) {
                  var5 = var6 - 1;
                  if (var4 >= var5) {
                     var13 = var86.toString().concat("%s");
                     var86.append("%-");
                     var86.append(var76[var5]);
                     var86.append("s:%");
                     var86.append(var76[var6] + 1);
                     var86.append("s");
                     var84 = var86.toString();
                     StringBuilder var77 = new StringBuilder();
                     var77.append(var63.h());
                     var77.append("\n");
                     var77.append(String.format(Locale.ROOT, var13, var74[0]));

                     for(var4 = 1; var4 < var74.length; ++var4) {
                        var77.append("\n");
                        var77.append(String.format(Locale.ROOT, var84, var74[var4]));
                     }

                     var64 = var77.toString();
                     break;
                  }

                  var86.append("%-");
                  var86.append(var76[var4] + 1);
                  var86.append("s");
                  ++var4;
               }
            }
         }
      }

      double var2 = (double)(System.nanoTime() - var7);
      Locale var68 = Locale.ROOT;
      Double.isNaN(var2);
      var69.println(String.format(var68, "\n\nMetrics dumped in %.6f ms", var2 / 1000000.0D));
   }
}
