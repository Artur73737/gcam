import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

final class cjz implements TextWatcher, SpanWatcher {
   final Object a;
   public final AtomicInteger b = new AtomicInteger(0);

   public cjz(Object var1) {
      this.a = var1;
   }

   public final void afterTextChanged(Editable var1) {
      ((TextWatcher)this.a).afterTextChanged(var1);
   }

   public final void beforeTextChanged(CharSequence var1, int var2, int var3, int var4) {
      ((TextWatcher)this.a).beforeTextChanged(var1, var2, var3, var4);
   }

   public final void onSpanAdded(Spannable var1, Object var2, int var3, int var4) {
      if (this.b.get() <= 0 || !(var2 instanceof cjy)) {
         ((SpanWatcher)this.a).onSpanAdded(var1, var2, var3, var4);
      }
   }

   public final void onSpanChanged(Spannable var1, Object var2, int var3, int var4, int var5, int var6) {
      if (this.b.get() <= 0 || !(var2 instanceof cjy)) {
         ((SpanWatcher)this.a).onSpanChanged(var1, var2, var3, var4, var5, var6);
      }
   }

   public final void onSpanRemoved(Spannable var1, Object var2, int var3, int var4) {
      if (this.b.get() <= 0 || !(var2 instanceof cjy)) {
         ((SpanWatcher)this.a).onSpanRemoved(var1, var2, var3, var4);
      }
   }

   public final void onTextChanged(CharSequence var1, int var2, int var3, int var4) {
      ((TextWatcher)this.a).onTextChanged(var1, var2, var3, var4);
   }
}
