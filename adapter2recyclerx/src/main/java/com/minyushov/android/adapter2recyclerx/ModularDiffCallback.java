package com.minyushov.android.adapter2recyclerx;

import android.support.v7.util.DiffUtil;

import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public final class ModularDiffCallback extends DiffUtil.Callback {
  @Nonnull
  private final List<? extends ModularDiffItem> oldList;
  @Nonnull
  private final List<? extends ModularDiffItem> newList;

  public ModularDiffCallback(@Nonnull List<? extends ModularDiffItem> oldList,
                             @Nonnull List<? extends ModularDiffItem> newList) {
    this.oldList = oldList;
    this.newList = newList;
  }

  @Override
  public int getOldListSize() {
    return oldList.size();
  }

  @Override
  public int getNewListSize() {
    return newList.size();
  }

  @Override
  @SuppressWarnings("unchecked")
  public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
    ModularDiffItem oldItem = oldList.get(oldItemPosition);
    ModularDiffItem newItem = newList.get(newItemPosition);
    return oldItem.getClass() == newItem.getClass() && oldItem.isItemTheSame(newItem);
  }

  @Override
  @SuppressWarnings("unchecked")
  public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
    ModularDiffItem oldItem = oldList.get(oldItemPosition);
    ModularDiffItem newItem = newList.get(newItemPosition);
    return oldItem.isContentTheSame(newItem);
  }

  @Override
  @Nullable
  @SuppressWarnings("unchecked")
  public Object getChangePayload(int oldItemPosition, int newItemPosition) {
    ModularDiffItem oldItem = oldList.get(oldItemPosition);
    ModularDiffItem newItem = newList.get(newItemPosition);
    return oldItem.getChangePayload(newItem);
  }
}