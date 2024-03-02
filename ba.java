import android.view.View;

// $FF: synthetic class
public final class ba implements cec {
   public final View a;
   public final bb b;
   public final dk c;
   public final dl d;

   // $FF: synthetic method
   public ba(View var1, dl var2, bb var3, dk var4) {
      this.a = var1;
      this.d = var2;
      this.b = var3;
      this.c = var4;
   }

   public final void a() {
      View var4 = this.a;
      dl var2 = this.d;
      bb var3 = this.b;
      dk var1 = this.c;
      var3.getClass();
      var4.clearAnimation();
      var2.a.endViewTransition(var4);
      var3.b();
      if (cp.S(2)) {
         StringBuilder var5 = new StringBuilder();
         var5.append("Animation from operation ");
         var5.append(var1);
         var5.append(" has been cancelled.");
      }

   }
}
