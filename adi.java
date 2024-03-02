import android.content.Intent;
import android.os.ResultReceiver;

public final class adi extends qwq implements qvt {
   final Object a;
   final Object b;
   final Object c;
   final Object d;
   private final int e;

   public adi(azc var1, String var2, avi var3, avi var4, int var5) {
      super(1);
      this.e = var5;
      this.a = var1;
      this.c = var2;
      this.d = var3;
      this.b = var4;
   }

   public adi(ddb var1, Intent var2, cwi var3, maf var4, int var5) {
      super(1);
      this.e = var5;
      this.a = var1;
      this.d = var2;
      this.b = var3;
      this.c = var4;
   }

   public adi(qww var1, afj var2, qww var3, ip var4, int var5) {
      super(1);
      this.e = var5;
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public adi(yt var1, zc var2, qvt var3, qwv var4, int var5) {
      super(1);
      this.e = var5;
      this.d = var1;
      this.b = var2;
      this.a = var3;
      this.c = var4;
   }

   // $FF: synthetic method
   public final Object eo(Object var1) {
      Object var5;
      Object var6;
      String var10;
      za var12;
      switch(this.e) {
      case 0:
         var12 = (za)var1;
         var12.getClass();
         float var3 = ((Number)var12.a()).floatValue() - ((qww)this.a).a;
         float var2 = ((afj)this.b).a(var3);
         var5 = this.a;
         float var4 = ((Number)var12.a()).floatValue();
         ((qww)var5).a = var4;
         var5 = this.c;
         var4 = ((Number)((qvt)var12.f.b).eo(var12.c)).floatValue();
         ((qww)var5).a = var4;
         if (Math.abs(var3 - var2) > 0.5F) {
            var12.b();
         }

         ip var13 = (ip)this.d;
         ++var13.a;
         return qsn.a;
      case 1:
         var12 = (za)var1;
         var12.getClass();
         dq.f(var12, ((yt)this.d).a);
         var6 = this.d;
         var5 = var12.a();
         var5 = ((yt)var6).b(var5);
         if (!c.E(var5, var12.a())) {
            ((yt)this.d).a.c(var5);
            ((zc)this.b).c(var5);
            var5 = this.a;
            if (var5 != null) {
               ((qvt)var5).eo(this.d);
            }

            var12.b();
            ((qwv)this.c).a = true;
         } else {
            var1 = this.a;
            if (var1 != null) {
               ((qvt)var1).eo(this.d);
            }
         }

         return qsn.a;
      case 2:
         ((nd)var1).getClass();
         var5 = this.d;
         var6 = this.b;
         var1 = this.a;
         ayx var16 = new ayx((avi)var5, (avi)var6, (azc)var1);
         var5 = var16.a();
         if (var5 != null && !((azc)var1).f(var5)) {
            if (var5 instanceof azu) {
               azu var9 = (azu)var5;
               if (var9.g() != aup.b && var9.g() != aup.c && var9.g() != aup.a) {
                  var10 = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
               } else {
                  StringBuilder var14 = new StringBuilder();
                  var14.append("MutableState containing ");
                  var14.append(var9.a());
                  var14.append(" cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().");
                  var10 = var14.toString();
               }
            } else {
               StringBuilder var11 = new StringBuilder();
               var11.append(var5);
               var11.append(" cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().");
               var10 = var5.toString().concat(" cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().");
            }

            throw new IllegalArgumentException(var10);
         } else {
            return new akj(((azc)this.a).g((String)this.c, var16), 3);
         }
      default:
         String var17 = (String)var1;
         var10 = var17;
         if (var17 == null) {
            var10 = "com.google.android.wearable.app";
         }

         var5 = this.a;
         var6 = this.d;
         Object var8 = this.b;
         String var7 = ((maf)this.c).a;
         ResultReceiver var18 = (ResultReceiver)var8;
         Intent var15 = ve.f((Intent)var6, var18, var7, var10);
         ((ddb)var5).b(var15);
         return qsn.a;
      }
   }
}
