import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;

public final class rja implements Executor, Closeable {
   public static final riq a = new riq("NOT_IN_STACK");
   public final int b;
   public final int c;
   public final long d;
   public final String e;
   public final qyp f;
   public final rim g;
   public final qyp h;
   public final nlz i;
   public final nlz j;
   private final qyn k;

   public rja(int var1, int var2, long var3) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = "DefaultDispatcher";
      if (var1 > 0) {
         if (var2 >= var1) {
            if (var2 <= 2097150) {
               if (var3 > 0L) {
                  this.i = new nlz((char[])null);
                  this.j = new nlz((char[])null);
                  this.f = qwp.h(0L);
                  this.g = new rim(var1 + 1);
                  this.h = qwp.h((long)var1 << 42);
                  this.k = qwp.f(false);
               } else {
                  throw new IllegalArgumentException(nx.b(var3, "Idle worker keep alive time ", " must be positive"));
               }
            } else {
               throw new IllegalArgumentException(c.aK(var2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            }
         } else {
            throw new IllegalArgumentException(c.az(var1, var2, "Max pool size ", " should be greater than or equals to core pool size "));
         }
      } else {
         throw new IllegalArgumentException(c.aK(var1, "Core pool size ", " should be at least 1"));
      }
   }

   // $FF: synthetic method
   public static void e(rja var0, Runnable var1, boolean var2, int var3) {
      rjf var4;
      if ((var3 & 2) != 0) {
         var4 = rjh.e;
      } else {
         var4 = null;
      }

      boolean var5;
      if ((var3 & 4) != 0) {
         var5 = false;
      } else {
         var5 = true;
      }

      var0.d(var1, var4, var2 & var5);
   }

   public static final void f(rje var0) {
      var0.getClass();

      try {
         var0.run();
      } catch (Throwable var7) {
         Throwable var8 = var7;

         try {
            Thread var1 = Thread.currentThread();
            var1.getUncaughtExceptionHandler().uncaughtException(var1, var8);
            return;
         } finally {
            ;
         }
      }
   }

   private final int g() {
      rim var7 = this.g;
      synchronized(var7){}

      Throwable var10000;
      label591: {
         boolean var6;
         boolean var10001;
         try {
            var6 = this.c();
         } catch (Throwable var63) {
            var10000 = var63;
            var10001 = false;
            break label591;
         }

         if (var6) {
            return -1;
         }

         long var4;
         try {
            var4 = this.h.b;
         } catch (Throwable var62) {
            var10000 = var62;
            var10001 = false;
            break label591;
         }

         int var1 = (int)((var4 & 4398044413952L) >> 21);
         int var2 = (int)(var4 & 2097151L);

         int var3;
         try {
            var1 = qxb.k(var2 - var1, 0);
            var3 = this.b;
         } catch (Throwable var61) {
            var10000 = var61;
            var10001 = false;
            break label591;
         }

         if (var1 >= var3) {
            return 0;
         }

         rim var8;
         try {
            if (var2 >= this.c) {
               return 0;
            }

            var4 = this.h.b;
            var8 = this.g;
         } catch (Throwable var60) {
            var10000 = var60;
            var10001 = false;
            break label591;
         }

         var2 = (int)(var4 & 2097151L) + 1;

         IllegalArgumentException var65;
         label582: {
            try {
               if (var8.a(var2) == null) {
                  riz var66 = new riz(this, var2);
                  this.g.b(var2, var66);
                  if (var2 != (int)(2097151L & this.h.c())) {
                     break label582;
                  }

                  var66.start();
                  return var1 + 1;
               }
            } catch (Throwable var64) {
               var10000 = var64;
               var10001 = false;
               break label591;
            }

            try {
               var65 = new IllegalArgumentException("Failed requirement.");
               throw var65;
            } catch (Throwable var59) {
               var10000 = var59;
               var10001 = false;
               break label591;
            }
         }

         label553:
         try {
            var65 = new IllegalArgumentException("Failed requirement.");
            throw var65;
         } catch (Throwable var58) {
            var10000 = var58;
            var10001 = false;
            break label553;
         }
      }

      Throwable var67 = var10000;
      throw var67;
   }

   private final riz h() {
      Thread var1 = Thread.currentThread();
      riz var2;
      if (var1 instanceof riz) {
         var2 = (riz)var1;
      } else {
         var2 = null;
      }

      return var2 != null && c.E(var2.c, this) ? var2 : null;
   }

   private final boolean i(long var1) {
      if (qxb.k((int)(var1 & 2097151L) - (int)((4398044413952L & var1) >> 21), 0) < this.b) {
         int var3 = this.g();
         if (var3 == 1) {
            if (this.b > 1) {
               this.g();
            }

            return true;
         }

         if (var3 > 0) {
            return true;
         }
      }

      return false;
   }

   private final boolean j() {
      riz var4;
      do {
         qyp var5 = this.f;

         while(true) {
            long var2 = var5.b;
            var4 = (riz)this.g.a((int)(2097151L & var2));
            if (var4 == null) {
               var4 = null;
               break;
            }

            int var1 = k(var4);
            if (var1 >= 0 && this.f.d(var2, 2097152L + var2 & -2097152L | (long)var1)) {
               var4.nextParkedWorker = a;
               break;
            }
         }

         if (var4 == null) {
            return false;
         }
      } while(!var4.a.c(-1, 0));

      LockSupport.unpark(var4);
      return true;
   }

   private static final int k(riz var0) {
      int var1;
      do {
         Object var2 = var0.nextParkedWorker;
         if (var2 == a) {
            return -1;
         }

         if (var2 == null) {
            return 0;
         }

         var0 = (riz)var2;
         var1 = var0.indexInArray;
      } while(var1 == 0);

      return var1;
   }

   public final void a(riz var1, int var2, int var3) {
      qyp var8 = this.f;

      int var4;
      long var6;
      do {
         var6 = var8.b;
         int var5 = (int)(2097151L & var6);
         var4 = var5;
         if (var5 == var2) {
            if (var3 == 0) {
               var4 = k(var1);
            } else {
               var4 = var3;
            }
         }
      } while(var4 < 0 || !this.f.d(var6, 2097152L + var6 & -2097152L | (long)var4));

   }

   public final void b() {
      if (!this.j()) {
         if (this.i(this.h.b)) {
            return;
         }

         this.j();
      }

   }

   public final boolean c() {
      return this.k.a();
   }

   public final void close() {
      if (this.k.b()) {
         riz var8 = this.h();
         rim var6 = this.g;
         synchronized(var6){}

         long var4;
         try {
            var4 = this.h.b;
         } finally {
            ;
         }

         int var2 = (int)(var4 & 2097151L);
         boolean var3;
         if (var2 > 0) {
            int var1 = 1;

            while(true) {
               Object var12 = this.g.a(var1);
               var12.getClass();
               riz var13 = (riz)var12;
               if (var13 != var8) {
                  while(var13.isAlive()) {
                     LockSupport.unpark(var13);
                     var13.join(10000L);
                  }

                  var3 = qzx.a;
                  fwf var7 = var13.e;
                  nlz var14 = this.j;
                  rje var9 = (rje)((qyq)var7.d).a((Object)null);
                  if (var9 != null) {
                     var14.j(var9);
                  }

                  while(true) {
                     var9 = var7.F();
                     if (var9 == null) {
                        break;
                     }

                     var14.j(var9);
                  }
               }

               if (var1 == var2) {
                  break;
               }

               ++var1;
            }
         }

         this.j.i();
         this.i.i();

         while(true) {
            rje var16;
            label113: {
               rje var15;
               if (var8 != null) {
                  var15 = var8.b(true);
                  var16 = var15;
                  if (var15 != null) {
                     break label113;
                  }
               }

               var15 = (rje)this.i.h();
               var16 = var15;
               if (var15 == null) {
                  var15 = (rje)this.j.h();
                  var16 = var15;
                  if (var15 == null) {
                     if (var8 != null) {
                        var8.d(5);
                     }

                     var3 = qzx.a;
                     this.f.b = 0L;
                     this.h.b = 0L;
                     return;
                  }
               }
            }

            f(var16);
         }
      }
   }

   public final void d(Runnable var1, rjf var2, boolean var3) {
      var2.getClass();
      long var7 = rjh.a;
      var7 = System.nanoTime();
      Object var10;
      if (var1 instanceof rje) {
         var10 = (rje)var1;
         ((rje)var10).g = var7;
         ((rje)var10).h = var2;
      } else {
         var10 = new rjg(var1, var7, var2);
      }

      boolean var4;
      riz var9;
      Object var11;
      label73: {
         var9 = this.h();
         var4 = true;
         if (var9 != null) {
            int var5 = var9.d;
            if (var5 != 5 && (((rje)var10).h.a != 0 || var5 != 2)) {
               var9.b = true;
               var11 = var9.e.D((rje)var10, var3);
               break label73;
            }
         }

         var11 = var10;
      }

      if (var11 != null) {
         boolean var6;
         if (((rje)var11).h.a == 1) {
            var6 = this.j.j(var11);
         } else {
            var6 = this.i.j(var11);
         }

         if (!var6) {
            throw new RejectedExecutionException(this.e.concat(" was terminated"));
         }
      }

      if (!var3 || var9 == null) {
         var4 = false;
      }

      if (((rje)var10).h.a == 0) {
         if (!var4) {
            this.b();
         }
      } else {
         var7 = this.h.a(2097152L);
         if (!var4 && !this.j() && !this.i(var7)) {
            this.j();
         }
      }
   }

   public final void execute(Runnable var1) {
      var1.getClass();
      e(this, var1, false, 6);
   }

   public final String toString() {
      ArrayList var16 = new ArrayList();
      int var13 = this.g.array.length();
      int var5 = 0;
      int var4 = 0;
      int var3 = 0;
      int var2 = 0;
      int var1 = 0;

      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      StringBuilder var20;
      for(var6 = 1; var6 < var13; var1 = var12) {
         riz var17 = (riz)this.g.a(var6);
         var7 = var5;
         var8 = var4;
         var9 = var3;
         var10 = var2;
         var12 = var1;
         if (var17 != null) {
            fwf var18 = var17.e;
            if (((qyq)var18.d).a != null) {
               var11 = var18.C() + 1;
            } else {
               var11 = var18.C();
            }

            var7 = var17.d;
            if (var7 == 0) {
               throw null;
            }

            switch(var7 - 1) {
            case 0:
               var20 = new StringBuilder();
               var20.append(var11);
               var20.append("c");
               var16.add(var20.toString());
               var7 = var5 + 1;
               var8 = var4;
               var9 = var3;
               var10 = var2;
               var12 = var1;
               break;
            case 1:
               var20 = new StringBuilder();
               var20.append(var11);
               var20.append("b");
               var16.add(var20.toString());
               var8 = var4 + 1;
               var7 = var5;
               var9 = var3;
               var10 = var2;
               var12 = var1;
               break;
            case 2:
               var9 = var3 + 1;
               var7 = var5;
               var8 = var4;
               var10 = var2;
               var12 = var1;
               break;
            case 3:
               ++var2;
               var7 = var5;
               var8 = var4;
               var9 = var3;
               var10 = var2;
               var12 = var1;
               if (var11 > 0) {
                  var20 = new StringBuilder();
                  var20.append(var11);
                  var20.append("d");
                  var16.add(var20.toString());
                  var7 = var5;
                  var8 = var4;
                  var9 = var3;
                  var10 = var2;
                  var12 = var1;
               }
               break;
            case 4:
               var12 = var1 + 1;
               var7 = var5;
               var8 = var4;
               var9 = var3;
               var10 = var2;
               break;
            default:
               var7 = var5;
               var8 = var4;
               var9 = var3;
               var10 = var2;
               var12 = var1;
            }
         }

         ++var6;
         var5 = var7;
         var4 = var8;
         var3 = var9;
         var2 = var10;
      }

      long var14 = this.h.b;
      String var19 = this.e;
      String var21 = qzy.b(this);
      var9 = this.b;
      var8 = this.c;
      var10 = this.i.g();
      var6 = this.j.g();
      var11 = this.b;
      var7 = (int)((var14 & 9223367638808264704L) >> 42);
      var20 = new StringBuilder();
      var20.append(var19);
      var20.append("@");
      var20.append(var21);
      var20.append("[Pool Size {core = ");
      var20.append(var9);
      var20.append(", max = ");
      var20.append(var8);
      var20.append("}, Worker States {CPU = ");
      var20.append(var5);
      var20.append(", blocking = ");
      var20.append(var4);
      var20.append(", parked = ");
      var20.append(var3);
      var20.append(", dormant = ");
      var20.append(var2);
      var20.append(", terminated = ");
      var20.append(var1);
      var20.append("}, running workers queues = ");
      var20.append(var16);
      var20.append(", global CPU queue size = ");
      var20.append(var10);
      var20.append(", global blocking queue size = ");
      var20.append(var6);
      var20.append(", Control State {created workers= ");
      var20.append((int)(var14 & 2097151L));
      var20.append(", blocking tasks = ");
      var20.append((int)((4398044413952L & var14) >> 21));
      var20.append(", CPUs acquired = ");
      var20.append(var11 - var7);
      var20.append("}]");
      return var20.toString();
   }
}
