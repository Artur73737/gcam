import android.view.ViewGroup;
import java.util.Iterator;

public final class cgr implements Iterator, qxc {
   final ViewGroup a;
   private int b;

   public cgr(ViewGroup var1) {
      this.a = var1;
   }

   public final boolean hasNext() {
      return this.b < this.a.getChildCount();
   }

   public final void remove() {
      ViewGroup var2 = this.a;
      int var1 = this.b - 1;
      this.b = var1;
      var2.removeViewAt(var1);
   }
}
