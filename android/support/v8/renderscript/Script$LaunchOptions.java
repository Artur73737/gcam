package android.support.v8.renderscript;

public final class Script$LaunchOptions {
   private int strategy;
   private int xend = 0;
   private int xstart = 0;
   private int yend = 0;
   private int ystart = 0;
   private int zend = 0;
   private int zstart = 0;

   // $FF: synthetic method
   static int access$000(Script$LaunchOptions var0) {
      return var0.xstart;
   }

   // $FF: synthetic method
   static int access$100(Script$LaunchOptions var0) {
      return var0.xend;
   }

   // $FF: synthetic method
   static int access$200(Script$LaunchOptions var0) {
      return var0.ystart;
   }

   // $FF: synthetic method
   static int access$300(Script$LaunchOptions var0) {
      return var0.yend;
   }

   // $FF: synthetic method
   static int access$400(Script$LaunchOptions var0) {
      return var0.zstart;
   }

   // $FF: synthetic method
   static int access$500(Script$LaunchOptions var0) {
      return var0.zend;
   }

   public int getXEnd() {
      return this.xend;
   }

   public int getXStart() {
      return this.xstart;
   }

   public int getYEnd() {
      return this.yend;
   }

   public int getYStart() {
      return this.ystart;
   }

   public int getZEnd() {
      return this.zend;
   }

   public int getZStart() {
      return this.zstart;
   }

   public Script$LaunchOptions setX(int var1, int var2) {
      if (var1 >= 0 && var2 > var1) {
         this.xstart = var1;
         this.xend = var2;
         return this;
      } else {
         throw new RSIllegalArgumentException("Invalid dimensions");
      }
   }

   public Script$LaunchOptions setY(int var1, int var2) {
      if (var1 >= 0 && var2 > var1) {
         this.ystart = var1;
         this.yend = var2;
         return this;
      } else {
         throw new RSIllegalArgumentException("Invalid dimensions");
      }
   }

   public Script$LaunchOptions setZ(int var1, int var2) {
      if (var1 >= 0 && var2 > var1) {
         this.zstart = var1;
         this.zend = var2;
         return this;
      } else {
         throw new RSIllegalArgumentException("Invalid dimensions");
      }
   }
}
