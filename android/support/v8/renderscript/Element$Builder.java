package android.support.v8.renderscript;

public class Element$Builder {
   int[] mArraySizes;
   int mCount;
   String[] mElementNames;
   Element[] mElements;
   RenderScript mRS;
   int mSkipPadding;

   public Element$Builder(RenderScript var1) {
      this.mRS = var1;
      this.mCount = 0;
      this.mElements = new Element[8];
      this.mElementNames = new String[8];
      this.mArraySizes = new int[8];
   }

   public Element$Builder add(Element var1, String var2) {
      return this.add(var1, var2, 1);
   }

   public Element$Builder add(Element var1, String var2, int var3) {
      if (var3 > 0) {
         if (this.mSkipPadding != 0 && var2.startsWith("#padding_")) {
            this.mSkipPadding = 0;
            return this;
         } else {
            if (var1.mVectorSize == 3) {
               this.mSkipPadding = 1;
            } else {
               this.mSkipPadding = 0;
            }

            int var4 = this.mCount;
            Element[] var8 = this.mElements;
            Element[] var6;
            if (var4 == var8.length) {
               int var5 = var4 + 8;
               var6 = new Element[var5];
               String[] var7 = new String[var5];
               int[] var9 = new int[var5];
               System.arraycopy(var8, 0, var6, 0, var4);
               System.arraycopy(this.mElementNames, 0, var7, 0, this.mCount);
               System.arraycopy(this.mArraySizes, 0, var9, 0, this.mCount);
               this.mElements = var6;
               this.mElementNames = var7;
               this.mArraySizes = var9;
            }

            var6 = this.mElements;
            var4 = this.mCount;
            var6[var4] = var1;
            this.mElementNames[var4] = var2;
            this.mArraySizes[var4] = var3;
            this.mCount = var4 + 1;
            return this;
         }
      } else {
         throw new RSIllegalArgumentException("Array size cannot be less than 1.");
      }
   }

   public Element create() {
      this.mRS.validate();
      int var2 = this.mCount;
      Element[] var5 = new Element[var2];
      String[] var3 = new String[var2];
      int[] var4 = new int[var2];
      Element[] var6 = this.mElements;
      int var1 = 0;
      System.arraycopy(var6, 0, var5, 0, var2);
      System.arraycopy(this.mElementNames, 0, var3, 0, this.mCount);
      System.arraycopy(this.mArraySizes, 0, var4, 0, this.mCount);

      long[] var7;
      for(var7 = new long[var2]; var1 < var2; ++var1) {
         var7[var1] = var5[var1].getID(this.mRS);
      }

      return new Element(this.mRS.nElementCreate2(var7, var3, var4), this.mRS, var5, var3, var4);
   }
}
