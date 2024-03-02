import android.view.WindowInsets.Type;

final class chn {
   static int a(int var0) {
      int var2 = 1;

      int var1;
      int var3;
      for(var3 = 0; var2 <= 256; var3 = var1) {
         var1 = var3;
         if ((var0 & var2) != 0) {
            switch(var2) {
            case 1:
               var1 = var3 | Type.statusBars();
               break;
            case 2:
               var1 = var3 | Type.navigationBars();
               break;
            case 4:
               var1 = var3 | Type.captionBar();
               break;
            case 8:
               var1 = var3 | Type.ime();
               break;
            case 16:
               var1 = var3 | Type.systemGestures();
               break;
            case 32:
               var1 = var3 | Type.mandatorySystemGestures();
               break;
            case 64:
               var1 = var3 | Type.tappableElement();
               break;
            case 128:
               var1 = var3 | Type.displayCutout();
               break;
            default:
               var1 = var3;
            }
         }

         var2 += var2;
      }

      return var3;
   }
}
