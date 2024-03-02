import android.content.Context;
import android.util.Base64;
import androidx.window.extensions.core.util.function.Consumer;
import java.lang.reflect.Method;
import java.nio.charset.Charset;

public final class cyq extends qwq implements qvi {
   final Object a;
   private final int b;

   public cyq(Object var1, int var2) {
      super(0);
      this.b = var2;
      this.a = var1;
   }

   // $FF: synthetic method
   public final Object a() {
      int var1 = this.b;
      boolean var2 = true;
      boolean var3 = true;
      Method var19;
      switch(var1) {
      case 0:
         var19 = ((gfv)((ve)this.a).c).t().getMethod("getWindowLayoutComponent");
         Class var17 = ((ve)this.a).e();
         var19.getClass();
         if (!cwm.e(var19) || !cwm.d(var19, var17)) {
            var2 = false;
         }

         return var2;
      case 1:
         Class var16 = ((ve)this.a).e();
         Method var14 = var16.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
         var19 = var16.getMethod("removeWindowLayoutInfoListener", Consumer.class);
         var14.getClass();
         if (cwm.e(var14)) {
            var19.getClass();
            if (cwm.e(var19)) {
               var2 = var3;
               return var2;
            }
         }

         var2 = false;
         return var2;
      case 2:
         return new dbt[((ree[])this.a).length];
      case 3:
         return ((mss)this.a).c();
      case 4:
         Object var12 = this.a;
         Charset var15 = qyk.a;
         return new String((byte[])var12, var15);
      case 5:
         return Base64.encodeToString((byte[])this.a, 11);
      case 6:
         Object var13 = this.a;
         qzr var10 = rah.b;
         return qzy.k((qui)((otw)var13).e(var10));
      case 7:
         obw var5 = (obw)this.a;
         String var6 = var5.g;
         qcq var4 = null;
         if (var6 != null && var5.h != null) {
            qfi var9 = qcq.d.O();
            String var8 = var5.g;
            if (!var9.b.ad()) {
               var9.p();
            }

            qfn var18 = var9.b;
            qcq var7 = (qcq)var18;
            var8.getClass();
            var7.a |= 1;
            var7.b = var8;
            String var11 = var5.h;
            if (!var18.ad()) {
               var9.p();
            }

            qcq var20 = (qcq)var9.b;
            var11.getClass();
            var20.a |= 2;
            var20.c = var11;
            var4 = (qcq)var9.i();
         }

         return var4;
      case 8:
         return ((oag)this.a).j.d;
      case 9:
         return ((oag)this.a).j.e;
      default:
         return dbu.d((Context)this.a);
      }
   }
}
