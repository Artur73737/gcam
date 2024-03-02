import android.content.ComponentCallbacks;
import android.content.Context;

public final class aaj implements ath {
   final Object a;
   final Object b;
   private final int c;

   public aaj(Object var1, Object var2, int var3) {
      this.c = var3;
      this.b = var1;
      this.a = var2;
   }

   public aaj(jed var1, Object var2, int var3) {
      this.c = var3;
      this.a = var1;
      this.b = var2;
   }

   public final void a() {
      Object var1;
      Object var2;
      switch(this.c) {
      case 0:
         var1 = this.a;
         var2 = this.b;
         var2.getClass();
         aad var4 = ((duu)var2).a();
         if (var4 != null) {
            aaf var5 = var4.a;
            ((jed)var1).i(var5);
         }

         return;
      case 1:
         var1 = this.b;
         var2 = this.a;
         var2.getClass();
         ((azw)((jed)var1).c).remove(var2);
         return;
      case 2:
         var2 = this.a;
         aaf var3 = (aaf)this.b;
         ((jed)var2).i(var3);
         return;
      case 3:
         ((ald)this.b).c.add(this.a);
         return;
      case 4:
         var1 = this.b;
         var2 = this.a;
         ((cmk)var1).g((cmm)var2);
         return;
      default:
         ((Context)this.b).getApplicationContext().unregisterComponentCallbacks((ComponentCallbacks)this.a);
      }
   }
}
