package com.streen.android.dialog.dialogplus;

import android.widget.BaseAdapter;

public interface HolderAdapter extends Holder {

    void setAdapter(BaseAdapter adapter);

    void setOnItemClickListener(OnHolderListener listener);
}
