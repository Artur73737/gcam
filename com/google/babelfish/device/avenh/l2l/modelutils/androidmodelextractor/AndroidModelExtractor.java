package com.google.babelfish.device.avenh.l2l.modelutils.androidmodelextractor;

import android.content.res.AssetManager;
import com.google.common.io.ByteStreams;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public final class AndroidModelExtractor {
   static {
      System.loadLibrary("native_utils_android");
   }

   public static void a(AssetManager var0, String var1, File var2) {
      String[] var5 = var0.list(var1);
      if (var5.length == 0) {
         var2 = new File(var2, var1);
         InputStream var65 = var0.open(var1);

         label568: {
            Throwable var67;
            Throwable var10000;
            label569: {
               FileOutputStream var66;
               boolean var10001;
               try {
                  var66 = new FileOutputStream(var2);
               } catch (Throwable var64) {
                  var10000 = var64;
                  var10001 = false;
                  break label569;
               }

               try {
                  ByteStreams.copy((InputStream)var65, (OutputStream)var66);
               } catch (Throwable var63) {
                  Throwable var68 = var63;

                  try {
                     var66.close();
                  } catch (Throwable var61) {
                     var67 = var61;

                     label541:
                     try {
                        .c.C(var68, var67);
                        break label541;
                     } catch (Throwable var60) {
                        var10000 = var60;
                        var10001 = false;
                        break label569;
                     }
                  }

                  try {
                     throw var68;
                  } catch (Throwable var59) {
                     var10000 = var59;
                     var10001 = false;
                     break label569;
                  }
               }

               label548:
               try {
                  var66.close();
                  break label568;
               } catch (Throwable var62) {
                  var10000 = var62;
                  var10001 = false;
                  break label548;
               }
            }

            var67 = var10000;
            if (var65 != null) {
               try {
                  var65.close();
               } catch (Throwable var58) {
                  .c.C(var67, var58);
                  throw var67;
               }
            }

            throw var67;
         }

         if (var65 != null) {
            var65.close();
         }

      } else {
         File var6 = new File(var2, var1);
         boolean var4 = var6.exists();
         int var3 = 0;
         if (!var4) {
            var6.mkdir();
         }

         while(var3 < var5.length) {
            String var8 = File.separator;
            String var7 = var5[var3];
            StringBuilder var69 = new StringBuilder();
            var69.append(var1);
            var69.append(var8);
            var69.append(var7);
            a(var0, var69.toString(), var2);
            ++var3;
         }

      }
   }
}
