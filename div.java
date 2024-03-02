import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class div {
   public Map a;
   public Map b;
   public Map c;
   public xp d;
   public xl e;
   public List f;
   public Rect g;
   public float h;
   public float i;
   public float j;
   public int k = 0;
   public final cav l = new cav((byte[])null, (byte[])null);
   private final HashSet m = new HashSet();

   public final float a() {
      return (float)((long)(this.b() / this.j * 1000.0F));
   }

   public final float b() {
      return this.i - this.h;
   }

   public final dmo c(long var1) {
      return (dmo)this.e.d(var1);
   }

   public final void d(String var1) {
      doh.a(var1);
      this.m.add(var1);
   }

   public final void e(int var1) {
      this.k += var1;
   }

   public final String toString() {
      StringBuilder var2 = new StringBuilder("LottieComposition:\n");
      Iterator var1 = this.f.iterator();

      while(var1.hasNext()) {
         var2.append(((dmo)var1.next()).a("\t"));
      }

      return var2.toString();
   }
}
