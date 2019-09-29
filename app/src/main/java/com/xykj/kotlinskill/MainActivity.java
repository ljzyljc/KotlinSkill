package com.xykj.kotlinskill;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.io.File;
import java.nio.charset.Charset;

import kotlin.io.FilesKt;
import com.xykj.kotlinskill.TestFunKt.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Java代码调用Kotlin
        //ResourceUtilsKt.echo("hello");

        Test.INSTANCE.sayMessage("wtf");

        //加了JVMStatic就可以这么调用
        Test.sayMessage("wtf");


        File file = new File("app/app.iml");

        String content = FilesKt.readText(file, Charset.defaultCharset());

    }
}
