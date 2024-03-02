import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;

public final class boy extends qzr {
   public static final qsd a;
   public static final ThreadLocal b;
   public final Choreographer c;
   public final Handler d;
   public final Object e;
   public List f;
   public List g;
   public boolean h;
   public final box i;
   public final atr j;
   private final qtd m;
   private boolean n;

   static {
      a = pwm.bt(bor.h);
      b = new bow();
   }

   public boy(Choreographer var1, Handler var2) {
      this.c = var1;
      this.d = var2;
      this.e = new Object();
      this.m = new qtd();
      this.f = new ArrayList();
      this.g = new ArrayList();
      this.i = new box(this);
      this.j = new bpa(var1, this, 0);
   }

   private final Runnable g() {
      Object var2 = this.e;
      synchronized(var2){}

      Throwable var10000;
      label116: {
         boolean var10001;
         Object var15;
         label115: {
            label114: {
               qtd var1;
               try {
                  var1 = this.m;
                  if (var1.isEmpty()) {
                     break label114;
                  }
               } catch (Throwable var14) {
                  var10000 = var14;
                  var10001 = false;
                  break label116;
               }

               try {
                  var15 = var1.e();
                  break label115;
               } catch (Throwable var13) {
                  var10000 = var13;
                  var10001 = false;
                  break label116;
               }
            }

            var15 = null;
         }

         label107:
         try {
            Runnable var17 = (Runnable)var15;
            return var17;
         } catch (Throwable var12) {
            var10000 = var12;
            var10001 = false;
            break label107;
         }
      }

      Throwable var16 = var10000;
      throw var16;
   }

   public final void a(qui var1, Runnable var2) {
      var1.getClass();
      Object var5 = this.e;
      synchronized(var5){}

      try {
         this.m.f(var2);
         if (!this.n) {
            this.n = true;
            this.d.post(this.i);
            if (!this.h) {
               this.h = true;
               this.c.postFrameCallback(this.i);
            }
         }
      } finally {
         ;
      }

   }

   public final void b() {
      boolean var1;
      do {
         for(Runnable var2 = this.g(); var2 != null; var2 = this.g()) {
            var2.run();
         }

         Object var10 = this.e;
         synchronized(var10){}

         Throwable var10000;
         label114: {
            label126: {
               boolean var10001;
               try {
                  if (!this.m.isEmpty()) {
                     break label126;
                  }
               } catch (Throwable var9) {
                  var10000 = var9;
                  var10001 = false;
                  break label114;
               }

               var1 = false;

               try {
                  this.n = false;
                  continue;
               } catch (Throwable var8) {
                  var10000 = var8;
                  var10001 = false;
                  break label114;
               }
            }

            var1 = true;
            continue;
         }

         Throwable var3 = var10000;
         throw var3;
      } while(var1);

   }
}
