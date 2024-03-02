package android.support.v8.renderscript;

// $FF: synthetic class
class Element$1 {
   static final int[] $SwitchMap$android$support$v8$renderscript$Element$DataKind;
   static final int[] $SwitchMap$android$support$v8$renderscript$Element$DataType;

   static {
      int[] var0 = new int[Element$DataKind.values().length];
      $SwitchMap$android$support$v8$renderscript$Element$DataKind = var0;

      try {
         var0[Element$DataKind.PIXEL_LA.ordinal()] = 1;
      } catch (NoSuchFieldError var14) {
      }

      try {
         $SwitchMap$android$support$v8$renderscript$Element$DataKind[Element$DataKind.PIXEL_RGB.ordinal()] = 2;
      } catch (NoSuchFieldError var13) {
      }

      try {
         $SwitchMap$android$support$v8$renderscript$Element$DataKind[Element$DataKind.PIXEL_RGBA.ordinal()] = 3;
      } catch (NoSuchFieldError var12) {
      }

      var0 = new int[Element$DataType.values().length];
      $SwitchMap$android$support$v8$renderscript$Element$DataType = var0;

      try {
         var0[Element$DataType.FLOAT_32.ordinal()] = 1;
      } catch (NoSuchFieldError var11) {
      }

      try {
         $SwitchMap$android$support$v8$renderscript$Element$DataType[Element$DataType.FLOAT_64.ordinal()] = 2;
      } catch (NoSuchFieldError var10) {
      }

      try {
         $SwitchMap$android$support$v8$renderscript$Element$DataType[Element$DataType.SIGNED_8.ordinal()] = 3;
      } catch (NoSuchFieldError var9) {
      }

      try {
         $SwitchMap$android$support$v8$renderscript$Element$DataType[Element$DataType.SIGNED_16.ordinal()] = 4;
      } catch (NoSuchFieldError var8) {
      }

      try {
         $SwitchMap$android$support$v8$renderscript$Element$DataType[Element$DataType.SIGNED_32.ordinal()] = 5;
      } catch (NoSuchFieldError var7) {
      }

      try {
         $SwitchMap$android$support$v8$renderscript$Element$DataType[Element$DataType.SIGNED_64.ordinal()] = 6;
      } catch (NoSuchFieldError var6) {
      }

      try {
         $SwitchMap$android$support$v8$renderscript$Element$DataType[Element$DataType.UNSIGNED_8.ordinal()] = 7;
      } catch (NoSuchFieldError var5) {
      }

      try {
         $SwitchMap$android$support$v8$renderscript$Element$DataType[Element$DataType.UNSIGNED_16.ordinal()] = 8;
      } catch (NoSuchFieldError var4) {
      }

      try {
         $SwitchMap$android$support$v8$renderscript$Element$DataType[Element$DataType.UNSIGNED_32.ordinal()] = 9;
      } catch (NoSuchFieldError var3) {
      }

      try {
         $SwitchMap$android$support$v8$renderscript$Element$DataType[Element$DataType.UNSIGNED_64.ordinal()] = 10;
      } catch (NoSuchFieldError var2) {
      }

      try {
         $SwitchMap$android$support$v8$renderscript$Element$DataType[Element$DataType.BOOLEAN.ordinal()] = 11;
      } catch (NoSuchFieldError var1) {
      }
   }
}
