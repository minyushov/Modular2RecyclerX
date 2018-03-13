package com.minyushov.android.adapter2recyclerx;

import android.content.Context;
import android.support.annotation.DimenRes;
import android.support.annotation.Px;

import java.util.Objects;

import javax.annotation.Nonnull;

public class OffsetItem implements ModularDiffItem<OffsetItem> {
  @DimenRes
  private final int size;

  public OffsetItem(@DimenRes int size) {
    this.size = size;
  }

  @Px
  int getSize(@Nonnull Context context) {
    return context.getResources().getDimensionPixelOffset(size);
  }


  @Override
  public boolean isItemTheSame(OffsetItem other) {
    return true;
  }

  @Override
  public boolean isContentTheSame(OffsetItem other) {
    return size == other.size;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OffsetItem that = (OffsetItem) o;
    return Objects.equals(size, that.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size);
  }
}