package com.google.android.apps.camera.wear.wearappv2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import java.util.Iterator;

public class RemoteShutterButton extends ShutterButton {
   public RemoteShutterButton(Context var1, AttributeSet var2) {
      super(var1, var2, true);
   }

   protected final float getDefaultScale() {
      return (float)this.getResources().getDisplayMetrics().widthPixels * 0.001875F;
   }

   public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo var1) {
      super.onInitializeAccessibilityNodeInfo(var1);
      Iterator var3 = var1.getActionList().iterator();

      while(var3.hasNext()) {
         AccessibilityAction var2 = (AccessibilityAction)var3.next();
         if (var2.getId() == 32) {
            var1.removeAction(var2);
            break;
         }
      }

   }
}
