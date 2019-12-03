package claverianapps.net.ui.misgrupos;

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

public class MisGruposFragment extends Fragment {

    private MisGruposViewModel MisGruposViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MisGruposViewModel =
                ViewModelProviders.of(this).get(MisGruposViewModel.class);
        View root = inflater.inflate(R.layout.fragment_misgrupos, container, false);
        final TextView textView = root.findViewById(R.id.text_misgrupos);
        MisGruposViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}