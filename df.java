import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;

public final class df implements clr, cry, cnm {
   public clx a = null;
   public ebo b = null;
   private final bv c;
   private final Runnable d;
   private cnj e;
   private final gfv f;

   public df(bv var1, gfv var2, Runnable var3) {
      this.c = var1;
      this.f = var2;
      this.d = var3;
   }

   public final void a(clv var1) {
      this.a.b(var1);
   }

   final void b() {
      if (this.a == null) {
         this.a = new clx(this);
         ebo var1 = cbt.d(this);
         this.b = var1;
         var1.g();
         this.d.run();
      }

   }

   public final cnp getDefaultViewModelCreationExtras() {
      Context var1 = this.c.requireContext().getApplicationContext();

      Application var3;
      while(true) {
         if (!(var1 instanceof ContextWrapper)) {
            var3 = null;
            break;
         }

         if (var1 instanceof Application) {
            var3 = (Application)var1;
            break;
         }

         var1 = ((ContextWrapper)var1).getBaseContext();
      }

      cnr var2 = new cnr();
      if (var3 != null) {
         var2.b(cni.b, var3);
      }

      var2.b(cnb.a, this.c);
      var2.b(cnb.b, this);
      Bundle var4 = this.c.l;
      if (var4 != null) {
         var2.b(cnb.c, var4);
      }

      return var2;
   }

   public final cnj getDefaultViewModelProviderFactory() {
      cnj var1 = this.c.getDefaultViewModelProviderFactory();
      if (!var1.equals(this.c.aa)) {
         this.e = var1;
         return var1;
      } else {
         if (this.e == null) {
            Context var3 = this.c.requireContext().getApplicationContext();

            Application var4;
            while(true) {
               if (!(var3 instanceof ContextWrapper)) {
                  var4 = null;
                  break;
               }

               if (var3 instanceof Application) {
                  var4 = (Application)var3;
                  break;
               }

               var3 = ((ContextWrapper)var3).getBaseContext();
            }

            bv var2 = this.c;
            this.e = new cne(var4, var2, var2.l);
         }

         return this.e;
      }
   }

   public final clx getLifecycle() {
      this.b();
      return this.a;
   }

   public final crx getSavedStateRegistry() {
      this.b();
      return (crx)this.b.b;
   }

   public final gfv getViewModelStore$ar$class_merging$ar$class_merging$ar$class_merging$ar$class_merging() {
      this.b();
      return this.f;
   }
}
