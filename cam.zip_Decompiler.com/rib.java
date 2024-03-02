public final class rib extends qzr implements Runnable, rac {
   private final qzr a;
   private final int b;
   private final rac c;
   private final Object d;
   private final nlz e;
   private volatile int runningWorkers;

   public rib(qzr var1, int var2) {
      this.a = var1;
      this.b = var2;
      this.c = raa.a;
      this.e = new nlz((byte[])null, (char[])null);
      this.d = new Object();
   }

   private final boolean b(Runnable var1) {
      this.e.j(var1);
      return this.runningWorkers >= this.b;
   }

   private final boolean h() {
      Object var3 = this.d;
      synchronized(var3){}

      Throwable var10000;
      label78: {
         int var1;
         boolean var10001;
         int var2;
         try {
            var1 = this.runningWorkers;
            var2 = this.b;
         } catch (Throwable var10) {
            var10000 = var10;
            var10001 = false;
            break label78;
         }

         if (var1 >= var2) {
            return false;
         }

         try {
            ++this.runningWorkers;
         } catch (Throwable var9) {
            var10000 = var9;
            var10001 = false;
            break label78;
         }

         return true;
      }

      Throwable var4 = var10000;
      throw var4;
   }

   public final void a(qui var1, Runnable var2) {
      var1.getClass();
      if (!this.b(var2) && this.h()) {
         this.a.a(this, this);
      }

   }

   public final void c(long var1, qza var3) {
      this.c.c(var1, var3);
   }

   public final void e(qui var1, Runnable var2) {
      if (!this.b(var2) && this.h()) {
         this.a.e(this, this);
      }

   }

   public final raj g(long var1, Runnable var3, qui var4) {
      var4.getClass();
      return this.c.g(var1, var3, var4);
   }

   public final void run() {
      int var1 = 0;

      while(true) {
         while(true) {
            Runnable var3 = (Runnable)this.e.h();
            if (var3 == null) {
               Object var4 = this.d;
               synchronized(var4){}

               label181: {
                  Throwable var10000;
                  label191: {
                     boolean var10001;
                     try {
                        --this.runningWorkers;
                        var1 = this.e.g();
                     } catch (Throwable var16) {
                        var10000 = var16;
                        var10001 = false;
                        break label191;
                     }

                     if (var1 == 0) {
                        return;
                     }

                     label176:
                     try {
                        ++this.runningWorkers;
                        break label181;
                     } catch (Throwable var15) {
                        var10000 = var15;
                        var10001 = false;
                        break label176;
                     }
                  }

                  Throwable var17 = var10000;
                  throw var17;
               }

               var1 = 0;
            } else {
               label168:
               try {
                  var3.run();
               } catch (Throwable var14) {
                  qwp.G(quj.a, var14);
                  break label168;
               }

               int var2 = var1 + 1;
               var1 = var2;
               if (var2 >= 16) {
                  this.a.f(this);
                  this.a.a(this, this);
                  return;
               }
            }
         }
      }
   }
}
