package android.support.v8.renderscript;

import com.google.android.apps.camera.facemetadata.jni.Mc.gREaEL;

public enum Element$DataType {
   private static final Element$DataType[] $VALUES;
   BOOLEAN,
   FLOAT_32,
   FLOAT_64,
   MATRIX_2X2,
   MATRIX_3X3,
   MATRIX_4X4,
   NONE,
   RS_ALLOCATION,
   RS_ELEMENT,
   RS_SAMPLER,
   RS_SCRIPT,
   RS_TYPE,
   SIGNED_16,
   SIGNED_32,
   SIGNED_64,
   SIGNED_8,
   UNSIGNED_16,
   UNSIGNED_32,
   UNSIGNED_4_4_4_4,
   UNSIGNED_5_5_5_1,
   UNSIGNED_5_6_5,
   UNSIGNED_64,
   UNSIGNED_8;

   int mID;
   int mSize;

   static {
      Element$DataType var13 = new Element$DataType(gREaEL.RMG, 0, 0, 0);
      NONE = var13;
      Element$DataType var17 = new Element$DataType("FLOAT_32", 1, 2, 4);
      FLOAT_32 = var17;
      Element$DataType var22 = new Element$DataType("FLOAT_64", 2, 3, 8);
      FLOAT_64 = var22;
      Element$DataType var8 = new Element$DataType("SIGNED_8", 3, 4, 1);
      SIGNED_8 = var8;
      Element$DataType var7 = new Element$DataType("SIGNED_16", 4, 5, 2);
      SIGNED_16 = var7;
      Element$DataType var10 = new Element$DataType("SIGNED_32", 5, 6, 4);
      SIGNED_32 = var10;
      Element$DataType var2 = new Element$DataType("SIGNED_64", 6, 7, 8);
      SIGNED_64 = var2;
      Element$DataType var20 = new Element$DataType("UNSIGNED_8", 7, 8, 1);
      UNSIGNED_8 = var20;
      Element$DataType var12 = new Element$DataType("UNSIGNED_16", 8, 9, 2);
      UNSIGNED_16 = var12;
      Element$DataType var11 = new Element$DataType("UNSIGNED_32", 9, 10, 4);
      UNSIGNED_32 = var11;
      Element$DataType var3 = new Element$DataType("UNSIGNED_64", 10, 11, 8);
      UNSIGNED_64 = var3;
      Element$DataType var0 = new Element$DataType("BOOLEAN", 11, 12, 1);
      BOOLEAN = var0;
      Element$DataType var5 = new Element$DataType("UNSIGNED_5_6_5", 12, 13, 2);
      UNSIGNED_5_6_5 = var5;
      Element$DataType var6 = new Element$DataType("UNSIGNED_5_5_5_1", 13, 14, 2);
      UNSIGNED_5_5_5_1 = var6;
      Element$DataType var18 = new Element$DataType("UNSIGNED_4_4_4_4", 14, 15, 2);
      UNSIGNED_4_4_4_4 = var18;
      Element$DataType var9 = new Element$DataType("MATRIX_4X4", 15, 16, 64);
      MATRIX_4X4 = var9;
      Element$DataType var19 = new Element$DataType("MATRIX_3X3", 16, 17, 36);
      MATRIX_3X3 = var19;
      Element$DataType var15 = new Element$DataType("MATRIX_2X2", 17, 18, 16);
      MATRIX_2X2 = var15;
      Element$DataType var16 = new Element$DataType("RS_ELEMENT", 18, 1000);
      RS_ELEMENT = var16;
      Element$DataType var4 = new Element$DataType("RS_TYPE", 19, 1001);
      RS_TYPE = var4;
      Element$DataType var1 = new Element$DataType("RS_ALLOCATION", 20, 1002);
      RS_ALLOCATION = var1;
      Element$DataType var14 = new Element$DataType("RS_SAMPLER", 21, 1003);
      RS_SAMPLER = var14;
      Element$DataType var21 = new Element$DataType("RS_SCRIPT", 22, 1004);
      RS_SCRIPT = var21;
      $VALUES = new Element$DataType[]{var13, var17, var22, var8, var7, var10, var2, var20, var12, var11, var3, var0, var5, var6, var18, var9, var19, var15, var16, var4, var1, var14, var21};
   }

   private Element$DataType(int var3) {
      this.mID = var3;
      this.mSize = 4;
      if (RenderScript.sPointerSize == 8) {
         this.mSize = 32;
      }

   }

   private Element$DataType(int var3, int var4) {
      this.mID = var3;
      this.mSize = var4;
   }
}
