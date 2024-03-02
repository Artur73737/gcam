package android.support.v8.renderscript;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class ScriptGroup extends BaseObj {
   private static final int MIN_API_VERSION = 23;
   private static final String TAG = "ScriptGroup";
   private List mClosures;
   ScriptGroup$IO[] mInputs;
   private List mInputs2;
   private String mName;
   private ArrayList mNodes;
   ScriptGroup$IO[] mOutputs;
   private ScriptGroup$Future[] mOutputs2;
   private boolean mUseIncSupp;

   public ScriptGroup(long var1, RenderScript var3) {
      super(var1, var3);
      this.mUseIncSupp = false;
      this.mNodes = new ArrayList();
   }

   public ScriptGroup(RenderScript var1, String var2, List var3, List var4, ScriptGroup$Future[] var5) {
      super(0L, var1);
      int var6 = 0;
      this.mUseIncSupp = false;
      this.mNodes = new ArrayList();
      this.mName = var2;
      this.mClosures = var3;
      this.mInputs2 = var4;
      this.mOutputs2 = var5;
      int var7 = var3.size();

      long[] var8;
      for(var8 = new long[var7]; var6 < var7; ++var6) {
         var8[var6] = ((ScriptGroup$Closure)var3.get(var6)).getID(var1);
      }

      this.setID(var1.nScriptGroup2Create(var2, var1.getApplicationContext().getCacheDir().toString(), var8));
   }

   // $FF: synthetic method
   static ArrayList access$002(ScriptGroup var0, ArrayList var1) {
      var0.mNodes = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean access$102(ScriptGroup var0, boolean var1) {
      var0.mUseIncSupp = var1;
      return var1;
   }

   @Deprecated
   public void execute() {
      if (!this.mUseIncSupp) {
         RenderScript var19 = this.mRS;
         var19.nScriptGroupExecute(this.getID(var19));
      } else {
         int var1;
         int var2;
         int var3;
         for(var1 = 0; var1 < this.mNodes.size(); ++var1) {
            ScriptGroup$Node var7 = (ScriptGroup$Node)this.mNodes.get(var1);

            for(var2 = 0; var2 < var7.mOutputs.size(); ++var2) {
               ScriptGroup$ConnectLine var8 = (ScriptGroup$ConnectLine)var7.mOutputs.get(var2);
               if (var8.mAllocation == null) {
                  Allocation var9 = Allocation.createTyped(this.mRS, var8.mAllocationType, Allocation$MipmapControl.MIPMAP_NONE, 1);
                  var8.mAllocation = var9;

                  for(var3 = var2 + 1; var3 < var7.mOutputs.size(); ++var3) {
                     if (((ScriptGroup$ConnectLine)var7.mOutputs.get(var3)).mFrom == var8.mFrom) {
                        ((ScriptGroup$ConnectLine)var7.mOutputs.get(var3)).mAllocation = var9;
                     }
                  }
               }
            }
         }

         ArrayList var12 = this.mNodes;
         int var4 = var12.size();

         for(var1 = 0; var1 < var4; ++var1) {
            ScriptGroup$Node var20 = (ScriptGroup$Node)var12.get(var1);
            ArrayList var10 = var20.mKernels;
            int var5 = var10.size();

            for(var2 = 0; var2 < var5; ++var2) {
               Script$KernelID var11 = (Script$KernelID)var10.get(var2);
               ArrayList var17 = var20.mInputs;
               int var6 = var17.size();
               var3 = 0;

               Allocation var15;
               for(var15 = null; var3 < var6; ++var3) {
                  ScriptGroup$ConnectLine var13 = (ScriptGroup$ConnectLine)var17.get(var3);
                  if (var13.mToK == var11) {
                     var15 = var13.mAllocation;
                  }
               }

               ScriptGroup$IO[] var21 = this.mInputs;
               var6 = var21.length;
               var3 = 0;

               Allocation var18;
               for(var18 = var15; var3 < var6; ++var3) {
                  ScriptGroup$IO var16 = var21[var3];
                  if (var16.mKID == var11) {
                     var18 = var16.mAllocation;
                  }
               }

               ArrayList var22 = var20.mOutputs;
               var6 = var22.size();
               var3 = 0;

               for(var15 = null; var3 < var6; ++var3) {
                  ScriptGroup$ConnectLine var14 = (ScriptGroup$ConnectLine)var22.get(var3);
                  if (var14.mFrom == var11) {
                     var15 = var14.mAllocation;
                  }
               }

               var21 = this.mOutputs;
               var6 = var21.length;

               for(var3 = 0; var3 < var6; ++var3) {
                  ScriptGroup$IO var23 = var21[var3];
                  if (var23.mKID == var11) {
                     var15 = var23.mAllocation;
                  }
               }

               var11.mScript.forEach(var11.mSlot, (Allocation)var18, var15, (FieldPacker)null);
            }
         }

      }
   }

   public Object[] execute(Object... var1) {
      int var4 = var1.length;
      StringBuilder var8;
      if (var4 < this.mInputs2.size()) {
         var8 = new StringBuilder();
         var8.append(this.toString());
         var8.append(" receives ");
         var8.append(var4);
         var8.append(" inputs, less than expected ");
         var8.append(this.mInputs2.size());
         Log.e("ScriptGroup", var8.toString());
         return null;
      } else {
         int var2 = this.mInputs2.size();
         int var3 = 0;
         if (var4 > var2) {
            this.toString();
            this.mInputs2.size();
            var2 = 0;
         } else {
            var2 = 0;
         }

         Object var5;
         while(var2 < this.mInputs2.size()) {
            var5 = var1[var2];
            if (var5 instanceof ScriptGroup$Future || var5 instanceof ScriptGroup$Input) {
               var8 = new StringBuilder();
               var8.append(this.toString());
               var8.append(": input ");
               var8.append(var2);
               var8.append(" is a future or unbound value");
               Log.e("ScriptGroup", var8.toString());
               return null;
            }

            ((ScriptGroup$Input)this.mInputs2.get(var2)).set(var5);
            ++var2;
         }

         RenderScript var9 = this.mRS;
         var9.nScriptGroup2Execute(this.getID(var9));
         ScriptGroup$Future[] var7 = this.mOutputs2;
         var4 = var7.length;
         Object[] var6 = new Object[var4];

         for(var2 = 0; var3 < var4; ++var2) {
            var5 = var7[var3].getValue();
            Object var10 = var5;
            if (var5 instanceof ScriptGroup$Input) {
               var10 = ((ScriptGroup$Input)var5).get();
            }

            var6[var2] = var10;
            ++var3;
         }

         return var6;
      }
   }

   @Deprecated
   public void setInput(Script$KernelID var1, Allocation var2) {
      int var3 = 0;

      while(true) {
         ScriptGroup$IO[] var4 = this.mInputs;
         if (var3 >= var4.length) {
            RSIllegalArgumentException var5 = new RSIllegalArgumentException("Script not found");
            throw var5;
         }

         ScriptGroup$IO var6 = var4[var3];
         if (var6.mKID == var1) {
            var6.mAllocation = var2;
            if (!this.mUseIncSupp) {
               RenderScript var7 = this.mRS;
               var7.nScriptGroupSetInput(this.getID(var7), var1.getID(this.mRS), this.mRS.safeID(var2));
            }

            return;
         }

         ++var3;
      }
   }

   @Deprecated
   public void setOutput(Script$KernelID var1, Allocation var2) {
      int var3 = 0;

      while(true) {
         ScriptGroup$IO[] var4 = this.mOutputs;
         if (var3 >= var4.length) {
            RSIllegalArgumentException var5 = new RSIllegalArgumentException("Script not found");
            throw var5;
         }

         ScriptGroup$IO var6 = var4[var3];
         if (var6.mKID == var1) {
            var6.mAllocation = var2;
            if (!this.mUseIncSupp) {
               RenderScript var7 = this.mRS;
               var7.nScriptGroupSetOutput(this.getID(var7), var1.getID(this.mRS), this.mRS.safeID(var2));
            }

            return;
         }

         ++var3;
      }
   }
}
