package claverianapps.net.ui.configuraciones;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ConfiguracionesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ConfiguracionesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Configuraciones");
    }

    public LiveData<String> getText() {
        return mText;
    }
}