package claverianapps.net.ui.notas;

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

public class NotasFragment extends Fragment {

    private NotasViewModel NotasViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NotasViewModel =
                ViewModelProviders.of(this).get(NotasViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notas, container, false);
        final TextView textView = root.findViewById(R.id.text_notas);
        NotasViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}