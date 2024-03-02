package com.google.android.libraries.microvideo;

import android.util.Log;
import com.google.common.io.ByteStreams;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class MicrovideoFiles {
   private static final byte[] MPEG4_FTYP_MARKER = new byte[]{102, 116, 121, 112};
   private static final String TAG = "MicrovideoFiles";

   private MicrovideoFiles() {
   }

   public static void extractVideo(File var0, File var1) {
      long var2 = getVideoOffset(var0);
      FileOutputStream var62 = new FileOutputStream(var1);

      label408: {
         Throwable var10000;
         Throwable var61;
         label409: {
            FileInputStream var4;
            boolean var10001;
            try {
               var4 = new FileInputStream(var0);
            } catch (Throwable var60) {
               var10000 = var60;
               var10001 = false;
               break label409;
            }

            try {
               ByteStreams.skipFully(var4, var2);
               ByteStreams.copy((InputStream)var4, (OutputStream)var62);
            } catch (Throwable var59) {
               var61 = var59;

               try {
                  var4.close();
               } catch (Throwable var57) {
                  Throwable var63 = var57;

                  label390:
                  try {
                     .c.C(var61, var63);
                     break label390;
                  } catch (Throwable var56) {
                     var10000 = var56;
                     var10001 = false;
                     break label409;
                  }
               }

               try {
                  throw var61;
               } catch (Throwable var55) {
                  var10000 = var55;
                  var10001 = false;
                  break label409;
               }
            }

            label397:
            try {
               var4.close();
               break label408;
            } catch (Throwable var58) {
               var10000 = var58;
               var10001 = false;
               break label397;
            }
         }

         var61 = var10000;

         try {
            var62.close();
         } catch (Throwable var54) {
            .c.C(var61, var54);
            throw var61;
         }

         throw var61;
      }

      var62.close();
   }

   public static .dhm extractXMPData(File var0) {
      String var1 = var0.getPath();
      Logger var3 = .nvg.a;

      .dhm var4;
      try {
         FileInputStream var5 = new FileInputStream(var1);
         var4 = .nvg.a(var5);
      } catch (FileNotFoundException var2) {
         var1 = String.valueOf(var1);
         .nvg.a.logp(Level.SEVERE, "com.google.android.libraries.social.xmp.XmpUtil", "extractXMPMeta", "Could not read file: ".concat(var1), var2);
         var4 = null;
      }

      return var4;
   }

   public static long getVideoOffset(File var0) {
      int var1 = .mzx.at(extractXMPData(var0));
      long var2 = (long)var1;
      var2 = var0.length() - var2;
      if (var2 > 0L && validateOffset(var0, var2)) {
         FileInputStream var4 = new FileInputStream(var0);

         try {
            var4.skip(-2L + var2);
         } catch (Throwable var10) {
            try {
               var4.close();
            } catch (Throwable var9) {
               .c.C(var10, var9);
               throw var10;
            }

            throw var10;
         }

         var4.close();
         return var2;
      } else {
         Log.w("MicrovideoFiles", String.format("MicroVideoOffset %d invalid. Attempting recovery", var1));
         var2 = scanForMpeg4FtypAtom(var0);
         if (var2 >= 0L) {
            return var2;
         } else {
            throw new IOException("Could not recover starting offset.");
         }
      }
   }

   public static boolean isMicrovideo(InputStream var0) {
      .dhm var3 = .nvg.a(var0);
      if (var3 == null) {
         return false;
      } else {
         int var1;
         try {
            var1 = .mzx.at(var3);
         } catch (.dhl var2) {
            return false;
         }

         return (long)var1 > 0L;
      }
   }

   public static InputStream openVideoStream(File var0) {
      long var1 = getVideoOffset(var0);
      FileInputStream var3 = new FileInputStream(var0);
      var3.skip(var1);
      return var3;
   }

   private static long scanForMpeg4FtypAtom(File var0) {
      FileInputStream var39 = new FileInputStream(var0);

      int var1;
      long var3;
      label361: {
         Throwable var10000;
         label362: {
            byte[] var8;
            boolean var10001;
            try {
               var8 = new byte[4];
               ByteStreams.readFully(var39, var8);
            } catch (Throwable var38) {
               var10000 = var38;
               var10001 = false;
               break label362;
            }

            var3 = 4L;

            byte[] var7;
            while(true) {
               try {
                  var7 = MPEG4_FTYP_MARKER;
                  if (Arrays.equals(var8, var7)) {
                     break;
                  }
               } catch (Throwable var37) {
                  var10000 = var37;
                  var10001 = false;
                  break label362;
               }

               int var2;
               for(var1 = 0; var1 < 3; var1 = var2) {
                  var2 = var1 + 1;
                  var8[var1] = var8[var2];
               }

               try {
                  var1 = var39.read();
               } catch (Throwable var36) {
                  var10000 = var36;
                  var10001 = false;
                  break label362;
               }

               if (var1 < 0) {
                  var39.close();
                  return -1L;
               }

               var8[3] = (byte)var1;
               ++var3;
            }

            label337:
            try {
               var1 = var7.length;
               break label361;
            } catch (Throwable var35) {
               var10000 = var35;
               var10001 = false;
               break label337;
            }
         }

         Throwable var40 = var10000;

         try {
            var39.close();
         } catch (Throwable var34) {
            .c.C(var40, var34);
            throw var40;
         }

         throw var40;
      }

      long var5 = (long)var1;
      var39.close();
      return var3 - var5 - 4L;
   }

   private static boolean validateOffset(File var0, long var1) {
      boolean var10001;
      FileInputStream var4;
      try {
         var4 = new FileInputStream(var0);
      } catch (IOException var22) {
         var10001 = false;
         return false;
      }

      boolean var3;
      try {
         ByteStreams.skipFully(var4, var1 + 4L);
         byte[] var24 = new byte[4];
         ByteStreams.readFully(var4, var24);
         var3 = Arrays.equals(var24, MPEG4_FTYP_MARKER);
      } catch (Throwable var21) {
         Throwable var23 = var21;

         try {
            var4.close();
         } catch (Throwable var19) {
            Throwable var25 = var19;

            label101:
            try {
               .c.C(var23, var25);
               break label101;
            } catch (IOException var18) {
               var10001 = false;
               return false;
            }
         }

         try {
            throw var23;
         } catch (IOException var17) {
            var10001 = false;
            return false;
         }
      }

      try {
         var4.close();
         return var3;
      } catch (IOException var20) {
         var10001 = false;
         return false;
      }
   }
}
