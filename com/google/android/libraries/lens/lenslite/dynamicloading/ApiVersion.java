package com.google.android.libraries.lens.lenslite.dynamicloading;

public enum ApiVersion {
   private static final ApiVersion[] $VALUES = $values();
   public static final int CURRENT_VERSION = 17;
   public static final int MIN_VERSION = 4;
   ORIGINAL(1),
   VERSION_10(10),
   VERSION_11(11),
   VERSION_12(12),
   VERSION_13(13),
   VERSION_14(14),
   VERSION_15(15),
   VERSION_16(16),
   VERSION_17(17),
   VERSION_2(2),
   VERSION_3(3),
   VERSION_4(4),
   VERSION_5(5),
   VERSION_6(6),
   VERSION_7(7),
   VERSION_8(8),
   VERSION_9(9);

   private final int versionCode;

   // $FF: synthetic method
   private static ApiVersion[] $values() {
      return new ApiVersion[]{ORIGINAL, VERSION_2, VERSION_3, VERSION_4, VERSION_5, VERSION_6, VERSION_7, VERSION_8, VERSION_9, VERSION_10, VERSION_11, VERSION_12, VERSION_13, VERSION_14, VERSION_15, VERSION_16, VERSION_17};
   }

   private ApiVersion(int var3) {
      this.versionCode = var3;
   }

   public int getVersionCode() {
      return this.versionCode;
   }
}
