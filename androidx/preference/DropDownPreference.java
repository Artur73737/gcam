package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;

public class DropDownPreference extends ListPreference {
   private final Context F;
   private final ArrayAdapter G;
   private Spinner H;
   private final OnItemSelectedListener I;

   public DropDownPreference(Context var1, AttributeSet var2) {
      int var3 = 0;
      super(var1, var2, 2130969190, 0);
      this.I = new .cpd(this, 0);
      this.F = var1;
      ArrayAdapter var4 = new ArrayAdapter(var1, 17367049);
      this.G = var4;
      var4.clear();
      CharSequence[] var5 = super.g;
      if (var5 != null) {
         while(var3 < var5.length) {
            CharSequence var6 = var5[var3];
            this.G.add(var6.toString());
            ++var3;
         }
      }

   }

   public final void a(.cqj var1) {
      int var2;
      Spinner var6;
      label23: {
         Spinner var4 = (Spinner)var1.a.findViewById(2131428255);
         this.H = var4;
         var4.setAdapter(this.G);
         this.H.setOnItemSelectedListener(this.I);
         var6 = this.H;
         String var5 = super.i;
         CharSequence[] var7 = super.h;
         byte var3 = -1;
         if (var5 != null && var7 != null) {
            for(var2 = var7.length - 1; var2 >= 0; --var2) {
               if (TextUtils.equals(var7[var2].toString(), var5)) {
                  break label23;
               }
            }
         }

         var2 = var3;
      }

      var6.setSelection(var2);
      super.a(var1);
   }

   protected final void c() {
      this.H.performClick();
   }

   protected final void d() {
      super.d();
      ArrayAdapter var1 = this.G;
      if (var1 != null) {
         var1.notifyDataSetChanged();
      }

   }
}
