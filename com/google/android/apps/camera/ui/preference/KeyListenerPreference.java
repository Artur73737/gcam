package com.google.android.apps.camera.ui.preference;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class KeyListenerPreference extends DialogPreference {
   public String a;
   public String b;

   public KeyListenerPreference(Context var1) {
      super(var1);
      this.c();
   }

   public KeyListenerPreference(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.c();
   }

   public KeyListenerPreference(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.c();
   }

   public KeyListenerPreference(Context var1, AttributeSet var2, int var3, int var4) {
      super(var1, var2, var3, var4);
      this.c();
   }

   public static String a(KeyEvent var0) {
      int var2 = var0.getUnicodeChar();
      if (var2 != 0 && var2 != 10 && var2 != 32) {
         char var1 = (char)var2;
         StringBuilder var3 = new StringBuilder();
         var3.append(var1);
         return var3.toString();
      } else {
         return .kfq.i(var0.getKeyCode());
      }
   }

   private final void c() {
      this.b("-1");
   }

   public final void b(String var1) {
      this.a = var1;
      if (var1.equals("-1")) {
         this.b = "None";
      } else {
         this.b = a(new KeyEvent(0, Integer.parseInt(var1)));
      }

      this.setSummary(this.b);
      this.persistString(var1);
      this.notifyDependencyChange(this.shouldDisableDependents());
      this.notifyChanged();
   }

   protected final void onClick() {
      this.setDialogTitle("Bind Key to ".concat(String.valueOf(String.valueOf(this.getTitle()))));
      String var1 = this.b;
      String var3 = this.a;
      StringBuilder var2 = new StringBuilder();
      var2.append("Current Key Bind: ");
      var2.append(var1);
      var2.append(" (Key Code: ");
      var2.append(var3);
      var2.append(")\nPress key to rebind");
      this.setDialogMessage(var2.toString());
      this.setNegativeButtonText("Reset");
      super.onClick();
      AlertDialog var4 = (AlertDialog)this.getDialog();
      ViewGroup var8 = (ViewGroup)var4.findViewById(16908290);
      TextView var7 = (TextView)var4.findViewById(16908299);
      Button var6 = var4.getButton(-1);
      Button var5 = var4.getButton(-2);
      var8.setDescendantFocusability(393216);
      var7.setTextColor(-16777216);
      var7.setTextSize(18.0F);
      var6.setEnabled(false);
      if (this.a.equals("-1")) {
         var7.setText("Current Key Bind: None\nPress key to bind");
         var5.setVisibility(4);
      }

      var4.getButton(-2).setOnClickListener(new .kko(this, var7, var5, var6, 0));
      var4.setOnKeyListener(new .kkp(this, var7, var6, var5));
   }

   protected final void onDialogClosed(boolean var1) {
      super.onDialogClosed(var1);
      if (var1) {
         String var2 = this.a;
         if (this.callChangeListener(var2)) {
            this.b(var2);
         }

         this.setSummary(this.b);
      }

   }

   protected final Object onGetDefaultValue(TypedArray var1, int var2) {
      String var3 = var1.getString(var2);
      String var4 = var3;
      if (var3 == null) {
         var4 = "-1";
      }

      return var4;
   }

   protected final void onSetInitialValue(boolean var1, Object var2) {
      String var3;
      if (var1) {
         var3 = this.getPersistedString("-1");
      } else {
         var3 = (String)var2;
      }

      this.b(var3);
   }
}
