import java.util.Iterator;

public final class cls implements crv {
   public final void a(cry var1) {
      if (!(var1 instanceof cnm)) {
         IllegalStateException var6 = new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
         throw var6;
      } else {
         gfv var5 = ((cnm)var1).getViewModelStore$ar$class_merging$ar$class_merging$ar$class_merging$ar$class_merging();
         crx var3 = var1.getSavedStateRegistry();
         Iterator var4 = var5.y().iterator();

         while(var4.hasNext()) {
            cnh var2 = var5.x((String)var4.next());
            var2.getClass();
            cir.e(var2, var3, var1.getLifecycle());
         }

         if (!var5.y().isEmpty()) {
            var3.c(cls.class);
         }

      }
   }
}
