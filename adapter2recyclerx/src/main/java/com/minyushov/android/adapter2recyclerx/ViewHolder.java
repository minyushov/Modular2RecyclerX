package com.minyushov.android.adapter2recyclerx;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import javax.annotation.Nonnull;

public class ViewHolder<T extends View> extends RecyclerView.ViewHolder {
  @Nonnull
  private final T view;

  public ViewHolder(@Nonnull T view) {
    super(view);
    this.view = view;
  }

  @Nonnull
  public T getView() {
    return view;
  }
}