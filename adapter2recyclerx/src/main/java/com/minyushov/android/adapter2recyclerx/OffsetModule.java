package com.minyushov.android.adapter2recyclerx;

import android.view.ViewGroup;
import android.widget.Space;

import com.cuttingedge.adapter2recycler.Modules.AdapterModule;

public class OffsetModule extends AdapterModule<ViewHolder<Space>, OffsetItem> {
  @Override
  public ViewHolder<Space> onCreateViewHolder(ViewGroup parent) {
    return new ViewHolder<>(new Space(parent.getContext()));
  }

  @Override
  public void onBindViewHolder(ViewHolder<Space> viewHolder, OffsetItem item) {
    viewHolder.getView().setMinimumHeight(item.getSize(viewHolder.getView().getContext()));
  }
}