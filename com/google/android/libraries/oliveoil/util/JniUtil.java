package com.google.android.libraries.oliveoil.util;

public class JniUtil {
   public static final int a = 0;

   static {
      a();
   }

   public static void a() {
      try {
         System.loadLibrary("oliveoil");
      } catch (UnsatisfiedLinkError var1) {
         if (System.getProperty("java.vm.name").equals("Dalvik")) {
            throw var1;
         } else {
            throw new UnsatisfiedLinkError("Not running Dalvik VM. Details: ".concat(var1.toString()));
         }
      }
   }
}
