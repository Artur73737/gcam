import android.app.Activity;
import android.os.Binder;
import androidx.window.extensions.area.WindowAreaComponent;
import androidx.window.extensions.core.util.function.Consumer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

public final class cxt implements cxn {
   public static final int g = 0;
   public final WindowAreaComponent b;
   public final int c;
   public cxk d;
   public cxk e;
   public final HashMap f;
   private Consumer h;

   static {
      qxa.a(cxt.class).b();
   }

   public cxt(WindowAreaComponent var1, int var2) {
      this.b = var1;
      this.c = var2;
      cxk var3 = cxk.a;
      this.d = var3;
      this.e = var3;
      this.f = new HashMap();
   }

   public final ree a() {
      return qwl.t(new cxs(this, (que)null));
   }

   public final void b(Binder var1, Activity var2, Executor var3, cxx var4) {
      if (!c.E(var1.getInterfaceDescriptor(), "WINDOW_AREA_REAR_DISPLAY")) {
         var3.execute(new nj(var4, 20));
      } else if (c.E(this.d, cxk.a)) {
         qwo.o(qzy.h(qxb.t(var3)), (qui)null, 0, new cxp(this, var2, var3, var4, (que)null), 3);
      } else {
         this.c(var2, var3, var4);
      }
   }

   public final void c(Activity var1, Executor var2, cxx var3) {
      if (c.E(this.d, cxk.e)) {
         new IllegalStateException("The WindowArea feature is currently active, WindowAreaInfo#getActiveSessioncan be used to get an instance of the current active session");
         var3.b();
      } else if (!c.E(this.d, cxk.d)) {
         new IllegalStateException("The WindowArea feature is currently not available to be entered");
         var3.b();
      } else {
         cxo var4 = new cxo(var2, var3, this.b);
         this.h = var4;
         this.b.startRearDisplaySession(var1, var4);
      }
   }

   public final void d(cxj var1, cxk var2, cyx var3) {
      cxv var5 = (cxv)this.f.get("WINDOW_AREA_REAR_DISPLAY");
      cxl var6;
      if (!c.E(var2, cxk.b)) {
         cxv var8 = var5;
         if (var5 == null) {
            var8 = new cxv(var3, cxu.a, new Binder("WINDOW_AREA_REAR_DISPLAY"), this.b);
         }

         var6 = new cxl(var1, var2);
         var8.e.put(var1, var6);
         var8.a = var3;
         this.f.put("WINDOW_AREA_REAR_DISPLAY", var8);
      } else {
         if (var5 != null) {
            Iterator var7 = var5.e.values().iterator();

            while(var7.hasNext()) {
               Object var4 = var7.next();
               var4.getClass();
               if (!c.E(((cxl)var4).a, cxk.b)) {
                  var6 = new cxl(var1, var2);
                  var5.e.put(var1, var6);
                  return;
               }
            }

            this.f.remove("WINDOW_AREA_REAR_DISPLAY");
         }

      }
   }
}
