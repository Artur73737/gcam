import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;

public final class cnb {
   public static final cno a = new cna();
   public static final cno b = new cna();
   public static final cno c = new cna();

   public static final cmx a(cnp var0) {
      cry var4 = (cry)var0.a(a);
      if (var4 != null) {
         cnm var1 = (cnm)var0.a(b);
         if (var1 != null) {
            Bundle var3 = (Bundle)var0.a(c);
            String var2 = (String)var0.a(cnk.d);
            if (var2 != null) {
               crw var6 = var4.getSavedStateRegistry().d();
               cnc var7;
               if (var6 instanceof cnc) {
                  var7 = (cnc)var6;
               } else {
                  var7 = null;
               }

               if (var7 != null) {
                  cnd var12 = b(var1);
                  cmx var8 = (cmx)var12.a.get(var2);
                  cmx var9;
                  if (var8 == null) {
                     Class[] var10 = cmx.a;
                     var7.b();
                     Bundle var11 = var7.a;
                     if (var11 != null) {
                        var11 = var11.getBundle(var2);
                     } else {
                        var11 = null;
                     }

                     Bundle var5 = var7.a;
                     if (var5 != null) {
                        var5.remove(var2);
                     }

                     var5 = var7.a;
                     if (var5 != null && var5.isEmpty()) {
                        var7.a = null;
                     }

                     var9 = civ.e(var11, var3);
                     var12.a.put(var2, var9);
                  } else {
                     var9 = var8;
                  }

                  return var9;
               } else {
                  throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
               }
            } else {
               throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
         } else {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
         }
      } else {
         throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
      }
   }

   public static final cnd b(cnm var0) {
      ArrayList var1 = new ArrayList();
      bwb var2 = bwb.c;
      var1.add(new ebt(((qwj)qxa.a(cnd.class)).d, var2));
      ebt[] var4 = (ebt[])var1.toArray(new ebt[0]);
      cnq var5 = new cnq((ebt[])Arrays.copyOf(var4, var4.length));
      gfv var6 = var0.getViewModelStore$ar$class_merging$ar$class_merging$ar$class_merging$ar$class_merging();
      cnp var3 = cmt.b(var0);
      var6.getClass();
      var3.getClass();
      return (cnd)clu.d("androidx.lifecycle.internal.SavedStateHandlesVM", cnd.class, var6, var5, var3);
   }

   public static final void c(cry var0) {
      clw var1 = var0.getLifecycle().b;
      if (var1 != clw.b && var1 != clw.c) {
         throw new IllegalArgumentException("Failed requirement.");
      } else if (var0.getSavedStateRegistry().d() == null) {
         cnc var2 = new cnc(var0.getSavedStateRegistry(), (cnm)var0);
         var0.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider", var2);
         var0.getLifecycle().a(new cmy(var2, 0));
      }
   }
}
