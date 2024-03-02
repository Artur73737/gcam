package com.google.vr.vrcore.controller.api;

public final class NativeCallbacks implements ControllerServiceBridge$Callbacks {
   private final long a;
   private boolean b;

   public NativeCallbacks(long var1) {
      this.a = var1;
   }

   private native void handleAccelEvent(long var1, int var3, long var4, float var6, float var7, float var8);

   private native void handleBatteryEvent(long var1, int var3, long var4, boolean var6, int var7);

   private native void handleButtonEvent(long var1, int var3, long var4, int var6, boolean var7);

   private native void handleControllerRecentered(long var1, int var3, long var4, float var6, float var7, float var8, float var9);

   private native void handleGyroEvent(long var1, int var3, long var4, float var6, float var7, float var8);

   private native void handleOrientationEvent(long var1, int var3, long var4, float var6, float var7, float var8, float var9);

   private native void handlePositionEvent(long var1, int var3, long var4, float var6, float var7, float var8);

   private native void handleServiceConnected(long var1, int var3);

   private native void handleServiceDisconnected(long var1);

   private native void handleServiceFailed(long var1);

   private native void handleServiceInitFailed(long var1, int var3);

   private native void handleServiceUnavailable(long var1);

   private native void handleStateChanged(long var1, int var3, int var4);

   private native void handleTouchEvent(long var1, int var3, long var4, int var6, float var7, float var8);

   private native void handleTrackingStatusEvent(long var1, int var3, long var4, int var6);

   private final void j(.qoq var1) {
      byte var3 = 0;
      int var2 = 0;

      int var4;
      while(true) {
         if (!this.b) {
            var4 = var1.l;
            if (var2 < var4) {
               if (var2 >= var4) {
                  throw new IndexOutOfBoundsException();
               }

               .qol var10 = var1.m[var2];
               this.handleAccelEvent(this.a, var10.e, var10.d, var10.a, var10.b, var10.c);
               ++var2;
               continue;
            }

            var2 = 0;
            break;
         }

         var2 = 0;
         break;
      }

      while(true) {
         if (!this.b) {
            var4 = var1.n;
            if (var2 < var4) {
               if (var2 >= var4) {
                  throw new IndexOutOfBoundsException();
               }

               .qon var9 = var1.o[var2];
               this.handleButtonEvent(this.a, var9.e, var9.d, var9.a, var9.b);
               ++var2;
               continue;
            }

            var2 = 0;
            break;
         }

         var2 = 0;
         break;
      }

      while(true) {
         if (!this.b) {
            var4 = var1.p;
            if (var2 < var4) {
               if (var2 >= var4) {
                  throw new IndexOutOfBoundsException();
               }

               .qor var8 = var1.q[var2];
               this.handleGyroEvent(this.a, var8.e, var8.d, var8.a, var8.b, var8.c);
               ++var2;
               continue;
            }

            var2 = 0;
            break;
         }

         var2 = 0;
         break;
      }

      while(true) {
         if (!this.b) {
            var4 = var1.r;
            if (var2 < var4) {
               if (var2 >= var4) {
                  throw new IndexOutOfBoundsException();
               }

               .qot var7 = var1.s[var2];
               this.handleOrientationEvent(this.a, var7.e, var7.d, var7.a, var7.b, var7.c, var7.f);
               ++var2;
               continue;
            }

            var2 = var3;
            break;
         }

         var2 = var3;
         break;
      }

      while(!this.b) {
         int var6 = var1.t;
         if (var2 >= var6) {
            break;
         }

         if (var2 >= var6) {
            throw new IndexOutOfBoundsException();
         }

         .qox var5 = var1.u[var2];
         this.handleTouchEvent(this.a, var5.e, var5.d, var5.b, var5.c, var5.f);
         ++var2;
      }

   }

   public final void a(.qoq var1) {
      synchronized(this){}

      Throwable var10000;
      label78: {
         boolean var10001;
         boolean var2;
         try {
            var2 = this.b;
         } catch (Throwable var8) {
            var10000 = var8;
            var10001 = false;
            break label78;
         }

         if (var2) {
            return;
         }

         label69:
         try {
            this.j(var1);
            return;
         } catch (Throwable var7) {
            var10000 = var7;
            var10001 = false;
            break label69;
         }
      }

      Throwable var9 = var10000;
      throw var9;
   }

   public final void b(.qop var1) {
      synchronized(this){}

      Throwable var10000;
      label928: {
         boolean var5;
         boolean var10001;
         try {
            var5 = this.b;
         } catch (Throwable var94) {
            var10000 = var94;
            var10001 = false;
            break label928;
         }

         if (var5) {
            return;
         }

         try {
            this.j(var1);
         } catch (Throwable var93) {
            var10000 = var93;
            var10001 = false;
            break label928;
         }

         byte var3 = 0;
         int var2 = 0;

         IndexOutOfBoundsException var97;
         while(true) {
            int var4;
            label919: {
               try {
                  if (!this.b) {
                     var4 = var1.c;
                     break label919;
                  }
               } catch (Throwable var96) {
                  var10000 = var96;
                  var10001 = false;
                  break label928;
               }

               var2 = var3;
               break;
            }

            if (var2 >= var4) {
               var2 = var3;
               break;
            }

            if (var2 >= var4) {
               try {
                  var97 = new IndexOutOfBoundsException();
                  throw var97;
               } catch (Throwable var88) {
                  var10000 = var88;
                  var10001 = false;
                  break label928;
               }
            }

            try {
               .qou var6 = var1.d[var2];
               this.handlePositionEvent(this.a, var6.e, var6.d, var6.a, var6.b, var6.c);
            } catch (Throwable var92) {
               var10000 = var92;
               var10001 = false;
               break label928;
            }

            ++var2;
         }

         while(true) {
            int var100;
            try {
               if (this.b) {
                  break;
               }

               var100 = var1.h;
            } catch (Throwable var95) {
               var10000 = var95;
               var10001 = false;
               break label928;
            }

            if (var2 >= var100) {
               try {
                  if (var1.e) {
                     .qom var99 = var1.f;
                     this.handleBatteryEvent(this.a, var99.e, var99.d, var99.b, var99.a);
                  }
                  break;
               } catch (Throwable var90) {
                  var10000 = var90;
                  var10001 = false;
                  break label928;
               }
            }

            if (var2 >= var100) {
               try {
                  var97 = new IndexOutOfBoundsException();
                  throw var97;
               } catch (Throwable var89) {
                  var10000 = var89;
                  var10001 = false;
                  break label928;
               }
            }

            try {
               .qoy var101 = var1.i[var2];
               this.handleTrackingStatusEvent(this.a, var101.e, var101.d, var101.a);
            } catch (Throwable var91) {
               var10000 = var91;
               var10001 = false;
               break label928;
            }

            ++var2;
         }

         return;
      }

      Throwable var98 = var10000;
      throw var98;
   }

   public final void c(.qot var1) {
      synchronized(this){}

      try {
         if (!this.b) {
            this.handleControllerRecentered(this.a, var1.e, var1.d, var1.a, var1.b, var1.c, var1.f);
         }
      } finally {
         ;
      }

   }

   public void close() {
      synchronized(this){}

      try {
         this.b = true;
      } finally {
         ;
      }

   }

   public final void d(int var1, int var2) {
      synchronized(this){}

      try {
         if (!this.b) {
            this.handleStateChanged(this.a, var1, var2);
         }
      } finally {
         ;
      }

   }

   public final void e() {
      synchronized(this){}

      try {
         if (!this.b) {
            this.handleServiceDisconnected(this.a);
         }
      } finally {
         ;
      }

   }

   public final void f() {
      synchronized(this){}

      try {
         if (!this.b) {
            this.handleServiceFailed(this.a);
         }
      } finally {
         ;
      }

   }

   public final void g(int var1) {
      synchronized(this){}

      try {
         if (!this.b) {
            this.handleServiceInitFailed(this.a, var1);
         }
      } finally {
         ;
      }

   }

   public final void h() {
      synchronized(this){}

      try {
         if (!this.b) {
            this.handleServiceUnavailable(this.a);
         }
      } finally {
         ;
      }

   }

   public final void i() {
      synchronized(this){}

      try {
         if (!this.b) {
            this.handleServiceConnected(this.a, 1);
         }
      } finally {
         ;
      }

   }
}
