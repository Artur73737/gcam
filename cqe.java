import android.os.Handler;
import android.os.Looper;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class cqe extends lq {
   public List d;
   private final PreferenceGroup e;
   private List f;
   private final List g;
   private final Handler h;
   private final Runnable i = new nj(this, 18, (byte[])null);

   public cqe(PreferenceGroup var1) {
      this.e = var1;
      this.h = new Handler(Looper.getMainLooper());
      var1.E = this;
      this.f = new ArrayList();
      this.d = new ArrayList();
      this.g = new ArrayList();
      if (var1 instanceof PreferenceScreen) {
         this.g(((PreferenceScreen)var1).e);
      } else {
         this.g(true);
      }

      this.k();
   }

   private final List m(PreferenceGroup var1) {
      ArrayList var6 = new ArrayList();
      ArrayList var7 = new ArrayList();
      int var5 = var1.k();
      int var4 = 0;

      int var2;
      int var3;
      for(var3 = 0; var4 < var5; var3 = var2) {
         Preference var8 = var1.o(var4);
         var2 = var3;
         if (var8.w) {
            if (o(var1) && var3 >= var1.d) {
               var7.add(var8);
            } else {
               var6.add(var8);
            }

            if (!(var8 instanceof PreferenceGroup)) {
               var2 = var3 + 1;
            } else {
               PreferenceGroup var11 = (PreferenceGroup)var8;
               var2 = var3;
               if (var11.ai()) {
                  if (o(var1) && o(var11)) {
                     throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                  }

                  Iterator var9 = this.m(var11).iterator();

                  while(true) {
                     var2 = var3;
                     if (!var9.hasNext()) {
                        break;
                     }

                     var8 = (Preference)var9.next();
                     if (o(var1) && var3 >= var1.d) {
                        var7.add(var8);
                     } else {
                        var6.add(var8);
                     }

                     ++var3;
                  }
               }
            }
         }

         ++var4;
      }

      if (o(var1) && var3 > var1.d) {
         cpg var10 = new cpg(var1.j, var7, var1.eP());
         var10.o = new cqc(this, var1);
         var6.add(var10);
      }

      return var6;
   }

   private final void n(List param1, PreferenceGroup param2) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean o(PreferenceGroup var0) {
      return var0.d != Integer.MAX_VALUE;
   }

   public final int a() {
      return this.d.size();
   }

   public final int b(int var1) {
      cqd var2 = new cqd(this.j(var1));
      var1 = this.g.indexOf(var2);
      if (var1 != -1) {
         return var1;
      } else {
         var1 = this.g.size();
         this.g.add(var2);
         return var1;
      }
   }

   public final long c(int var1) {
      return !super.b ? -1L : this.j(var1).eP();
   }

   public final Preference j(int var1) {
      return var1 >= 0 && var1 < this.a() ? (Preference)this.d.get(var1) : null;
   }

   public final void k() {
      Iterator var1;
      for(var1 = this.f.iterator(); var1.hasNext(); ((Preference)var1.next()).E = null) {
      }

      ArrayList var3 = new ArrayList(this.f.size());
      this.f = var3;
      this.n(var3, this.e);
      this.d = this.m(this.e);
      cqg var4 = this.e.k;
      super.a.a();

      Preference var2;
      for(var1 = this.f.iterator(); var1.hasNext(); var2 = (Preference)var1.next()) {
      }

   }

   public final void l() {
      this.h.removeCallbacks(this.i);
      this.h.post(this.i);
   }
}
