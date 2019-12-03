package claverianapps.net.ui.puntualidad;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import android.os.Bundle;
import claverianapps.net.R;

public class PuntualidadFragment extends Fragment {

ImageButton siguiente;
int sine =0;
int cone =0;
int sal=0;
int col=0;


    private PuntualidadViewModel PuntualidadViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PuntualidadViewModel =
                ViewModelProviders.of(this).get(PuntualidadViewModel.class);
        View root = inflater.inflate(R.layout.fragment_puntualidad, container, false);
        final TextView textView = root.findViewById(R.id.text_puntualidad);
        PuntualidadViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);

            }
        });
        return root;
    }

    }
