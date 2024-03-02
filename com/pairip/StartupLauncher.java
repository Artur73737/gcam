package com.pairip;

public final class StartupLauncher {
   private static boolean launchCalled;
   private static String startupProgramName;

   private StartupLauncher() {
   }

   public static void launch() {
      synchronized(StartupLauncher.class){}

      Throwable var10000;
      label78: {
         boolean var0;
         boolean var10001;
         try {
            var0 = launchCalled;
         } catch (Throwable var7) {
            var10000 = var7;
            var10001 = false;
            break label78;
         }

         if (var0) {
            return;
         }

         try {
            launchCalled = true;
            VMRunner.invoke(startupProgramName, (Object[])null);
         } catch (Throwable var6) {
            var10000 = var6;
            var10001 = false;
            break label78;
         }

         return;
      }

      Throwable var1 = var10000;
      throw var1;
   }
}
