package claverianapps.net.ui.misgrupos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MisGruposViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MisGruposViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Mis Grupos");
    }

    public LiveData<String> getText() {
        return mText;
    }
}