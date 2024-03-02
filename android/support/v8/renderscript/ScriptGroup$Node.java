package android.support.v8.renderscript;

import java.util.ArrayList;

class ScriptGroup$Node {
   int dagNumber;
   ArrayList mInputs = new ArrayList();
   ArrayList mKernels = new ArrayList();
   ScriptGroup$Node mNext;
   int mOrder;
   ArrayList mOutputs = new ArrayList();
   Script mScript;
   boolean mSeen;

   public ScriptGroup$Node(Script var1) {
      this.mScript = var1;
   }
}
