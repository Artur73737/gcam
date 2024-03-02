import androidx.window.extensions.area.ExtensionWindowAreaPresentation;
import androidx.window.extensions.area.WindowAreaComponent;

public final class cxg implements cxw {
   private final WindowAreaComponent a;
   private final ExtensionWindowAreaPresentation b;

   public cxg(WindowAreaComponent var1, ExtensionWindowAreaPresentation var2) {
      this.a = var1;
      this.b = var2;
      var2.getPresentationContext().getClass();
   }

   public final void a() {
      this.a.endRearDisplayPresentationSession();
   }
}
