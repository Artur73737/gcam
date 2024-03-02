package android.support.v8.renderscript;

import android.util.SparseArray;
import java.io.UnsupportedEncodingException;

public class Script extends BaseObj {
   private final SparseArray mFIDs = new SparseArray();
   private final SparseArray mIIDs = new SparseArray();
   private final SparseArray mKIDs = new SparseArray();
   private boolean mUseIncSupp = false;

   public Script(long var1, RenderScript var3) {
      super(var1, var3);
   }

   public void bindAllocation(Allocation var1, int var2) {
      this.mRS.validate();
      if (var1 != null) {
         RenderScript var3 = this.mRS;
         var3.nScriptBindAllocation(this.getID(var3), var1.getID(this.mRS), var2, this.mUseIncSupp);
      } else {
         RenderScript var4 = this.mRS;
         var4.nScriptBindAllocation(this.getID(var4), 0L, var2, this.mUseIncSupp);
      }
   }

   protected Script$FieldID createFieldID(int var1, Element var2) {
      Script$FieldID var5 = (Script$FieldID)this.mFIDs.get(var1);
      if (var5 != null) {
         return var5;
      } else {
         RenderScript var6 = this.mRS;
         long var3 = var6.nScriptFieldIDCreate(this.getID(var6), var1, this.mUseIncSupp);
         if (var3 != 0L) {
            var5 = new Script$FieldID(var3, this.mRS, this, var1);
            this.mFIDs.put(var1, var5);
            return var5;
         } else {
            throw new RSDriverException("Failed to create FieldID");
         }
      }
   }

   protected Script$InvokeID createInvokeID(int var1) {
      Script$InvokeID var4 = (Script$InvokeID)this.mIIDs.get(var1);
      if (var4 != null) {
         return var4;
      } else {
         RenderScript var5 = this.mRS;
         long var2 = var5.nScriptInvokeIDCreate(this.getID(var5), var1);
         if (var2 != 0L) {
            var4 = new Script$InvokeID(var2, this.mRS, this, var1);
            this.mIIDs.put(var1, var4);
            return var4;
         } else {
            throw new RSDriverException("Failed to create KernelID");
         }
      }
   }

   protected Script$KernelID createKernelID(int var1, int var2, Element var3, Element var4) {
      Script$KernelID var7 = (Script$KernelID)this.mKIDs.get(var1);
      if (var7 != null) {
         return var7;
      } else {
         RenderScript var8 = this.mRS;
         long var5 = var8.nScriptKernelIDCreate(this.getID(var8), var1, var2, this.mUseIncSupp);
         if (var5 != 0L) {
            var7 = new Script$KernelID(var5, this.mRS, this, var1, var2);
            this.mKIDs.put(var1, var7);
            return var7;
         } else {
            throw new RSDriverException("Failed to create KernelID");
         }
      }
   }

   protected void forEach(int var1, Allocation var2, Allocation var3, FieldPacker var4) {
      if (var2 == null && var3 == null) {
         throw new RSIllegalArgumentException("At least one of ain or aout is required to be non-null.");
      } else {
         long var5;
         if (var2 != null) {
            var5 = var2.getID(this.mRS);
         } else {
            var5 = 0L;
         }

         long var7;
         if (var3 != null) {
            var7 = var3.getID(this.mRS);
         } else {
            var7 = 0L;
         }

         byte[] var10;
         if (var4 != null) {
            var10 = var4.getData();
         } else {
            var10 = null;
         }

         RenderScript var9;
         if (this.mUseIncSupp) {
            var5 = this.getDummyAlloc(var2);
            var7 = this.getDummyAlloc(var3);
            var9 = this.mRS;
            var9.nScriptForEach(this.getID(var9), var1, var5, var7, var10, this.mUseIncSupp);
         } else {
            var9 = this.mRS;
            var9.nScriptForEach(this.getID(var9), var1, var5, var7, var10, this.mUseIncSupp);
         }
      }
   }

   protected void forEach(int var1, Allocation var2, Allocation var3, FieldPacker var4, Script$LaunchOptions var5) {
      if (var2 == null && var3 == null) {
         throw new RSIllegalArgumentException("At least one of ain or aout is required to be non-null.");
      } else if (var5 == null) {
         this.forEach(var1, var2, var3, var4);
      } else {
         long var6;
         if (var2 != null) {
            var6 = var2.getID(this.mRS);
         } else {
            var6 = 0L;
         }

         long var8;
         if (var3 != null) {
            var8 = var3.getID(this.mRS);
         } else {
            var8 = 0L;
         }

         byte[] var11;
         if (var4 != null) {
            var11 = var4.getData();
         } else {
            var11 = null;
         }

         RenderScript var10;
         if (this.mUseIncSupp) {
            var6 = this.getDummyAlloc(var2);
            var8 = this.getDummyAlloc(var3);
            var10 = this.mRS;
            var10.nScriptForEachClipped(this.getID(var10), var1, var6, var8, var11, Script$LaunchOptions.access$000(var5), Script$LaunchOptions.access$100(var5), Script$LaunchOptions.access$200(var5), Script$LaunchOptions.access$300(var5), Script$LaunchOptions.access$400(var5), Script$LaunchOptions.access$500(var5), this.mUseIncSupp);
         } else {
            var10 = this.mRS;
            var10.nScriptForEachClipped(this.getID(var10), var1, var6, var8, var11, Script$LaunchOptions.access$000(var5), Script$LaunchOptions.access$100(var5), Script$LaunchOptions.access$200(var5), Script$LaunchOptions.access$300(var5), Script$LaunchOptions.access$400(var5), Script$LaunchOptions.access$500(var5), this.mUseIncSupp);
         }
      }
   }

   protected void forEach(int var1, Allocation[] var2, Allocation var3, FieldPacker var4) {
      this.forEach(var1, (Allocation[])var2, var3, var4, (Script$LaunchOptions)null);
   }

   protected void forEach(int var1, Allocation[] var2, Allocation var3, FieldPacker var4, Script$LaunchOptions var5) {
      this.mRS.validate();
      int var6;
      if (var2 != null) {
         for(var6 = 0; var6 < var2.length; ++var6) {
            Allocation var9 = var2[var6];
            this.mRS.validateObject(var9);
         }
      }

      this.mRS.validateObject(var3);
      if (var2 == null && var3 == null) {
         throw new RSIllegalArgumentException("At least one of ain or aout is required to be non-null.");
      } else {
         long[] var10;
         if (var2 != null) {
            long[] var14 = new long[var2.length];

            for(var6 = 0; var6 < var2.length; ++var6) {
               var14[var6] = var2[var6].getID(this.mRS);
            }

            var10 = var14;
         } else {
            var10 = null;
         }

         long var7;
         if (var3 != null) {
            var7 = var3.getID(this.mRS);
         } else {
            var7 = 0L;
         }

         byte[] var11;
         if (var4 != null) {
            var11 = var4.getData();
         } else {
            var11 = null;
         }

         int[] var12;
         if (var5 != null) {
            var12 = new int[]{Script$LaunchOptions.access$000(var5), Script$LaunchOptions.access$100(var5), Script$LaunchOptions.access$200(var5), Script$LaunchOptions.access$300(var5), Script$LaunchOptions.access$400(var5), Script$LaunchOptions.access$500(var5)};
         } else {
            var12 = null;
         }

         RenderScript var13 = this.mRS;
         var13.nScriptForEach(this.getID(var13), var1, var10, var7, var11, var12);
      }
   }

   public long getDummyAlloc(Allocation var1) {
      if (var1 != null) {
         Type var6 = var1.getType();
         long var4 = var6.getElement().getDummyElement(this.mRS);
         var4 = var6.getDummyType(this.mRS, var4);
         int var3 = var6.getX();
         int var2 = var6.getElement().getBytesSize();
         RenderScript var7 = this.mRS;
         var4 = var7.nIncAllocationCreateTyped(var1.getID(var7), var4, var3 * var2);
         var1.setIncAllocID(var4);
         return var4;
      } else {
         return 0L;
      }
   }

   protected void invoke(int var1) {
      RenderScript var2 = this.mRS;
      var2.nScriptInvoke(this.getID(var2), var1, this.mUseIncSupp);
   }

   protected void invoke(int var1, FieldPacker var2) {
      if (var2 != null) {
         RenderScript var3 = this.mRS;
         var3.nScriptInvokeV(this.getID(var3), var1, var2.getData(), this.mUseIncSupp);
      } else {
         RenderScript var4 = this.mRS;
         var4.nScriptInvoke(this.getID(var4), var1, this.mUseIncSupp);
      }
   }

   protected boolean isIncSupp() {
      return this.mUseIncSupp;
   }

   protected void reduce(int var1, Allocation[] var2, Allocation var3, Script$LaunchOptions var4) {
      this.mRS.validate();
      if (var2 != null) {
         int var6 = var2.length;
         if (var6 > 0) {
            if (var3 == null) {
               throw new RSIllegalArgumentException("aout is required to be non-null.");
            }

            int var5;
            for(var5 = 0; var5 < var6; ++var5) {
               Allocation var9 = var2[var5];
               this.mRS.validateObject(var9);
            }

            long[] var13 = new long[var2.length];

            for(var5 = 0; var5 < var2.length; ++var5) {
               var13[var5] = var2[var5].getID(this.mRS);
            }

            long var7 = var3.getID(this.mRS);
            int[] var11;
            if (var4 != null) {
               var11 = new int[]{Script$LaunchOptions.access$000(var4), Script$LaunchOptions.access$100(var4), Script$LaunchOptions.access$200(var4), Script$LaunchOptions.access$300(var4), Script$LaunchOptions.access$400(var4), Script$LaunchOptions.access$500(var4)};
            } else {
               var11 = null;
            }

            RenderScript var12 = this.mRS;
            var12.nScriptReduce(this.getID(var12), var1, var13, var7, var11);
            return;
         }
      }

      RSIllegalArgumentException var10 = new RSIllegalArgumentException("At least one input is required.");
      throw var10;
   }

   protected void setIncSupp(boolean var1) {
      this.mUseIncSupp = var1;
   }

   public void setTimeZone(String var1) {
      this.mRS.validate();

      try {
         RenderScript var2 = this.mRS;
         var2.nScriptSetTimeZone(this.getID(var2), var1.getBytes("UTF-8"), this.mUseIncSupp);
      } catch (UnsupportedEncodingException var3) {
         throw new RuntimeException(var3);
      }
   }

   public void setVar(int var1, double var2) {
      RenderScript var4 = this.mRS;
      var4.nScriptSetVarD(this.getID(var4), var1, var2, this.mUseIncSupp);
   }

   public void setVar(int var1, float var2) {
      RenderScript var3 = this.mRS;
      var3.nScriptSetVarF(this.getID(var3), var1, var2, this.mUseIncSupp);
   }

   public void setVar(int var1, int var2) {
      RenderScript var3 = this.mRS;
      var3.nScriptSetVarI(this.getID(var3), var1, var2, this.mUseIncSupp);
   }

   public void setVar(int var1, long var2) {
      RenderScript var4 = this.mRS;
      var4.nScriptSetVarJ(this.getID(var4), var1, var2, this.mUseIncSupp);
   }

   public void setVar(int var1, BaseObj var2) {
      boolean var7 = this.mUseIncSupp;
      long var3 = 0L;
      long var5;
      RenderScript var8;
      if (var7) {
         var3 = this.getDummyAlloc((Allocation)var2);
         var8 = this.mRS;
         var5 = this.getID(var8);
         if (var2 == null) {
            var3 = 0L;
         }

         var8.nScriptSetVarObj(var5, var1, var3, this.mUseIncSupp);
      } else {
         var8 = this.mRS;
         var5 = this.getID(var8);
         if (var2 != null) {
            var3 = var2.getID(this.mRS);
         }

         var8.nScriptSetVarObj(var5, var1, var3, this.mUseIncSupp);
      }
   }

   public void setVar(int var1, FieldPacker var2) {
      RenderScript var3 = this.mRS;
      var3.nScriptSetVarV(this.getID(var3), var1, var2.getData(), this.mUseIncSupp);
   }

   public void setVar(int var1, FieldPacker var2, Element var3, int[] var4) {
      if (this.mUseIncSupp) {
         long var5 = var3.getDummyElement(this.mRS);
         RenderScript var8 = this.mRS;
         var8.nScriptSetVarVE(this.getID(var8), var1, var2.getData(), var5, var4, this.mUseIncSupp);
      } else {
         RenderScript var7 = this.mRS;
         var7.nScriptSetVarVE(this.getID(var7), var1, var2.getData(), var3.getID(this.mRS), var4, this.mUseIncSupp);
      }
   }

   public void setVar(int var1, boolean var2) {
      RenderScript var3 = this.mRS;
      var3.nScriptSetVarI(this.getID(var3), var1, var2, this.mUseIncSupp);
   }
}
