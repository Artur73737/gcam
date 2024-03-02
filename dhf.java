import com.google.android.libraries.oliveoil.bufferflinger.aUnT.DHwXNavBkqbhR;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class dhf implements psd {
   static final boolean a;
   static final dgw b;
   public static final Object c;
   private static final Logger g;
   volatile Object d;
   volatile dha e;
   volatile dhe f;

   static {
      // $FF: Couldn't be decompiled
   }

   protected dhf() {
   }

   static Object a(psd param0) {
      // $FF: Couldn't be decompiled
   }

   static void b(dhf var0) {
      dhe var2 = null;
      dhf var1 = var0;
      dha var4 = var2;

      label52:
      while(true) {
         do {
            var2 = var1.f;
         } while(!b.e(var1, var2, dhe.a));

         for(; var2 != null; var2 = var2.c) {
            Thread var3 = var2.b;
            if (var3 != null) {
               var2.b = null;
               LockSupport.unpark(var3);
            }
         }

         dha var6;
         do {
            var6 = var1.e;
         } while(!b.c(var1, var6, dha.a));

         dha var5 = var6;

         while(true) {
            var6 = var5;
            var5 = var4;
            if (var6 == null) {
               for(; var5 != null; var5 = var4) {
                  var4 = var5.d;
                  Runnable var8 = var5.b;
                  if (var8 instanceof dhc) {
                     dhc var7 = (dhc)var8;
                     var1 = var7.a;
                     if (var1.d == var7) {
                        Object var9 = a(var7.b);
                        if (b.d(var1, var7, var9)) {
                           continue label52;
                        }
                     }
                  } else {
                     k(var8, var5.c);
                  }
               }

               return;
            }

            var5 = var6.d;
            var6.d = var4;
            var4 = var6;
         }
      }
   }

   static void d(Object var0) {
      if (var0 == null) {
         throw null;
      }
   }

   public static dhf g() {
      return new dhf();
   }

   private final String i(Object var1) {
      return var1 == this ? "this future" : String.valueOf(var1);
   }

   private final void j(StringBuilder var1) {
      try {
         Object var2 = c.B(this);
         var1.append("SUCCESS, result=[");
         var1.append(this.i(var2));
         var1.append("]");
      } catch (ExecutionException var3) {
         var1.append("FAILURE, cause=[");
         var1.append(var3.getCause());
         var1.append("]");
      } catch (CancellationException var4) {
         var1.append("CANCELLED");
      } catch (RuntimeException var5) {
         var1.append("UNKNOWN, cause=[");
         var1.append(var5.getClass());
         var1.append(" thrown from get()]");
      }
   }

   private static void k(Runnable var0, Executor var1) {
      try {
         var1.execute(var0);
      } catch (RuntimeException var3) {
         g.log(Level.SEVERE, c.aH(var1, var0, "RuntimeException while executing runnable ", " with executor "), var3);
      }
   }

   private final void l(dhe var1) {
      var1.b = null;

      label29:
      while(true) {
         var1 = this.f;
         if (var1 == dhe.a) {
            return;
         }

         dhe var2;
         for(dhe var3 = null; var1 != null; var3 = var2) {
            dhe var4 = var1.c;
            if (var1.b != null) {
               var2 = var1;
            } else if (var3 != null) {
               var3.c = var4;
               var2 = var3;
               if (var3.b == null) {
                  continue label29;
               }
            } else {
               var2 = var3;
               if (!b.e(this, var1, var4)) {
                  continue label29;
               }
            }

            var1 = var4;
         }

         return;
      }
   }

   private static final Object m(Object var0) {
      if (!(var0 instanceof dgx)) {
         if (!(var0 instanceof dgz)) {
            Object var3 = var0;
            if (var0 == c) {
               var3 = null;
            }

            return var3;
         } else {
            throw new ExecutionException(((dgz)var0).b);
         }
      } else {
         Throwable var1 = ((dgx)var0).d;
         CancellationException var2 = new CancellationException("Task was cancelled.");
         var2.initCause(var1);
         throw var2;
      }
   }

   public final void c(Runnable var1, Executor var2) {
      d(var2);
      dha var3 = this.e;
      if (var3 != dha.a) {
         dha var5 = new dha(var1, var2);

         dha var4;
         do {
            var5.d = var3;
            if (b.c(this, var3, var5)) {
               return;
            }

            var4 = this.e;
            var3 = var4;
         } while(var4 != dha.a);
      }

      k(var1, var2);
   }

   public final boolean cancel(boolean var1) {
      Object var6 = this.d;
      boolean var4 = var6 instanceof dhc;
      boolean var3 = false;
      boolean var2;
      if (var6 == null) {
         var2 = true;
      } else {
         var2 = false;
      }

      if (var4 | var2) {
         dgx var5;
         if (a) {
            var5 = new dgx(var1, new CancellationException("Future.cancel() was called."));
         } else if (var1) {
            var5 = dgx.a;
         } else {
            var5 = dgx.b;
         }

         var3 = false;
         Object var7 = this;

         label49:
         while(true) {
            while(true) {
               dgw var9 = b;
               dhf var8 = (dhf)var7;
               if (var9.d(var8, var6, var5)) {
                  b(var8);
                  if (!(var6 instanceof dhc)) {
                     break label49;
                  }

                  var7 = ((dhc)var6).b;
                  if (!(var7 instanceof dhf)) {
                     ((psd)var7).cancel(var1);
                     break label49;
                  }

                  var6 = ((dhf)var7).d;
                  if (var6 == null) {
                     var2 = true;
                  } else {
                     var2 = false;
                  }

                  if (!(var2 | var6 instanceof dhc)) {
                     var1 = true;
                     return var1;
                  }

                  var3 = true;
               } else {
                  Object var10 = var8.d;
                  var6 = var10;
                  if (!(var10 instanceof dhc)) {
                     var1 = var3;
                     return var1;
                  }
               }
            }
         }

         var1 = true;
      } else {
         var1 = var3;
      }

      return var1;
   }

   public final void e(Throwable var1) {
      dgz var2 = new dgz(var1);
      if (b.d(this, (Object)null, var2)) {
         b(this);
      }

   }

   public final void f(psd var1) {
      d(var1);
      Object var2 = this.d;
      if (var2 == null) {
         if (var1.isDone()) {
            Object var11 = a(var1);
            if (b.d(this, (Object)null, var11)) {
               b(this);
               return;
            }

            return;
         }

         dhc var12 = new dhc(this, var1);
         if (b.d(this, (Object)null, var12)) {
            try {
               var1.c(var12, dhg.a);
               return;
            } catch (Throwable var9) {
               Throwable var3 = var9;

               dgz var10;
               try {
                  var10 = new dgz(var3);
               } finally {
                  ;
               }

               b.d(this, var12, var10);
               return;
            }
         }

         var2 = this.d;
      }

      if (var2 instanceof dgx) {
         var1.cancel(((dgx)var2).c);
      }
   }

   public final Object get() {
      if (!Thread.interrupted()) {
         Object var5 = this.d;
         boolean var1;
         if (var5 != null) {
            var1 = true;
         } else {
            var1 = false;
         }

         if (var1 & (var5 instanceof dhc ^ true)) {
            return m(var5);
         } else {
            dhe var6 = this.f;
            if (var6 != dhe.a) {
               dhe var4 = new dhe();

               dhe var3;
               do {
                  var4.a(var6);
                  if (b.e(this, var6, var4)) {
                     do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                           this.l(var4);
                           throw new InterruptedException();
                        }

                        var5 = this.d;
                        if (var5 != null) {
                           var1 = true;
                        } else {
                           var1 = false;
                        }
                     } while(!(var1 & (var5 instanceof dhc ^ true)));

                     return m(var5);
                  }

                  var3 = this.f;
                  var6 = var3;
               } while(var3 != dhe.a);
            }

            return m(this.d);
         }
      } else {
         InterruptedException var2 = new InterruptedException();
         throw var2;
      }
   }

   public final Object get(long var1, TimeUnit var3) {
      long var6 = var3.toNanos(var1);
      if (!Thread.interrupted()) {
         Object var10 = this.d;
         boolean var5 = true;
         boolean var4;
         if (var10 != null) {
            var4 = true;
         } else {
            var4 = false;
         }

         if (var4 & (var10 instanceof dhc ^ true)) {
            return m(var10);
         } else {
            long var8;
            if (var6 > 0L) {
               var8 = System.nanoTime() + var6;
            } else {
               var8 = 0L;
            }

            if (var6 >= 1000L) {
               dhe var16 = this.f;
               if (var16 == dhe.a) {
                  return m(this.d);
               }

               dhe var12 = new dhe();

               while(true) {
                  var12.a(var16);
                  if (b.e(this, var16, var12)) {
                     do {
                        LockSupport.parkNanos(this, var6);
                        if (Thread.interrupted()) {
                           this.l(var12);
                           throw new InterruptedException();
                        }

                        var10 = this.d;
                        if (var10 != null) {
                           var4 = true;
                        } else {
                           var4 = false;
                        }

                        if (var4 & (var10 instanceof dhc ^ true)) {
                           return m(var10);
                        }

                        var6 = var8 - System.nanoTime();
                     } while(var6 >= 1000L);

                     this.l(var12);
                     break;
                  }

                  dhe var11 = this.f;
                  var16 = var11;
                  if (var11 == dhe.a) {
                     return m(this.d);
                  }
               }
            }

            while(var6 > 0L) {
               var10 = this.d;
               if (var10 != null) {
                  var4 = true;
               } else {
                  var4 = false;
               }

               if (var4 & (var10 instanceof dhc ^ true)) {
                  return m(var10);
               }

               if (Thread.interrupted()) {
                  throw new InterruptedException();
               }

               var6 = var8 - System.nanoTime();
            }

            String var17 = this.toString();
            String var20 = var3.toString().toLowerCase(Locale.ROOT);
            StringBuilder var18 = new StringBuilder();
            var18.append("Waited ");
            var18.append(var1);
            var18.append(" ");
            var18.append(var3.toString().toLowerCase(Locale.ROOT));
            String var19 = var18.toString();
            String var15;
            if (var6 + 1000L < 0L) {
               var19 = var19.concat(" (plus ");
               var6 = -var6;
               var1 = var3.convert(var6, TimeUnit.NANOSECONDS);
               var6 -= var3.toNanos(var1);
               if (var1 != 0L) {
                  if (var6 > 1000L) {
                     var4 = var5;
                  } else {
                     var4 = false;
                  }
               } else {
                  var4 = var5;
               }

               if (var1 > 0L) {
                  StringBuilder var14 = new StringBuilder();
                  var14.append(var19);
                  var14.append(var1);
                  var14.append(" ");
                  var14.append(var20);
                  var19 = var14.toString();
                  var15 = var19;
                  if (var4) {
                     var15 = var19.concat(DHwXNavBkqbhR.PuhecPCZiZDn);
                  }

                  var15 = var15.concat(" ");
               } else {
                  var15 = var19;
               }

               var19 = var15;
               if (var4) {
                  var18 = new StringBuilder();
                  var18.append(var15);
                  var18.append(var6);
                  var18.append(" nanoseconds ");
                  var19 = var18.toString();
               }

               var15 = var19.concat("delay)");
            } else {
               var15 = var19;
            }

            if (this.isDone()) {
               throw new TimeoutException(var15.concat(" but future completed as timeout expired"));
            } else {
               var18 = new StringBuilder();
               var18.append(var15);
               var18.append(" for ");
               var18.append(var17);
               throw new TimeoutException(var18.toString());
            }
         }
      } else {
         InterruptedException var13 = new InterruptedException();
         throw var13;
      }
   }

   public final void h(Object var1) {
      Object var2 = var1;
      if (var1 == null) {
         var2 = c;
      }

      if (b.d(this, (Object)null, var2)) {
         b(this);
      }

   }

   public final boolean isCancelled() {
      return this.d instanceof dgx;
   }

   public final boolean isDone() {
      Object var3 = this.d;
      boolean var2 = var3 instanceof dhc;
      boolean var1;
      if (var3 != null) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1 & (var2 ^ true);
   }

   public final String toString() {
      StringBuilder var2 = new StringBuilder();
      var2.append(super.toString());
      var2.append("[status=");
      if (this.isCancelled()) {
         var2.append("CANCELLED");
      } else if (this.isDone()) {
         this.j(var2);
      } else {
         String var5;
         label32: {
            try {
               Object var6 = this.d;
               if (var6 instanceof dhc) {
                  StringBuilder var7 = new StringBuilder();
                  var7.append("setFuture=[");
                  var7.append(this.i(((dhc)var6).b));
                  var7.append("]");
                  var5 = var7.toString();
                  break label32;
               }
            } catch (RuntimeException var4) {
               StringBuilder var1 = new StringBuilder();
               var1.append("Exception thrown from implementation: ");
               Class var3 = var4.getClass();
               var1.append(var3);
               var5 = "Exception thrown from implementation: ".concat(String.valueOf(var3));
               break label32;
            }

            var5 = null;
         }

         if (var5 != null && !var5.isEmpty()) {
            var2.append("PENDING, info=[");
            var2.append(var5);
            var2.append("]");
         } else if (this.isDone()) {
            this.j(var2);
         } else {
            var2.append("PENDING");
         }
      }

      var2.append("]");
      return var2.toString();
   }
}
