package androidx.wear.ambient;

final class SharedLibraryVersion$PresenceHolder {
   static final boolean a;

   static {
      boolean var0;
      label12: {
         try {
            Class.forName("com.google.android.wearable.compat.WearableActivityController");
         } catch (ClassNotFoundException var2) {
            var0 = false;
            break label12;
         }

         var0 = true;
      }

      a = var0;
   }

   private SharedLibraryVersion$PresenceHolder() {
   }
}
