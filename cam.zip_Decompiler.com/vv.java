import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

public final class vv implements AutoCloseable {
   public static final CancellationException a = new CancellationException();
   public final ArrayDeque b = new ArrayDeque();
   public boolean c;
   public long d = 1L;

   public final void a(long var1) {
      ArrayDeque var6 = this.b;
      synchronized(var6){}

      Throwable var10000;
      label836: {
         boolean var3;
         boolean var10001;
         try {
            var3 = this.c;
         } catch (Throwable var80) {
            var10000 = var80;
            var10001 = false;
            break label836;
         }

         if (var3) {
            return;
         }

         try {
            this.d += var1;
            var3 = this.b.isEmpty();
         } catch (Throwable var79) {
            var10000 = var79;
            var10001 = false;
            break label836;
         }

         ArrayList var4 = null;
         if (!var3) {
            ArrayList var5;
            try {
               var5 = new ArrayList();
            } catch (Throwable var77) {
               var10000 = var77;
               var10001 = false;
               break label836;
            }

            label820:
            while(true) {
               Object var7;
               bnc var8;
               while(true) {
                  try {
                     if (this.b.isEmpty()) {
                        break label820;
                     }

                     var7 = this.b.peek();
                     var7.getClass();
                     var8 = (bnc)var7;
                     if (!(((qza)var8.a).d() instanceof qzc) && !((qza)var8.a).v()) {
                        break;
                     }
                  } catch (Throwable var78) {
                     var10000 = var78;
                     var10001 = false;
                     break label836;
                  }

                  try {
                     this.b.remove();
                  } catch (Throwable var74) {
                     var10000 = var74;
                     var10001 = false;
                     break label836;
                  }
               }

               try {
                  var1 = Math.min(this.d, 1L);
               } catch (Throwable var76) {
                  var10000 = var76;
                  var10001 = false;
                  break label836;
               }

               if (var1 < 1L) {
                  break;
               }

               try {
                  this.d -= var1;
                  vu var86 = new vu(this, var1);
                  var8.b = var86;
                  var7 = this.b.remove();
                  var7.getClass();
                  var5.add(var7);
               } catch (Throwable var75) {
                  var10000 = var75;
                  var10001 = false;
                  break label836;
               }
            }

            try {
               var3 = var5.isEmpty();
            } catch (Throwable var73) {
               var10000 = var73;
               var10001 = false;
               break label836;
            }

            if (!var3) {
               var4 = var5;
            }
         }

         if (var4 != null) {
            Iterator var82 = var4.iterator();

            while(var82.hasNext()) {
               bnc var84 = (bnc)var82.next();
               Object var83 = var84.a;
               Object var85 = var84.b;
               var85.getClass();
               ((que)var83).gP(var85);
            }
         }

         return;
      }

      Throwable var81 = var10000;
      throw var81;
   }

   public final void close() {
      ArrayDeque var2 = this.b;
      synchronized(var2){}

      Throwable var10000;
      label107: {
         boolean var1;
         boolean var10001;
         try {
            var1 = this.c;
         } catch (Throwable var9) {
            var10000 = var9;
            var10001 = false;
            break label107;
         }

         if (var1) {
            return;
         }

         try {
            this.c = true;
         } catch (Throwable var8) {
            var10000 = var8;
            var10001 = false;
            break label107;
         }

         Iterator var10 = this.b.iterator();

         while(var10.hasNext()) {
            qwo.j((qza)((bnc)var10.next()).a);
         }

         this.b.clear();
         return;
      }

      Throwable var3 = var10000;
      throw var3;
   }
}
