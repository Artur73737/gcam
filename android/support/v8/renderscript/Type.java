package android.support.v8.renderscript;

public class Type extends BaseObj {
   boolean mDimFaces;
   boolean mDimMipmaps;
   int mDimX;
   int mDimY;
   int mDimYuv;
   int mDimZ;
   Element mElement;
   int mElementCount;

   public Type(long var1, RenderScript var3) {
      super(var1, var3);
   }

   public static Type createX(RenderScript var0, Element var1, int var2) {
      if (var2 > 0) {
         Type var3 = new Type(var0.nTypeCreate(var1.getID(var0), var2, 0, 0, false, false, 0), var0);
         var3.mElement = var1;
         var3.mDimX = var2;
         var3.calcElementCount();
         return var3;
      } else {
         throw new RSInvalidStateException("Dimension must be >= 1.");
      }
   }

   public static Type createXY(RenderScript var0, Element var1, int var2, int var3) {
      if (var2 > 0 && var3 > 0) {
         Type var4 = new Type(var0.nTypeCreate(var1.getID(var0), var2, var3, 0, false, false, 0), var0);
         var4.mElement = var1;
         var4.mDimX = var2;
         var4.mDimY = var3;
         var4.calcElementCount();
         return var4;
      } else {
         throw new RSInvalidStateException("Dimension must be >= 1.");
      }
   }

   public static Type createXYZ(RenderScript var0, Element var1, int var2, int var3, int var4) {
      if (var2 > 0 && var3 > 0 && var4 > 0) {
         Type var5 = new Type(var0.nTypeCreate(var1.getID(var0), var2, var3, var4, false, false, 0), var0);
         var5.mElement = var1;
         var5.mDimX = var2;
         var5.mDimY = var3;
         var5.mDimZ = var4;
         var5.calcElementCount();
         return var5;
      } else {
         throw new RSInvalidStateException("Dimension must be >= 1.");
      }
   }

   public void calcElementCount() {
      boolean var9 = this.hasMipmaps();
      int var2 = this.getX();
      int var3 = this.getY();
      int var5 = this.getZ();
      byte var4;
      if (!this.hasFaces()) {
         var4 = 1;
      } else {
         var4 = 6;
      }

      int var1 = var2;
      if (var2 == 0) {
         var1 = 1;
      }

      var2 = var3;
      if (var3 == 0) {
         var2 = 1;
      }

      var3 = var5;
      if (var5 == 0) {
         var3 = 1;
      }

      var5 = var1 * var2 * var3 * var4;

      int var7;
      for(int var8 = var1; var9 && (var8 > 1 || var2 > 1 || var3 > 1); var3 = var7) {
         var1 = var8;
         if (var8 > 1) {
            var1 = var8 >> 1;
         }

         int var6 = var2;
         if (var2 > 1) {
            var6 = var2 >> 1;
         }

         var7 = var3;
         if (var3 > 1) {
            var7 = var3 >> 1;
         }

         var5 += var1 * var6 * var7 * var4;
         var8 = var1;
         var2 = var6;
      }

      this.mElementCount = var5;
   }

   public int getCount() {
      return this.mElementCount;
   }

   public long getDummyType(RenderScript var1, long var2) {
      return var1.nIncTypeCreate(var2, this.mDimX, this.mDimY, this.mDimZ, this.mDimMipmaps, this.mDimFaces, this.mDimYuv);
   }

   public Element getElement() {
      return this.mElement;
   }

   public int getX() {
      return this.mDimX;
   }

   public int getY() {
      return this.mDimY;
   }

   public int getYuv() {
      return this.mDimYuv;
   }

   public int getZ() {
      return this.mDimZ;
   }

   public boolean hasFaces() {
      return this.mDimFaces;
   }

   public boolean hasMipmaps() {
      return this.mDimMipmaps;
   }
}
