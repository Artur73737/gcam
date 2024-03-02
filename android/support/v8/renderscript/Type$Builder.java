package android.support.v8.renderscript;

public class Type$Builder {
   boolean mDimFaces;
   boolean mDimMipmaps;
   int mDimX = 1;
   int mDimY;
   int mDimZ;
   Element mElement;
   RenderScript mRS;
   int mYuv;

   public Type$Builder(RenderScript var1, Element var2) {
      var2.checkValid();
      this.mRS = var1;
      this.mElement = var2;
   }

   public Type create() {
      int var2 = this.mDimZ;
      if (var2 > 0) {
         if (this.mDimX <= 0 || this.mDimY <= 0) {
            throw new RSInvalidStateException("Both X and Y dimension required when Z is present.");
         }

         if (this.mDimFaces) {
            throw new RSInvalidStateException("Cube maps not supported with 3D types.");
         }
      }

      int var1 = this.mDimY;
      if (var1 > 0 && this.mDimX <= 0) {
         throw new RSInvalidStateException("X dimension required when Y is present.");
      } else {
         boolean var3 = this.mDimFaces;
         if (var3 && var1 <= 0) {
            throw new RSInvalidStateException("Cube maps require 2D Types.");
         } else if (this.mYuv == 0 || var2 == 0 && !var3 && !this.mDimMipmaps) {
            RenderScript var4 = this.mRS;
            Type var5 = new Type(var4.nTypeCreate(this.mElement.getID(var4), this.mDimX, this.mDimY, this.mDimZ, this.mDimMipmaps, this.mDimFaces, this.mYuv), this.mRS);
            var5.mElement = this.mElement;
            var5.mDimX = this.mDimX;
            var5.mDimY = this.mDimY;
            var5.mDimZ = this.mDimZ;
            var5.mDimMipmaps = this.mDimMipmaps;
            var5.mDimFaces = this.mDimFaces;
            var5.mDimYuv = this.mYuv;
            var5.calcElementCount();
            return var5;
         } else {
            throw new RSInvalidStateException("YUV only supports basic 2D.");
         }
      }
   }

   public Type$Builder setFaces(boolean var1) {
      this.mDimFaces = var1;
      return this;
   }

   public Type$Builder setMipmaps(boolean var1) {
      this.mDimMipmaps = var1;
      return this;
   }

   public Type$Builder setX(int var1) {
      if (var1 > 0) {
         this.mDimX = var1;
         return this;
      } else {
         throw new RSIllegalArgumentException("Values of less than 1 for Dimension X are not valid.");
      }
   }

   public Type$Builder setY(int var1) {
      if (var1 > 0) {
         this.mDimY = var1;
         return this;
      } else {
         throw new RSIllegalArgumentException("Values of less than 1 for Dimension Y are not valid.");
      }
   }

   public Type$Builder setYuvFormat(int var1) {
      switch(var1) {
      case 17:
      case 842094169:
         this.mYuv = var1;
         return this;
      default:
         throw new RSIllegalArgumentException("Only NV21 and YV12 are supported..");
      }
   }

   public Type$Builder setZ(int var1) {
      if (var1 > 0) {
         this.mDimZ = var1;
         return this;
      } else {
         throw new RSIllegalArgumentException("Values of less than 1 for Dimension Z are not valid.");
      }
   }
}
