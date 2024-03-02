import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public final class cka extends SpannableStringBuilder {
   private final Class a;
   private final List b = new ArrayList();

   public cka(Class var1, CharSequence var2) {
      super(var2);
      this.a = var1;
   }

   public cka(Class var1, CharSequence var2, int var3, int var4) {
      super(var2, var3, var4);
      cby.h(var1, "watcherClass cannot be null");
      this.a = var1;
   }

   private final cjz a(Object var1) {
      for(int var2 = 0; var2 < this.b.size(); ++var2) {
         cjz var3 = (cjz)this.b.get(var2);
         if (var3.a == var1) {
            return var3;
         }
      }

      return null;
   }

   private final void b() {
      for(int var1 = 0; var1 < this.b.size(); ++var1) {
         ((cjz)this.b.get(var1)).b.incrementAndGet();
      }

   }

   private final void c() {
      for(int var1 = 0; var1 < this.b.size(); ++var1) {
         ((cjz)this.b.get(var1)).b.decrementAndGet();
      }

   }

   private final boolean d(Class var1) {
      return this.a == var1;
   }

   private final boolean e(Object var1) {
      return var1 != null && this.d(var1.getClass());
   }

   // $FF: synthetic method
   public final Editable append(char var1) {
      super.append(var1);
      return this;
   }

   // $FF: synthetic method
   public final Editable append(CharSequence var1) {
      super.append(var1);
      return this;
   }

   // $FF: synthetic method
   public final Editable append(CharSequence var1, int var2, int var3) {
      super.append(var1, var2, var3);
      return this;
   }

   public final SpannableStringBuilder append(char var1) {
      super.append(var1);
      return this;
   }

   public final SpannableStringBuilder append(CharSequence var1) {
      super.append(var1);
      return this;
   }

   public final SpannableStringBuilder append(CharSequence var1, int var2, int var3) {
      super.append(var1, var2, var3);
      return this;
   }

   public final SpannableStringBuilder append(CharSequence var1, Object var2, int var3) {
      super.append(var1, var2, var3);
      return this;
   }

   // $FF: synthetic method
   public final Appendable append(char var1) {
      super.append(var1);
      return this;
   }

   // $FF: synthetic method
   public final Appendable append(CharSequence var1) {
      super.append(var1);
      return this;
   }

   // $FF: synthetic method
   public final Appendable append(CharSequence var1, int var2, int var3) {
      super.append(var1, var2, var3);
      return this;
   }

   // $FF: synthetic method
   public final Editable delete(int var1, int var2) {
      super.delete(var1, var2);
      return this;
   }

   public final SpannableStringBuilder delete(int var1, int var2) {
      super.delete(var1, var2);
      return this;
   }

   public final int getSpanEnd(Object var1) {
      Object var2 = var1;
      if (this.e(var1)) {
         cjz var3 = this.a(var1);
         var2 = var1;
         if (var3 != null) {
            var2 = var3;
         }
      }

      return super.getSpanEnd(var2);
   }

   public final int getSpanFlags(Object var1) {
      Object var2 = var1;
      if (this.e(var1)) {
         cjz var3 = this.a(var1);
         var2 = var1;
         if (var3 != null) {
            var2 = var3;
         }
      }

      return super.getSpanFlags(var2);
   }

   public final int getSpanStart(Object var1) {
      Object var2 = var1;
      if (this.e(var1)) {
         cjz var3 = this.a(var1);
         var2 = var1;
         if (var3 != null) {
            var2 = var3;
         }
      }

      return super.getSpanStart(var2);
   }

   public final Object[] getSpans(int var1, int var2, Class var3) {
      if (!this.d(var3)) {
         return super.getSpans(var1, var2, var3);
      } else {
         cjz[] var4 = (cjz[])super.getSpans(var1, var2, cjz.class);
         Object[] var5 = (Object[])Array.newInstance(var3, var4.length);

         for(var1 = 0; var1 < var4.length; ++var1) {
            var5[var1] = var4[var1].a;
         }

         return var5;
      }
   }

   // $FF: synthetic method
   public final Editable insert(int var1, CharSequence var2) {
      super.insert(var1, var2);
      return this;
   }

   // $FF: synthetic method
   public final Editable insert(int var1, CharSequence var2, int var3, int var4) {
      super.insert(var1, var2, var3, var4);
      return this;
   }

   public final SpannableStringBuilder insert(int var1, CharSequence var2) {
      super.insert(var1, var2);
      return this;
   }

   public final SpannableStringBuilder insert(int var1, CharSequence var2, int var3, int var4) {
      super.insert(var1, var2, var3, var4);
      return this;
   }

   public final int nextSpanTransition(int var1, int var2, Class var3) {
      Class var4;
      if (var3 != null) {
         var4 = var3;
         if (!this.d(var3)) {
            return super.nextSpanTransition(var1, var2, var4);
         }
      }

      var4 = cjz.class;
      return super.nextSpanTransition(var1, var2, var4);
   }

   public final void removeSpan(Object var1) {
      cjz var2;
      if (this.e(var1)) {
         cjz var3 = this.a(var1);
         var2 = var3;
         if (var3 != null) {
            var1 = var3;
            var2 = var3;
         }
      } else {
         var2 = null;
      }

      super.removeSpan(var1);
      if (var2 != null) {
         this.b.remove(var2);
      }

   }

   public final SpannableStringBuilder replace(int var1, int var2, CharSequence var3) {
      this.b();
      super.replace(var1, var2, var3);
      this.c();
      return this;
   }

   public final SpannableStringBuilder replace(int var1, int var2, CharSequence var3, int var4, int var5) {
      this.b();
      super.replace(var1, var2, var3, var4, var5);
      this.c();
      return this;
   }

   public final void setSpan(Object var1, int var2, int var3, int var4) {
      Object var5 = var1;
      if (this.e(var1)) {
         var5 = new cjz(var1);
         this.b.add(var5);
      }

      super.setSpan(var5, var2, var3, var4);
   }

   public final CharSequence subSequence(int var1, int var2) {
      return new cka(this.a, this, var1, var2);
   }
}
