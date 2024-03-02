package com.google.android.apps.camera.ui.mars;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.camera.ui.popupmenu.PopupMenuView;

public class MarsSwitch extends FrameLayout implements .kfw {
   public final PopupMenuView a;
   public View b;
   private .ktb c;

   public MarsSwitch(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.c = .ktb.a;
      ((LayoutInflater)this.getContext().getSystemService("layout_inflater")).inflate(2131624086, this);
      this.a = (PopupMenuView)this.findViewById(2131427872);
   }

   public final void a() {
      View var2 = this.b;
      if (var2 != null) {
         float var1 = Math.min((float)var2.getWidth() / 2.0F, 200.0F);
         PopupMenuView var3 = this.a;
         var2 = var3.c;
         if (var2 == null) {
            var2 = var3.findViewById(2131427442);
         }

         var2.setTranslationX(-var1);
         var3 = this.a;
         var2 = this.b;
         var2.getClass();
         var3.setTranslationY((float)(-var2.getHeight()));
      }
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      if (var1) {
         this.onLayoutUpdated(this.c);
      }

   }

   // $FF: synthetic method
   public final void onLayoutUpdated(.kge var1, .ktb var2) {
   }

   public final void onLayoutUpdated(.ktb var1) {
      this.c = var1;
      this.a.a(var1);
      this.a();
   }
}
