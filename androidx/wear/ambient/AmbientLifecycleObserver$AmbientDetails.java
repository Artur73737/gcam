package androidx.wear.ambient;

public final class AmbientLifecycleObserver$AmbientDetails {
   private final boolean a;
   private final boolean b;

   public AmbientLifecycleObserver$AmbientDetails(boolean var1, boolean var2) {
      this.a = var1;
      this.b = var2;
   }

   public final boolean getBurnInProtectionRequired() {
      return this.a;
   }

   public final boolean getDeviceHasLowBitAmbient() {
      return this.b;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("AmbientDetails - burnInProtectionRequired: ");
      var1.append(this.a);
      var1.append(", deviceHasLowBitAmbient: ");
      var1.append(this.b);
      return var1.toString();
   }
}
