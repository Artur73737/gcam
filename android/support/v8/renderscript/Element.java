package android.support.v8.renderscript;

public class Element extends BaseObj {
   int[] mArraySizes;
   String[] mElementNames;
   Element[] mElements;
   public Element$DataKind mKind;
   boolean mNormalized;
   int[] mOffsetInBytes;
   int mSize;
   public Element$DataType mType;
   int mVectorSize;
   int[] mVisibleElementMap;

   public Element(long var1, RenderScript var3) {
      super(var1, var3);
   }

   public Element(long var1, RenderScript var3, Element$DataType var4, Element$DataKind var5, boolean var6, int var7) {
      super(var1, var3);
      if (var4 != Element$DataType.UNSIGNED_5_6_5 && var4 != Element$DataType.UNSIGNED_4_4_4_4 && var4 != Element$DataType.UNSIGNED_5_5_5_1) {
         if (var7 == 3) {
            this.mSize = var4.mSize * 4;
         } else {
            this.mSize = var4.mSize * var7;
         }
      } else {
         this.mSize = var4.mSize;
      }

      this.mType = var4;
      this.mKind = var5;
      this.mNormalized = var6;
      this.mVectorSize = var7;
   }

   public Element(long var1, RenderScript var3, Element[] var4, String[] var5, int[] var6) {
      super(var1, var3);
      int var7 = 0;
      this.mSize = 0;
      this.mVectorSize = 1;
      this.mElements = var4;
      this.mElementNames = var5;
      this.mArraySizes = var6;
      this.mType = Element$DataType.NONE;
      this.mKind = Element$DataKind.USER;
      this.mOffsetInBytes = new int[this.mElements.length];

      while(true) {
         Element[] var9 = this.mElements;
         if (var7 >= var9.length) {
            this.updateVisibleSubElements();
            return;
         }

         int[] var10 = this.mOffsetInBytes;
         int var8 = this.mSize;
         var10[var7] = var8;
         this.mSize = var8 + var9[var7].mSize * this.mArraySizes[var7];
         ++var7;
      }
   }

   public static Element ALLOCATION(RenderScript var0) {
      if (var0.mElement_ALLOCATION == null) {
         var0.mElement_ALLOCATION = createUser(var0, Element$DataType.RS_ALLOCATION);
      }

      return var0.mElement_ALLOCATION;
   }

   public static Element A_8(RenderScript var0) {
      if (var0.mElement_A_8 == null) {
         var0.mElement_A_8 = createPixel(var0, Element$DataType.UNSIGNED_8, Element$DataKind.PIXEL_A);
      }

      return var0.mElement_A_8;
   }

   public static Element BOOLEAN(RenderScript var0) {
      if (var0.mElement_BOOLEAN == null) {
         var0.mElement_BOOLEAN = createUser(var0, Element$DataType.BOOLEAN);
      }

      return var0.mElement_BOOLEAN;
   }

   public static Element ELEMENT(RenderScript var0) {
      if (var0.mElement_ELEMENT == null) {
         var0.mElement_ELEMENT = createUser(var0, Element$DataType.RS_ELEMENT);
      }

      return var0.mElement_ELEMENT;
   }

   public static Element F32(RenderScript var0) {
      if (var0.mElement_F32 == null) {
         var0.mElement_F32 = createUser(var0, Element$DataType.FLOAT_32);
      }

      return var0.mElement_F32;
   }

   public static Element F32_2(RenderScript var0) {
      if (var0.mElement_FLOAT_2 == null) {
         var0.mElement_FLOAT_2 = createVector(var0, Element$DataType.FLOAT_32, 2);
      }

      return var0.mElement_FLOAT_2;
   }

   public static Element F32_3(RenderScript var0) {
      if (var0.mElement_FLOAT_3 == null) {
         var0.mElement_FLOAT_3 = createVector(var0, Element$DataType.FLOAT_32, 3);
      }

      return var0.mElement_FLOAT_3;
   }

   public static Element F32_4(RenderScript var0) {
      if (var0.mElement_FLOAT_4 == null) {
         var0.mElement_FLOAT_4 = createVector(var0, Element$DataType.FLOAT_32, 4);
      }

      return var0.mElement_FLOAT_4;
   }

   public static Element F64(RenderScript var0) {
      if (var0.mElement_F64 == null) {
         var0.mElement_F64 = createUser(var0, Element$DataType.FLOAT_64);
      }

      return var0.mElement_F64;
   }

   public static Element F64_2(RenderScript var0) {
      if (var0.mElement_DOUBLE_2 == null) {
         var0.mElement_DOUBLE_2 = createVector(var0, Element$DataType.FLOAT_64, 2);
      }

      return var0.mElement_DOUBLE_2;
   }

   public static Element F64_3(RenderScript var0) {
      if (var0.mElement_DOUBLE_3 == null) {
         var0.mElement_DOUBLE_3 = createVector(var0, Element$DataType.FLOAT_64, 3);
      }

      return var0.mElement_DOUBLE_3;
   }

   public static Element F64_4(RenderScript var0) {
      if (var0.mElement_DOUBLE_4 == null) {
         var0.mElement_DOUBLE_4 = createVector(var0, Element$DataType.FLOAT_64, 4);
      }

      return var0.mElement_DOUBLE_4;
   }

   public static Element I16(RenderScript var0) {
      if (var0.mElement_I16 == null) {
         var0.mElement_I16 = createUser(var0, Element$DataType.SIGNED_16);
      }

      return var0.mElement_I16;
   }

   public static Element I16_2(RenderScript var0) {
      if (var0.mElement_SHORT_2 == null) {
         var0.mElement_SHORT_2 = createVector(var0, Element$DataType.SIGNED_16, 2);
      }

      return var0.mElement_SHORT_2;
   }

   public static Element I16_3(RenderScript var0) {
      if (var0.mElement_SHORT_3 == null) {
         var0.mElement_SHORT_3 = createVector(var0, Element$DataType.SIGNED_16, 3);
      }

      return var0.mElement_SHORT_3;
   }

   public static Element I16_4(RenderScript var0) {
      if (var0.mElement_SHORT_4 == null) {
         var0.mElement_SHORT_4 = createVector(var0, Element$DataType.SIGNED_16, 4);
      }

      return var0.mElement_SHORT_4;
   }

   public static Element I32(RenderScript var0) {
      if (var0.mElement_I32 == null) {
         var0.mElement_I32 = createUser(var0, Element$DataType.SIGNED_32);
      }

      return var0.mElement_I32;
   }

   public static Element I32_2(RenderScript var0) {
      if (var0.mElement_INT_2 == null) {
         var0.mElement_INT_2 = createVector(var0, Element$DataType.SIGNED_32, 2);
      }

      return var0.mElement_INT_2;
   }

   public static Element I32_3(RenderScript var0) {
      if (var0.mElement_INT_3 == null) {
         var0.mElement_INT_3 = createVector(var0, Element$DataType.SIGNED_32, 3);
      }

      return var0.mElement_INT_3;
   }

   public static Element I32_4(RenderScript var0) {
      if (var0.mElement_INT_4 == null) {
         var0.mElement_INT_4 = createVector(var0, Element$DataType.SIGNED_32, 4);
      }

      return var0.mElement_INT_4;
   }

   public static Element I64(RenderScript var0) {
      if (var0.mElement_I64 == null) {
         var0.mElement_I64 = createUser(var0, Element$DataType.SIGNED_64);
      }

      return var0.mElement_I64;
   }

   public static Element I64_2(RenderScript var0) {
      if (var0.mElement_LONG_2 == null) {
         var0.mElement_LONG_2 = createVector(var0, Element$DataType.SIGNED_64, 2);
      }

      return var0.mElement_LONG_2;
   }

   public static Element I64_3(RenderScript var0) {
      if (var0.mElement_LONG_3 == null) {
         var0.mElement_LONG_3 = createVector(var0, Element$DataType.SIGNED_64, 3);
      }

      return var0.mElement_LONG_3;
   }

   public static Element I64_4(RenderScript var0) {
      if (var0.mElement_LONG_4 == null) {
         var0.mElement_LONG_4 = createVector(var0, Element$DataType.SIGNED_64, 4);
      }

      return var0.mElement_LONG_4;
   }

   public static Element I8(RenderScript var0) {
      if (var0.mElement_I8 == null) {
         var0.mElement_I8 = createUser(var0, Element$DataType.SIGNED_8);
      }

      return var0.mElement_I8;
   }

   public static Element I8_2(RenderScript var0) {
      if (var0.mElement_CHAR_2 == null) {
         var0.mElement_CHAR_2 = createVector(var0, Element$DataType.SIGNED_8, 2);
      }

      return var0.mElement_CHAR_2;
   }

   public static Element I8_3(RenderScript var0) {
      if (var0.mElement_CHAR_3 == null) {
         var0.mElement_CHAR_3 = createVector(var0, Element$DataType.SIGNED_8, 3);
      }

      return var0.mElement_CHAR_3;
   }

   public static Element I8_4(RenderScript var0) {
      if (var0.mElement_CHAR_4 == null) {
         var0.mElement_CHAR_4 = createVector(var0, Element$DataType.SIGNED_8, 4);
      }

      return var0.mElement_CHAR_4;
   }

   public static Element MATRIX_2X2(RenderScript var0) {
      if (var0.mElement_MATRIX_2X2 == null) {
         var0.mElement_MATRIX_2X2 = createUser(var0, Element$DataType.MATRIX_2X2);
      }

      return var0.mElement_MATRIX_2X2;
   }

   public static Element MATRIX_3X3(RenderScript var0) {
      if (var0.mElement_MATRIX_3X3 == null) {
         var0.mElement_MATRIX_3X3 = createUser(var0, Element$DataType.MATRIX_3X3);
      }

      return var0.mElement_MATRIX_3X3;
   }

   public static Element MATRIX_4X4(RenderScript var0) {
      if (var0.mElement_MATRIX_4X4 == null) {
         var0.mElement_MATRIX_4X4 = createUser(var0, Element$DataType.MATRIX_4X4);
      }

      return var0.mElement_MATRIX_4X4;
   }

   public static Element RGBA_4444(RenderScript var0) {
      if (var0.mElement_RGBA_4444 == null) {
         var0.mElement_RGBA_4444 = createPixel(var0, Element$DataType.UNSIGNED_4_4_4_4, Element$DataKind.PIXEL_RGBA);
      }

      return var0.mElement_RGBA_4444;
   }

   public static Element RGBA_5551(RenderScript var0) {
      if (var0.mElement_RGBA_5551 == null) {
         var0.mElement_RGBA_5551 = createPixel(var0, Element$DataType.UNSIGNED_5_5_5_1, Element$DataKind.PIXEL_RGBA);
      }

      return var0.mElement_RGBA_5551;
   }

   public static Element RGBA_8888(RenderScript var0) {
      if (var0.mElement_RGBA_8888 == null) {
         var0.mElement_RGBA_8888 = createPixel(var0, Element$DataType.UNSIGNED_8, Element$DataKind.PIXEL_RGBA);
      }

      return var0.mElement_RGBA_8888;
   }

   public static Element RGB_565(RenderScript var0) {
      if (var0.mElement_RGB_565 == null) {
         var0.mElement_RGB_565 = createPixel(var0, Element$DataType.UNSIGNED_5_6_5, Element$DataKind.PIXEL_RGB);
      }

      return var0.mElement_RGB_565;
   }

   public static Element RGB_888(RenderScript var0) {
      if (var0.mElement_RGB_888 == null) {
         var0.mElement_RGB_888 = createPixel(var0, Element$DataType.UNSIGNED_8, Element$DataKind.PIXEL_RGB);
      }

      return var0.mElement_RGB_888;
   }

   public static Element SAMPLER(RenderScript var0) {
      if (var0.mElement_SAMPLER == null) {
         var0.mElement_SAMPLER = createUser(var0, Element$DataType.RS_SAMPLER);
      }

      return var0.mElement_SAMPLER;
   }

   public static Element SCRIPT(RenderScript var0) {
      if (var0.mElement_SCRIPT == null) {
         var0.mElement_SCRIPT = createUser(var0, Element$DataType.RS_SCRIPT);
      }

      return var0.mElement_SCRIPT;
   }

   public static Element TYPE(RenderScript var0) {
      if (var0.mElement_TYPE == null) {
         var0.mElement_TYPE = createUser(var0, Element$DataType.RS_TYPE);
      }

      return var0.mElement_TYPE;
   }

   public static Element U16(RenderScript var0) {
      if (var0.mElement_U16 == null) {
         var0.mElement_U16 = createUser(var0, Element$DataType.UNSIGNED_16);
      }

      return var0.mElement_U16;
   }

   public static Element U16_2(RenderScript var0) {
      if (var0.mElement_USHORT_2 == null) {
         var0.mElement_USHORT_2 = createVector(var0, Element$DataType.UNSIGNED_16, 2);
      }

      return var0.mElement_USHORT_2;
   }

   public static Element U16_3(RenderScript var0) {
      if (var0.mElement_USHORT_3 == null) {
         var0.mElement_USHORT_3 = createVector(var0, Element$DataType.UNSIGNED_16, 3);
      }

      return var0.mElement_USHORT_3;
   }

   public static Element U16_4(RenderScript var0) {
      if (var0.mElement_USHORT_4 == null) {
         var0.mElement_USHORT_4 = createVector(var0, Element$DataType.UNSIGNED_16, 4);
      }

      return var0.mElement_USHORT_4;
   }

   public static Element U32(RenderScript var0) {
      if (var0.mElement_U32 == null) {
         var0.mElement_U32 = createUser(var0, Element$DataType.UNSIGNED_32);
      }

      return var0.mElement_U32;
   }

   public static Element U32_2(RenderScript var0) {
      if (var0.mElement_UINT_2 == null) {
         var0.mElement_UINT_2 = createVector(var0, Element$DataType.UNSIGNED_32, 2);
      }

      return var0.mElement_UINT_2;
   }

   public static Element U32_3(RenderScript var0) {
      if (var0.mElement_UINT_3 == null) {
         var0.mElement_UINT_3 = createVector(var0, Element$DataType.UNSIGNED_32, 3);
      }

      return var0.mElement_UINT_3;
   }

   public static Element U32_4(RenderScript var0) {
      if (var0.mElement_UINT_4 == null) {
         var0.mElement_UINT_4 = createVector(var0, Element$DataType.UNSIGNED_32, 4);
      }

      return var0.mElement_UINT_4;
   }

   public static Element U64(RenderScript var0) {
      if (var0.mElement_U64 == null) {
         var0.mElement_U64 = createUser(var0, Element$DataType.UNSIGNED_64);
      }

      return var0.mElement_U64;
   }

   public static Element U64_2(RenderScript var0) {
      if (var0.mElement_ULONG_2 == null) {
         var0.mElement_ULONG_2 = createVector(var0, Element$DataType.UNSIGNED_64, 2);
      }

      return var0.mElement_ULONG_2;
   }

   public static Element U64_3(RenderScript var0) {
      if (var0.mElement_ULONG_3 == null) {
         var0.mElement_ULONG_3 = createVector(var0, Element$DataType.UNSIGNED_64, 3);
      }

      return var0.mElement_ULONG_3;
   }

   public static Element U64_4(RenderScript var0) {
      if (var0.mElement_ULONG_4 == null) {
         var0.mElement_ULONG_4 = createVector(var0, Element$DataType.UNSIGNED_64, 4);
      }

      return var0.mElement_ULONG_4;
   }

   public static Element U8(RenderScript var0) {
      if (var0.mElement_U8 == null) {
         var0.mElement_U8 = createUser(var0, Element$DataType.UNSIGNED_8);
      }

      return var0.mElement_U8;
   }

   public static Element U8_2(RenderScript var0) {
      if (var0.mElement_UCHAR_2 == null) {
         var0.mElement_UCHAR_2 = createVector(var0, Element$DataType.UNSIGNED_8, 2);
      }

      return var0.mElement_UCHAR_2;
   }

   public static Element U8_3(RenderScript var0) {
      if (var0.mElement_UCHAR_3 == null) {
         var0.mElement_UCHAR_3 = createVector(var0, Element$DataType.UNSIGNED_8, 3);
      }

      return var0.mElement_UCHAR_3;
   }

   public static Element U8_4(RenderScript var0) {
      if (var0.mElement_UCHAR_4 == null) {
         var0.mElement_UCHAR_4 = createVector(var0, Element$DataType.UNSIGNED_8, 4);
      }

      return var0.mElement_UCHAR_4;
   }

   public static Element createPixel(RenderScript var0, Element$DataType var1, Element$DataKind var2) {
      if (var2 != Element$DataKind.PIXEL_L && var2 != Element$DataKind.PIXEL_A && var2 != Element$DataKind.PIXEL_LA && var2 != Element$DataKind.PIXEL_RGB && var2 != Element$DataKind.PIXEL_RGBA && var2 != Element$DataKind.PIXEL_DEPTH && var2 != Element$DataKind.PIXEL_YUV) {
         throw new RSIllegalArgumentException("Unsupported DataKind");
      } else if (var1 != Element$DataType.UNSIGNED_8 && var1 != Element$DataType.UNSIGNED_16 && var1 != Element$DataType.UNSIGNED_5_6_5 && var1 != Element$DataType.UNSIGNED_4_4_4_4 && var1 != Element$DataType.UNSIGNED_5_5_5_1) {
         throw new RSIllegalArgumentException("Unsupported DataType");
      } else if (var1 == Element$DataType.UNSIGNED_5_6_5 && var2 != Element$DataKind.PIXEL_RGB) {
         throw new RSIllegalArgumentException("Bad kind and type combo");
      } else if (var1 == Element$DataType.UNSIGNED_5_5_5_1 && var2 != Element$DataKind.PIXEL_RGBA) {
         throw new RSIllegalArgumentException("Bad kind and type combo");
      } else if (var1 == Element$DataType.UNSIGNED_4_4_4_4 && var2 != Element$DataKind.PIXEL_RGBA) {
         throw new RSIllegalArgumentException("Bad kind and type combo");
      } else if (var1 == Element$DataType.UNSIGNED_16 && var2 != Element$DataKind.PIXEL_DEPTH) {
         throw new RSIllegalArgumentException("Bad kind and type combo");
      } else {
         byte var3;
         switch(var2.ordinal()) {
         case 3:
            var3 = 2;
            break;
         case 4:
            var3 = 3;
            break;
         case 5:
            var3 = 4;
            break;
         default:
            var3 = 1;
         }

         return new Element(var0.nElementCreate((long)var1.mID, var2.mID, true, var3), var0, var1, var2, true, var3);
      }
   }

   static Element createUser(RenderScript var0, Element$DataType var1) {
      Element$DataKind var2 = Element$DataKind.USER;
      return new Element(var0.nElementCreate((long)var1.mID, var2.mID, false, 1), var0, var1, var2, false, 1);
   }

   public static Element createVector(RenderScript var0, Element$DataType var1, int var2) {
      if (var2 >= 2 && var2 <= 4) {
         Element$DataKind var3 = Element$DataKind.USER;
         Element$DataType var4 = Element$DataType.NONE;
         switch(var1.ordinal()) {
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
            var3 = Element$DataKind.USER;
            return new Element(var0.nElementCreate((long)var1.mID, var3.mID, false, var2), var0, var1, var3, false, var2);
         default:
            throw new RSIllegalArgumentException("Cannot create vector of non-primitive type.");
         }
      } else {
         throw new RSIllegalArgumentException("Vector size out of range 2-4.");
      }
   }

   private void updateVisibleSubElements() {
      if (this.mElements != null) {
         int var4 = this.mElementNames.length;
         int var2 = 0;

         int var1;
         int var3;
         for(var3 = 0; var2 < var4; var3 = var1) {
            var1 = var3;
            if (this.mElementNames[var2].charAt(0) != '#') {
               var1 = var3 + 1;
            }

            ++var2;
         }

         this.mVisibleElementMap = new int[var3];
         var3 = 0;

         for(var1 = 0; var3 < var4; var1 = var2) {
            var2 = var1;
            if (this.mElementNames[var3].charAt(0) != '#') {
               this.mVisibleElementMap[var1] = var3;
               var2 = var1 + 1;
            }

            ++var3;
         }

      }
   }

   public int getBytesSize() {
      return this.mSize;
   }

   public Element$DataKind getDataKind() {
      return this.mKind;
   }

   public Element$DataType getDataType() {
      return this.mType;
   }

   public long getDummyElement(RenderScript var1) {
      return var1.nIncElementCreate((long)this.mType.mID, this.mKind.mID, this.mNormalized, this.mVectorSize);
   }

   public Element getSubElement(int var1) {
      int[] var2 = this.mVisibleElementMap;
      if (var2 != null) {
         if (var1 >= 0 && var1 < var2.length) {
            return this.mElements[var2[var1]];
         } else {
            throw new RSIllegalArgumentException("Illegal sub-element index");
         }
      } else {
         throw new RSIllegalArgumentException("Element contains no sub-elements");
      }
   }

   public int getSubElementArraySize(int var1) {
      int[] var2 = this.mVisibleElementMap;
      if (var2 != null) {
         if (var1 >= 0 && var1 < var2.length) {
            return this.mArraySizes[var2[var1]];
         } else {
            throw new RSIllegalArgumentException("Illegal sub-element index");
         }
      } else {
         throw new RSIllegalArgumentException("Element contains no sub-elements");
      }
   }

   public int getSubElementCount() {
      int[] var1 = this.mVisibleElementMap;
      return var1 == null ? 0 : var1.length;
   }

   public String getSubElementName(int var1) {
      int[] var2 = this.mVisibleElementMap;
      if (var2 != null) {
         if (var1 >= 0 && var1 < var2.length) {
            return this.mElementNames[var2[var1]];
         } else {
            throw new RSIllegalArgumentException("Illegal sub-element index");
         }
      } else {
         throw new RSIllegalArgumentException("Element contains no sub-elements");
      }
   }

   public int getSubElementOffsetBytes(int var1) {
      int[] var2 = this.mVisibleElementMap;
      if (var2 != null) {
         if (var1 >= 0 && var1 < var2.length) {
            return this.mOffsetInBytes[var2[var1]];
         } else {
            throw new RSIllegalArgumentException("Illegal sub-element index");
         }
      } else {
         throw new RSIllegalArgumentException("Element contains no sub-elements");
      }
   }

   public int getVectorSize() {
      return this.mVectorSize;
   }

   public boolean isCompatible(Element var1) {
      if (this.equals(var1)) {
         return true;
      } else {
         return this.mSize == var1.mSize && this.mType != Element$DataType.NONE && this.mType == var1.mType && this.mVectorSize == var1.mVectorSize;
      }
   }

   public boolean isComplex() {
      if (this.mElements != null) {
         int var1 = 0;

         while(true) {
            Element[] var2 = this.mElements;
            if (var1 >= var2.length) {
               break;
            }

            if (var2[var1].mElements != null) {
               return true;
            }

            ++var1;
         }
      }

      return false;
   }
}
