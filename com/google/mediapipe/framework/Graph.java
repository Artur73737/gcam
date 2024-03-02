package com.google.mediapipe.framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Graph {
   private static final .pds a = .pds.h("com.google.mediapipe.framework.Graph");
   private final long b = this.nativeCreateGraph();
   private final List c = new ArrayList();
   private final Map d = new HashMap();
   private final Map e = new HashMap();
   private boolean f = false;
   private boolean g = false;
   private final Map h = new HashMap();

   private static void i(Map var0, String[] var1, long[] var2) {
      if (var0.size() == var1.length && var0.size() == var2.length) {
         Iterator var6 = var0.entrySet().iterator();

         for(int var3 = 0; var6.hasNext(); ++var3) {
            Entry var4 = (Entry)var6.next();
            var1[var3] = (String)var4.getKey();
            var2[var3] = ((Packet)var4.getValue()).getNativeHandle();
         }

      } else {
         RuntimeException var5 = new RuntimeException("Input array length doesn't match the map size!");
         throw var5;
      }
   }

   private native void nativeAddPacketCallback(long var1, String var3, PacketCallback var4);

   private native long nativeAddSurfaceOutput(long var1, String var3);

   private native long nativeCreateGraph();

   private native void nativeLoadBinaryGraph(long var1, String var3);

   private native void nativeLoadBinaryGraphBytes(long var1, byte[] var3);

   private native void nativeMovePacketToInputStream(long var1, String var3, long var4, long var6);

   private native void nativeSetParentGlContext(long var1, long var3);

   private native void nativeStartRunningGraph(long var1, String[] var3, long[] var4, String[] var5, long[] var6);

   public final long a() {
      synchronized(this){}

      long var1;
      try {
         var1 = this.b;
      } finally {
         ;
      }

      return var1;
   }

   public final void b(String var1, Packet var2, long var3) {
      synchronized(this){}

      Throwable var10000;
      label636: {
         boolean var5;
         boolean var10001;
         label631: {
            label630: {
               try {
                  if (this.b != 0L) {
                     break label630;
                  }
               } catch (Throwable var64) {
                  var10000 = var64;
                  var10001 = false;
                  break label636;
               }

               var5 = false;
               break label631;
            }

            var5 = true;
         }

         Packet var6;
         label637: {
            try {
               .onk.I(var5, "Invalid context, tearDown() might have been called.");
               if (!this.g) {
                  var6 = new Packet(var2.nativeCopyPacket(var2.a));
                  if (!this.h.containsKey(var1)) {
                     Map var7 = this.h;
                     ArrayList var8 = new ArrayList();
                     var7.put(var1, var8);
                  }
                  break label637;
               }
            } catch (Throwable var63) {
               var10000 = var63;
               var10001 = false;
               break label636;
            }

            try {
               this.nativeMovePacketToInputStream(this.b, var1, var2.getNativeHandle(), var3);
               var2.release();
            } catch (Throwable var62) {
               var10000 = var62;
               var10001 = false;
               break label636;
            }

            return;
         }

         List var70;
         label638: {
            Iterator var65;
            try {
               var70 = (List)this.h.get(var1);
               if (var70.size() <= 20) {
                  break label638;
               }

               var65 = this.e.entrySet().iterator();
            } catch (Throwable var61) {
               var10000 = var61;
               var10001 = false;
               break label636;
            }

            while(true) {
               try {
                  if (!var65.hasNext()) {
                     break;
                  }

                  Entry var69 = (Entry)var65.next();
                  if (var69.getValue() == null) {
                     ((.pdq)a.b().I(4876)).t("Stream: %s might be missing.", var69.getKey());
                  }
               } catch (Throwable var60) {
                  var10000 = var60;
                  var10001 = false;
                  break label636;
               }
            }

            try {
               RuntimeException var66 = new RuntimeException("Graph is not started because of missing streams");
               throw var66;
            } catch (Throwable var58) {
               var10000 = var58;
               var10001 = false;
               break label636;
            }
         }

         try {
            .nom var68 = new .nom(var6, var3);
            var70.add(var68);
            var2.release();
         } catch (Throwable var59) {
            var10000 = var59;
            var10001 = false;
            break label636;
         }

         return;
      }

      Throwable var67 = var10000;
      throw var67;
   }

   public final void c(String var1, PacketCallback var2) {
      synchronized(this){}

      Throwable var10000;
      label172: {
         boolean var10001;
         long var5;
         try {
            var5 = this.b;
         } catch (Throwable var18) {
            var10000 = var18;
            var10001 = false;
            break label172;
         }

         boolean var4 = true;
         boolean var3;
         if (var5 != 0L) {
            var3 = true;
         } else {
            var3 = false;
         }

         label162: {
            label161: {
               try {
                  .onk.I(var3, "Invalid context, tearDown() might have been called already.");
                  if (!this.g && !this.f) {
                     break label161;
                  }
               } catch (Throwable var17) {
                  var10000 = var17;
                  var10001 = false;
                  break label172;
               }

               var3 = false;
               break label162;
            }

            var3 = var4;
         }

         label152:
         try {
            .onk.H(var3);
            this.c.add(var2);
            this.nativeAddPacketCallback(this.b, var1, var2);
            return;
         } catch (Throwable var16) {
            var10000 = var16;
            var10001 = false;
            break label152;
         }
      }

      Throwable var19 = var10000;
      throw var19;
   }

   public final void d(String var1) {
      synchronized(this){}

      Throwable var10000;
      label80: {
         boolean var10001;
         boolean var2;
         label79: {
            label78: {
               try {
                  if (this.b != 0L) {
                     break label78;
                  }
               } catch (Throwable var8) {
                  var10000 = var8;
                  var10001 = false;
                  break label80;
               }

               var2 = false;
               break label79;
            }

            var2 = true;
         }

         label72:
         try {
            .onk.I(var2, "Invalid context, tearDown() might have been called already.");
            this.nativeLoadBinaryGraph(this.b, var1);
            return;
         } catch (Throwable var7) {
            var10000 = var7;
            var10001 = false;
            break label72;
         }
      }

      Throwable var9 = var10000;
      throw var9;
   }

   public final void e(byte[] var1) {
      synchronized(this){}

      Throwable var10000;
      label80: {
         boolean var10001;
         boolean var2;
         label79: {
            label78: {
               try {
                  if (this.b != 0L) {
                     break label78;
                  }
               } catch (Throwable var8) {
                  var10000 = var8;
                  var10001 = false;
                  break label80;
               }

               var2 = false;
               break label79;
            }

            var2 = true;
         }

         label72:
         try {
            .onk.I(var2, "Invalid context, tearDown() might have been called already.");
            this.nativeLoadBinaryGraphBytes(this.b, var1);
            return;
         } catch (Throwable var7) {
            var10000 = var7;
            var10001 = false;
            break label72;
         }
      }

      Throwable var9 = var10000;
      throw var9;
   }

   public final void f(long var1) {
      synchronized(this){}

      Throwable var10000;
      label80: {
         boolean var10001;
         boolean var3;
         label79: {
            label78: {
               try {
                  if (this.b != 0L) {
                     break label78;
                  }
               } catch (Throwable var10) {
                  var10000 = var10;
                  var10001 = false;
                  break label80;
               }

               var3 = false;
               break label79;
            }

            var3 = true;
         }

         label72:
         try {
            .onk.I(var3, "Invalid context, tearDown() might have been called already.");
            .onk.H(this.g ^ true);
            this.nativeSetParentGlContext(this.b, var1);
            return;
         } catch (Throwable var9) {
            var10000 = var9;
            var10001 = false;
            break label72;
         }
      }

      Throwable var4 = var10000;
      throw var4;
   }

   public final void g() {
      // $FF: Couldn't be decompiled
   }

   public final void h(String var1) {
      synchronized(this){}

      Throwable var10000;
      label172: {
         boolean var10001;
         long var4;
         try {
            var4 = this.b;
         } catch (Throwable var17) {
            var10000 = var17;
            var10001 = false;
            break label172;
         }

         boolean var3 = true;
         boolean var2;
         if (var4 != 0L) {
            var2 = true;
         } else {
            var2 = false;
         }

         label162: {
            label161: {
               try {
                  .onk.I(var2, "Invalid context, tearDown() might have been called.");
                  var1.getClass();
                  if (!this.g && !this.f) {
                     break label161;
                  }
               } catch (Throwable var16) {
                  var10000 = var16;
                  var10001 = false;
                  break label172;
               }

               var2 = false;
               break label162;
            }

            var2 = var3;
         }

         label152:
         try {
            .onk.H(var2);
            this.nativeAddSurfaceOutput(this.b, var1);
            return;
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label152;
         }
      }

      Throwable var18 = var10000;
      throw var18;
   }
}
