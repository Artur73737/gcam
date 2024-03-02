import androidx.window.extensions.area.WindowAreaComponent;
import androidx.window.extensions.core.util.function.Consumer;
import java.util.concurrent.Executor;

public final class cxo implements Consumer {
   private final Executor a;
   private final cxx b;
   private final WindowAreaComponent c;
   private cxw d;

   // $FF: synthetic method
   public static void $r8$lambda$WjtW78xCkGS4No8I4mnvJzPELrA(cxo var0, cxw var1) {
      var0.getClass();
      var1.getClass();
      var0.b.a(var1);
   }

   // $FF: synthetic method
   public static void $r8$lambda$rrnTs6BAMOesxU5R5By26V_xWe0(cxo var0) {
      var0.getClass();
      var0.b.b();
   }

   public cxo(Executor var1, cxx var2, WindowAreaComponent var3) {
      var1.getClass();
      var2.getClass();
      var3.getClass();
      super();
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   private final void a() {
      this.d = null;
      this.a.execute(new czc(this, 1));
   }

   public void accept(int var1) {
      switch(var1) {
      case 0:
         this.a();
         return;
      case 1:
         cxh var2 = new cxh(this.c);
         this.d = var2;
         this.a.execute(new ay(this, var2, 15));
         return;
      default:
         this.a();
      }
   }
}
