package com.asccode.siteswatch.support;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.asccode.siteswatch.dao.LoginDao;
import com.asccode.siteswatch.models.User;
import com.asccode.siteswatch.task.AuthenticationUserTask;
import com.asccode.siteswatch.telas.R;

/**
 * Created with IntelliJ IDEA.
 * User: Trabalho
 * Date: 01/04/13
 * Time: 15:48
 * To change this template use File | Settings | File Templates.
 */
public class Login {

    private Context context;

    public Login(Context context){

        this.context = context;

    }

    public void login( User user ){

        new AuthenticationUserTask(user, this.context).execute();

    }

    public void logout(){

        new LoginDao(this.context).logout();

        Intent intent = new Intent(this.context, com.asccode.siteswatch.telas.Login.class);
        this.context.startActivity(intent);


    }

}
