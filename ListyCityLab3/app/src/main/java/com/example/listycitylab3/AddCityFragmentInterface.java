package com.example.listycitylab3;

import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface AddCityFragmentInterface {
    @NonNull
    Dialog OnCreateDialog(@Nullable Bundle savedInstanceState);
}
