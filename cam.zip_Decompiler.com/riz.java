import com.google.android.material.search.Ztp.sYWXtqVx;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;

public final class riz extends Thread {
   public final qyo a;
   public boolean b;
   final rja c;
   public int d;
   public final fwf e;
   private long f;
   private long g;
   private int h;
   public volatile int indexInArray;
   public volatile Object nextParkedWorker;

   public riz(rja var1, int var2) {
      this.c = var1;
      this.setDaemon(true);
      this.e = new fwf((char[])null);
      this.d = 4;
      this.a = qwp.g(0);
      this.nextParkedWorker = rja.a;
      qxl var3 = qxm.a;
      this.h = qxm.b.a();
      this.c(var2);
   }

   private final rje e() {
      rje var1;
      if (this.a(2) == 0) {
         var1 = (rje)this.c.i.h();
         return var1 != null ? var1 : (rje)this.c.j.h();
      } else {
         var1 = (rje)this.c.j.h();
         return var1 != null ? var1 : (rje)this.c.i.h();
      }
   }

   private final rje f(boolean var1) {
      boolean var12 = qzx.a;
      int var5 = (int)(this.c.h.b & 2097151L);
      if (var5 < 2) {
         return null;
      } else {
         int var2 = this.a(var5);
         rja var13 = this.c;
         int var3 = 0;

         long var8;
         for(var8 = Long.MAX_VALUE; var3 < var5; ++var3) {
            int var4 = var2 + 1;
            var2 = var4;
            if (var4 > var5) {
               var2 = 1;
            }

            riz var15 = (riz)var13.g.a(var2);
            if (var15 != null && var15 != this) {
               long var10;
               fwf var14;
               if (var1) {
                  label79: {
                     var14 = this.e;
                     fwf var19 = var15.e;
                     var19.getClass();
                     var4 = ((qyo)var19.b).b;
                     int var6 = ((qyo)var19.a).b;

                     for(Object var18 = var19.e; var4 != var6; ++var4) {
                        int var7 = var4 & 127;
                        if (((qyo)var19.c).b == 0) {
                           break;
                        }

                        AtomicReferenceArray var17 = (AtomicReferenceArray)var18;
                        rje var16 = (rje)var17.get(var7);
                        if (var16 != null && var16.h.a == 1) {
                           do {
                              if (var17.compareAndSet(var7, var16, (Object)null)) {
                                 ((qyo)var19.c).d();
                                 fwf.H(var14, var16);
                                 var10 = -1L;
                                 break label79;
                              }
                           } while(var17.get(var7) == var16);
                        }
                     }

                     var10 = var14.G(var19, true);
                  }
               } else {
                  var14 = this.e;
                  fwf var21 = var15.e;
                  var21.getClass();
                  rje var20 = var21.F();
                  if (var20 != null) {
                     fwf.H(var14, var20);
                     var10 = -1L;
                  } else {
                     var10 = var14.G(var21, false);
                  }
               }

               if (var10 == -1L) {
                  return this.e.E();
               }

               if (var10 > 0L) {
                  var8 = Math.min(var8, var10);
               }
            }
         }

         if (var8 == Long.MAX_VALUE) {
            var8 = 0L;
         }

         this.g = var8;
         return null;
      }
   }

   private final boolean g() {
      return this.nextParkedWorker != rja.a;
   }

   public final int a(int var1) {
      int var2 = this.h;
      var2 ^= var2 << 13;
      var2 ^= var2 >> 17;
      int var3 = var2 ^ var2 << 5;
      this.h = var3;
      var2 = var1 - 1;
      return (var2 & var1) == 0 ? var3 & var2 : (var3 & Integer.MAX_VALUE) % var1;
   }

   public final rje b(boolean var1) {
      int var3 = this.d;
      boolean var2 = true;
      rje var8;
      if (var3 != 1) {
         rja var6 = this.c;
         qyp var7 = var6.h;

         long var4;
         do {
            var4 = var7.b;
            if ((int)((9223367638808264704L & var4) >> 42) == 0) {
               rje var9;
               if (var1) {
                  var9 = this.e.E();
                  var8 = var9;
                  if (var9 == null) {
                     var8 = (rje)this.c.j.h();
                  }
               } else {
                  var8 = (rje)this.c.j.h();
               }

               var9 = var8;
               if (var8 == null) {
                  var9 = this.f(true);
               }

               return var9;
            }
         } while(!var6.h.d(var4, -4398046511104L + var4));

         this.d = 1;
      }

      if (var1) {
         var3 = this.c.b;
         if (this.a(var3 + var3) != 0) {
            var2 = false;
         }

         if (var2) {
            var8 = this.e();
            if (var8 != null) {
               return var8;
            }
         }

         var8 = this.e.E();
         if (var8 != null) {
            return var8;
         }

         if (!var2) {
            var8 = this.e();
            if (var8 != null) {
               return var8;
            }
         }
      } else {
         var8 = this.e();
         if (var8 != null) {
            return var8;
         }
      }

      return this.f(false);
   }

   public final void c(int var1) {
      String var3 = this.c.e;
      String var2;
      if (var1 == 0) {
         var2 = sYWXtqVx.thfwULpnVsUUlPD;
      } else {
         var2 = String.valueOf(var1);
      }

      StringBuilder var4 = new StringBuilder();
      var4.append(var3);
      var4.append("-worker-");
      var4.append(var2);
      this.setName(var4.toString());
      this.indexInArray = var1;
   }

   public final boolean d(int var1) {
      int var2 = this.d;
      boolean var3 = true;
      if (var2 != 1) {
         var3 = false;
      }

      if (var3) {
         this.c.h.a(4398046511104L);
      }

      if (var2 != var1) {
         this.d = var1;
      }

      return var3;
   }

   public final void run() {
      boolean var1 = false;

      label971:
      while(!this.c.c() && this.d != 5) {
         rje var7 = this.b(this.b);
         boolean var4;
         if (var7 != null) {
            this.g = 0L;
            int var52 = var7.h.a;
            this.f = 0L;
            if (this.d == 3) {
               var4 = qzx.a;
               this.d = 2;
            }

            if (var52 != 0 && this.d(2)) {
               this.c.b();
            }

            rja.f(var7);
            if (var52 == 0) {
               var1 = false;
            } else {
               this.c.h.a(-2097152L);
               if (this.d != 5) {
                  var4 = qzx.a;
                  this.d = 4;
               }

               var1 = false;
            }
         } else {
            this.b = false;
            if (this.g != 0L) {
               if (!var1) {
                  var1 = true;
               } else {
                  this.d(3);
                  Thread.interrupted();
                  LockSupport.parkNanos(this.g);
                  this.g = 0L;
                  var1 = false;
               }
            } else {
               int var2;
               long var5;
               rja var8;
               if (!this.g()) {
                  var8 = this.c;
                  if (this.nextParkedWorker == rja.a) {
                     qyp var54 = var8.f;

                     while(true) {
                        var5 = var54.b;
                        var2 = this.indexInArray;
                        var4 = qzx.a;
                        this.nextParkedWorker = var8.g.a((int)(var5 & 2097151L));
                        if (var8.f.d(var5, 2097152L + var5 & -2097152L | (long)var2)) {
                           break;
                        }
                     }
                  }
               } else {
                  var4 = qzx.a;
                  this.a.b = -1;

                  while(true) {
                     while(true) {
                        do {
                           if (!this.g() || this.a.b != -1 || this.c.c() || this.d == 5) {
                              continue label971;
                           }

                           this.d(3);
                           Thread.interrupted();
                           if (this.f == 0L) {
                              this.f = System.nanoTime() + this.c.d;
                           }

                           LockSupport.parkNanos(this.c.d);
                        } while(System.nanoTime() - this.f < 0L);

                        this.f = 0L;
                        var8 = this.c;
                        rim var53 = var8.g;
                        synchronized(var53){}

                        Throwable var10000;
                        label980: {
                           boolean var10001;
                           try {
                              var4 = var8.c();
                           } catch (Throwable var51) {
                              var10000 = var51;
                              var10001 = false;
                              break label980;
                           }

                           if (var4) {
                              continue;
                           }

                           try {
                              var5 = var8.h.b;
                              var2 = var8.b;
                           } catch (Throwable var50) {
                              var10000 = var50;
                              var10001 = false;
                              break label980;
                           }

                           if ((int)(var5 & 2097151L) <= var2) {
                              continue;
                           }

                           try {
                              var4 = this.a.c(-1, 1);
                           } catch (Throwable var49) {
                              var10000 = var49;
                              var10001 = false;
                              break label980;
                           }

                           if (!var4) {
                              continue;
                           }

                           int var3;
                           try {
                              var3 = this.indexInArray;
                              this.c(0);
                              var8.a(this, var3, 0);
                              qyp var9 = var8.h;
                              var2 = (int)(qyp.a.getAndDecrement(var9) & 2097151L);
                           } catch (Throwable var48) {
                              var10000 = var48;
                              var10001 = false;
                              break label980;
                           }

                           if (var2 != var3) {
                              try {
                                 Object var56 = var8.g.a(var2);
                                 var56.getClass();
                                 riz var57 = (riz)var56;
                                 var8.g.b(var3, var57);
                                 var57.c(var3);
                                 var8.a(var57, var2, var3);
                              } catch (Throwable var47) {
                                 var10000 = var47;
                                 var10001 = false;
                                 break label980;
                              }
                           }

                           try {
                              var8.g.b(var2, (Object)null);
                           } catch (Throwable var46) {
                              var10000 = var46;
                              var10001 = false;
                              break label980;
                           }

                           this.d = 5;
                           continue;
                        }

                        Throwable var55 = var10000;
                        throw var55;
                     }
                  }
               }
            }
         }
      }

      this.d(5);
   }
}
