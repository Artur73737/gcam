import java.util.List;
import java.util.Set;

@qus(
   b = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2",
   c = "Recomposer.kt",
   d = "invokeSuspend",
   e = {536, 547}
)
public final class aun extends quw implements qvy {
   Object a;
   Object b;
   Object c;
   Object d;
   Object e;
   Object f;
   Object g;
   int h;
   Object i;
   final auo j;

   public aun(auo var1, que var2) {
      super(3, var2);
      this.j = var1;
   }

   public static final void d(List var0, List var1, List var2, Set var3, Set var4, axb var5, axb var6) {
      var0.clear();
      var1.clear();
      var2.clear();
      var3.clear();
      var4.clear();
      var5.clear();
      var6.clear();
   }

   public static final void e(List var0, auo var1) {
      var0.clear();
      Object var4 = var1.c;
      synchronized(var4){}

      Throwable var10000;
      label149: {
         boolean var10001;
         int var3;
         List var5;
         try {
            var5 = var1.h;
            var3 = var5.size();
         } catch (Throwable var17) {
            var10000 = var17;
            var10001 = false;
            break label149;
         }

         for(int var2 = 0; var2 < var3; ++var2) {
            try {
               var0.add((ezu)var5.get(var2));
            } catch (Throwable var16) {
               var10000 = var16;
               var10001 = false;
               break label149;
            }
         }

         label132:
         try {
            var1.h.clear();
            return;
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label132;
         }
      }

      Throwable var18 = var10000;
      throw var18;
   }

   public final Object b(Object param1) {
      // $FF: Couldn't be decompiled
   }
}
