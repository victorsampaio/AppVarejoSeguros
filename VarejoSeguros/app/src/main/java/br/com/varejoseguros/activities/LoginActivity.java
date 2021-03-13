package br.com.varejoseguros.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.com.varejoseguros.R;
import br.com.varejoseguros.api.controllers.LoginApiController;
import br.com.varejoseguros.api.response.LoginResponse;
import br.com.varejoseguros.api.session.SessionController;
import br.com.varejoseguros.model.Usuario;
import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

import com.bigkoo.svprogresshud.SVProgressHUD;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.editUsuario)
    EditText username;
    @BindView(R.id.editSenha)
    EditText password;
    @BindView(R.id.buttonAcesso)
    Button btnAcesso;
    private SVProgressHUD progressHUD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        if (SessionController.getInstance() == null) {
            SessionController.initialize(this);
        }
        setupViews();
        setListeners();
    }

    private void setupViews() {
        progressHUD = new SVProgressHUD(this);
    }
    private void setListeners() {
        btnAcesso.setOnClickListener(v -> login());
    }


    @SuppressLint("CheckResult")
    private void login() {

        progressHUD.setText("Autenticando");
        progressHUD.show();

        LoginApiController controller = new LoginApiController(this, getString(R.string.api_endpoint_dev),
                getResources());
        Observable<LoginResponse> call = controller.usuarioLogin(username.getText().toString(), password.getText().toString());

        call.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(authResponse -> {
                            Usuario usuario = new Usuario();
                            usuario.setToken(authResponse.getAccesstoken());
                            usuario.setNome(username.getText().toString());
                            SessionController.getInstance().login(usuario);

                            progressHUD.dismiss();
                            carregaMenuPrincipal();
                        },
                        throwable -> {
                            progressHUD.dismiss();
                            Toast.makeText(LoginActivity.this, getString(R.string.msg_invalid_login), Toast.LENGTH_SHORT).show();
                        });
    }

    public void carregaMenuPrincipal() {
        Toast.makeText(this, "Deu certo", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(LoginActivity.this, FormularioActivity.class);
        startActivity(intent);
        finish();
    }
}