import android.util.Log;
import android.view.Surface;
import com.google.android.apps.camera.imax.cyclops.audio.CmJv.ytQQGGmniJK;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public final class sk implements tt {
   private final int a;

   public sk(bwc var1, int var2) {
      this.a = var2;
      var1.getClass();
      super();
   }

   public sk(bwc var1, int var2, byte[] var3) {
      this.a = var2;
      var1.getClass();
      super();
   }

   public sk(bwc var1, int var2, char[] var3) {
      this.a = var2;
      var1.getClass();
      super();
   }

   public final Map a(tl var1, Map var2, tz var3) {
      ArrayList var4;
      Iterator var5;
      StringBuilder var6;
      switch(this.a) {
      case 0:
         var4 = new ArrayList(var2.size());
         var5 = var2.entrySet().iterator();

         while(var5.hasNext()) {
            var4.add((Surface)((Entry)var5.next()).getValue());
         }

         if (!var1.g(var4, var3)) {
            var6 = new StringBuilder();
            var6.append(ytQQGGmniJK.XyOPzd);
            var6.append(var1);
            var6.append(" for ");
            var6.append(var3);
            var6.append('!');
            Log.w("CXCP", var6.toString());
            var3.c();
         }

         return qtg.a;
      case 1:
         var4 = new ArrayList(var2.size());
         var5 = var2.entrySet().iterator();

         while(var5.hasNext()) {
            var4.add((Surface)((Entry)var5.next()).getValue());
         }

         if (!var1.e(var4, var3)) {
            var6 = new StringBuilder();
            var6.append("Failed to create capture session from ");
            var6.append(var1);
            var6.append(" for ");
            var6.append(var3);
            var6.append('!');
            Log.w("CXCP", var6.toString());
            var3.c();
         }

         return qtg.a;
      default:
         var4 = new ArrayList(var2.size());
         var5 = var2.entrySet().iterator();

         while(var5.hasNext()) {
            var4.add((Surface)((Entry)var5.next()).getValue());
         }

         if (!var1.e(var4, var3)) {
            var6 = new StringBuilder();
            var6.append("Failed to create captures session from ");
            var6.append(var1);
            var6.append(" for ");
            var6.append(var3);
            var6.append('!');
            Log.w("CXCP", var6.toString());
            var3.c();
         }

         return qtg.a;
      }
   }
}
