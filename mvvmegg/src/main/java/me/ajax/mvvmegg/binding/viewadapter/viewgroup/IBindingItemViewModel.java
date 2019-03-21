package me.ajax.mvvmegg.binding.viewadapter.viewgroup;

/**
 * Created by wanghua on 18-1-9.
 */

import android.databinding.ViewDataBinding;

public interface IBindingItemViewModel<V extends ViewDataBinding> {
    void injecDataBinding(V binding);
}
