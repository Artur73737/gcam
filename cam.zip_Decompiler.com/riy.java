import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

final class riy extends rhv {
   public static final riy a = new riy();
   private static final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
   private static final WeakHashMap c = new WeakHashMap();

   private riy() {
   }

   public final qvt a(Class var1) {
      var1.getClass();
      ReentrantReadWriteLock var8 = b;
      ReadLock var7 = var8.readLock();
      var7.lock();

      qvt var9;
      try {
         var9 = (qvt)c.get(var1);
      } finally {
         var7.unlock();
      }

      if (var9 != null) {
         return var9;
      } else {
         var7 = var8.readLock();
         int var2 = var8.getWriteHoldCount();
         byte var4 = 0;
         byte var5 = 0;
         byte var6 = 0;
         if (var2 == 0) {
            var2 = var8.getReadHoldCount();
         } else {
            var2 = 0;
         }

         int var3;
         for(var3 = 0; var3 < var2; ++var3) {
            var7.unlock();
         }

         WriteLock var24 = var8.writeLock();
         var24.lock();

         Throwable var10000;
         label313: {
            qvt var10;
            boolean var10001;
            WeakHashMap var25;
            try {
               var25 = c;
               var10 = (qvt)var25.get(var1);
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label313;
            }

            if (var10 != null) {
               for(var3 = var6; var3 < var2; ++var3) {
                  var7.lock();
               }

               var24.unlock();
               return var10;
            }

            try {
               var10 = rhy.a(var1);
               var25.put(var1, var10);
            } catch (Throwable var21) {
               var10000 = var21;
               var10001 = false;
               break label313;
            }

            for(var3 = var4; var3 < var2; ++var3) {
               var7.lock();
            }

            var24.unlock();
            return var10;
         }

         Throwable var23 = var10000;

         for(var3 = var5; var3 < var2; ++var3) {
            var7.lock();
         }

         var24.unlock();
         throw var23;
      }
   }
}
