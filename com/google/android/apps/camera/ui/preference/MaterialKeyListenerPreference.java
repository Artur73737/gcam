package com.google.android.apps.camera.ui.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.preference.DialogPreference;

public class MaterialKeyListenerPreference extends DialogPreference {
   private String g;
   private String h;

   public MaterialKeyListenerPreference(Context var1) {
      super(var1);
      this.l();
   }

   public MaterialKeyListenerPreference(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.l();
   }

   public MaterialKeyListenerPreference(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.l();
   }

   public MaterialKeyListenerPreference(Context var1, AttributeSet var2, int var3, int var4) {
      super(var1, var2, var3, var4);
      this.l();
   }

   private final void l() {
      this.k("-1");
   }

   protected final void G(boolean var1, Object var2) {
      String var3;
      if (var1) {
         var3 = this.w("-1");
      } else {
         var3 = (String)var2;
      }

      this.k(var3);
   }

   protected final void c() {
      super.a = "Bind Key to ".concat(String.valueOf(String.valueOf(super.q)));
      String var1 = this.h;
      String var3 = this.g;
      StringBuilder var2 = new StringBuilder();
      var2.append("Current Key Bind: ");
      var2.append(var1);
      var2.append(" (Key Code: ");
      var2.append(var3);
      var2.append(")\nPress key to rebind");
      super.b = var2.toString();
      super.e = "Reset";
      super.c();
   }

   protected final Object f(TypedArray var1, int var2) {
      String var3 = var1.getString(var2);
      String var4 = var3;
      if (var3 == null) {
         var4 = "-1";
      }

      return var4;
   }

   public final void k(String var1) {
      this.g = var1;
      if (var1.equals("-1")) {
         this.h = "None";
      } else {
         KeyEvent var4 = new KeyEvent(0, Integer.parseInt(var1));
         int var3 = var4.getUnicodeChar();
         String var5;
         if (var3 != 0 && var3 != 10 && var3 != 32) {
            char var2 = (char)var3;
            StringBuilder var6 = new StringBuilder();
            var6.append(var2);
            var5 = var6.toString();
         } else {
            var5 = .kfq.i(var4.getKeyCode());
         }

         this.h = var5;
      }

      this.n(this.h);
      this.ad(var1);
      this.B(this.j());
      this.d();
   }
}
