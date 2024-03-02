package com.google.android.apps.camera.ui.views;

import android.content.Context;
import android.graphics.Insets;
import android.util.AttributeSet;
import android.view.WindowInsets.Type;
import com.google.android.apps.camera.ui.layout.GcaLayout;

public class RotatingGcaLayout extends GcaLayout implements .kfw {
   private final int[] g = new int[2];
   private .kge h;
   private .ktb i;
   private boolean j;

   public RotatingGcaLayout(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.h = .kge.b;
      this.i = .ktb.a;
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      if ((Boolean)this.e.eZ()) {
         if (this.getRotation() == 0.0F) {
            this.setX(0.0F);
            this.setY(0.0F);
         } else {
            this.getLocationInWindow(this.g);
            Insets var13 = this.getRootWindowInsets().getInsets(Type.systemBars());
            float var10 = this.getX();
            float var11 = this.getY();
            int[] var14 = this.g;
            float var8 = var10 - (float)var14[0];
            float var9 = (float)var14[1];
            float var12 = (float)var13.top;
            float var7 = this.getRotation();
            float var6 = (float).ktb.b.e;
            var9 = var11 - var9 + var12;
            if (var7 == var6) {
               var6 = var9 + (float)this.getWidth();
               var7 = var8;
            } else {
               var7 = var8;
               var6 = var9;
               if (this.getRotation() == (float).ktb.c.e) {
                  var7 = var8 + (float)this.getHeight();
                  var6 = var9;
               }
            }

            if (var10 != var7) {
               this.setX(var7);
            }

            if (var11 != var6) {
               this.setY(var6);
            }
         }
      } else if (this.j) {
         this.setX(0.0F);
         this.setY(0.0F);
         this.j = false;
      }

      super.onLayout(var1, var2, var3, var4, var5);
   }

   public final void onLayoutUpdated(.kge var1, .ktb var2) {
      if (this.h != var1) {
         this.j = true;
         if (!(Boolean)this.e.eZ() && this.getRotation() != 0.0F) {
            this.setRotation(0.0F);
         }

         this.h = var1;
      }

      if (this.i != var2) {
         if ((Boolean)this.e.eZ()) {
            float var3 = this.getRotation();
            float var4 = (float)var2.e;
            if (var3 != var4) {
               this.setRotation(var4);
            }
         }

         this.i = var2;
      }

   }

   // $FF: synthetic method
   public final void onLayoutUpdated(.ktb var1) {
   }
}
