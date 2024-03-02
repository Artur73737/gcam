package android.support.v8.renderscript;

import java.util.ArrayList;
import java.util.Collections;

@Deprecated
public final class ScriptGroup$Builder {
   private int mKernelCount;
   private ArrayList mLines = new ArrayList();
   private ArrayList mNodes = new ArrayList();
   private RenderScript mRS;
   private boolean mUseIncSupp = false;

   public ScriptGroup$Builder(RenderScript var1) {
      this.mRS = var1;
   }

   private boolean calcOrder() {
      ArrayList var9 = this.mNodes;
      int var3 = var9.size();
      int var1 = 0;

      boolean var5;
      boolean var6;
      for(var5 = true; var1 < var3; var5 = var6) {
         ScriptGroup$Node var8 = (ScriptGroup$Node)var9.get(var1);
         var6 = var5;
         if (var8.mInputs.size() == 0) {
            ArrayList var7 = this.mNodes;
            int var4 = var7.size();

            for(int var2 = 0; var2 < var4; ++var2) {
               ((ScriptGroup$Node)var7.get(var2)).mSeen = false;
            }

            var6 = var5 & this.calcOrderRecurse(var8, 1);
         }

         ++var1;
      }

      Collections.sort(this.mNodes, new ScriptGroup$Builder$1(this));
      return var5;
   }

   private boolean calcOrderRecurse(ScriptGroup$Node var1, int var2) {
      var1.mSeen = true;
      if (var1.mOrder < var2) {
         var1.mOrder = var2;
      }

      ArrayList var6 = var1.mOutputs;
      int var3 = var6.size();
      var2 = 0;

      boolean var4;
      for(var4 = true; var2 < var3; ++var2) {
         ScriptGroup$ConnectLine var5 = (ScriptGroup$ConnectLine)var6.get(var2);
         Script$FieldID var7 = var5.mToF;
         ScriptGroup$Node var8;
         if (var7 != null) {
            var8 = this.findNode(var7.mScript);
         } else {
            var8 = this.findNode(var5.mToK.mScript);
         }

         if (var8.mSeen) {
            return false;
         }

         var4 &= this.calcOrderRecurse(var8, var1.mOrder + 1);
      }

      return var4;
   }

   private ScriptGroup$Node findNode(Script$KernelID var1) {
      for(int var2 = 0; var2 < this.mNodes.size(); ++var2) {
         ScriptGroup$Node var4 = (ScriptGroup$Node)this.mNodes.get(var2);

         for(int var3 = 0; var3 < var4.mKernels.size(); ++var3) {
            if (var1 == var4.mKernels.get(var3)) {
               return var4;
            }
         }
      }

      return null;
   }

   private ScriptGroup$Node findNode(Script var1) {
      for(int var2 = 0; var2 < this.mNodes.size(); ++var2) {
         if (var1 == ((ScriptGroup$Node)this.mNodes.get(var2)).mScript) {
            return (ScriptGroup$Node)this.mNodes.get(var2);
         }
      }

      return null;
   }

   private void mergeDAGs(int var1, int var2) {
      for(int var3 = 0; var3 < this.mNodes.size(); ++var3) {
         if (((ScriptGroup$Node)this.mNodes.get(var3)).dagNumber == var2) {
            ((ScriptGroup$Node)this.mNodes.get(var3)).dagNumber = var1;
         }
      }

   }

   private void validateCycle(ScriptGroup$Node var1, ScriptGroup$Node var2) {
      for(int var3 = 0; var3 < var1.mOutputs.size(); ++var3) {
         ScriptGroup$ConnectLine var4 = (ScriptGroup$ConnectLine)var1.mOutputs.get(var3);
         Script$KernelID var5 = var4.mToK;
         if (var5 != null) {
            ScriptGroup$Node var8 = this.findNode(var5.mScript);
            if (var8.equals(var2)) {
               throw new RSInvalidStateException("Loops in group not allowed.");
            }

            this.validateCycle(var8, var2);
         }

         Script$FieldID var6 = var4.mToF;
         if (var6 != null) {
            ScriptGroup$Node var7 = this.findNode(var6.mScript);
            if (var7.equals(var2)) {
               throw new RSInvalidStateException("Loops in group not allowed.");
            }

            this.validateCycle(var7, var2);
         }
      }

   }

   private void validateDAG() {
      byte var2 = 0;

      int var1;
      for(var1 = 0; var1 < this.mNodes.size(); ++var1) {
         ScriptGroup$Node var4 = (ScriptGroup$Node)this.mNodes.get(var1);
         if (var4.mInputs.size() == 0) {
            if (var4.mOutputs.size() == 0 && this.mNodes.size() > 1) {
               throw new RSInvalidStateException("Groups cannot contain unconnected scripts");
            }

            this.validateDAGRecurse(var4, var1 + 1);
         }
      }

      int var3 = ((ScriptGroup$Node)this.mNodes.get(0)).dagNumber;

      for(var1 = var2; var1 < this.mNodes.size(); ++var1) {
         if (((ScriptGroup$Node)this.mNodes.get(var1)).dagNumber != var3) {
            throw new RSInvalidStateException("Multiple DAGs in group not allowed.");
         }
      }

   }

   private void validateDAGRecurse(ScriptGroup$Node var1, int var2) {
      int var3 = var1.dagNumber;
      if (var3 != 0 && var3 != var2) {
         this.mergeDAGs(var3, var2);
      } else {
         var1.dagNumber = var2;

         for(var3 = 0; var3 < var1.mOutputs.size(); ++var3) {
            ScriptGroup$ConnectLine var5 = (ScriptGroup$ConnectLine)var1.mOutputs.get(var3);
            Script$KernelID var4 = var5.mToK;
            if (var4 != null) {
               this.validateDAGRecurse(this.findNode(var4.mScript), var2);
            }

            Script$FieldID var6 = var5.mToF;
            if (var6 != null) {
               this.validateDAGRecurse(this.findNode(var6.mScript), var2);
            }
         }

      }
   }

   public ScriptGroup$Builder addConnection(Type var1, Script$KernelID var2, Script$FieldID var3) {
      ScriptGroup$Node var4 = this.findNode(var2);
      if (var4 != null) {
         ScriptGroup$Node var6 = this.findNode(var3.mScript);
         if (var6 != null) {
            ScriptGroup$ConnectLine var5 = new ScriptGroup$ConnectLine(var1, var2, var3);
            this.mLines.add(new ScriptGroup$ConnectLine(var1, var2, var3));
            var4.mOutputs.add(var5);
            var6.mInputs.add(var5);
            this.validateCycle(var4, var4);
            return this;
         } else {
            throw new RSInvalidStateException("To script not found.");
         }
      } else {
         throw new RSInvalidStateException("From script not found.");
      }
   }

   public ScriptGroup$Builder addConnection(Type var1, Script$KernelID var2, Script$KernelID var3) {
      ScriptGroup$Node var4 = this.findNode(var2);
      if (var4 != null) {
         ScriptGroup$Node var6 = this.findNode(var3);
         if (var6 != null) {
            ScriptGroup$ConnectLine var5 = new ScriptGroup$ConnectLine(var1, var2, var3);
            this.mLines.add(new ScriptGroup$ConnectLine(var1, var2, var3));
            var4.mOutputs.add(var5);
            var6.mInputs.add(var5);
            this.validateCycle(var4, var4);
            return this;
         } else {
            throw new RSInvalidStateException("To script not found.");
         }
      } else {
         throw new RSInvalidStateException("From script not found.");
      }
   }

   public ScriptGroup$Builder addKernel(Script$KernelID var1) {
      if (this.mLines.size() == 0) {
         if (var1.mScript.isIncSupp()) {
            this.mUseIncSupp = true;
         }

         if (this.findNode(var1) != null) {
            return this;
         } else {
            ++this.mKernelCount;
            ScriptGroup$Node var3 = this.findNode(var1.mScript);
            ScriptGroup$Node var2 = var3;
            if (var3 == null) {
               var2 = new ScriptGroup$Node(var1.mScript);
               this.mNodes.add(var2);
            }

            var2.mKernels.add(var1);
            return this;
         }
      } else {
         throw new RSInvalidStateException("Kernels may not be added once connections exist.");
      }
   }

   public ScriptGroup create() {
      if (this.mNodes.size() == 0) {
         RSInvalidStateException var21 = new RSInvalidStateException("Empty script groups are not allowed");
         throw var21;
      } else {
         byte var8 = 0;

         int var1;
         for(var1 = 0; var1 < this.mNodes.size(); ++var1) {
            ((ScriptGroup$Node)this.mNodes.get(var1)).dagNumber = 0;
         }

         this.validateDAG();
         ArrayList var12 = new ArrayList();
         ArrayList var13 = new ArrayList();
         long[] var14 = new long[this.mKernelCount];
         var1 = 0;

         int var2;
         for(var2 = 0; var1 < this.mNodes.size(); ++var1) {
            ScriptGroup$Node var16 = (ScriptGroup$Node)this.mNodes.get(var1);

            for(int var3 = 0; var3 < var16.mKernels.size(); ++var2) {
               Script$KernelID var15 = (Script$KernelID)var16.mKernels.get(var3);
               var14[var2] = var15.getID(this.mRS);
               int var5 = 0;

               boolean var4;
               boolean var6;
               for(var4 = false; var5 < var16.mInputs.size(); ++var5) {
                  if (((ScriptGroup$ConnectLine)var16.mInputs.get(var5)).mToK == var15) {
                     var6 = false;
                  } else {
                     var6 = true;
                  }

                  var4 |= var6 ^ true;
               }

               var5 = 0;

               for(var6 = false; var5 < var16.mOutputs.size(); ++var5) {
                  boolean var7;
                  if (((ScriptGroup$ConnectLine)var16.mOutputs.get(var5)).mFrom == var15) {
                     var7 = false;
                  } else {
                     var7 = true;
                  }

                  var6 |= var7 ^ true;
               }

               if (!var4) {
                  var12.add(new ScriptGroup$IO(var15));
               }

               if (!var6) {
                  var13.add(new ScriptGroup$IO(var15));
               }

               ++var3;
            }
         }

         if (var2 != this.mKernelCount) {
            throw new RSRuntimeException("Count mismatch, should not happen.");
         } else {
            boolean var11 = this.mUseIncSupp;
            long var9 = 0L;
            if (!var11) {
               long[] var23 = new long[this.mLines.size()];
               long[] var19 = new long[this.mLines.size()];
               long[] var24 = new long[this.mLines.size()];
               long[] var17 = new long[this.mLines.size()];

               for(var1 = 0; var1 < this.mLines.size(); ++var1) {
                  ScriptGroup$ConnectLine var18 = (ScriptGroup$ConnectLine)this.mLines.get(var1);
                  var23[var1] = var18.mFrom.getID(this.mRS);
                  Script$KernelID var20 = var18.mToK;
                  if (var20 != null) {
                     var19[var1] = var20.getID(this.mRS);
                  }

                  Script$FieldID var25 = var18.mToF;
                  if (var25 != null) {
                     var24[var1] = var25.getID(this.mRS);
                  }

                  var17[var1] = var18.mAllocationType.getID(this.mRS);
               }

               var9 = this.mRS.nScriptGroupCreate(var14, var23, var19, var24, var17);
               if (var9 == 0L) {
                  throw new RSRuntimeException("Object creation error, should not happen.");
               }
            } else {
               this.calcOrder();
            }

            ScriptGroup var22 = new ScriptGroup(var9, this.mRS);
            var22.mOutputs = new ScriptGroup$IO[var13.size()];

            for(var1 = 0; var1 < var13.size(); ++var1) {
               var22.mOutputs[var1] = (ScriptGroup$IO)var13.get(var1);
            }

            var22.mInputs = new ScriptGroup$IO[var12.size()];

            for(var1 = var8; var1 < var12.size(); ++var1) {
               var22.mInputs[var1] = (ScriptGroup$IO)var12.get(var1);
            }

            ScriptGroup.access$002(var22, this.mNodes);
            ScriptGroup.access$102(var22, this.mUseIncSupp);
            return var22;
         }
      }
   }
}
