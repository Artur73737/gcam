import android.view.Choreographer.FrameCallback;
import java.util.List;

public final class box implements FrameCallback, Runnable {
   final boy a;

   public box(boy var1) {
      this.a = var1;
   }

   public final void doFrame(long var1) {
      this.a.d.removeCallbacks(this);
      this.a.b();
      boy var7 = this.a;
      Object var6 = var7.e;
      synchronized(var6){}

      Throwable var10000;
      label113: {
         boolean var5;
         boolean var10001;
         try {
            var5 = var7.h;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label113;
         }

         if (!var5) {
            return;
         }

         int var3 = 0;

         List var8;
         try {
            var7.h = false;
            var8 = var7.f;
            var7.f = var7.g;
            var7.g = var8;
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            break label113;
         }

         for(int var4 = var8.size(); var3 < var4; ++var3) {
            ((FrameCallback)var8.get(var3)).doFrame(var1);
         }

         var8.clear();
         return;
      }

      Throwable var15 = var10000;
      throw var15;
   }

   public final void run() {
      this.a.b();
      boy var2 = this.a;
      Object var1 = var2.e;
      synchronized(var1){}

      try {
         if (var2.f.isEmpty()) {
            var2.c.removeFrameCallback(this);
            var2.h = false;
         }
      } finally {
         ;
      }

   }
}
