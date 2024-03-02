package com.google.android.apps.camera.bottombar;

class SnapshotButton$1 extends .kmu {
   final SnapshotButton this$0;
   final .kmn val$snapshotButtonAnimnator;

   public SnapshotButton$1(SnapshotButton var1, .kmn var2) {
      this.this$0 = var1;
      this.val$snapshotButtonAnimnator = var2;
   }

   public void onShutterButtonPressedStateChanged(boolean var1) {
      this.this$0.runPressedStateAnimation(var1, this.val$snapshotButtonAnimnator);
   }
}
