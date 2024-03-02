import java.util.HashMap;
import java.util.Map;

public final class alf implements ako {
   public final Object[] a;
   public final int c;
   private final Map d;

   public alf(qxq var1, lmk var2) {
      var1.getClass();
      var2.getClass();
      super();
      Object var10 = var2.a;
      int var3 = var1.a;
      if (var3 < 0) {
         IllegalStateException var9 = new IllegalStateException("negative nearestRange.first");
         throw var9;
      } else {
         int var4 = var1.b;
         ip var11 = (ip)var10;
         int var5 = Math.min(var4, var11.a - 1);
         if (var5 < var3) {
            this.d = qtg.a;
            this.a = new Object[0];
            this.c = 0;
         } else {
            this.a = new Object[var5 - var3 + 1];
            this.c = var3;
            HashMap var7 = new HashMap();
            ale var8 = new ale(var3, var5, var7, this);
            var11.j(var3);
            var11.j(var5);
            if (var5 < var3) {
               throw new IllegalArgumentException(c.aJ((byte)41, var3, var5, "toIndex (", ") should be not smaller than fromIndex ("));
            } else {
               var3 = hf.d((axf)var11.b, var3);

               for(var4 = ((iyq)((axf)var11.b).a[var3]).b; var4 <= var5; ++var3) {
                  iyq var6 = (iyq)((axf)var11.b).a[var3];
                  var8.eo(var6);
                  var4 += var6.a;
               }

               this.d = var7;
            }
         }
      }
   }

   public final int a(Object var1) {
      var1.getClass();
      Object var2 = this.d.get(var1);
      var1 = var2;
      if (var2 == null) {
         var1 = -1;
      }

      return ((Number)var1).intValue();
   }
}
