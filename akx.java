import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import android.view.Choreographer.FrameCallback;
import com.google.android.libraries.oliveoil.bufferflinger.aUnT.zBdGS;
import java.util.concurrent.TimeUnit;

public final class akx implements Runnable, FrameCallback, auq {
   public static long a;
   public final View b;
   public final axf c;
   public boolean d;
   private long e;
   private long f;
   private final Choreographer g;
   private boolean h;
   private final ve i;
   private final myq j;
   private final pde k;

   public akx(pde var1, myq var2, ve var3, View var4) {
      var4.getClass();
      super();
      this.k = var1;
      this.j = var2;
      this.i = var3;
      this.b = var4;
      this.c = new axf(new akw[16]);
      this.g = Choreographer.getInstance();
      if (a == 0L) {
         float var5;
         label17: {
            Display var8 = var4.getDisplay();
            boolean var7 = var4.isInEditMode();
            float var6 = 60.0F;
            if (!var7 && var8 != null) {
               var5 = var8.getRefreshRate();
               if (var5 >= 30.0F) {
                  break label17;
               }
            }

            var5 = var6;
         }

         a = (long)(1.0E9F / var5);
      }

   }

   private static final long d(long var0, long var2) {
      return var2 == 0L ? var0 : var2 / 4L * 3L + var0 / 4L;
   }

   private static final boolean e(long var0, long var2, long var4) {
      return var0 > var2 || var0 + var4 < var2;
   }

   public final void a() {
   }

   public final void b() {
      this.h = false;
      this.k.a = null;
      this.b.removeCallbacks(this);
      this.g.removeFrameCallback(this);
   }

   public final void c() {
      this.k.a = this;
      this.h = true;
   }

   public final void doFrame(long var1) {
      if (this.h) {
         this.b.post(this);
      }

   }

   public final void run() {
      if (!this.c.m() && this.d && this.h && this.b.getWindowVisibility() == 0) {
         long var4 = TimeUnit.MILLISECONDS.toNanos(this.b.getDrawingTime()) + a;
         boolean var1 = false;

         while(true) {
            axf var10 = this.c;
            if (var10.n()) {
               if (!var1) {
                  akw var106 = (akw)var10.a[0];
                  Object var12 = ((qvi)this.i.c).a();
                  if (!var106.c) {
                     int var2 = ((aji)var12).b();
                     if (var106.a < var2) {
                        long var6;
                        int var105;
                        if (var106.d == null) {
                           Trace.beginSection("compose:lazylist:prefetch:compose");
                           boolean var95 = false;

                           label1332: {
                              label1331: {
                                 try {
                                    var95 = true;
                                    var6 = System.nanoTime();
                                    if (!e(var6, var4, this.e)) {
                                       var95 = false;
                                       break label1331;
                                    }

                                    var105 = var106.a;
                                    Object var110 = ((aji)var12).c(var105);
                                    var105 = var106.a;
                                    ((aji)var12).e(var105);
                                    qvx var112 = this.i.a(var106.a, var110);
                                    var106.d = this.j.i().f(var110, var112);
                                    this.e = d(System.nanoTime() - var6, this.e);
                                    var95 = false;
                                 } finally {
                                    if (var95) {
                                       Trace.endSection();
                                    }
                                 }

                                 var1 = false;
                                 break label1332;
                              }

                              var1 = true;
                           }

                           Trace.endSection();
                           continue;
                        }

                        Trace.beginSection("compose:lazylist:prefetch:measure");

                        label1381: {
                           label1380: {
                              Throwable var10000;
                              label1401: {
                                 long var8;
                                 bjp var11;
                                 boolean var10001;
                                 bmd var111;
                                 try {
                                    var8 = System.nanoTime();
                                    if (!e(var8, var4, this.f)) {
                                       break label1380;
                                    }

                                    var11 = var106.d;
                                    var11.getClass();
                                    var111 = (bmd)((bjq)var11.b).j.get(var11.a);
                                 } catch (Throwable var104) {
                                    var10000 = var104;
                                    var10001 = false;
                                    break label1401;
                                 }

                                 if (var111 != null) {
                                    try {
                                       var105 = var111.y().size();
                                    } catch (Throwable var103) {
                                       var10000 = var103;
                                       var10001 = false;
                                       break label1401;
                                    }
                                 } else {
                                    var105 = 0;
                                 }

                                 var2 = 0;

                                 while(true) {
                                    if (var2 >= var105) {
                                       try {
                                          this.f = d(System.nanoTime() - var8, this.f);
                                          this.c.c(0);
                                       } catch (Throwable var99) {
                                          var10000 = var99;
                                          var10001 = false;
                                          break;
                                       }

                                       var1 = false;
                                       break label1381;
                                    }

                                    bmd var13;
                                    try {
                                       var6 = var106.b;
                                       var13 = (bmd)((bjq)var11.b).j.get(var11.a);
                                    } catch (Throwable var100) {
                                       var10000 = var100;
                                       var10001 = false;
                                       break;
                                    }

                                    if (var13 != null) {
                                       label1405: {
                                          int var3;
                                          try {
                                             if (!var13.ad()) {
                                                break label1405;
                                             }

                                             var3 = var13.y().size();
                                          } catch (Throwable var101) {
                                             var10000 = var101;
                                             var10001 = false;
                                             break;
                                          }

                                          if (var2 >= 0 && var2 < var3) {
                                             try {
                                                if (!var13.d()) {
                                                   var111 = ((bjq)var11.b).a;
                                                   var111.g = true;
                                                   bmg.a(var13).g((bmd)var13.y().get(var2), var6);
                                                   var111.g = false;
                                                   break label1405;
                                                }
                                             } catch (Throwable var102) {
                                                var10000 = var102;
                                                var10001 = false;
                                                break;
                                             }

                                             try {
                                                IllegalArgumentException var108 = new IllegalArgumentException("Pre-measure called on node that is not placed");
                                                throw var108;
                                             } catch (Throwable var97) {
                                                var10000 = var97;
                                                var10001 = false;
                                                break;
                                             }
                                          }

                                          try {
                                             IndexOutOfBoundsException var107 = new IndexOutOfBoundsException(c.aJ((byte)41, var3, var2, zBdGS.XCSSa, ") is out of bound of [0, "));
                                             throw var107;
                                          } catch (Throwable var98) {
                                             var10000 = var98;
                                             var10001 = false;
                                             break;
                                          }
                                       }
                                    }

                                    ++var2;
                                 }
                              }

                              Throwable var109 = var10000;
                              Trace.endSection();
                              throw var109;
                           }

                           var1 = true;
                        }

                        Trace.endSection();
                        continue;
                     }
                  }

                  this.c.c(0);
                  continue;
               }
            } else if (!var1) {
               this.d = false;
               return;
            }

            this.g.postFrameCallback(this);
            return;
         }
      } else {
         this.d = false;
      }
   }
}
