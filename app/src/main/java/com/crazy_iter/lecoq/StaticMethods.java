package com.crazy_iter.lecoq;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class StaticMethods {

    public static Animation logoAnimaton(Context context) {
        return AnimationUtils.loadAnimation(context, R.anim.scale_down);
    }

}
