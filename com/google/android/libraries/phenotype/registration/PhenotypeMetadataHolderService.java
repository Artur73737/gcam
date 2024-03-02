package com.google.android.libraries.phenotype.registration;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public final class PhenotypeMetadataHolderService extends Service {
   private PhenotypeMetadataHolderService() {
   }

   public final IBinder onBind(Intent var1) {
      throw new UnsupportedOperationException();
   }
}
