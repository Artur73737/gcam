package com.google.android.clockwork.common.wearable.wearmaterial.button;

import android.content.Context;
import android.text.Spanned;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.TextView;
import java.util.Map;

public final class ContentChangeTransition extends TransitionSet {
   public static final String[] a;
   private static final Interpolator b = new .clg();
   private static final Interpolator c = new .cle();
   private static final String d;
   private static final String e;
   private static final String f;

   static {
      String var1 = ContentChangeTransition.class.getName();
      d = var1;
      String var0 = String.valueOf(var1).concat(":content-version");
      e = var0;
      var1 = String.valueOf(var1).concat(":visibility");
      f = var1;
      a = new String[]{var1, var0};
   }

   public ContentChangeTransition(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.setOrdering(1);
      .ldq var3 = new .ldq();
      var3.setDuration(150L);
      var3.setInterpolator(c);
      this.addTransition(var3);
      .ldn var4 = new .ldn();
      var4.setDuration(300L);
      var4.setInterpolator(b);
      this.addTransition(var4);
   }

   static int a(Map var0) {
      Integer var2 = (Integer)var0.get(e);
      int var1;
      if (var2 == null) {
         var1 = View.generateViewId();
      } else {
         var1 = var2;
      }

      return var1;
   }

   public static void b(TransitionValues var0) {
      View var3 = var0.view;
      Integer var4 = (Integer)var3.getTag(2131428301);
      Map var6 = var0.values;
      String var5 = e;
      int var1;
      if (var4 == null) {
         var1 = View.generateViewId();
      } else {
         var1 = var4;
      }

      var6.put(var5, var1);
      Map var8 = var0.values;
      String var7 = f;
      boolean var2;
      if (var3.getVisibility() == 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      var8.put(var7, var2);
   }

   static void c(TextView var0, CharSequence var1) {
      CharSequence var2 = var0.getText();
      if (var2 != var1 && (var2 == null || var1 == null || var2 instanceof Spanned || var1 instanceof Spanned || !var2.toString().contentEquals(var1))) {
         var0.setText(var1);
         var0.setTag(2131428301, View.generateViewId());
      }
   }

   static boolean d(Map var0) {
      Boolean var1 = (Boolean)var0.get(f);
      return var1 != null && var1;
   }

   public static boolean e(TransitionValues var0, TransitionValues var1) {
      Map var5 = var0.values;
      Map var4 = var1.values;
      if (var0.view != var1.view) {
         return false;
      } else {
         boolean var3 = d(var5);
         boolean var2 = d(var4);
         if (var3 && var2) {
            return a(var5) != a(var4);
         } else {
            return false;
         }
      }
   }
}
