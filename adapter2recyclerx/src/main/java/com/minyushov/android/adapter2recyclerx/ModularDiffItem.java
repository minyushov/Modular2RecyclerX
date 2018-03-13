package com.minyushov.android.adapter2recyclerx;

import com.cuttingedge.adapter2recycler.ModularItem;

import javax.annotation.Nullable;

public interface ModularDiffItem<T extends ModularDiffItem<T>> extends ModularItem {
  boolean isItemTheSame(T other);

  boolean isContentTheSame(T other);

  @Nullable
  default Object getChangePayload(T other) {
    return null;
  }

  @Override
  default boolean isHeader() {
    return false;
  }
}