import android.content.Intent;
import android.content.res.Resources.NotFoundException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

public final class cwl extends qwq implements qvt {
   final byn a;
   final Intent b;
   final lkv c;
   final ddb d;
   final ve e;

   public cwl(ddb var1, byn var2, lkv var3, ve var4, Intent var5) {
      super(1);
      this.d = var1;
      this.a = var2;
      this.c = var3;
      this.e = var4;
      this.b = var5;
   }

   // $FF: synthetic method
   public final Object eo(Object var1) {
      List var2 = (List)var1;
      if (var2.size() == 0) {
         this.d.c(new NotFoundException("No devices connected"));
      } else {
         cwi var7 = new cwi(this.a, var2.size());
         Iterator var3 = var2.iterator();

         while(var3.hasNext()) {
            maf var8 = (maf)var3.next();
            lkv var4 = this.c;
            String var6 = var8.a;
            lmx var5 = lmy.a();
            var5.a = new lpc(var6, 5);
            var5.b = new ljt[]{lxg.c};
            var5.c = 24023;
            lwa var9 = var4.d(var5.a());
            var9.k((Executor)this.e.b, new cwj(new adi(this.d, this.b, var7, var8, 3), 0));
            var9.j((Executor)this.e.b, new cwk(this.d, 0));
         }
      }

      return qsn.a;
   }
}
