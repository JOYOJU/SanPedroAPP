package claverianapps.net.ui.seguimientoescolar.se;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SeguimientoEscolarViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SeguimientoEscolarViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Seguimiento escolar");
    }

    public LiveData<String> getText() {
        return mText;
    }
}