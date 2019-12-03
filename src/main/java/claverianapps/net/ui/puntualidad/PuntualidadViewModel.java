package claverianapps.net.ui.puntualidad;

import android.widget.TextView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PuntualidadViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PuntualidadViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Puntualidad");
    }

    public LiveData<String> getText() {
        return mText;
    }
}