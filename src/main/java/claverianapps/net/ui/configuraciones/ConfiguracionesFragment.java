package claverianapps.net.ui.configuraciones;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import claverianapps.net.R;

public class ConfiguracionesFragment extends Fragment {

    private ConfiguracionesViewModel ConfiguracionesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ConfiguracionesViewModel =
                ViewModelProviders.of(this).get(ConfiguracionesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_configuraciones, container, false);
        final TextView textView = root.findViewById(R.id.text_configuraciones);
        ConfiguracionesViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}