import android.view.ViewGroup;

public final class clc extends clb {
   public clc(bv var1, ViewGroup var2) {
      StringBuilder var3 = new StringBuilder();
      var3.append("Attempting to add fragment ");
      var3.append(var1);
      var3.append(" to container ");
      var3.append(var2);
      var3.append(" which is not a FragmentContainerView");
      super(var1, var3.toString());
   }
}
