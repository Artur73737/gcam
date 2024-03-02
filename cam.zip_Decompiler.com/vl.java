import java.util.concurrent.ThreadFactory;

// $FF: synthetic class
public final class vl implements ThreadFactory {
   public final int a;
   public final ThreadFactory b;

   // $FF: synthetic method
   public vl(int var1, ThreadFactory var2) {
      this.a = var1;
      this.b = var2;
   }

   public final Thread newThread(Runnable var1) {
      int var4 = this.a;
      ThreadFactory var5 = this.b;
      int var2 = 0;

      while(true) {
         byte var3 = 10;
         if (var2 >= 10) {
            var2 = var3;
            break;
         }

         if (var4 >= vm.a[var2]) {
            ++var2;
            break;
         }

         ++var2;
      }

      Thread var6 = var5.newThread(new cdb(var4, var1, 1));
      var6.getClass();
      var6.setPriority(var2);
      return var6;
   }
}
